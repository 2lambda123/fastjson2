package com.alibaba.fastjson2.date;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import org.junit.jupiter.api.Test;

import java.sql.Time;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqlTimeTest {
    @Test
    public void test() {
        String str = "{\"birthday\":\"152605\"}";
        Student student = JSON.parseObject(str, Student.class);
        assertEquals(str, JSON.toJSONString(student));
    }

    public static class Student {
        @JSONField(format = "HHmmss")
        public java.sql.Time birthday;
    }

    @Test
    public void test1() {
        String str = "{\"birthday\":\"2022-05-03T15:26:05\"}";
        Student1 student = JSON.parseObject(str, Student1.class);
        String str2 = JSON.toJSONString(student);
        Student1 student1 = JSON.parseObject(str2, Student1.class);
        assertEquals(student.birthday.getTime(), student1.birthday.getTime());
    }

    @Test
    public void test1_null() {
        String str = "{\"birthday\":null}";
        Student1 student = JSON.parseObject(str, Student1.class);
        assertEquals(str, JSON.toJSONString(student, JSONWriter.Feature.WriteNulls));
    }

    public static class Student1 {
        @JSONField(format = "iso8601")
        public java.sql.Time birthday;
    }

    @Test
    public void test2() {
        String str = "{\"birthday\":\"15:26:05\"}";
        Student2 student = JSON.parseObject(str, Student2.class);
        assertEquals("{\"birthday\":\"15:26:05\"}", JSON.toJSONString(student, "yyyy-MM-dd HH:mm:ss"));
    }

    public static class Student2 {
        public java.sql.Time birthday;
    }

    @Test
    public void test3() {
        long millis = System.currentTimeMillis();
        String str = "{\"birthday\":" + millis + "}";
        Student3 student = JSON.parseObject(str, Student3.class);
        String str2 = JSON.toJSONString(student);
        Student3 student1 = JSON.parseObject(str2, Student3.class);
        assertEquals(student.birthday.getTime(), student1.birthday.getTime());
    }

    public static class Student3 {
        @JSONField(format = "millis")
        public java.sql.Time birthday;
    }

    @Test
    public void test4() {
        long seconds = System.currentTimeMillis() / 1000;
        String str = "{\"birthday\":" + seconds + "}";
        Student4 student = JSON.parseObject(str, Student4.class);
        String str2 = JSON.toJSONString(student);
        Student4 student1 = JSON.parseObject(str2, Student4.class);
        assertEquals(student.birthday.getTime(),
                student1.birthday.getTime()
        );
    }

    public static class Student4 {
        @JSONField(format = "unixtime")
        public java.sql.Time birthday;
    }

    @Test
    public void test5() throws Exception {
        Time time = JSON.parseObject("\"12:12:43Z\"", Time.class);
        String str = JSON.toJSONString(time);
        Time time1 = JSON.parseObject(str, Time.class);
        assertEquals(time, time1);
    }

    @Test
    public void test6() throws Exception {
        Time time = JSON.parseObject("\"12:12:43\"", Time.class);
        String str = JSON.toJSONString(time);
        Time time1 = JSON.parseObject(str, Time.class);
        assertEquals(time, time1);
    }
}

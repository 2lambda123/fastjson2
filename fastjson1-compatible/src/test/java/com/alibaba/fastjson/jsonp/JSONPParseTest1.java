package com.alibaba.fastjson.jsonp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by wenshao on 21/02/2017.
 */
public class JSONPParseTest1 {
    @Test
    public void test_f() throws Exception {
        String text = "callback /**/ ({'id':1, 'name':'idonans'} ); ";

        JSONPObject jsonpObject = JSON.parseObject(text, JSONPObject.class);
        assertEquals("callback", jsonpObject.getFunction());

        assertEquals(1, jsonpObject.getParameters().size());
        JSONObject param = (JSONObject) jsonpObject.getParameters().get(0);
        assertEquals(1, param.get("id"));
        assertEquals("idonans", param.get("name"));

        String json = JSON.toJSONString(jsonpObject, SerializerFeature.MapSortField);
        assertEquals("callback({\"id\":1,\"name\":\"idonans\"})", json);
    }
}

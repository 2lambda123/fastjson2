package com.alibaba.fastjson2.internal.asm;

/**
 * Created by wenshao on 05/08/2017.
 */
public class MethodCollector {
    private final int paramCount;

    private final int ignoreCount;

    private int currentParameter;

    private final StringBuilder result;

    protected boolean debugInfoPresent;

    protected MethodCollector(int ignoreCount, int paramCount) {
        this.ignoreCount = ignoreCount;
        this.paramCount = paramCount;
        this.result = new StringBuilder();
        this.currentParameter = 0;
        // if there are 0 parameters, there is no need for debug info
        this.debugInfoPresent = paramCount == 0;
    }

    protected void visitLocalVariable(String name, int index) {
        if (index >= ignoreCount && index < ignoreCount + paramCount) {
            if (!("arg" + currentParameter).equals(name)) {
                debugInfoPresent = true;
            }
            result.append(',');
            result.append(name);
            currentParameter++;
        }
    }

    protected String getResult() {
        return result.length() != 0 ? result.substring(1) : "";
    }
}

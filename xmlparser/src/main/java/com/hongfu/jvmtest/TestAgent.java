package com.hongfu.jvmtest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.instrument.Instrumentation;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class TestAgent {
    public static void main(String[] args) throws IOException {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();
        String name = bean.getName();
        int index = name.indexOf('@');
        String pid = name.substring(0,index);
        System.out.println(pid);
    }
}

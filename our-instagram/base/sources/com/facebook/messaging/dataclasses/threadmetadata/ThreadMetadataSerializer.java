package com.facebook.messaging.dataclasses.threadmetadata;

import X.AbstractC09800fd;
import X.C09170dP;

/* loaded from: classes10.dex */
public class ThreadMetadataSerializer {
    public static native ThreadMetadataImpl fromJSONString(String str);

    public static native void init();

    public static native String toJSONString(ThreadMetadataImpl threadMetadataImpl);

    static {
        AbstractC09800fd.A01("ThreadMetadataSerializer.loadLibrary", -943557503);
        C09170dP.A0C("pandoblobserializerjni");
        C09170dP.A0C("pando-jni");
        AbstractC09800fd.A00(-1181566678);
    }

    public static ThreadMetadata fromString(String str) {
        ThreadMetadataImpl fromJSONString;
        int i;
        AbstractC09800fd.A01("ThreadMetadataSerializer.fromString", -2094093226);
        if (str == null) {
            fromJSONString = null;
            i = 435925200;
        } else {
            try {
                fromJSONString = fromJSONString(str);
                i = -911614009;
            } catch (Throwable th) {
                AbstractC09800fd.A00(320813458);
                throw th;
            }
        }
        AbstractC09800fd.A00(i);
        return fromJSONString;
    }

    public static String toString(ThreadMetadata threadMetadata) {
        String jSONString;
        int i;
        AbstractC09800fd.A01("ThreadMetadataSerializer.toString", 1908040832);
        if (threadMetadata == null) {
            jSONString = null;
            i = 655447919;
        } else {
            try {
                jSONString = toJSONString((ThreadMetadataImpl) threadMetadata);
                i = -1194892495;
            } catch (Throwable th) {
                AbstractC09800fd.A00(-2013540444);
                throw th;
            }
        }
        AbstractC09800fd.A00(i);
        return jSONString;
    }
}

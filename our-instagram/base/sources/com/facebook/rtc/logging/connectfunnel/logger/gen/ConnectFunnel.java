package com.facebook.rtc.logging.connectfunnel.logger.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.Date;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class ConnectFunnel {

    /* loaded from: classes4.dex */
    public final class CProxy extends ConnectFunnel {
        public static native boolean annotate(String str, int i, McfReference mcfReference);

        public static native boolean annotateMultiple(String str, Map map);

        public static native boolean annotateMultipleTyped(String str, Map map, Map map2, Map map3);

        public static native void associateCallIds(String str, String str2, boolean z);

        public static native boolean cancel(String str);

        public static native ConnectFunnel createFromMcfType(McfReference mcfReference);

        public static native boolean fail(String str, String str2, String str3);

        public static native boolean markPoint(String str, int i, Long l);

        public static native long nativeGetMcfTypeId();

        public static native void removeCallIdAssociation(String str, String str2);

        public static native boolean start(McfReference mcfReference, String str, int i, Long l, Map map);

        public static native boolean startWithProxy(ConnectFunnelProxy connectFunnelProxy, String str, int i, Long l, Map map);

        public static native boolean succeed(String str, McfReference mcfReference);

        public static native void uploadLogsAtColdStartIfNecessary(String str, Date date, String str2, McfReference mcfReference, McfReference mcfReference2);
    }
}

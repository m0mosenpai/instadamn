package com.messagingclient.componentslogger;

import X.C09170dP;
import java.util.Map;

/* loaded from: classes.dex */
public class ComponentLoggerPluginMCFBridgejniDispatcher {
    public static native Map MCIComponentAttributionLoggerCreateAggregatedDataNative(int i, int i2);

    public static native void MCIComponentAttributionLoggerEndNative(int i, int i2);

    public static native void MCIComponentAttributionLoggerStartNative(int i, int i2, String str);

    static {
        C09170dP.A0C("ComponentLoggerPluginMCFBridgejni");
    }
}

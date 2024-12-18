package com.facebook.msys.mcp.applicationinfoplugin;

import X.C0JA;

/* loaded from: classes3.dex */
public abstract class Sessionless {
    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateAppVersion();

    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateDeviceId();

    public abstract String MsysApplicationInfoImpl_MsysApplicationInfoCreateProcessName();

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateAppVersionJNI() {
        return "353.2.0.49.90";
    }

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateDeviceIdJNI() {
        return null;
    }

    private String MsysApplicationInfoImpl_MsysApplicationInfoCreateProcessNameJNI() {
        String str = C0JA.A00().A01;
        if (str == null) {
            return null;
        }
        return str;
    }
}

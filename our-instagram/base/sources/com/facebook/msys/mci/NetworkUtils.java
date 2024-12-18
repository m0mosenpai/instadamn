package com.facebook.msys.mci;

import X.C2NJ;

/* loaded from: classes.dex */
public class NetworkUtils {
    public static final NetworkUtils $redex_init_class = null;

    public static native String getMqttSandboxDomain();

    public static native String getSandboxDomain();

    public static native synchronized void setMqttSandboxDomain(String str);

    public static native synchronized void setSandboxDomain(String str);

    static {
        C2NJ.A00();
    }
}

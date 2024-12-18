package com.instagram.realtimeclient.requeststream;

import X.C48F;

/* loaded from: classes4.dex */
public class RealtimeGraphQLSDKConfigurationImpl implements C48F {
    @Override // X.C48F
    public boolean getGlobalBool(String str, boolean z) {
        return z;
    }

    public double getGlobalDouble(String str, double d) {
        return d;
    }

    @Override // X.C48F
    public int getGlobalInt(String str, int i) {
        return i;
    }

    @Override // X.C48F
    public String getGlobalString(String str, String str2) {
        return str2;
    }

    public RealtimeGraphQLSDKConfigurationImpl(int i) {
    }

    @Override // X.C48F
    public boolean getBoolForContext(String str, String str2, boolean z) {
        return z;
    }

    public double getDoubleForContext(String str, String str2, double d) {
        return d;
    }

    public int getIntForContext(String str, String str2, int i) {
        return i;
    }

    @Override // X.C48F
    public String getStringForContext(String str, String str2, String str3) {
        return str3;
    }

    public RealtimeGraphQLSDKConfigurationImpl() {
    }
}

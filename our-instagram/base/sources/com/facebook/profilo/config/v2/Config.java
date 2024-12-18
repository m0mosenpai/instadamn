package com.facebook.profilo.config.v2;

import X.C09170dP;
import X.InterfaceC06330Uz;
import com.facebook.jni.HybridData;
import com.facebook.profilo.config.ConfigParams;

/* loaded from: classes.dex */
public class Config implements InterfaceC06330Uz {
    public final HybridData mHybridData;

    @Override // X.InterfaceC06330Uz
    public native long getID();

    public native boolean getSystemConfigParamBool(String str);

    public native int getSystemConfigParamInt(String str);

    public native int[] getSystemConfigParamIntList(String str);

    public native String getSystemConfigParamString(String str);

    public native String[] getSystemConfigParamStringList(String str);

    @Override // X.InterfaceC06330Uz
    public native int[] getTraceConfigIdxs(String str, String str2);

    public native boolean getTraceConfigParamBool(int i, String str);

    @Override // X.InterfaceC06330Uz
    public native int getTraceConfigParamInt(int i, String str);

    public native int[] getTraceConfigParamIntList(int i, String str);

    public native String getTraceConfigParamString(int i, String str);

    public native String[] getTraceConfigParamStringList(int i, String str);

    @Override // X.InterfaceC06330Uz
    public native ConfigParams getTraceConfigParams(int i);

    @Override // X.InterfaceC06330Uz
    public native String[] getTraceConfigProviders(int i);

    public native boolean getTraceConfigTriggerParamBool(int i, String str, String str2, String str3);

    @Override // X.InterfaceC06330Uz
    public native int getTraceConfigTriggerParamInt(int i, String str, String str2, String str3);

    public native int[] getTraceConfigTriggerParamIntList(int i, String str, String str2, String str3);

    public native String getTraceConfigTriggerParamString(int i, String str, String str2, String str3);

    public native String[] getTraceConfigTriggerParamStringList(int i, String str, String str2, String str3);

    public native int getVersion();

    public native boolean isDisablingConfig();

    public native boolean optSystemConfigParamBool(String str, boolean z);

    @Override // X.InterfaceC06330Uz
    public native int optSystemConfigParamInt(String str, int i);

    public native int[] optSystemConfigParamIntList(String str);

    public native String optSystemConfigParamString(String str, String str2);

    public native String[] optSystemConfigParamStringList(String str);

    @Override // X.InterfaceC06330Uz
    public native boolean optTraceConfigParamBool(int i, String str, boolean z);

    @Override // X.InterfaceC06330Uz
    public native int optTraceConfigParamInt(int i, String str, int i2);

    @Override // X.InterfaceC06330Uz
    public native int[] optTraceConfigParamIntList(int i, String str);

    @Override // X.InterfaceC06330Uz
    public native String optTraceConfigParamString(int i, String str, String str2);

    @Override // X.InterfaceC06330Uz
    public native String[] optTraceConfigParamStringList(int i, String str);

    public native boolean optTraceConfigTriggerParamBool(int i, String str, String str2, String str3, boolean z);

    @Override // X.InterfaceC06330Uz
    public native int optTraceConfigTriggerParamInt(int i, String str, String str2, String str3, int i2);

    public native int[] optTraceConfigTriggerParamIntList(int i, String str, String str2, String str3);

    public native String optTraceConfigTriggerParamString(int i, String str, String str2, String str3, String str4);

    public native String[] optTraceConfigTriggerParamStringList(int i, String str, String str2, String str3);

    static {
        C09170dP.A0C("profilo_configjni");
    }

    public Config(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

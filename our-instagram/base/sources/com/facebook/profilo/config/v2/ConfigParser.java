package com.facebook.profilo.config.v2;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class ConfigParser {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str);

    public native Config parseConfig();

    static {
        C09170dP.A0C("profilo_configjni");
    }

    public ConfigParser(String str) {
        this.mHybridData = initHybrid(str);
    }
}

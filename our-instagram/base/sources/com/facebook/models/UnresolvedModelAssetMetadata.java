package com.facebook.models;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class UnresolvedModelAssetMetadata {
    public static final UnresolvedModelAssetMetadata $redex_init_class = null;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str, long j, String str2, String str3, String str4, String str5, String str6);

    public native void addDeltaCacheEntryNative(String str, String str2);

    static {
        C09170dP.A0C("models-common");
    }

    public UnresolvedModelAssetMetadata(String str, long j, String str2, String str3, String str4, String str5, String str6) {
        this.mHybridData = initHybrid(str, j, str2, str3, str4, str5, str6);
    }

    public void addDeltaCacheEntry(String str, String str2) {
        addDeltaCacheEntryNative(str, str2);
    }

    public UnresolvedModelAssetMetadata(String str, long j, String str2, String str3, String str4, String str5) {
        this(str, j, str2, str3, str4, str5, "");
    }
}

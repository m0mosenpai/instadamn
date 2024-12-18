package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.C09170dP;
import X.VMC;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import com.facebook.jni.HybridData;

/* loaded from: classes11.dex */
public final class XplatScriptingMetadataCompletionCallback {
    public static final VMC Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(ScriptingPackageMetadata scriptingPackageMetadata);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VMC, java.lang.Object] */
    static {
        C09170dP.A0C("ard-scripting-downloader");
    }

    public XplatScriptingMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

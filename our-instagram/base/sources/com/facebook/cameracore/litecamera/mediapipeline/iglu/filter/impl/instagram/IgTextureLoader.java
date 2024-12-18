package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram;

import X.AbstractC09440dt;
import X.C09170dP;
import X.C199798sb;
import X.C206859Dq;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC198588q7;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.TextureLoaderWeakPtr;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class IgTextureLoader implements InterfaceC198588q7 {
    public static final C199798sb Companion = new Object();
    public final InterfaceC09390do _textureLoaderWeakPtr$delegate = AbstractC09440dt.A00(EnumC09460dv.A02, new C206859Dq(this, 2));
    public final HybridData mHybridData = initHybrid();

    private final native void attachNative(IgluConfigHolder igluConfigHolder);

    /* JADX INFO: Access modifiers changed from: private */
    public final native TextureLoaderWeakPtr createTextureLoaderNative();

    private final native void detachNative();

    public static final native HybridData initHybrid();

    private final native void tryGPULoadingNative();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.8sb] */
    static {
        C09170dP.A0C("mediapipeline-iglufilter-instagram");
    }

    @Override // X.InterfaceC198588q7
    public TextureLoaderWeakPtr getTextureLoaderWeakPtr() {
        return (TextureLoaderWeakPtr) this._textureLoaderWeakPtr$delegate.getValue();
    }

    public static final /* synthetic */ TextureLoaderWeakPtr access$createTextureLoaderNative(IgTextureLoader igTextureLoader) {
        return igTextureLoader.createTextureLoaderNative();
    }

    @Override // X.InterfaceC198588q7
    public void attach(IgluConfigHolder igluConfigHolder) {
        attachNative(igluConfigHolder);
    }

    @Override // X.InterfaceC198588q7
    public void detach() {
        detachNative();
    }

    public final void tryGPULoading() {
        tryGPULoadingNative();
    }
}

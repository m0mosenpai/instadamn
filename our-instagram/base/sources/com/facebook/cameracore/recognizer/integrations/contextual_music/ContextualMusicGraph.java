package com.facebook.cameracore.recognizer.integrations.contextual_music;

import X.C09170dP;
import X.C225009wP;
import com.facebook.cameracore.util.Reference;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class ContextualMusicGraph {
    public static final C225009wP Companion = new Object();
    public final HybridData mHybridData;

    public static final native HybridData initHybrid(String str);

    private final native float[] nativeRun(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, int i10, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, boolean z2, Reference reference);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wP, java.lang.Object] */
    static {
        C09170dP.A0C("contextual-music-graph-android");
        C09170dP.A0D("torch-code-gen", 16);
        C09170dP.A0D("dynamic_pytorch_impl", 16);
    }
}

package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import com.facebook.jni.HybridData;

/* loaded from: classes11.dex */
public class MicrophoneSink {
    public final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native void write(short[] sArr, int i, int i2);
}

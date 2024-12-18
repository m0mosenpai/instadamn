package com.facebook.cameracore.audiograph;

import X.AbstractC166997dE;
import X.C09170dP;
import X.C175937s8;
import com.facebook.jni.HybridData;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class CameraAudioManager {
    public C175937s8 mCallback;
    public final AtomicBoolean mDestroyed = AbstractC166997dE.A17();
    public HybridData mHybridData;

    private native HybridData initHybrid(float f);

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native int getNumSamples();

    public native float getSampleRate();

    public native boolean getSpeakers();

    public native int getState();

    public native String getStateStr(int i);

    public native void setSpeakers(boolean z);

    public native int setState(int i);

    public native int setStateSync(int i);

    static {
        C09170dP.A0C("audiograph-native");
    }

    public void onAudioData(byte[] bArr, long j) {
        C175937s8 c175937s8 = this.mCallback;
        if (c175937s8 != null) {
            c175937s8.A01(bArr, (int) getSampleRate(), 2, 1, j, 0L);
        }
    }

    public CameraAudioManager(float f) {
        this.mHybridData = initHybrid(f);
    }
}

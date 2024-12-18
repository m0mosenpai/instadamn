package com.facebook.cameracore.audio.fbaaudiopostprocessing;

import X.AbstractC166997dE;
import X.C09170dP;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class AudioPostProcessor {
    public static boolean sIsNativeLibLoaded;
    public final AtomicBoolean mDestructed;
    public HybridData mHybridData;

    public AudioPostProcessor(int i, int i2, float f, int i3, int i4) {
        synchronized (AudioPostProcessor.class) {
            if (!sIsNativeLibLoaded) {
                C09170dP.A0C("audiopostprocessing-native");
                sIsNativeLibLoaded = true;
            }
        }
        this.mDestructed = AbstractC166997dE.A17();
        this.mHybridData = initHybrid(i, i2, f, 3, i4);
    }

    private native HybridData initHybrid(int i, int i2, float f, int i3, int i4);

    public native int addEffect(long j, long j2);

    public native int bypassEffect(long j, long j2, boolean z);

    public native int connectSource(long j);

    public native int createArAudioFileGraph(String str, AudioPostProcessorCallback audioPostProcessorCallback);

    public native long createFileSource(String str, String str2, AudioPostProcessorCallback audioPostProcessorCallback);

    public native int createGraph2(int i, String[] strArr, float[] fArr, int[] iArr, AudioPostProcessorCallback audioPostProcessorCallback);

    public native int createGraph3(int i, String str, float f, AudioPostProcessorCallback audioPostProcessorCallback);

    public native int createPushPCMMixingGraph(int i, int i2, int i3, float[] fArr, AudioPostProcessorCallback audioPostProcessorCallback, long[] jArr);

    public native long createQueueSource(String str, int i, int i2);

    public native int disconnectSource(long j);

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native float getPlayRate(long j);

    public native float getSourceGain(long j);

    public native boolean getSourcePlay(long j);

    public native long loadEffect(String str);

    public native int processNext();

    public native int pushToQueue(long j, ByteBuffer byteBuffer, int i);

    public native int removeEffect(long j, long j2);

    public native int removeSource(long j);

    public native int setPlayRate(long j, float f);

    public native int setSourceGain(long j, float f);

    public native int setSourcePlay(long j, boolean z);

    public native int unloadEffect(long j);
}

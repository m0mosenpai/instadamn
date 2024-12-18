package com.facebook.mediastreaming.bundledservices;

import X.C09170dP;
import X.C53683NoY;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.io.File;

/* loaded from: classes9.dex */
public final class LiveStreamSessionProbe {
    public static final C53683NoY Companion = new Object();
    public final HybridData mHybridData;

    public final native AudioEncoderConfig getAudioEncoderConfig();

    public final native long getAudioPts();

    public final native long getAudioPtsStreamTime();

    public final native double getAvgLiveEncodingBitrate();

    public final native File getDvrOutputFile();

    public final native double getLatestLiveEncodingBitrate();

    public final native int getMuxState();

    public final native int getNumberOfNetworkInterrupts();

    public final native double getTransportThroughputBps();

    public final native VideoEncoderConfig getVideoEncoderConfig();

    public final native long getVideoPts();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.NoY] */
    static {
        C09170dP.A0C("mediastreaming-bundledservices");
    }

    public LiveStreamSessionProbe(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}

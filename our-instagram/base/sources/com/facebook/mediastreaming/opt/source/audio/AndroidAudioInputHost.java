package com.facebook.mediastreaming.opt.source.audio;

import X.C09170dP;
import X.C14360o3;
import X.C53700Nop;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public abstract class AndroidAudioInputHost extends StreamingHybridClassBase {
    public static final C53700Nop Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAudioInputHost(HybridData hybridData) {
        super(hybridData);
        C14360o3.A0B(hybridData, 1);
    }

    public static final native HybridData initHybrid();

    public abstract ByteBuffer acquireAudioSampleBuffer();

    public abstract void audioSampleBufferFilled(int i, boolean z, long j);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Nop, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public AndroidAudioInputHost() {
        super(initHybrid());
    }
}

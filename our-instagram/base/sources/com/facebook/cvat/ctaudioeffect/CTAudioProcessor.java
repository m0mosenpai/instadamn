package com.facebook.cvat.ctaudioeffect;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC65702TsY;
import X.C09170dP;
import X.C190178bb;
import X.C54507O6k;
import X.C69065VhG;
import X.MSV;
import X.OMT;
import X.W25;
import X.XC1;
import X.XLE;
import com.facebook.jni.HybridData;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public class CTAudioProcessor implements XLE {
    public static final int SIGNED_SHORT_LIMIT = (int) Math.pow(2.0d, 15.0d);
    public static final int UNSIGNED_SHORT_MAX = (int) Math.pow(2.0d, 16.0d);
    public final List mGlobalAudioEffects;
    public final HybridData mHybridData;
    public boolean mIsWarmingUp;
    public final C54507O6k mLogger;
    public List[] mMediaEffects;
    public int mNumChannels;
    public ByteBuffer mOutputBuffer;
    public int mOutputBufferSize;
    public float mProcessingAmount;
    public double mSampleRate;
    public int mSamplesPerFrame;
    public boolean[] mTrackEnableFlags;
    public final int mWarmupDurationInSec;
    public long mWarmupEndMs;
    public long mWarmupStartMs;

    private native HybridData initHybridData(HashMap hashMap);

    private native void nativeEnableVLOptimisations();

    private native void nativeFlush();

    private native float nativeGetProcessingAmount();

    private native short nativeMixPCMAudioSamples(short s, short s2);

    private native void nativeProcess(ByteBuffer byteBuffer);

    private native void nativeSetBypass(boolean z);

    private native void nativeSetFerrarisModelPath(String str);

    private native void nativeSetProcessingAmount(float f);

    private native void nativeSetWarmupState(boolean z);

    private native void nativeSetupEngine(double d, int i, int i2);

    @Override // X.InterfaceC71995XEj
    public void addEffect(MediaEffect mediaEffect) {
        if (mediaEffect instanceof C190178bb) {
            this.mGlobalAudioEffects.add(mediaEffect);
            return;
        }
        throw new UnsupportedOperationException(AbstractC167017dG.A0n(mediaEffect, "MediaEffect: ", new StringBuilder()));
    }

    @Override // X.XLE
    public ByteBuffer[] applyEffects(ByteBuffer[] byteBufferArr, long j) {
        if (this.mIsWarmingUp) {
            this.mWarmupEndMs = System.currentTimeMillis();
            this.mIsWarmingUp = false;
            nativeSetWarmupState(false);
            nativeFlush();
            C54507O6k c54507O6k = this.mLogger;
            HashMap hashMap = new HashMap();
            long j2 = this.mWarmupEndMs - this.mWarmupStartMs;
            hashMap.put(MSV.A00(117), Integer.toString((int) this.mSampleRate));
            hashMap.put("audio_channels", Integer.toString(this.mNumChannels));
            hashMap.put("offline_processing_time", Long.toString(j2));
            hashMap.put("warmup_duration", Long.toString(this.mWarmupDurationInSec * 1000));
            HashMap hashMap2 = new HashMap(c54507O6k.A01);
            hashMap2.putAll(hashMap);
            XC1 xc1 = c54507O6k.A00;
            if (xc1 != null) {
                xc1.logEvent("cvat_ae_warmup_completed", hashMap2);
            }
        }
        int length = byteBufferArr.length;
        ByteBuffer[] byteBufferArr2 = new ByteBuffer[length];
        for (int i = 0; i < length; i++) {
            if (this.mTrackEnableFlags[i]) {
                ByteBuffer byteBuffer = byteBufferArr[i];
                applyEffectsToTrack(byteBuffer, this.mMediaEffects[i], j);
                applyEffectsToTrack(byteBuffer, this.mGlobalAudioEffects, j);
                byteBufferArr2[i] = byteBuffer;
            }
        }
        return byteBufferArr2;
    }

    @Override // X.InterfaceC71995XEj
    public void configure(C69065VhG c69065VhG) {
        int i = c69065VhG.A00;
        this.mTrackEnableFlags = new boolean[i];
        List[] listArr = new List[i];
        this.mMediaEffects = listArr;
        for (int i2 = 0; i2 < i; i2++) {
            listArr[i2] = new ArrayList();
        }
        W25 w25 = c69065VhG.A02;
        this.mSampleRate = w25.A01;
        int i3 = w25.A00;
        this.mNumChannels = i3;
        this.mSamplesPerFrame = 1024;
        int i4 = i3 * 1024 * 2;
        this.mOutputBufferSize = i4;
        if (this.mOutputBuffer == null) {
            this.mOutputBuffer = AbstractC65702TsY.A0j(i4);
        }
        nativeSetupEngine(this.mSampleRate, this.mNumChannels, this.mSamplesPerFrame);
        nativeSetWarmupState(false);
    }

    @Override // X.InterfaceC71995XEj
    public void disableTrack(int i) {
        this.mTrackEnableFlags[i] = false;
    }

    @Override // X.InterfaceC71995XEj
    public void enableTrack(int i) {
        this.mTrackEnableFlags[i] = true;
    }

    @Override // X.InterfaceC71995XEj
    public int getWarmupDurationInSec() {
        return this.mWarmupDurationInSec;
    }

    @Override // X.InterfaceC71995XEj
    public ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        ByteBuffer byteBuffer = this.mOutputBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            ByteBuffer[] applyEffects = applyEffects(byteBufferArr, j);
            for (int i = 0; i < this.mOutputBufferSize; i += 2) {
                short s = 0;
                for (int i2 = 0; i2 < applyEffects.length; i2++) {
                    if (this.mTrackEnableFlags[i2]) {
                        s = nativeMixPCMAudioSamples(s, applyEffects[i2].getShort(i));
                    }
                }
                this.mOutputBuffer.putShort(s);
            }
            this.mOutputBuffer.flip();
            return this.mOutputBuffer;
        }
        throw new IllegalStateException("This method should not be called without having called configure()");
    }

    @Override // X.InterfaceC71995XEj
    public void removeEffect(MediaEffect mediaEffect) {
        if (mediaEffect instanceof C190178bb) {
            this.mGlobalAudioEffects.remove(mediaEffect);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC71995XEj
    public void warmup(ByteBuffer[] byteBufferArr, long j) {
        if (!this.mIsWarmingUp) {
            this.mIsWarmingUp = true;
            nativeSetWarmupState(true);
            this.mWarmupStartMs = System.currentTimeMillis();
        }
        for (int i = 0; i < byteBufferArr.length; i++) {
            if (this.mTrackEnableFlags[i]) {
                nativeProcess(byteBufferArr[i]);
            }
        }
    }

    public CTAudioProcessor(OMT omt, C54507O6k c54507O6k) {
        this.mTrackEnableFlags = new boolean[0];
        this.mMediaEffects = new List[0];
        this.mGlobalAudioEffects = new ArrayList();
        this.mWarmupStartMs = -1L;
        this.mWarmupEndMs = -1L;
        this.mIsWarmingUp = false;
        this.mProcessingAmount = -1.0f;
        this.mWarmupDurationInSec = omt.A00();
        synchronized (CTAudioProcessor.class) {
            C09170dP.A0C("ctaudioprocessor-native");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isNoiseRemoverEnabled", Boolean.valueOf(omt.A04()));
        hashMap.put("isAutoEQEnabled", Boolean.valueOf(omt.A02()));
        hashMap.put("isLevelerEnabled", Boolean.valueOf(omt.A03()));
        this.mHybridData = initHybridData(hashMap);
        this.mLogger = c54507O6k;
    }

    private ByteBuffer applyEffectsToTrack(ByteBuffer byteBuffer, List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaEffect mediaEffect = (MediaEffect) it.next();
            if (mediaEffect instanceof C190178bb) {
                float f = ((C190178bb) mediaEffect).A00;
                if (f != this.mProcessingAmount) {
                    this.mProcessingAmount = f;
                    nativeSetProcessingAmount(f);
                    nativeSetBypass(AbstractC167007dF.A1N((this.mProcessingAmount > 0.0f ? 1 : (this.mProcessingAmount == 0.0f ? 0 : -1))));
                }
                nativeProcess(byteBuffer);
            }
        }
        return byteBuffer;
    }

    @Override // X.InterfaceC71995XEj
    public boolean isEffectSupported(MediaEffect mediaEffect) {
        return mediaEffect instanceof C190178bb;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.OMT] */
    public CTAudioProcessor() {
        this(new Object(), new C54507O6k(null, "", null));
    }

    @Override // X.InterfaceC71995XEj
    public void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue >= 0 && (mediaEffect instanceof C190178bb)) {
            this.mMediaEffects[intValue].add(0, mediaEffect);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Track Index: ");
        sb.append(num);
        throw new UnsupportedOperationException(AbstractC167017dG.A0n(mediaEffect, ", MediaEffect: ", sb));
    }

    @Override // X.InterfaceC71995XEj
    public void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        if (intValue >= 0 && (mediaEffect instanceof C190178bb)) {
            this.mMediaEffects[intValue].remove(mediaEffect);
            return;
        }
        throw new UnsupportedOperationException();
    }
}

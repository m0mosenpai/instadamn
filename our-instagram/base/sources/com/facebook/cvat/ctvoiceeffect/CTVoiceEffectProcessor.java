package com.facebook.cvat.ctvoiceeffect;

import X.AbstractC009903n;
import X.AbstractC111324zv;
import X.AbstractC167017dG;
import X.AbstractC65702TsY;
import X.C09170dP;
import X.C14360o3;
import X.C23500AbG;
import X.C69065VhG;
import X.VMG;
import X.W25;
import X.XLE;
import com.facebook.jni.HybridData;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class CTVoiceEffectProcessor implements XLE {
    public static final VMG Companion = new Object();
    public String effectPathFromJson;
    public int numChannels;
    public int numSamples;
    public ByteBuffer outputBuffer;
    public int outputBufferSize;
    public double sampleRate;
    public boolean[] trackEnableFlags = new boolean[0];
    public List[] mediaEffects = new List[0];
    public final List globalAudioEffects = new ArrayList();
    public float userParameterValue = -1.0f;
    public final HybridData mHybridData = initHybridData();

    private final native HybridData initHybridData();

    private final native boolean nativeGetBypass();

    private final native String nativeGetEffectName(String str);

    private final native int nativeGetLatencySamples();

    private final native float nativeGetUserParameterValue();

    private final native boolean nativeIsPreparedToPlay();

    private final native short nativeMixPCMAudioSamples(short s, short s2);

    private final native void nativeProcess(ByteBuffer byteBuffer);

    private final native void nativeSetBypass(boolean z);

    private final native void nativeSetOutputGain(float f);

    private final native void nativeSetUserParameterValue(float f);

    private final native void nativeSetVoiceEffectToLoad(String str);

    private final native void nativeSetup(double d, int i, int i2);

    @Override // X.InterfaceC71995XEj
    public void addEffect(MediaEffect mediaEffect) {
        C14360o3.A0B(mediaEffect, 0);
        if (mediaEffect instanceof C23500AbG) {
            this.globalAudioEffects.add(mediaEffect);
            String str = ((C23500AbG) mediaEffect).A00;
            if (str != null) {
                this.effectPathFromJson = str;
                nativeSetVoiceEffectToLoad(str);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException(AbstractC167017dG.A0n(mediaEffect, "MediaEffect: ", new StringBuilder()));
    }

    @Override // X.XLE
    public ByteBuffer[] applyEffects(ByteBuffer[] byteBufferArr, long j) {
        C14360o3.A0B(byteBufferArr, 0);
        int length = byteBufferArr.length;
        ByteBuffer[] byteBufferArr2 = new ByteBuffer[length];
        for (int i = 0; i < length; i++) {
            ByteBuffer byteBuffer = byteBufferArr[i];
            if (byteBuffer == null) {
                byteBuffer = ByteBuffer.allocateDirect(0);
            }
            if (this.trackEnableFlags[i]) {
                C14360o3.A0A(byteBuffer);
                Iterator it = this.mediaEffects[i].iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof C23500AbG) {
                        nativeProcess(byteBuffer);
                    }
                }
                Iterator it2 = this.globalAudioEffects.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof C23500AbG) {
                        nativeProcess(byteBuffer);
                    }
                }
            }
            byteBufferArr2[i] = byteBuffer;
        }
        return (ByteBuffer[]) AbstractC009903n.A0I(byteBufferArr2).toArray(new ByteBuffer[0]);
    }

    @Override // X.InterfaceC71995XEj
    public void configure(C69065VhG c69065VhG) {
        C14360o3.A0B(c69065VhG, 0);
        int i = c69065VhG.A00;
        this.trackEnableFlags = new boolean[i];
        List[] listArr = new List[i];
        for (int i2 = 0; i2 < i; i2++) {
            listArr[i2] = new ArrayList();
        }
        this.mediaEffects = listArr;
        W25 w25 = c69065VhG.A02;
        this.sampleRate = w25.A01;
        int i3 = w25.A00;
        this.numChannels = i3;
        this.numSamples = 1024;
        int i4 = i3 * 1024 * 2;
        this.outputBufferSize = i4;
        if (this.outputBuffer == null) {
            this.outputBuffer = AbstractC65702TsY.A0j(i4);
        }
        nativeSetup(this.sampleRate, this.numSamples, this.numChannels);
    }

    @Override // X.InterfaceC71995XEj
    public int getWarmupDurationInSec() {
        return 0;
    }

    @Override // X.InterfaceC71995XEj
    public boolean isEffectSupported(MediaEffect mediaEffect) {
        C14360o3.A0B(mediaEffect, 0);
        return mediaEffect instanceof C23500AbG;
    }

    @Override // X.InterfaceC71995XEj
    public ByteBuffer process(ByteBuffer[] byteBufferArr, long j) {
        C14360o3.A0B(byteBufferArr, 0);
        ByteBuffer byteBuffer = this.outputBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            ByteBuffer[] applyEffects = applyEffects(byteBufferArr, j);
            for (int i = 0; i < this.outputBufferSize; i += 2) {
                int length = applyEffects.length;
                short s = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.trackEnableFlags[i2]) {
                        s = nativeMixPCMAudioSamples(s, applyEffects[i2].getShort(i));
                    }
                }
                ByteBuffer byteBuffer2 = this.outputBuffer;
                C14360o3.A0A(byteBuffer2);
                byteBuffer2.putShort(s);
            }
            ByteBuffer byteBuffer3 = this.outputBuffer;
            C14360o3.A0A(byteBuffer3);
            byteBuffer3.flip();
            ByteBuffer byteBuffer4 = this.outputBuffer;
            C14360o3.A0C(byteBuffer4, AbstractC111324zv.A00(1148));
            return byteBuffer4;
        }
        throw new IllegalStateException("This method should not be called without having called configure()");
    }

    @Override // X.InterfaceC71995XEj
    public void removeEffect(MediaEffect mediaEffect) {
        C14360o3.A0B(mediaEffect, 0);
        if (mediaEffect instanceof C23500AbG) {
            this.globalAudioEffects.remove(mediaEffect);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // X.InterfaceC71995XEj
    public void warmup(ByteBuffer[] byteBufferArr, long j) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.VMG, java.lang.Object] */
    static {
        C09170dP.A0C("ctvoiceeffectprocessor-native");
    }

    @Override // X.InterfaceC71995XEj
    public void disableTrack(int i) {
        this.trackEnableFlags[i] = false;
    }

    @Override // X.InterfaceC71995XEj
    public void enableTrack(int i) {
        this.trackEnableFlags[i] = true;
    }

    @Override // X.InterfaceC71995XEj
    public /* bridge */ /* synthetic */ void addEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        C14360o3.A0B(mediaEffect, 1);
        if (intValue >= 0 && (mediaEffect instanceof C23500AbG)) {
            this.mediaEffects[intValue].add(mediaEffect);
            List list = this.mediaEffects[intValue];
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C23500AbG) {
                    String str = ((C23500AbG) mediaEffect).A00;
                    if (str == null) {
                        return;
                    }
                    this.effectPathFromJson = str;
                    nativeSetVoiceEffectToLoad(str);
                    return;
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Track Index: ");
        sb.append(intValue);
        throw new UnsupportedOperationException(AbstractC167017dG.A0n(mediaEffect, ", MediaEffect: ", sb));
    }

    @Override // X.InterfaceC71995XEj
    public /* bridge */ /* synthetic */ void removeEffect(Integer num, MediaEffect mediaEffect) {
        int intValue = num.intValue();
        C14360o3.A0B(mediaEffect, 1);
        if (intValue >= 0 && (mediaEffect instanceof C23500AbG)) {
            this.mediaEffects[intValue].remove(mediaEffect);
            return;
        }
        throw new UnsupportedOperationException();
    }
}

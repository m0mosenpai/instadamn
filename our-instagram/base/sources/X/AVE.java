package X;

import android.os.SystemClock;
import com.facebook.cameracore.audiograph.AudioPipelineImpl;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class AVE implements BDY {
    public long A00 = 0;
    public final HashMap A01 = AbstractC166987dD.A1G();
    public final /* synthetic */ AudioPipelineImpl A02;

    public AVE(AudioPipelineImpl audioPipelineImpl) {
        this.A02 = audioPipelineImpl;
    }

    public static void A00(AudioPipelineImpl audioPipelineImpl) {
        AVE ave = audioPipelineImpl.mAudioRecorderCallback;
        ave.A00 = 0L;
        ave.A01.clear();
    }

    @Override // X.BDY
    public final void D9B(C73493YFw c73493YFw, int i) {
        int processByteBuffer;
        int i2;
        AudioPipelineImpl audioPipelineImpl = this.A02;
        if (!audioPipelineImpl.mDestructed.get() && !audioPipelineImpl.mStopped.get()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (audioPipelineImpl.mAudioTrack == null) {
                C175937s8 c175937s8 = audioPipelineImpl.mAudioOutputCallback;
                if (c175937s8 != null) {
                    c175937s8.A00(c73493YFw, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, i, elapsedRealtimeNanos);
                    this.A00++;
                    return;
                }
                return;
            }
            if (AudioPipelineImpl.IS_UNIT_TEST) {
                processByteBuffer = 0;
            } else {
                processByteBuffer = audioPipelineImpl.processByteBuffer(c73493YFw.A02, i);
            }
            int i3 = 1;
            if (processByteBuffer == 0) {
                C175937s8 c175937s82 = audioPipelineImpl.mAudioOutputCallback;
                if (c175937s82 != null) {
                    c175937s82.A00(c73493YFw, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, i, elapsedRealtimeNanos);
                }
            } else {
                HashMap hashMap = this.A01;
                Integer valueOf = Integer.valueOf(processByteBuffer);
                Number number = (Number) hashMap.get(valueOf);
                if (number != null) {
                    i2 = number.intValue() + 1;
                } else {
                    i2 = 1;
                }
                AbstractC166997dE.A1U(valueOf, hashMap, i2);
            }
            this.A00++;
            if (processByteBuffer == 0 || processByteBuffer == 101) {
                return;
            }
            HashMap hashMap2 = this.A01;
            Integer valueOf2 = Integer.valueOf(processByteBuffer);
            Number number2 = (Number) hashMap2.get(valueOf2);
            if (number2 != null) {
                i3 = 1 + number2.intValue();
            }
            AbstractC166997dE.A1U(valueOf2, hashMap2, i3);
        }
    }

    @Override // X.BDY
    public final void D9C(byte[] bArr, int i) {
        int processData;
        int i2;
        AudioPipelineImpl audioPipelineImpl = this.A02;
        if (!audioPipelineImpl.mDestructed.get() && !audioPipelineImpl.mStopped.get()) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (audioPipelineImpl.mAudioTrack == null) {
                C175937s8 c175937s8 = audioPipelineImpl.mAudioOutputCallback;
                if (c175937s8 != null) {
                    c175937s8.A01(bArr, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, i, elapsedRealtimeNanos);
                    this.A00++;
                    return;
                }
                return;
            }
            if (AudioPipelineImpl.IS_UNIT_TEST) {
                processData = 0;
            } else {
                processData = audioPipelineImpl.processData(bArr, i);
            }
            int i3 = 1;
            if (processData == 0) {
                C175937s8 c175937s82 = audioPipelineImpl.mAudioOutputCallback;
                if (c175937s82 != null) {
                    c175937s82.A01(bArr, audioPipelineImpl.mGraphSampleRate, audioPipelineImpl.mPlatformSampleType, audioPipelineImpl.mPlatformNumChannels, i, elapsedRealtimeNanos);
                }
            } else {
                HashMap hashMap = this.A01;
                Integer valueOf = Integer.valueOf(processData);
                Number number = (Number) hashMap.get(valueOf);
                if (number != null) {
                    i2 = number.intValue() + 1;
                } else {
                    i2 = 1;
                }
                AbstractC166997dE.A1U(valueOf, hashMap, i2);
            }
            this.A00++;
            if (processData == 0 || processData == 101) {
                return;
            }
            HashMap hashMap2 = this.A01;
            Integer valueOf2 = Integer.valueOf(processData);
            Number number2 = (Number) hashMap2.get(valueOf2);
            if (number2 != null) {
                i3 = 1 + number2.intValue();
            }
            AbstractC166997dE.A1U(valueOf2, hashMap2, i3);
        }
    }

    @Override // X.BDY
    public final void DE6(C212399b8 c212399b8) {
        C176087sR c176087sR;
        C176217se c176217se;
        C175937s8 c175937s8 = this.A02.mAudioOutputCallback;
        if (c175937s8 != null && (c176087sR = c175937s8.A00) != null && (c176217se = c176087sR.A00.A0H) != null) {
            c176217se.A00(c212399b8);
        }
    }

    @Override // X.BDY
    public final void DHP() {
        InterfaceC178407wE interfaceC178407wE;
        C175937s8 c175937s8 = this.A02.mAudioOutputCallback;
        if (c175937s8 != null && (interfaceC178407wE = c175937s8.A01) != null) {
            interfaceC178407wE.DEZ(19, "recording_start_audio_first_received");
        }
    }
}

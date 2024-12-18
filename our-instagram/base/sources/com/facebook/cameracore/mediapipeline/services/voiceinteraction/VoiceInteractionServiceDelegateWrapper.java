package com.facebook.cameracore.mediapipeline.services.voiceinteraction;

import X.C2038990b;
import X.C2039090c;
import android.media.AudioRecord;

/* loaded from: classes4.dex */
public final class VoiceInteractionServiceDelegateWrapper {
    public C2038990b delegate;

    public final short[] getAudioChunk() {
        Integer num;
        int i;
        short[] sArr;
        C2038990b c2038990b = this.delegate;
        if (c2038990b != null) {
            C2039090c c2039090c = c2038990b.A01;
            synchronized (c2039090c) {
                AudioRecord audioRecord = c2039090c.A01;
                if (audioRecord != null) {
                    short[] sArr2 = c2039090c.A02;
                    int i2 = c2039090c.A00;
                    num = Integer.valueOf(audioRecord.read(sArr2, i2, 4096 - i2));
                } else {
                    num = null;
                }
                int i3 = c2039090c.A00;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                int i4 = i3 + i;
                c2039090c.A00 = i4;
                if (i4 == 4096) {
                    sArr = new short[4096];
                    System.arraycopy(c2039090c.A02, 0, sArr, 0, 4096);
                    c2039090c.A00 = 0;
                } else {
                    sArr = new short[0];
                }
            }
            return sArr;
        }
        return null;
    }

    public final void startAudioCapture() {
        C2038990b c2038990b = this.delegate;
        if (c2038990b != null) {
            C2039090c c2039090c = c2038990b.A01;
            c2039090c.A00();
            synchronized (c2039090c) {
                c2039090c.A00 = 0;
                AudioRecord audioRecord = new AudioRecord(1, 16000, 16, 2, 512);
                c2039090c.A01 = audioRecord;
                audioRecord.startRecording();
            }
        }
    }

    public final void stopAudioCapture() {
        C2038990b c2038990b = this.delegate;
        if (c2038990b != null) {
            c2038990b.A01.A00();
        }
    }
}

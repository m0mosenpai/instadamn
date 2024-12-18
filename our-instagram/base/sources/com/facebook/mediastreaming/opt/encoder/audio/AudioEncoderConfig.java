package com.facebook.mediastreaming.opt.encoder.audio;

import X.C14360o3;
import X.EnumC53196Nfs;

/* loaded from: classes9.dex */
public final class AudioEncoderConfig {
    public final int bitRate;
    public final int channels;
    public final EnumC53196Nfs profile;
    public final int sampleRate;
    public final boolean useAudioASC;

    public AudioEncoderConfig(int i, int i2, int i3, EnumC53196Nfs enumC53196Nfs, boolean z) {
        C14360o3.A0B(enumC53196Nfs, 4);
        this.sampleRate = i;
        this.bitRate = i2;
        this.channels = i3;
        this.profile = enumC53196Nfs;
        this.useAudioASC = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AudioEncoderConfig(int r2, int r3, int r4, int r5, boolean r6) {
        /*
            r1 = this;
            r0 = 5
            if (r5 != r0) goto L9
            X.Nfs r5 = X.EnumC53196Nfs.A03
        L5:
            r1.<init>(r2, r3, r4, r5, r6)
            return
        L9:
            X.Nfs r5 = X.EnumC53196Nfs.A04
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.audio.AudioEncoderConfig.<init>(int, int, int, int, boolean):void");
    }
}

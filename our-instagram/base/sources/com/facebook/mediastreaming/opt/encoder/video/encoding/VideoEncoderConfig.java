package com.facebook.mediastreaming.opt.encoder.video.encoding;

import X.AbstractC167017dG;
import X.EnumC53209Ng7;
import X.EnumC53218NgG;

/* loaded from: classes9.dex */
public final class VideoEncoderConfig {
    public final int bitRate;
    public final boolean enableAndroidEncoderLowLatencyControl;
    public final int frameRate;
    public final int height;
    public final float iFrameInterval;
    public final int keyLatency;
    public final int keyPriority;
    public final EnumC53209Ng7 videoBitrateMode;
    public final EnumC53218NgG videoProfile;
    public final int width;

    public VideoEncoderConfig(int i, int i2, int i3, int i4, EnumC53218NgG enumC53218NgG, EnumC53209Ng7 enumC53209Ng7, float f, boolean z, int i5, int i6) {
        AbstractC167017dG.A1T(enumC53218NgG, enumC53209Ng7);
        this.width = i;
        this.height = i2;
        this.bitRate = i3;
        this.frameRate = i4;
        this.videoProfile = enumC53218NgG;
        this.videoBitrateMode = enumC53209Ng7;
        this.iFrameInterval = f;
        this.enableAndroidEncoderLowLatencyControl = z;
        this.keyLatency = i5;
        this.keyPriority = i6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoEncoderConfig(int r2, int r3, int r4, int r5, int r6, int r7, float r8, boolean r9, int r10, int r11) {
        /*
            r1 = this;
            X.NgG r6 = X.AbstractC53696Nol.A00(r6)
            r0 = 1
            if (r7 == r0) goto L13
            r0 = 2
            if (r7 == r0) goto L10
            X.Ng7 r7 = X.EnumC53209Ng7.A05
        Lc:
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L10:
            X.Ng7 r7 = X.EnumC53209Ng7.A04
            goto Lc
        L13:
            X.Ng7 r7 = X.EnumC53209Ng7.A03
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig.<init>(int, int, int, int, int, int, float, boolean, int, int):void");
    }
}

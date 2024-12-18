package X;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.2IG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2IG {
    public final MediaCodecInfo.CodecCapabilities A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return new X.C2IG(r9, r10, r11, r12, r13, r14, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r9.isFeatureSupported("secure-playback") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        if (r9 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r9.isFeatureSupported("adaptive-playback") == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r9.isFeatureSupported("tunneled-playback") != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r9 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2IG A00(android.media.MediaCodecInfo.CodecCapabilities r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, boolean r14) {
        /*
            r1 = r9
            if (r9 == 0) goto Lc
            java.lang.String r0 = "adaptive-playback"
            boolean r0 = r9.isFeatureSupported(r0)
            r7 = 1
            if (r0 != 0) goto Lf
        Lc:
            r7 = 0
            if (r9 == 0) goto L19
        Lf:
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r9.isFeatureSupported(r0)
            r8 = 1
            if (r0 != 0) goto L1c
        L19:
            r8 = 0
            if (r9 == 0) goto L31
        L1c:
            java.lang.String r0 = "secure-playback"
            boolean r0 = r9.isFeatureSupported(r0)
            if (r0 == 0) goto L31
            r9 = 1
        L26:
            X.2IG r0 = new X.2IG
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L31:
            r9 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2IG.A00(android.media.MediaCodecInfo$CodecCapabilities, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):X.2IG");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r9.A00(r10) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C5TF A05(X.C4B6 r9, X.C4B6 r10) {
        /*
            r8 = this;
            r3 = r9
            java.lang.String r1 = r9.A0W
            r4 = r10
            java.lang.String r0 = r10.A0W
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            r7 = 0
            if (r0 != 0) goto Lf
            r7 = 8
        Lf:
            boolean r0 = r8.A09
            if (r0 == 0) goto L66
            int r1 = r9.A0F
            int r0 = r10.A0F
            if (r1 == r0) goto L1b
            r7 = r7 | 1024(0x400, float:1.435E-42)
        L1b:
            boolean r0 = r8.A04
            if (r0 != 0) goto L2d
            int r1 = r9.A0L
            int r0 = r10.A0L
            if (r1 != r0) goto L2b
            int r1 = r9.A0A
            int r0 = r10.A0A
            if (r1 == r0) goto L2d
        L2b:
            r7 = r7 | 512(0x200, float:7.17E-43)
        L2d:
            com.google.android.exoplayer2.video.ColorInfo r1 = r9.A0Q
            com.google.android.exoplayer2.video.ColorInfo r0 = r10.A0Q
            boolean r0 = com.google.android.exoplayer2.util.Util.A0I(r1, r0)
            if (r0 != 0) goto L39
            r7 = r7 | 2048(0x800, float:2.87E-42)
        L39:
            java.lang.String r5 = r8.A03
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r0 = "SM-T230"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L55
            java.lang.String r0 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L55
            boolean r0 = r9.A00(r10)
            if (r0 != 0) goto L55
            r7 = r7 | 2
        L55:
            if (r7 != 0) goto Lc9
            boolean r0 = r9.A00(r10)
            r6 = 2
            if (r0 == 0) goto L5f
        L5e:
            r6 = 3
        L5f:
            r7 = 0
        L60:
            X.5TF r2 = new X.5TF
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L66:
            int r1 = r9.A06
            int r0 = r10.A06
            if (r1 == r0) goto L6e
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L6e:
            int r1 = r9.A0G
            int r0 = r10.A0G
            if (r1 == r0) goto L76
            r7 = r7 | 8192(0x2000, float:1.148E-41)
        L76:
            int r1 = r9.A0C
            int r0 = r10.A0C
            if (r1 == r0) goto L7e
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L7e:
            if (r7 != 0) goto Laf
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Laf
            android.util.Pair r0 = X.C46762Co.A00(r9)
            android.util.Pair r1 = X.C46762Co.A00(r10)
            if (r0 == 0) goto Laf
            if (r1 == 0) goto Laf
            java.lang.Object r0 = r0.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r1.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 42
            if (r2 != r0) goto Laf
            if (r1 != r0) goto Laf
            java.lang.String r5 = r8.A03
            goto L5e
        Laf:
            boolean r0 = r9.A00(r10)
            if (r0 != 0) goto Lb7
            r7 = r7 | 32
        Lb7:
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc3
            r7 = r7 | 2
        Lc3:
            if (r7 != 0) goto Lc9
            java.lang.String r5 = r8.A03
            r6 = 1
            goto L5f
        Lc9:
            java.lang.String r5 = r8.A03
            r6 = 0
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2IG.A05(X.4B6, X.4B6):X.5TF");
    }

    public static void A01(C2IG c2ig, String str) {
        AnonymousClass001.A18("NoSupport [", str, "] [", c2ig.A03, ", ", c2ig.A02, "] [", Util.A02, "]");
        AbstractC46512Bo.A01();
    }

    public final Point A04(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final boolean A06(int i) {
        String A0O;
        int i2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A0O = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                A0O = "channelCount.aCaps";
            } else {
                String str = this.A03;
                String str2 = this.A02;
                int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2)) {
                    if ("audio/ac3".equals(str2)) {
                        i2 = 6;
                    } else {
                        i2 = 30;
                        if ("audio/eac3".equals(str2)) {
                            i2 = 16;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("AssumedMaxChannelAdjustment: ");
                    sb.append(str);
                    sb.append(", [");
                    sb.append(maxInputChannelCount);
                    sb.append(" to ");
                    sb.append(i2);
                    sb.append("]");
                    AbstractC46512Bo.A04("MediaCodecInfo", sb.toString());
                    maxInputChannelCount = i2;
                }
                if (maxInputChannelCount < i) {
                    A0O = AnonymousClass001.A0O("channelCount.support, ", i);
                } else {
                    return true;
                }
            }
        }
        A01(this, A0O);
        return false;
    }

    public final boolean A07(int i) {
        String A0O;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            A0O = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                A0O = "sampleRate.aCaps";
            } else if (!audioCapabilities.isSampleRateSupported(i)) {
                A0O = AnonymousClass001.A0O("sampleRate.support, ", i);
            } else {
                return true;
            }
        }
        A01(this, A0O);
        return false;
    }

    public final boolean A08(int i, int i2, double d) {
        String obj;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.A00;
        if (codecCapabilities == null) {
            obj = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                obj = "sizeAndRate.vCaps";
            } else {
                if (Util.A00 >= 29) {
                    int A00 = AbstractC98914cB.A00(videoCapabilities, d, i, i2);
                    if (A00 != 2) {
                        if (A00 == 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("sizeAndRate.cover, ");
                            sb.append(i);
                            sb.append("x");
                            sb.append(i2);
                            sb.append("@");
                            sb.append(d);
                            obj = sb.toString();
                        }
                    }
                    return true;
                }
                if (!A02(videoCapabilities, d, i, i2)) {
                    if (i < i2) {
                        String str = this.A03;
                        if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Util.A01)) && A02(videoCapabilities, d, i2, i)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("sizeAndRate.rotated, ");
                            sb2.append(i);
                            sb2.append("x");
                            sb2.append(i2);
                            sb2.append("@");
                            sb2.append(d);
                            AnonymousClass001.A18("AssumedSupport [", sb2.toString(), "] [", str, ", ", this.A02, "] [", Util.A02, "]");
                            AbstractC46512Bo.A01();
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("sizeAndRate.support, ");
                    sb3.append(i);
                    sb3.append("x");
                    sb3.append(i2);
                    sb3.append("@");
                    sb3.append(d);
                    obj = sb3.toString();
                }
                return true;
            }
        }
        A01(this, obj);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r1.equals(X.C46762Co.A03(r5)) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A09(X.C4B6 r5) {
        /*
            r4 = this;
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A0W
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = X.C46762Co.A03(r5)
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L16
        L15:
            r0 = 1
        L16:
            r2 = 0
            if (r0 == 0) goto L4a
            r1 = 1
            boolean r0 = A03(r5, r4, r1)
            if (r0 == 0) goto L4a
            boolean r0 = r4.A09
            if (r0 == 0) goto L34
            int r3 = r5.A0L
            if (r3 <= 0) goto L33
            int r2 = r5.A0A
            if (r2 <= 0) goto L33
            float r0 = r5.A01
            double r0 = (double) r0
            boolean r1 = r4.A08(r3, r2, r0)
        L33:
            return r1
        L34:
            int r0 = r5.A0G
            r1 = -1
            if (r0 == r1) goto L3f
            boolean r0 = r4.A07(r0)
            if (r0 == 0) goto L4a
        L3f:
            int r0 = r5.A06
            if (r0 == r1) goto L49
            boolean r0 = r4.A06(r0)
            if (r0 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2IG.A09(X.4B6):boolean");
    }

    public final boolean A0A(C4B6 c4b6) {
        if (this.A09) {
            return this.A04;
        }
        Pair A00 = C46762Co.A00(c4b6);
        if (A00 != null && ((Number) A00.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.A03;
    }

    public C2IG(MediaCodecInfo.CodecCapabilities codecCapabilities, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        str.getClass();
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = codecCapabilities;
        this.A05 = z;
        this.A07 = z2;
        this.A04 = z3;
        this.A08 = z4;
        this.A06 = z5;
        this.A09 = C2IH.A06(str2);
    }

    public static boolean A02(MediaCodecInfo.VideoCapabilities videoCapabilities, double d, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    public static boolean A03(C4B6 c4b6, C2IG c2ig, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2;
        Pair A00 = C46762Co.A00(c4b6);
        if (A00 != null) {
            int intValue = ((Number) A00.first).intValue();
            int intValue2 = ((Number) A00.second).intValue();
            if ("video/dolby-vision".equals(c4b6.A0W)) {
                String str = c2ig.A02;
                if ("video/avc".equals(str)) {
                    intValue = 8;
                } else if ("video/hevc".equals(str)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (c2ig.A09 || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = c2ig.A00;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (codecProfileLevelArr.length > 0) {
                    if (codecCapabilities == null || (codecProfileLevelArr2 = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr2) {
                        if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                            if ("video/hevc".equals(c2ig.A02) && 2 == intValue) {
                                String str2 = Util.A01;
                                if (!"sailfish".equals(str2) && !"marlin".equals(str2)) {
                                }
                            }
                        }
                    }
                    A01(c2ig, AnonymousClass001.A0u("codec.profileLevel, ", c4b6.A0R, ", ", c2ig.A01));
                    return false;
                }
            }
        }
        return true;
    }
}

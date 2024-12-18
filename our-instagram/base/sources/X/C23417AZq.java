package X;

import android.media.CamcorderProfile;
import java.util.Arrays;

/* renamed from: X.AZq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23417AZq implements InterfaceC177537un {
    public int A00;
    public C23014ACo A01;
    public boolean A02;
    public final AAQ A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C23417AZq c23417AZq = (C23417AZq) obj;
            if (this.A02 != c23417AZq.A02 || !this.A01.equals(c23417AZq.A01) || this.A00 != c23417AZq.A00) {
                return false;
            }
        }
        return true;
    }

    private void A00(InterfaceC178337w7 interfaceC178337w7, AGu aGu, int i) {
        Boolean bool;
        this.A01 = new C23014ACo(new AAQ());
        boolean z = false;
        this.A00 = 1;
        if (aGu != null && (bool = aGu.A01) != null) {
            z = bool.booleanValue();
        }
        this.A02 = z;
        String ArT = interfaceC178337w7.ArT(1003);
        if (!ArT.isEmpty()) {
            this.A03.A06 = ArT;
        }
        if (i != -1) {
            this.A03.A02 = i;
        }
    }

    @Override // X.InterfaceC177537un
    public final EnumC176237sg CBK() {
        return EnumC176237sg.VIDEO;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, 0, Boolean.valueOf(this.A02), Integer.valueOf(this.A00)});
    }

    public C23417AZq(CamcorderProfile camcorderProfile, InterfaceC178337w7 interfaceC178337w7, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        AAQ aaq = new AAQ();
        this.A03 = aaq;
        A00(interfaceC178337w7, null, camcorderProfile.videoFrameRate);
        if (i != 90 && i != 270) {
            i6 = camcorderProfile.videoFrameWidth;
            i7 = camcorderProfile.videoFrameHeight;
        } else {
            i6 = camcorderProfile.videoFrameHeight;
            i7 = camcorderProfile.videoFrameWidth;
        }
        if (i2 != 0) {
            int i8 = i3;
            if ((i5 + i4) % 180 == 0) {
                i8 = i2;
                i2 = i3;
            }
            float f = i6;
            float f2 = i7;
            float f3 = i8 / i2;
            if (f / f2 > f3) {
                i6 = (int) (f2 * f3);
            } else {
                i7 = (int) (f / f3);
            }
        }
        aaq.A04 = i6 - (i6 % 16);
        aaq.A03 = i7 - (i7 % 16);
        this.A01 = new C23014ACo(aaq);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C23417AZq(android.media.CamcorderProfile r7, X.InterfaceC178337w7 r8, X.AGu r9, int r10, int r11, int r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        /*
            r6 = this;
            r6.<init>()
            X.AAQ r1 = new X.AAQ
            r1.<init>()
            r6.A03 = r1
            int r0 = r7.videoFrameRate
            r6.A00(r8, r9, r0)
            r0 = 90
            if (r10 == r0) goto Lb5
            r0 = 270(0x10e, float:3.78E-43)
            if (r10 == r0) goto Lb5
            int r5 = r7.videoFrameWidth
            int r4 = r7.videoFrameHeight
        L1b:
            r0 = 720(0x2d0, float:1.009E-42)
            if (r14 == 0) goto La0
            int r5 = java.lang.Math.min(r0, r5)
            r2 = 1071877689(0x3fe38e39, float:1.7777778)
            float r0 = (float) r5
            float r0 = r0 * r2
            int r4 = (int) r0
        L29:
            r0 = 137(0x89, float:1.92E-43)
            boolean r0 = r8.CUZ(r0)
            r3 = 16
            if (r0 == 0) goto L9d
            android.media.MediaCodecInfo$CodecCapabilities r2 = X.AbstractC176987tu.A00()
            if (r2 == 0) goto L47
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            if (r0 == 0) goto L47
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            int r3 = r0.getWidthAlignment()
        L47:
            android.media.MediaCodecInfo$CodecCapabilities r2 = X.AbstractC176987tu.A00()
            if (r2 == 0) goto L9d
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            if (r0 == 0) goto L9d
            android.media.MediaCodecInfo$VideoCapabilities r0 = r2.getVideoCapabilities()
            int r2 = r0.getHeightAlignment()
        L5b:
            int r0 = r5 % r3
            int r5 = r5 - r0
            int r0 = r4 % r2
            int r4 = r4 - r0
            r0 = 84
            boolean r3 = r8.CUZ(r0)
            r0 = 85
            boolean r2 = r8.CUZ(r0)
            r0 = 1
            if (r2 != 0) goto L71
            r0 = 0
        L71:
            r1.A04 = r5
            r1.A03 = r4
            r1.A07 = r3
            r1.A08 = r0
            r2 = 1
            r1.A09 = r2
            if (r13 == 0) goto L86
            int r0 = r7.videoBitRate
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A05 = r0
        L86:
            r1.A00 = r2
            r0 = 3
            r1.A01 = r0
            if (r16 == 0) goto L95
            r1.A09 = r2
            r0 = 6
            r1.A00 = r0
            r0 = 7
            r1.A01 = r0
        L95:
            X.ACo r0 = new X.ACo
            r0.<init>(r1)
            r6.A01 = r0
            return
        L9d:
            r2 = 16
            goto L5b
        La0:
            if (r15 == 0) goto Laa
            int r5 = java.lang.Math.min(r0, r5)
        La6:
            int r4 = r5 * r12
            int r4 = r4 / r11
            goto L29
        Laa:
            if (r11 <= 0) goto L29
            if (r12 <= 0) goto L29
            int r4 = r4 * r11
            int r4 = r4 / r12
            int r5 = java.lang.Math.min(r5, r4)
            goto La6
        Lb5:
            int r5 = r7.videoFrameHeight
            int r4 = r7.videoFrameWidth
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23417AZq.<init>(android.media.CamcorderProfile, X.7w7, X.AGu, int, int, int, boolean, boolean, boolean, boolean):void");
    }
}

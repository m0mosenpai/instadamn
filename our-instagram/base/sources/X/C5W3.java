package X;

/* renamed from: X.5W3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W3 {
    public final long A00;
    public final long A01;
    public final long A02;
    public final C122215gH A03;
    public final AbstractC119825bg A04;
    public final AbstractC119845bi A05;
    public final C122165gC A06;
    public final C122175gD A07;
    public final C5W5 A08;
    public final C114095Cv A09;
    public final C122185gE A0A;
    public final C122205gG A0B;
    public final C5W2 A0C;
    public final C122195gF A0D;
    public final String A0E;

    public final boolean A01(C5W3 c5w3) {
        if (this != c5w3) {
            long j = this.A01;
            long j2 = c5w3.A01;
            C118145Vy[] c118145VyArr = C118135Vx.A02;
            boolean z = false;
            if (j == j2) {
                z = true;
            }
            if (z && C14360o3.A0K(this.A08, c5w3.A08) && C14360o3.A0K(this.A06, c5w3.A06) && C14360o3.A0K(this.A07, c5w3.A07) && C14360o3.A0K(this.A05, c5w3.A05) && C14360o3.A0K(this.A0E, c5w3.A0E) && this.A02 == c5w3.A02 && C14360o3.A0K(this.A0A, c5w3.A0A) && C14360o3.A0K(this.A0D, c5w3.A0D) && C14360o3.A0K(this.A09, c5w3.A09)) {
                long j3 = this.A00;
                long j4 = c5w3.A00;
                long j5 = C1132359l.A01;
                if (j3 == j4) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5W3)) {
            return false;
        }
        C5W3 c5w3 = (C5W3) obj;
        return A01(c5w3) && A02(c5w3);
    }

    public final C5W3 A00(C5W3 c5w3) {
        if (c5w3 == null) {
            return this;
        }
        C5W2 c5w2 = c5w3.A0C;
        long ApK = c5w2.ApK();
        C6L5 AiZ = c5w2.AiZ();
        float AbP = c5w2.AbP();
        long j = c5w3.A01;
        C5W5 c5w5 = c5w3.A08;
        C122165gC c122165gC = c5w3.A06;
        C122175gD c122175gD = c5w3.A07;
        AbstractC119845bi abstractC119845bi = c5w3.A05;
        String str = c5w3.A0E;
        long j2 = c5w3.A02;
        C122185gE c122185gE = c5w3.A0A;
        C122195gF c122195gF = c5w3.A0D;
        C114095Cv c114095Cv = c5w3.A09;
        long j3 = c5w3.A00;
        return C5WT.A00(AiZ, c5w3.A03, c5w3.A04, this, abstractC119845bi, c122165gC, c122175gD, c5w5, c114095Cv, c122185gE, c5w3.A0B, c122195gF, str, AbP, ApK, j, j2, j3);
    }

    public final boolean A02(C5W3 c5w3) {
        if (!C14360o3.A0K(this.A0C, c5w3.A0C) || !C14360o3.A0K(this.A0B, c5w3.A0B) || !C14360o3.A0K(this.A03, c5w3.A03) || !C14360o3.A0K(this.A04, c5w3.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C5W2 c5w2 = this.A0C;
        long ApK = c5w2.ApK();
        long j = C1132359l.A01;
        int i12 = ((int) (ApK ^ (ApK >>> 32))) * 31;
        C6L5 AiZ = c5w2.AiZ();
        int i13 = 0;
        if (AiZ != null) {
            i = AiZ.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = (((i12 + i) * 31) + Float.floatToIntBits(c5w2.AbP())) * 31;
        long j2 = this.A01;
        C118145Vy[] c118145VyArr = C118135Vx.A02;
        int i14 = (floatToIntBits + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        C5W5 c5w5 = this.A08;
        if (c5w5 != null) {
            i2 = c5w5.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        C122165gC c122165gC = this.A06;
        if (c122165gC != null) {
            i3 = c122165gC.A00;
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        C122175gD c122175gD = this.A07;
        if (c122175gD != null) {
            i4 = c122175gD.A00;
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        AbstractC119845bi abstractC119845bi = this.A05;
        if (abstractC119845bi != null) {
            i5 = abstractC119845bi.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        String str = this.A0E;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        long j3 = this.A02;
        int i19 = (((i18 + i6) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        C122185gE c122185gE = this.A0A;
        if (c122185gE != null) {
            i7 = Float.floatToIntBits(c122185gE.A00);
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 31;
        C122195gF c122195gF = this.A0D;
        if (c122195gF != null) {
            i8 = c122195gF.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        C114095Cv c114095Cv = this.A09;
        if (c114095Cv != null) {
            i9 = c114095Cv.hashCode();
        } else {
            i9 = 0;
        }
        long j4 = this.A00;
        int i22 = (((i21 + i9) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        C122205gG c122205gG = this.A0B;
        if (c122205gG != null) {
            i10 = c122205gG.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        C122215gH c122215gH = this.A03;
        if (c122215gH != null) {
            i11 = c122215gH.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31 * 31;
        AbstractC119825bg abstractC119825bg = this.A04;
        if (abstractC119825bg != null) {
            i13 = abstractC119825bg.hashCode();
        }
        return i24 + i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpanStyle(color=");
        C5W2 c5w2 = this.A0C;
        sb.append((Object) C1132359l.A06(c5w2.ApK()));
        sb.append(", brush=");
        sb.append(c5w2.AiZ());
        sb.append(", alpha=");
        sb.append(c5w2.AbP());
        sb.append(", fontSize=");
        sb.append((Object) C118135Vx.A02(this.A01));
        sb.append(", fontWeight=");
        sb.append(this.A08);
        sb.append(", fontStyle=");
        sb.append(this.A06);
        sb.append(", fontSynthesis=");
        sb.append(this.A07);
        sb.append(", fontFamily=");
        sb.append(this.A05);
        sb.append(", fontFeatureSettings=");
        sb.append(this.A0E);
        sb.append(", letterSpacing=");
        sb.append((Object) C118135Vx.A02(this.A02));
        sb.append(", baselineShift=");
        sb.append(this.A0A);
        sb.append(", textGeometricTransform=");
        sb.append(this.A0D);
        sb.append(", localeList=");
        sb.append(this.A09);
        sb.append(", background=");
        sb.append((Object) C1132359l.A06(this.A00));
        sb.append(", textDecoration=");
        sb.append(this.A0B);
        sb.append(", shadow=");
        sb.append(this.A03);
        sb.append(", platformStyle=");
        sb.append((Object) null);
        sb.append(", drawStyle=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public C5W3(C122215gH c122215gH, AbstractC119825bg abstractC119825bg, AbstractC119845bi abstractC119845bi, C122165gC c122165gC, C122175gD c122175gD, C5W5 c5w5, C114095Cv c114095Cv, C122185gE c122185gE, C122205gG c122205gG, C5W2 c5w2, C122195gF c122195gF, String str, long j, long j2, long j3) {
        this.A0C = c5w2;
        this.A01 = j;
        this.A08 = c5w5;
        this.A06 = c122165gC;
        this.A07 = c122175gD;
        this.A05 = abstractC119845bi;
        this.A0E = str;
        this.A02 = j2;
        this.A0A = c122185gE;
        this.A0D = c122195gF;
        this.A09 = c114095Cv;
        this.A00 = j3;
        this.A0B = c122205gG;
        this.A03 = c122215gH;
        this.A04 = abstractC119825bg;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C5W3(X.AbstractC119845bi r21, X.C122165gC r22, X.C122175gD r23, X.C5W5 r24, X.C122205gG r25, int r26, long r27, long r29, long r31) {
        /*
            r20 = this;
            r4 = r21
            r6 = r23
            r5 = r22
            r7 = r24
            r16 = r31
            r14 = r29
            r2 = 0
            r10 = 0
            r1 = r26
            r0 = r26 & 1
            if (r0 == 0) goto L16
            long r27 = X.C1132359l.A08
        L16:
            r0 = r26 & 2
            if (r0 == 0) goto L1c
            long r14 = X.C118135Vx.A01
        L1c:
            r0 = r26 & 4
            if (r0 == 0) goto L21
            r7 = 0
        L21:
            r0 = r26 & 8
            if (r0 == 0) goto L26
            r5 = 0
        L26:
            r0 = r26 & 16
            if (r0 == 0) goto L2b
            r6 = 0
        L2b:
            r0 = r26 & 32
            if (r0 == 0) goto L30
            r4 = 0
        L30:
            r0 = r1 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L36
            long r16 = X.C118135Vx.A01
        L36:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L51
            long r18 = X.C1132359l.A08
        L3c:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 != 0) goto L42
            r10 = r25
        L42:
            X.5W2 r11 = X.C5W0.A00(r27)
            r1 = r20
            r3 = r2
            r8 = r2
            r9 = r2
            r12 = r2
            r13 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18)
            return
        L51:
            r18 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5W3.<init>(X.5bi, X.5gC, X.5gD, X.5W5, X.5gG, int, long, long, long):void");
    }
}

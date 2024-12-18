package X;

import java.util.Arrays;

/* renamed from: X.59q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1132859q extends AbstractC1132959r {
    public static final InterfaceC1133159t A0E = new InterfaceC1133159t() { // from class: X.59s
        @Override // X.InterfaceC1133159t
        public final double CP0(double d) {
            return d;
        }
    };
    public final float A00;
    public final float A01;
    public final InterfaceC1133159t A02;
    public final InterfaceC1133159t A03;
    public final InterfaceC1133159t A04;
    public final InterfaceC1133159t A05;
    public final C1132559n A06;
    public final C1132759p A07;
    public final InterfaceC16660sJ A08;
    public final InterfaceC16660sJ A09;
    public final boolean A0A;
    public final float[] A0B;
    public final float[] A0C;
    public final float[] A0D;

    @Override // X.AbstractC1132959r
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C1132859q c1132859q = (C1132859q) obj;
            if (Float.compare(c1132859q.A01, this.A01) != 0 || Float.compare(c1132859q.A00, this.A00) != 0 || !C14360o3.A0K(this.A07, c1132859q.A07) || !Arrays.equals(this.A0C, c1132859q.A0C)) {
                return false;
            }
            C1132559n c1132559n = this.A06;
            C1132559n c1132559n2 = c1132859q.A06;
            if (c1132559n != null) {
                return c1132559n.equals(c1132559n2);
            }
            if (c1132559n2 != null) {
                if (!C14360o3.A0K(this.A05, c1132859q.A05)) {
                    return false;
                }
                return C14360o3.A0K(this.A03, c1132859q.A03);
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01a9, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1132859q(X.InterfaceC1133159t r35, X.InterfaceC1133159t r36, X.C1132559n r37, X.C1132759p r38, java.lang.String r39, float[] r40, float[] r41, float r42, float r43, int r44) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1132859q.<init>(X.59t, X.59t, X.59n, X.59p, java.lang.String, float[], float[], float, float, int):void");
    }

    @Override // X.AbstractC1132959r
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = ((((super.hashCode() * 31) + this.A07.hashCode()) * 31) + Arrays.hashCode(this.A0C)) * 31;
        float f = this.A01;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        C1132559n c1132559n = this.A06;
        if (c1132559n != null) {
            i = c1132559n.hashCode();
        }
        int i4 = i3 + i;
        if (c1132559n == null) {
            return (((i4 * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode();
        }
        return i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1132859q(X.C1132759p r20, java.lang.String r21, float[] r22, final double r23, float r25, float r26, int r27) {
        /*
            r19 = this;
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = r23
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 != 0) goto L34
            X.59t r1 = X.C1132859q.A0E
        La:
            int r0 = (r23 > r11 ? 1 : (r23 == r11 ? 0 : -1))
            if (r0 != 0) goto L2e
            X.59t r2 = X.C1132859q.A0E
        L10:
            r7 = 0
            r13 = 0
            X.59n r3 = new X.59n
            r8 = r3
            r15 = r13
            r17 = r13
            r8.<init>(r9, r11, r13, r15, r17)
            r0 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r25
            r9 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L2e:
            X.5A4 r2 = new X.5A4
            r2.<init>()
            goto L10
        L34:
            X.5A3 r1 = new X.5A3
            r1.<init>()
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1132859q.<init>(X.59p, java.lang.String, float[], double, float, float, int):void");
    }

    public C1132859q(final C1132559n c1132559n, C1132759p c1132759p, String str, float[] fArr, int i) {
        this(new InterfaceC1133159t() { // from class: X.59u
            @Override // X.InterfaceC1133159t
            public final double CP0(double d) {
                C1132559n c1132559n2 = C1132559n.this;
                double d2 = c1132559n2.A00;
                double d3 = c1132559n2.A01;
                double d4 = c1132559n2.A02;
                double d5 = c1132559n2.A03;
                double d6 = c1132559n2.A04;
                if (d >= d5 * d4) {
                    return (Math.pow(d, 1.0d / d6) - d3) / d2;
                }
                return d / d4;
            }
        }, new InterfaceC1133159t() { // from class: X.59v
            @Override // X.InterfaceC1133159t
            public final double CP0(double d) {
                C1132559n c1132559n2 = C1132559n.this;
                double d2 = c1132559n2.A00;
                double d3 = c1132559n2.A01;
                double d4 = c1132559n2.A02;
                double d5 = c1132559n2.A03;
                double d6 = c1132559n2.A04;
                if (d >= d5) {
                    return Math.pow((d2 * d) + d3, d6);
                }
                return d * d4;
            }
        }, c1132559n, c1132759p, str, fArr, null, 0.0f, 1.0f, i);
    }
}

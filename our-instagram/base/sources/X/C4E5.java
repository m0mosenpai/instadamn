package X;

/* renamed from: X.4E5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4E5 extends C0T6 {
    public boolean A00;
    public final C4E6 A01;
    public final C4E7 A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r5 != X.C05F.A00) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r6 != X.C05F.A00) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C4E5(X.C4E6 r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, int r8, boolean r9, boolean r10, boolean r11) {
        /*
            r3 = this;
            r2 = 0
            r0 = r8 & 4
            if (r0 == 0) goto L7
            java.lang.Integer r5 = X.C05F.A00
        L7:
            r0 = r8 & 8
            if (r0 == 0) goto Ld
            java.lang.Integer r6 = X.C05F.A01
        Ld:
            r0 = r8 & 16
            if (r0 == 0) goto L17
            r0 = 0
            X.4E6 r4 = new X.4E6
            r4.<init>(r0)
        L17:
            r0 = r8 & 32
            if (r0 == 0) goto L20
            X.4E7 r2 = new X.4E7
            r2.<init>()
        L20:
            r0 = r8 & 64
            if (r0 == 0) goto L26
            java.lang.Integer r7 = X.C05F.A00
        L26:
            r0 = r8 & 128(0x80, float:1.8E-43)
            r1 = 0
            if (r0 == 0) goto L2c
            r1 = 1
        L2c:
            r0 = r8 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L31
            r11 = 0
        L31:
            r0 = 3
            X.C14360o3.A0B(r5, r0)
            r0 = 4
            X.C14360o3.A0B(r6, r0)
            r0 = 5
            X.C14360o3.A0B(r4, r0)
            r0 = 6
            X.C14360o3.A0B(r2, r0)
            r0 = 7
            X.C14360o3.A0B(r7, r0)
            r3.<init>()
            r3.A07 = r9
            r3.A08 = r10
            r3.A04 = r5
            r3.A05 = r6
            r3.A01 = r4
            r3.A02 = r2
            r3.A03 = r7
            r3.A00 = r1
            r3.A06 = r11
            r2 = 1
            if (r9 == 0) goto L62
            java.lang.Integer r1 = X.C05F.A00
            r0 = 1
            if (r5 == r1) goto L63
        L62:
            r0 = 0
        L63:
            r3.A09 = r0
            if (r10 == 0) goto L6c
            java.lang.Integer r1 = X.C05F.A00
            r0 = 1
            if (r6 == r1) goto L6d
        L6c:
            r0 = 0
        L6d:
            r3.A0A = r0
            if (r10 == 0) goto L78
            java.lang.Integer r0 = X.C05F.A01
            if (r6 != r0) goto L78
        L75:
            r3.A0B = r2
            return
        L78:
            r2 = 0
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E5.<init>(X.4E6, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, boolean, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4E5) {
                C4E5 c4e5 = (C4E5) obj;
                if (this.A07 != c4e5.A07 || this.A08 != c4e5.A08 || this.A04 != c4e5.A04 || this.A05 != c4e5.A05 || !C14360o3.A0K(this.A01, c4e5.A01) || !C14360o3.A0K(this.A02, c4e5.A02) || this.A03 != c4e5.A03 || this.A00 != c4e5.A00 || this.A06 != c4e5.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int intValue = this.A04.intValue();
        if (1 != intValue) {
            str = "ViewPoint";
        } else {
            str = "Vista";
        }
        int hashCode = (i4 + str.hashCode() + intValue) * 31;
        int intValue2 = this.A05.intValue();
        if (1 != intValue2) {
            str2 = "ViewPoint";
        } else {
            str2 = "Vista";
        }
        int hashCode2 = (((((hashCode + str2.hashCode() + intValue2) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        int intValue3 = this.A03.intValue();
        if (1 != intValue3) {
            str3 = AbstractC43591JPw.A00(260);
        } else {
            str3 = "VPV";
        }
        int hashCode3 = (hashCode2 + str3.hashCode() + intValue3) * 31;
        int i5 = 1237;
        if (this.A00) {
            i5 = 1231;
        }
        int i6 = (hashCode3 + i5) * 31;
        int i7 = 1237;
        if (this.A06) {
            i7 = 1231;
        }
        return i6 + i7;
    }
}

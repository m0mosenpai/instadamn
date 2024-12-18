package X;

/* renamed from: X.Xpe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72868Xpe {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r1.equals(r0) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L86
            r2 = 0
            if (r5 == 0) goto L50
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L50
            X.Xpe r5 = (X.C72868Xpe) r5
            boolean r1 = r4.A0A
            boolean r0 = r5.A0A
            if (r1 != r0) goto L50
            boolean r1 = r4.A0B
            boolean r0 = r5.A0B
            if (r1 != r0) goto L50
            boolean r1 = r4.A08
            boolean r0 = r5.A08
            if (r1 != r0) goto L50
            boolean r1 = r4.A09
            boolean r0 = r5.A09
            if (r1 != r0) goto L50
            boolean r1 = r4.A07
            boolean r0 = r5.A07
            if (r1 != r0) goto L50
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r5.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 == 0) goto L51
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L54
        L50:
            return r2
        L51:
            if (r0 == 0) goto L54
            return r2
        L54:
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 == 0) goto L61
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L64
            return r2
        L61:
            if (r0 == 0) goto L64
            return r2
        L64:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 == 0) goto L71
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L74
            return r2
        L71:
            if (r0 == 0) goto L74
            return r2
        L74:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            if (r1 == 0) goto L81
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L87
            return r2
        L81:
            if (r0 == 0) goto L87
            return r2
        L84:
            if (r0 != 0) goto L93
        L86:
            return r3
        L87:
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L84
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
        L93:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72868Xpe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A0K = (((((((((((((((((AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A03)) + AbstractC31177DnL.A04(this.A00)) * 31) + (this.A0A ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + AbstractC31177DnL.A04(this.A02)) * 31) + AbstractC31177DnL.A04(this.A01)) * 31) + AbstractC31177DnL.A04(this.A05)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return A0K + i;
    }

    public final String toString() {
        return AnonymousClass001.A11("{name=", this.A03, ";sqlType=", this.A06, "}");
    }

    public C72868Xpe(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = str;
        this.A06 = str2;
        this.A00 = str3;
        this.A0A = z;
        this.A0B = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A07 = z5;
        this.A02 = str4;
        this.A01 = str5;
        this.A05 = str6;
        this.A04 = str7;
    }
}

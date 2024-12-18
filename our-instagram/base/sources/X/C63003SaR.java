package X;

/* renamed from: X.SaR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63003SaR {
    public static final C62623SJg A07 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        int i;
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C63003SaR) {
            C63003SaR c63003SaR = (C63003SaR) obj;
            if (this.A02 == c63003SaR.A02 && C14360o3.A0K(this.A04, c63003SaR.A04) && this.A06 == c63003SaR.A06 && ((i = this.A01) != 1 || c63003SaR.A01 != 2 || (str2 = this.A03) == null || A07.A00(str2, c63003SaR.A03))) {
                if (i == 2 && c63003SaR.A01 == 1 && (str = c63003SaR.A03) != null && !A07.A00(str, this.A03)) {
                    return false;
                }
                if (i == c63003SaR.A01) {
                    String str3 = this.A03;
                    if (str3 != null) {
                        if (!A07.A00(str3, c63003SaR.A03)) {
                            return false;
                        }
                    } else if (c63003SaR.A03 != null) {
                        return false;
                    }
                }
                return this.A00 == c63003SaR.A00;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0J(this.A04) + this.A00) * 31) + AbstractC58322PtE.A02(this.A06 ? 1 : 0)) * 31) + this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (X.AbstractC001900j.A0a(r2, "DOUB", false) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63003SaR(java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, int r9, boolean r10) {
        /*
            r4 = this;
            r4.<init>()
            r4.A04 = r5
            r4.A05 = r6
            r4.A06 = r10
            r4.A02 = r8
            r4.A03 = r7
            r4.A01 = r9
            r3 = 5
            java.util.Locale r0 = java.util.Locale.US
            X.C14360o3.A08(r0)
            java.lang.String r2 = X.AbstractC166997dE.A10(r0, r6)
            java.lang.String r0 = "INT"
            r1 = 0
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            if (r0 == 0) goto L26
            r3 = 3
        L23:
            r4.A00 = r3
            return
        L26:
            java.lang.String r0 = "CHAR"
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            if (r0 != 0) goto L61
            java.lang.String r0 = "CLOB"
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            if (r0 != 0) goto L61
            java.lang.String r0 = "TEXT"
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            if (r0 != 0) goto L61
            java.lang.String r0 = "BLOB"
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "REAL"
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "FLOA"
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "DOUB"
            boolean r0 = X.AbstractC001900j.A0a(r2, r0, r1)
            r3 = 1
            if (r0 == 0) goto L23
        L5f:
            r3 = 4
            goto L23
        L61:
            r3 = 2
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63003SaR.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Column{name='");
        A1C.append(this.A04);
        A1C.append("', type='");
        A1C.append(this.A05);
        A1C.append("', affinity='");
        A1C.append(this.A00);
        A1C.append("', notNull=");
        A1C.append(this.A06);
        A1C.append(", primaryKeyPosition=");
        A1C.append(this.A02);
        A1C.append(", defaultValue='");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        A1C.append(str);
        return AbstractC166997dE.A0x("'}", A1C);
    }
}

package X;

/* renamed from: X.CcR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28221CcR {
    public static final C28221CcR A03 = new C28221CcR("");
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if ("".length() != 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C28221CcR(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            r4.<init>()
            r4.A00 = r5
            int r0 = r5.length()
            r2 = 1
            if (r0 != 0) goto L15
            int r1 = r3.length()
            r0 = 1
            if (r1 == 0) goto L16
        L15:
            r0 = 0
        L16:
            r4.A02 = r0
            boolean r0 = X.CLW.A00(r5)
            if (r0 != 0) goto L25
            boolean r0 = X.CLW.A00(r3)
            if (r0 != 0) goto L25
            r2 = 0
        L25:
            r4.A01 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28221CcR.<init>(java.lang.String):void");
    }

    public final void A00(StringBuilder sb, String str) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append(this.A00);
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        AbstractC25235BEs.A1M(sb, "removeLeadingZeros = ");
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NumberHexFormat(");
        A1C.append('\n');
        A00(A1C, "    ");
        A1C.append('\n');
        String A0x = AbstractC166997dE.A0x(")", A1C);
        C14360o3.A07(A0x);
        return A0x;
    }
}

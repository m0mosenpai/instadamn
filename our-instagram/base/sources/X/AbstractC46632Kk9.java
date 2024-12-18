package X;

/* renamed from: X.Kk9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46632Kk9 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bb, code lost:
    
        if (X.AbstractC43592JPx.A04(r0.A01.group()) > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r9 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C132275y6 A00(X.InterfaceC43520JKg r12, com.instagram.common.session.UserSession r13, java.lang.String r14) {
        /*
            r5 = 0
            java.util.List r0 = r12.B2G()
            r11 = 0
            if (r0 == 0) goto Lbe
            java.lang.Object r3 = X.AbstractC001800i.A0J(r0)
            X.JLA r3 = (X.JLA) r3
            if (r3 == 0) goto Lbe
            X.JLd r0 = r3.B2I()
            java.lang.String r10 = r0.Ayb()
            X.C14360o3.A0B(r10, r5)
            X.6Gk r4 = X.AbstractC136556Gj.A00(r13)
            boolean r0 = r4.A01()
            if (r0 == 0) goto L82
            com.instagram.common.session.UserSession r8 = r4.A05
            X.0Tz r7 = X.C06090Tz.A05
            r0 = 36885475490857591(0x830b2500010277, double:3.389861454082069E-306)
            java.lang.String r2 = X.C18U.A04(r7, r8, r0)
            boolean r0 = r4.A01()
            r9 = 0
            if (r0 == 0) goto L82
            X.11L r0 = r4.A02
            if (r0 != 0) goto Lab
            r0 = 36889740393317228(0x830f060000036c, double:3.392558595570927E-306)
            java.lang.String r0 = X.C18U.A04(r7, r8, r0)     // Catch: java.lang.Exception -> L7f
            byte[] r1 = android.util.Base64.decode(r0, r5)     // Catch: java.lang.Exception -> L7f
            X.C14360o3.A07(r1)     // Catch: java.lang.Exception -> L7f
            java.nio.charset.Charset r0 = X.C15W.A05     // Catch: java.lang.Exception -> L7f
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L7f
            r6.<init>(r1, r0)     // Catch: java.lang.Exception -> L7f
            r0 = 36889740393382765(0x830f060001036d, double:3.392558595612373E-306)
            java.lang.String r1 = X.C18U.A04(r7, r8, r0)
            java.lang.String r0 = X.AbstractC167007dF.A0h(r6)
            java.util.List r1 = X.AbstractC167007dF.A0m(r0, r1, r5)
            X.C14360o3.A0B(r1, r5)
            X.XOb r0 = X.C2BS.A01()
            java.util.List r1 = X.AbstractC001800i.A0g(r1, r0)
            java.lang.String r0 = "|"
            java.lang.String r1 = X.AbstractC25226BEj.A1H(r0, r1, r11)
            X.Kel r0 = X.EnumC46315Kel.A05
            X.11L r9 = new X.11L
            r9.<init>(r1, r0)
            r4.A02 = r9
        L7f:
            r0 = r9
            if (r9 != 0) goto Lab
        L82:
            r2 = r11
        L83:
            X.JLd r0 = r3.B2I()
            java.lang.String r9 = r0.getId()
            int r12 = r3.getOffset()
            java.lang.Integer r0 = r3.BN2()
            if (r0 == 0) goto La6
            int r13 = r0.intValue()
        L99:
            boolean r0 = X.C14360o3.A0K(r14, r2)
            if (r0 == 0) goto La0
            r11 = r14
        La0:
            X.5y6 r8 = new X.5y6
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        La6:
            int r13 = r10.length()
            goto L99
        Lab:
            X.5Sq r0 = r0.A05(r10)
            if (r0 == 0) goto L82
            java.util.regex.Matcher r0 = r0.A01
            java.lang.String r0 = r0.group()
            int r0 = X.AbstractC43592JPx.A04(r0)
            if (r0 > 0) goto L83
            goto L82
        Lbe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC46632Kk9.A00(X.JKg, com.instagram.common.session.UserSession, java.lang.String):X.5y6");
    }
}

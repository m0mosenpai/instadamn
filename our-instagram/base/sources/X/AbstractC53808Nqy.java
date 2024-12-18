package X;

/* renamed from: X.Nqy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53808Nqy {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        if (r3.length() == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r2.length() == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List A00(X.C6FQ r8, X.C6FW r9) {
        /*
            r0 = 0
            java.lang.String r1 = ""
            java.util.List r7 = X.AbstractC166987dD.A1J(r1)
            java.lang.String r6 = X.AbstractC31177DnL.A0e(r9, r0)
            X.C6BQ.A0B(r8)
            java.util.HashMap r5 = X.AbstractC166987dD.A1G()
            X.AbstractC54289Nz9.A00(r5)
            int r0 = r6.length()
            if (r0 == 0) goto L6a
            java.util.List r7 = X.AbstractC166987dD.A1J(r1)
            X.AbstractC54289Nz9.A00(r5)     // Catch: java.io.IOException -> L23
            goto L36
        L23:
            r4 = move-exception
            X.0wb r3 = X.C18950wb.A01
            r2 = 817898180(0x30c022c4, float:1.397972E-9)
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "error fetching live chat nonce: "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r4, r0, r1)
            X.AbstractC166987dD.A1T(r3, r0, r2)
        L36:
            java.lang.Object r0 = r5.get(r6)
            com.instagram.wellbeing.livechat.LiveChatNonce r0 = (com.instagram.wellbeing.livechat.LiveChatNonce) r0
            r2 = 0
            if (r0 == 0) goto L68
            java.lang.String r3 = r0.A00
        L41:
            java.lang.Object r0 = r5.get(r6)
            com.instagram.wellbeing.livechat.LiveChatNonce r0 = (com.instagram.wellbeing.livechat.LiveChatNonce) r0
            if (r0 == 0) goto L4b
            java.lang.String r2 = r0.A01
        L4b:
            if (r3 == 0) goto L54
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L55
        L54:
            r0 = 1
        L55:
            if (r0 != 0) goto L6a
            if (r2 == 0) goto L60
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L61
        L60:
            r0 = 1
        L61:
            if (r0 != 0) goto L6a
            java.util.List r7 = X.AbstractC43592JPx.A13(r3, r2)
            return r7
        L68:
            r3 = r2
            goto L41
        L6a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC53808Nqy.A00(X.6FQ, X.6FW):java.util.List");
    }
}

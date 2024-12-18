package X;

/* renamed from: X.Rrh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61667Rrh {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if ((r2 % 10) == 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.HashMap A00(X.C6FW r7) {
        /*
            java.lang.Object r2 = X.MSY.A0a(r7)
            java.lang.String r2 = (java.lang.String) r2
            X.Rgo r1 = X.SV9.A00(r2)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardType"
            X.C14360o3.A0C(r1, r0)
            java.util.HashMap r6 = X.AbstractC166987dD.A1G()
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "cardType"
            r6.put(r0, r1)
            r7 = 1
            if (r2 == 0) goto L5f
            int r0 = r2.length()
            if (r0 == 0) goto L5f
            java.lang.String r0 = "[^\\d+]"
            X.11L r1 = new X.11L
            r1.<init>(r0)
            java.lang.String r0 = ""
            java.lang.String r5 = r1.A00(r2, r0)
            X.Rgo r1 = X.SV9.A00(r2)
            X.Rgo r0 = X.EnumC61188Rgo.A0A
            if (r1 == r0) goto L5f
            int r4 = r5.length()
            int r0 = r1.A00
            if (r4 != r0) goto L5f
            r3 = 0
            r2 = 0
        L42:
            if (r3 >= r4) goto L61
            int r0 = r4 + (-1)
            int r0 = r0 - r3
            char r0 = r5.charAt(r0)
            int r1 = r0 + (-48)
            int r0 = r3 % 2
            if (r0 == 0) goto L5b
            int r1 = r1 * 2
            r0 = 9
            if (r1 <= r0) goto L5b
            int r0 = r1 + (-10)
            int r1 = r0 + 1
        L5b:
            int r2 = r2 + r1
            int r3 = r3 + 1
            goto L42
        L5f:
            r7 = 0
            goto L65
        L61:
            int r0 = r2 % 10
            if (r0 != 0) goto L5f
        L65:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "isValid"
            r6.put(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61667Rrh.A00(X.6FW):java.util.HashMap");
    }
}

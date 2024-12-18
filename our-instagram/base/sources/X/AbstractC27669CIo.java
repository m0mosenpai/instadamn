package X;

/* renamed from: X.CIo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27669CIo {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r6.length() == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C27928CSn r4, com.instagram.user.model.User r5, java.lang.String r6) {
        /*
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r1 = 1
            android.widget.TextView r3 = r4.A02
            boolean r0 = r3 instanceof com.instagram.common.ui.text.TightTextView
            if (r0 == 0) goto L10
            r0 = r3
            com.instagram.common.ui.text.TightTextView r0 = (com.instagram.common.ui.text.TightTextView) r0
            r0.A00 = r1
        L10:
            if (r6 == 0) goto L19
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L1a
        L19:
            r0 = 1
        L1a:
            r2 = 2
            android.widget.TextView r1 = r4.A03
            if (r0 == 0) goto L46
            java.lang.String r0 = r5.getUsername()
            r1.setText(r0)
            X.17P r0 = r5.A03
            java.lang.String r6 = r0.Bhb()
            if (r6 == 0) goto L34
            int r0 = r6.length()
            if (r0 != 0) goto L59
        L34:
            r3.setSingleLine()
            java.lang.String r0 = r5.getFullName()
            r3.setText(r0)
        L3e:
            boolean r0 = r5.isVerified()
            X.C85963sQ.A0B(r1, r0)
            return
        L46:
            java.lang.String r0 = r5.getFullName()
            if (r0 == 0) goto L60
            int r0 = r0.length()
            if (r0 == 0) goto L60
            java.lang.String r0 = r5.getFullName()
        L56:
            r1.setText(r0)
        L59:
            r3.setLines(r2)
            r3.setText(r6)
            goto L3e
        L60:
            java.lang.String r0 = r5.getUsername()
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC27669CIo.A00(X.CSn, com.instagram.user.model.User, java.lang.String):void");
    }
}

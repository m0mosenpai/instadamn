package X;

/* loaded from: classes10.dex */
public final class SMJ {
    public String A00;
    public java.util.Set A01;
    public final C63335Shm A02;
    public volatile Boolean A03;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r0.equals(r5) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Set A00() {
        /*
            r6 = this;
            X.Sdj r0 = X.SVM.A00
            java.lang.Object r5 = r0.A00
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r4 = r6.A01
            if (r4 == 0) goto L14
            java.lang.String r0 = r6.A00
            if (r0 == 0) goto L14
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L32
        L14:
            java.lang.String r0 = ","
            java.lang.String[] r3 = android.text.TextUtils.split(r5, r0)
            java.util.HashSet r4 = X.AbstractC166987dD.A1H()
            int r2 = r3.length
            r1 = 0
        L20:
            if (r1 >= r2) goto L2e
            r0 = r3[r1]
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L2b
            X.AbstractC166997dE.A1W(r4, r0)     // Catch: java.lang.NumberFormatException -> L2b
        L2b:
            int r1 = r1 + 1
            goto L20
        L2e:
            r6.A00 = r5
            r6.A01 = r4
        L32:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SMJ.A00():java.util.Set");
    }

    public SMJ(C63335Shm c63335Shm) {
        this.A02 = c63335Shm;
    }
}

package X;

/* loaded from: classes9.dex */
public final class N21 extends Rk3 {
    public final Throwable A00;

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.A00;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public N21(int r7, java.lang.Throwable r8) {
        /*
            r6 = this;
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            java.util.Map r2 = X.AbstractC54366O0y.A00
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L3d
            java.util.Map r1 = X.AbstractC54366O0y.A01
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L3d
            java.lang.String r3 = X.AbstractC166987dD.A1A(r4, r2)
            java.lang.String r2 = X.AbstractC166987dD.A1A(r4, r1)
            java.lang.String r1 = " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#"
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass001.A0u(r3, r1, r2, r0)
        L26:
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r0}
            java.lang.String r0 = "Integrity API error (%d): %s."
            java.lang.String r1 = java.lang.String.format(r5, r0, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r7, r1)
            r6.<init>(r0)
            if (r7 == 0) goto L40
            r6.A00 = r8
            return
        L3d:
            java.lang.String r0 = ""
            goto L26
        L40:
            java.lang.String r0 = "ErrorCode should not be 0."
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N21.<init>(int, java.lang.Throwable):void");
    }
}

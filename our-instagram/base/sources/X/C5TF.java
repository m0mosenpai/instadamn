package X;

/* renamed from: X.5TF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TF {
    public final int A00;
    public final int A01;
    public final C4B6 A02;
    public final C4B6 A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5TF c5tf = (C5TF) obj;
            if (this.A01 != c5tf.A01 || this.A00 != c5tf.A00 || !this.A04.equals(c5tf.A04) || !this.A03.equals(c5tf.A03) || !this.A02.equals(c5tf.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((527 + this.A01) * 31) + this.A00) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0006, code lost:
    
        if (r6 == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5TF(X.C4B6 r2, X.C4B6 r3, java.lang.String r4, int r5, int r6) {
        /*
            r1 = this;
            r1.<init>()
            if (r5 == 0) goto L8
            r0 = 0
            if (r6 != 0) goto L9
        L8:
            r0 = 1
        L9:
            X.C4B8.A03(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L20
            r1.A04 = r4
            r2.getClass()
            r1.A03 = r2
            r1.A02 = r3
            r1.A01 = r5
            r1.A00 = r6
            return
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5TF.<init>(X.4B6, X.4B6, java.lang.String, int, int):void");
    }
}

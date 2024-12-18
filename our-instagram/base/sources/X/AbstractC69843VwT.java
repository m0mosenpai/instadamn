package X;

/* renamed from: X.VwT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69843VwT {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (X.C14360o3.A0K(r4.A02, r5.A02) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.C63406Sjd r4, X.C63406Sjd r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L25
            if (r4 == 0) goto L27
            boolean r0 = r4.equals(r5)
            if (r0 != 0) goto L25
            X.VCd r2 = r4.A00
            X.VCd r0 = r5.A00
            if (r2 != r0) goto L28
            java.lang.Object r1 = r4.A01
            java.lang.Object r0 = r5.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L28
            java.lang.Throwable r1 = r4.A02
            java.lang.Throwable r0 = r5.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L28
        L25:
            r3 = 1
        L26:
            return r3
        L27:
            r2 = 0
        L28:
            X.VCd r0 = X.EnumC68120VCd.LOADING
            if (r2 != r0) goto L26
            X.VCd r1 = r4.A00
            X.VCd r0 = r5.A00
            if (r1 != r0) goto L26
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC69843VwT.A01(X.Sjd, X.Sjd):boolean");
    }

    public static final C63406Sjd A00(C63406Sjd c63406Sjd, int i) {
        if (C63406Sjd.A0G(c63406Sjd) && (c63406Sjd.A02 instanceof X1p)) {
            C63406Sjd A05 = C63406Sjd.A05(c63406Sjd.A01, new X1p(VEP.A0A, i));
            C14360o3.A0A(A05);
            return A05;
        }
        return c63406Sjd;
    }
}

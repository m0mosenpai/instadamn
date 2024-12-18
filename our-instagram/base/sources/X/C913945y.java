package X;

import java.io.Serializable;

/* renamed from: X.45y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C913945y implements Serializable {
    public AnonymousClass165 A00;
    public final String A01;
    public final String A02;
    public static final C913945y A04 = new C913945y("", null);
    public static final C913945y A03 = new C913945y(new String(""), null);

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L31
            r2 = 0
            if (r5 == 0) goto L1a
            java.lang.Class r1 = r5.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L1a
            X.45y r5 = (X.C913945y) r5
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L1b
            if (r0 == 0) goto L22
        L1a:
            return r2
        L1b:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = r5.A01
            if (r1 != 0) goto L2c
            if (r0 == 0) goto L31
            r3 = 0
            return r3
        L2c:
            boolean r2 = r1.equals(r0)
            return r2
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C913945y.equals(java.lang.Object):boolean");
    }

    public static C913945y A00(String str) {
        if (str != null && !str.isEmpty()) {
            return new C913945y(C16U.A01.A00(str), null);
        }
        return A04;
    }

    public static C913945y A01(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.isEmpty()) {
            return A04;
        }
        return new C913945y(C16U.A01.A00(str), str2);
    }

    public final boolean A02() {
        if (this.A01 == null && this.A02.isEmpty()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.A01;
        if (str == null) {
            return this.A02.hashCode();
        }
        return str.hashCode() ^ this.A02.hashCode();
    }

    public final String toString() {
        String str = this.A01;
        if (str == null) {
            return this.A02;
        }
        return AnonymousClass001.A0u("{", str, "}", this.A02);
    }

    public C913945y(String str, String str2) {
        AnonymousClass460[] anonymousClass460Arr = C914045z.A01;
        this.A02 = str == null ? "" : str;
        this.A01 = str2;
    }
}

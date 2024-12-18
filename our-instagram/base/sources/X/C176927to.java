package X;

import android.os.Build;

/* renamed from: X.7to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176927to {
    public static C176927to A03 = new C176927to(Build.MANUFACTURER, Build.MODEL);
    public static C176927to A04 = new C176927to(Build.PRODUCT);
    public final String A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r6.A01.isEmpty() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C176927to
            r5 = 0
            if (r0 == 0) goto L40
            X.7to r7 = (X.C176927to) r7
            java.lang.String r4 = r6.A00
            boolean r0 = r4.isEmpty()
            r2 = 1
            if (r0 != 0) goto L19
            java.lang.String r0 = r6.A01
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L1a
        L19:
            r1 = 0
        L1a:
            java.lang.String r3 = r7.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L52
            java.lang.String r0 = r7.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L52
        L2a:
            if (r1 == 0) goto L41
            if (r2 == 0) goto L41
            r1 = 58
            java.lang.String r0 = r6.A01
            java.lang.String r2 = X.AnonymousClass001.A0T(r4, r0, r1)
            java.lang.String r0 = r7.A01
            java.lang.String r1 = X.AnonymousClass001.A0T(r3, r0, r1)
        L3c:
            boolean r5 = r2.equals(r1)
        L40:
            return r5
        L41:
            java.lang.String r2 = r6.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L40
            java.lang.String r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L40
            goto L3c
        L52:
            r2 = 0
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176927to.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str;
        String str2 = this.A00;
        if (!str2.isEmpty()) {
            String str3 = this.A01;
            if (!str3.isEmpty()) {
                str = AnonymousClass001.A0T(str2, str3, ':');
                return str.hashCode();
            }
        }
        str = this.A02;
        return str.hashCode();
    }

    public C176927to(String str) {
        this.A02 = str;
        this.A00 = "";
        this.A01 = "";
    }

    public C176927to(String str, String str2) {
        this.A02 = "";
        this.A00 = str;
        this.A01 = str2;
    }
}

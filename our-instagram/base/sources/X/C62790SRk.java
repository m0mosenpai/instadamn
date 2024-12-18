package X;

/* renamed from: X.SRk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62790SRk {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r10.equals("extend") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r9.equals("extend") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final double A00(java.lang.String r9, java.lang.String r10, double r11, double r13, double r15, double r17, double r19) {
        /*
            java.lang.String r7 = "clamp"
            java.lang.String r6 = "identity"
            java.lang.String r5 = "extend"
            r4 = 94742715(0x5a5a8bb, float:1.5578507E-35)
            r3 = -135761730(0xfffffffff7e870be, float:-9.428903E33)
            r2 = -1289044198(0xffffffffb32abf1a, float:-3.9755015E-8)
            java.lang.String r1 = "Invalid extrapolation type "
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 >= 0) goto L59
            if (r9 == 0) goto L81
            int r0 = r9.hashCode()
            if (r0 == r2) goto L53
            if (r0 == r3) goto L7a
            if (r0 != r4) goto L81
            boolean r0 = r9.equals(r7)
            if (r0 == 0) goto L81
            r8 = r13
        L28:
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 <= 0) goto L3f
            if (r10 == 0) goto L6e
            int r0 = r10.hashCode()
            if (r0 == r2) goto L4c
            if (r0 == r3) goto L67
            if (r0 != r4) goto L6e
            boolean r0 = r10.equals(r7)
            if (r0 == 0) goto L6e
            r8 = r15
        L3f:
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 == 0) goto L66
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L5b
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L66
            return r19
        L4c:
            boolean r0 = r10.equals(r5)
            if (r0 == 0) goto L6e
            goto L3f
        L53:
            boolean r0 = r9.equals(r5)
            if (r0 == 0) goto L81
        L59:
            r8 = r11
            goto L28
        L5b:
            double r19 = r19 - r17
            double r8 = r8 - r13
            double r19 = r19 * r8
            double r15 = r15 - r13
            double r19 = r19 / r15
            double r17 = r17 + r19
            return r17
        L66:
            return r17
        L67:
            boolean r0 = r10.equals(r6)
            if (r0 == 0) goto L6e
            return r8
        L6e:
            java.lang.String r0 = "for right extrapolation"
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r10, r0)
            X.R3A r0 = new X.R3A
            r0.<init>(r1)
            throw r0
        L7a:
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L81
            return r11
        L81:
            java.lang.String r0 = "for left extrapolation"
            java.lang.String r1 = X.AnonymousClass001.A0g(r1, r9, r0)
            X.R3A r0 = new X.R3A
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62790SRk.A00(java.lang.String, java.lang.String, double, double, double, double, double):double");
    }
}

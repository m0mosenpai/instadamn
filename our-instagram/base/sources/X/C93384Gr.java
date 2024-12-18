package X;

/* renamed from: X.4Gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C93384Gr {
    public C80993jT A00;
    public C80993jT A01;
    public final String A02;
    public final InterfaceC09390do A03;

    public C93384Gr(String str, InterfaceC09390do interfaceC09390do) {
        C14360o3.A0B(str, 1);
        this.A02 = str;
        this.A03 = interfaceC09390do;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (X.C93404Gt.A01.compare(r8.A0h(), r2) > 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C83403nh r8, X.C93384Gr r9, boolean r10) {
        /*
            boolean r0 = r8.A2P
            r7 = 1
            if (r0 == 0) goto L78
            java.lang.String r0 = r8.A0h()
            if (r0 == 0) goto L78
            if (r10 == 0) goto L33
            long r5 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r0
            long r3 = r8.C8i()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            r0 = 6
            long r0 = r2.toMicros(r0)
            long r5 = r5 - r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L33
            X.0do r0 = r9.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L78
        L33:
            java.lang.String r1 = r8.A1u
            java.lang.String r0 = r9.A02
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L79
            java.lang.String r0 = r8.A0h()
            if (r0 == 0) goto L78
            X.3jT r0 = r9.A01
            if (r0 == 0) goto L5c
            X.3kf r0 = r0.A02
            if (r0 == 0) goto L5c
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L5c
            java.util.Comparator r1 = X.C93404Gt.A01
            java.lang.String r0 = r8.A0h()
            int r0 = r1.compare(r0, r2)
            r3 = 1
            if (r0 <= 0) goto L5d
        L5c:
            r3 = 0
        L5d:
            X.3jT r0 = r9.A00
            if (r0 == 0) goto L78
            X.3kf r0 = r0.A02
            if (r0 == 0) goto L78
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L78
            java.util.Comparator r1 = X.C93404Gt.A01
            java.lang.String r0 = r8.A0h()
            int r0 = r1.compare(r0, r2)
            if (r0 > 0) goto L78
            if (r3 == 0) goto L78
        L77:
            r7 = 0
        L78:
            return r7
        L79:
            boolean r0 = r9.A01(r8)
            if (r0 != 0) goto L77
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93384Gr.A00(X.3nh, X.4Gr, boolean):boolean");
    }

    public final boolean A01(C83403nh c83403nh) {
        String str;
        String str2;
        if (C14360o3.A0K(c83403nh.A1u, this.A02)) {
            C80993jT c80993jT = this.A01;
            boolean z = c83403nh.A2P;
            if (c80993jT != null) {
                if (!z) {
                    str2 = ((AbstractC81003jU) c80993jT).A02;
                } else {
                    C81703kf c81703kf = c80993jT.A02;
                    if (c81703kf != null) {
                        str2 = c81703kf.A01;
                    } else {
                        return false;
                    }
                }
                if (str2 != null && c83403nh.A0h() != null) {
                    C80993jT c80993jT2 = this.A01;
                    boolean z2 = c83403nh.A2P;
                    if (c80993jT2 != null) {
                        if (!z2) {
                            str = ((AbstractC81003jU) c80993jT2).A02;
                        } else {
                            C81703kf c81703kf2 = c80993jT2.A02;
                            if (c81703kf2 != null) {
                                str = c81703kf2.A01;
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            C80993jT c80993jT3 = this.A00;
            boolean z3 = c83403nh.A2P;
            if (c80993jT3 != null) {
                if (!z3) {
                    str = ((AbstractC81003jU) c80993jT3).A02;
                } else {
                    C81703kf c81703kf3 = c80993jT3.A02;
                    if (c81703kf3 != null) {
                        str = c81703kf3.A01;
                    } else {
                        return false;
                    }
                }
                str2 = str;
            } else {
                return false;
            }
        }
        if (str != null && C93404Gt.A01.compare(c83403nh.A0h(), str2) <= 0) {
            return true;
        }
        return false;
    }
}

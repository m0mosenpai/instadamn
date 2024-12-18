package X;

/* renamed from: X.Chd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28485Chd {
    public static final boolean A05(C58Z c58z) {
        AbstractC137676Lo.A00(c58z, new C57514Pfo(c58z, 0));
        int A08 = AbstractC25229BEm.A08(c58z);
        if (A08 != 1 && A08 != 3) {
            return true;
        }
        C5EJ.A00(c58z).A01.A09(c58z, EnumC118935aA.Active);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:? A[LOOP:2: B:12:0x0027->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:6: B:62:0x00a8->B:89:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A06(X.C58Z r12, X.C58Z r13) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28485Chd.A06(X.58Z, X.58Z):boolean");
    }

    public static final Boolean A00(C58Z c58z, int i) {
        Boolean valueOf;
        C1129758g A00 = C5EJ.A00(c58z);
        C57514Pfo c57514Pfo = new C57514Pfo(c58z, 1);
        try {
            if (A00.A00) {
                C1129758g.A00(A00);
            }
            A00.A00 = true;
            A00.A02.A09(c57514Pfo);
            int intValue = A02(c58z, i).intValue();
            if (intValue != 0) {
                if (intValue != 2) {
                    if (intValue != 1 && intValue != 3) {
                        throw B4Z.A00();
                    }
                    valueOf = null;
                } else {
                    valueOf = true;
                }
            } else {
                valueOf = Boolean.valueOf(A04(c58z));
            }
            return valueOf;
        } finally {
            C1129758g.A01(A00);
        }
    }

    public static final Integer A01(C58Z c58z, int i) {
        int A08 = AbstractC25229BEm.A08(c58z);
        if (A08 != 0) {
            if (A08 != 2) {
                if (A08 != 1) {
                    if (A08 != 3) {
                        throw B4Z.A00();
                    }
                } else {
                    C58Z A01 = BJZ.A01(c58z);
                    if (A01 != null) {
                        Integer A012 = A01(A01, i);
                        Integer num = C05F.A00;
                        if (A012 == num) {
                            if (!c58z.A02) {
                                c58z.A02 = true;
                                try {
                                    C25338BJh c25338BJh = (C25338BJh) c58z.A0F().A09.invoke(new BJY(i));
                                    if (c25338BJh != C25338BJh.A02) {
                                        if (c25338BJh == C25338BJh.A01) {
                                            num = C05F.A01;
                                        } else if (c25338BJh.A02(C29968DJg.A00)) {
                                            num = C05F.A0C;
                                        } else {
                                            num = C05F.A0N;
                                        }
                                    }
                                } finally {
                                    c58z.A02 = false;
                                }
                            }
                            return num;
                        }
                        return A012;
                    }
                    throw AbstractC166987dD.A12("ActiveParent with no focused child");
                }
            } else {
                return C05F.A01;
            }
        }
        return C05F.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:? A[LOOP:2: B:19:0x0033->B:46:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A02(X.C58Z r13, int r14) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28485Chd.A02(X.58Z, int):java.lang.Integer");
    }

    public static final boolean A03(C58Z c58z) {
        C1129758g A00 = C5EJ.A00(c58z);
        try {
            if (A00.A00) {
                C1129758g.A00(A00);
            }
            A00.A00 = true;
            int A08 = AbstractC25229BEm.A08(c58z);
            boolean z = true;
            if (A08 != 0) {
                if (A08 != 2) {
                    if (A08 != 1 && A08 != 3) {
                        throw B4Z.A00();
                    }
                    z = false;
                } else {
                    C5EJ.A00(c58z).A01.A09(c58z, EnumC118935aA.Active);
                    AbstractC118955aC.A01(c58z);
                }
            }
            return z;
        } finally {
            C1129758g.A01(A00);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00bb, code lost:
    
        if (r0 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[LOOP:2: B:19:0x0033->B:46:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(X.C58Z r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28485Chd.A04(X.58Z):boolean");
    }

    public static final boolean A07(C58Z c58z, boolean z) {
        int A08 = AbstractC25229BEm.A08(c58z);
        if (A08 != 0) {
            if (A08 != 2) {
                if (A08 != 1) {
                    if (A08 != 3) {
                        throw B4Z.A00();
                    }
                    return true;
                }
                C58Z A01 = BJZ.A01(c58z);
                if (A01 != null && !A07(A01, z)) {
                    return false;
                }
            } else {
                if (z) {
                    C5EJ.A00(c58z).A01.A09(c58z, EnumC118935aA.Inactive);
                    AbstractC118955aC.A01(c58z);
                    return z;
                }
                return z;
            }
        }
        C5EJ.A00(c58z).A01.A09(c58z, EnumC118935aA.Inactive);
        AbstractC118955aC.A01(c58z);
        return true;
    }
}

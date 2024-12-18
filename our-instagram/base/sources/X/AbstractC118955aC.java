package X;

/* renamed from: X.5aC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118955aC {
    /* JADX WARN: Multi-variable type inference failed */
    public static final EnumC118935aA A00(C5DY c5dy) {
        C58J c58j = (C58J) c5dy;
        C58J c58j2 = c58j.A03;
        C57S c57s = null;
        while (c58j2 != null) {
            if (c58j2 instanceof C58Z) {
                EnumC118935aA A0G = ((C58Z) c58j2).A0G();
                int ordinal = A0G.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    return A0G;
                }
            } else if ((c58j2.A01 & 1024) != 0 && (c58j2 instanceof C5AY)) {
                int i = 0;
                for (C58J c58j3 = ((C5AY) c58j2).A00; c58j3 != null; c58j3 = c58j3.A02) {
                    if ((c58j3.A01 & 1024) != 0) {
                        i++;
                        if (i == 1) {
                            c58j2 = c58j3;
                        } else {
                            if (c57s == null) {
                                c57s = new C57S(new C58J[16]);
                            }
                            if (c58j2 != null) {
                                c57s.A09(c58j2);
                                c58j2 = null;
                            }
                            c57s.A09(c58j3);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            c58j2 = AbstractC114335Dx.A00(c57s);
        }
        C58J c58j4 = c58j.A03;
        if (c58j4.A08) {
            C57S c57s2 = new C57S(new C58J[16]);
            C58J c58j5 = c58j4.A02;
            if (c58j5 == null) {
                AbstractC114335Dx.A06(c57s2, c58j4);
            } else {
                c57s2.A09(c58j5);
            }
            while (true) {
                int i2 = c57s2.A00;
                if (i2 != 0) {
                    C58J c58j6 = (C58J) c57s2.A00(i2 - 1);
                    if ((c58j6.A00 & 1024) == 0) {
                        AbstractC114335Dx.A06(c57s2, c58j6);
                    } else {
                        while (true) {
                            if ((c58j6.A01 & 1024) != 0) {
                                C57S c57s3 = null;
                                do {
                                    if (c58j6 instanceof C58Z) {
                                        EnumC118935aA A0G2 = ((C58Z) c58j6).A0G();
                                        int ordinal2 = A0G2.ordinal();
                                        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                                            return A0G2;
                                        }
                                    } else if ((c58j6.A01 & 1024) != 0 && (c58j6 instanceof C5AY)) {
                                        int i3 = 0;
                                        for (C58J c58j7 = ((C5AY) c58j6).A00; c58j7 != null; c58j7 = c58j7.A02) {
                                            if ((c58j7.A01 & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    c58j6 = c58j7;
                                                } else {
                                                    if (c57s3 == null) {
                                                        c57s3 = new C57S(new C58J[16]);
                                                    }
                                                    if (c58j6 != null) {
                                                        c57s3.A09(c58j6);
                                                        c58j6 = null;
                                                    }
                                                    c57s3.A09(c58j7);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    c58j6 = AbstractC114335Dx.A00(c57s3);
                                } while (c58j6 != null);
                            } else {
                                c58j6 = c58j6.A02;
                                if (c58j6 != null) {
                                }
                            }
                        }
                    }
                } else {
                    return EnumC118935aA.Inactive;
                }
            }
        } else {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.58J] */
    public static final void A01(C58Z c58z) {
        C58J c58j = c58z.A03;
        if (c58j.A08) {
            C58J c58j2 = c58j;
            AnonymousClass599 A02 = AbstractC114335Dx.A02(c58z);
            if (A02 == null) {
                return;
            }
            while (true) {
                if ((A02.A0W.A02.A00 & 5120) != 0) {
                    while (c58j2 != null) {
                        int i = c58j2.A01;
                        if ((i & 5120) != 0) {
                            if (c58j2 != c58j && (i & 1024) != 0) {
                                return;
                            }
                            if ((i & 4096) != 0) {
                                C5AY c5ay = c58j2;
                                ?? r1 = 0;
                                do {
                                    if (c5ay instanceof C5DY) {
                                        C5DY c5dy = (C5DY) c5ay;
                                        c5dy.DHg(A00(c5dy));
                                    } else if ((c5ay.A01 & 4096) != 0 && (c5ay instanceof C5AY)) {
                                        C58J c58j3 = c5ay.A00;
                                        int i2 = 0;
                                        r1 = r1;
                                        c5ay = c5ay;
                                        while (c58j3 != null) {
                                            if ((c58j3.A01 & 4096) != 0) {
                                                i2++;
                                                r1 = r1;
                                                if (i2 == 1) {
                                                    c5ay = c58j3;
                                                } else {
                                                    if (r1 == 0) {
                                                        r1 = new C57S(new C58J[16]);
                                                    }
                                                    if (c5ay != 0) {
                                                        r1.A09(c5ay);
                                                        c5ay = 0;
                                                    }
                                                    r1.A09(c58j3);
                                                }
                                            }
                                            c58j3 = c58j3.A02;
                                            r1 = r1;
                                            c5ay = c5ay;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    c5ay = AbstractC114335Dx.A00(r1);
                                } while (c5ay != 0);
                            }
                        }
                        c58j2 = c58j2.A04;
                    }
                }
                A02 = A02.A0B();
                if (A02 == null) {
                    return;
                }
                C59S c59s = A02.A0W;
                if (c59s != null) {
                    c58j2 = c59s.A05;
                } else {
                    c58j2 = null;
                }
            }
        } else {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
    }
}

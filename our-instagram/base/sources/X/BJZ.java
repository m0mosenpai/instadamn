package X;

/* loaded from: classes5.dex */
public abstract class BJZ {
    public static final C58Z A01(C58Z c58z) {
        C58Z c58z2;
        int A08;
        C58J c58j = c58z.A03;
        if (!c58j.A08) {
            return null;
        }
        C57S c57s = new C57S(new C58J[16]);
        C58J c58j2 = c58j.A02;
        if (c58j2 == null) {
            AbstractC114335Dx.A06(c57s, c58j);
        } else {
            c57s.A09(c58j2);
        }
        loop0: while (true) {
            int i = c57s.A00;
            if (i == 0) {
                return null;
            }
            C58J c58j3 = (C58J) c57s.A00(i - 1);
            if ((c58j3.A00 & 1024) == 0) {
                AbstractC114335Dx.A06(c57s, c58j3);
            } else {
                while (true) {
                    if ((c58j3.A01 & 1024) != 0) {
                        C57S c57s2 = null;
                        do {
                            if (c58j3 instanceof C58Z) {
                                c58z2 = (C58Z) c58j3;
                                if (c58z2.A03.A08 && ((A08 = AbstractC25229BEm.A08(c58z2)) == 0 || A08 == 1 || A08 == 2)) {
                                    break loop0;
                                }
                            } else if ((c58j3.A01 & 1024) != 0 && (c58j3 instanceof C5AY)) {
                                int i2 = 0;
                                for (C58J c58j4 = ((C5AY) c58j3).A00; c58j4 != null; c58j4 = c58j4.A02) {
                                    if ((c58j4.A01 & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            c58j3 = c58j4;
                                        } else {
                                            c57s2 = AbstractC25231BEo.A0Q(c57s2);
                                            if (c58j3 != null) {
                                                c57s2.A09(c58j3);
                                                c58j3 = null;
                                            }
                                            c57s2.A09(c58j4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            c58j3 = AbstractC114335Dx.A00(c57s2);
                        } while (c58j3 != null);
                    } else {
                        c58j3 = c58j3.A02;
                        if (c58j3 != null) {
                        }
                    }
                }
            }
        }
        return c58z2;
    }

    public static final C114205Dh A02(C58Z c58z) {
        C59U c59u = c58z.A05;
        if (c59u != null) {
            return AbstractC119495b6.A02(c59u).Chk(c59u, false);
        }
        return C114205Dh.A04;
    }

    public static final boolean A03(C58Z c58z) {
        AnonymousClass599 anonymousClass599;
        C59U c59u = c58z.A05;
        if (c59u != null && (anonymousClass599 = c59u.A0H) != null && anonymousClass599.A0U.A0J.A0F && anonymousClass599.A0A != null) {
            return true;
        }
        return false;
    }

    public static final C58Z A00(C58Z c58z) {
        int A08 = AbstractC25229BEm.A08(c58z);
        if (A08 != 0) {
            if (A08 != 1) {
                if (A08 != 2) {
                    if (A08 == 3) {
                        return null;
                    }
                    throw B4Z.A00();
                }
            } else {
                C58J c58j = c58z.A03;
                if (c58j.A08) {
                    C57S c57s = new C57S(new C58J[16]);
                    C58J c58j2 = c58j.A02;
                    if (c58j2 == null) {
                        AbstractC114335Dx.A06(c57s, c58j);
                    } else {
                        c57s.A09(c58j2);
                    }
                    loop0: while (true) {
                        int i = c57s.A00;
                        if (i == 0) {
                            return null;
                        }
                        C58J c58j3 = (C58J) c57s.A00(i - 1);
                        if ((c58j3.A00 & 1024) == 0) {
                            AbstractC114335Dx.A06(c57s, c58j3);
                        } else {
                            while (true) {
                                if ((c58j3.A01 & 1024) != 0) {
                                    C57S c57s2 = null;
                                    do {
                                        if (c58j3 instanceof C58Z) {
                                            c58z = A00((C58Z) c58j3);
                                            if (c58z != null) {
                                                break loop0;
                                            }
                                        } else if ((c58j3.A01 & 1024) != 0 && (c58j3 instanceof C5AY)) {
                                            int i2 = 0;
                                            for (C58J c58j4 = ((C5AY) c58j3).A00; c58j4 != null; c58j4 = c58j4.A02) {
                                                if ((c58j4.A01 & 1024) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        c58j3 = c58j4;
                                                    } else {
                                                        if (c57s2 == null) {
                                                            c57s2 = new C57S(new C58J[16]);
                                                        }
                                                        if (c58j3 != null) {
                                                            c57s2.A09(c58j3);
                                                            c58j3 = null;
                                                        }
                                                        c57s2.A09(c58j4);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        c58j3 = AbstractC114335Dx.A00(c57s2);
                                    } while (c58j3 != null);
                                } else {
                                    c58j3 = c58j3.A02;
                                    if (c58j3 != null) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw AbstractC166987dD.A14("visitChildren called on an unattached node");
                }
            }
        }
        return c58z;
    }
}

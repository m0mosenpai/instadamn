package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: X.SjW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63401SjW {
    public int A00;
    public int A01 = 0;
    public int A02;
    public final AbstractC63036SbB A03;

    public static AbstractC63036SbB A03(C63401SjW c63401SjW) {
        A0C(c63401SjW, 0);
        return c63401SjW.A03;
    }

    public static AbstractC63036SbB A04(C63401SjW c63401SjW) {
        A0C(c63401SjW, 1);
        return c63401SjW.A03;
    }

    public static AbstractC63036SbB A05(C63401SjW c63401SjW) {
        A0C(c63401SjW, 5);
        return c63401SjW.A03;
    }

    public final void A0E(List list) {
        int A0F;
        int i = this.A02 & 7;
        if (i != 0) {
            if (i == 2) {
                AbstractC63036SbB abstractC63036SbB = this.A03;
                int A02 = A02(abstractC63036SbB);
                do {
                    list.add(Boolean.valueOf(abstractC63036SbB.A0T()));
                } while (abstractC63036SbB.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB2 = this.A03;
            list.add(Boolean.valueOf(abstractC63036SbB2.A0T()));
            if (abstractC63036SbB2.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB2.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public final void A0F(List list) {
        int A0F;
        int i = this.A02 & 7;
        if (i != 1) {
            if (i == 2) {
                AbstractC63036SbB abstractC63036SbB = this.A03;
                int A01 = A01(abstractC63036SbB);
                do {
                    list.add(Double.valueOf(abstractC63036SbB.A07()));
                } while (abstractC63036SbB.A09() < A01);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB2 = this.A03;
            list.add(Double.valueOf(abstractC63036SbB2.A07()));
            if (abstractC63036SbB2.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB2.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public static Object A06(C63401SjW c63401SjW, C63271SgV c63271SgV, InterfaceC65596Tnf interfaceC65596Tnf) {
        int i = c63401SjW.A00;
        c63401SjW.A00 = ((c63401SjW.A02 >>> 3) << 3) | 4;
        try {
            Object CsR = interfaceC65596Tnf.CsR();
            interfaceC65596Tnf.CpP(c63401SjW, c63271SgV, CsR);
            interfaceC65596Tnf.Cmk(CsR);
            if (c63401SjW.A02 == c63401SjW.A00) {
                return CsR;
            }
            throw AbstractC58320PtC.A0e("Failed to parse the message.");
        } finally {
            c63401SjW.A00 = i;
        }
    }

    public static Object A07(C63401SjW c63401SjW, C63271SgV c63271SgV, InterfaceC65596Tnf interfaceC65596Tnf) {
        AbstractC63036SbB abstractC63036SbB = c63401SjW.A03;
        int A0G = abstractC63036SbB.A0G();
        if (abstractC63036SbB.A00 < 100) {
            int A0H = abstractC63036SbB.A0H(A0G);
            Object CsR = interfaceC65596Tnf.CsR();
            abstractC63036SbB.A00++;
            interfaceC65596Tnf.CpP(c63401SjW, c63271SgV, CsR);
            interfaceC65596Tnf.Cmk(CsR);
            abstractC63036SbB.A0Q(0);
            abstractC63036SbB.A00--;
            abstractC63036SbB.A0R(A0H);
            return CsR;
        }
        throw AbstractC58320PtC.A0e("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static Object A08(C63401SjW c63401SjW, C63271SgV c63271SgV, EnumC61183Rgj enumC61183Rgj, Class cls) {
        int A0A;
        long A0I;
        switch (AbstractC58318PtA.A06(enumC61183Rgj, AbstractC62337S7h.A00)) {
            case 1:
                return Boolean.valueOf(A03(c63401SjW).A0T());
            case 2:
                A0C(c63401SjW, 2);
                return c63401SjW.A03.A0N();
            case 3:
                return Double.valueOf(A04(c63401SjW).A07());
            case 4:
                A0A = A03(c63401SjW).A0A();
                return Integer.valueOf(A0A);
            case 5:
                A0A = A05(c63401SjW).A0B();
                return Integer.valueOf(A0A);
            case 6:
                A0I = A04(c63401SjW).A0I();
                return Long.valueOf(A0I);
            case 7:
                return Float.valueOf(A05(c63401SjW).A08());
            case 8:
                A0A = A03(c63401SjW).A0C();
                return Integer.valueOf(A0A);
            case 9:
                A0I = A03(c63401SjW).A0J();
                return Long.valueOf(A0I);
            case 10:
                A0C(c63401SjW, 2);
                return A07(c63401SjW, c63271SgV, SYX.A02.A00(cls));
            case 11:
                A0A = A05(c63401SjW).A0D();
                return Integer.valueOf(A0A);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0I = A04(c63401SjW).A0K();
                return Long.valueOf(A0I);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A0A = A03(c63401SjW).A0E();
                return Integer.valueOf(A0A);
            case 14:
                A0I = A03(c63401SjW).A0L();
                return Long.valueOf(A0I);
            case Process.SIGTERM /* 15 */:
                A0C(c63401SjW, 2);
                return c63401SjW.A03.A0P();
            case 16:
                A0A = A03(c63401SjW).A0G();
                return Integer.valueOf(A0A);
            case 17:
                A0I = A03(c63401SjW).A0M();
                return Long.valueOf(A0I);
            default:
                throw AbstractC166987dD.A18("unsupported field type.");
        }
    }

    private void A09(int i) {
        if (this.A03.A09() == i) {
        } else {
            throw C4L5.A02();
        }
    }

    public static void A0A(int i) {
        if ((i & 3) == 0) {
        } else {
            throw AbstractC58320PtC.A0e("Failed to parse the message.");
        }
    }

    public static void A0B(int i) {
        if ((i & 7) == 0) {
        } else {
            throw AbstractC58320PtC.A0e("Failed to parse the message.");
        }
    }

    public static void A0C(C63401SjW c63401SjW, int i) {
        if ((c63401SjW.A02 & 7) == i) {
        } else {
            throw C4L5.A00();
        }
    }

    public final int A0D() {
        int i = this.A01;
        if (i != 0) {
            this.A02 = i;
            this.A01 = 0;
        } else {
            i = this.A03.A0F();
            this.A02 = i;
            if (i == 0) {
                return Integer.MAX_VALUE;
            }
        }
        if (i != this.A00) {
            return i >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    public final void A0G(List list) {
        int A0F;
        int A02;
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    A02 = A02(abstractC63036SbB);
                    do {
                        rwc.A8o(abstractC63036SbB.A0A());
                    } while (abstractC63036SbB.A09() < A02);
                    A09(A02);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwc.A8o(abstractC63036SbB2.A0A());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                A02 = A02(abstractC63036SbB3);
                do {
                    MSX.A0u(abstractC63036SbB3.A0A(), list);
                } while (abstractC63036SbB3.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            MSX.A0u(abstractC63036SbB4.A0A(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r3.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        throw X.C4L5.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        if (r0 == 5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        r1 = r3.A03;
        X.MSX.A0u(r1.A0B(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        if (r1.A0S() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        r1 = r1.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r1 == r3.A02) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 == 5) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r1 = r3.A03;
        r4.A8o(r1.A0B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1.A0S() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r1 = r1.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 == r3.A02) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H(java.util.List r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.RWC
            r2 = 5
            r1 = 2
            if (r0 == 0) goto L2a
            X.RWC r4 = (X.RWC) r4
            int r0 = r3.A02
            r0 = r0 & 7
            if (r0 == r1) goto L4a
            if (r0 != r2) goto L5e
        L10:
            X.SbB r1 = r3.A03
            int r0 = r1.A0B()
            r4.A8o(r0)
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L29
            int r1 = r1.A0F()
            int r0 = r3.A02
            if (r1 == r0) goto L10
        L27:
            r3.A01 = r1
        L29:
            return
        L2a:
            int r0 = r3.A02
            r0 = r0 & 7
            if (r0 == r1) goto L63
            if (r0 != r2) goto L5e
        L32:
            X.SbB r1 = r3.A03
            int r0 = r1.A0B()
            X.MSX.A0u(r0, r4)
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L29
            int r1 = r1.A0F()
            int r0 = r3.A02
            if (r1 == r0) goto L32
            goto L27
        L4a:
            X.SbB r2 = r3.A03
            int r1 = A00(r2)
        L50:
            int r0 = r2.A0B()
            r4.A8o(r0)
            int r0 = r2.A09()
            if (r0 < r1) goto L50
            return
        L5e:
            X.RYo r0 = X.C4L5.A00()
            throw r0
        L63:
            X.SbB r2 = r3.A03
            int r1 = A00(r2)
        L69:
            int r0 = r2.A0B()
            X.MSX.A0u(r0, r4)
            int r0 = r2.A09()
            if (r0 < r1) goto L69
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63401SjW.A0H(java.util.List):void");
    }

    public final void A0I(List list) {
        int A0F;
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            int i = this.A02 & 7;
            if (i != 1) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    int A01 = A01(abstractC63036SbB);
                    do {
                        rwd.A02(abstractC63036SbB.A0I());
                    } while (abstractC63036SbB.A09() < A01);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwd.A02(abstractC63036SbB2.A0I());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                int A012 = A01(abstractC63036SbB3);
                do {
                    AbstractC58318PtA.A1A(abstractC63036SbB3.A0I(), list);
                } while (abstractC63036SbB3.A09() < A012);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            AbstractC58318PtA.A1A(abstractC63036SbB4.A0I(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r3.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        throw X.C4L5.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        if (r0 == 5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        r1 = r3.A03;
        r4.add(java.lang.Float.valueOf(r1.A08()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r1.A0S() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0045, code lost:
    
        r1 = r1.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004b, code lost:
    
        if (r1 == r3.A02) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 == 5) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r1 = r3.A03;
        r4.A8b(r1.A08());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1.A0S() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r1 = r1.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 == r3.A02) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J(java.util.List r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.RWB
            r2 = 5
            r1 = 2
            if (r0 == 0) goto L2a
            X.RWB r4 = (X.RWB) r4
            int r0 = r3.A02
            r0 = r0 & 7
            if (r0 == r1) goto L4e
            if (r0 != r2) goto L62
        L10:
            X.SbB r1 = r3.A03
            float r0 = r1.A08()
            r4.A8b(r0)
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L29
            int r1 = r1.A0F()
            int r0 = r3.A02
            if (r1 == r0) goto L10
        L27:
            r3.A01 = r1
        L29:
            return
        L2a:
            int r0 = r3.A02
            r0 = r0 & 7
            if (r0 == r1) goto L67
            if (r0 != r2) goto L62
        L32:
            X.SbB r1 = r3.A03
            float r0 = r1.A08()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.add(r0)
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L29
            int r1 = r1.A0F()
            int r0 = r3.A02
            if (r1 == r0) goto L32
            goto L27
        L4e:
            X.SbB r2 = r3.A03
            int r1 = A00(r2)
        L54:
            float r0 = r2.A08()
            r4.A8b(r0)
            int r0 = r2.A09()
            if (r0 < r1) goto L54
            return
        L62:
            X.RYo r0 = X.C4L5.A00()
            throw r0
        L67:
            X.SbB r2 = r3.A03
            int r1 = A00(r2)
        L6d:
            float r0 = r2.A08()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r4.add(r0)
            int r0 = r2.A09()
            if (r0 < r1) goto L6d
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63401SjW.A0J(java.util.List):void");
    }

    public final void A0K(List list) {
        int A0F;
        int A02;
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    A02 = A02(abstractC63036SbB);
                    do {
                        rwc.A8o(abstractC63036SbB.A0C());
                    } while (abstractC63036SbB.A09() < A02);
                    A09(A02);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwc.A8o(abstractC63036SbB2.A0C());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                A02 = A02(abstractC63036SbB3);
                do {
                    MSX.A0u(abstractC63036SbB3.A0C(), list);
                } while (abstractC63036SbB3.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            MSX.A0u(abstractC63036SbB4.A0C(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public final void A0L(List list) {
        int A0F;
        int A02;
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    A02 = A02(abstractC63036SbB);
                    do {
                        rwd.A02(abstractC63036SbB.A0J());
                    } while (abstractC63036SbB.A09() < A02);
                    A09(A02);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwd.A02(abstractC63036SbB2.A0J());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                A02 = A02(abstractC63036SbB3);
                do {
                    AbstractC58318PtA.A1A(abstractC63036SbB3.A0J(), list);
                } while (abstractC63036SbB3.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            AbstractC58318PtA.A1A(abstractC63036SbB4.A0J(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r3.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        throw X.C4L5.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0030, code lost:
    
        if (r0 == 5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0032, code lost:
    
        r1 = r3.A03;
        X.MSX.A0u(r1.A0D(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        if (r1.A0S() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        r1 = r1.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r1 == r3.A02) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 == 5) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        r1 = r3.A03;
        r4.A8o(r1.A0D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1.A0S() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        r1 = r1.A0F();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r1 == r3.A02) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(java.util.List r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.RWC
            r2 = 5
            r1 = 2
            if (r0 == 0) goto L2a
            X.RWC r4 = (X.RWC) r4
            int r0 = r3.A02
            r0 = r0 & 7
            if (r0 == r1) goto L4a
            if (r0 != r2) goto L5e
        L10:
            X.SbB r1 = r3.A03
            int r0 = r1.A0D()
            r4.A8o(r0)
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L29
            int r1 = r1.A0F()
            int r0 = r3.A02
            if (r1 == r0) goto L10
        L27:
            r3.A01 = r1
        L29:
            return
        L2a:
            int r0 = r3.A02
            r0 = r0 & 7
            if (r0 == r1) goto L63
            if (r0 != r2) goto L5e
        L32:
            X.SbB r1 = r3.A03
            int r0 = r1.A0D()
            X.MSX.A0u(r0, r4)
            boolean r0 = r1.A0S()
            if (r0 != 0) goto L29
            int r1 = r1.A0F()
            int r0 = r3.A02
            if (r1 == r0) goto L32
            goto L27
        L4a:
            X.SbB r2 = r3.A03
            int r1 = A00(r2)
        L50:
            int r0 = r2.A0D()
            r4.A8o(r0)
            int r0 = r2.A09()
            if (r0 < r1) goto L50
            return
        L5e:
            X.RYo r0 = X.C4L5.A00()
            throw r0
        L63:
            X.SbB r2 = r3.A03
            int r1 = A00(r2)
        L69:
            int r0 = r2.A0D()
            X.MSX.A0u(r0, r4)
            int r0 = r2.A09()
            if (r0 < r1) goto L69
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63401SjW.A0M(java.util.List):void");
    }

    public final void A0N(List list) {
        int A0F;
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            int i = this.A02 & 7;
            if (i != 1) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    int A01 = A01(abstractC63036SbB);
                    do {
                        rwd.A02(abstractC63036SbB.A0K());
                    } while (abstractC63036SbB.A09() < A01);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwd.A02(abstractC63036SbB2.A0K());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                int A012 = A01(abstractC63036SbB3);
                do {
                    AbstractC58318PtA.A1A(abstractC63036SbB3.A0K(), list);
                } while (abstractC63036SbB3.A09() < A012);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            AbstractC58318PtA.A1A(abstractC63036SbB4.A0K(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public final void A0O(List list) {
        int A0F;
        int A02;
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    A02 = A02(abstractC63036SbB);
                    do {
                        rwc.A8o(abstractC63036SbB.A0E());
                    } while (abstractC63036SbB.A09() < A02);
                    A09(A02);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwc.A8o(abstractC63036SbB2.A0E());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                A02 = A02(abstractC63036SbB3);
                do {
                    MSX.A0u(abstractC63036SbB3.A0E(), list);
                } while (abstractC63036SbB3.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            MSX.A0u(abstractC63036SbB4.A0E(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public final void A0P(List list) {
        int A0F;
        int A02;
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    A02 = A02(abstractC63036SbB);
                    do {
                        rwd.A02(abstractC63036SbB.A0L());
                    } while (abstractC63036SbB.A09() < A02);
                    A09(A02);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwd.A02(abstractC63036SbB2.A0L());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                A02 = A02(abstractC63036SbB3);
                do {
                    AbstractC58318PtA.A1A(abstractC63036SbB3.A0L(), list);
                } while (abstractC63036SbB3.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            AbstractC58318PtA.A1A(abstractC63036SbB4.A0L(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public final void A0Q(List list) {
        int A0F;
        int A02;
        if (list instanceof RWC) {
            RWC rwc = (RWC) list;
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    A02 = A02(abstractC63036SbB);
                    do {
                        rwc.A8o(abstractC63036SbB.A0G());
                    } while (abstractC63036SbB.A09() < A02);
                    A09(A02);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwc.A8o(abstractC63036SbB2.A0G());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                A02 = A02(abstractC63036SbB3);
                do {
                    MSX.A0u(abstractC63036SbB3.A0G(), list);
                } while (abstractC63036SbB3.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            MSX.A0u(abstractC63036SbB4.A0G(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public final void A0R(List list) {
        int A0F;
        int A02;
        if (list instanceof RWD) {
            RWD rwd = (RWD) list;
            int i = this.A02 & 7;
            if (i != 0) {
                if (i == 2) {
                    AbstractC63036SbB abstractC63036SbB = this.A03;
                    A02 = A02(abstractC63036SbB);
                    do {
                        rwd.A02(abstractC63036SbB.A0M());
                    } while (abstractC63036SbB.A09() < A02);
                    A09(A02);
                    return;
                }
                throw C4L5.A00();
            }
            do {
                AbstractC63036SbB abstractC63036SbB2 = this.A03;
                rwd.A02(abstractC63036SbB2.A0M());
                if (abstractC63036SbB2.A0S()) {
                    return;
                } else {
                    A0F = abstractC63036SbB2.A0F();
                }
            } while (A0F == this.A02);
            this.A01 = A0F;
        }
        int i2 = this.A02 & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                AbstractC63036SbB abstractC63036SbB3 = this.A03;
                A02 = A02(abstractC63036SbB3);
                do {
                    AbstractC58318PtA.A1A(abstractC63036SbB3.A0M(), list);
                } while (abstractC63036SbB3.A09() < A02);
                A09(A02);
                return;
            }
            throw C4L5.A00();
        }
        do {
            AbstractC63036SbB abstractC63036SbB4 = this.A03;
            AbstractC58318PtA.A1A(abstractC63036SbB4.A0M(), list);
            if (abstractC63036SbB4.A0S()) {
                return;
            } else {
                A0F = abstractC63036SbB4.A0F();
            }
        } while (A0F == this.A02);
        this.A01 = A0F;
    }

    public C63401SjW(AbstractC63036SbB abstractC63036SbB) {
        Charset charset = SVB.A04;
        this.A03 = abstractC63036SbB;
        abstractC63036SbB.A01 = this;
    }

    public static int A00(AbstractC63036SbB abstractC63036SbB) {
        int A0G = abstractC63036SbB.A0G();
        A0A(A0G);
        return abstractC63036SbB.A09() + A0G;
    }

    public static int A01(AbstractC63036SbB abstractC63036SbB) {
        int A0G = abstractC63036SbB.A0G();
        A0B(A0G);
        return abstractC63036SbB.A09() + A0G;
    }

    public static int A02(AbstractC63036SbB abstractC63036SbB) {
        return abstractC63036SbB.A09() + abstractC63036SbB.A0G();
    }
}

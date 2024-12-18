package X;

/* renamed from: X.BJa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25331BJa {
    public static final long A00(C114205Dh c114205Dh, C114205Dh c114205Dh2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = c114205Dh.A01;
            f2 = c114205Dh2.A02;
        } else if (i == 4) {
            f = c114205Dh2.A01;
            f2 = c114205Dh.A02;
        } else if (i == 5) {
            f = c114205Dh.A03;
            f2 = c114205Dh2.A00;
        } else if (i == 6) {
            f = c114205Dh2.A03;
            f2 = c114205Dh.A00;
        } else {
            throw AbstractC166987dD.A14("This function should only be used for 2-D focus search");
        }
        long abs = Math.abs(Math.max(0.0f, f - f2));
        if (i != 3 && i != 4) {
            float f7 = c114205Dh.A01;
            f3 = 2.0f;
            f4 = f7 + ((c114205Dh.A02 - f7) / 2.0f);
            f5 = c114205Dh2.A01;
            f6 = c114205Dh2.A02;
        } else {
            float f8 = c114205Dh.A03;
            f3 = 2.0f;
            f4 = f8 + ((c114205Dh.A00 - f8) / 2.0f);
            f5 = c114205Dh2.A03;
            f6 = c114205Dh2.A00;
        }
        long A01 = AbstractC166987dD.A01(f4, f5 + ((f6 - f5) / f3));
        return (13 * abs * abs) + (A01 * A01);
    }

    public static final C58Z A01(C57S c57s, C114205Dh c114205Dh, int i) {
        C114205Dh A02;
        if (AbstractC167007dF.A1P(i, 3)) {
            A02 = c114205Dh.A02((c114205Dh.A02 - c114205Dh.A01) + 1.0f, 0.0f);
        } else if (i == 4) {
            A02 = c114205Dh.A02(-((c114205Dh.A02 - c114205Dh.A01) + 1.0f), 0.0f);
        } else if (i == 5) {
            A02 = c114205Dh.A02(0.0f, (c114205Dh.A00 - c114205Dh.A03) + 1.0f);
        } else if (i == 6) {
            A02 = c114205Dh.A02(0.0f, -((c114205Dh.A00 - c114205Dh.A03) + 1.0f));
        } else {
            throw AbstractC166987dD.A14("This function should only be used for 2-D focus search");
        }
        C58Z c58z = null;
        int i2 = c57s.A00;
        if (i2 > 0) {
            int i3 = 0;
            Object[] objArr = c57s.A02;
            do {
                C58Z c58z2 = (C58Z) objArr[i3];
                if (BJZ.A03(c58z2)) {
                    C114205Dh A022 = BJZ.A02(c58z2);
                    if (A08(A022, c114205Dh, i) && (!A08(A02, c114205Dh, i) || A09(c114205Dh, A022, A02, i) || (!A09(c114205Dh, A02, A022, i) && A00(c114205Dh, A022, i) < A00(c114205Dh, A02, i)))) {
                        c58z = c58z2;
                        A02 = A022;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return c58z;
    }

    public static final boolean A05(C58Z c58z, C114205Dh c114205Dh, InterfaceC16660sJ interfaceC16660sJ, int i) {
        if (A04(c58z, c114205Dh, interfaceC16660sJ, i)) {
            return true;
        }
        return AbstractC167007dF.A1T((Boolean) CBC.A00(c58z, new C30176DRg(i, 3, c114205Dh, interfaceC16660sJ, c58z), i));
    }

    public static final boolean A07(C114205Dh c114205Dh, C114205Dh c114205Dh2, int i) {
        float f;
        float f2;
        if (!AbstractC167007dF.A1P(i, 3) && i != 4) {
            if (i != 5 && i != 6) {
                throw AbstractC166987dD.A14("This function should only be used for 2-D focus search");
            }
            if (c114205Dh.A02 > c114205Dh2.A01) {
                f = c114205Dh.A01;
                f2 = c114205Dh2.A02;
            } else {
                return false;
            }
        } else if (c114205Dh.A00 > c114205Dh2.A03) {
            f = c114205Dh.A03;
            f2 = c114205Dh2.A00;
        } else {
            return false;
        }
        if (f < f2) {
            return true;
        }
        return false;
    }

    public static final boolean A08(C114205Dh c114205Dh, C114205Dh c114205Dh2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (AbstractC167007dF.A1P(i, 3)) {
            float f5 = c114205Dh2.A02;
            float f6 = c114205Dh.A02;
            if (f5 > f6 || c114205Dh2.A01 >= f6) {
                f3 = c114205Dh2.A01;
                f4 = c114205Dh.A01;
            } else {
                return false;
            }
        } else {
            if (i == 4) {
                float f7 = c114205Dh2.A01;
                float f8 = c114205Dh.A01;
                if (f7 < f8 || c114205Dh2.A02 <= f8) {
                    f = c114205Dh2.A02;
                    f2 = c114205Dh.A02;
                } else {
                    return false;
                }
            } else if (i == 5) {
                float f9 = c114205Dh2.A00;
                float f10 = c114205Dh.A00;
                if (f9 > f10 || c114205Dh2.A03 >= f10) {
                    f3 = c114205Dh2.A03;
                    f4 = c114205Dh.A03;
                } else {
                    return false;
                }
            } else if (i == 6) {
                float f11 = c114205Dh2.A03;
                float f12 = c114205Dh.A03;
                if (f11 < f12 || c114205Dh2.A00 <= f12) {
                    f = c114205Dh2.A00;
                    f2 = c114205Dh.A00;
                } else {
                    return false;
                }
            } else {
                throw AbstractC166987dD.A14("This function should only be used for 2-D focus search");
            }
            if (f < f2) {
                return true;
            }
            return false;
        }
        if (f3 > f4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x001a, code lost:
    
        X.AbstractC114335Dx.A06(r5, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C57S r10, X.C58K r11) {
        /*
            r9 = 1024(0x400, float:1.435E-42)
            X.58J r11 = (X.C58J) r11
            X.58J r7 = r11.A03
            boolean r0 = r7.A08
            if (r0 == 0) goto L98
            r6 = 16
            X.58J[] r0 = new X.C58J[r6]
            X.57S r5 = new X.57S
            r5.<init>(r0)
            X.58J r0 = r7.A02
            if (r0 == 0) goto L2b
            r5.A09(r0)
        L1a:
            int r0 = r5.A00
            if (r0 == 0) goto L97
            r4 = 1
            int r0 = r0 - r4
            java.lang.Object r7 = r5.A00(r0)
            X.58J r7 = (X.C58J) r7
            int r0 = r7.A00
            r0 = r0 & r9
            if (r0 != 0) goto L31
        L2b:
            X.AbstractC114335Dx.A06(r5, r7)
            goto L1a
        L2f:
            if (r7 == 0) goto L1a
        L31:
            int r0 = r7.A01
            r0 = r0 & r9
            if (r0 == 0) goto L94
            r8 = 0
            r3 = r8
        L38:
            boolean r0 = r7 instanceof X.C58Z
            if (r0 == 0) goto L60
            X.58Z r7 = (X.C58Z) r7
            boolean r0 = r7.A08
            if (r0 == 0) goto L55
            X.599 r0 = X.AbstractC114335Dx.A02(r7)
            boolean r0 = r0.A0L
            if (r0 != 0) goto L55
            X.BJc r0 = r7.A0F()
            boolean r0 = r0.A0A
            if (r0 == 0) goto L5c
            r10.A09(r7)
        L55:
            X.58J r7 = X.AbstractC114335Dx.A00(r3)
        L59:
            if (r7 == 0) goto L1a
            goto L38
        L5c:
            A03(r10, r7)
            goto L55
        L60:
            int r0 = r7.A01
            r0 = r0 & r9
            if (r0 == 0) goto L55
            boolean r0 = r7 instanceof X.C5AY
            if (r0 == 0) goto L55
            r0 = r7
            X.5AY r0 = (X.C5AY) r0
            X.58J r2 = r0.A00
            r1 = 0
        L6f:
            if (r2 == 0) goto L91
            int r0 = r2.A01
            r0 = r0 & r9
            if (r0 == 0) goto L7b
            int r1 = r1 + 1
            if (r1 != r4) goto L7e
            r7 = r2
        L7b:
            X.58J r2 = r2.A02
            goto L6f
        L7e:
            if (r3 != 0) goto L87
            X.58J[] r0 = new X.C58J[r6]
            X.57S r3 = new X.57S
            r3.<init>(r0)
        L87:
            if (r7 == 0) goto L8d
            r3.A09(r7)
            r7 = r8
        L8d:
            r3.A09(r2)
            goto L7b
        L91:
            if (r1 != r4) goto L55
            goto L59
        L94:
            X.58J r7 = r7.A02
            goto L2f
        L97:
            return
        L98:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25331BJa.A03(X.57S, X.58K):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0020, code lost:
    
        X.AbstractC114335Dx.A06(r6, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(X.C58Z r11, X.C114205Dh r12, X.InterfaceC16660sJ r13, int r14) {
        /*
            r1 = 16
            X.58Z[] r0 = new X.C58Z[r1]
            r10 = 0
            X.57S r3 = new X.57S
            r3.<init>(r0)
            r9 = 1024(0x400, float:1.435E-42)
            X.58J r7 = r11.A03
            boolean r0 = r7.A08
            if (r0 == 0) goto La7
            X.58J[] r0 = new X.C58J[r1]
            X.57S r6 = new X.57S
            r6.<init>(r0)
            X.58J r0 = r7.A02
            if (r0 == 0) goto L35
            r6.A09(r0)
        L20:
            int r1 = r6.A00
            boolean r0 = X.AbstractC167007dF.A1M(r1)
            r4 = 1
            if (r0 == 0) goto L89
            int r1 = r1 - r4
            java.lang.Object r7 = r6.A00(r1)
            X.58J r7 = (X.C58J) r7
            int r0 = r7.A00
            r0 = r0 & r9
            if (r0 != 0) goto L3b
        L35:
            X.AbstractC114335Dx.A06(r6, r7)
            goto L20
        L39:
            if (r7 == 0) goto L20
        L3b:
            int r0 = r7.A01
            r0 = r0 & r9
            if (r0 == 0) goto L83
            r8 = 0
            r5 = r8
        L42:
            boolean r0 = r7 instanceof X.C58Z
            if (r0 == 0) goto L54
            boolean r0 = r7.A08
            if (r0 == 0) goto L4d
            r3.A09(r7)
        L4d:
            X.58J r7 = X.AbstractC114335Dx.A00(r5)
        L51:
            if (r7 == 0) goto L20
            goto L42
        L54:
            int r0 = r7.A01
            r0 = r0 & r9
            if (r0 == 0) goto L4d
            boolean r0 = r7 instanceof X.C5AY
            if (r0 == 0) goto L4d
            r0 = r7
            X.5AY r0 = (X.C5AY) r0
            X.58J r2 = r0.A00
            r1 = 0
        L63:
            if (r2 == 0) goto L80
            int r0 = r2.A01
            r0 = r0 & r9
            if (r0 == 0) goto L6f
            int r1 = r1 + 1
            if (r1 != r4) goto L72
            r7 = r2
        L6f:
            X.58J r2 = r2.A02
            goto L63
        L72:
            X.57S r5 = X.AbstractC25231BEo.A0Q(r5)
            if (r7 == 0) goto L7c
            r5.A09(r7)
            r7 = r8
        L7c:
            r5.A09(r2)
            goto L6f
        L80:
            if (r1 != r4) goto L4d
            goto L51
        L83:
            X.58J r7 = r7.A02
            goto L39
        L86:
            r3.A0B(r1)
        L89:
            int r0 = r3.A00
            if (r0 == 0) goto L9f
            X.58Z r1 = A01(r3, r12, r14)
            if (r1 == 0) goto L9f
            X.BJc r0 = r1.A0F()
            boolean r0 = r0.A0A
            if (r0 == 0) goto La0
            boolean r10 = X.AbstractC25231BEo.A1a(r1, r13)
        L9f:
            return r10
        La0:
            boolean r0 = A05(r1, r12, r13, r14)
            if (r0 == 0) goto L86
            return r4
        La7:
            java.lang.String r0 = "visitChildren called on an unattached node"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25331BJa.A04(X.58Z, X.5Dh, X.0sJ, int):boolean");
    }

    public static final boolean A06(C58Z c58z, InterfaceC16660sJ interfaceC16660sJ, int i) {
        float f;
        float f2;
        Object A01;
        C57S c57s = new C57S(new C58Z[16]);
        A03(c57s, c58z);
        int i2 = c57s.A00;
        if (i2 <= 1) {
            if (i2 == 0) {
                return false;
            }
            A01 = c57s.A02[0];
        } else {
            if (i == 7) {
                i = 4;
            } else if (i != 4 && i != 6) {
                if (i != 3 && i != 5) {
                    throw AbstractC166987dD.A14("This function should only be used for 2-D focus search");
                }
                C114205Dh A02 = BJZ.A02(c58z);
                f = A02.A02;
                f2 = A02.A00;
                A01 = A01(c57s, new C114205Dh(f, f2, f, f2), i);
            }
            C114205Dh A022 = BJZ.A02(c58z);
            f = A022.A01;
            f2 = A022.A03;
            A01 = A01(c57s, new C114205Dh(f, f2, f, f2), i);
        }
        if (A01 == null) {
            return false;
        }
        return AbstractC25231BEo.A1a(A01, interfaceC16660sJ);
    }

    public static final Boolean A02(C58Z c58z, C114205Dh c114205Dh, InterfaceC16660sJ interfaceC16660sJ, int i) {
        boolean A05;
        int A08 = AbstractC25229BEm.A08(c58z);
        if (A08 != 1) {
            if (A08 != 0 && A08 != 2) {
                if (A08 == 3) {
                    if (c58z.A0F().A0A) {
                        return (Boolean) interfaceC16660sJ.invoke(c58z);
                    }
                    if (c114205Dh != null) {
                        A05 = A04(c58z, c114205Dh, interfaceC16660sJ, i);
                    }
                } else {
                    throw B4Z.A00();
                }
            }
            A05 = A06(c58z, interfaceC16660sJ, i);
        } else {
            C58Z A01 = BJZ.A01(c58z);
            if (A01 != null) {
                int A082 = AbstractC25229BEm.A08(A01);
                if (A082 != 1) {
                    if (A082 != 0 && A082 != 2) {
                        if (A082 != 3) {
                            throw B4Z.A00();
                        }
                        throw AbstractC166987dD.A14("ActiveParent must have a focusedChild");
                    }
                    if (c114205Dh == null) {
                        c114205Dh = BJZ.A02(A01);
                    }
                } else {
                    Boolean A02 = A02(A01, c114205Dh, interfaceC16660sJ, i);
                    if (!AbstractC166997dE.A1Z(A02, false)) {
                        return A02;
                    }
                    if (c114205Dh == null) {
                        if (A01.A0G() == EnumC118935aA.ActiveParent) {
                            C58Z A00 = BJZ.A00(A01);
                            if (A00 != null) {
                                c114205Dh = BJZ.A02(A00);
                            } else {
                                throw AbstractC166987dD.A14("ActiveParent must have a focusedChild");
                            }
                        } else {
                            throw AbstractC166987dD.A14("Searching for active node in inactive hierarchy");
                        }
                    }
                }
                A05 = A05(c58z, c114205Dh, interfaceC16660sJ, i);
            } else {
                throw AbstractC166987dD.A14("ActiveParent must have a focusedChild");
            }
        }
        return Boolean.valueOf(A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r8 != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r8 == 4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r8 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r1 = r5.A03;
        r0 = r6.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        r2 = java.lang.Math.max(0.0f, r1 - r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r8 != 5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r1 = r5.A03;
        r0 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r2 >= java.lang.Math.max(1.0f, r1 - r0)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r1 = r7.A00;
        r0 = r5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r1 = r6.A03;
        r0 = r5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0026, code lost:
    
        if (r1 <= r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A09(X.C114205Dh r5, X.C114205Dh r6, X.C114205Dh r7, int r8) {
        /*
            boolean r0 = A07(r7, r5, r8)
            r4 = 0
            if (r0 != 0) goto L1c
            boolean r0 = A07(r6, r5, r8)
            if (r0 == 0) goto L1c
            r0 = 3
            r2 = 3
            if (r8 != r0) goto L1d
            float r1 = r5.A01
            float r0 = r7.A02
        L15:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            if (r8 != r2) goto L28
        L1b:
            r4 = 1
        L1c:
            return r4
        L1d:
            r0 = 4
            if (r8 != r0) goto L54
            float r1 = r5.A02
            float r0 = r7.A01
        L24:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L1b
        L28:
            r0 = 4
            if (r8 == r0) goto L1b
            r3 = 5
            if (r8 != r3) goto L4f
            float r1 = r5.A03
            float r0 = r6.A00
        L32:
            float r1 = r1 - r0
            r0 = 0
            float r2 = java.lang.Math.max(r0, r1)
            if (r8 != r3) goto L4a
            float r1 = r5.A03
            float r0 = r7.A03
        L3e:
            float r1 = r1 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.max(r0, r1)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1c
            goto L1b
        L4a:
            float r1 = r7.A00
            float r0 = r5.A00
            goto L3e
        L4f:
            float r1 = r6.A03
            float r0 = r5.A00
            goto L32
        L54:
            r0 = 5
            if (r8 != r0) goto L5c
            float r1 = r5.A03
            float r0 = r7.A00
            goto L15
        L5c:
            r0 = 6
            if (r8 != r0) goto L64
            float r1 = r5.A00
            float r0 = r7.A03
            goto L24
        L64:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC25331BJa.A09(X.5Dh, X.5Dh, X.5Dh, int):boolean");
    }
}

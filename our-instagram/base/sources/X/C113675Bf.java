package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.5Bf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C113675Bf {
    public Constraints A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass599 A05;
    public final C113685Bg A04 = new C113685Bg();
    public final C113735Bl A06 = new C113735Bl();
    public final C57S A07 = new C57S(new C59E[16]);
    public final C57S A03 = new C57S(new C113745Bm[16]);

    private final void A03(AnonymousClass599 anonymousClass599, boolean z) {
        boolean z2;
        C5AZ c5az = anonymousClass599.A0U;
        if (z) {
            z2 = c5az.A0G;
        } else {
            z2 = c5az.A0H;
        }
        if (z2) {
            C113685Bg c113685Bg = this.A04;
            boolean contains = c113685Bg.A00.A00.contains(anonymousClass599);
            if (!z) {
                if (!contains) {
                    contains = c113685Bg.A01.A00.contains(anonymousClass599);
                }
                A0A(anonymousClass599, z, false);
            }
            if (!contains) {
                return;
            }
            A0A(anonymousClass599, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.58J] */
    public static final void A04(C113675Bf c113675Bf) {
        C57S c57s = c113675Bf.A07;
        int i = c57s.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = c57s.A02;
            do {
                C59T c59t = ((AnonymousClass599) ((C59E) objArr[i2])).A0W.A06;
                C18630vq c18630vq = AbstractC114275Dr.A00;
                C5AX c5ax = c59t.A01;
                for (C58J A01 = C59U.A01(c59t, true); A01 != null && (A01.A00 & 128) != 0; A01 = A01.A02) {
                    if ((A01.A01 & 128) != 0) {
                        C5AY c5ay = A01;
                        ?? r0 = 0;
                        do {
                            if (c5ay instanceof C5DZ) {
                                ((C5DZ) c5ay).DYp(c59t);
                            } else if ((c5ay.A01 & 128) != 0 && (c5ay instanceof C5AY)) {
                                C58J c58j = c5ay.A00;
                                int i3 = 0;
                                r0 = r0;
                                c5ay = c5ay;
                                while (c58j != null) {
                                    if ((c58j.A01 & 128) != 0) {
                                        i3++;
                                        r0 = r0;
                                        if (i3 == 1) {
                                            c5ay = c58j;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new C57S(new C58J[16]);
                                            }
                                            if (c5ay != 0) {
                                                r0.A09(c5ay);
                                                c5ay = 0;
                                            }
                                            r0.A09(c58j);
                                        }
                                    }
                                    c58j = c58j.A02;
                                    r0 = r0;
                                    c5ay = c5ay;
                                }
                                if (i3 == 1) {
                                }
                            }
                            c5ay = AbstractC114335Dx.A00(r0);
                        } while (c5ay != 0);
                    }
                    if (A01 == c5ax) {
                        break;
                    }
                }
                i2++;
            } while (i2 < i);
        }
        c57s.A01();
    }

    public static final void A05(C113675Bf c113675Bf) {
        C57S c57s = c113675Bf.A03;
        int i = c57s.A00;
        if (i != 0) {
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = c57s.A02;
                do {
                    C113745Bm c113745Bm = (C113745Bm) objArr[i2];
                    if (c113745Bm.A00.A0A != null) {
                        if (!c113745Bm.A02) {
                            c113745Bm.A00.A0a(c113745Bm.A01, true, false);
                        } else {
                            c113745Bm.A00.A0Z(c113745Bm.A01, true, false);
                        }
                    }
                    i2++;
                } while (i2 < i);
            }
            c57s.A01();
        }
    }

    public static final boolean A06(AnonymousClass599 anonymousClass599) {
        C113385Aa c113385Aa = anonymousClass599.A0U.A0J;
        if (c113385Aa.A09 != C05F.A00) {
            AbstractC113415Ad abstractC113415Ad = c113385Aa.A0O;
            abstractC113415Ad.A06();
            if (abstractC113415Ad.A00 == null) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A07(AnonymousClass599 anonymousClass599) {
        Integer num;
        AbstractC113415Ad abstractC113415Ad;
        C121665fI c121665fI = anonymousClass599.A0U.A05;
        if (c121665fI != null) {
            num = c121665fI.A05;
        } else {
            num = C05F.A0C;
        }
        if (num != C05F.A00) {
            if (c121665fI == null || (abstractC113415Ad = c121665fI.A0I) == null) {
                return false;
            }
            abstractC113415Ad.A06();
            if (abstractC113415Ad.A00 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(X.AnonymousClass599 r6, androidx.compose.ui.unit.Constraints r7) {
        /*
            X.599 r0 = r6.A08
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            X.5AZ r4 = r6.A0U
            X.5fI r0 = r4.A05
            if (r7 == 0) goto L40
            X.C14360o3.A0A(r0)
        Lf:
            long r1 = r7.A00
            boolean r3 = r0.A0O(r1)
        L15:
            X.599 r2 = r6.A0B()
            if (r3 == 0) goto L25
            if (r2 == 0) goto L25
            X.599 r0 = r2.A08
            if (r0 != 0) goto L26
            r0 = 1
            r2.A0a(r5, r0, r5)
        L25:
            return r3
        L26:
            X.5fI r0 = r4.A05
            if (r0 == 0) goto L35
            java.lang.Integer r1 = r0.A05
        L2c:
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L38
            r0 = 1
            r2.A0Z(r5, r0, r5)
            return r3
        L35:
            java.lang.Integer r1 = X.C05F.A0C
            goto L2c
        L38:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L25
            r2.A0X(r5)
            return r3
        L40:
            if (r0 == 0) goto L47
            androidx.compose.ui.unit.Constraints r7 = r0.A04
            if (r7 == 0) goto L47
            goto Lf
        L47:
            r3 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113675Bf.A08(X.599, androidx.compose.ui.unit.Constraints):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A09(X.AnonymousClass599 r5, androidx.compose.ui.unit.Constraints r6) {
        /*
            if (r6 != 0) goto L11
            X.5AZ r0 = r5.A0U
            X.5Aa r4 = r0.A0J
            boolean r0 = r4.A0I
            if (r0 == 0) goto L41
            long r0 = r4.A04
            androidx.compose.ui.unit.Constraints r6 = new androidx.compose.ui.unit.Constraints
            r6.<init>(r0)
        L11:
            java.lang.Integer r1 = r5.A0F
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L1a
            r5.A0H()
        L1a:
            X.5AZ r0 = r5.A0U
            X.5Aa r4 = r0.A0J
            long r0 = r6.A00
            boolean r3 = r4.A0O(r0)
        L24:
            X.599 r2 = r5.A0B()
            if (r3 == 0) goto L37
            if (r2 == 0) goto L37
            java.lang.Integer r1 = r4.A09
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L38
            r1 = 0
            r0 = 1
            r2.A0a(r1, r0, r1)
        L37:
            return r3
        L38:
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto L37
            r0 = 0
            r2.A0Y(r0)
            return r3
        L41:
            r3 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113675Bf.A09(X.599, androidx.compose.ui.unit.Constraints):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d6, code lost:
    
        if (r0.A00 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0A(X.AnonymousClass599 r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = r8.A0L
            r4 = 0
            if (r0 != 0) goto L4b
            X.5AZ r3 = r8.A0U
            X.5Aa r2 = r3.A0J
            boolean r0 = r2.A0F
            r1 = 1
            if (r0 != 0) goto L1c
            boolean r0 = r2.A0G
            if (r0 != 0) goto L1c
            boolean r0 = r3.A0H
            if (r0 == 0) goto La6
            boolean r0 = A06(r8)
            if (r0 == 0) goto La6
        L1c:
            X.599 r6 = r7.A05
            if (r8 != r6) goto La4
            androidx.compose.ui.unit.Constraints r5 = r7.A00
            X.C14360o3.A0A(r5)
        L25:
            if (r9 == 0) goto L4c
            boolean r0 = r3.A0G
            if (r0 == 0) goto L2f
            boolean r4 = A08(r8, r5)
        L2f:
            if (r10 == 0) goto L48
            if (r4 != 0) goto L37
            boolean r0 = r3.A0E
            if (r0 == 0) goto L48
        L37:
            java.lang.Boolean r2 = r8.A0D()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C14360o3.A0K(r2, r0)
            if (r0 == 0) goto L48
            r8.A0N()
        L48:
            A05(r7)
        L4b:
            return r4
        L4c:
            boolean r0 = r3.A0H
            if (r0 == 0) goto La2
            boolean r5 = A09(r8, r5)
        L54:
            if (r10 == 0) goto L9c
            boolean r0 = r3.A0A
            if (r0 == 0) goto L9c
            if (r8 == r6) goto L6e
            X.599 r0 = r8.A0B()
            if (r0 == 0) goto L9c
            X.5AZ r0 = r0.A0U
            X.5Aa r0 = r0.A0J
            boolean r0 = r0.A0F
            if (r0 != r1) goto L9c
            boolean r0 = r2.A0G
            if (r0 == 0) goto L9c
        L6e:
            if (r8 != r6) goto L9e
            java.lang.Integer r3 = r8.A0F
            java.lang.Integer r0 = X.C05F.A0C
            if (r3 != r0) goto L79
            X.AnonymousClass599.A07(r8)
        L79:
            X.599 r0 = r8.A0B()
            if (r0 == 0) goto L87
            X.59S r0 = r0.A0W
            X.59T r0 = r0.A06
            X.5AW r3 = r0.A05
            if (r3 != 0) goto L90
        L87:
            X.57r r0 = X.C59M.A00(r8)
            X.5ae r3 = new X.5ae
            r3.<init>(r0)
        L90:
            r3.A07(r2, r4, r4)
        L93:
            X.5Bl r0 = r7.A06
            X.57S r0 = r0.A01
            r0.A09(r8)
            r8.A0M = r1
        L9c:
            r4 = r5
            goto L48
        L9e:
            r8.A0Q()
            goto L93
        La2:
            r5 = 0
            goto L54
        La4:
            r5 = 0
            goto L25
        La6:
            java.lang.Boolean r5 = r8.A0D()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C14360o3.A0K(r5, r0)
            if (r0 != 0) goto L1c
            boolean r0 = r3.A0G
            if (r0 == 0) goto Lc0
            boolean r0 = A07(r8)
            if (r0 == 0) goto Lc0
            goto L1c
        Lc0:
            X.5Ad r0 = r2.A0O
            r0.A06()
            X.5Ab r0 = r0.A00
            if (r0 != 0) goto L1c
            X.5fI r0 = r3.A05
            if (r0 == 0) goto L4b
            X.5Ad r0 = r0.A0I
            if (r0 == 0) goto L4b
            r0.A06()
            X.5Ab r0 = r0.A00
            if (r0 == 0) goto L4b
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113675Bf.A0A(X.599, boolean, boolean):boolean");
    }

    public final void A0B(AnonymousClass599 anonymousClass599, boolean z) {
        C113695Bh c113695Bh;
        boolean z2;
        C113685Bg c113685Bg = this.A04;
        if (z) {
            c113695Bh = c113685Bg.A00;
        } else {
            c113695Bh = c113685Bg.A01;
        }
        if (!c113695Bh.A00.isEmpty()) {
            if (!this.A02) {
                AbstractC28290Cdc.A01("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            } else {
                C5AZ c5az = anonymousClass599.A0U;
                if (z) {
                    z2 = c5az.A0G;
                } else {
                    z2 = c5az.A0H;
                }
                if (!(!z2)) {
                    AbstractC28290Cdc.A00("node not yet measured");
                } else {
                    A02(anonymousClass599, z);
                    return;
                }
            }
            throw C00O.createAndThrow();
        }
    }

    public final boolean A0C(AnonymousClass599 anonymousClass599, boolean z) {
        C5AZ c5az = anonymousClass599.A0U;
        int intValue = c5az.A06.intValue();
        if (intValue != 1 && intValue != 0) {
            if (intValue != 3 && intValue != 2) {
                if (intValue == 4) {
                    if (c5az.A0H && !z) {
                        return false;
                    }
                    c5az.A0H = true;
                    if (anonymousClass599.A0L) {
                        return false;
                    }
                    if (!c5az.A0J.A0F && !A06(anonymousClass599)) {
                        return false;
                    }
                    AnonymousClass599 A0B = anonymousClass599.A0B();
                    if (A0B == null || !A0B.A0U.A0H) {
                        this.A04.A00(anonymousClass599, false);
                    }
                    if (!this.A01) {
                        return true;
                    }
                    return false;
                }
                throw new RuntimeException();
            }
            this.A03.A09(new C113745Bm(anonymousClass599, false, z));
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A0D(InterfaceC16820sZ interfaceC16820sZ) {
        String str;
        AnonymousClass599 anonymousClass599 = this.A05;
        if (anonymousClass599.A0A != null) {
            if (!anonymousClass599.A0U.A0J.A0F) {
                str = "performMeasureAndLayout called with unplaced root";
            } else if (!(!this.A02)) {
                str = "performMeasureAndLayout called during measure layout";
            } else {
                boolean z = false;
                if (this.A00 != null) {
                    this.A02 = true;
                    this.A01 = true;
                    try {
                        C113685Bg c113685Bg = this.A04;
                        boolean z2 = false;
                        if (!c113685Bg.A01()) {
                            while (!c113685Bg.A01()) {
                                C113695Bh c113695Bh = c113685Bg.A00;
                                boolean z3 = !c113695Bh.A00.isEmpty();
                                if (!z3) {
                                    c113695Bh = c113685Bg.A01;
                                }
                                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) c113695Bh.A00.first();
                                c113695Bh.A00(anonymousClass5992);
                                boolean A0A = A0A(anonymousClass5992, z3, true);
                                if (anonymousClass5992 == anonymousClass599 && A0A) {
                                    z2 = true;
                                }
                            }
                            if (interfaceC16820sZ != null) {
                                interfaceC16820sZ.invoke();
                            }
                        }
                        this.A02 = false;
                        this.A01 = false;
                        z = z2;
                    } catch (Throwable th) {
                        this.A02 = false;
                        this.A01 = false;
                        throw th;
                    }
                }
                A04(this);
                return z;
            }
        } else {
            str = "performMeasureAndLayout called with unattached root";
        }
        AbstractC28290Cdc.A00(str);
        throw C00O.createAndThrow();
    }

    public C113675Bf(AnonymousClass599 anonymousClass599) {
        this.A05 = anonymousClass599;
    }

    public static final void A00(AnonymousClass599 anonymousClass599, C113675Bf c113675Bf) {
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (C14360o3.A0K(anonymousClass5992.A0D(), true) && !anonymousClass5992.A0L) {
                    if (c113675Bf.A04.A00.A00.contains(anonymousClass5992)) {
                        anonymousClass5992.A0N();
                    }
                    A00(anonymousClass5992, c113675Bf);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A01(AnonymousClass599 anonymousClass599, C113675Bf c113675Bf) {
        Constraints constraints;
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (A06(anonymousClass5992)) {
                    if (AbstractC119095aR.A00(anonymousClass5992)) {
                        if (!anonymousClass5992.A0L) {
                            if (anonymousClass5992 == c113675Bf.A05) {
                                constraints = c113675Bf.A00;
                                C14360o3.A0A(constraints);
                            } else {
                                constraints = null;
                            }
                            A08(anonymousClass5992, constraints);
                        }
                    } else {
                        A01(anonymousClass5992, c113675Bf);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    private final void A02(AnonymousClass599 anonymousClass599, boolean z) {
        boolean z2;
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            Object[] objArr = A0A.A02;
            int i2 = 0;
            do {
                AnonymousClass599 anonymousClass5992 = (AnonymousClass599) objArr[i2];
                if (z ? A07(anonymousClass5992) : A06(anonymousClass5992)) {
                    if (AbstractC119095aR.A00(anonymousClass5992) && !z) {
                        if (anonymousClass5992.A0U.A0G && this.A04.A00.A00.contains(anonymousClass5992)) {
                            A0A(anonymousClass5992, true, false);
                        } else {
                            A0B(anonymousClass5992, true);
                        }
                    }
                    A03(anonymousClass5992, z);
                    C5AZ c5az = anonymousClass5992.A0U;
                    if (z) {
                        z2 = c5az.A0G;
                    } else {
                        z2 = c5az.A0H;
                    }
                    if (!z2) {
                        A02(anonymousClass5992, z);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        A03(anonymousClass599, z);
    }
}

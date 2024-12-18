package X;

import com.facebook.common.dextricks.Constants;

/* loaded from: classes5.dex */
public abstract class BFZ {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [X.58J] */
    public static final InterfaceC1130758u A00(C58K c58k, Object obj) {
        C59S c59s;
        C58J c58j = ((C58J) c58k).A03;
        if (c58j.A08) {
            C58J c58j2 = c58j.A04;
            AnonymousClass599 A02 = AbstractC114335Dx.A02(c58k);
            while (A02 != null) {
                if ((A02.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                    while (c58j2 != null) {
                        if ((c58j2.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                            C5AY c5ay = c58j2;
                            ?? r4 = 0;
                            do {
                                if (c5ay instanceof InterfaceC1130758u) {
                                    InterfaceC1130758u interfaceC1130758u = (InterfaceC1130758u) c5ay;
                                    if (C14360o3.A0K(obj, interfaceC1130758u.CAp())) {
                                        return interfaceC1130758u;
                                    }
                                } else if ((c5ay.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && (c5ay instanceof C5AY)) {
                                    C58J c58j3 = c5ay.A00;
                                    int i = 0;
                                    r4 = r4;
                                    c5ay = c5ay;
                                    while (c58j3 != null) {
                                        if ((c58j3.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                                            i++;
                                            if (i == 1) {
                                                c5ay = c58j3;
                                            } else {
                                                r4 = AbstractC25233BEq.A08(r4);
                                                c5ay = c5ay;
                                                if (c5ay != 0) {
                                                    r4.A09(c5ay);
                                                    c5ay = 0;
                                                }
                                                r4.A09(c58j3);
                                            }
                                        }
                                        c58j3 = c58j3.A02;
                                        r4 = r4;
                                        c5ay = c5ay;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                c5ay = AbstractC114335Dx.A00(r4);
                            } while (c5ay != 0);
                        }
                        c58j2 = c58j2.A04;
                    }
                }
                A02 = A02.A0B();
                if (A02 != null && (c59s = A02.A0W) != null) {
                    c58j2 = c59s.A05;
                } else {
                    c58j2 = null;
                }
            }
            return null;
        }
        throw AbstractC166987dD.A14("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.58u, java.lang.Object, X.58K] */
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
    public static final InterfaceC1130758u A01(InterfaceC1130758u interfaceC1130758u) {
        C59S c59s;
        C58J c58j = ((C58J) interfaceC1130758u).A03;
        if (c58j.A08) {
            C58J c58j2 = c58j.A04;
            AnonymousClass599 A02 = AbstractC114335Dx.A02(interfaceC1130758u);
            while (A02 != null) {
                if ((A02.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                    while (c58j2 != null) {
                        if ((c58j2.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                            C5AY c5ay = c58j2;
                            ?? r0 = 0;
                            do {
                                if (c5ay instanceof InterfaceC1130758u) {
                                    InterfaceC1130758u interfaceC1130758u2 = (InterfaceC1130758u) c5ay;
                                    if (C14360o3.A0K(interfaceC1130758u.CAp(), interfaceC1130758u2.CAp()) && interfaceC1130758u.getClass() == interfaceC1130758u2.getClass()) {
                                        return interfaceC1130758u2;
                                    }
                                } else if ((c5ay.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && (c5ay instanceof C5AY)) {
                                    C58J c58j3 = c5ay.A00;
                                    int i = 0;
                                    r0 = r0;
                                    c5ay = c5ay;
                                    while (c58j3 != null) {
                                        if ((c58j3.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                                            i++;
                                            r0 = r0;
                                            if (i == 1) {
                                                c5ay = c58j3;
                                            } else {
                                                if (r0 == 0) {
                                                    r0 = new C57S(new C58J[16]);
                                                }
                                                if (c5ay != 0) {
                                                    r0.A09(c5ay);
                                                    c5ay = 0;
                                                }
                                                r0.A09(c58j3);
                                            }
                                        }
                                        c58j3 = c58j3.A02;
                                        r0 = r0;
                                        c5ay = c5ay;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                c5ay = AbstractC114335Dx.A00(r0);
                            } while (c5ay != 0);
                        }
                        c58j2 = c58j2.A04;
                    }
                }
                A02 = A02.A0B();
                if (A02 != null && (c59s = A02.A0W) != null) {
                    c58j2 = c59s.A05;
                } else {
                    c58j2 = null;
                }
            }
            return null;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.58u, java.lang.Object, X.58K] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.58J] */
    public static final void A02(InterfaceC1130758u interfaceC1130758u, InterfaceC16660sJ interfaceC16660sJ) {
        C58J c58j = ((C58J) interfaceC1130758u).A03;
        if (c58j.A08) {
            C58J c58j2 = c58j.A04;
            AnonymousClass599 A02 = AbstractC114335Dx.A02(interfaceC1130758u);
            if (A02 == null) {
                return;
            }
            while (true) {
                if ((A02.A0W.A02.A00 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                    while (c58j2 != null) {
                        if ((c58j2.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                            C5AY c5ay = c58j2;
                            ?? r3 = 0;
                            do {
                                if (c5ay instanceof InterfaceC1130758u) {
                                    InterfaceC1130758u interfaceC1130758u2 = (InterfaceC1130758u) c5ay;
                                    if (C14360o3.A0K(interfaceC1130758u.CAp(), interfaceC1130758u2.CAp()) && interfaceC1130758u.getClass() == interfaceC1130758u2.getClass() && !AbstractC25231BEo.A1a(interfaceC1130758u2, interfaceC16660sJ)) {
                                        return;
                                    }
                                } else if ((c5ay.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0 && (c5ay instanceof C5AY)) {
                                    C58J c58j3 = c5ay.A00;
                                    int i = 0;
                                    r3 = r3;
                                    c5ay = c5ay;
                                    while (c58j3 != null) {
                                        if ((c58j3.A01 & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED) != 0) {
                                            i++;
                                            if (i == 1) {
                                                c5ay = c58j3;
                                            } else {
                                                r3 = AbstractC25233BEq.A08(r3);
                                                c5ay = c5ay;
                                                if (c5ay != 0) {
                                                    r3.A09(c5ay);
                                                    c5ay = 0;
                                                }
                                                r3.A09(c58j3);
                                            }
                                        }
                                        c58j3 = c58j3.A02;
                                        r3 = r3;
                                        c5ay = c5ay;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                c5ay = AbstractC114335Dx.A00(r3);
                            } while (c5ay != 0);
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
            throw AbstractC166987dD.A14("visitAncestors called on an unattached node");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.58u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0sJ] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.58J] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [X.58J] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ab -> B:9:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.InterfaceC1130758u r11, X.InterfaceC16660sJ r12) {
        /*
            r10 = 262144(0x40000, float:3.67342E-40)
            r0 = r11
            X.58J r0 = (X.C58J) r0
            X.58J r7 = r0.A03
            boolean r0 = r7.A08
            if (r0 != 0) goto L19
            r0 = 3308(0xcec, float:4.635E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.AbstractC28290Cdc.A01(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L19:
            r0 = 16
            X.58J[] r0 = new X.C58J[r0]
            X.57S r6 = new X.57S
            r6.<init>(r0)
            X.58J r0 = r7.A02
            if (r0 == 0) goto Lab
            r6.A09(r0)
        L29:
            int r0 = r6.A00
            if (r0 == 0) goto Lb0
            r5 = 1
            int r0 = r0 - r5
            java.lang.Object r7 = r6.A00(r0)
            X.58J r7 = (X.C58J) r7
            int r0 = r7.A00
            r0 = r0 & r10
            if (r0 == 0) goto Lab
            r0 = r7
        L3b:
            int r1 = r0.A01
            r1 = r1 & r10
            if (r1 == 0) goto La6
            r9 = 0
            r8 = r0
            r4 = r9
        L43:
            boolean r1 = r8 instanceof X.InterfaceC1130758u
            if (r1 == 0) goto L77
            X.58u r8 = (X.InterfaceC1130758u) r8
            java.lang.Object r2 = r11.CAp()
            java.lang.Object r1 = r8.CAp()
            boolean r1 = X.C14360o3.A0K(r2, r1)
            if (r1 == 0) goto L74
            java.lang.Class r2 = r11.getClass()
            java.lang.Class r1 = r8.getClass()
            if (r2 != r1) goto L74
            java.lang.Object r2 = r12.invoke(r8)
        L65:
            X.BHM r1 = X.BHM.CancelTraversal
            if (r2 == r1) goto Lb0
            X.BHM r1 = X.BHM.SkipSubtreeAndContinueTraversal
            if (r2 == r1) goto L29
        L6d:
            X.58J r8 = X.AbstractC114335Dx.A00(r4)
        L71:
            if (r8 == 0) goto La6
            goto L43
        L74:
            X.BHM r2 = X.BHM.ContinueTraversal
            goto L65
        L77:
            int r1 = r8.A01
            r1 = r1 & r10
            if (r1 == 0) goto L6d
            boolean r1 = r8 instanceof X.C5AY
            if (r1 == 0) goto L6d
            r1 = r8
            X.5AY r1 = (X.C5AY) r1
            X.58J r3 = r1.A00
            r2 = 0
        L86:
            if (r3 == 0) goto La3
            int r1 = r3.A01
            r1 = r1 & r10
            if (r1 == 0) goto L92
            int r2 = r2 + 1
            if (r2 != r5) goto L95
            r8 = r3
        L92:
            X.58J r3 = r3.A02
            goto L86
        L95:
            X.57S r4 = X.AbstractC25231BEo.A0Q(r4)
            if (r8 == 0) goto L9f
            r4.A09(r8)
            r8 = r9
        L9f:
            r4.A09(r3)
            goto L92
        La3:
            if (r2 != r5) goto L6d
            goto L71
        La6:
            X.58J r0 = r0.A02
            if (r0 == 0) goto Lab
            goto L3b
        Lab:
            X.AbstractC114335Dx.A06(r6, r7)
            goto L29
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BFZ.A03(X.58u, X.0sJ):void");
    }
}

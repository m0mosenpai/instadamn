package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.58Z, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58Z extends C58J implements InterfaceC1129158a, InterfaceC1129358c, InterfaceC1129458d, C58K {
    public EnumC118935aA A00;
    public boolean A01;
    public boolean A02;

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
    public final C25333BJc A0F() {
        C25333BJc c25333BJc = new C25333BJc();
        C58J c58j = this.A03;
        if (c58j.A08) {
            C58J c58j2 = c58j;
            AnonymousClass599 A02 = AbstractC114335Dx.A02(this);
            if (A02 != null) {
                loop0: while (true) {
                    if ((A02.A0W.A02.A00 & 3072) != 0) {
                        while (c58j2 != null) {
                            int i = c58j2.A01;
                            if ((i & 3072) != 0) {
                                if (c58j2 != c58j && (i & 1024) != 0) {
                                    break loop0;
                                }
                                if ((i & C3OO.FLAG_MOVED) != 0) {
                                    C5AY c5ay = c58j2;
                                    ?? r1 = 0;
                                    do {
                                        if (c5ay instanceof InterfaceC114145Da) {
                                            ((InterfaceC114145Da) c5ay).AC8(c25333BJc);
                                        } else if ((c5ay.A01 & C3OO.FLAG_MOVED) != 0 && (c5ay instanceof C5AY)) {
                                            C58J c58j3 = c5ay.A00;
                                            int i2 = 0;
                                            r1 = r1;
                                            c5ay = c5ay;
                                            while (c58j3 != null) {
                                                if ((c58j3.A01 & C3OO.FLAG_MOVED) != 0) {
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
                        break;
                    }
                    C59S c59s = A02.A0W;
                    if (c59s != null) {
                        c58j2 = c59s.A05;
                    } else {
                        c58j2 = null;
                    }
                }
            }
            return c25333BJc;
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public final EnumC118935aA A0G() {
        AnonymousClass599 anonymousClass599;
        InterfaceC1128457r interfaceC1128457r;
        C58X c58x;
        C1129758g c1129758g;
        EnumC118935aA enumC118935aA;
        C59U c59u = this.A03.A05;
        if (c59u == null || (anonymousClass599 = c59u.A0H) == null || (interfaceC1128457r = anonymousClass599.A0A) == null || (c58x = ((AndroidComposeView) interfaceC1128457r).A0S) == null || (c1129758g = ((C58W) c58x).A04) == null || (enumC118935aA = (EnumC118935aA) c1129758g.A01.A03(this)) == null) {
            EnumC118935aA enumC118935aA2 = this.A00;
            if (enumC118935aA2 == null) {
                return EnumC118935aA.Inactive;
            }
            return enumC118935aA2;
        }
        return enumC118935aA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0083, code lost:
    
        if (r2 == 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e7, code lost:
    
        r1 = r5.A0G().ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        if (r1 == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0136, code lost:
    
        if (r1 == 2) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        if (r1 == 1) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013b, code lost:
    
        if (r1 == 3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0146, code lost:
    
        r1 = X.EnumC118935aA.ActiveParent;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0128, code lost:
    
        if (r2 == 1) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:5:0x0008, B:7:0x000c, B:8:0x000f, B:10:0x001a, B:13:0x0023, B:16:0x002f, B:19:0x0036, B:21:0x003a, B:29:0x0040, B:38:0x015a, B:39:0x015f, B:41:0x00a3, B:43:0x00a9, B:46:0x00b4, B:48:0x00c1, B:49:0x00c4, B:51:0x00c8, B:54:0x00d5, B:57:0x00dd, B:59:0x00e1, B:66:0x00e7, B:73:0x013d, B:75:0x0146, B:76:0x0148, B:61:0x0123, B:78:0x00f2, B:80:0x00f7, B:82:0x00fb, B:84:0x0103, B:86:0x0108, B:92:0x0110, B:94:0x0119, B:95:0x011d, B:90:0x0120, B:100:0x012d, B:104:0x0132, B:23:0x007e, B:106:0x004b, B:108:0x0050, B:110:0x0054, B:112:0x005c, B:114:0x0061, B:120:0x0069, B:122:0x0074, B:123:0x0078, B:118:0x007b, B:27:0x0088, B:130:0x008b, B:132:0x0091, B:134:0x0095, B:105:0x0143, B:140:0x0152), top: B:4:0x0008 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0132 -> B:42:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0H() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58Z.A0H():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.57S] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
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
    @Override // X.InterfaceC1129258b
    public final /* synthetic */ Object Au8(C114175De c114175De) {
        C58J c58j = this.A03;
        if (!c58j.A08) {
            AbstractC28290Cdc.A00("ModifierLocal accessed from an unattached node");
            throw C00O.createAndThrow();
        }
        C58J c58j2 = c58j.A04;
        AnonymousClass599 A02 = AbstractC114335Dx.A02(this);
        if (A02 != null) {
            while (true) {
                if ((A02.A0W.A02.A00 & 32) != 0) {
                    while (c58j2 != null) {
                        if ((c58j2.A01 & 32) != 0) {
                            C5AY c5ay = c58j2;
                            ?? r0 = 0;
                            do {
                                if (c5ay instanceof InterfaceC1129158a) {
                                    AbstractC138066Nk Biu = ((InterfaceC1129158a) c5ay).Biu();
                                    if (Biu.A01(c114175De)) {
                                        return Biu.A00(c114175De);
                                    }
                                } else if ((c5ay.A01 & 32) != 0 && (c5ay instanceof C5AY)) {
                                    C58J c58j3 = c5ay.A00;
                                    int i = 0;
                                    r0 = r0;
                                    c5ay = c5ay;
                                    while (c58j3 != null) {
                                        if ((c58j3.A01 & 32) != 0) {
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
                if (A02 == null) {
                    break;
                }
                C59S c59s = A02.A0W;
                if (c59s != null) {
                    c58j2 = c59s.A05;
                } else {
                    c58j2 = null;
                }
            }
        }
        return c114175De.A00.invoke();
    }

    @Override // X.InterfaceC1129158a
    public final /* synthetic */ AbstractC138066Nk Biu() {
        return C25776BaF.A00;
    }

    @Override // X.InterfaceC1129358c
    public final void DWO() {
        EnumC118935aA A0G = A0G();
        A0H();
        if (A0G != A0G()) {
            AbstractC118955aC.A01(this);
        }
    }
}

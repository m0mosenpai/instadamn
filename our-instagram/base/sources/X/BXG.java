package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class BXG {
    public static final void A01(CWQ cwq) {
        C27946CTf c27946CTf = cwq.A04;
        if (c27946CTf != null) {
            C27945CTe c27945CTe = cwq.A0M;
            InterfaceC16660sJ interfaceC16660sJ = cwq.A0O;
            C5C3 c5c3 = c27945CTe.A01;
            interfaceC16660sJ.invoke(new C5C3(c5c3.A01, null, c5c3.A00));
            C5D0 c5d0 = c27946CTf.A01;
            if (C1EM.A00(c27946CTf, null, c5d0.A01)) {
                c5d0.A00.Eoa();
            }
        }
        cwq.A04 = null;
    }

    public static final void A02(CWQ cwq, C114085Cu c114085Cu, InterfaceC31114Dlw interfaceC31114Dlw, C5C3 c5c3, C5D0 c5d0) {
        C27945CTe c27945CTe = cwq.A0M;
        InterfaceC16660sJ interfaceC16660sJ = cwq.A0O;
        InterfaceC16660sJ interfaceC16660sJ2 = cwq.A0N;
        C15370ps A1F = AbstractC25225BEi.A1F();
        DHZ dhz = new DHZ(7, c27945CTe, A1F, interfaceC16660sJ);
        InterfaceC113845Bw interfaceC113845Bw = c5d0.A00;
        interfaceC113845Bw.EnR(c114085Cu, c5c3, dhz, interfaceC16660sJ2);
        C27946CTf c27946CTf = new C27946CTf(interfaceC113845Bw, c5d0);
        c5d0.A01.set(c27946CTf);
        A1F.A00 = c27946CTf;
        cwq.A04 = c27946CTf;
        A03(cwq, interfaceC31114Dlw, c5c3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009a A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:6:0x0011, B:8:0x0017, B:10:0x001b, B:12:0x0021, B:14:0x002d, B:17:0x0043, B:18:0x004a, B:19:0x0064, B:21:0x009a, B:23:0x0045), top: B:5:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.CWQ r9, X.InterfaceC31114Dlw r10, X.C5C3 r11) {
        /*
            androidx.compose.runtime.snapshots.Snapshot r6 = X.C3Z5.A02()
            if (r6 == 0) goto Lf
            X.0sJ r5 = r6.A03()
        La:
            androidx.compose.runtime.snapshots.Snapshot r4 = X.C3Z5.A03(r6)
            goto L11
        Lf:
            r5 = 0
            goto La
        L11:
            X.Cd7 r0 = r9.A00()     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9f
            X.CTf r7 = r9.A04     // Catch: java.lang.Throwable -> La3
            if (r7 == 0) goto L9f
            X.59c r3 = r9.A01()     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L9f
            X.CUL r2 = r9.A01     // Catch: java.lang.Throwable -> La3
            X.5oj r8 = r0.A02     // Catch: java.lang.Throwable -> La3
            X.3Yl r0 = r9.A0A     // Catch: java.lang.Throwable -> La3
            boolean r0 = X.AbstractC25230BEn.A1X(r0)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9f
            long r0 = r11.A00     // Catch: java.lang.Throwable -> La3
            int r0 = X.C5C2.A00(r0)     // Catch: java.lang.Throwable -> La3
            int r1 = r10.E36(r0)     // Catch: java.lang.Throwable -> La3
            X.5oc r0 = r8.A04     // Catch: java.lang.Throwable -> La3
            X.5C8 r0 = r0.A03     // Catch: java.lang.Throwable -> La3
            int r0 = r0.length()     // Catch: java.lang.Throwable -> La3
            if (r1 < r0) goto L45
            if (r1 == 0) goto L4a
            int r1 = r1 + (-1)
        L45:
            X.5Dh r0 = r8.A05(r1)     // Catch: java.lang.Throwable -> La3
            goto L64
        L4a:
            X.5Vw r9 = r2.A03     // Catch: java.lang.Throwable -> La3
            X.57x r8 = r2.A05     // Catch: java.lang.Throwable -> La3
            X.5DD r2 = r2.A04     // Catch: java.lang.Throwable -> La3
            java.lang.String r1 = X.CZS.A00     // Catch: java.lang.Throwable -> La3
            r0 = 1
            long r0 = X.CZS.A00(r9, r2, r8, r1, r0)     // Catch: java.lang.Throwable -> La3
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.C119055aN.A00(r0)     // Catch: java.lang.Throwable -> La3
            float r2 = (float) r0     // Catch: java.lang.Throwable -> La3
            r1 = 0
            X.5Dh r0 = new X.5Dh     // Catch: java.lang.Throwable -> La3
            r0.<init>(r1, r1, r8, r2)     // Catch: java.lang.Throwable -> La3
        L64:
            float r9 = r0.A01     // Catch: java.lang.Throwable -> La3
            float r8 = r0.A03     // Catch: java.lang.Throwable -> La3
            long r1 = X.AbstractC119395aw.A00(r9, r8)     // Catch: java.lang.Throwable -> La3
            long r10 = r3.Chn(r1)     // Catch: java.lang.Throwable -> La3
            float r2 = X.C119365at.A01(r10)     // Catch: java.lang.Throwable -> La3
            float r1 = X.C119365at.A02(r10)     // Catch: java.lang.Throwable -> La3
            long r2 = X.AbstractC119395aw.A00(r2, r1)     // Catch: java.lang.Throwable -> La3
            float r1 = r0.A02     // Catch: java.lang.Throwable -> La3
            float r1 = r1 - r9
            float r0 = r0.A00     // Catch: java.lang.Throwable -> La3
            float r0 = r0 - r8
            long r0 = X.C5YB.A00(r1, r0)     // Catch: java.lang.Throwable -> La3
            X.5Dh r1 = X.AbstractC119355as.A01(r2, r0)     // Catch: java.lang.Throwable -> La3
            X.5D0 r0 = r7.A01     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.atomic.AtomicReference r0 = r0.A01     // Catch: java.lang.Throwable -> La3
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La3
            X.CTf r0 = (X.C27946CTf) r0     // Catch: java.lang.Throwable -> La3
            boolean r0 = X.C14360o3.A0K(r0, r7)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9f
            X.5Bw r0 = r7.A00     // Catch: java.lang.Throwable -> La3
            r0.CtA(r1)     // Catch: java.lang.Throwable -> La3
        L9f:
            X.C3Z5.A06(r6, r4, r5)
            return
        La3:
            r0 = move-exception
            X.C3Z5.A06(r6, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BXG.A03(X.CWQ, X.Dlw, X.5C3):void");
    }

    public static final void A04(BXF bxf, C5Tl c5Tl, int i) {
        int i2;
        CWQ cwq;
        C5C8 c5c8;
        C28262Cd7 c28262Cd7;
        c5Tl.Enr(-1436003720);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, bxf) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1489561067, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            CWQ cwq2 = bxf.A03;
            if (cwq2 != null && AbstractC25230BEn.A1X(cwq2.A0F) && (cwq = bxf.A03) != null && (c5c8 = cwq.A01.A02) != null && c5c8.length() > 0) {
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, bxf, -285446808);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = new C28774Cn6(bxf);
                    c5Tl.FBy(EEc);
                }
                InterfaceC1128957x A0h = AbstractC25228BEl.A0h(c5Tl);
                int E36 = bxf.A08.E36(AbstractC25225BEi.A06(AbstractC25228BEl.A0G(bxf.A0K)));
                CWQ cwq3 = bxf.A03;
                if (cwq3 != null) {
                    c28262Cd7 = cwq3.A00();
                } else {
                    c28262Cd7 = null;
                }
                C14360o3.A0A(c28262Cd7);
                C127055oj c127055oj = c28262Cd7.A02;
                C114205Dh A06 = c127055oj.A06(C17s.A03(E36, 0, c127055oj.A04.A03.length()));
                float f = A06.A01;
                C5Y6 c5y6 = AbstractC27743CLk.A00;
                long A00 = AbstractC119395aw.A00(f + (A0h.EqT(2.0f) / 2.0f), A06.A00);
                boolean AH3 = c5Tl.AH3(A00);
                Object EEc2 = c5Tl.EEc();
                if (AH3 || EEc2 == C5UI.A00) {
                    EEc2 = new C28784CnG(A00);
                    c5Tl.FBy(EEc2);
                }
                InterfaceC30909DiM interfaceC30909DiM = (InterfaceC30909DiM) EEc2;
                C1130158n c1130158n = Modifier.A00;
                boolean A1R = AbstractC25231BEo.A1R(c5Tl, EEc, bxf);
                Object EEc3 = c5Tl.EEc();
                if (A1R || EEc3 == C5UI.A00) {
                    EEc3 = new C57172PZq(bxf, EEc, (InterfaceC23621Ds) null, 11);
                    c5Tl.FBy(EEc3);
                }
                Modifier A002 = C6KX.A00(c1130158n, EEc, (InterfaceC16620sF) EEc3);
                boolean AH32 = c5Tl.AH3(A00);
                Object EEc4 = c5Tl.EEc();
                if (AH32 || EEc4 == C5UI.A00) {
                    EEc4 = new JXD(A00, 1);
                    c5Tl.FBy(EEc4);
                }
                AbstractC28344CeW.A00(interfaceC30909DiM, c5Tl, AnonymousClass598.A00(A002, (InterfaceC16660sJ) EEc4, false), 0, 4, 0L);
            } else {
                c5Tl.Eno(-284257090);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(433776757);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, bxf, i, 6);
        }
    }

    public static final void A05(BXF bxf, C5Tl c5Tl, int i, boolean z) {
        int i2;
        C28262Cd7 A00;
        c5Tl.Enr(626339208);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, bxf) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-843809198, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z) {
                c5Tl.Eno(-1286242594);
                CWQ cwq = bxf.A03;
                if (cwq != null && (A00 = cwq.A00()) != null) {
                    C127055oj c127055oj = A00.A02;
                    if (bxf.A03 != null && (!r0.A06)) {
                        c5Tl.Eno(-1285984395);
                        InterfaceC74953Yl interfaceC74953Yl = bxf.A0K;
                        if (!C5C2.A03(AbstractC25228BEl.A0G(interfaceC74953Yl))) {
                            c5Tl.Eno(-1680616096);
                            int E36 = bxf.A08.E36(AbstractC25225BEi.A06(AbstractC25228BEl.A0G(interfaceC74953Yl)));
                            int E362 = bxf.A08.E36(AbstractC25228BEl.A02(AbstractC25228BEl.A0G(interfaceC74953Yl)));
                            BIZ A08 = c127055oj.A08(E36);
                            BIZ A082 = c127055oj.A08(Math.max(E362 - 1, 0));
                            CWQ cwq2 = bxf.A03;
                            if (cwq2 != null && AbstractC25230BEn.A1X(cwq2.A0I)) {
                                c5Tl.Eno(-1680216289);
                                AbstractC28014CWm.A00(bxf, c5Tl, A08, ((i2 << 6) & 896) | 6, true);
                            } else {
                                c5Tl.Eno(-1679975078);
                            }
                            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                            CWQ cwq3 = bxf.A03;
                            if (cwq3 != null && AbstractC25230BEn.A1X(cwq3.A0H)) {
                                c5Tl.Eno(-1679895904);
                                AbstractC28014CWm.A00(bxf, c5Tl, A082, ((i2 << 6) & 896) | 6, false);
                            } else {
                                c5Tl.Eno(-1679655654);
                            }
                            C117505Tk.A0L(A0K, false);
                        } else {
                            c5Tl.Eno(-1679637798);
                        }
                        AbstractC25225BEi.A1V(c5Tl, false);
                        CWQ cwq4 = bxf.A03;
                        if (cwq4 != null) {
                            if (AbstractC25225BEi.A1a(bxf.A09.A01.A00, AbstractC25230BEn.A0p(interfaceC74953Yl))) {
                                AbstractC25227BEk.A1A(cwq4.A0G, false);
                            }
                            if (AbstractC25230BEn.A1X(cwq4.A0A)) {
                                if (AbstractC25230BEn.A1X(cwq4.A0G)) {
                                    bxf.A0B();
                                } else {
                                    bxf.A08();
                                }
                            }
                        }
                        C117505Tk.A0I(AbstractC25225BEi.A0J(c5Tl));
                    }
                }
                c5Tl.Eno(-1285984396);
                C117505Tk.A0I(AbstractC25225BEi.A0J(c5Tl));
            } else {
                c5Tl.Eno(651305535);
                AbstractC25225BEi.A1T(c5Tl);
                bxf.A08();
            }
            if (C0fH.A02()) {
                C0fH.A00(1724398621);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, bxf, i, 0, z);
        }
    }

    public static final void A06(BXF bxf, C5Tl c5Tl, Modifier modifier, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        c5Tl.Enr(-20551815);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, bxf);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-996253211, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(true);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC27478CAz.A00(bxf, c5Tl, interfaceC16620sF, AbstractC25228BEl.A01(i2));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(836506767);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(modifier, interfaceC16620sF, bxf, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x04ea, code lost:
    
        if (r19 != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x06fa, code lost:
    
        if (X.C5C2.A03(((X.C5C2) r9.A08.getValue()).A00) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x07b8, code lost:
    
        if (r10 == 32) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0751, code lost:
    
        if ((r3 & 48) == 32) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0699, code lost:
    
        if ((r3 & 48) == 32) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0516, code lost:
    
        if ((r3 & 48) == 32) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0499, code lost:
    
        if ((r3 & 48) == 32) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
    
        if (r53.AH4(r32) == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0916  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ec A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5XO r51, X.C28367CfT r52, X.C5Tl r53, androidx.compose.ui.Modifier r54, X.C6L5 r55, X.C118125Vw r56, X.C114085Cu r57, X.C5C3 r58, X.InterfaceC31101Dlj r59, X.InterfaceC16660sJ r60, X.InterfaceC16660sJ r61, X.InterfaceC16610sE r62, int r63, int r64, int r65, int r66, int r67, boolean r68, boolean r69, boolean r70) {
        /*
            Method dump skipped, instructions count: 2561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BXG.A00(X.5XO, X.CfT, X.5Tl, androidx.compose.ui.Modifier, X.6L5, X.5Vw, X.5Cu, X.5C3, X.Dlj, X.0sJ, X.0sJ, X.0sE, int, int, int, int, int, boolean, boolean, boolean):void");
    }
}

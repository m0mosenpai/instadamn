package X;

import android.content.Context;
import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ChK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28468ChK {
    public static final void A00(C5Tl c5Tl, C26060Bfn c26060Bfn, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, c26060Bfn, interfaceC16820sZ);
        c5Tl.Enr(-383562988);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26060Bfn) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1514993550, "com.instagram.potato.reply.PotatoReplyLikersFacepile (PotatoReplyBottomSheet.kt:203)");
            }
            Modifier A0E = AbstractC118175Wb.A0E(AbstractC25226BEj.A0T(Modifier.A00), 20.0f, 0.0f, 0.0f, 5.0f);
            boolean A1X = AbstractC25235BEs.A1X(c5Tl, -1416085019, i2);
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new GSw(interfaceC16820sZ, A1R ? 1 : 0);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A05 = C5XR.A05(A0E, null, null, (InterfaceC16820sZ) EEc, A1R);
            InterfaceC1127857k A02 = AbstractC118375Wz.A02(AbstractC118255Wn.A01(5.0f), c5Tl, C118195Wf.A05, 6);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(417344931);
            List list = c26060Bfn.A07;
            Iterator it = AbstractC001800i.A0d(list, 3).iterator();
            while (it.hasNext()) {
                AbstractC27689CJi.A00(c5Tl, AbstractC25226BEj.A15(it).Bhu(), 20, 48);
            }
            C117505Tk.A0L(A0K, false);
            if (AbstractC25227BEk.A04(c5Tl, list, 417349359) > 3) {
                C5WR.A0u(c5Tl, AbstractC25225BEi.A0Y(c5Tl), AnonymousClass001.A00('+', list.size() - 3), AbstractC25226BEj.A0G(c5Tl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(2042306346);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c26060Bfn, interfaceC16820sZ, i, 45);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r16.A02 != X.EnumC77173d3.A03) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r15, X.C26060Bfn r16, X.InterfaceC16820sZ r17, int r18) {
        /*
            r8 = 0
            r4 = r16
            r3 = r17
            X.AbstractC167007dF.A1K(r4, r3)
            r0 = -889069087(0xffffffffcb01e1e1, float:-8511969.0)
            r5 = r15
            r15.Enr(r0)
            r2 = r18
            r0 = r18 & 14
            if (r0 != 0) goto Ld1
            int r10 = X.AbstractC25232BEp.A0R(r15, r4)
            r10 = r10 | r18
        L1b:
            r0 = r18 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L24
            int r0 = X.AbstractC25232BEp.A0I(r15, r3)
            r10 = r10 | r0
        L24:
            r1 = r10 & 91
            r0 = 18
            if (r1 != r0) goto L3f
            boolean r0 = r15.Bxj()
            if (r0 == 0) goto L3f
            r15.Em9()
        L33:
            X.5UU r1 = r5.ASZ()
            if (r1 == 0) goto L3e
            r0 = 46
            X.C30510Dbt.A01(r1, r4, r3, r2, r0)
        L3e:
            return
        L3f:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L4d
            r1 = -119192963(0xfffffffff8e5427d, float:-3.7199516E34)
            java.lang.String r0 = "com.instagram.potato.reply.PotatoReplyMedia (PotatoReplyBottomSheet.kt:129)"
            X.C0fH.A01(r1, r0)
        L4d:
            java.lang.String r0 = r4.A04
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC25225BEi.A0t(r0)
            r11 = 0
            X.2DB r6 = X.AbstractC43541zP.A00(r15, r0)
            X.58n r0 = androidx.compose.ui.Modifier.A00
            androidx.compose.ui.Modifier r1 = X.AbstractC25232BEp.A0x(r15, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r7 = X.AbstractC27468CAo.A00(r1, r0, r8)
            r1 = 1114636288(0x42700000, float:60.0)
            r0 = 1103626240(0x41c80000, float:25.0)
            androidx.compose.ui.Modifier r1 = X.AbstractC118175Wb.A0A(r7, r0, r1)
            androidx.compose.foundation.layout.FillElement r0 = X.AbstractC118185Wd.A01
            androidx.compose.ui.Modifier r13 = r1.Eq3(r0)
            r0 = -904716758(0xffffffffca131e2a, float:-2410378.5)
            java.lang.Object r0 = X.AbstractC25227BEk.A0q(r15, r0)
            java.lang.Object r9 = X.C5UI.A00
            java.lang.Object r12 = X.AbstractC25232BEp.A1C(r15, r0, r9)
            X.5XO r12 = (X.C5XO) r12
            X.5Tk r7 = X.AbstractC25225BEi.A0K(r15, r8)
            java.lang.Integer r1 = r4.A03
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L93
            X.3d3 r1 = r4.A02
            X.3d3 r0 = X.EnumC77173d3.A03
            r18 = 1
            if (r1 == r0) goto L95
        L93:
            r18 = 0
        L95:
            r0 = 5
            X.5XQ r14 = X.AbstractC25225BEi.A0W(r0)
            r0 = -904705283(0xffffffffca134afd, float:-2413247.2)
            r15.Eno(r0)
            boolean r0 = X.AbstractC25231BEo.A1L(r10)
            java.lang.Object r1 = r15.EEc()
            if (r0 != 0) goto Lac
            if (r1 != r9) goto Lb5
        Lac:
            r0 = 2
            X.GSw r1 = new X.GSw
            r1.<init>(r3, r0)
            r15.FBy(r1)
        Lb5:
            X.0sZ r16 = X.AbstractC25225BEi.A1A(r7, r1, r8)
            X.DDX r17 = X.DDX.A00
            r15 = r11
            androidx.compose.ui.Modifier r0 = X.C5XR.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            X.C6LQ.A04(r5, r0, r6)
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L33
            r0 = 1004619219(0x3be145d3, float:0.006874779)
            X.C0fH.A00(r0)
            goto L33
        Ld1:
            r10 = r2
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28468ChK.A01(X.5Tl, X.Bfn, X.0sZ, int):void");
    }

    public static final void A02(C5Tl c5Tl, C26060Bfn c26060Bfn, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        C2DC A00;
        long A0F;
        AbstractC167007dF.A1K(c26060Bfn, interfaceC16820sZ);
        c5Tl.Enr(821322141);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26060Bfn) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1480598140, "com.instagram.potato.reply.PotatoReplySheetLikeButton (PotatoReplyBottomSheet.kt:175)");
            }
            Modifier A04 = AbstractC118185Wd.A04(Modifier.A00);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1501847858);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5XM c5xm = new C5XM(400.0f, 400.0f);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -1501844034, i2);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = new GSw(interfaceC16820sZ, 3);
                c5Tl.FBy(EEc);
            }
            Modifier A02 = C5XR.A02(c5xm, c5xo, A04, AbstractC25225BEi.A1A(A0K, EEc, false));
            InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0f, A042);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (c26060Bfn.A02 == EnumC77173d3.A02) {
                c5Tl.Eno(1928476333);
                A00 = C5Y7.A00(c5Tl, R.drawable.instagram_heart_pano_filled_24, 0);
                A0F = C5XL.A00(c5Tl).A0Q;
            } else {
                c5Tl.Eno(1928687660);
                A00 = C5Y7.A00(c5Tl, R.drawable.instagram_heart_pano_outline_24, 0);
                A0F = AbstractC25226BEj.A0F(c5Tl);
            }
            C5YS.A01(c5Tl, null, A00, 56, 20, A0F);
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-1599447877);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30510Dbt.A01(ASZ, c26060Bfn, interfaceC16820sZ, i, 47);
        }
    }

    public static final void A03(C5Tl c5Tl, C26060Bfn c26060Bfn, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(c26060Bfn, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(1557566571);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26060Bfn) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1269092462, "com.instagram.potato.reply.PotatoReplyBottomSheetTitle (PotatoReplyBottomSheet.kt:86)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0D = AbstractC118175Wb.A0D(c1130158n, 18.0f, 5.0f, 5.0f);
            InterfaceC1127857k A0T = AbstractC25231BEo.A0T(c5Tl, 11.0f);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0D);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0T, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            c5Tl.Eno(1990296056);
            int i3 = i2 & 896;
            boolean A1P = AbstractC167007dF.A1P(i3, 256);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new DGZ(interfaceC16820sZ2, 48);
                c5Tl.FBy(EEc);
            }
            BII.A01(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1b), AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(c26060Bfn.A06)), null, 28.0f, 0.0f, 0.0f, 70, 1016, 0L, 0L, false, false);
            boolean A1U = AbstractC25232BEp.A1U(c5Tl, 1990303480, i3, 256);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = new DGZ(interfaceC16820sZ2, 49);
                c5Tl.FBy(EEc2);
            }
            C5WR.A0E(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), A1b), AbstractC25226BEj.A0h(c5Tl), c26060Bfn.A05, A1b ? 1 : 0, 0, 15352, AbstractC25226BEj.A0G(c5Tl));
            C5WR.A0u(c5Tl, AbstractC25226BEj.A0c(c5Tl), C23831Eq.A09(AbstractC166997dE.A0M(A0K), c26060Bfn.A00), AbstractC25226BEj.A0M(c5Tl));
            AbstractC119685bS.A00(c5Tl, c6l0.A00(c1130158n));
            c5Tl.Eno(1990321142);
            if (c26060Bfn.A08) {
                BJ3 bj3 = c26060Bfn.A01;
                boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 1990324479, i2);
                Object EEc3 = c5Tl.EEc();
                if (A1Y || EEc3 == C5UI.A00) {
                    EEc3 = new GSw(interfaceC16820sZ, 0);
                    c5Tl.FBy(EEc3);
                }
                AbstractC25276BGq.A00(c5Tl, null, bj3, null, AbstractC25225BEi.A1A(c117505Tk, EEc3, false), 0, 6);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1455963199);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 7, interfaceC16820sZ2, c26060Bfn, interfaceC16820sZ);
        }
    }

    public static final void A04(C5Tl c5Tl, C26060Bfn c26060Bfn, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        C14360o3.A0B(c26060Bfn, 0);
        AbstractC167027dH.A0a(1, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16660sJ);
        C14360o3.A0B(interfaceC16820sZ4, 5);
        C14360o3.A0B(interfaceC16820sZ5, 6);
        c5Tl.Enr(-472986700);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26060Bfn) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ3);
        }
        if ((57344 & i) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((458752 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ4);
        }
        if ((3670016 & i) == 0) {
            i2 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ5);
        }
        if ((2995931 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2066816645, "com.instagram.potato.reply.PotatoReplyBottomSheet (PotatoReplyBottomSheet.kt:53)");
            }
            Modifier A0W = AbstractC25228BEl.A0W();
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0W);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            int intValue = c26060Bfn.A03.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    c5Tl.Eno(273802080);
                    int i3 = i2 & 14;
                    int i4 = i2 >> 3;
                    A03(c5Tl, c26060Bfn, interfaceC16820sZ2, interfaceC16820sZ3, (i4 & 896) | (i4 & 112) | i3);
                    A01(c5Tl, c26060Bfn, interfaceC16820sZ5, ((i2 >> 15) & 112) | i3);
                    if (AbstractC166987dD.A1b(c26060Bfn.A07)) {
                        A00(c5Tl, c26060Bfn, interfaceC16820sZ4, i3 | ((i2 >> 12) & 112));
                    }
                } else {
                    throw AbstractC25231BEo.A0v(c5Tl, c117505Tk, 978651814, false);
                }
            } else {
                c5Tl.Eno(273489724);
                int i5 = i2 & 14;
                int i6 = i2 >> 3;
                A03(c5Tl, c26060Bfn, interfaceC16820sZ2, interfaceC16820sZ3, (i6 & 896) | (i6 & 112) | i5);
                A01(c5Tl, c26060Bfn, interfaceC16820sZ5, ((i2 >> 15) & 112) | i5);
                A05(c5Tl, c26060Bfn, interfaceC16820sZ, interfaceC16660sJ, i5 | (i2 & 112) | ((i2 >> 6) & 896));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(7646851);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30289DVq(i, 6, c26060Bfn, interfaceC16820sZ2, interfaceC16820sZ, interfaceC16820sZ4, interfaceC16820sZ5, interfaceC16820sZ3, interfaceC16660sJ);
        }
    }

    public static final void A05(C5Tl c5Tl, C26060Bfn c26060Bfn, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        Modifier Eq3;
        C14360o3.A0B(c26060Bfn, 0);
        AbstractC167017dG.A1P(interfaceC16820sZ, interfaceC16660sJ);
        c5Tl.Enr(1468117182);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c26060Bfn) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1386829792, "com.instagram.potato.reply.PotatoReplySheetFooter (PotatoReplyBottomSheet.kt:157)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            Modifier A0M = AbstractC25227BEk.A0M(AbstractC118185Wd.A01(interfaceC118225Wj, A0T), 10.0f);
            InterfaceC1127857k A00 = AbstractC118375Wz.A00(AbstractC118255Wn.A01(11.0f), c5Tl, interfaceC118225Wj);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0M);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            c5Tl.Eno(-1124762968);
            if (c26060Bfn.A09) {
                Eq3 = C6L2.A00(c6l0.A00(c1130158n)).Eq3(new SizeAnimationModifierElement(new C5Y4(new C119055aN(1 | (1 << 32)), 1.0f, 400.0f), C118195Wf.A0E));
                AbstractC28064CYs.A00(c5Tl, Eq3, interfaceC16660sJ, (i2 >> 3) & 112);
                A02(c5Tl, c26060Bfn, interfaceC16820sZ, AbstractC25225BEi.A01(i2));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(141243286);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 8, interfaceC16660sJ, c26060Bfn, interfaceC16820sZ);
        }
    }
}

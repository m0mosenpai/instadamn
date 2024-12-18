package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CgD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28407CgD {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C5Tl r8, X.InterfaceC30852DhR r9, java.lang.String r10, X.InterfaceC16820sZ r11, int r12) {
        /*
            r4 = r9
            r5 = r11
            X.AbstractC167017dG.A1P(r9, r11)
            r0 = 32983325(0x1f7491d, float:9.083838E-38)
            r8.Enr(r0)
            r7 = r12
            r0 = r12 & 6
            r6 = r10
            if (r0 != 0) goto L93
            int r3 = X.AbstractC25232BEp.A0R(r8, r10)
            r3 = r3 | r12
        L16:
            r0 = r12 & 48
            if (r0 != 0) goto L1f
            int r0 = X.AbstractC25232BEp.A0I(r8, r9)
            r3 = r3 | r0
        L1f:
            r0 = r12 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L28
            int r0 = X.AbstractC25232BEp.A0J(r8, r11)
            r3 = r3 | r0
        L28:
            r1 = r3 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L47
            boolean r0 = r8.Bxj()
            if (r0 == 0) goto L47
            r8.Em9()
        L37:
            X.5UU r0 = r8.ASZ()
            if (r0 == 0) goto L46
            r8 = 17
            X.DT4 r3 = new X.DT4
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A06 = r3
        L46:
            return
        L47:
            boolean r0 = X.C0fH.A02()
            if (r0 == 0) goto L55
            r1 = -657349998(0xffffffffd8d1a292, float:-1.8439693E15)
            java.lang.String r0 = "instagram.features.clips.blend.ui.BlendInviteScreen (BlendInviteScreen.kt:56)"
            X.C0fH.A01(r1, r0)
        L55:
            boolean r0 = r9 instanceof X.C29540Czs
            if (r0 == 0) goto L7a
            r1 = 2123559269(0x7e92f165, float:9.766034E37)
        L5c:
            X.58n r0 = X.AbstractC25225BEi.A0N(r8, r1)
            androidx.compose.ui.Modifier r1 = X.AbstractC25232BEp.A0y(r8, r0)
            androidx.compose.foundation.layout.FillElement r0 = X.AbstractC118185Wd.A01
            androidx.compose.ui.Modifier r0 = r1.Eq3(r0)
            X.BIR.A00(r8, r0)
        L6d:
            boolean r0 = X.AbstractC25230BEn.A1Y(r8)
            if (r0 == 0) goto L37
            r0 = 706715239(0x2a1f9e67, float:1.4176994E-13)
            X.C0fH.A00(r0)
            goto L37
        L7a:
            boolean r0 = r9 instanceof X.AbstractC29538Czq
            r1 = 2123565477(0x7e9309a5, float:9.77233E37)
            if (r0 == 0) goto L5c
            r0 = 2123562977(0x7e92ffe1, float:9.769794E37)
            r8.Eno(r0)
            r2 = r4
            X.Czq r2 = (X.AbstractC29538Czq) r2
            r1 = r3 & 14
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            A03(r8, r2, r10, r11, r0)
            goto L6d
        L93:
            r3 = r12
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28407CgD.A02(X.5Tl, X.DhR, java.lang.String, X.0sZ, int):void");
    }

    public static final void A03(C5Tl c5Tl, AbstractC29538Czq abstractC29538Czq, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        String A00;
        AbstractC167017dG.A1P(abstractC29538Czq, interfaceC16820sZ);
        c5Tl.Enr(-131397597);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, abstractC29538Czq);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1579968501, "instagram.features.clips.blend.ui.LoadedBlendInviteScreen (BlendInviteScreen.kt:67)");
            }
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            c5Tl.AJX(AbstractC117915Vb.A00);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1436722394);
            Object obj = C5UI.A00;
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) AbstractC25234BEr.A0c(c5Tl, A0q, obj, false);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, AbstractC25232BEp.A0y(c5Tl, c1130158n).Eq3(AbstractC118185Wd.A01));
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, abstractC29538Czq, AbstractC167007dF.A1P(i2 & 14, 4), AbstractC25227BEk.A1Z(c5Tl, A11, -1436714578));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == obj) {
                EEc = new C57262Pbk(abstractC29538Czq, A11, str, 42);
                c5Tl.FBy(EEc);
            }
            Modifier A002 = AbstractC118705Yo.A00(A02, AbstractC25225BEi.A1A(A0K, EEc, false));
            InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
            int A003 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0O, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            EnumC27362C5r enumC27362C5r = EnumC27362C5r.A03;
            int i3 = abstractC29538Czq.A01;
            String str2 = abstractC29538Czq.A04;
            String A004 = A00(c5Tl, str2, i3);
            Integer num = abstractC29538Czq.A02;
            c5Tl.Eno(388155835);
            if (num == null) {
                A00 = null;
            } else {
                A00 = A00(c5Tl, str2, num.intValue());
            }
            C117505Tk.A0L(A0K, false);
            AbstractC28504Chx.A01(c5Tl, null, new C26181Bi6(R.drawable.instagram_illustrations_product_illustration_pi_plus_blend_on_media, 155.0f), enumC27362C5r, null, A00, null, A004, null, null, null, null, 384, 0, 4034, AbstractC25226BEj.A0G(c5Tl));
            Integer num2 = abstractC29538Czq.A03;
            if (num2 != C05F.A00 && num2 != C05F.A01) {
                if (num2 == C05F.A0C) {
                    c5Tl.Eno(-851217788);
                    String A005 = C5YD.A00(c5Tl, abstractC29538Czq.A00);
                    boolean A1Z = AbstractC25234BEr.A1Z(c5Tl, 388186806, i2);
                    Object EEc2 = c5Tl.EEc();
                    if (A1Z || EEc2 == obj) {
                        EEc2 = new J8Z(interfaceC16820sZ, 46);
                        c5Tl.FBy(EEc2);
                    }
                    CGJ.A00(null, c5Tl, null, EnumC27399C7c.A04, A005, AbstractC25225BEi.A1A(A0K, EEc2, false), 196608, 89, false, false);
                } else {
                    c5Tl.Eno(-851025898);
                    CGJ.A00(null, c5Tl, null, EnumC27399C7c.A04, C5YD.A00(c5Tl, abstractC29538Czq.A00), C29844DEk.A00, 221568, 73, false, false);
                }
            } else {
                c5Tl.Eno(-851658515);
                A01(c5Tl, 0);
                Modifier A05 = AbstractC118175Wb.A05(AbstractC25226BEj.A0T(c1130158n));
                String A006 = C5YD.A00(c5Tl, abstractC29538Czq.A00);
                boolean A1Q = AbstractC25233BEq.A1Q(c5Tl, 388176117, i2);
                Object EEc3 = c5Tl.EEc();
                if (A1Q || EEc3 == obj) {
                    EEc3 = new D8K(31, interfaceC74953Yl, interfaceC16820sZ);
                    c5Tl.FBy(EEc3);
                }
                CGJ.A00(null, c5Tl, A05, EnumC27399C7c.A04, A006, AbstractC25225BEi.A1A(A0K, EEc3, false), 196614, 24, false, AbstractC25230BEn.A1X(interfaceC74953Yl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, A0K, false)) {
                C0fH.A00(-1740383427);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(abstractC29538Czq, interfaceC16820sZ, str, i, 18);
        }
    }

    public static final String A00(C5Tl c5Tl, String str, int i) {
        String A00;
        if (C0fH.A02()) {
            C0fH.A01(-1628312049, "instagram.features.clips.blend.ui.getTextWithUsername (BlendInviteScreen.kt:118)");
        }
        if (str != null) {
            c5Tl.Eno(-1009050287);
            A00 = AbstractC25228BEl.A17(c5Tl, str, i);
        } else {
            c5Tl.Eno(-1008998021);
            A00 = C5YD.A00(c5Tl, i);
        }
        if (AbstractC25230BEn.A1Y(c5Tl)) {
            C0fH.A00(927147297);
        }
        return A00;
    }

    public static final void A01(C5Tl c5Tl, int i) {
        c5Tl.Enr(1518169528);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2088740054, "instagram.features.clips.blend.ui.BlendDisclaimerComponent (BlendInviteScreen.kt:136)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28474ChS.A04(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_reels_pano_outline_24, 0), C5YD.A00(c5Tl, 2131953882), 2131953881);
            AbstractC28474ChS.A04(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_clock_dotted_pano_outline_24, 0), C5YD.A00(c5Tl, 2131953884), 2131953883);
            AbstractC28474ChS.A04(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_lock_pano_outline_24, 0), C5YD.A00(c5Tl, 2131953880), 2131953879);
            AbstractC25226BEj.A1O(c5Tl, c1130158n, 24.0f);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(2105124894);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 30);
        }
    }
}

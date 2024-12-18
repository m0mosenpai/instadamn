package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Cg0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28394Cg0 {
    public static final void A01(C5Tl c5Tl, C44527JmX c44527JmX, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        String str;
        C14360o3.A0B(c44527JmX, 0);
        AbstractC167017dG.A1P(interfaceC16820sZ, interfaceC16820sZ2);
        C14360o3.A0B(interfaceC16660sJ, 3);
        c5Tl.Enr(567578983);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c44527JmX) | i;
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
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1607783025, "com.instagram.direct.fragment.stickertray.aisticker.ui.DirectAIStickerTrayScreenPromptBar (DirectAIStickerTrayScreenPromptBar.kt:51)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c44527JmX.A05, 8);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1864730178);
            Object obj = C5UI.A00;
            C25338BJh c25338BJh = (C25338BJh) AbstractC25231BEo.A0l(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object AJX = c5Tl.AJX(C5V2.A0A);
            C73 c73 = ((C45098JxS) A02.getValue()).A01;
            boolean A1V = AbstractC25228BEl.A1V(c5Tl, AJX, AbstractC25227BEk.A1Y(c5Tl, A02, 1864734992), AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED));
            Object EEc = c5Tl.EEc();
            if (A1V || EEc == obj) {
                EEc = new PZ3(c25338BJh, interfaceC16660sJ, AJX, A02, (InterfaceC23621Ds) null, 21);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc, c73, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (((C45098JxS) A02.getValue()).A01 == C73.A03) {
                A02(c5Tl, ((C45098JxS) A02.getValue()).A04, 0, ((C45098JxS) AbstractC25227BEk.A0r(c5Tl, A02, -1174942673)).A06);
            } else if (c44527JmX.A02()) {
                KzF kzF = ((C45098JxS) AbstractC25227BEk.A0r(c5Tl, A02, -453538533)).A00;
                if (kzF != null) {
                    String str2 = kzF.A01;
                    if (str2 != null) {
                        String str3 = kzF.A00;
                        if (str3 != null) {
                            A03(c5Tl, str2, str3, new GWH(c44527JmX, 49), 0, ((C45098JxS) A02.getValue()).A06);
                        } else {
                            str = "imageUrl";
                        }
                    } else {
                        str = "prompt";
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            } else if (((C45098JxS) A02.getValue()).A01 == C73.A05) {
                c5Tl.Eno(-1174410062);
                Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
                float f = 0.9f;
                if (((C45098JxS) A02.getValue()).A06) {
                    f = 0.4f;
                }
                CH4.A00(c5Tl, AbstractC118185Wd.A06(A0T, f), null, 0, 6, 0L);
            } else {
                c5Tl.Eno(-1174244770);
            }
            A00(c5Tl, c25338BJh, (C45098JxS) AbstractC25227BEk.A0s(A0K, A02, false), interfaceC16820sZ, interfaceC16820sZ2, new C50249MHe(c44527JmX, 3), new C50359MLl(c44527JmX, 0), AbstractC25229BEm.A05(i2 << 3, 56));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1725596063);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(interfaceC16660sJ, interfaceC16820sZ2, c44527JmX, interfaceC16820sZ, i, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        if (r10 == X.C73.A06) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r30, X.C25338BJh r31, X.C45098JxS r32, X.InterfaceC16820sZ r33, X.InterfaceC16820sZ r34, X.InterfaceC16820sZ r35, X.InterfaceC16660sJ r36, int r37) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28394Cg0.A00(X.5Tl, X.BJh, X.JxS, X.0sZ, X.0sZ, X.0sZ, X.0sJ, int):void");
    }

    public static final void A02(C5Tl c5Tl, String str, int i, boolean z) {
        int i2;
        String str2;
        c5Tl.Enr(744081655);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-484329467, "com.instagram.direct.fragment.stickertray.aisticker.ui.ErrorMessage (DirectAIStickerTrayScreenPromptBar.kt:130)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            float f = 0.9f;
            if (z) {
                f = 0.4f;
            }
            Modifier A06 = AbstractC118185Wd.A06(A0T, f);
            InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A06);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0O, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5YS.A07(c5Tl, c1130158n, C5Y7.A00(c5Tl, R.drawable.instagram_error_pano_outline_24, 0), C5YJ.A05, null, 25016, 0, AbstractC25226BEj.A0F(c5Tl));
            c5Tl.Eno(-1778036826);
            if (str == null) {
                str2 = C5YD.A00(c5Tl, 2131974293);
            } else {
                str2 = str;
            }
            C117505Tk.A0L(c117505Tk, false);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0T(c5Tl, AbstractC25227BEk.A0L(AbstractC118185Wd.A07(c1130158n, 0.8f), 16.0f), AbstractC25226BEj.A0g(c5Tl), str2, A0G);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1100983846);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSX(str, z, i, 2);
        }
    }

    public static final void A03(C5Tl c5Tl, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        int i2;
        c5Tl.Enr(977793749);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z);
        }
        if ((i & 7168) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(374409672, "com.instagram.direct.fragment.stickertray.aisticker.ui.GhostPrompt (DirectAIStickerTrayScreenPromptBar.kt:158)");
            }
            boolean z2 = true;
            Modifier A0T = AbstractC25226BEj.A0T(Modifier.A00);
            float f = 0.9f;
            if (z) {
                f = 0.4f;
            }
            Modifier A06 = AbstractC118185Wd.A06(A0T, f);
            boolean A1R = AbstractC25233BEq.A1R(c5Tl, -1821787188, i2);
            int i3 = i2 & 14;
            if (i3 != 4) {
                z2 = false;
            }
            boolean z3 = A1R | z2;
            Object EEc = c5Tl.EEc();
            if (z3 || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A14(c5Tl, interfaceC16660sJ, str, 38);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0I = AbstractC25235BEs.A0I(c5Tl, c117505Tk, A06, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0O = AbstractC25235BEs.A0O(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0I);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0O, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28005CWc.A01(null, c5Tl, null, str2, "Ghost Prompt Image Crossfade", AbstractC27799CNo.A00, ((i2 >> 3) & 14) | 27648, 6);
            AbstractC28005CWc.A01(null, c5Tl, null, str, "Ghost Prompt Text Crossfade", AbstractC27799CNo.A01, i3 | 27648, 6);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-14801716);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30207DSm(str, str2, interfaceC16660sJ, i, z);
        }
    }
}

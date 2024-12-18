package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.CeC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28324CeC {
    public static final void A00(C5Tl c5Tl, C27062Bwl c27062Bwl, AbstractC151906sa abstractC151906sa, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2) {
        int i3;
        InterfaceC16820sZ interfaceC16820sZ3 = interfaceC16820sZ2;
        InterfaceC16820sZ interfaceC16820sZ4 = interfaceC16820sZ;
        boolean A1R = AbstractC167007dF.A1R(0, c27062Bwl, abstractC151906sa);
        c5Tl.Enr(2093764239);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c27062Bwl) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, abstractC151906sa);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ3);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16820sZ4 = null;
            }
            if (i5 != 0) {
                interfaceC16820sZ3 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(1013380667, "com.instagram.profile.slideoutmenu.fragment.ProfileMenuItem (ProfileMenuItem.kt:47)");
            }
            Modifier A0V = AbstractC25228BEl.A0V();
            Object AJX = c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
            C14360o3.A0C(AJX, AbstractC111324zv.A00(StringTreeSet.MAX_SYMBOL_COUNT));
            if (interfaceC16820sZ4 != null) {
                C5XQ A0W = AbstractC25225BEi.A0W(0);
                if (interfaceC16820sZ3 != null) {
                    A0V = C5X3.A02(A0V, C5XU.A00, new BG9(A0W, interfaceC16820sZ3, interfaceC16820sZ4));
                } else {
                    A0V = C5XR.A05(A0V, A0W, null, interfaceC16820sZ4, A1R);
                }
            }
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, abstractC151906sa, AbstractC25233BEq.A1W(c5Tl, c27062Bwl, AJX, -1633440220));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = C30184DRp.A00(c5Tl, c27062Bwl, AJX, abstractC151906sa, 20);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC28450Cgz.A02(c5Tl, A0V, (InterfaceC16660sJ) EEc, null, 0, 4);
            if (C0fH.A02()) {
                C0fH.A00(-244138576);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(interfaceC16820sZ3, interfaceC16820sZ4, abstractC151906sa, c27062Bwl, i, i2, 22);
        }
    }

    public static final void A01(C5Tl c5Tl, AbstractC151906sa abstractC151906sa, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(abstractC151906sa, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-331160056);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, abstractC151906sa) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2124122775, "com.instagram.profile.slideoutmenu.fragment.ProfileMenuItemComposable (ProfileMenuItem.kt:83)");
            }
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0E = AbstractC118175Wb.A0E(C5X3.A02(c1130158n, C5XU.A00, new BG9(AbstractC25225BEi.A0W(0), interfaceC16820sZ2, interfaceC16820sZ)), 16.0f, 12.0f, 12.0f, 12.0f);
            InterfaceC1127857k A0V = AbstractC25225BEi.A0V(c5Tl, interfaceC118225Wj);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0V, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6L0 c6l0 = C6L0.A00;
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            int i3 = abstractC151906sa.A00;
            String A012 = abstractC151906sa.A02.A01(A0K);
            if (A012 == null) {
                A012 = "";
            }
            A02(c5Tl, A012, i3, 0);
            AbstractC119685bS.A00(c5Tl, c6l0.A00(c1130158n));
            InterfaceC37108GWt A013 = abstractC151906sa.A01();
            if (A013 instanceof C36585GBj) {
                c5Tl.Eno(-1198715112);
                int i4 = ((C36585GBj) A013).A00;
                if (i4 > 0) {
                    c5Tl.Eno(-1198636372);
                    CGU.A00(i4, null, c5Tl, 0, A1b ? 1 : 0);
                } else {
                    c5Tl.Eno(-1198558841);
                    CGT.A00(null, c5Tl, 0, A1b ? 1 : 0);
                }
                C117505Tk.A0L(c117505Tk, false);
            } else if (C14360o3.A0K(A013, C36583GBh.A00)) {
                c5Tl.Eno(-592849349);
                CGV.A00(null, c5Tl, 0, A1b ? 1 : 0);
            } else if (C14360o3.A0K(A013, C36584GBi.A00)) {
                c5Tl.Eno(-592847535);
            } else {
                throw AbstractC25231BEo.A0v(c5Tl, c117505Tk, -592860266, false);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.Eno(-592846669);
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1510394531);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30219DSy(i, 9, interfaceC16820sZ, interfaceC16820sZ2, abstractC151906sa);
        }
    }

    public static final void A02(C5Tl c5Tl, String str, int i, int i2) {
        int i3;
        c5Tl.Enr(-1470493767);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(71121782, "com.instagram.profile.slideoutmenu.fragment.MenuItem (ProfileMenuItem.kt:119)");
            }
            C2DC A0Y = AbstractC25226BEj.A0Y(c5Tl, i3, i);
            C1130158n c1130158n = Modifier.A00;
            C5YS.A07(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 12.0f, 0.0f), A0Y, null, str, (i3 & 112) | 384, 24, 0L);
            C5WR.A0B(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 4.0f, 0.0f), AbstractC25226BEj.A0g(c5Tl), str, 5, 1, 2, AbstractC25225BEi.A03(i3), 390, 11128, AbstractC25226BEj.A0G(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(40059858);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSW(i, str, i2, 1);
        }
    }
}

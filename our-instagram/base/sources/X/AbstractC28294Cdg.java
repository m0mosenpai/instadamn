package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Cdg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28294Cdg {
    public static final void A02(C5Tl c5Tl, Modifier modifier, InterfaceC156146zi interfaceC156146zi, InterfaceC16660sJ interfaceC16660sJ, C5Hc c5Hc, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c5Hc, 1);
        AbstractC167007dF.A1E(interfaceC156146zi, 2, interfaceC16660sJ);
        c5Tl.Enr(830118871);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c5Hc);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC156146zi);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, modifier2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-337724384, "com.instagram.archive.fragment.HighlightsSettingsPreviewTray (HighlightsSettingsPreviewTray.kt:48)");
            }
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, AbstractC25225BEi.A11(c5Tl));
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, Integer.valueOf(c5Hc.size()));
            Modifier A08 = AbstractC118185Wd.A08(AbstractC118185Wd.A0D(AbstractC118175Wb.A0A(Modifier.A00, 4.0f, 0.0f), 94.0f), 135.0f);
            LazyListState A003 = C6IE.A00(c5Tl, 0, 0, 6, 2);
            Integer valueOf = Integer.valueOf(AbstractC25231BEo.A0E(A002));
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A003, -1334122151);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new MBq(A003, null, 1);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0E = AbstractC25235BEs.A0E(c5Tl, EEc, valueOf);
            Modifier A0A = AbstractC118175Wb.A0A(modifier2, 4.0f, 0.0f);
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, interfaceC156146zi, AbstractC25227BEk.A1Z(c5Tl, c5Hc, -1334113460) | AbstractC25233BEq.A1H(i3), c5Tl.AH4(A00)) | AbstractC25233BEq.A1K(i3);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = new DI9(1, interfaceC16660sJ, A00, A08, c5Hc, interfaceC156146zi, z);
                c5Tl.FBy(EEc2);
            }
            C6IS.A02(null, null, A003, c5Tl, null, A0A, AbstractC25225BEi.A1B(A0E, EEc2, false), 12582912, 124);
            if (C0fH.A02()) {
                C0fH.A00(837756690);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV4(modifier2, c5Hc, interfaceC156146zi, interfaceC16660sJ, i, i2, 1, z);
        }
    }

    public static final void A00(C5Tl c5Tl, Modifier modifier, Modifier modifier2, InterfaceC156146zi interfaceC156146zi, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, boolean z) {
        int i3;
        InterfaceC16660sJ interfaceC16660sJ;
        InterfaceC16660sJ interfaceC16660sJ2;
        InterfaceC16660sJ interfaceC16660sJ3;
        InterfaceC16660sJ interfaceC16660sJ4;
        int i4;
        c5Tl.Enr(-780026611);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i2 & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC156146zi);
        }
        if ((i2 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, modifier);
        }
        if ((196608 & i2) == 0) {
            i3 |= AbstractC25232BEp.A0W(c5Tl, modifier2);
        }
        if ((74899 & i3) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1246646043, "com.instagram.archive.fragment.HighlightDisplayItem (HighlightsSettingsPreviewTray.kt:189)");
            }
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, AbstractC117935Vd.A00);
            InterfaceC74953Yl A0U2 = AbstractC25228BEl.A0U(c5Tl, C5VZ.A00);
            InterfaceC1127857k A0M = AbstractC25236BEt.A0M(c5Tl, C118195Wf.A00, i3 >> 15);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier2);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0M, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            if (z) {
                c5Tl.Eno(926275622);
                interfaceC16660sJ = DL5.A00;
                interfaceC16660sJ2 = DL6.A00;
                interfaceC16660sJ3 = null;
                boolean A1S = AbstractC25231BEo.A1S(c5Tl, interfaceC156146zi, A0U2, AbstractC25227BEk.A1Y(c5Tl, A0U, 1415358403) | AbstractC25233BEq.A1J(i3) | AbstractC25233BEq.A1I(i3));
                Object EEc = c5Tl.EEc();
                if (A1S || EEc == C5UI.A00) {
                    EEc = new C29937DHz(A0U2, interfaceC16820sZ, A0U, interfaceC156146zi, i, 2);
                    c5Tl.FBy(EEc);
                }
                interfaceC16660sJ4 = (InterfaceC16660sJ) EEc;
                C117505Tk.A0I(c117505Tk);
                i4 = ((i3 >> 9) & 112) | 390;
            } else {
                c5Tl.Eno(927063425);
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0U, 1415380307);
                Object EEc2 = c5Tl.EEc();
                if (A1Y || EEc2 == C5UI.A00) {
                    EEc2 = AbstractC25235BEs.A13(c5Tl, A0U, 47);
                }
                interfaceC16660sJ = (InterfaceC16660sJ) EEc2;
                C117505Tk.A0I(c117505Tk);
                interfaceC16660sJ2 = DL7.A00;
                interfaceC16660sJ3 = null;
                boolean A1S2 = AbstractC25231BEo.A1S(c5Tl, interfaceC156146zi, A0U2, AbstractC25227BEk.A1Y(c5Tl, A0U, 1415384783) | AbstractC25233BEq.A1J(i3) | AbstractC25233BEq.A1I(i3));
                Object EEc3 = c5Tl.EEc();
                if (A1S2 || EEc3 == C5UI.A00) {
                    EEc3 = new C29937DHz(A0U2, interfaceC16820sZ, A0U, interfaceC156146zi, i, 3);
                    c5Tl.FBy(EEc3);
                }
                interfaceC16660sJ4 = (InterfaceC16660sJ) EEc3;
                C117505Tk.A0I(c117505Tk);
                i4 = ((i3 >> 9) & 112) | 384;
            }
            AbstractC28450Cgz.A03(c5Tl, modifier, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ4, i4, 8);
            C117505Tk.A0I(c117505Tk);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-833263496);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV4(modifier, modifier2, interfaceC156146zi, interfaceC16820sZ, i2, i, 0, z);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, InterfaceC156146zi interfaceC156146zi, int i, boolean z) {
        int i2;
        C117505Tk A0K;
        c5Tl.Enr(-176090252);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC156146zi);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(30102005, "com.instagram.archive.fragment.EmptyMyWeekItem (HighlightsSettingsPreviewTray.kt:151)");
            }
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, AbstractC25225BEi.A11(c5Tl));
            if (z) {
                c5Tl.Eno(541195939);
                DL3 dl3 = DL3.A00;
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, interfaceC156146zi, 1680031023);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == C5UI.A00) {
                    EEc = AbstractC25235BEs.A13(c5Tl, interfaceC156146zi, 46);
                }
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
                AbstractC28450Cgz.A02(c5Tl, modifier, dl3, (InterfaceC16660sJ) EEc, ((i2 >> 3) & 112) | 6, 0);
            } else {
                c5Tl.Eno(541592057);
                DL4 dl4 = DL4.A00;
                boolean A1X = AbstractC25232BEp.A1X(c5Tl, interfaceC156146zi, A00, 1680044576);
                Object EEc2 = c5Tl.EEc();
                if (A1X || EEc2 == C5UI.A00) {
                    EEc2 = AbstractC25230BEn.A12(c5Tl, interfaceC156146zi, A00, 30);
                }
                A0K = AbstractC25225BEi.A0K(c5Tl, false);
                AbstractC28450Cgz.A02(c5Tl, modifier, dl4, (InterfaceC16660sJ) EEc2, ((i2 >> 3) & 112) | 6, 0);
            }
            if (AbstractC25227BEk.A1b(A0K, false)) {
                C0fH.A00(-28005818);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 4, modifier, interfaceC156146zi, z);
        }
    }
}

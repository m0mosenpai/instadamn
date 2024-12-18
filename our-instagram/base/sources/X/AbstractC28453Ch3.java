package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.compose.foundation.layout.IntrinsicWidthElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Ch3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28453Ch3 {
    public static final CW4 A00;
    public static final CUY A01 = new CUY(true, true);

    static {
        long A02;
        long A022;
        long j = C1132359l.A09;
        long j2 = C1132359l.A01;
        A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), 0.38f);
        A022 = C5AC.A02(AbstractC1132459m.A0K[(int) (j2 & 63)], C1132359l.A03(j2), C1132359l.A02(j2), C1132359l.A01(j2), 0.38f);
        A00 = new CW4(j, j2, j2, A02, A022);
    }

    public static final void A00(CW4 cw4, C5Tl c5Tl, Modifier modifier, InterfaceC30915DiS interfaceC30915DiS, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(1447189339);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC30915DiS) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, cw4);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(177812523, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:121)");
            }
            AbstractC28413CgJ.A01(c5Tl, interfaceC30915DiS, A01, interfaceC16820sZ, C5UA.A01(c5Tl, C30487DbW.A00(cw4, modifier2, interfaceC16660sJ, 0), 795909757), (i3 & 14) | 3456 | (i3 & 112), 0);
            if (C0fH.A02()) {
                C0fH.A00(2010443670);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC30915DiS, interfaceC16820sZ, cw4, modifier2, interfaceC16660sJ, i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.CW4 r33, X.C5Tl r34, androidx.compose.ui.Modifier r35, java.lang.String r36, X.InterfaceC16820sZ r37, X.InterfaceC16610sE r38, int r39, int r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28453Ch3.A01(X.CW4, X.5Tl, androidx.compose.ui.Modifier, java.lang.String, X.0sZ, X.0sE, int, int, boolean):void");
    }

    public static final void A02(CW4 cw4, C5Tl c5Tl, Modifier modifier, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-921259293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, cw4) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16610sE);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1639397548, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:144)");
            }
            InterfaceC118225Wj interfaceC118225Wj = COB.A03;
            C5WI A012 = C5WF.A01(4.0f);
            boolean A1O = AbstractC25230BEn.A1O(3.0f);
            long j = AbstractC1132259k.A00;
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, AbstractC25227BEk.A0N(AbstractC25226BEj.A0X(AbstractC28015CWn.A01(modifier2, A012, 3.0f, j, j, A1O), cw4.A00).Eq3(new IntrinsicWidthElement(C05F.A01, C5XU.A00)), 0.0f));
            int i5 = (i3 << 3) & 7168;
            InterfaceC1127857k A0D = AbstractC25233BEq.A0D(c5Tl, i5);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0D, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A013);
            AbstractC25231BEo.A13(c5Tl, C6GM.A00, interfaceC16610sE, ((i5 >> 6) & 112) | 6);
            if (C0fH.A02()) {
                C0fH.A00(320804940);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 0, cw4, modifier2, interfaceC16610sE);
        }
    }

    public static final void A03(C5Tl c5Tl, Modifier modifier, InterfaceC30915DiS interfaceC30915DiS, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        c5Tl.Enr(712057293);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC30915DiS) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1884546742, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            if (C0fH.A02()) {
                C0fH.A01(-183190627, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            Object AJX = c5Tl.AJX(AndroidCompositionLocals_androidKt.A00);
            boolean AH4 = c5Tl.AH4(AJX) | c5Tl.AH4(A0K);
            Object EEc = c5Tl.EEc();
            if (AH4 || EEc == C5UI.A00) {
                CW4 cw4 = A00;
                long j = cw4.A00;
                TypedArray obtainStyledAttributes = A0K.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int A002 = C5AC.A00(j);
                int color = obtainStyledAttributes.getColor(0, A002);
                obtainStyledAttributes.recycle();
                if (color != A002) {
                    j = AbstractC25225BEi.A0B(color);
                }
                TypedArray obtainStyledAttributes2 = A0K.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = obtainStyledAttributes2.getColorStateList(0);
                obtainStyledAttributes2.recycle();
                long j2 = cw4.A04;
                int A003 = C5AC.A00(j2);
                if (colorStateList != null) {
                    int colorForState = colorStateList.getColorForState(new int[]{R.attr.state_enabled}, A003);
                    if (Integer.valueOf(colorForState) != null && colorForState != A003) {
                        j2 = AbstractC25225BEi.A0B(colorForState);
                    }
                }
                long j3 = cw4.A02;
                int A004 = C5AC.A00(j3);
                if (colorStateList != null) {
                    int colorForState2 = colorStateList.getColorForState(new int[]{-16842910}, A004);
                    if (Integer.valueOf(colorForState2) != null && colorForState2 != A004) {
                        j3 = AbstractC25225BEi.A0B(colorForState2);
                    }
                }
                EEc = new CW4(j, j2, j2, j3, j3);
                c5Tl.FBy(EEc);
            }
            CW4 cw42 = (CW4) EEc;
            if (C0fH.A02()) {
                C0fH.A00(-551788537);
            }
            A00(cw42, c5Tl, modifier2, interfaceC30915DiS, interfaceC16820sZ, interfaceC16660sJ, AbstractC25230BEn.A03(i3) | ((i3 << 3) & 57344), 0);
            if (C0fH.A02()) {
                C0fH.A00(-1252512705);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(interfaceC30915DiS, interfaceC16820sZ, modifier2, interfaceC16660sJ, i, i2, 2);
        }
    }
}

package X;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.FocusGroupPropertiesElement;
import androidx.compose.ui.viewinterop.FocusTargetPropertiesElement;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.Cgz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28450Cgz {
    public static final InterfaceC16660sJ A00 = BTK.A00;

    public static final BT9 A00(AnonymousClass599 anonymousClass599) {
        BT9 bt9 = anonymousClass599.A0E;
        if (bt9 != null) {
            return bt9;
        }
        AbstractC28290Cdc.A02("Required value was null.");
        throw C00O.createAndThrow();
    }

    public static final void A02(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2) {
        int i3;
        InterfaceC16660sJ interfaceC16660sJ3 = interfaceC16660sJ2;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-1783766393);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ3);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                interfaceC16660sJ3 = A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1899856989, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:107)");
            }
            A03(c5Tl, modifier2, interfaceC16660sJ, null, A00, interfaceC16660sJ3, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            if (C0fH.A02()) {
                C0fH.A00(-2003013371);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 4, interfaceC16660sJ, interfaceC16660sJ3, modifier2);
        }
    }

    public static final void A03(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16660sJ interfaceC16660sJ4, int i, int i2) {
        int i3;
        InterfaceC16620sF interfaceC16620sF;
        InterfaceC16660sJ interfaceC16660sJ5 = interfaceC16660sJ4;
        InterfaceC16660sJ interfaceC16660sJ6 = interfaceC16660sJ3;
        InterfaceC16660sJ interfaceC16660sJ7 = interfaceC16660sJ2;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-180024211);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ7);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ6);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ5);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                interfaceC16660sJ7 = null;
            }
            if (i6 != 0) {
                interfaceC16660sJ6 = A00;
            }
            if (i7 != 0) {
                interfaceC16660sJ5 = A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(326578787, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:211)");
            }
            int A002 = C5X2.A00(c5Tl);
            Modifier Eq3 = modifier2.Eq3(FocusGroupPropertiesElement.A00);
            FocusTargetNode$FocusTargetElement focusTargetNode$FocusTargetElement = FocusTargetNode$FocusTargetElement.A00;
            Modifier A01 = C5X3.A01(c5Tl, Eq3.Eq3(focusTargetNode$FocusTargetElement).Eq3(FocusTargetPropertiesElement.A00).Eq3(focusTargetNode$FocusTargetElement));
            InterfaceC1128957x A0b = AbstractC25230BEn.A0b(c5Tl);
            AnonymousClass583 anonymousClass583 = (AnonymousClass583) AbstractC25226BEj.A18(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            C07X c07x = (C07X) c5Tl.AJX(C5VN.A00);
            InterfaceC08430c6 interfaceC08430c6 = (InterfaceC08430c6) c5Tl.AJX(AndroidCompositionLocals_androidKt.A02);
            if (interfaceC16660sJ7 != null) {
                c5Tl.Eno(607871394);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, A01(c5Tl, interfaceC16660sJ, i3 & 14));
                C5XJ.A00(c5Tl, A04, C5X8.A05);
                C5XJ.A00(c5Tl, A01, DZW.A00);
                C5XJ.A00(c5Tl, A0b, DZX.A00);
                C5XJ.A00(c5Tl, c07x, DZY.A00);
                C5XJ.A00(c5Tl, interfaceC08430c6, DZZ.A00);
                C5XJ.A00(c5Tl, anonymousClass583, DZa.A00);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
                }
                C5XJ.A00(c5Tl, interfaceC16660sJ7, DZR.A00);
                C5XJ.A00(c5Tl, interfaceC16660sJ5, DZS.A00);
                interfaceC16620sF = DZT.A00;
            } else {
                c5Tl.Eno(608726777);
                InterfaceC16820sZ A012 = A01(c5Tl, interfaceC16660sJ, i3 & 14);
                C117505Tk.A0K(c117505Tk, null, null, 125, 1);
                c117505Tk.A0M = true;
                if (c117505Tk.A0K) {
                    c5Tl.AMd(A012);
                } else {
                    c5Tl.FDO();
                }
                C5XJ.A00(c5Tl, A04, C5X8.A05);
                C5XJ.A00(c5Tl, A01, DZW.A00);
                C5XJ.A00(c5Tl, A0b, DZX.A00);
                C5XJ.A00(c5Tl, c07x, DZY.A00);
                C5XJ.A00(c5Tl, interfaceC08430c6, DZZ.A00);
                C5XJ.A00(c5Tl, anonymousClass583, DZa.A00);
                InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
                }
                C5XJ.A00(c5Tl, interfaceC16660sJ5, DZU.A00);
                interfaceC16620sF = DZV.A00;
            }
            C5XJ.A00(c5Tl, interfaceC16660sJ6, interfaceC16620sF);
            c5Tl.ASW();
            if (AbstractC25227BEk.A1a(c117505Tk)) {
                C0fH.A00(-386046034);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC16660sJ5, interfaceC16660sJ7, interfaceC16660sJ, interfaceC16660sJ6, modifier2, i, i2, 2);
        }
    }

    public static final InterfaceC16820sZ A01(C5Tl c5Tl, InterfaceC16660sJ interfaceC16660sJ, int i) {
        if (C0fH.A02()) {
            C0fH.A01(-313264809, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:266)");
        }
        boolean z = false;
        int A002 = C5X2.A00(c5Tl);
        Context A0P = AbstractC25230BEn.A0P(c5Tl);
        C117615Tw A01 = C5X2.A01(c5Tl);
        InterfaceC117845Uu interfaceC117845Uu = (InterfaceC117845Uu) c5Tl.AJX(C5VP.A00);
        View view = (View) c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
        boolean AH6 = c5Tl.AH6(A0P);
        if ((((i & 14) ^ 6) > 4 && c5Tl.AH4(interfaceC16660sJ)) || (i & 6) == 4) {
            z = true;
        }
        boolean A1U = AbstractC25228BEl.A1U(c5Tl, view, AbstractC25233BEq.A1X(c5Tl, A01, interfaceC117845Uu, AH6, z), c5Tl.AH2(A002));
        Object EEc = c5Tl.EEc();
        if (A1U || EEc == C5UI.A00) {
            EEc = new C29710D8g(A0P, view, A01, interfaceC117845Uu, interfaceC16660sJ, A002);
            c5Tl.FBy(EEc);
        }
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc;
        if (C0fH.A02()) {
            C0fH.A00(1975130329);
        }
        return interfaceC16820sZ;
    }
}

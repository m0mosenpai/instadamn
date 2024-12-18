package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupLayout;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.UUID;

/* renamed from: X.CgJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28413CgJ {
    public static final C5UP A00 = new C117745Uk(AbstractC74873Yc.A00(), D9n.A00);

    public static final void A00(C5Tl c5Tl, Alignment alignment, CUY cuy, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, int i2, long j) {
        int i3;
        CUY cuy2 = cuy;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        long j2 = j;
        Alignment alignment2 = alignment;
        c5Tl.Enr(295309329);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, alignment2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0E(c5Tl, j2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0U(c5Tl, cuy2);
        }
        if ((i2 & 16) != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                alignment2 = C118195Wf.A0E;
            }
            if (i5 != 0) {
                j2 = AbstractC25230BEn.A0G();
            }
            if (i6 != 0) {
                interfaceC16820sZ2 = null;
            }
            if (i7 != 0) {
                cuy2 = new CUY(false, true);
            }
            if (C0fH.A02()) {
                C0fH.A01(50611481, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)");
            }
            boolean A1H = AbstractC25233BEq.A1H(i3) | AbstractC25231BEo.A1L(i3);
            Object EEc = c5Tl.EEc();
            if (A1H || EEc == C5UI.A00) {
                EEc = new C28871Cof(alignment2, j2);
                c5Tl.FBy(EEc);
            }
            int i8 = i3 >> 3;
            A01(c5Tl, (C28871Cof) EEc, cuy2, interfaceC16820sZ2, interfaceC16620sF, AbstractC25229BEm.A05(i8, i8 & 112), 0);
            if (C0fH.A02()) {
                C0fH.A00(-260264653);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV3(alignment2, interfaceC16820sZ2, cuy2, interfaceC16620sF, i, i2, 0, j2);
        }
    }

    public static final void A01(C5Tl c5Tl, InterfaceC30915DiS interfaceC30915DiS, CUY cuy, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        CUY cuy2 = cuy;
        InterfaceC16820sZ interfaceC16820sZ2 = interfaceC16820sZ;
        c5Tl.Enr(-830247068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC30915DiS) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, cuy2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16820sZ2 = null;
            }
            if (i5 != 0) {
                cuy2 = new CUY(false, true);
            }
            if (C0fH.A02()) {
                C0fH.A01(1340569484, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)");
            }
            View view = (View) c5Tl.AJX(AndroidCompositionLocals_androidKt.A03);
            InterfaceC1128957x A0b = AbstractC25230BEn.A0b(c5Tl);
            String str = (String) c5Tl.AJX(A00);
            Object A18 = AbstractC25226BEj.A18(c5Tl);
            C117615Tw A01 = C5X2.A01(c5Tl);
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, interfaceC16620sF);
            UUID uuid = (UUID) C6M6.A00(c5Tl, null, D9o.A00, new Object[0], 3072, 6);
            Object EEc = c5Tl.EEc();
            Object obj = C5UI.A00;
            Object obj2 = EEc;
            if (EEc == obj) {
                PopupLayout popupLayout = new PopupLayout(view, A0b, interfaceC30915DiS, cuy2, str, uuid, interfaceC16820sZ2);
                popupLayout.setContent(A01, C5UA.A04(new C30484DbT(8, A002, popupLayout), 1302892335, true));
                c5Tl.FBy(popupLayout);
                obj2 = popupLayout;
            }
            int i6 = i3 & 112;
            int i7 = i3 & 896;
            boolean A1a = AbstractC25232BEp.A1a(c5Tl, str, A18, c5Tl.AH6(obj2) | AbstractC167007dF.A1P(i6, 32) | AbstractC167007dF.A1P(i7, 256));
            Object EEc2 = c5Tl.EEc();
            if (A1a || EEc2 == obj) {
                EEc2 = new MIO(A18, cuy2, obj2, interfaceC16820sZ2, str, 0);
                c5Tl.FBy(EEc2);
            }
            C5UX.A03(c5Tl, obj2, (InterfaceC16660sJ) EEc2);
            boolean A1a2 = AbstractC25232BEp.A1a(c5Tl, str, A18, AbstractC167007dF.A1P(i6, 32) | c5Tl.AH6(obj2) | AbstractC167007dF.A1P(i7, 256));
            Object EEc3 = c5Tl.EEc();
            if (A1a2 || EEc3 == obj) {
                EEc3 = new MEC(obj2, interfaceC16820sZ2, cuy2, A18, str, 0);
                c5Tl.FBy(EEc3);
            }
            C5UX.A05(c5Tl, (InterfaceC16820sZ) EEc3);
            boolean A1S = AbstractC25235BEs.A1S(i3) | c5Tl.AH6(obj2);
            Object EEc4 = c5Tl.EEc();
            if (A1S || EEc4 == obj) {
                EEc4 = new C65076Td9(8, interfaceC30915DiS, obj2);
                c5Tl.FBy(EEc4);
            }
            C5UX.A03(c5Tl, interfaceC30915DiS, (InterfaceC16660sJ) EEc4);
            boolean AH6 = c5Tl.AH6(obj2);
            Object EEc5 = c5Tl.EEc();
            if (AH6 || EEc5 == obj) {
                EEc5 = new D52(obj2, (InterfaceC23621Ds) null, 23, 42);
                c5Tl.FBy(EEc5);
            }
            C5UX.A04(c5Tl, obj2, (InterfaceC16620sF) EEc5);
            C1130158n c1130158n = Modifier.A00;
            boolean AH62 = c5Tl.AH6(obj2);
            Object EEc6 = c5Tl.EEc();
            if (AH62 || EEc6 == obj) {
                EEc6 = DRU.A00(obj2, 43);
                c5Tl.FBy(EEc6);
            }
            Modifier A0X = AbstractC25229BEm.A0X(c1130158n, (InterfaceC16660sJ) EEc6);
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, A18, c5Tl.AH6(obj2));
            Object EEc7 = c5Tl.EEc();
            if (A1X || EEc7 == obj) {
                EEc7 = new C28832Co2(1, A18, obj2);
                c5Tl.FBy(EEc7);
            }
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0X);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, EEc7, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1125916248);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(cuy2, interfaceC30915DiS, interfaceC16820sZ2, interfaceC16620sF, i, i2, 4);
        }
    }

    public static final boolean A02(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}

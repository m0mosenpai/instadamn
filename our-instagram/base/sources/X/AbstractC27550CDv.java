package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;

/* renamed from: X.CDv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27550CDv {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        AbstractC167007dF.A1E(interfaceC16820sZ2, 1, interfaceC16620sF);
        c5Tl.Enr(98437094);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
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
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(56822932, "com.instagram.barcelona.common.ui.toast.ToastDragDismissSurface (ToastDragDismissSurface.kt:35)");
            }
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, interfaceC16820sZ);
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, interfaceC16820sZ2);
            InterfaceC1128957x A0h = AbstractC25228BEl.A0h(c5Tl);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0h, -1915759929);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new ToastDragDismissState(A00, A002, A0h);
                c5Tl.FBy(EEc);
            }
            ToastDragDismissState toastDragDismissState = (ToastDragDismissState) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5XL.A02(c5Tl);
            C5WI c5wi = C5WE.A01;
            long j = C5XL.A00(c5Tl).A11;
            long A0H = AbstractC25226BEj.A0H(c5Tl);
            boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, toastDragDismissState, -1915749636);
            Object EEc2 = c5Tl.EEc();
            if (A1Y2 || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25229BEm.A0w(c5Tl, toastDragDismissState, 28);
            }
            Modifier A09 = AbstractC25233BEq.A09(A0K, modifier2, EEc2);
            InterfaceC30902DiF interfaceC30902DiF = toastDragDismissState.A01;
            C6M3 c6m3 = C6M3.Horizontal;
            boolean z = !AbstractC25231BEo.A1U(toastDragDismissState.A06);
            boolean A1Y3 = AbstractC25227BEk.A1Y(c5Tl, toastDragDismissState, -1915733618);
            Object EEc3 = c5Tl.EEc();
            if (A1Y3 || EEc3 == C5UI.A00) {
                EEc3 = new D57(toastDragDismissState, null, 0);
                c5Tl.FBy(EEc3);
            }
            C117505Tk.A0L(A0K, false);
            InterfaceC16610sE interfaceC16610sE = BG5.A00;
            Modifier Eq3 = A09.Eq3(new DraggableElement(interfaceC30902DiF, c6m3, null, interfaceC16610sE, (InterfaceC16610sE) EEc3, z, false));
            InterfaceC30902DiF interfaceC30902DiF2 = toastDragDismissState.A02;
            C6M3 c6m32 = C6M3.Vertical;
            boolean z2 = !AbstractC25231BEo.A1U(toastDragDismissState.A05);
            boolean A1Y4 = AbstractC25227BEk.A1Y(c5Tl, toastDragDismissState, -1915724498);
            Object EEc4 = c5Tl.EEc();
            if (A1Y4 || EEc4 == C5UI.A00) {
                EEc4 = new D57(toastDragDismissState, null, 1);
                c5Tl.FBy(EEc4);
            }
            C117505Tk.A0L(A0K, false);
            C6L8.A01(null, c5Tl, Eq3.Eq3(new DraggableElement(interfaceC30902DiF2, c6m32, null, interfaceC16610sE, (InterfaceC16610sE) EEc4, z2, false)), c5wi, C5UA.A01(c5Tl, C30480DbP.A00(interfaceC16620sF, 28), 1393444900), 0.0f, 1572864, 48, j, A0H);
            if (C0fH.A02()) {
                C0fH.A00(728787993);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30492Dbb(interfaceC16820sZ2, interfaceC16820sZ, modifier2, interfaceC16620sF, i, i2, 8);
        }
    }
}

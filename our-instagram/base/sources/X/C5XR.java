package X;

import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.5XR, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5XR {
    public static final Modifier A00(InterfaceC118075Vr interfaceC118075Vr, C5XO c5xo, Modifier modifier, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        Modifier A02;
        InterfaceC118065Vq interfaceC118065Vq;
        if (interfaceC118075Vr instanceof InterfaceC118065Vq) {
            interfaceC118065Vq = (InterfaceC118065Vq) interfaceC118075Vr;
        } else if (interfaceC118075Vr == null) {
            interfaceC118065Vq = null;
        } else {
            if (c5xo != null) {
                A02 = C5WM.A00(interfaceC118075Vr, c5xo, Modifier.A00).Eq3(new ClickableElement(null, c5xo, c5xq, str, interfaceC16820sZ, z));
            } else {
                A02 = C5X3.A02(Modifier.A00, C5XU.A00, new C30558Dcf(interfaceC118075Vr, c5xq, interfaceC16820sZ, str, 0, z));
            }
            return modifier.Eq3(A02);
        }
        A02 = new ClickableElement(interfaceC118065Vq, c5xo, c5xq, str, interfaceC16820sZ, z);
        return modifier.Eq3(A02);
    }

    public static final Modifier A02(InterfaceC118075Vr interfaceC118075Vr, C5XO c5xo, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        return A00(interfaceC118075Vr, c5xo, modifier, null, null, interfaceC16820sZ, true);
    }

    public static final Modifier A03(InterfaceC118075Vr interfaceC118075Vr, C5XO c5xo, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        return A01(interfaceC118075Vr, c5xo, modifier, null, null, null, interfaceC16820sZ, true);
    }

    public static final Modifier A04(C5XO c5xo, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        return A00(null, c5xo, modifier, null, null, interfaceC16820sZ, true);
    }

    public static final Modifier A06(Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        return A05(modifier, null, null, interfaceC16820sZ, true);
    }

    public static final Modifier A01(InterfaceC118075Vr interfaceC118075Vr, C5XO c5xo, Modifier modifier, C5XQ c5xq, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, boolean z) {
        Modifier A02;
        InterfaceC118065Vq interfaceC118065Vq;
        if (interfaceC118075Vr instanceof InterfaceC118065Vq) {
            interfaceC118065Vq = (InterfaceC118065Vq) interfaceC118075Vr;
        } else if (interfaceC118075Vr == null) {
            interfaceC118065Vq = null;
        } else {
            C1130158n c1130158n = Modifier.A00;
            if (c5xo != null) {
                A02 = C5WM.A00(interfaceC118075Vr, c5xo, c1130158n).Eq3(new CombinedClickableElement(null, c5xo, c5xq, null, null, interfaceC16820sZ3, interfaceC16820sZ, interfaceC16820sZ2, z));
            } else {
                A02 = C5X3.A02(c1130158n, C5XU.A00, new C30578Dcz(interfaceC118075Vr, c5xq, interfaceC16820sZ3, interfaceC16820sZ, interfaceC16820sZ2, null, null, 0, z));
            }
            return modifier.Eq3(A02);
        }
        A02 = new CombinedClickableElement(interfaceC118065Vq, c5xo, c5xq, null, null, interfaceC16820sZ3, interfaceC16820sZ, interfaceC16820sZ2, z);
        return modifier.Eq3(A02);
    }

    public static final Modifier A05(Modifier modifier, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        return C5X3.A02(modifier, C5XU.A00, new C6LF(c5xq, str, interfaceC16820sZ, z));
    }
}

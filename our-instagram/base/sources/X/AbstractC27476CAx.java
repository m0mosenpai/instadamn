package X;

import androidx.compose.foundation.selection.ToggleableElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.CAx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27476CAx {
    public static final Modifier A00(InterfaceC118075Vr interfaceC118075Vr, C5XO c5xo, Modifier modifier, C5XQ c5xq, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        Modifier A02;
        InterfaceC118065Vq interfaceC118065Vq;
        if (interfaceC118075Vr instanceof InterfaceC118065Vq) {
            interfaceC118065Vq = (InterfaceC118065Vq) interfaceC118075Vr;
        } else if (interfaceC118075Vr == null) {
            interfaceC118065Vq = null;
        } else {
            if (c5xo != null) {
                A02 = C5WM.A00(interfaceC118075Vr, c5xo, Modifier.A00).Eq3(new ToggleableElement(null, c5xo, c5xq, interfaceC16660sJ, z, z2));
            } else {
                A02 = C5X3.A02(Modifier.A00, C5XU.A00, new C30555Dcc(1, interfaceC118075Vr, c5xq, interfaceC16660sJ, z, z2));
            }
            return modifier.Eq3(A02);
        }
        A02 = new ToggleableElement(interfaceC118065Vq, c5xo, c5xq, interfaceC16660sJ, z, z2);
        return modifier.Eq3(A02);
    }
}

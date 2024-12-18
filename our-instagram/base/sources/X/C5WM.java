package X;

import androidx.compose.foundation.IndicationModifierElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.5WM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5WM {
    public static final C5UP A00 = new C5UQ(C5WN.A00);

    public static final Modifier A00(InterfaceC118075Vr interfaceC118075Vr, C5XP c5xp, Modifier modifier) {
        if (interfaceC118075Vr != null) {
            if (interfaceC118075Vr instanceof InterfaceC118065Vq) {
                return modifier.Eq3(new IndicationModifierElement((InterfaceC118065Vq) interfaceC118075Vr, c5xp));
            }
            return C5X3.A02(modifier, C5XU.A00, new C30716DfE(1, interfaceC118075Vr, c5xp));
        }
        return modifier;
    }
}

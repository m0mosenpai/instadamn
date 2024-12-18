package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.6L0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6L0 implements C6L1 {
    public static final C6L0 A00 = new Object();

    @Override // X.C6L1
    public final Modifier FE5(Modifier modifier, float f, boolean z) {
        if (f > 0.0d) {
            if (f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            return modifier.Eq3(new LayoutWeightElement(z, f));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0Z("invalid weight ", "; must be greater than zero", f));
    }

    public final Modifier A00(Modifier modifier) {
        return FE5(modifier, 1.0f, true);
    }

    @Override // X.C6L1
    public final Modifier AB7(InterfaceC118225Wj interfaceC118225Wj, Modifier modifier) {
        return modifier.Eq3(new VerticalAlignElement(interfaceC118225Wj));
    }
}

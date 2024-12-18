package X;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.6GM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GM implements C6GN {
    public static final C6GM A00 = new Object();

    public final Modifier A00(Modifier modifier, boolean z) {
        return modifier.Eq3(new LayoutWeightElement(z, 1.0f));
    }

    @Override // X.C6GN
    public final Modifier AB6(InterfaceC118245Wl interfaceC118245Wl, Modifier modifier) {
        return modifier.Eq3(new HorizontalAlignElement(interfaceC118245Wl));
    }
}

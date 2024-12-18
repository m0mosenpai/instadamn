package X;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.5Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118175Wb {
    public static final Modifier A07(Modifier modifier) {
        return A0E(modifier, 0.0f, 8.0f, 0.0f, 0.0f);
    }

    public static final Modifier A08(Modifier modifier, float f) {
        return modifier.Eq3(new PaddingElement(new C206759Dg(f, 0), f, f, f, f));
    }

    public static final Modifier A0A(Modifier modifier, float f, float f2) {
        return modifier.Eq3(new PaddingElement(new C206769Dh(0, f, f2), f, f2, f, f2));
    }

    public static final Modifier A00(InterfaceC1333460b interfaceC1333460b, Modifier modifier) {
        return modifier.Eq3(new PaddingValuesElement(interfaceC1333460b, new C206929Dx(interfaceC1333460b, 13)));
    }

    public static final Modifier A01(Modifier modifier) {
        return A08(modifier, 12.0f);
    }

    public static final Modifier A02(Modifier modifier) {
        return A08(modifier, 16.0f);
    }

    public static final Modifier A03(Modifier modifier) {
        return A08(modifier, 8.0f);
    }

    public static final Modifier A04(Modifier modifier) {
        return A0A(modifier, 16.0f, 12.0f);
    }

    public static final Modifier A05(Modifier modifier) {
        return A0A(modifier, 16.0f, 0.0f);
    }

    public static final Modifier A06(Modifier modifier) {
        return A0A(modifier, 12.0f, 0.0f);
    }

    public static final Modifier A09(Modifier modifier, float f) {
        return A0A(modifier, 16.0f, f);
    }

    public static final Modifier A0B(Modifier modifier, float f, float f2, float f3) {
        return A0E(modifier, 12.0f, f, f2, f3);
    }

    public static final Modifier A0C(Modifier modifier, float f, float f2, float f3) {
        return A0E(modifier, f, 8.0f, f2, f3);
    }

    public static final Modifier A0D(Modifier modifier, float f, float f2, float f3) {
        return A0E(modifier, f, f2, 16.0f, f3);
    }

    public static final Modifier A0E(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.Eq3(new PaddingElement(new C5YH(), f, f2, f3, f4));
    }
}

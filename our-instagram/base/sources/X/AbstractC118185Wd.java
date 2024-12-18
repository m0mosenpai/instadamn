package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.5Wd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118185Wd {
    public static final FillElement A00;
    public static final FillElement A01;
    public static final FillElement A02;
    public static final WrapContentElement A03;
    public static final WrapContentElement A04;
    public static final WrapContentElement A05;
    public static final WrapContentElement A06;
    public static final WrapContentElement A07;
    public static final WrapContentElement A08;

    static {
        Integer num = C05F.A01;
        A02 = new FillElement(num, 1.0f);
        Integer num2 = C05F.A00;
        A00 = new FillElement(num2, 1.0f);
        Integer num3 = C05F.A0C;
        A01 = new FillElement(num3, 1.0f);
        InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
        A07 = new WrapContentElement(num, interfaceC118245Wl, new C30193DRy(interfaceC118245Wl, 6));
        InterfaceC118245Wl interfaceC118245Wl2 = C118195Wf.A02;
        A08 = new WrapContentElement(num, interfaceC118245Wl2, new C30193DRy(interfaceC118245Wl2, 6));
        InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
        A03 = new WrapContentElement(num2, interfaceC118225Wj, new C30193DRy(interfaceC118225Wj, 4));
        InterfaceC118225Wj interfaceC118225Wj2 = C118195Wf.A05;
        A04 = new WrapContentElement(num2, interfaceC118225Wj2, new C30193DRy(interfaceC118225Wj2, 4));
        Alignment alignment = C118195Wf.A09;
        A05 = new WrapContentElement(num3, alignment, new C30193DRy(alignment, 5));
        Alignment alignment2 = C118195Wf.A0E;
        A06 = new WrapContentElement(num3, alignment2, new C30193DRy(alignment2, 5));
    }

    public static final Modifier A00(InterfaceC118245Wl interfaceC118245Wl, Modifier modifier) {
        WrapContentElement wrapContentElement;
        if (C14360o3.A0K(interfaceC118245Wl, C118195Wf.A00)) {
            wrapContentElement = A07;
        } else if (C14360o3.A0K(interfaceC118245Wl, C118195Wf.A02)) {
            wrapContentElement = A08;
        } else {
            wrapContentElement = new WrapContentElement(C05F.A01, interfaceC118245Wl, new C30193DRy(interfaceC118245Wl, 6));
        }
        return modifier.Eq3(wrapContentElement);
    }

    public static final Modifier A01(InterfaceC118225Wj interfaceC118225Wj, Modifier modifier) {
        WrapContentElement wrapContentElement;
        if (C14360o3.A0K(interfaceC118225Wj, C118195Wf.A04)) {
            wrapContentElement = A03;
        } else if (C14360o3.A0K(interfaceC118225Wj, C118195Wf.A05)) {
            wrapContentElement = A04;
        } else {
            wrapContentElement = new WrapContentElement(C05F.A00, interfaceC118225Wj, new C30193DRy(interfaceC118225Wj, 4));
        }
        return modifier.Eq3(wrapContentElement);
    }

    public static final Modifier A02(Alignment alignment, Modifier modifier) {
        WrapContentElement wrapContentElement;
        if (C14360o3.A0K(alignment, C118195Wf.A09)) {
            wrapContentElement = A05;
        } else if (C14360o3.A0K(alignment, C118195Wf.A0E)) {
            wrapContentElement = A06;
        } else {
            wrapContentElement = new WrapContentElement(C05F.A0C, alignment, new C30193DRy(alignment, 5));
        }
        return modifier.Eq3(wrapContentElement);
    }

    public static final Modifier A03(Modifier modifier) {
        return A0C(modifier, 16.0f);
    }

    public static final Modifier A04(Modifier modifier) {
        return A0C(modifier, 24.0f);
    }

    public static final Modifier A05(Modifier modifier, float f) {
        return A0E(modifier, Float.NaN, f);
    }

    public static final Modifier A06(Modifier modifier, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = A00;
        } else {
            fillElement = new FillElement(C05F.A00, f);
        }
        return modifier.Eq3(fillElement);
    }

    public static final Modifier A07(Modifier modifier, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = A02;
        } else {
            fillElement = new FillElement(C05F.A01, f);
        }
        return modifier.Eq3(fillElement);
    }

    public static final Modifier A08(Modifier modifier, float f) {
        return modifier.Eq3(new SizeElement(C5XU.A00, Float.NaN, f, Float.NaN, f, true));
    }

    public static final Modifier A09(Modifier modifier, float f) {
        return A0F(modifier, f, Float.NaN);
    }

    public static final Modifier A0A(Modifier modifier, float f) {
        return modifier.Eq3(new SizeElement(C5XU.A00, Float.NaN, f, Float.NaN, f, false));
    }

    public static final Modifier A0B(Modifier modifier, float f) {
        return modifier.Eq3(new SizeElement(C5XU.A00, f, f, f, f, false));
    }

    public static final Modifier A0C(Modifier modifier, float f) {
        return modifier.Eq3(new SizeElement(C5XU.A00, f, f, f, f, true));
    }

    public static final Modifier A0D(Modifier modifier, float f) {
        return modifier.Eq3(new SizeElement(C5XU.A00, f, Float.NaN, f, Float.NaN, true));
    }

    public static final Modifier A0E(Modifier modifier, float f, float f2) {
        return modifier.Eq3(new UnspecifiedConstraintsElement(f, f2));
    }

    public static final Modifier A0F(Modifier modifier, float f, float f2) {
        return modifier.Eq3(new SizeElement(C5XU.A00, Float.NaN, f, Float.NaN, f2, true));
    }

    public static final Modifier A0G(Modifier modifier, float f, float f2) {
        return modifier.Eq3(new SizeElement(C5XU.A00, f, f2, f, f2, true));
    }

    public static final Modifier A0H(Modifier modifier, float f, float f2) {
        return modifier.Eq3(new SizeElement(C5XU.A00, f, Float.NaN, f2, Float.NaN, true));
    }

    public static final Modifier A0I(Modifier modifier, float f, float f2, float f3, float f4) {
        return modifier.Eq3(new SizeElement(C5XU.A00, f, f2, f3, f4, true));
    }
}

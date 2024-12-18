package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.5Yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC118635Yc {
    public static final Modifier A00(C5XO c5xo, Modifier modifier, C5XQ c5xq, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, boolean z) {
        C14360o3.A0B(modifier, 0);
        C14360o3.A0B(c5xo, 1);
        C14360o3.A0B(interfaceC16820sZ2, 8);
        return AbstractC118655Yf.A00(c5xo, AbstractC118645Yd.A00(c5xo, modifier, 0.3f, z), c5xq, null, interfaceC16820sZ, null, interfaceC16820sZ2, z);
    }

    public static final Modifier A01(C5Tl c5Tl, Modifier modifier, C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z) {
        C5XQ c5xq2 = c5xq;
        String str2 = str;
        boolean z2 = z;
        C14360o3.A0B(modifier, 0);
        C14360o3.A0B(interfaceC16820sZ, 4);
        c5Tl.Eno(-1688117308);
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            c5xq2 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(2034249971, "com.instagram.compose.igds.core.igdsAlphaClickable (IgdsAlphaClickable.kt:39)");
        }
        c5Tl.Eno(-1572225781);
        Object EEc = c5Tl.EEc();
        if (EEc == C5UI.A00) {
            EEc = new C5XN();
            ((C117505Tk) c5Tl).A0Q(EEc);
        }
        C5XO c5xo = (C5XO) EEc;
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        C14360o3.A0B(c5xo, 1);
        Modifier A00 = AbstractC118655Yf.A00(c5xo, AbstractC118645Yd.A00(c5xo, modifier, 0.3f, z2), c5xq2, str2, null, null, interfaceC16820sZ, z2);
        if (C0fH.A02()) {
            C0fH.A00(933887876);
        }
        C117505Tk.A0L(c117505Tk, false);
        return A00;
    }

    public static final Modifier A02(C5Tl c5Tl, Modifier modifier, C5XQ c5xq, InterfaceC16820sZ interfaceC16820sZ) {
        return A01(c5Tl, modifier, c5xq, null, interfaceC16820sZ, 3, false);
    }

    public static final Modifier A03(C5Tl c5Tl, Modifier modifier, String str, InterfaceC16820sZ interfaceC16820sZ) {
        return A01(c5Tl, modifier, null, str, interfaceC16820sZ, 5, false);
    }

    public static final Modifier A04(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ) {
        return A01(c5Tl, modifier, null, null, interfaceC16820sZ, 7, false);
    }
}

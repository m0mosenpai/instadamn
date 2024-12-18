package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class BG9 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C5XQ A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BG9(C5XQ c5xq, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        super(3);
        this.A00 = c5xq;
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5XO c5xo;
        C117505Tk c117505Tk;
        boolean z;
        C5Tl c5Tl = (C5Tl) obj2;
        ((Number) obj3).intValue();
        c5Tl.Eno(1969174843);
        if (C0fH.A02()) {
            C0fH.A01(-235592561, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
        }
        InterfaceC118075Vr interfaceC118075Vr = (InterfaceC118075Vr) c5Tl.AJX(C5WM.A00);
        if (interfaceC118075Vr instanceof InterfaceC118065Vq) {
            c5Tl.Eno(-1726989699);
            c117505Tk = (C117505Tk) c5Tl;
            z = false;
            C117505Tk.A0L(c117505Tk, false);
            c5xo = null;
        } else {
            c5Tl.Eno(-1726881726);
            Object EEc = c5Tl.EEc();
            if (EEc == C5UI.A00) {
                EEc = new C5XN();
                c5Tl.FBy(EEc);
            }
            c5xo = (C5XO) EEc;
            c117505Tk = (C117505Tk) c5Tl;
            z = false;
            C117505Tk.A0I(c117505Tk);
        }
        Modifier A01 = C5XR.A01(interfaceC118075Vr, c5xo, Modifier.A00, this.A00, this.A02, null, this.A01, true);
        if (C0fH.A02()) {
            C0fH.A00(-111290593);
        }
        C117505Tk.A0L(c117505Tk, z);
        return A01;
    }
}

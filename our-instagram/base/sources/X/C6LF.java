package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6LF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6LF extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ C5XQ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6LF(C5XQ c5xq, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        super(3);
        this.A03 = z;
        this.A01 = str;
        this.A00 = c5xq;
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5XO c5xo;
        boolean z;
        C5Tl c5Tl = (C5Tl) obj2;
        ((Number) obj3).intValue();
        c5Tl.Eno(-756081143);
        if (C0fH.A02()) {
            C0fH.A01(1513150614, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:112)");
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        InterfaceC118075Vr interfaceC118075Vr = (InterfaceC118075Vr) C5UT.A01(C5WM.A00, C117505Tk.A04(c117505Tk));
        if (interfaceC118075Vr instanceof InterfaceC118065Vq) {
            c5Tl.Eno(617140216);
            z = false;
            C117505Tk.A0L(c117505Tk, false);
            c5xo = null;
        } else {
            c5Tl.Eno(617248189);
            Object EEc = c5Tl.EEc();
            if (EEc == C5UI.A00) {
                EEc = new C5XN();
                c117505Tk.A0Q(EEc);
            }
            c5xo = (C5XO) EEc;
            z = false;
            C117505Tk.A0I(c117505Tk);
        }
        C1130158n c1130158n = Modifier.A00;
        boolean z2 = this.A03;
        Modifier A00 = C5XR.A00(interfaceC118075Vr, c5xo, c1130158n, this.A00, this.A01, this.A02, z2);
        if (C0fH.A02()) {
            C0fH.A00(-300821045);
        }
        C117505Tk.A0L(c117505Tk, z);
        return A00;
    }
}

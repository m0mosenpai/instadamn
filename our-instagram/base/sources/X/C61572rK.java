package X;

/* renamed from: X.2rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61572rK {
    public final InterfaceC53892dT A00;
    public final InterfaceC53772dG A01;

    public final boolean A00() {
        Float f;
        float f2;
        InterfaceC53892dT interfaceC53892dT = this.A00;
        if (interfaceC53892dT != null) {
            float f3 = interfaceC53892dT.C4b().A01;
            if (interfaceC53892dT.Aq9() != null) {
                if (f3 > 0.0f) {
                    f2 = 1.0f - f3;
                } else {
                    f2 = 1.0f + f3;
                }
                f = Float.valueOf(f2);
                return C14360o3.A0I(f, 0.0f);
            }
        }
        f = null;
        return C14360o3.A0I(f, 0.0f);
    }

    public final boolean A01() {
        Float f;
        InterfaceC53892dT interfaceC53892dT = this.A00;
        Float f2 = null;
        if (interfaceC53892dT != null) {
            f = Float.valueOf(interfaceC53892dT.C4b().A01);
            if (interfaceC53892dT.Aq9() != null) {
                f2 = Float.valueOf(0.0f);
            }
        } else {
            f = null;
        }
        if (C14360o3.A0J(f, f2)) {
            InterfaceC53772dG interfaceC53772dG = this.A01;
            if (interfaceC53772dG == null || !interfaceC53772dG.CYq()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C61572rK(InterfaceC53772dG interfaceC53772dG, InterfaceC53892dT interfaceC53892dT) {
        this.A00 = interfaceC53892dT;
        this.A01 = interfaceC53772dG;
    }
}

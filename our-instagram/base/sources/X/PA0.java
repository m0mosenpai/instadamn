package X;

/* loaded from: classes9.dex */
public final class PA0 implements InterfaceC58062Pon, InterfaceC57853PlJ {
    public final boolean A00;
    public final EnumC53328Ni7 A01;
    public final InterfaceC16660sJ A02;

    public PA0(Integer num, boolean z) {
        EnumC53328Ni7 enumC53328Ni7;
        this.A00 = z;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue != 3) {
                    if (intValue == 2) {
                        enumC53328Ni7 = EnumC53328Ni7.A1L;
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    enumC53328Ni7 = EnumC53328Ni7.A1J;
                }
            } else {
                enumC53328Ni7 = EnumC53328Ni7.A1K;
            }
        } else {
            enumC53328Ni7 = EnumC53328Ni7.A1I;
        }
        this.A01 = enumC53328Ni7;
        this.A02 = C57754Pjh.A00(this, 47);
    }

    @Override // X.InterfaceC58062Pon
    public final InterfaceC16660sJ Avc() {
        return this.A02;
    }

    @Override // X.InterfaceC58062Pon
    public final EnumC53328Ni7 C0P() {
        return this.A01;
    }
}

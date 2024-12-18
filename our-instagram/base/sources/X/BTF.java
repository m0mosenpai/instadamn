package X;

/* loaded from: classes5.dex */
public final class BTF implements C2VK {
    public final C75803al A00;
    public final C43888Jav A01;

    @Override // X.C2VK
    public final boolean AG4(String str, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        return this.A00.A08(str, interfaceC16660sJ, i, z);
    }

    @Override // X.C2VK
    public final Object Ajj(Object obj, String str, int i, boolean z) {
        C14360o3.A0B(obj, 2);
        return this.A00.A00(obj, str, i, z);
    }

    @Override // X.C2VK
    public final void FBB(InterfaceC1124255u interfaceC1124255u, String str, String str2, boolean z) {
        boolean A1R = AbstractC167007dF.A1R(0, str, interfaceC1124255u);
        C43888Jav c43888Jav = this.A01;
        AbstractC25225BEi.A1U(c43888Jav.A01, new CW9(interfaceC1124255u, str, str2, z, A1R, false));
    }

    @Override // X.C2VK
    public final void FBC(InterfaceC1124255u interfaceC1124255u, String str, String str2, boolean z) {
        AbstractC167007dF.A1K(str, interfaceC1124255u);
        C43888Jav c43888Jav = this.A01;
        AbstractC25225BEi.A1U(c43888Jav.A01, new CW9(interfaceC1124255u, str, str2, z, false, false));
    }

    @Override // X.C2VK
    public final void FCI(C125975mo c125975mo, String str, String str2, boolean z) {
        boolean A1R = AbstractC167007dF.A1R(0, str, c125975mo);
        C43888Jav c43888Jav = this.A01;
        AbstractC25225BEi.A1U(c43888Jav.A01, new CW9(c125975mo, str, str2, z, A1R, false));
    }

    @Override // X.C2VK
    public final void FCJ(C125975mo c125975mo, String str, boolean z) {
        boolean A1R = AbstractC167007dF.A1R(0, str, c125975mo);
        C43888Jav c43888Jav = this.A01;
        AbstractC25225BEi.A1U(c43888Jav.A01, new CW9(c125975mo, str, null, z, false, A1R));
    }

    @Override // X.C2VK
    public final void FCK(C125975mo c125975mo, String str, String str2, boolean z) {
        AbstractC167007dF.A1K(str, c125975mo);
        C43888Jav c43888Jav = this.A01;
        AbstractC25225BEi.A1U(c43888Jav.A01, new CW9(c125975mo, str, str2, z, false, false));
    }

    @Override // X.C2VK
    public final boolean AG3(Object obj, String str, int i, boolean z) {
        return this.A00.A08(str, new C206999Ee(obj, 18), i, z);
    }

    @Override // X.C2VK
    public final boolean CUq() {
        return this.A00.A06.A01;
    }

    @Override // X.C2VK
    public final void E78(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00.A06(obj, obj2, str, i, z);
    }

    @Override // X.C2VK
    public final void EG7(String str, boolean z) {
        throw new UnsupportedOperationException("This API should not be invoked. Nested Litho Tree updates will\nbe cleared when nested layout state is committed.");
    }

    @Override // X.C2VK
    public final void EUa(boolean z) {
        this.A00.A06.A01 = z;
    }

    public BTF(C75803al c75803al, C43888Jav c43888Jav) {
        this.A00 = c75803al;
        this.A01 = c43888Jav;
    }
}

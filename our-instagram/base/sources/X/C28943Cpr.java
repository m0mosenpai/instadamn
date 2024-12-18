package X;

/* renamed from: X.Cpr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28943Cpr implements C2Z1 {
    public final C2XE A00;
    public final C168887gN A01 = new C168887gN();

    public final void A00(Iterable iterable, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF) {
        boolean z;
        C14360o3.A0B(iterable, 0);
        C168937gS c168937gS = new C168937gS(this.A00);
        for (Object obj : iterable) {
            C168887gN c168887gN = this.A01;
            Object invoke = interfaceC16660sJ.invoke(obj);
            if (interfaceC16660sJ2 != null) {
                z = AbstractC25231BEo.A1a(obj, interfaceC16660sJ2);
            } else {
                z = false;
            }
            c168887gN.A00((AbstractC50812Vc) interfaceC16620sF.invoke(c168937gS, obj), invoke, -1.0f, -1.0f, z);
        }
    }

    public C28943Cpr(C2XE c2xe) {
        this.A00 = c2xe;
    }

    @Override // X.C2Z1
    public final C2XE ArD() {
        return this.A00;
    }

    @Override // X.C2YS
    public final C2XH BoZ() {
        return AbstractC25229BEm.A0b(this);
    }
}

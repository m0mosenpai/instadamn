package X;

/* renamed from: X.7gM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168877gM implements C2Z1 {
    public final C2XE A00;
    public final C168887gN A01 = new C168887gN();

    public final void A01(Iterable iterable, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(iterable, 0);
        C168937gS c168937gS = new C168937gS(this.A00);
        for (Object obj : iterable) {
            this.A01.A00((AbstractC50812Vc) interfaceC16620sF.invoke(c168937gS, obj), interfaceC16660sJ.invoke(obj), -1.0f, -1.0f, false);
        }
    }

    public final void A00(AbstractC50812Vc abstractC50812Vc, Object obj, float f, float f2) {
        this.A01.A00(abstractC50812Vc, obj, f, f2, false);
    }

    @Override // X.C2Z1
    public final C2XE ArD() {
        return this.A00;
    }

    public C168877gM(C2XE c2xe) {
        this.A00 = c2xe;
    }

    @Override // X.C2YS
    public final C2XH BoZ() {
        C2XH c2xh = ArD().A0D;
        C14360o3.A07(c2xh);
        return c2xh;
    }
}

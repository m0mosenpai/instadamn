package X;

/* renamed from: X.GGx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36728GGx implements InterfaceC1119153d {
    public final /* synthetic */ EI9 A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16820sZ A02;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C36728GGx(EI9 ei9, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A00 = ei9;
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        EI9 ei9 = this.A00;
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A02;
        InterfaceC09390do interfaceC09390do = ei9.A02;
        if (!AbstractC162267Oo.A02(AbstractC166987dD.A0r(interfaceC09390do)) && interfaceC16820sZ2 != null) {
            interfaceC16820sZ2.invoke();
        } else if (AbstractC162267Oo.A02(AbstractC166987dD.A0r(interfaceC09390do)) && interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        AbstractC167017dG.A0y(ei9.getActivity(), C3DN.A00);
    }
}

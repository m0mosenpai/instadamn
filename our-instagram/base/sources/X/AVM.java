package X;

/* loaded from: classes4.dex */
public final class AVM implements InterfaceC176007sJ {
    public final /* synthetic */ C180037yt A00;

    public AVM(C180037yt c180037yt) {
        this.A00 = c180037yt;
    }

    @Override // X.InterfaceC176007sJ
    public final /* bridge */ /* synthetic */ void A9q(Object obj) {
        C180037yt c180037yt;
        InterfaceC178817wt interfaceC178817wt;
        InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) obj;
        if (interfaceC185788Ly != null && (interfaceC178817wt = (c180037yt = this.A00).A04) != null) {
            C197898p0 c197898p0 = new C197898p0(interfaceC185788Ly, interfaceC178817wt.Ac3());
            c197898p0.A00 = -c180037yt.A00;
            c180037yt.A04.BQq().A8h(c197898p0, 0);
        }
    }

    @Override // X.InterfaceC176007sJ
    public final /* bridge */ /* synthetic */ void EG4(Object obj) {
        InterfaceC178817wt interfaceC178817wt = this.A00.A04;
        if (interfaceC178817wt != null) {
            interfaceC178817wt.BQq().EFO(0, obj);
        }
    }
}

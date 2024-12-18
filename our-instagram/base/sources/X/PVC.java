package X;

/* loaded from: classes9.dex */
public final class PVC implements InterfaceC19390xP {
    public final /* synthetic */ String A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public PVC(String str, InterfaceC19390xP interfaceC19390xP) {
        this.A01 = interfaceC19390xP;
        this.A00 = str;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A01, new PVP(this.A00, interfaceC19960yQ, 0));
    }
}

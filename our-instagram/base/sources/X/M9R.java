package X;

/* loaded from: classes8.dex */
public final class M9R implements InterfaceC19390xP {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC19390xP A02;

    public M9R(String str, String str2, InterfaceC19390xP interfaceC19390xP) {
        this.A02 = interfaceC19390xP;
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        return AbstractC167017dG.A0i(interfaceC23621Ds, this.A02, new M9Z(interfaceC19960yQ, this.A01, this.A00, 1));
    }
}

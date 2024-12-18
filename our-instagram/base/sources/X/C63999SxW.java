package X;

/* renamed from: X.SxW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63999SxW implements InterfaceC48212Jk {
    public final /* synthetic */ SF0 A00;

    public C63999SxW(SF0 sf0) {
        this.A00 = sf0;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        SF0 sf0 = this.A00;
        AbstractC167007dF.A1C(th);
        sf0.A00.A04.A03("", "", th.getMessage());
        InterfaceC196048lu interfaceC196048lu = sf0.A01;
        if (interfaceC196048lu != null) {
            interfaceC196048lu.onFailure();
        }
    }
}

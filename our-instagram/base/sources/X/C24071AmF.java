package X;

/* renamed from: X.AmF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24071AmF implements InterfaceC125355lh {
    public final /* synthetic */ C8Z9 A00;

    public C24071AmF(C8Z9 c8z9) {
        this.A00 = c8z9;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        InterfaceC25206BDe interfaceC25206BDe;
        C8Z9 c8z9 = this.A00;
        C180667zu c180667zu = c8z9.A01;
        if (c180667zu != null && (interfaceC25206BDe = (InterfaceC25206BDe) c8z9.A05.get(c180667zu.A09)) != null) {
            interfaceC25206BDe.Dop();
        }
        c8z9.A01 = null;
    }
}

package X;

/* renamed from: X.Ajl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23951Ajl implements InterfaceC199918sv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8PV A01;
    public final /* synthetic */ C8PR A02;

    public C23951Ajl(C8PV c8pv, C8PR c8pr, int i) {
        this.A02 = c8pr;
        this.A01 = c8pv;
        this.A00 = i;
    }

    @Override // X.InterfaceC199918sv
    public final void onClick() {
        C8PR c8pr = this.A02;
        C8QJ c8qj = c8pr.A05;
        c8qj.getClass();
        c8qj.dismiss();
        C8PR.A03(this.A01, c8pr, true);
        C8PR.A05(c8pr, this.A00);
    }
}

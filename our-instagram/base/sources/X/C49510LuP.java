package X;

/* renamed from: X.LuP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49510LuP implements InterfaceC50487MQp {
    public final /* synthetic */ KRB A00;

    public C49510LuP(KRB krb) {
        this.A00 = krb;
    }

    @Override // X.InterfaceC50487MQp
    public final void DAq() {
        LIu lIu = LEB.A01;
        KRB krb = this.A00;
        lIu.A03(krb.A03, krb.A01);
        krb.A02.A02(krb.A04.A02(krb.A0A), C49753LyM.A00);
        InterfaceC50429MOj interfaceC50429MOj = ((AbstractC46524KiP) krb).A00;
        if (interfaceC50429MOj != null) {
            interfaceC50429MOj.onDismiss();
        }
    }

    @Override // X.InterfaceC50487MQp
    public final void Dar() {
        KRB krb = this.A00;
        krb.A02.A02(krb.A04.A03(krb.A0E, new C43603JQj(this, 21)), C49754LyN.A00);
    }

    @Override // X.InterfaceC50487MQp
    public final void Dja() {
        KRB krb = this.A00;
        krb.A02.A02(krb.A04.A03(krb.A0G, new C43603JQj(this, 22)), C49755LyO.A00);
    }
}

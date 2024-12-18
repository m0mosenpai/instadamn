package X;

/* renamed from: X.StF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63759StF implements InterfaceC65471Tko {
    public final /* synthetic */ C63784Ste A00;
    public final /* synthetic */ SFV A01;

    public C63759StF(C63784Ste c63784Ste, SFV sfv) {
        this.A00 = c63784Ste;
        this.A01 = sfv;
    }

    @Override // X.InterfaceC65471Tko
    public final void D9H(Object obj) {
        C63784Ste c63784Ste = this.A00;
        SFV sfv = this.A01;
        SFV sfv2 = c63784Ste.A05;
        if (sfv2 != null && sfv2 == sfv) {
            S9K s9k = c63784Ste.A01.A06;
            if (obj != null) {
                Integer Avo = sfv.A01.Avo();
                if (!(s9k instanceof QBD) ? !(!(s9k instanceof QBC) || Avo == C05F.A0C || Avo == C05F.A0Y) : AbstractC167007dF.A1X(Avo, C05F.A01)) {
                    c63784Ste.A06 = obj;
                    c63784Ste.A00.EJU();
                    return;
                }
            }
            InterfaceC65536Tm8 interfaceC65536Tm8 = c63784Ste.A00;
            InterfaceC65617To8 interfaceC65617To8 = sfv.A00;
            InterfaceC65570Tn3 interfaceC65570Tn3 = sfv.A01;
            interfaceC65536Tm8.D9F(interfaceC65617To8, c63784Ste.A04, interfaceC65570Tn3, interfaceC65570Tn3.Avo(), obj);
        }
    }

    @Override // X.InterfaceC65471Tko
    public final void DPj(Exception exc) {
        C63784Ste c63784Ste = this.A00;
        SFV sfv = this.A01;
        SFV sfv2 = c63784Ste.A05;
        if (sfv2 != null && sfv2 == sfv) {
            InterfaceC65536Tm8 interfaceC65536Tm8 = c63784Ste.A00;
            C63727Ssh c63727Ssh = c63784Ste.A04;
            InterfaceC65570Tn3 interfaceC65570Tn3 = sfv.A01;
            interfaceC65536Tm8.D9E(c63727Ssh, interfaceC65570Tn3, exc, interfaceC65570Tn3.Avo());
        }
    }
}

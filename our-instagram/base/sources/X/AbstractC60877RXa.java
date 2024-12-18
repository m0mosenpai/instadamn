package X;

/* renamed from: X.RXa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60877RXa extends TER {
    public RYn A00;
    public boolean A01 = false;
    public final RYn A02;

    public final RYn A03() {
        if (!this.A01) {
            RYn rYn = this.A00;
            AbstractC58320PtC.A0f(rYn).Cmk(rYn);
            this.A01 = true;
        }
        return this.A00;
    }

    public final void A04() {
        if (this.A01) {
            RYn rYn = (RYn) this.A00.A0K(C05F.A0N, null, null);
            AbstractC58320PtC.A0f(rYn).CpL(rYn, this.A00);
            this.A00 = rYn;
            this.A01 = false;
        }
    }

    @Override // X.InterfaceC65445TkH
    public final /* bridge */ /* synthetic */ RYn AwI() {
        return this.A02;
    }

    @Override // X.TER
    public final /* bridge */ /* synthetic */ Object clone() {
        AbstractC60877RXa abstractC60877RXa = (AbstractC60877RXa) this.A02.A0K(C05F.A0Y, null, null);
        abstractC60877RXa.A05(A03());
        return abstractC60877RXa;
    }

    public AbstractC60877RXa(RYn rYn) {
        this.A02 = rYn;
        this.A00 = (RYn) rYn.A0K(C05F.A0N, null, null);
    }

    public final RYn A02() {
        RYn A03 = A03();
        if (RYn.A0C(A03)) {
            return A03;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void A05(RYn rYn) {
        A04();
        RYn rYn2 = this.A00;
        AbstractC58320PtC.A0f(rYn2).CpL(rYn2, rYn);
    }
}

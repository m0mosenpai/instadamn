package X;

/* loaded from: classes10.dex */
public abstract class ROQ extends AbstractC64252T6b {
    public RO8 A00;
    public final RO8 A01;

    @Override // X.InterfaceC65421Tjs
    public final /* bridge */ /* synthetic */ InterfaceC65665Tqv FGJ() {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC64252T6b
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final ROQ clone() {
        ROQ roq = (ROQ) this.A01.A0N(5, null, null);
        roq.A00 = A03();
        return roq;
    }

    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final RO8 A03() {
        RO8 ro8 = this.A00;
        if (ro8.A0S()) {
            ro8.A0O();
        }
        return this.A00;
    }

    public final void A04() {
        if (!this.A00.A0S()) {
            A05();
        }
    }

    public final void A05() {
        RO8 A0M = this.A01.A0M();
        AbstractC58320PtC.A0c(A0M).FGS(A0M, this.A00);
        this.A00 = A0M;
    }

    public ROQ(RO8 ro8) {
        this.A01 = ro8;
        if (!ro8.A0S()) {
            this.A00 = ro8.A0M();
            return;
        }
        throw AbstractC166987dD.A12("Default instance must be immutable.");
    }

    public final RO8 A01() {
        RO8 A03 = A03();
        if (A03.A0R()) {
            return A03;
        }
        throw new C64861TXm();
    }
}

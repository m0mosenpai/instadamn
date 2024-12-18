package X;

/* renamed from: X.0Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C02950Bt {
    public AbstractC02960Bu A00;
    public boolean A01 = true;
    public AbstractC02960Bu A02;
    public final AbstractC02970Bv A03;
    public final AbstractC02960Bu A04;

    public final AbstractC02960Bu A00() {
        boolean A04 = this.A01 & this.A03.A04(this.A02);
        this.A01 = A04;
        if (!A04) {
            return null;
        }
        AbstractC02960Bu abstractC02960Bu = this.A02;
        AbstractC02960Bu abstractC02960Bu2 = this.A00;
        AbstractC02960Bu abstractC02960Bu3 = this.A04;
        abstractC02960Bu.A02(abstractC02960Bu2, abstractC02960Bu3);
        return abstractC02960Bu3;
    }

    public C02950Bt(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2, AbstractC02960Bu abstractC02960Bu3, AbstractC02970Bv abstractC02970Bv) {
        this.A03 = abstractC02970Bv;
        this.A02 = abstractC02960Bu;
        this.A00 = abstractC02960Bu2;
        this.A04 = abstractC02960Bu3;
    }

    public final AbstractC02960Bu A01() {
        if (A00() == null) {
            return null;
        }
        AbstractC02960Bu abstractC02960Bu = this.A00;
        this.A00 = this.A02;
        this.A02 = abstractC02960Bu;
        return this.A04;
    }
}

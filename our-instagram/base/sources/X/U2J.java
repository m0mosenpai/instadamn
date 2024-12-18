package X;

/* loaded from: classes11.dex */
public final class U2J implements XBI {
    public final /* synthetic */ AbstractC65919TwQ A00;

    public U2J(AbstractC65919TwQ abstractC65919TwQ) {
        this.A00 = abstractC65919TwQ;
    }

    @Override // X.XBI
    public final void CN3(String str) {
        AbstractC65919TwQ abstractC65919TwQ = this.A00;
        C65960TxC c65960TxC = abstractC65919TwQ.A07;
        if (c65960TxC == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        C65963TxG.A00(c65960TxC, abstractC65919TwQ);
    }
}

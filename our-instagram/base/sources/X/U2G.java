package X;

/* loaded from: classes11.dex */
public final class U2G implements XB5 {
    public final /* synthetic */ AbstractC65919TwQ A00;

    @Override // X.XB5
    public final Boolean CYf(String str) {
        C14360o3.A0B(str, 0);
        C65960TxC c65960TxC = this.A00.A07;
        if (c65960TxC == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        C9JQ BjO = c65960TxC.A05.BjO(new UQE(str, "fbsearch/keyword_typeahead/", 10));
        if (BjO.A06 != null) {
            return Boolean.valueOf(BjO.A0A);
        }
        return null;
    }

    public U2G(AbstractC65919TwQ abstractC65919TwQ) {
        this.A00 = abstractC65919TwQ;
    }
}

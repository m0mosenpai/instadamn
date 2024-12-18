package X;

/* loaded from: classes11.dex */
public final class U2D implements XBA {
    public final /* synthetic */ AbstractC65919TwQ A00;

    public U2D(AbstractC65919TwQ abstractC65919TwQ) {
        this.A00 = abstractC65919TwQ;
    }

    @Override // X.XBA
    public final String Byf() {
        if (this.A00.A0h.CZT()) {
            return "recent";
        }
        return "typeahead";
    }
}

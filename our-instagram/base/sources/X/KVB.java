package X;

/* loaded from: classes8.dex */
public final class KVB extends AbstractC48325LZy {
    public final C7SZ A00;
    public final C162777Qo A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KVB) {
                KVB kvb = (KVB) obj;
                if (!C14360o3.A0K(this.A02, kvb.A02) || !C14360o3.A0K(this.A00, kvb.A00) || !C14360o3.A0K(this.A01, kvb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A01;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A02)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KVB(C162777Qo c162777Qo, C7SZ c7sz, String str) {
        super(c162777Qo, c7sz, str);
        AbstractC167017dG.A1R(c7sz, c162777Qo);
        this.A02 = str;
        this.A00 = c7sz;
        this.A01 = c162777Qo;
    }
}

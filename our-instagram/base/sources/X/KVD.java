package X;

/* loaded from: classes8.dex */
public final class KVD extends AbstractC48325LZy {
    public final C7SZ A00;
    public final C162777Qo A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KVD(C162777Qo c162777Qo, C7SZ c7sz, String str) {
        super(c162777Qo, c7sz, str);
        C14360o3.A0B(c162777Qo, 3);
        this.A02 = str;
        this.A00 = c7sz;
        this.A01 = c162777Qo;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KVD) {
                KVD kvd = (KVD) obj;
                if (!C14360o3.A0K(this.A02, kvd.A02) || !C14360o3.A0K(this.A00, kvd.A00) || !C14360o3.A0K(this.A01, kvd.A01)) {
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
}

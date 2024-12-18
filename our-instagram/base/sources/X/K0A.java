package X;

/* loaded from: classes8.dex */
public final class K0A extends C0T6 implements InterfaceC66482zP, InterfaceC162797Qq {
    public final C66641URf A00;
    public final String A01;
    public final C162777Qo A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K0A) {
                K0A k0a = (K0A) obj;
                if (!C14360o3.A0K(this.A01, k0a.A01) || !C14360o3.A0K(this.A00, k0a.A00) || !C14360o3.A0K(this.A02, k0a.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC162797Qq
    public final C162777Qo Apt() {
        return this.A02;
    }

    @Override // X.InterfaceC162797Qq
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArC() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    public K0A(C66641URf c66641URf, C162777Qo c162777Qo, String str) {
        this.A01 = str;
        this.A00 = c66641URf;
        this.A02 = c162777Qo;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}

package X;

/* loaded from: classes7.dex */
public final class H7A extends C0T6 implements InterfaceC66482zP {
    public final C69749Vuj A00;
    public final String A01;
    public final InterfaceC16820sZ A02;

    public H7A(C69749Vuj c69749Vuj, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c69749Vuj;
        this.A02 = interfaceC16820sZ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7A) {
                H7A h7a = (H7A) obj;
                if (!C14360o3.A0K(this.A01, h7a.A01) || !C14360o3.A0K(this.A00, h7a.A00) || !C14360o3.A0K(this.A02, h7a.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C69749Vuj c69749Vuj;
        H7A h7a = (H7A) obj;
        C69749Vuj c69749Vuj2 = this.A00;
        if (h7a != null) {
            c69749Vuj = h7a.A00;
        } else {
            c69749Vuj = null;
        }
        return C14360o3.A0K(c69749Vuj2, c69749Vuj);
    }
}

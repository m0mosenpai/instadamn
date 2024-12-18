package X;

/* loaded from: classes7.dex */
public final class H78 extends C0T6 implements InterfaceC66482zP {
    public final C69749Vuj A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H78) {
                H78 h78 = (H78) obj;
                if (!C14360o3.A0K(this.A01, h78.A01) || !C14360o3.A0K(this.A00, h78.A00)) {
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
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public /* synthetic */ H78(String str) {
        C69749Vuj A0C = AbstractC37301Gc2.A0C(2131974018);
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = A0C;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}

package X;

/* loaded from: classes7.dex */
public final class H7H extends C0T6 implements InterfaceC66482zP {
    public final C1338462s A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof H7H) && C14360o3.A0K(this.A00, ((H7H) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C1338462s c1338462s;
        C102884kP c102884kP;
        C102884kP c102884kP2;
        H7H h7h = (H7H) obj;
        C1338462s c1338462s2 = this.A00;
        String str2 = null;
        if (c1338462s2 != null && (c102884kP2 = c1338462s2.A02) != null) {
            str = c102884kP2.A0D();
        } else {
            str = null;
        }
        if (h7h != null && (c1338462s = h7h.A00) != null && (c102884kP = c1338462s.A02) != null) {
            str2 = c102884kP.A0D();
        }
        return C14360o3.A0K(str, str2);
    }

    public H7H(C1338462s c1338462s) {
        this.A00 = c1338462s;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShoppingDataSignifierBannerViewModel(key=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}

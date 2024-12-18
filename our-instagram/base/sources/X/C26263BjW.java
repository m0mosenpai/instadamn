package X;

/* renamed from: X.BjW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26263BjW extends C0T6 implements InterfaceC30893Di6 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    public C26263BjW(C26135BhM c26135BhM, InterfaceC31120Dm2 interfaceC31120Dm2) {
        this.A02 = c26135BhM;
        this.A01 = interfaceC31120Dm2;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26263BjW) {
                    C26263BjW c26263BjW = (C26263BjW) obj;
                    if (c26263BjW.A00 != 1 || !C14360o3.A0K(this.A02, c26263BjW.A02) || !C14360o3.A0K(this.A01, c26263BjW.A01)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C26263BjW)) {
                return false;
            }
            C26263BjW c26263BjW2 = (C26263BjW) obj;
            if (c26263BjW2.A00 != 0 || !C14360o3.A0K(this.A02, c26263BjW2.A02) || this.A01 != c26263BjW2.A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A02) * 31);
    }

    public C26263BjW(EnumC50631MWs enumC50631MWs, C26135BhM c26135BhM) {
        this.A02 = c26135BhM;
        this.A01 = enumC50631MWs;
    }
}

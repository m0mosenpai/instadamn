package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E9A extends C0T6 implements InterfaceC129555tK {
    public final C7QL A00;
    public final C7QY A01;
    public final C160787Im A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9A) {
                E9A e9a = (E9A) obj;
                if (!C14360o3.A0K(this.A02, e9a.A02) || !C14360o3.A0K(this.A01, e9a.A01) || !C14360o3.A0K(this.A03, e9a.A03) || !C14360o3.A0K(this.A00, e9a.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02))));
    }

    public E9A(C7QL c7ql, C7QY c7qy, C160787Im c160787Im, List list) {
        AbstractC167017dG.A1R(c7qy, list);
        this.A02 = c160787Im;
        this.A01 = c7qy;
        this.A03 = list;
        this.A00 = c7ql;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}

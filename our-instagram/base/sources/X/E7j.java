package X;

/* loaded from: classes6.dex */
public final class E7j extends C0T6 implements InterfaceC37239Gao {
    public final C50679MYx A00;
    public final String A01;

    public E7j(C50679MYx c50679MYx, String str) {
        C14360o3.A0B(c50679MYx, 2);
        this.A01 = str;
        this.A00 = c50679MYx;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7j) {
                E7j e7j = (E7j) obj;
                if (!C14360o3.A0K(this.A01, e7j.A01) || !C14360o3.A0K(this.A00, e7j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC167017dG.A0O(this.A01) * 31);
    }
}

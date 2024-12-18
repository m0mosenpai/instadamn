package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E7x extends C0T6 implements InterfaceC37249Gay {
    public final List A00;
    public final List A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7x) {
                E7x e7x = (E7x) obj;
                if (!C14360o3.A0K(this.A00, e7x.A00) || !C14360o3.A0K(this.A01, e7x.A01) || !C14360o3.A0K(this.A02, e7x.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A02);
    }

    public E7x(List list, List list2, String str) {
        AbstractC167017dG.A1P(list, list2);
        this.A00 = list;
        this.A01 = list2;
        this.A02 = str;
    }
}

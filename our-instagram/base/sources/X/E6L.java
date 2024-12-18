package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E6L extends C0T6 {
    public final int A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6L) {
                E6L e6l = (E6L) obj;
                if (this.A00 != e6l.A00 || !C14360o3.A0K(this.A01, e6l.A01) || !C14360o3.A0K(this.A02, e6l.A02) || this.A03 != e6l.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A01, this.A00 * 31)));
    }

    public E6L(String str, List list, int i, boolean z) {
        AbstractC167017dG.A1R(str, list);
        this.A00 = i;
        this.A01 = str;
        this.A02 = list;
        this.A03 = z;
    }
}

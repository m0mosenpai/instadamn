package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E66 extends C0T6 {
    public final List A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E66) {
                E66 e66 = (E66) obj;
                if (!C14360o3.A0K(this.A01, e66.A01) || !C14360o3.A0K(this.A00, e66.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public E66(String str, List list) {
        AbstractC167017dG.A1P(str, list);
        this.A01 = str;
        this.A00 = list;
    }
}

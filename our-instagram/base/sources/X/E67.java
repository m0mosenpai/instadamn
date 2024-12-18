package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E67 extends C0T6 {
    public final List A00;
    public final E7f A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E67) {
                E67 e67 = (E67) obj;
                if (!C14360o3.A0K(this.A00, e67.A00) || !C14360o3.A0K(this.A01, e67.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public E67(E7f e7f, List list) {
        this.A00 = list;
        this.A01 = e7f;
    }
}

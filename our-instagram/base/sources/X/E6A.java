package X;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class E6A extends C0T6 {
    public String A00;
    public ArrayList A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6A) {
                E6A e6a = (E6A) obj;
                if (!C14360o3.A0K(this.A00, e6a.A00) || !C14360o3.A0K(this.A01, e6a.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0O(this.A00) * 31);
    }

    public E6A() {
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A00 = null;
        this.A01 = A1E;
    }
}

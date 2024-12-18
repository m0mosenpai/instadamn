package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E6J extends C0T6 {
    public final int A00;
    public final String A01;
    public final List A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6J) {
                E6J e6j = (E6J) obj;
                if (!C14360o3.A0K(this.A01, e6j.A01) || !C14360o3.A0K(this.A03, e6j.A03) || this.A00 != e6j.A00 || !C14360o3.A0K(this.A02, e6j.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, (AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A01)) + this.A00) * 31);
    }

    public E6J(int i, String str, String str2, List list) {
        AbstractC25234BEr.A1P(str, str2, list);
        this.A01 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A02 = list;
    }
}

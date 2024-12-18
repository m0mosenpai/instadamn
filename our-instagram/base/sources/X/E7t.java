package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E7t extends C0T6 implements InterfaceC37246Gav {
    public final String A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7t) {
                E7t e7t = (E7t) obj;
                if (!C14360o3.A0K(this.A00, e7t.A00) || !C14360o3.A0K(this.A01, e7t.A01) || !C14360o3.A0K(this.A02, e7t.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public E7t(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}

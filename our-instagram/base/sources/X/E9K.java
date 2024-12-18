package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E9K extends C0T6 implements InterfaceC37095GWe {
    public final List A00;
    public final java.util.Set A01;
    public final java.util.Set A02;
    public final java.util.Set A03;

    public E9K(List list, java.util.Set set, java.util.Set set2, java.util.Set set3) {
        AbstractC167027dH.A0a(1, set, set2, set3, list);
        this.A03 = set;
        this.A01 = set2;
        this.A02 = set3;
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9K) {
                E9K e9k = (E9K) obj;
                if (!C14360o3.A0K(this.A03, e9k.A03) || !C14360o3.A0K(this.A01, e9k.A01) || !C14360o3.A0K(this.A02, e9k.A02) || !C14360o3.A0K(this.A00, e9k.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03))));
    }
}

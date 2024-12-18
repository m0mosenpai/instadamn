package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E7r extends C0T6 implements InterfaceC58229PrZ {
    public final List A00;

    public E7r(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E7r) && C14360o3.A0K(this.A00, ((E7r) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

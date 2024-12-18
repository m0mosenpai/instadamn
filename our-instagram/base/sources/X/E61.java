package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class E61 extends C0T6 {
    public final List A00;

    public E61(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof E61) && C14360o3.A0K(this.A00, ((E61) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class C1S extends AbstractC27442C9k {
    public final List A00;

    public C1S(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1S) && C14360o3.A0K(this.A00, ((C1S) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

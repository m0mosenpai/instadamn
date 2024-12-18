package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class KX2 extends AbstractC46462KhM {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KX2) && C14360o3.A0K(this.A00, ((KX2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KX2(List list) {
        this.A00 = list;
    }
}

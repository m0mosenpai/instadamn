package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class KAR extends AbstractC46386Kg8 {
    public final List A00;

    public KAR(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KAR) && C14360o3.A0K(this.A00, ((KAR) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}

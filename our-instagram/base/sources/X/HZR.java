package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HZR extends AbstractC39663His {
    public final List A00;

    public HZR(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof HZR) && C14360o3.A0K(this.A00, ((HZR) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public HZR() {
        this(C16930sl.A00);
    }
}

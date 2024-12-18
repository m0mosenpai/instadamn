package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NRB extends AbstractC53509Nlb {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof NRB) && C14360o3.A0K(this.A00, ((NRB) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public NRB(List list) {
        this.A00 = list;
    }
}

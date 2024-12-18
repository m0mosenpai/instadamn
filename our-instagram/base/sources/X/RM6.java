package X;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class RM6 extends TSC implements Serializable {
    public final Comparator A00;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RM6) {
            return this.A00.equals(((RM6) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public RM6(Comparator comparator) {
        comparator.getClass();
        this.A00 = comparator;
    }
}

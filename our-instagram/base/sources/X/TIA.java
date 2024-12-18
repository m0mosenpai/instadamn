package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class TIA implements Serializable {
    public static final TIA A01 = new TIA(null);
    public final java.util.Set A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            java.util.Set set = this.A00;
            java.util.Set set2 = ((TIA) obj).A00;
            if (set == null) {
                if (set2 == null) {
                    return true;
                }
            } else if (set.equals(set2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.util.Set set = this.A00;
        if (set == null) {
            return 0;
        }
        return set.size();
    }

    public final String toString() {
        return String.format("JsonIncludeProperties.Value(included=%s)", this.A00);
    }

    public TIA(java.util.Set set) {
        this.A00 = set;
    }
}

package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public final class RM7 extends TSC implements Serializable {
    public final TSC A00;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RM7) {
            return this.A00.equals(((RM7) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return -this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString().concat(".reverse()");
    }

    public RM7(TSC tsc) {
        this.A00 = tsc;
    }
}

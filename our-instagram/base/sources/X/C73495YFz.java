package X;

import java.io.Serializable;

/* renamed from: X.YFz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73495YFz implements Serializable {
    public Object A00;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (getClass() == obj.getClass()) {
            return this.A00.equals(((C73495YFz) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public final String toString() {
        Object obj = this.A00;
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }
}

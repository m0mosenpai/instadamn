package X;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class U3L {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof U3L)) {
            return false;
        }
        U3L u3l = (U3L) obj;
        if (this.A01 != u3l.A01 || this.A00 != u3l.A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Z(Integer.valueOf(this.A01), this.A00));
    }

    public U3L(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}

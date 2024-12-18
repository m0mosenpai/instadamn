package X;

import java.io.Serializable;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class TII implements Serializable {
    public static final TII A05 = new TII(Collections.emptySet(), false, false, false, true);
    public final java.util.Set A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public static TII A00(java.util.Set set, boolean z, boolean z2, boolean z3) {
        return new TII(set, z, z2, z3, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            TII tii = (TII) obj;
            if (this.A03 == tii.A03 && this.A04 == tii.A04 && this.A01 == tii.A01 && this.A02 == tii.A02 && this.A00.equals(tii.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = this.A00.size();
        int i = -3;
        if (this.A03) {
            i = 1;
        }
        int i2 = size + i;
        int i3 = -7;
        if (this.A01) {
            i3 = 3;
        }
        int i4 = i2 + i3;
        int i5 = -11;
        if (this.A02) {
            i5 = 7;
        }
        int i6 = i4 + i5;
        int i7 = -13;
        if (this.A04) {
            i7 = 11;
        }
        return i6 + i7;
    }

    public final String toString() {
        return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.A00, Boolean.valueOf(this.A03), Boolean.valueOf(this.A01), Boolean.valueOf(this.A02), Boolean.valueOf(this.A04));
    }

    public TII(java.util.Set set, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = set == null ? Collections.emptySet() : set;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
        this.A04 = z4;
    }
}

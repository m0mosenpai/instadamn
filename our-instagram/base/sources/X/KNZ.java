package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class KNZ extends AbstractC46508Ki7 {
    public final int A00;
    public final int A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KNZ) {
                KNZ knz = (KNZ) obj;
                if (this.A00 != knz.A00 || !C14360o3.A0K(this.A02, knz.A02) || this.A01 != knz.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, this.A00 * 31) + this.A01;
    }

    public KNZ(List list, int i, int i2) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = i2;
    }
}

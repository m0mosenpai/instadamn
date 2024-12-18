package X;

/* loaded from: classes8.dex */
public final class K34 extends AbstractC46358Kfg {
    public final int A01 = 2131961252;
    public final int A00 = 2131961251;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K34) {
                K34 k34 = (K34) obj;
                if (this.A01 != k34.A01 || this.A00 != k34.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}

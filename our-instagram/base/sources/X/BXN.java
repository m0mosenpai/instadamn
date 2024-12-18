package X;

/* loaded from: classes5.dex */
public final class BXN extends C0T6 {
    public final float A00;
    public final int A01 = 2;

    public BXN(float f) {
        this.A00 = f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BXN) {
                BXN bxn = (BXN) obj;
                if (Float.compare(this.A00, bxn.A00) != 0 || this.A01 != bxn.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25235BEs.A02(this.A00) + this.A01;
    }
}

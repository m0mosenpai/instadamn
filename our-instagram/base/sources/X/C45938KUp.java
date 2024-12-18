package X;

/* renamed from: X.KUp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45938KUp extends AbstractC46444Kh4 {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45938KUp) {
                C45938KUp c45938KUp = (C45938KUp) obj;
                if (this.A01 != c45938KUp.A01 || this.A00 != c45938KUp.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C45938KUp(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}

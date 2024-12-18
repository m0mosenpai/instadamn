package X;

/* loaded from: classes10.dex */
public final class SOR {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SOR) {
                SOR sor = (SOR) obj;
                if (this.A00 != sor.A00 || this.A01 != sor.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    public final String toString() {
        return AnonymousClass001.A0X("AiOutputPoint(x=", ", y=", ')', this.A00, this.A01);
    }

    public SOR(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}

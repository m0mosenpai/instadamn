package X;

/* loaded from: classes4.dex */
public final class ACZ {
    public final int A00;
    public final int A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ACZ) {
                ACZ acz = (ACZ) obj;
                if (this.A02 != acz.A02 || this.A01 != acz.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A02 * 31) + this.A01;
    }

    public final String toString() {
        return AnonymousClass001.A0X("Bleep(startTimeMs=", MSV.A00(626), ')', this.A02, this.A01);
    }

    public ACZ(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i2 - i;
    }
}

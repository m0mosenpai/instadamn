package X;

/* loaded from: classes9.dex */
public final class OLY {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLY) {
                OLY oly = (OLY) obj;
                if (this.A00 != oly.A00 || this.A01 != oly.A01) {
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
        return AnonymousClass001.A0X("Key(nextAudioStartTime=", ", nextBeatStartIndex=", ')', this.A00, this.A01);
    }

    public OLY(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}

package X;

/* loaded from: classes9.dex */
public final class OLX {
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OLX) {
                OLX olx = (OLX) obj;
                if (this.A01 != olx.A01 || this.A00 != olx.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0X("SoundSyncTrimTimeRange(startTimeMs=", ", endTimeMs=", ')', this.A01, this.A00);
    }

    public OLX(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        if (i >= 0 && i < i2) {
        } else {
            throw AbstractC166987dD.A14(AnonymousClass001.A0X("Illegal SoundSyncTrimTimeRange [", ", ", ']', i, i2));
        }
    }
}

package X;

/* renamed from: X.NHg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52410NHg extends AbstractC187488Sq {
    public final int A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52410NHg) {
                C52410NHg c52410NHg = (C52410NHg) obj;
                if (this.A00 != c52410NHg.A00 || this.A01 != c52410NHg.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC187488Sq
    public final int getSegmentIndex() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, this.A00 * 31);
    }

    public C52410NHg(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TrimmingSegment(segmentIndex=");
        A1C.append(this.A00);
        A1C.append(", isHandlingTrimmerTouch=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}

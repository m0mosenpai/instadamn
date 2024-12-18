package X;

/* loaded from: classes5.dex */
public final class CW1 {
    public final int A00;
    public final int A01;
    public final C7V A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CW1) {
                CW1 cw1 = (CW1) obj;
                if (this.A02 != cw1.A02 || this.A00 != cw1.A00 || this.A03 != cw1.A03 || this.A01 != cw1.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, ((AbstractC167017dG.A0M(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public CW1(C7V c7v, int i, int i2, boolean z) {
        this.A02 = c7v;
        this.A00 = i;
        this.A03 = z;
        this.A01 = i2;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MEmuPoseInfo(currentPose=");
        A1C.append(this.A02);
        A1C.append(", currentPoseNumber=");
        A1C.append(this.A00);
        A1C.append(", captureCurrentPose=");
        A1C.append(this.A03);
        A1C.append(", totalPoseCount=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}

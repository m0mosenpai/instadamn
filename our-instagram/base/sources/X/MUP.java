package X;

/* loaded from: classes9.dex */
public final class MUP extends C0T6 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public MUP(int i, int i2, boolean z, boolean z2) {
        this.A00 = i2;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (obj instanceof MUP) {
            MUP mup = (MUP) obj;
            if (mup.A00 != i || this.A02 != mup.A02 || this.A03 != mup.A03 || this.A01 != mup.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC25225BEi.A08(this.A02)) + this.A01;
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NFTruncationLoggingContext(couldTruncate=");
        A1C.append(this.A02);
        A1C.append(", truncated=");
        A1C.append(this.A03);
        A1C.append(", truncationControlPosition=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MUP() {
        this(0, 0, false, false);
        this.A00 = 0;
    }
}

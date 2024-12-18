package X;

/* renamed from: X.Gnu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38008Gnu extends C0T6 {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;

    public C38008Gnu(int i, int i2, int i3, boolean z) {
        this.A03 = i3;
        this.A00 = i;
        this.A02 = z;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A03 != 0) {
            return super.equals(obj);
        }
        if (this != obj) {
            if (obj instanceof C38008Gnu) {
                C38008Gnu c38008Gnu = (C38008Gnu) obj;
                if (c38008Gnu.A03 != 1 || this.A00 != c38008Gnu.A00 || this.A02 != c38008Gnu.A02 || this.A01 != c38008Gnu.A01) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (1 - this.A03 != 0) {
            return super.hashCode();
        }
        return AbstractC167007dF.A0D(this.A02, this.A00 * 31) + this.A01;
    }

    public final String toString() {
        String str;
        int i = this.A03;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (1 - i != 0) {
            A1C.append("GapRulesResult(isGapRulesSucceed=");
            A1C.append(this.A02);
            A1C.append(", gapRuleCheckAttempts=");
            A1C.append(this.A00);
            str = ", newTargetPosition=";
        } else {
            A1C.append("SplitMetadata(splitAtTimeMs=");
            A1C.append(this.A00);
            A1C.append(", isSplitPointAtStart=");
            A1C.append(this.A02);
            str = ", trimmedDurationInMsAfterSplit=";
        }
        A1C.append(str);
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38008Gnu() {
        this(-1, -1, 1, false);
        this.A03 = 1;
    }
}

package X;

/* renamed from: X.7iL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170067iL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C170067iL c170067iL = (C170067iL) obj;
            return this.A02 == c170067iL.A02 && this.A04 == c170067iL.A04 && this.A03 == c170067iL.A03 && this.A01 == c170067iL.A01 && this.A00 == c170067iL.A00 && this.A07 == c170067iL.A07 && this.A06 == c170067iL.A06 && this.A05 == c170067iL.A05;
        }
        return false;
    }

    public final C170067iL A00(C170067iL c170067iL) {
        return new C170067iL(this.A02 + c170067iL.A02, this.A04 + c170067iL.A04, this.A03 + c170067iL.A03, this.A01 + c170067iL.A01, this.A00 + c170067iL.A00, this.A07 + c170067iL.A07, this.A06 + c170067iL.A06, c170067iL.A05 + this.A05);
    }

    public final int hashCode() {
        return (((((((((((((this.A02 * 31) + this.A04) * 31) + this.A03) * 31) + this.A01) * 31) + this.A00) * 31) + this.A07) * 31) + this.A06) * 31) + this.A05;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeSetStats{mEffectiveChangesCount=");
        sb.append(this.A02);
        sb.append(", mInsertSingleCount=");
        sb.append(this.A04);
        sb.append(", mInsertRangeCount=");
        sb.append(this.A03);
        sb.append(", mDeleteSingleCount=");
        sb.append(this.A01);
        sb.append(", mDeleteRangeCount=");
        sb.append(this.A00);
        sb.append(", mUpdateSingleCount=");
        sb.append(this.A07);
        sb.append(", mUpdateRangeCount=");
        sb.append(this.A06);
        sb.append(", mMoveCount=");
        sb.append(this.A05);
        sb.append('}');
        return sb.toString();
    }

    public C170067iL(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = i6;
        this.A06 = i7;
        this.A05 = i8;
    }

    public C170067iL() {
        this.A02 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07 = 0;
        this.A06 = 0;
        this.A05 = 0;
    }
}

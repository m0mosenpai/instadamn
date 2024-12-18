package X;

import java.util.List;

/* renamed from: X.1ut, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40861ut {
    public C38011pl A00;
    public boolean A01 = false;
    public boolean A02 = false;

    public final void A0C(boolean z) {
        int max;
        int i = 1;
        if (!z) {
            Integer num = this.A00.A03;
            if (num == null || (max = num.intValue()) <= 0 || max >= Integer.MAX_VALUE) {
                max = Math.max(1, A03() - 1);
            }
            i = max;
        }
        C38011pl c38011pl = this.A00;
        Integer num2 = c38011pl.A03;
        Integer num3 = c38011pl.A04;
        Integer num4 = c38011pl.A05;
        List list = c38011pl.A0H;
        Integer num5 = c38011pl.A06;
        this.A00 = AbstractC42331xN.A00(c38011pl.A00, c38011pl.A01, c38011pl.A02, num2, num3, num4, num5, Integer.valueOf(i), c38011pl.A08, c38011pl.A09, c38011pl.A0A, c38011pl.A0B, c38011pl.A0C, c38011pl.A0D, c38011pl.A0E, c38011pl.A0F, c38011pl.A0G, list);
    }

    public C40861ut(C38011pl c38011pl) {
        C38011pl c38011pl2 = c38011pl;
        this.A00 = c38011pl == null ? AbstractC42331xN.A00(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null) : c38011pl2;
    }

    public final double A00() {
        if (this.A00.A02 != null) {
            return r0.floatValue();
        }
        return 0.0d;
    }

    public final int A01() {
        Integer num = this.A00.A04;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A02() {
        Integer num = this.A00.A05;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A03() {
        Integer num;
        if (this.A01 && !this.A02) {
            num = this.A00.A0F;
            if (num == null || num.intValue() == 0) {
                return 3;
            }
        } else {
            num = this.A00.A07;
            if (num == null) {
                return 0;
            }
        }
        return num.intValue();
    }

    public final int A04() {
        Integer num = this.A00.A08;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A05() {
        Integer num = this.A00.A09;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A06() {
        Integer num = this.A00.A0B;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A07() {
        Integer num = this.A00.A0D;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A08() {
        Integer num = this.A00.A0E;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int A09() {
        Integer num = this.A00.A0G;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void A0A(int i) {
        C38011pl c38011pl = this.A00;
        Integer num = c38011pl.A03;
        Integer num2 = c38011pl.A04;
        Integer num3 = c38011pl.A05;
        List list = c38011pl.A0H;
        Integer num4 = c38011pl.A06;
        Integer num5 = c38011pl.A07;
        Boolean bool = c38011pl.A01;
        Integer num6 = c38011pl.A08;
        Integer num7 = c38011pl.A0A;
        Integer num8 = c38011pl.A0B;
        Integer num9 = c38011pl.A0C;
        this.A00 = AbstractC42331xN.A00(c38011pl.A00, bool, c38011pl.A02, num, num2, num3, num4, num5, num6, Integer.valueOf(i), num7, num8, num9, c38011pl.A0D, c38011pl.A0E, c38011pl.A0F, c38011pl.A0G, list);
    }

    public final void A0B(int i) {
        C38011pl c38011pl = this.A00;
        Integer num = c38011pl.A03;
        Integer num2 = c38011pl.A04;
        Integer num3 = c38011pl.A05;
        List list = c38011pl.A0H;
        Integer num4 = c38011pl.A06;
        Integer num5 = c38011pl.A07;
        Boolean bool = c38011pl.A01;
        Integer num6 = c38011pl.A08;
        Integer num7 = c38011pl.A09;
        Integer num8 = c38011pl.A0A;
        Integer num9 = c38011pl.A0B;
        Integer num10 = c38011pl.A0C;
        this.A00 = AbstractC42331xN.A00(c38011pl.A00, bool, c38011pl.A02, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, c38011pl.A0D, c38011pl.A0E, c38011pl.A0F, Integer.valueOf(i), list);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GapRules{mEvaluatedExpression=");
        sb.append((Object) null);
        sb.append(", mConsumedMediaGapToPreviousAd=");
        sb.append(A01());
        sb.append(", mConsumedMediaGapToPreviousNetego=");
        sb.append(A02());
        sb.append(", mHighestPositionRule=");
        sb.append(A03());
        sb.append(", mMinMediaGapToPreviousItem=");
        sb.append(A06());
        sb.append(", mTimeGapToPreviousItemSeconds=");
        sb.append(A00());
        sb.append(", mRawRulesExpression=");
        sb.append(this.A00.A0H);
        sb.append(", mReelGapToPreviousAd=");
        sb.append(A07());
        sb.append(", mReelGapToPreviousNetego=");
        sb.append(A08());
        sb.append(", mMaxReelGapToPreviousItem=");
        sb.append(A04());
        sb.append('}');
        return sb.toString();
    }
}

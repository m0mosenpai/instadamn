package X;

import java.io.Serializable;

/* renamed from: X.Mxg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51959Mxg extends C0T6 implements Serializable {
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public final long A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;

    public C51959Mxg(Integer num, Integer num2, Integer num3, Integer num4, long j) {
        AbstractC25233BEq.A0w(1, num, num2, num3);
        this.A07 = num;
        this.A04 = j;
        this.A06 = num2;
        this.A05 = num3;
        this.A03 = num4;
        this.A00 = -1;
        this.A02 = -1;
        this.A01 = -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51959Mxg) {
                C51959Mxg c51959Mxg = (C51959Mxg) obj;
                if (this.A07 != c51959Mxg.A07 || this.A04 != c51959Mxg.A04 || this.A06 != c51959Mxg.A06 || this.A05 != c51959Mxg.A05 || this.A03 != c51959Mxg.A03 || this.A00 != c51959Mxg.A00 || this.A02 != c51959Mxg.A02 || this.A01 != c51959Mxg.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        Integer num = this.A07;
        switch (num.intValue()) {
            case 1:
                str = "LUKEWARM";
                break;
            case 2:
                str = "HOT";
                break;
            case 3:
                str = "OTHER_HEAD_LOAD";
                break;
            default:
                str = "COLD";
                break;
        }
        int A01 = AbstractC25236BEt.A01(this.A04, AbstractC25230BEn.A0C(num, str) * 31);
        Integer num2 = this.A06;
        int A0L = AbstractC167017dG.A0L(num2, AbstractC15780qY.A00(num2), A01);
        Integer num3 = this.A05;
        int A0L2 = AbstractC167017dG.A0L(num3, AbstractC15770qX.A00(num3), A0L);
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str2 = "FAILED";
                break;
            case 2:
                str2 = "SUCCESSED";
                break;
            default:
                str2 = "IN_PROGRESS";
                break;
        }
        return ((((AbstractC25231BEo.A0H(str2, intValue, A0L2) + this.A00) * 31) + this.A02) * 31) + this.A01;
    }
}

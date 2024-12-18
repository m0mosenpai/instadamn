package X;

import java.util.List;

/* renamed from: X.JxD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45083JxD extends C0T6 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final List A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45083JxD) {
                C45083JxD c45083JxD = (C45083JxD) obj;
                if (!C14360o3.A0K(this.A04, c45083JxD.A04) || this.A01 != c45083JxD.A01 || this.A03 != c45083JxD.A03 || this.A02 != c45083JxD.A02 || this.A00 != c45083JxD.A00 || this.A05 != c45083JxD.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int A0G = (AbstractC166987dD.A0G(this.A04) + this.A01) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "WORD";
                break;
            case 2:
                str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                break;
            default:
                str = "CHARACTER";
                break;
        }
        int A0H = AbstractC25231BEo.A0H(str, intValue, A0G);
        int intValue2 = this.A02.intValue();
        switch (intValue2) {
            case 1:
                str2 = "WORD_ANY_ORDER";
                break;
            case 2:
                str2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                break;
            default:
                str2 = "PREFIX";
                break;
        }
        return AbstractC166987dD.A0K(this.A05, (AbstractC25231BEo.A0H(str2, intValue2, A0H) + this.A00) * 31);
    }

    public C45083JxD(Integer num, Integer num2, List list, int i, int i2, boolean z) {
        AbstractC37302Gc3.A1U(num, num2);
        this.A04 = list;
        this.A01 = i;
        this.A03 = num;
        this.A02 = num2;
        this.A00 = i2;
        this.A05 = z;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SaytOdData(candidates=");
        A1C.append(this.A04);
        A1C.append(", thresholdFrequency=");
        A1C.append(this.A01);
        A1C.append(", tokenizationStrategy=");
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "WORD";
                    break;
                case 2:
                    str = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                    break;
                default:
                    str = "CHARACTER";
                    break;
            }
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(", matchingStrategy=");
        Integer num2 = this.A02;
        if (num2 != null) {
            switch (num2.intValue()) {
                case 1:
                    str2 = "WORD_ANY_ORDER";
                    break;
                case 2:
                    str2 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                    break;
                default:
                    str2 = "PREFIX";
                    break;
            }
        } else {
            str2 = "null";
        }
        A1C.append(str2);
        A1C.append(", minTokens=");
        A1C.append(this.A00);
        A1C.append(", applyLockFixes=");
        return AbstractC25236BEt.A0a(A1C, this.A05);
    }
}

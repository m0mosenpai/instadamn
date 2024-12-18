package X;

import java.util.List;

/* renamed from: X.BfT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26040BfT extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    /* JADX WARN: Multi-variable type inference failed */
    public C26040BfT() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    public /* synthetic */ C26040BfT(Integer num, String str, List list, int i) {
        int i2 = 0;
        list = (i & 1) != 0 ? C16930sl.A00 : list;
        str = (i & 2) != 0 ? "" : str;
        int i3 = (i & 4) != 0 ? 2131964642 : 0;
        num = (i & 8) != 0 ? C05F.A01 : num;
        int i4 = (i & 16) != 0 ? 8 : 0;
        if ((i & 32) != 0) {
            i2 = 2131968595;
            if (str.length() == 0) {
                i2 = 2131968562;
            }
        }
        AbstractC25234BEr.A1P(list, str, num);
        this.A05 = list;
        this.A04 = str;
        this.A00 = i3;
        this.A03 = num;
        this.A01 = i4;
        this.A02 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26040BfT) {
                C26040BfT c26040BfT = (C26040BfT) obj;
                if (!C14360o3.A0K(this.A05, c26040BfT.A05) || !C14360o3.A0K(this.A04, c26040BfT.A04) || this.A00 != c26040BfT.A00 || this.A03 != c26040BfT.A03 || this.A01 != c26040BfT.A01 || this.A02 != c26040BfT.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0K = (AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0G(this.A05)) + this.A00) * 31;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "SUCCESS";
                break;
            case 2:
                str = "ERROR";
                break;
            default:
                str = "LOADING";
                break;
        }
        return ((AbstractC25231BEo.A0H(str, intValue, A0K) + this.A01) * 31) + this.A02;
    }
}

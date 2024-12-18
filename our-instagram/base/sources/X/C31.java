package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class C31 extends CPU {
    public final Integer A00;
    public final List A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31(Integer num, List list) {
        super(list);
        C14360o3.A0B(list, 1);
        this.A01 = list;
        this.A00 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31) {
                C31 c31 = (C31) obj;
                if (!C14360o3.A0K(this.A01, c31.A01) || this.A00 != c31.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0G = AbstractC166987dD.A0G(this.A01);
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "FAILURE";
                break;
            default:
                str = "LOADING";
                break;
        }
        return A0G + AbstractC25226BEj.A02(str, intValue);
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("HorizontalAccountsResult(accounts=");
        A1C.append(this.A01);
        A1C.append(AbstractC58317Pt9.A00(154));
        switch (this.A00.intValue()) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "FAILURE";
                break;
            default:
                str = "LOADING";
                break;
        }
        return AbstractC25236BEt.A0Y(str, A1C);
    }
}

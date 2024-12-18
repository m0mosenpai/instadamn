package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

/* renamed from: X.BfW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26043BfW extends C0T6 {
    public final C28224CcU A00;
    public final C28224CcU A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final List A05;
    public final boolean A06;

    public static final C26043BfW A00(C28224CcU c28224CcU, C28224CcU c28224CcU2, Integer num, Integer num2, Integer num3, List list, boolean z) {
        AbstractC25233BEq.A0v(0, num, list, num2);
        C14360o3.A0B(num3, 6);
        return new C26043BfW(c28224CcU, c28224CcU2, num, num2, num3, list, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26043BfW) {
                C26043BfW c26043BfW = (C26043BfW) obj;
                if (this.A03 != c26043BfW.A03 || !C14360o3.A0K(this.A01, c26043BfW.A01) || !C14360o3.A0K(this.A05, c26043BfW.A05) || this.A04 != c26043BfW.A04 || this.A06 != c26043BfW.A06 || !C14360o3.A0K(this.A00, c26043BfW.A00) || this.A02 != c26043BfW.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        String str3;
        int intValue = this.A03.intValue();
        switch (intValue) {
            case 1:
                str = "GENERATED_IMAGE_SELECTION";
                break;
            case 2:
                str = "GENERATION_ERROR";
                break;
            default:
                str = "GENERATING";
                break;
        }
        int A0J = AbstractC166997dE.A0J(this.A05, (AbstractC25228BEl.A0F(str, intValue) + AbstractC167017dG.A0M(this.A01)) * 31);
        int intValue2 = this.A04.intValue();
        if (1 != intValue2) {
            str2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        } else {
            str2 = "MORE_RESULTS";
        }
        int A0D = (AbstractC167007dF.A0D(this.A06, AbstractC25231BEo.A0H(str2, intValue2, A0J)) + AbstractC166997dE.A0I(this.A00)) * 31;
        int intValue3 = this.A02.intValue();
        if (1 != intValue3) {
            str3 = "TOP";
        } else {
            str3 = "BOTH";
        }
        return A0D + AbstractC25226BEj.A02(str3, intValue3);
    }

    public C26043BfW(C28224CcU c28224CcU, C28224CcU c28224CcU2, Integer num, Integer num2, Integer num3, List list, boolean z) {
        this.A03 = num;
        this.A01 = c28224CcU;
        this.A05 = list;
        this.A04 = num2;
        this.A06 = z;
        this.A00 = c28224CcU2;
        this.A02 = num3;
    }
}

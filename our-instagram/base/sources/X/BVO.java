package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.List;

/* loaded from: classes5.dex */
public final class BVO extends C0T6 {
    public String A00;
    public String A01;
    public final int A02;
    public final Double A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final InterfaceC16820sZ A0A;
    public final InterfaceC16820sZ A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final long A0F;
    public final Integer A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BVO) {
                BVO bvo = (BVO) obj;
                if (this.A0G != bvo.A0G || !C14360o3.A0K(this.A01, bvo.A01) || this.A0E != bvo.A0E || !C14360o3.A0K(this.A07, bvo.A07) || this.A0F != bvo.A0F || !C14360o3.A0K(this.A00, bvo.A00) || !C14360o3.A0K(this.A04, bvo.A04) || !C14360o3.A0K(this.A09, bvo.A09) || !C14360o3.A0K(this.A0B, bvo.A0B) || !C14360o3.A0K(this.A0A, bvo.A0A) || !C14360o3.A0K(this.A08, bvo.A08) || this.A02 != bvo.A02 || this.A0D != bvo.A0D || this.A0C != bvo.A0C || !C14360o3.A0K(this.A03, bvo.A03) || !C14360o3.A0K(this.A05, bvo.A05) || !C14360o3.A0K(this.A06, bvo.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int intValue = this.A0G.intValue();
        switch (intValue) {
            case 1:
                str = "EMBEDDED_CTA";
                break;
            case 2:
                str = "ATTACHED_MODULE";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return ((((AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0D, ((((((((((((((AbstractC25236BEt.A01(this.A0F, (AbstractC167007dF.A0D(this.A0E, AbstractC166997dE.A0K(this.A01, AbstractC25228BEl.A0F(str, intValue))) + AbstractC167017dG.A0O(this.A07)) * 31) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + this.A02) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A06);
    }

    public BVO(Double d, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, long j, boolean z, boolean z2, boolean z3) {
        this.A0G = num;
        this.A01 = str;
        this.A0E = z;
        this.A07 = str2;
        this.A0F = j;
        this.A00 = str3;
        this.A04 = num2;
        this.A09 = list;
        this.A0B = interfaceC16820sZ;
        this.A0A = interfaceC16820sZ2;
        this.A08 = str4;
        this.A02 = i;
        this.A0D = z2;
        this.A0C = z3;
        this.A03 = d;
        this.A05 = num3;
        this.A06 = num4;
    }
}

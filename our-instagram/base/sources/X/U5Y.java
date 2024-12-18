package X;

import java.util.Map;

/* loaded from: classes11.dex */
public final class U5Y {
    public final InterfaceC103384lE A00;
    public final InterfaceC103384lE A01;
    public final InterfaceC103384lE A02;
    public final InterfaceC103384lE A03;
    public final String A04;
    public final Map A05;
    public final java.util.Set A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof U5Y) {
                U5Y u5y = (U5Y) obj;
                if (!C14360o3.A0K(this.A04, u5y.A04) || !C14360o3.A0K(this.A00, u5y.A00) || !C14360o3.A0K(this.A03, u5y.A03) || !C14360o3.A0K(this.A02, u5y.A02) || !C14360o3.A0K(this.A06, u5y.A06) || !C14360o3.A0K(this.A05, u5y.A05) || !C14360o3.A0K(this.A01, u5y.A01) || this.A07 != u5y.A07 || this.A08 != u5y.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = (((((((AbstractC166997dE.A0J(this.A00, this.A04.hashCode() * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31;
        InterfaceC103384lE interfaceC103384lE = this.A01;
        if (interfaceC103384lE != null) {
            i = interfaceC103384lE.hashCode();
        }
        int A0D = AbstractC167007dF.A0D(this.A07, (A0J + i) * 31);
        int i2 = 1237;
        if (this.A08) {
            i2 = 1231;
        }
        return A0D + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScopedBloksComponentQueryDefinition(id=");
        sb.append(this.A04);
        sb.append(", appIdExpression=");
        sb.append(this.A00);
        sb.append(", paramsExpression=");
        sb.append(this.A03);
        sb.append(", clientParamsExpression=");
        sb.append(this.A02);
        sb.append(", dependencies=");
        sb.append(this.A06);
        sb.append(", targets=");
        sb.append(this.A05);
        sb.append(", cacheTTLExpression=");
        sb.append(this.A01);
        sb.append(", isDiskCacheEnabled=");
        sb.append(this.A07);
        sb.append(", isScoped=");
        return AbstractC25236BEt.A0a(sb, this.A08);
    }

    public U5Y(InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, InterfaceC103384lE interfaceC103384lE3, InterfaceC103384lE interfaceC103384lE4, String str, Map map, java.util.Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = interfaceC103384lE;
        this.A03 = interfaceC103384lE2;
        this.A02 = interfaceC103384lE3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = interfaceC103384lE4;
        this.A07 = z;
        this.A08 = z2;
    }
}

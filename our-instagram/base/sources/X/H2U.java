package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H2U extends C0T6 implements InterfaceC31086DlU {
    public final InterfaceC39571se A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2U) {
                H2U h2u = (H2U) obj;
                if (!C14360o3.A0K(this.A07, h2u.A07) || !C14360o3.A0K(this.A03, h2u.A03) || !C14360o3.A0K(this.A08, h2u.A08) || !C14360o3.A0K(this.A01, h2u.A01) || !C14360o3.A0K(this.A04, h2u.A04) || !C14360o3.A0K(this.A00, h2u.A00) || !C14360o3.A0K(this.A05, h2u.A05) || !C14360o3.A0K(this.A06, h2u.A06) || !C14360o3.A0K(this.A02, h2u.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A05, (AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A07))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31)) + AbstractC166997dE.A0I(this.A02);
    }

    public H2U(InterfaceC39571se interfaceC39571se, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list) {
        AbstractC167027dH.A13(str, str2, list);
        C14360o3.A0B(str3, 5);
        AbstractC167007dF.A1I(str4, 7, str5);
        this.A07 = str;
        this.A03 = str2;
        this.A08 = list;
        this.A01 = num;
        this.A04 = str3;
        this.A00 = interfaceC39571se;
        this.A05 = str4;
        this.A06 = str5;
        this.A02 = num2;
    }
}

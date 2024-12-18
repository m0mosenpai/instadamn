package X;

import com.instagram.api.schemas.GraphGuardianContentImpl;
import java.util.List;

/* loaded from: classes6.dex */
public final class E7v extends C0T6 implements InterfaceC58231Prb {
    public final GraphGuardianContentImpl A00;
    public final C38321qM A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7v) {
                E7v e7v = (E7v) obj;
                if (!C14360o3.A0K(this.A02, e7v.A02) || !C14360o3.A0K(this.A06, e7v.A06) || !C14360o3.A0K(this.A01, e7v.A01) || !C14360o3.A0K(this.A03, e7v.A03) || !C14360o3.A0K(this.A00, e7v.A00) || !C14360o3.A0K(this.A04, e7v.A04) || !C14360o3.A0K(this.A05, e7v.A05) || !C14360o3.A0K(this.A07, e7v.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A07);
    }

    public E7v(GraphGuardianContentImpl graphGuardianContentImpl, C38321qM c38321qM, Integer num, Integer num2, Integer num3, Integer num4, String str, List list) {
        this.A02 = num;
        this.A06 = str;
        this.A01 = c38321qM;
        this.A03 = num2;
        this.A00 = graphGuardianContentImpl;
        this.A04 = num3;
        this.A05 = num4;
        this.A07 = list;
    }
}

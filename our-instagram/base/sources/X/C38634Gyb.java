package X;

import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import java.util.List;

/* renamed from: X.Gyb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38634Gyb extends C0T6 {
    public final ThreadContainerType A00;
    public final JJ1 A01;
    public final ThreadHeaderStyle A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final String A06;
    public final boolean A07;

    public C38634Gyb(ThreadContainerType threadContainerType, JJ1 jj1, ThreadHeaderStyle threadHeaderStyle, String str, String str2, String str3, List list, boolean z) {
        C14360o3.A0B(str2, 3);
        AbstractC167017dG.A1U(list, threadContainerType);
        this.A03 = str;
        this.A02 = threadHeaderStyle;
        this.A04 = str2;
        this.A07 = z;
        this.A01 = jj1;
        this.A05 = list;
        this.A00 = threadContainerType;
        this.A06 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38634Gyb) {
                C38634Gyb c38634Gyb = (C38634Gyb) obj;
                if (!C14360o3.A0K(this.A03, c38634Gyb.A03) || this.A02 != c38634Gyb.A02 || !C14360o3.A0K(this.A04, c38634Gyb.A04) || this.A07 != c38634Gyb.A07 || !C14360o3.A0K(this.A01, c38634Gyb.A01) || !C14360o3.A0K(this.A05, c38634Gyb.A05) || this.A00 != c38634Gyb.A00 || !C14360o3.A0K(this.A06, c38634Gyb.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A05, (AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0K(this.A04, ((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0M(this.A02)) * 31)) + AbstractC167017dG.A0M(this.A01)) * 31)) + AbstractC25227BEk.A07(this.A06);
    }
}

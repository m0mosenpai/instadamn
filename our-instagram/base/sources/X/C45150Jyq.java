package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jyq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45150Jyq extends C0T6 implements InterfaceC50504MRh {
    public final LineType A00;
    public final ThreadItemType A01;
    public final C38321qM A02;
    public final User A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45150Jyq) {
                C45150Jyq c45150Jyq = (C45150Jyq) obj;
                if (this.A09 != c45150Jyq.A09 || !C14360o3.A0K(this.A07, c45150Jyq.A07) || !C14360o3.A0K(this.A04, c45150Jyq.A04) || !C14360o3.A0K(this.A05, c45150Jyq.A05) || this.A00 != c45150Jyq.A00 || !C14360o3.A0K(this.A02, c45150Jyq.A02) || !C14360o3.A0K(this.A08, c45150Jyq.A08) || !C14360o3.A0K(this.A03, c45150Jyq.A03) || this.A0A != c45150Jyq.A0A || !C14360o3.A0K(this.A06, c45150Jyq.A06) || this.A01 != c45150Jyq.A01 || !C14360o3.A0K(this.A0B, c45150Jyq.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A0A, (AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A00, (((((AbstractC25225BEi.A08(this.A09) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31))) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC25227BEk.A07(this.A0B);
    }

    public C45150Jyq(LineType lineType, ThreadItemType threadItemType, C38321qM c38321qM, User user, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, List list, boolean z, boolean z2) {
        AbstractC167017dG.A1T(lineType, c38321qM);
        AbstractC25229BEm.A1K(list, 7, threadItemType);
        this.A09 = z;
        this.A07 = str;
        this.A04 = bool;
        this.A05 = bool2;
        this.A00 = lineType;
        this.A02 = c38321qM;
        this.A08 = list;
        this.A03 = user;
        this.A0A = z2;
        this.A06 = bool3;
        this.A01 = threadItemType;
        this.A0B = str2;
    }
}

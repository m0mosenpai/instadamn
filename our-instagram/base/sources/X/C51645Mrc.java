package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Mrc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51645Mrc extends C0T6 {
    public final MXS A00;
    public final C5QE A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;

    public C51645Mrc(MXS mxs, C5QE c5qe, User user, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, boolean z) {
        C14360o3.A0B(list4, 5);
        this.A02 = user;
        this.A06 = list;
        this.A0A = list2;
        this.A08 = list3;
        this.A07 = list4;
        this.A00 = mxs;
        this.A0B = list5;
        this.A09 = list6;
        this.A03 = str;
        this.A0C = z;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = c5qe;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51645Mrc) {
                C51645Mrc c51645Mrc = (C51645Mrc) obj;
                if (!C14360o3.A0K(this.A02, c51645Mrc.A02) || !C14360o3.A0K(this.A06, c51645Mrc.A06) || !C14360o3.A0K(this.A0A, c51645Mrc.A0A) || !C14360o3.A0K(this.A08, c51645Mrc.A08) || !C14360o3.A0K(this.A07, c51645Mrc.A07) || this.A00 != c51645Mrc.A00 || !C14360o3.A0K(this.A0B, c51645Mrc.A0B) || !C14360o3.A0K(this.A09, c51645Mrc.A09) || !C14360o3.A0K(this.A03, c51645Mrc.A03) || this.A0C != c51645Mrc.A0C || !C14360o3.A0K(this.A04, c51645Mrc.A04) || !C14360o3.A0K(this.A05, c51645Mrc.A05) || !C14360o3.A0K(this.A01, c51645Mrc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC167007dF.A0D(this.A0C, (AbstractC166997dE.A0J(this.A09, AbstractC166997dE.A0J(this.A0B, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A08, AbstractC166997dE.A0J(this.A0A, AbstractC166997dE.A0J(this.A06, AbstractC167017dG.A0M(this.A02) * 31))))))) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}

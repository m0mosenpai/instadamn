package X;

import com.instagram.user.model.User;

/* renamed from: X.Gye, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38637Gye extends C0T6 {
    public final InterfaceC11380iw A00;
    public final User A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C38637Gye(InterfaceC11380iw interfaceC11380iw, User user, User user2, String str, String str2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(user, 1);
        this.A01 = user;
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A02 = user2;
        this.A00 = interfaceC11380iw;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38637Gye) {
                C38637Gye c38637Gye = (C38637Gye) obj;
                if (!C14360o3.A0K(this.A01, c38637Gye.A01) || !C14360o3.A0K(this.A03, c38637Gye.A03) || !C14360o3.A0K(this.A04, c38637Gye.A04) || this.A06 != c38637Gye.A06 || this.A05 != c38637Gye.A05 || this.A07 != c38637Gye.A07 || !C14360o3.A0K(this.A02, c38637Gye.A02) || !C14360o3.A0K(this.A00, c38637Gye.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A05, AbstractC167007dF.A0D(this.A06, (((AbstractC166987dD.A0G(this.A01) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31))))) * 31;
    }
}

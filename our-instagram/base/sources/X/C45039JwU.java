package X;

import com.instagram.user.model.User;

/* renamed from: X.JwU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45039JwU extends C0T6 {
    public final long A00;
    public final C45055Jwk A01;
    public final User A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45039JwU) {
                C45039JwU c45039JwU = (C45039JwU) obj;
                if (!C14360o3.A0K(this.A01, c45039JwU.A01) || !C14360o3.A0K(this.A03, c45039JwU.A03) || this.A04 != c45039JwU.A04 || !C14360o3.A0K(this.A02, c45039JwU.A02) || this.A00 != c45039JwU.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A0D(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A01)))) + AbstractC25228BEl.A03(this.A00);
    }

    public C45039JwU(C45055Jwk c45055Jwk, User user, String str, long j, boolean z) {
        AbstractC25234BEr.A1P(c45055Jwk, str, user);
        this.A01 = c45055Jwk;
        this.A03 = str;
        this.A04 = z;
        this.A02 = user;
        this.A00 = j;
    }
}

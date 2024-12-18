package X;

import com.instagram.user.model.User;

/* renamed from: X.Beh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25993Beh extends C0T6 {
    public final int A00;
    public final C38321qM A01;
    public final C75113Zb A02;
    public final User A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25993Beh) {
                C25993Beh c25993Beh = (C25993Beh) obj;
                if (this.A04 != c25993Beh.A04 || this.A00 != c25993Beh.A00 || !C14360o3.A0K(this.A03, c25993Beh.A03) || !C14360o3.A0K(this.A01, c25993Beh.A01) || !C14360o3.A0K(this.A02, c25993Beh.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, (AbstractC25225BEi.A08(this.A04) + this.A00) * 31)));
    }

    public C25993Beh(C38321qM c38321qM, C75113Zb c75113Zb, User user, int i, boolean z) {
        this.A04 = z;
        this.A00 = i;
        this.A03 = user;
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
    }
}

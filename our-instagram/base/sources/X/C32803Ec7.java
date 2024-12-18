package X;

import com.instagram.user.model.User;

/* renamed from: X.Ec7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32803Ec7 extends AbstractC33539EsD {
    public final User A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32803Ec7) {
                C32803Ec7 c32803Ec7 = (C32803Ec7) obj;
                if (!C14360o3.A0K(this.A00, c32803Ec7.A00) || !C14360o3.A0K(this.A01, c32803Ec7.A01) || this.A02 != c32803Ec7.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31);
    }

    public C32803Ec7(User user, String str, boolean z) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = z;
    }
}

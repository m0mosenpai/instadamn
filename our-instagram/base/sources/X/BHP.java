package X;

import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BHP extends BH1 {
    public final User A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BHP) {
                BHP bhp = (BHP) obj;
                if (!C14360o3.A0K(this.A00, bhp.A00) || this.A01 != bhp.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public BHP(User user, int i) {
        super("mac_upsell", "content_type_mac_upsell");
        this.A00 = user;
        this.A01 = i;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + this.A01;
    }
}

package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class E85 extends C0T6 implements Gb3 {
    public final User A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E85) {
                E85 e85 = (E85) obj;
                if (!C14360o3.A0K(this.A01, e85.A01) || !C14360o3.A0K(this.A00, e85.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public E85(User user, List list) {
        AbstractC167017dG.A1P(list, user);
        this.A01 = list;
        this.A00 = user;
    }
}

package X;

import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class E7n extends C0T6 implements InterfaceC58228PrY {
    public final User A00;
    public final List A01;
    public final List A02;
    public final int A03;

    public E7n(User user, List list, List list2, int i) {
        C14360o3.A0B(list, 3);
        this.A03 = i;
        this.A00 = user;
        this.A01 = list;
        this.A02 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7n) {
                E7n e7n = (E7n) obj;
                if (this.A03 != e7n.A03 || !C14360o3.A0K(this.A00, e7n.A00) || !C14360o3.A0K(this.A01, e7n.A01) || !C14360o3.A0K(this.A02, e7n.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, ((this.A03 * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}

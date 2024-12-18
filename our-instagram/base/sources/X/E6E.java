package X;

import com.instagram.api.schemas.UserCallSettings;
import java.util.List;

/* loaded from: classes6.dex */
public final class E6E extends C0T6 {
    public final UserCallSettings A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6E) {
                E6E e6e = (E6E) obj;
                if (!C14360o3.A0K(this.A01, e6e.A01) || this.A00 != e6e.A00 || !C14360o3.A0K(this.A02, e6e.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)));
    }

    public E6E(UserCallSettings userCallSettings, List list, List list2) {
        AbstractC167027dH.A13(list, userCallSettings, list2);
        this.A01 = list;
        this.A00 = userCallSettings;
        this.A02 = list2;
    }
}

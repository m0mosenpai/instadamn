package X;

import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E9I extends C0T6 implements InterfaceC37094GWd {
    public final View A00;
    public final User A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9I) {
                E9I e9i = (E9I) obj;
                if (!C14360o3.A0K(this.A00, e9i.A00) || !C14360o3.A0K(this.A02, e9i.A02) || !C14360o3.A0K(this.A01, e9i.A01) || this.A03 != e9i.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A03, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0G(this.A00))));
    }

    public E9I(View view, User user, String str, boolean z) {
        this.A00 = view;
        this.A02 = str;
        this.A01 = user;
        this.A03 = z;
    }
}

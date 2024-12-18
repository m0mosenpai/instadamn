package X;

import android.graphics.PointF;
import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E9J extends C0T6 implements InterfaceC37094GWd {
    public final PointF A00;
    public final View A01;
    public final User A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9J) {
                E9J e9j = (E9J) obj;
                if (!C14360o3.A0K(this.A01, e9j.A01) || !C14360o3.A0K(this.A00, e9j.A00) || !C14360o3.A0K(this.A03, e9j.A03) || !C14360o3.A0K(this.A02, e9j.A02) || this.A04 != e9j.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A04, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01)))));
    }

    public E9J(PointF pointF, View view, User user, String str, boolean z) {
        this.A01 = view;
        this.A00 = pointF;
        this.A03 = str;
        this.A02 = user;
        this.A04 = z;
    }
}

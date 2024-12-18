package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.PIe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56787PIe implements C53W {
    public final /* synthetic */ C26872BtZ A00;
    public final /* synthetic */ User A01;

    public C56787PIe(C26872BtZ c26872BtZ, User user) {
        this.A00 = c26872BtZ;
        this.A01 = user;
    }

    @Override // X.C53W
    public final void Dy5(int i) {
        int i2;
        C1VN c1vn = C1VN.A00;
        if (c1vn != null) {
            C26872BtZ c26872BtZ = this.A00;
            FragmentActivity requireActivity = c26872BtZ.requireActivity();
            UserSession A0r = AbstractC166987dD.A0r(c26872BtZ.A0C);
            if (this.A01.CQw()) {
                i2 = 3471;
            } else {
                i2 = 3470;
            }
            c1vn.A02(A0r, requireActivity, AbstractC111324zv.A00(i2));
        }
    }
}

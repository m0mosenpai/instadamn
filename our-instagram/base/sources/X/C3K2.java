package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3K2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K2 implements InterfaceC43641zu {
    public final FragmentActivity A00;
    public final InterfaceC26681Qx A01;

    @Override // X.InterfaceC43641zu
    public final void onTokenChange() {
        C11T.A02(new J5B(C56352iT.A0t.A03(this.A00), this));
    }

    public C3K2(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = C26661Qv.A00(userSession);
    }
}

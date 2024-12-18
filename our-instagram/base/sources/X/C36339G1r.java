package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36339G1r implements InterfaceC37154GYr {
    public final Bundle A00;
    public final UserSession A01;

    public C36339G1r(Bundle bundle, UserSession userSession) {
        C14360o3.A0B(bundle, 2);
        this.A01 = userSession;
        this.A00 = bundle;
    }

    @Override // X.InterfaceC37154GYr
    public final boolean CY3() {
        if (this.A00.containsKey("InterestBasedChannelType")) {
            return false;
        }
        UserSession userSession = this.A01;
        boolean A01 = AbstractC2051396d.A01(userSession);
        boolean A00 = AbstractC31269Dor.A00(userSession);
        boolean A012 = AbstractC2051496e.A01(userSession);
        boolean A002 = C7HD.A00(userSession);
        if (!A012 && !A01) {
            return false;
        }
        if (!A002 && !A00) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37154GYr
    public final void Cgf(FragmentActivity fragmentActivity) {
        AbstractC31180DnO.A1T(fragmentActivity);
        UserSession userSession = this.A01;
        AbstractC34888FZa.A00(this.A00, fragmentActivity, new C32336EMi(), userSession, AbstractC111324zv.A00(4079));
    }
}

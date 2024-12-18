package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class P6n implements InterfaceC57971PnH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C189478aR A02;
    public final /* synthetic */ User A03;

    public P6n(FragmentActivity fragmentActivity, UserSession userSession, C189478aR c189478aR, User user) {
        this.A02 = c189478aR;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = user;
    }

    @Override // X.InterfaceC57971PnH
    public final void E2j() {
        C189478aR c189478aR = this.A02;
        UserSession userSession = this.A01;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, false);
        AbstractC25226BEj.A1M(this.A00, A0y, 2131962725);
        AbstractC31364DqT.A03();
        String id = this.A03.getId();
        String A00 = AbstractC111324zv.A00(79);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", id);
        A05.putString("ProfileLiveNotificationsSettingsFragment.CLICK_POINT", A00);
        C52115N4n c52115N4n = new C52115N4n();
        c52115N4n.setArguments(A05);
        c189478aR.A0F(c52115N4n, A0y);
    }
}

package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P6m implements InterfaceC57971PnH {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C189478aR A01;
    public final /* synthetic */ O3B A02;
    public final /* synthetic */ String A03;

    public P6m(FragmentActivity fragmentActivity, C189478aR c189478aR, O3B o3b, String str) {
        this.A01 = c189478aR;
        this.A02 = o3b;
        this.A00 = fragmentActivity;
        this.A03 = str;
    }

    @Override // X.InterfaceC57971PnH
    public final void E2j() {
        C189478aR c189478aR = this.A01;
        UserSession userSession = this.A02.A00;
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25226BEj.A1M(this.A00, A0y, 2131964245);
        AbstractC31364DqT.A03();
        String str = this.A03;
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", str);
        C52115N4n c52115N4n = new C52115N4n();
        c52115N4n.setArguments(A05);
        c189478aR.A0F(c52115N4n, A0y);
    }
}

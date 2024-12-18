package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G11 implements InterfaceC31036Dka {
    @Override // X.InterfaceC31036Dka
    public final int AzS() {
        return R.drawable.instagram_ads_on_reels_pano_outline_24;
    }

    @Override // X.InterfaceC31036Dka
    public final void D3K(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        AbstractC28393Cfw.A03(userSession, "monetization", "profile_feed_ads_row_eligible");
        AbstractC31177DnL.A0w(null, OPZ.A00().A01(IGRevShareProductType.A05, "PRO_HOME", null), fragmentActivity, userSession);
    }

    @Override // X.InterfaceC31036Dka
    public final int getTitleRes() {
        return 2131966869;
    }
}

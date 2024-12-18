package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G10 implements InterfaceC31036Dka {
    @Override // X.InterfaceC31036Dka
    public final void D3K(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167007dF.A1K(fragmentActivity, userSession);
        AbstractC28393Cfw.A03(userSession, "monetization", "gifts_row_eligible");
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0B(null, C27S.A00().A02().A00(userSession, "PRO_HOME", null, null, false));
        A0r.A04();
    }

    @Override // X.InterfaceC31036Dka
    public final int AzS() {
        return R.drawable.instagram_gift_box_pano_outline_24;
    }

    @Override // X.InterfaceC31036Dka
    public final int getTitleRes() {
        return 2131966866;
    }
}

package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* loaded from: classes6.dex */
public final class G15 implements InterfaceC31036Dka {
    public final boolean A00;

    public G15(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC31036Dka
    public final int AzS() {
        return R.drawable.instagram_crown_pano_outline_24;
    }

    @Override // X.InterfaceC31036Dka
    public final void D3K(FragmentActivity fragmentActivity, UserSession userSession) {
        C140966Yy A0r;
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        if (this.A00) {
            AbstractC28393Cfw.A03(userSession, "monetization", "subscriptions_row_eligible");
            EgK A02 = FVI.A00().A02("PRO_HOME");
            A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            A0r.A0B(null, A02);
        } else {
            AbstractC28393Cfw.A03(userSession, "monetization", "subscriptions_row");
            A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
            A0r.A0B(null, CIQ.A00(ValuePropsFlow.A0B.A00, null));
        }
        A0r.A04();
    }

    @Override // X.InterfaceC31036Dka
    public final int getTitleRes() {
        return 2131966874;
    }
}

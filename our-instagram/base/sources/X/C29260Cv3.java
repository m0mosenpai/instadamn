package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.Cv3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29260Cv3 implements InterfaceC31036Dka {
    @Override // X.InterfaceC31036Dka
    public final int AzS() {
        return R.drawable.instagram_insights_pano_outline_24;
    }

    @Override // X.InterfaceC31036Dka
    public final void D3K(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        AbstractC28393Cfw.A03(userSession, "creator_tools_main_page", "insights_row");
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0B(null, CIQ.A00(ValuePropsFlow.A08.A00, null));
        A0r.A04();
    }

    @Override // X.InterfaceC31036Dka
    public final int getTitleRes() {
        return 2131964518;
    }
}

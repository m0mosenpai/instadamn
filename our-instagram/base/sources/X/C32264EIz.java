package X;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EIz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32264EIz extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IgMeShortUrlFragment";
    public final Handler A00 = new Handler();
    public final InterfaceC09390do A02 = AbstractC60492pY.A01(this);
    public final String A01 = "ig_me_short_url";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        UserSession userSession;
        C14360o3.A0B(interfaceC56362iU, 0);
        int A0E = AbstractC167017dG.A0E(requireContext());
        AbstractC18680vv session = getSession();
        if (session instanceof UserSession) {
            userSession = (UserSession) session;
        } else {
            userSession = null;
        }
        interfaceC56362iU.ESp(userSession, R.layout.action_bar_title_logo, A0E, 0);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-650061888);
        super.onCreate(bundle);
        String string = requireArguments().getString(AbstractC111324zv.A00(4137));
        if (string != null && string.length() != 0) {
            C25621Ms A0M = AbstractC31177DnL.A0M(getSession());
            A0M.A0B("notifications/shorturl/");
            A0M.A9s("short_code", string);
            C1ON A0e = AbstractC25227BEk.A0e(A0M, C32154EBb.class, FVJ.class);
            C31714DwJ.A00(A0e, this, 8);
            schedule(A0e);
        } else {
            AbstractC35275FhA.A03(requireActivity(), requireArguments());
        }
        C0f9.A09(-181127773, A02);
    }
}

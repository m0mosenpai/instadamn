package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.F4o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34138F4o {
    public static final void A00(Fragment fragment, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1O(userSession, fragment);
        C14360o3.A0B(interfaceC11380iw, 4);
        if (str != null && fragmentActivity != null) {
            LL0.A04(interfaceC11380iw, userSession, C05F.A0Y, str, AbstractC167007dF.A0n("surface", "user_profile"));
            AbstractC63248Sg4.A02(fragmentActivity.getSupportFragmentManager());
            F20.A00(userSession, new G1X(fragmentActivity, interfaceC11380iw, userSession, str2), AbstractC166987dD.A1J(str), true);
            return;
        }
        Context requireContext = fragment.requireContext();
        C0w9.A03("PartnershipThreadLauncher", "Unable create BC partnership thread");
        C9GR.A03(requireContext, requireContext.getString(2131968430), "network_error", 0);
    }
}

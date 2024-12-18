package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

/* loaded from: classes6.dex */
public final class G1I implements DeveloperOptionsSection {
    public static final G1I A00 = new Object();

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public final List getItems(UserSession userSession, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, AbstractC018607g abstractC018607g) {
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1P(fragmentActivity, abstractC59962oe);
        return AbstractC16960so.A1Q(GHY.A00(fragmentActivity, new ViewOnClickListenerC48068LPt(42, userSession, fragmentActivity, abstractC59962oe.requireArguments()), 2131958306), GHY.A00(fragmentActivity, new ViewOnClickListenerC38053Gog(62, fragmentActivity, userSession), 2131958449), GHY.A00(fragmentActivity, new ViewOnClickListenerC38053Gog(63, fragmentActivity, userSession), 2131958450), GHY.A00(fragmentActivity, new ViewOnClickListenerC55468OkN(66, fragmentActivity, userSession), 2131958328), C36731GHa.A02(new C35745Fqd(userSession, 54), 2131958435, AbstractC166987dD.A0x(userSession).getBoolean("show_suggestion_netego_unit_type_in_header", false)));
    }

    @Override // com.instagram.debug.devoptions.intf.DeveloperOptionsSection
    public final int getTitleRes() {
        return 2131958046;
    }
}

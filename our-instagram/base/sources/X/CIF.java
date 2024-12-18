package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CIF {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, EnumC53314Nhq enumC53314Nhq, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        if (str != null) {
            C26876Btd c26876Btd = new C26876Btd();
            c26876Btd.setArguments(AbstractC167017dG.A0T("creator_ai_agent_id_extra", str, AbstractC166987dD.A1L("creator_ai_audience_extra", enumC53314Nhq)));
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0d = fragmentActivity.getResources().getString(2131973229);
            A0y.A0U = new C29385CxI(interfaceC16820sZ, 2);
            A0y.A00().A02(fragmentActivity, c26876Btd);
        }
    }
}

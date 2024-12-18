package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.connections.notifyme.modules.fragments.NotifyMeNotFollowedFragment;
import com.instagram.user.model.User;

/* renamed from: X.Hys, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40572Hys {
    public static final void A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC1119153d interfaceC1119153d, User user, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 0);
        if (C2TN.A05(userSession, user.getId())) {
            C9GR.A07(context, 2131968861);
            if (interfaceC16820sZ != null) {
                interfaceC16820sZ.invoke();
                return;
            }
            return;
        }
        if (user.A26()) {
            AbstractC31364DqT.A03().A01(fragmentActivity, userSession, interfaceC1119153d, user, AbstractC111324zv.A00(238));
            return;
        }
        C43019J0k c43019J0k = new C43019J0k(fragmentActivity, userSession, interfaceC1119153d, user, interfaceC16820sZ);
        String id = user.getId();
        NotifyMeNotFollowedFragment notifyMeNotFollowedFragment = new NotifyMeNotFollowedFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("otherUserId", id);
        C189448aO A0W = AbstractC31174DnI.A0W(A0b, notifyMeNotFollowedFragment, userSession);
        A0W.A0U = c43019J0k;
        AbstractC25225BEi.A1Q(A0W, false);
        AbstractC31173DnH.A0w(fragmentActivity, notifyMeNotFollowedFragment, A0W);
    }
}

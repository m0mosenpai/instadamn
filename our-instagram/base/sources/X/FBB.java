package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* loaded from: classes6.dex */
public abstract class FBB {
    public static final void A00(FragmentActivity fragmentActivity, UQE uqe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        if (uqe != null) {
            AbstractC35055FcS.A01(userSession, new ChannelCreationFlowExtraArgs(null, uqe.A00, uqe.A01), ChannelCreationSource.A0C, EnumC33330EoP.A03, true).Cgf(fragmentActivity);
        }
    }
}

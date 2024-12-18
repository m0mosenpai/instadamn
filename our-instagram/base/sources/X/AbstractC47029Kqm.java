package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.view.fragment.FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig;

/* renamed from: X.Kqm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47029Kqm {
    public static final void A00(Activity activity, UserSession userSession, Integer num, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(userSession, 1);
        FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig friendMapPresenceReplyFragment$PresenceReplyLaunchConfig = new FriendMapPresenceReplyFragment$PresenceReplyLaunchConfig();
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A03 = str;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A02 = str2;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A04 = interfaceC16820sZ;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A01 = num;
        friendMapPresenceReplyFragment$PresenceReplyLaunchConfig.A00 = new C49410Lsk(interfaceC16660sJ);
        KDY kdy = new KDY();
        Bundle A06 = AbstractC31178DnM.A06("presence_launch_config", friendMapPresenceReplyFragment$PresenceReplyLaunchConfig);
        AbstractC60492pY.A04(A06, userSession);
        kdy.setArguments(A06);
        LHE.A00(activity, new C29901DGp(11, activity, num, userSession, kdy), true);
    }
}

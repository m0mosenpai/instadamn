package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.friendmap.data.FriendMapGraphQLImpl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4Eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92964Eq {
    public final FriendMapGraphQLImpl A00;

    public C92964Eq(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = new FriendMapGraphQLImpl(userSession);
    }

    public final void A00(C1P1 c1p1, User user, boolean z) {
        PandoGraphQLRequest pandoGraphQLRequest;
        C1P1 c67941V3g;
        C40701ud c40701ud = this.A00.A00;
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        String id = user.getId();
        C0CA A02 = c04060Jx.A02();
        C0CA.A00(A02, id, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        c2jm.A00.A02().A0E(A02, "data");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        InterfaceC40501uJ A00 = AbstractC40511uK.A00();
        Map paramsCopy = c2jm.getParamsCopy();
        Map paramsCopy2 = c2jm2.getParamsCopy();
        if (z) {
            pandoGraphQLRequest = new PandoGraphQLRequest(A00, "FriendsMapUserMute", paramsCopy, paramsCopy2, C66996Ueh.class, true, null, 0, null, "xdt_mute_friend_map_user", new ArrayList());
            c67941V3g = new C67940V3f(c1p1, user);
        } else {
            pandoGraphQLRequest = new PandoGraphQLRequest(A00, "FriendsMapUserUnmute", paramsCopy, paramsCopy2, C66999Uek.class, true, null, 0, null, "xdt_unmute_friend_map_user", new ArrayList());
            c67941V3g = new C67941V3g(c1p1, user);
        }
        c40701ud.A06(pandoGraphQLRequest, c67941V3g);
    }
}

package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;

/* renamed from: X.Flu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35503Flu implements View.OnClickListener {
    public final /* synthetic */ FL9 A00;

    public ViewOnClickListenerC35503Flu(FL9 fl9) {
        this.A00 = fl9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1352482615);
        FL9 fl9 = this.A00;
        UserDetailTabController userDetailTabController = fl9.A02;
        User user = userDetailTabController.A0O.A0J;
        if (user != null) {
            UserDetailFragment userDetailFragment = fl9.A01;
            UserSession userSession = fl9.A00;
            String id = user.getId();
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0L("friendships/%s/%s/feed/", "mark_user_overage", id);
            AbstractC31171DnF.A1J(A0M, id);
            A0M.A0S(C74293Vk.class, C74313Vm.class);
            userDetailFragment.schedule(AbstractC31172DnG.A0U(A0M, true));
            user.A03.EV2(null);
            userDetailFragment.A0p();
            userDetailFragment.A0u(userDetailTabController.A0B(), false);
        }
        C0f9.A0C(-34861792, A05);
    }
}

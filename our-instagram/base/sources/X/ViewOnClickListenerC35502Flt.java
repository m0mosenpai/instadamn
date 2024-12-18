package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Flt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35502Flt implements View.OnClickListener {
    public final /* synthetic */ FL9 A00;

    public ViewOnClickListenerC35502Flt(FL9 fl9) {
        this.A00 = fl9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-318286011);
        FL9 fl9 = this.A00;
        User user = fl9.A02.A0O.A0J;
        if (user != null) {
            UserSession userSession = fl9.A00;
            String id = user.getId();
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            A0M.A0L("friendships/mark_user_underage/%s/feed/", id);
            AbstractC31171DnF.A1J(A0M, id);
            A0M.A0S(EB9.class, C34729FRs.class);
            C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
            A0U.A00 = new ESV(userSession, user.getId());
            fl9.A01.schedule(A0U);
        }
        C0f9.A0C(973608589, A05);
    }
}

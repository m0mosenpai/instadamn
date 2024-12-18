package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GH8 implements C7XU {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;

    @Override // X.C7XU
    public final void DB3() {
    }

    public GH8(FragmentActivity fragmentActivity, UserSession userSession, User user) {
        this.A00 = fragmentActivity;
        this.A02 = user;
        this.A01 = userSession;
    }

    @Override // X.C7XU
    public final void DAy() {
        FragmentActivity fragmentActivity = this.A00;
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        User user = this.A02;
        A0H.A05 = AbstractC31178DnM.A0c(fragmentActivity, user, 2131964672);
        AbstractC31177DnL.A0v(fragmentActivity, A0H, user.getUsername(), 2131964671);
        A0H.A0J(new DialogInterfaceOnClickListenerC35450Fk7(fragmentActivity, this.A01, user, 23), 2131964670);
        A0H.A06();
        AbstractC166987dD.A1W(A0H);
    }
}

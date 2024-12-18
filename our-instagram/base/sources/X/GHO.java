package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GHO implements InterfaceC1571373s {
    public final /* synthetic */ C155966zQ A00;
    public final /* synthetic */ User A01;

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    public GHO(C155966zQ c155966zQ, User user) {
        this.A00 = c155966zQ;
        this.A01 = user;
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
        C155966zQ.A01(this.A00);
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        C1YY A01 = FVI.A01();
        C155966zQ c155966zQ = this.A00;
        FragmentActivity fragmentActivity = c155966zQ.A00;
        UserSession userSession = c155966zQ.A03;
        String id = this.A01.getId();
        java.util.Set set = FE3.A00;
        A01.A05(fragmentActivity, userSession, id, "profile_tab");
    }
}

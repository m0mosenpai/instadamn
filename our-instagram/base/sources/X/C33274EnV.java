package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.EnV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33274EnV extends AbstractC77473dX {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ FOR A04;
    public final /* synthetic */ User A05;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        int i;
        C14360o3.A0B(user, 0);
        UserSession userSession = this.A03;
        if (AbstractC31174DnI.A0j(userSession, user) == FollowStatus.A06) {
            User user2 = this.A05;
            if (user2.A0M() != C05F.A01) {
                String moduleName = this.A02.getModuleName();
                C140966Yy A0r = AbstractC25225BEi.A0r(this.A01, userSession);
                A0r.A06();
                A0r.A0B(null, AbstractC31364DqT.A02().A02(userSession, AbstractC31402Dr6.A03(userSession, user2.getId(), MSV.A00(1564), moduleName)));
                A0r.A04();
            }
            i = 2131976085;
        } else {
            i = 2131962763;
        }
        Context context = this.A00;
        String A0c = AbstractC31178DnM.A0c(context, user, i);
        C14360o3.A07(A0c);
        C9GR.A09(context, A0c);
    }

    public C33274EnV(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, FOR r5, User user) {
        this.A03 = userSession;
        this.A05 = user;
        this.A00 = context;
        this.A02 = interfaceC11380iw;
        this.A04 = r5;
        this.A01 = fragmentActivity;
    }
}

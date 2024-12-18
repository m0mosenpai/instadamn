package X;

import android.os.Build;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.viewmodel.ActivityFeedViewModel;
import java.util.List;

/* loaded from: classes6.dex */
public final class GAK implements InterfaceC31118Dm0 {
    public final UserSession A00;
    public final C2UY A01;
    public final List A02;
    public final List A03;

    public GAK(UserSession userSession, C31250DoY c31250DoY, FJM fjm, ActivityFeedViewModel activityFeedViewModel, C31251DoZ c31251DoZ, C2UY c2uy) {
        AbstractC167027dH.A0a(1, userSession, activityFeedViewModel, c31251DoZ, c31250DoY);
        this.A00 = userSession;
        this.A01 = c2uy;
        List A1Q = AbstractC16960so.A1Q(new GA3(c31250DoY), new C36549G9y(c31250DoY), new C36543G9s(c31250DoY), new C36544G9t(c31250DoY), new GAD(userSession, c31250DoY), new C36548G9x(c31250DoY), new C36547G9w(c31250DoY), new GA1(c31250DoY), new GAA(c31250DoY), new C36542G9r(c31250DoY), new GAB(c31250DoY));
        this.A02 = AbstractC001800i.A0S(AbstractC16960so.A1Q(new GA6(c31250DoY), new GA7(c31250DoY), new GA9(c31250DoY)), AbstractC001800i.A0S(AbstractC16960so.A1Q(new GAI(userSession, new C57518Pfs(activityFeedViewModel, 12)), new C36546G9v(new C57518Pfs(activityFeedViewModel, 13)), new GAG(userSession, c31250DoY), new C36550G9z(c31250DoY), new GAH(c31250DoY, fjm, new C57518Pfs(activityFeedViewModel, 14)), new GAC(c31250DoY), new C36545G9u(c31250DoY), new GAF(c31250DoY), new GAE(c31250DoY, fjm), new GA4(c31250DoY), new GA5(c31250DoY), new GA0(new C30753Dfq(activityFeedViewModel, 7)), new GA2(c31250DoY)), A1Q));
        this.A03 = AbstractC166987dD.A1J(new GA8(c31250DoY));
    }

    @Override // X.InterfaceC31118Dm0
    public final void D3V(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        C14360o3.A0B(c5hw, 0);
        for (GZH gzh : this.A02) {
            if (gzh.AFW(enumC33370Ep3, c5hw, i)) {
                gzh.AJb(null, mud, enumC33370Ep3, c5hw, i);
                try {
                    if (Build.VERSION.SDK_INT >= 29) {
                        C2UY c2uy = this.A01;
                        if (c2uy.A00 != null) {
                            if (C18U.A06(C06090Tz.A05, this.A00, 36322718810909108L)) {
                                c2uy.A06();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC31118Dm0
    public final boolean DQS(View view, MUD mud, EnumC33370Ep3 enumC33370Ep3, C5HW c5hw, int i) {
        for (GZH gzh : this.A03) {
            if (gzh.AFW(enumC33370Ep3, c5hw, i)) {
                gzh.AJb(null, mud, enumC33370Ep3, c5hw, i);
                return true;
            }
        }
        return false;
    }
}

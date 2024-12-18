package X;

import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.FollowRequestsActionDataSource;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N83 extends C3r5 {
    public C51684MsF A00;
    public final UserSession A01;
    public final O8I A02;
    public final FollowRequestsRepository A03;
    public final C166257bu A04;
    public final C34698FQj A05;
    public final InterfaceC09390do A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final FollowRequestsActionDataSource A09;

    public N83(UserSession userSession, O8I o8i, FollowRequestsActionDataSource followRequestsActionDataSource, FollowRequestsRepository followRequestsRepository, C166257bu c166257bu, C34698FQj c34698FQj) {
        C14360o3.A0B(userSession, 1);
        AbstractC167017dG.A1T(c34698FQj, o8i);
        this.A01 = userSession;
        this.A04 = c166257bu;
        this.A09 = followRequestsActionDataSource;
        this.A03 = followRequestsRepository;
        this.A05 = c34698FQj;
        this.A02 = o8i;
        C16930sl c16930sl = C16930sl.A00;
        this.A00 = new C51684MsF(C52627NQa.A00, c16930sl, c16930sl, c16930sl.size(), -1, 0, 0);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A07 = A12;
        this.A08 = AbstractC07080Za.A03(A12);
        this.A06 = C1XM.A00(new C57245PbT(this, 40));
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        A02(this, new AnonymousClass625(A00).A00(C36058Fvu.class), 42);
        A02(this, new AnonymousClass625(A00).A00(C36059Fvv.class), 43);
        A02(this, new AnonymousClass625(A00).A00(C55995OtS.class), 44);
        A02(this, new AnonymousClass625(A00).A00(C55996OtT.class), 45);
        A02(this, followRequestsActionDataSource.A0A, 46);
    }

    public static void A02(C3r5 c3r5, InterfaceC19390xP interfaceC19390xP, int i) {
        AbstractC18560vj.A03(c3r5.A03(), new C15340po(new PZM(c3r5, null, i), interfaceC19390xP));
    }

    @Override // X.C3r5
    public final void A04(AbstractC61152qd abstractC61152qd, boolean z) {
        super.A04(abstractC61152qd, true);
        this.A04.A04(abstractC61152qd, true);
    }

    public static final Object A00(N83 n83, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        Object obj;
        Object A02;
        Iterator it = n83.A00.A05.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(AbstractC31171DnF.A0g(obj), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        User user = (User) obj;
        if (user != null && (A02 = n83.A09.A02(user, interfaceC23621Ds, new C57245PbT(n83, 39), z)) == C1JX.A02) {
            return A02;
        }
        return C0eB.A00;
    }

    public static final Object A01(N83 n83, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        Object obj;
        Object A03;
        C51684MsF c51684MsF = n83.A00;
        List list = c51684MsF.A05;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : list) {
            AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(obj2), str, obj2, A1E);
        }
        int i = c51684MsF.A03 - 1;
        Iterator it = c51684MsF.A05.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(AbstractC31171DnF.A0g(obj), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        User user = (User) obj;
        if (user != null && (A03 = n83.A09.A03(user, interfaceC23621Ds, new BFI(i, 16, n83, A1E), z)) == C1JX.A02) {
            return A03;
        }
        return C0eB.A00;
    }
}

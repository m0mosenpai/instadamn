package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NDW extends AbstractC61132qb {
    public final int A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C1810981l A04;

    public NDW(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, int i) {
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A01 = context;
        this.A00 = i;
        this.A04 = c1810981l;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C190308bo c190308bo = C190298bn.A03;
        Context context = this.A01;
        UserSession userSession = this.A03;
        C54805OJz A01 = c190308bo.A00(context, userSession).A01();
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        C1810981l c1810981l = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        User A10 = AbstractC166987dD.A10(userSession);
        int i = this.A00;
        C37021nz A002 = C4M5.A00();
        C171537kj A003 = AbstractC171517kh.A00(userSession);
        C55782hJ A004 = C55772hI.A00(userSession);
        C23031Ai A005 = AbstractC23021Ah.A00(userSession);
        C18A A006 = AnonymousClass189.A00(userSession);
        C99694dm A007 = AbstractC99684dl.A00(userSession);
        C171617kr A008 = AbstractC171597kp.A00(userSession);
        boolean A04 = AbstractC172137li.A04(userSession);
        boolean A02 = AbstractC109224vo.A02(userSession);
        C06090Tz A0j = AbstractC25225BEi.A0j(userSession, 0);
        boolean A06 = C18U.A06(A0j, userSession, 36318196210407431L);
        boolean A009 = AbstractC109224vo.A00(userSession);
        C14360o3.A0B(userSession, 0);
        return new C51044Mgw(context, A004, interfaceC11380iw, userSession, c1810981l, A008, A007, A003, A00, A005, A10, A006, A002, A01, i, A04, A02, A06, A009, C18U.A06(A0j, userSession, 36311246953447900L), C18U.A06(A0j, userSession, 36322757465680354L), C18U.A06(A0j, userSession, 36325274316452813L), C18U.A06(A0j, userSession, 2342165766679570917L));
    }
}

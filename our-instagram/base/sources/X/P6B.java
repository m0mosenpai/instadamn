package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLConnectionConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P6B implements InterfaceC58264Ps8 {
    public ODZ A00;
    public boolean A01;
    public final UserSession A02;
    public final C40701ud A03;
    public final N2B A04;
    public final C18A A05;
    public IPandoGraphQLService.Token token;

    @Override // X.InterfaceC58264Ps8
    public final Object AV6(InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A05, this.A02, 36317320039633988L);
        A0b.A02("defer_suggested_users", A0c);
        boolean A1W = AbstractC167007dF.A1W(A0c);
        Boolean valueOf = Boolean.valueOf(z);
        A0b.A02("exclude_suggested_users", valueOf);
        boolean A1W2 = AbstractC167007dF.A1W(valueOf);
        C18C.A0E(A1W);
        InterfaceC40501uJ A0U = AbstractC25227BEk.A0U(A1W2);
        Map paramsCopy = A0b.getParamsCopy();
        Map paramsCopy2 = A0b2.getParamsCopy();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new PandoGraphQLConnectionConfig("XDTPendingUsersResponse", "edges", "users", "PendingFollows_At_Pando_Connection_Pagination_Query_users", null, "users_after_cursor", "users_first", null, "users_stream_enabled", "users_stream_initial_count", true, false));
        return MV5.A00(this, new M9S(this.A03.A05(new PandoGraphQLRequest(A0U, "PendingFollows", paramsCopy, paramsCopy2, C59998QsK.class, false, null, 0, null, "xdt_friendships_pending_users", A1E)), 14), 13);
    }

    @Override // X.InterfaceC58264Ps8
    public final void Chh() {
        ODZ odz = this.A00;
        if (odz != null && odz.A04 && !odz.A05) {
            this.token = AbstractC53987Nty.A00(odz, this.A03, 200);
        }
    }

    public /* synthetic */ P6B(UserSession userSession, N2B n2b) {
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C18A A00 = AnonymousClass189.A00(userSession);
        AbstractC37302Gc3.A1U(A01, A00);
        this.A02 = userSession;
        this.A04 = n2b;
        this.A03 = A01;
        this.A05 = A00;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.EAY, java.lang.Object, X.1um] */
    @Override // X.InterfaceC58264Ps8
    public final /* synthetic */ Object AOb(InterfaceC23621Ds interfaceC23621Ds) {
        E63 e63 = new E63(null, AbstractC166987dD.A1G());
        ?? c40791um = new C40791um();
        c40791um.A00 = e63;
        return AbstractC25225BEi.A0z(c40791um);
    }
}

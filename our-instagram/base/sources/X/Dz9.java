package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Dz9 extends AbstractC52922bZ implements InterfaceC09670ek {
    public final UserSession A00;
    public final C34600FMj A01;
    public final C31267Dop A02;
    public final AiAgentThreadLauncher A03;
    public final C05A A04;
    public final C0UO A05;

    /* JADX WARN: Multi-variable type inference failed */
    public Dz9(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C34600FMj c34600FMj = new C34600FMj(userSession);
        this.A01 = c34600FMj;
        this.A03 = new AiAgentThreadLauncher(userSession);
        this.A02 = new C31267Dop(userSession);
        C008002u A1H = AbstractC25225BEi.A1H(new C31200Dnj(null, 1, 15, null));
        this.A04 = A1H;
        C15150pV A03 = C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 7), c34600FMj.A04, A1H);
        this.A05 = AbstractC208910l.A01(new C32064E6q(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 255, 0 == true ? 1 : 0, 0 == true ? 1 : 0), AbstractC141776au.A00(this), A03, C10I.A00);
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        if (AbstractC25227BEk.A05(c07r, 1) == 1) {
            C34600FMj c34600FMj = this.A01;
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "AiAgentListQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59819Qoh.class, false, null, 0, null, MSV.A00(606), AbstractC166987dD.A1E());
            UserSession userSession = c34600FMj.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(C18U.A01(c06090Tz, userSession, 36600843715022876L));
            pandoGraphQLRequest.setFreshCacheAgeMs(C18U.A01(c06090Tz, userSession, 36600843714957339L));
            GVO gvo = GVO.A00;
            c34600FMj.A01.ATV(new C35826Fs2(1, gvo), new C55665Onq(3, c34600FMj, gvo), pandoGraphQLRequest);
        }
    }

    public static final List A00(List list, String str) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C45127Jxw c45127Jxw = (C45127Jxw) it.next();
            String str2 = c45127Jxw.A01;
            A0q.add(new C32079E8d((C5QE) c45127Jxw.A00, str2, C14360o3.A0K(str2, str)));
        }
        return A0q;
    }
}

package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.receiverfetch.graphql.IGDReceiverFetchAuthenticatedResponseImpl;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.LcO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48471LcO implements InterfaceC1345866i {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ ImmutableList A02;
    public final /* synthetic */ C47914LEi A03;
    public final /* synthetic */ L94 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C48471LcO(ImmutableList immutableList, ImmutableList immutableList2, C47914LEi c47914LEi, L94 l94, String str, String str2, int i) {
        this.A04 = l94;
        this.A00 = i;
        this.A03 = c47914LEi;
        this.A01 = immutableList;
        this.A05 = str;
        this.A06 = str2;
        this.A02 = immutableList2;
    }

    @Override // X.InterfaceC1345866i
    public final void EpD(C1346766r c1346766r) {
        L94 l94 = this.A04;
        if (l94 != null) {
            l94.A01.markerPoint(20132336, l94.A00, "preview_fetch_start");
        }
        int i = this.A00;
        if (i > 0) {
            C47914LEi c47914LEi = this.A03;
            C44913JuR c44913JuR = c47914LEi.A01;
            L83 l83 = new L83(this.A01, this.A02, c1346766r, c47914LEi, l94, this.A05, this.A06, i);
            C47582Kzs c47582Kzs = new C47582Kzs(AbstractC43592JPx.A0N(), AbstractC50712Us.A01.A03());
            Map map = ((AbstractC47917LEl) c44913JuR).A01;
            if (!map.containsKey("LS_IgdReceiverFetch")) {
                InterfaceC40711ue interfaceC40711ue = c44913JuR.A00;
                ExecutorService executorService = c44913JuR.A02;
                KzM kzM = new KzM(interfaceC40711ue, executorService);
                C47552KzN c47552KzN = new C47552KzN(interfaceC40711ue, executorService);
                UserSession userSession = c44913JuR.A01;
                map.put("LS_IgdReceiverFetch", new L2G(C1U4.A00(AbstractC25225BEi.A0F(userSession)).A00(AnonymousClass001.A0g("acs_shared_preferences_key_", "LS_IgdReceiverFetch", userSession.userId)), kzM, c47552KzN));
            }
            c47582Kzs.A01.markerStart(20120872, c47582Kzs.A00);
            ((AbstractC47917LEl) c44913JuR).A00.A00(new LVU(c44913JuR, l83, c47582Kzs));
            return;
        }
        C47914LEi c47914LEi2 = this.A03;
        ImmutableList immutableList = this.A01;
        C14360o3.A0A(immutableList);
        String str = this.A05;
        String str2 = this.A06;
        ImmutableList immutableList2 = this.A02;
        C14360o3.A0A(immutableList2);
        C14360o3.A0A(c1346766r);
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDReceiverFetchAuthenticated", A0b.getParamsCopy(), JQ1.A07(A0b, str, str2, immutableList).getParamsCopy(), IGDReceiverFetchAuthenticatedResponseImpl.class, false, null, 0, null, "igd_receiver_fetch", AbstractC166987dD.A1E());
        c47914LEi2.A02.ATW(new C48140LSp(2, l94, c47914LEi2, immutableList2, c1346766r), new C64021Sxs(2, l94, c47914LEi2, immutableList2, c1346766r), pandoGraphQLRequest, c47914LEi2.A03);
    }
}

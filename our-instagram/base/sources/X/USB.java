package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class USB extends AbstractC66541ULw {
    public final C70452WWf A00;
    public final C70452WWf A01;
    public final String A02;
    public final List A03;
    public final C68747VbQ A04;

    @Override // X.AbstractC69673VtI
    public final /* bridge */ /* synthetic */ void A01(InterfaceC65338TiJ interfaceC65338TiJ) {
        C14360o3.A0B(interfaceC65338TiJ, 0);
        super.A01(interfaceC65338TiJ);
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((C1Df) it.next()).cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USB(C70452WWf c70452WWf, UserSession userSession, String str) {
        super(str);
        String str2 = userSession.userId;
        this.A02 = str2;
        this.A00 = c70452WWf;
        this.A01 = c70452WWf;
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        C68747VbQ c68747VbQ = new C68747VbQ(this);
        this.A04 = c68747VbQ;
        Executor executor = S82.A00;
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(AbstractC25227BEk.A0T(c04060Jx, str, "thread_igid"), c2jm, "data"), AbstractC58317Pt9.A00(567), c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QlI.class, false, null, 0, null, AbstractC58317Pt9.A00(1078), new ArrayList());
        AbstractC40691uc.A01(userSession).ATV(C70438WVq.A00, new C64018Sxp(4, userSession, c68747VbQ), pandoGraphQLRequest);
        C2JM c2jm3 = new C2JM();
        C2JM c2jm4 = new C2JM();
        AbstractC31173DnH.A1M(AbstractC25227BEk.A0T(c04060Jx, str, "thread_igid"), c2jm3.A00, "input");
        arrayList.add(AbstractC40691uc.A01(userSession).A01(null, new WW0(c68747VbQ, 12), new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDirectLiveLocationUpdateSubscription", c2jm3.getParamsCopy(), c2jm4.getParamsCopy(), C67013Uey.class, false, PandoRealtimeInfoJNI.forSubscription("xfb_live_location_update_subscribe"), 0, null, "xfb_live_location_update_subscribe", new ArrayList())));
    }
}

package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class UtC extends TurnAllocationProxy {
    public final UserSession A00;

    @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationProxy
    public final void allocate(int i, String str, String str2, String str3, String str4, TurnAllocationCallback turnAllocationCallback) {
        JQ0.A1O(str, str2, str3, str4, turnAllocationCallback);
        UserSession userSession = this.A00;
        C67967V4g c67967V4g = new C67967V4g(turnAllocationCallback, 0);
        C14360o3.A0B(userSession, 0);
        C2JO c2jo = new C2JO();
        C2JO c2jo2 = new C2JO();
        c2jo2.A09(str, "sensitive_string_value");
        c2jo.A06(c2jo2, "turn_username");
        C2JO c2jo3 = new C2JO();
        c2jo3.A09(str2, "sensitive_string_value");
        c2jo.A06(c2jo3, "turn_password");
        C2JO c2jo4 = new C2JO();
        c2jo4.A09(str3, "sensitive_string_value");
        c2jo.A06(c2jo4, "session_key");
        c2jo.A07(AbstractC58319PtB.A0m(str4), "version");
        c2jo.A05("avoid_ips", C16930sl.A00);
        C66081TzI c66081TzI = new C66081TzI(c67967V4g, 33);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00(c2jo, "request");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGTurnDiscovery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67053Ufe.class, false, null, 0, null, "ig_turn_discovery", new ArrayList()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L), c66081TzI);
    }

    @Override // com.facebook.rsys.turnallocation.gen.TurnAllocationProxy
    public final void allocateMultipleRelays(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, TurnAllocationCallback turnAllocationCallback) {
        JQ0.A1O(str, str2, str3, str4, str5);
        AbstractC167017dG.A1U(str6, str7);
        C14360o3.A0B(turnAllocationCallback, 8);
        UserSession userSession = this.A00;
        C67967V4g c67967V4g = new C67967V4g(turnAllocationCallback, 1);
        C14360o3.A0B(userSession, 0);
        C04060Jx c04060Jx = GraphQlCallInput.A02;
        C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, str, "sensitive_string_value");
        C0CA A02 = c04060Jx.A02();
        A02.A0E(A0T, "turn_username");
        A02.A0E(AbstractC25227BEk.A0T(c04060Jx, str2, "sensitive_string_value"), "turn_password");
        A02.A0E(AbstractC25227BEk.A0T(c04060Jx, str3, "sensitive_string_value"), "session_key");
        C0CA.A00(A02, AbstractC58319PtB.A0m(str4), "version");
        C0CA.A00(A02, str5, "caller_id");
        C0CA.A00(A02, str6, "callee_id");
        C0CA.A00(A02, str7, "call_id");
        C66081TzI c66081TzI = new C66081TzI(c67967V4g, 34);
        C2JM c2jm = new C2JM();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, c2jm, "request"), "IGMultiRelayDiscovery", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C67037UfO.class, false, null, 0, null, "ig_multi_relay_discovery", new ArrayList()).setFreshCacheAgeMs(0L).setMaxToleratedCacheAgeMs(0L), c66081TzI);
    }

    public UtC(UserSession userSession) {
        this.A00 = userSession;
    }
}

package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37291oS implements InterfaceC29301b7 {
    public static final C0KV A02 = C37301oT.A00;
    public final UserSession A00;
    public final C40701ud A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        C37271oQ c37271oQ = (C37271oQ) c1ow;
        C14360o3.A0B(c37271oQ, 0);
        if (c37271oQ.A01 == null) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        Object orDefault;
        C37271oQ c37271oQ = (C37271oQ) c1ow;
        C14360o3.A0B(c37271oQ, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        Map map = c37271oQ.A01;
        if (map != null && (orDefault = map.getOrDefault(this.A00.userId, null)) != null) {
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            String str = c37271oQ.A00;
            if (str != null) {
                C0CA A022 = c04060Jx.A02();
                C0CA.A00(A022, str, "thread_key");
                C0CA.A00(A022, orDefault, "desired_toggle_state");
                c2jm.A00.A02().A0E(A022, "request");
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                this.A01.ATV(new C48134LSj(interfaceC37261GbE), new C48149LSy(interfaceC37261GbE), new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDirectCreatorAgentThreadToggleMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59355QdD.class, true, null, 0, null, "xig_creator_ai_toggle_ai_auto_replies", new ArrayList()));
                return;
            }
            C14360o3.A0F("threadId");
            throw C00O.createAndThrow();
        }
        interfaceC37261GbE.DUq(C114675Fx.A0c, null);
    }

    public C37291oS(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC40691uc.A01(userSession);
    }
}

package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.ArrayList;

/* renamed from: X.1ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35671ln implements InterfaceC29301b7 {
    public static final C0KV A01 = C35681lo.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C35651ll c35651ll = (C35651ll) c1ow;
        C14360o3.A0B(c35651ll, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str2 = c35651ll.A03;
        if (str2 != null) {
            String str3 = c35651ll.A00;
            if (str3 != null) {
                String str4 = c35651ll.A01;
                if (str4 != null) {
                    String str5 = c35651ll.A02;
                    if (str5 != null) {
                        C40701ud A012 = AbstractC40691uc.A01(userSession);
                        C2JM c2jm = new C2JM();
                        C2JM c2jm2 = new C2JM();
                        C0CA A02 = GraphQlCallInput.A02.A02();
                        C0CA.A00(A02, str2, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                        C0CA.A00(A02, str3, "client_mutation_id");
                        C0CA.A00(A02, str4, "recurring_prompt_creator_eimu_id");
                        C0CA.A00(A02, "ADD_YOURS", "recurring_prompt_type");
                        C0CA.A00(A02, str5, "prompt_id");
                        c2jm.A00.A02().A0E(A02, "data");
                        C2JQ c2jq = PandoGraphQLRequest.Companion;
                        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IgDirectStopRecurringPrompt", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59766Qmg.class, true, null, 8, "data", "ig_direct_stop_recurring_prompt", new ArrayList());
                        A012.ATV(C23364AXo.A00, AY6.A00, pandoGraphQLRequest);
                        interfaceC37261GbE.DUq(null, null);
                        return;
                    }
                    str = "promptId";
                } else {
                    str = "creatorId";
                }
            } else {
                str = "clientContext";
            }
        } else {
            str = "threadId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C35671ln(UserSession userSession) {
        this.A00 = userSession;
    }
}

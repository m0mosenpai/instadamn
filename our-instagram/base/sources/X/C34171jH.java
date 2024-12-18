package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.graphql.ThreadSubscribeToContentMutationResponseImpl;
import java.util.ArrayList;

/* renamed from: X.1jH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34171jH implements InterfaceC29301b7 {
    public static final C0KV A01 = C34181jI.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        String str;
        C34151jF c34151jF = (C34151jF) c1ow;
        C14360o3.A0B(c34151jF, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str2 = c34151jF.A01;
        if (str2 != null) {
            String str3 = c34151jF.A00;
            if (str3 != null) {
                MHR mhr = new MHR(interfaceC37261GbE, 40);
                C50261MHq c50261MHq = new C50261MHq(interfaceC37261GbE, 23);
                C0CA A02 = GraphQlCallInput.A02.A02();
                C0CA.A00(A02, str2, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                C0CA.A00(A02, str3, "target_message_id");
                C40701ud A012 = AbstractC40691uc.A01(userSession);
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                c2jm.A00.A02().A0E(A02, "data");
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "ThreadSubscribeToContentMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), ThreadSubscribeToContentMutationResponseImpl.class, true, null, 0, null, "ig_direct_subscribe_thread_to_content", new ArrayList());
                A012.ATV(new AXZ(c50261MHq), new C23374AXy(mhr), pandoGraphQLRequest);
                return;
            }
            str = "messageId";
        } else {
            str = "threadId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C34171jH(UserSession userSession) {
        this.A00 = userSession;
    }
}

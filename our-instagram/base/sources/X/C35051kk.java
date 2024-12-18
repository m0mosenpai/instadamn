package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.request.graphql.IGPinThreadMutationResponseImpl;
import java.util.ArrayList;

/* renamed from: X.1kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35051kk implements InterfaceC29301b7 {
    public static final C0KV A01 = C35061kl.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C35031ki c35031ki = (C35031ki) c1ow;
        C14360o3.A0B(c35031ki, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        UserSession userSession = this.A00;
        String str = c35031ki.A01;
        if (str != null) {
            boolean z = c35031ki.A02;
            C40701ud A012 = AbstractC40691uc.A01(userSession);
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A04(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            c2jm.A02("pin", Boolean.valueOf(!z));
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            A012.ATV(C23363AXn.A00, AY5.A00, new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGPinThreadMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), IGPinThreadMutationResponseImpl.class, true, null, 0, null, "xdt_pin_thread", new ArrayList()));
            interfaceC37261GbE.DUq(null, null);
            return;
        }
        C14360o3.A0F("threadId");
        throw C00O.createAndThrow();
    }

    public C35051kk(UserSession userSession) {
        this.A00 = userSession;
    }
}

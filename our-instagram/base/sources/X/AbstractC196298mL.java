package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.8mL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196298mL {
    public static final void A00(C2JO c2jo, UserSession userSession, final InterfaceC196288mK interfaceC196288mK) {
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A00(c2jo, "configs_request");
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "CrosspostingUnifiedConfigsQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C196308mM.class, false, null, 0, null, "xcxp_unified_crossposting_configs_root", new ArrayList());
        A01.ATV(new InterfaceC48212Jk() { // from class: X.8mO
            @Override // X.InterfaceC48212Jk
            public final void invoke(Throwable th) {
                InterfaceC196288mK.this.DFf();
            }
        }, new InterfaceC48192Ji() { // from class: X.8mN
            @Override // X.InterfaceC48192Ji
            public final void invoke(AnonymousClass436 anonymousClass436) {
                Object Bos;
                if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                    InterfaceC196288mK.this.Dq2((C196308mM) Bos);
                }
            }
        }, pandoGraphQLRequest);
    }
}

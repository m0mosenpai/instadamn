package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDScheduledMessageMutationResponseImpl;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;

/* renamed from: X.1m9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35891m9 implements InterfaceC29301b7 {
    public static final C0KV A02 = C35901mA.A00;
    public final UserSession A00;
    public final C2DS A01;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC29011ae abstractC29011ae = (AbstractC29011ae) c1ow;
        C14360o3.A0B(abstractC29011ae, 0);
        C14360o3.A0B(mnp, 1);
        return LCX.A01(mnp, abstractC29011ae, this.A01);
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C35871m7 c35871m7 = (C35871m7) c1ow;
        C14360o3.A0B(c35871m7, 0);
        C14360o3.A0B(interfaceC37261GbE, 2);
        final UserSession userSession = this.A00;
        DirectThreadKey directThreadKey = (DirectThreadKey) c35871m7.C7R().get(0);
        String str = c35871m7.A01;
        if (str != null) {
            long j = c35871m7.A00;
            String str2 = c35871m7.A05;
            String str3 = directThreadKey.A00;
            if (str3 == null) {
                interfaceC37261GbE.DUq(C114675Fx.A0c, null);
                return;
            }
            C0CA A022 = GraphQlCallInput.A02.A02();
            C0CA.A00(A022, str3, "ig_thread_id");
            C0CA.A00(A022, str, "text");
            C0CA.A00(A022, str2, "offline_threading_id");
            C0CA.A00(A022, Integer.valueOf((int) j), "scheduled_timestamp");
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A00.A02().A0E(A022, "input");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGDScheduledMessageMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), IGDScheduledMessageMutationResponseImpl.class, true, null, 0, null, "xig_igd_scheduled_message", new ArrayList());
            C40701ud A01 = AbstractC40691uc.A01(userSession);
            final KY9 ky9 = new KY9(userSession, interfaceC37261GbE);
            A01.ATV(new InterfaceC48212Jk() { // from class: X.LSm
                @Override // X.InterfaceC48212Jk
                public final void invoke(Throwable th) {
                    ky9.A01(userSession, th);
                }
            }, new InterfaceC48192Ji() { // from class: X.LT3
                @Override // X.InterfaceC48192Ji
                public final void invoke(AnonymousClass436 anonymousClass436) {
                    ky9.A00(anonymousClass436, userSession);
                }
            }, pandoGraphQLRequest);
            return;
        }
        C14360o3.A0F("text");
        throw C00O.createAndThrow();
    }

    public C35891m9(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC28761aE.A00(userSession);
    }
}

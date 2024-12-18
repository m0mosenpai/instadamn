package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Vrs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69589Vrs {
    public final C68718Vau A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    public C69589Vrs(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new C68718Vau(userSession);
        this.A02 = AbstractC09440dt.A01(X4Q.A00);
        this.A03 = AbstractC09440dt.A01(new X31(this, 2));
    }

    public final void A00(C50679MYx c50679MYx) {
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        c2jm.A04("entrypoint", c50679MYx.A00);
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGProfessionalIdentityUpdateCacheMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C66767UaT.class, true, null, 0, null, "update_ig_pro_identity_cache", new ArrayList());
        C67954V3t c67954V3t = new C67954V3t(2, c50679MYx, this);
        C19L c19l = (C19L) this.A02.getValue();
        AbstractC23641Du.A05(AnonymousClass191.A00, new MC7(pandoGraphQLRequest, c67954V3t, this, null, 16), c19l);
    }
}

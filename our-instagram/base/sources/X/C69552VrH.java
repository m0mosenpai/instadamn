package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.VrH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69552VrH {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new X2y(this, 46));

    public final void A00(C9CN c9cn, C97K c97k, C97X c97x) {
        C14360o3.A0B(c97k, 1);
        C97Y c97y = C97Y.A00;
        UserSession userSession = this.A00;
        if (!c97y.A00(userSession, c9cn.A02)) {
            c97x.onError(X1z.A00);
            return;
        }
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C69284Vks c69284Vks = new C69284Vks(new C68949Ven(userSession), (AKJ) this.A01.getValue(), A01, new X2y(this, 47), C71813X5r.A00);
        C2JO A0K = AbstractC65702TsY.A0K(c9cn);
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, "1L1D", "key");
        A0T.A0E(A0K.A02(), "caller_context");
        C2JM c2jm = new C2JM();
        c69284Vks.A02.A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, c2jm, "input"), "IGOneLinkMiddlewarePageWithBPLPageInfoQuery", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C66763UaO.class, false, null, 0, null, "xfb_one_link_monoschema", new ArrayList()), new U7V(3, c9cn, c69284Vks, c97k, c97x));
    }

    public C69552VrH(UserSession userSession) {
        this.A00 = userSession;
    }
}

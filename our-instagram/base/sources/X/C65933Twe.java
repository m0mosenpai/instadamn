package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Twe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65933Twe {
    public final C97O A00;
    public final UserSession A01;

    public final void A00(C9CN c9cn, C97X c97x, String str) {
        boolean A1R = AbstractC167007dF.A1R(0, c9cn, str);
        C97Y c97y = C97Y.A00;
        UserSession userSession = this.A01;
        if (!c97y.A00(userSession, c9cn.A02)) {
            c97x.onError(X1z.A00);
            return;
        }
        C2JO A0K = AbstractC65702TsY.A0K(c9cn);
        C0CA A02 = GraphQlCallInput.A02.A02();
        A02.A0E(A0K.A02(), "caller_context");
        C0CA.A00(A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C0CA.A00(A02, "IG_USER", "input_id_type");
        C2JM c2jm = new C2JM();
        AbstractC40691uc.A01(userSession).A06(new PandoGraphQLRequest(AbstractC25233BEq.A0H(A02, c2jm, "input"), "IGOneLinkLoggedOutWAMiddlewareQuery", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C65946Twr.class, false, null, 0, null, "xfb_one_link_logged_out_whatsapp_info_monoschema", new ArrayList()), new Tx4(A1R ? 1 : 0, c9cn, this, c97x));
    }

    public C65933Twe(C97O c97o, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c97o;
    }
}

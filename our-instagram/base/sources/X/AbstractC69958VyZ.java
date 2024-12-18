package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.VyZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69958VyZ {
    public static PandoGraphQLRequest A00(String str) {
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C0CA.A00(A0T, "PAGE", "input_id_type");
        C2JM c2jm = new C2JM();
        return new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, c2jm, "input"), "IGLocationBusinessUserInfoQuery", c2jm.getParamsCopy(), new C2JM().getParamsCopy(), C67033UfK.class, false, null, 0, null, "xfb_one_link_logged_out_page_info_monoschema", new ArrayList());
    }

    public static C1ON A01(UserSession userSession, InterfaceC71955XCh interfaceC71955XCh, String str) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0L("locations/%s/location_info/", str);
        C1ON A0S = AbstractC31172DnG.A0S(A0N, C67845UzJ.class, C69960Vyb.class);
        if (interfaceC71955XCh != null) {
            A0S.A00 = new C66081TzI(interfaceC71955XCh, 31);
        }
        return A0S;
    }
}

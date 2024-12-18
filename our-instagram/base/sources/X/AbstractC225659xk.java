package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.9xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225659xk {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type kotlin.String");
        Object A032 = c6fw.A03(1);
        C14360o3.A0C(A032, AbstractC58317Pt9.A00(887));
        Map map = (Map) A032;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
            HashMap A00 = VM9.A00(map);
            if (A00 != null) {
                JSONObject jSONObject = new JSONObject();
                Iterator A14 = AbstractC166997dE.A14(A00);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    String str2 = (String) A1K.getKey();
                    Object value = A1K.getValue();
                    if (value == null) {
                        value = JSONObject.NULL;
                    }
                    jSONObject.put(str2, value);
                }
                str = AbstractC166987dD.A19(jSONObject);
            } else {
                str = null;
            }
            C04060Jx c04060Jx = GraphQlCallInput.A02;
            C0CA A02 = c04060Jx.A02();
            C0CA.A00(A02, A03, "app_id");
            C0CA.A00(A02, "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf", "bloks_versioning_id");
            String A05 = C16030qx.A02.A05(c6fg.A00);
            String A022 = AbstractC31581Du9.A02(0, 9, 107);
            C0CA A023 = c04060Jx.A02();
            C0CA.A00(A023, A05, A022);
            A02.A0E(A023, "infra_params");
            C0CA.A00(A02, str, "params");
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            c2jm.A00.A02().A0E(A02, "params");
            c2jm.A00(C192748gG.A00(), "bk_context");
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "BloksMetaAIFetchResponseStreamQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C213079cU.class, false, null, 0, null, "meta_ai_bloks_actions", AbstractC166987dD.A1E());
            pandoGraphQLRequest.setEnsureCacheWrite(false);
            pandoGraphQLRequest.setMaxToleratedCacheAgeMs(0L);
            pandoGraphQLRequest.setRequestPurpose(2);
            C215059fh c215059fh = new C215059fh(pandoGraphQLRequest, new C192778gJ(C63B.A01), c6fq, AbstractC40691uc.A01(userSession));
            c215059fh.A00(new C67905V1u(c6fq, 1));
            C1GJ.A06(c215059fh, -6, 3, true, true);
            AnonymousClass634.A09(c6fg, new C23593Acn(c215059fh));
        }
        return null;
    }
}

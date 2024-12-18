package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.FCl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34343FCl {
    public static void A00(C2n2 c2n2, C40701ud c40701ud, C70805WhL c70805WhL, String str) {
        Object obj;
        if (str != null) {
            obj = c70805WhL.A00.BFG(str);
        } else {
            obj = null;
        }
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, obj, "share_id");
        C0CA.A00(A0T, str, "media_id");
        C0CA.A00(A0T, "media", TraceFieldType.ContentType);
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "GenerateExternalShareUrlInfo", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C60414Qz2.class, true, null, 0, null, "xdt__generate_share_url_info", AbstractC166987dD.A1E());
        C60902RbH c60902RbH = new C60902RbH(c2n2, 6);
        C1ON A00 = AnonymousClass963.A00(c40701ud.A03(pandoGraphQLRequest));
        A00.A00 = c60902RbH;
        C1GJ.A03(A00);
    }
}

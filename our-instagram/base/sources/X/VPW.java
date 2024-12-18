package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VPW {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.Wcz, java.lang.Object] */
    public static final boolean A00(UserSession userSession) {
        if (userSession == null) {
            return true;
        }
        C2JM c2jm = new C2JM();
        C2JM c2jm2 = new C2JM();
        C2JQ c2jq = PandoGraphQLRequest.Companion;
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGFxFbProfilePicIsSilhouetteQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67017Uf2.class, false, null, 0, null, "fx_accounts", new ArrayList());
        ?? obj = new Object();
        AbstractC40691uc.A01(userSession).ATV(new C70434WVm(obj, 1), new WW0(obj, 3), pandoGraphQLRequest);
        return obj.A00;
    }
}

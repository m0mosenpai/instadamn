package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VLV {
    public static final Object A00(C6FW c6fw) {
        List list = c6fw.A00;
        Object obj = list.get(0);
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        C6FG c6fg = (C6FG) obj;
        Object obj2 = list.get(1);
        if (obj2 != null) {
            C6F3 A04 = AnonymousClass634.A04(c6fg, "gql");
            if (A04 != null && (A04 instanceof C6F2)) {
                List A1J = AbstractC166987dD.A1J(obj2);
                PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI = ((PandoGraphQLServiceJNI) ((IPandoGraphQLService) ((C6F2) A04).A00.A00())).mGraphqlConsistency;
                if (pandoGraphQLConsistencyJNI != null) {
                    pandoGraphQLConsistencyJNI.publishTreeUpdaters(A1J, false);
                    return null;
                }
                return null;
            }
            throw new RuntimeException("Pando GraphQL Module not found");
        }
        throw new RuntimeException("Tried to publish null TreeUpdater");
    }
}

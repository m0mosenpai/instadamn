package X;

import com.facebook.pando.IPandoGraphQLService;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoGraphQLServiceJNI;

/* loaded from: classes11.dex */
public abstract class VLF {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            String str = (String) c6fw.A00.get(1);
            if (str != null) {
                C6F3 A04 = AnonymousClass634.A04(c6fg, "gql");
                if (A04 != null && (A04 instanceof C6F2)) {
                    PandoGraphQLConsistencyJNI pandoGraphQLConsistencyJNI = ((PandoGraphQLServiceJNI) ((IPandoGraphQLService) ((C6F2) A04).A00.A00())).mGraphqlConsistency;
                    if (pandoGraphQLConsistencyJNI != null) {
                        pandoGraphQLConsistencyJNI.publish(str);
                        return null;
                    }
                    return null;
                }
                throw new RuntimeException("Pando GraphQL Module not found");
            }
            throw new RuntimeException("Tried to publish a null GraphQL payload to Pando.");
        }
        throw AbstractC166997dE.A0g();
    }
}

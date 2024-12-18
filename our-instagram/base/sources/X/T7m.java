package X;

import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.error.GraphServicesExceptionMigrationAdapter;

/* loaded from: classes10.dex */
public final class T7m implements C2n2 {
    public static final T7m A00 = new T7m();

    @Override // X.C2n2
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        GraphQLError graphQLErrorFromException = GraphServicesExceptionMigrationAdapter.getGraphQLErrorFromException(th);
        if (graphQLErrorFromException != null) {
            return C64865TXq.A00(graphQLErrorFromException.debugInfo, th);
        }
        return th;
    }
}

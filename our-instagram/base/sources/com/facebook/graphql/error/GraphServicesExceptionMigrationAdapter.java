package com.facebook.graphql.error;

import X.AbstractC25230BEn;
import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;

/* loaded from: classes10.dex */
public class GraphServicesExceptionMigrationAdapter {
    public static boolean isGraphServicesExceptionEnabled;

    public static GraphQLError getGraphQLErrorFromException(Throwable th) {
        if (th instanceof GraphServicesException) {
            return ((GraphServicesException) th).mError;
        }
        return null;
    }

    public static Summary getSummaryFromException(Throwable th) {
        if (th instanceof GraphServicesException) {
            return ((GraphServicesException) th).mSummary;
        }
        return null;
    }

    public static TigonError getTigonErrorFromException(Throwable th) {
        if (th instanceof TigonErrorException) {
            return ((TigonErrorException) th).tigonError;
        }
        if (th instanceof GraphServicesException) {
            return ((GraphServicesException) th).mTigonError;
        }
        return null;
    }

    public static boolean isGraphServicesError(Throwable th) {
        return AbstractC25230BEn.A1Q(th instanceof GraphServicesException ? 1 : 0);
    }

    public static boolean isGraphServicesExceptionEnabled() {
        return isGraphServicesExceptionEnabled;
    }

    public static boolean isNetworkError(Throwable th) {
        if ((th instanceof GraphServicesException) || !(th instanceof TigonErrorException)) {
            return false;
        }
        return true;
    }

    public static void setIsGraphServicesExceptionEnabled(boolean z) {
        isGraphServicesExceptionEnabled = z;
    }
}

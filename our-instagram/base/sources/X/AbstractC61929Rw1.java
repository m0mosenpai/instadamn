package X;

import com.facebook.common.dextricks.JITProfilePQR;
import go.Seq;

/* renamed from: X.Rw1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61929Rw1 {
    public static String A00(int i) {
        if (i == 1) {
            return "GRAPHQL_TRIM_TO_MINIMUM";
        }
        if (i == 2) {
            return "GRAPHQL_TRIM_TO_NOTHING";
        }
        if (i == 38) {
            return "GRAPHQL_GRAPHQL_READ_QUERY";
        }
        if (i == 39) {
            return "GRAPHQL_GRAPHQL_BATCH_QUERY";
        }
        if (i == 57) {
            return "GRAPHQL_GRAPHSERVICE_READ_QUERY";
        }
        if (i == 58) {
            return "GRAPHQL_GRAPHSERVICE_QUERY_EXECUTOR";
        }
        if (i == 65) {
            return "GRAPHQL_GRAPHSERVICE_QUERY_EXECUTION";
        }
        if (i == 66) {
            return "GRAPHQL_GRAPHSERVICE_CONSISTENCY_UPDATE";
        }
        if (i == 69) {
            return "GRAPHQL_GRAPHSERVICE_QUERY_EXECUTION_EVENT";
        }
        if (i == 70) {
            return "GRAPHQL_GRAPHSERVICE_CONSISTENCY_EVENT";
        }
        switch (i) {
            case 31:
                return "GRAPHQL_UPDATE_MODEL_FROM_CACHE";
            case 35:
                return "GRAPHQL_UPDATE_DB";
            case Seq.NULL_REFNUM /* 41 */:
                return "GRAPHQL_GRAPHQL_MUTATION";
            case 43:
                return "GRAPHQL_TRIM_ON_BACKGROUND";
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return "GRAPHQL_CONSISTENT_FIELDS_QUERY";
            case 75:
                return "GRAPHQL_IS_DEEP_EQUAL_GUESS";
            case 2358:
                return "GRAPHQL_PANDO_QUERY_EXECUTION";
            case 2543:
                return "GRAPHQL_PREFETCH_DROP_BASED_ON_NETWORK";
            case 5448:
                return "GRAPHQL_OPTIMISTIC_MUTATION";
            case 8328:
                return "GRAPHQL_GRAPHSERVICE_STARTUP_CONSISTENCY_EVENT";
            case 10764:
                return "GRAPHQL_GRAPHSERVICE_TREE_BUILDER";
            case 11268:
                return "GRAPHQL_CONSISTENCY_OPERATION";
            case 15530:
                return "GRAPHQL_GRAPHSERVICE_CACHE_WRITE";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}

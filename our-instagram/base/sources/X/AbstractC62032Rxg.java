package X;

/* renamed from: X.Rxg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62032Rxg {
    public static String A00(int i) {
        if (i == 1) {
            return "MOBILECONFIG_NATIVE_MANAGER_CREATION";
        }
        if (i == 2) {
            return "MOBILECONFIG_JAVA_MANAGER_CREATION";
        }
        if (i == 3) {
            return "MOBILECONFIG_SESSION_BASED_INIT";
        }
        if (i == 4) {
            return "MOBILECONFIG_SESSIONLESS_INIT";
        }
        if (i == 16) {
            return "MOBILECONFIG_AFTER_LOGIN";
        }
        if (i == 17) {
            return "MOBILECONFIG_MOBILECONFIG_SYNC_FETCH";
        }
        switch (i) {
            case 11:
                return "MOBILECONFIG_MOBILECONFIG_SYNC_FETCH_IOS";
            case 3271:
                return "MOBILECONFIG_IG_EXPERIMENTS_SYNC_CHECK";
            case 3401:
                return "MOBILECONFIG_PAGEID_INIT";
            case 4691:
                return "MOBILECONFIG_PAGEID_UPDATE";
            case 5144:
                return "MOBILECONFIG_NEEDLE_ERROR";
            case 5495:
                return "MOBILECONFIG_JAVA_PARAMS_MAP_GET_HASH";
            case 6483:
                return "MOBILECONFIG_MC_CLIENT_CACHE_ERROR";
            case 8048:
                return "MOBILECONFIG_API_ERROR";
            case 10149:
                return "MOBILECONFIG_API_INVALID_SPECIFIER";
            case 10342:
                return "MOBILECONFIG_ADMINID_INIT";
            case 10678:
                return "MOBILECONFIG_MOBILECONFIG_CACHE_E2E_TEST";
            case 12004:
                return "MOBILECONFIG_PARAMS_MAP_FACTORY_CREATE";
            case 12995:
                return "MOBILECONFIG_JAVA_PARAMS_MAP_PARSE_BASE";
            case 13082:
                return "MOBILECONFIG_STABLE_SPECIFIER_INIT";
            case 13316:
                return "MOBILECONFIG_IG4A_TRANSLATION_TABLE";
            case 14252:
                return "MOBILECONFIG_VERIFY_STORE";
            case 14384:
                return "MOBILECONFIG_STORAGE_INIT";
            case 14442:
                return "MOBILECONFIG_JAVA_PARAMS_MAP_PARSE_NATIVE";
            case 15347:
                return "MOBILECONFIG_VALIDATE_PARAMS_MAP_MERGE_V2";
            case 15629:
                return "MOBILECONFIG_IG_MOBILE_CONFIG_CACHE";
            case 15750:
                return "MOBILECONFIG_JAVA_PARAMS_MAP_PARSE_MERGED";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}

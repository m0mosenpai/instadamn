package X;

/* renamed from: X.Rxf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62031Rxf {
    public static String A00(int i) {
        if (i == 8) {
            return "MOBILE_STORAGE_TRIMMABLE_UNREGISTER";
        }
        if (i == 3280) {
            return "MOBILE_STORAGE_STORAGE_MANAGER_ALLOCATE_BYTES";
        }
        if (i == 4921) {
            return "MOBILE_STORAGE_SPECIFIED_CONFIG_EVICTION";
        }
        switch (i) {
            case 1:
                return "MOBILE_STORAGE_MONITOR_TASK";
            case 2:
                return "MOBILE_STORAGE_MONITOR_TASK_REGISTER";
            case 3:
                return "MOBILE_STORAGE_TRIMMABLE_REGISTER";
            case 4:
                return "MOBILE_STORAGE_TRIMMABLE_ON_UPDATE";
            case 5:
                return "MOBILE_STORAGE_TRIMMABLE_TRIM_TO_MINIMUM";
            case 6:
                return "MOBILE_STORAGE_TRIMMABLE_TRIM_TO_NOTHING";
            default:
                return "UNDEFINED_QPL_EVENT";
        }
    }
}

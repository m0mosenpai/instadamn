package X;

/* loaded from: classes10.dex */
public abstract class Pv4 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PREFETCH";
            case 2:
                return "LOAD_ONLY";
            case 3:
                return "SYSTEM_PREFETCH";
            case 4:
                return "FALLBACK_DOWNLOAD";
            case 5:
                return "MERGED";
            case 6:
                return "BACKGROUND";
            case 7:
                return "OPTIMISTIC_LOAD";
            case 8:
                return "UNINSTALL";
            default:
                return MSV.A00(75);
        }
    }
}

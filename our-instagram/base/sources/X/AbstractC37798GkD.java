package X;

/* renamed from: X.GkD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37798GkD {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "headload";
            case 2:
                return "ptr";
            case 3:
                return "tailload";
            case 4:
                return MSV.A00(1195);
            default:
                return "prefetch";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return AbstractC111324zv.A00(1640);
            case 2:
                return "PULL_TO_REFRESH";
            case 3:
                return "TAIL_LOAD";
            case 4:
                return "CACHE_FETCH";
            default:
                return "PREFETCH";
        }
    }
}

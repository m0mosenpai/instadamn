package X;

/* loaded from: classes5.dex */
public abstract class CL1 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNSET";
            case 1:
                return "SEND_MESSAGE";
            case 2:
                return "PREFILL_COMPOSER_WITH_PROMPT";
            default:
                return "PREFILL_COMPOSER_WITH_META_AI";
        }
    }
}

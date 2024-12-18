package X;

/* renamed from: X.9wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225199wi {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MAILBOX_READY";
            case 2:
                return "MAILBOX_HIT_ERROR";
            case 3:
                return "CLEAN_UP";
            case 4:
                return "CLEAN_UP_READY";
            default:
                return "RUN_WITH_MAILBOX";
        }
    }
}

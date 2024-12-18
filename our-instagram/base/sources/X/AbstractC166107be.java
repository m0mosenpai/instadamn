package X;

/* renamed from: X.7be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC166107be {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return AbstractC43591JPw.A00(196);
            case 2:
                return "meta_verified";
            case 3:
                return "followers";
            case 4:
                return "following";
            case 5:
                return "questions";
            case 6:
                return "undefined";
            default:
                return "popular";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "LATEST_TOP";
            case 2:
                return "META_VERIFIED";
            case 3:
                return "FOLLOWERS";
            case 4:
                return AbstractC43591JPw.A00(271);
            case 5:
                return "QUESTIONS";
            case 6:
                return "NOT_SET";
            default:
                return "RANKED";
        }
    }
}

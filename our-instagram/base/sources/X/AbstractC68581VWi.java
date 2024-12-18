package X;

/* renamed from: X.VWi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68581VWi {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "invitation_impression";
            case 1:
                return "invitation_opened";
            case 2:
                return "impression";
            case 3:
                return "start";
            case 4:
                return "completion";
            default:
                return "skip";
        }
    }
}

package X;

/* loaded from: classes5.dex */
public abstract class CJK {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FOLLOW";
                break;
            case 2:
                str = "FOLLOW_BACK";
                break;
            case 3:
                str = "FOLLOWING";
                break;
            case 4:
                str = "JOIN";
                break;
            case 5:
                str = "LOADING";
                break;
            case 6:
                str = "MEMBER";
                break;
            case 7:
                str = "REQUESTED";
                break;
            case 8:
                str = "UNBLOCK";
                break;
            case 9:
                str = "UNKNOWN";
                break;
            default:
                str = "ADMIN";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}

package X;

/* loaded from: classes6.dex */
public abstract class F2B {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "WINNER";
                break;
            case 2:
                str = "MEMBER";
                break;
            case 3:
                str = "OTHER";
                break;
            default:
                str = "CREATOR";
                break;
        }
        return str.hashCode() + intValue;
    }
}

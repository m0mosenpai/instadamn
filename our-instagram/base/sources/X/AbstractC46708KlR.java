package X;

/* renamed from: X.KlR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46708KlR {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FULL_VIEW";
                break;
            case 2:
                str = "THREAD_DETAILS";
                break;
            case 3:
                str = "OTHER";
                break;
            default:
                str = "CHAT_THREAD";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}

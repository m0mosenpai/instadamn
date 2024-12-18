package X;

/* renamed from: X.Nsa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53901Nsa {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "AdjustUpdate";
            case 2:
                return "AdjustStitching";
            case 3:
                return "AdjustCompleted";
            default:
                return "AdjustStarted";
        }
    }
}

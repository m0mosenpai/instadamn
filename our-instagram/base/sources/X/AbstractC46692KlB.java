package X;

/* renamed from: X.KlB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46692KlB {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "CATEGORY_SELECTION";
                break;
            case 2:
                str = "SEARCH_BAR";
                break;
            default:
                str = "ON_LOAD";
                break;
        }
        return AbstractC25226BEj.A02(str, intValue);
    }
}

package X;

/* renamed from: X.5OS, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5OS {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "lastDismissForSurface";
            case 2:
                return "impressionCount";
            case 3:
                return "lastImpressionTime";
            case 4:
                return "primaryActionCount";
            case 5:
                return "primaryActionTime";
            case 6:
                return "secondaryActionCount";
            case 7:
                return "secondaryActionTime";
            case 8:
                return "dismissActionCount";
            case 9:
                return "dismissActionTime";
            default:
                return "lastImpressionForSurface";
        }
    }
}

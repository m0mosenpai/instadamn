package X;

/* renamed from: X.9y8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225899y8 {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        if (1 != intValue) {
            str = "IDLE";
        } else {
            str = "LOADING";
        }
        return str.hashCode() + intValue;
    }
}

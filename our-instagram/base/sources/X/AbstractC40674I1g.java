package X;

/* renamed from: X.I1g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40674I1g {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = "GAP_0";
            } else {
                str2 = "NEXT_AD_SLOT_REPLACEMENT";
            }
            if (str2.equalsIgnoreCase(str)) {
                return num;
            }
        }
        return null;
    }
}

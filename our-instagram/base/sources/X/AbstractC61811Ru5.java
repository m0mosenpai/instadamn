package X;

/* renamed from: X.Ru5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61811Ru5 {
    public static final boolean A00(String str) {
        String str2;
        if (str == null) {
            return false;
        }
        Integer[] A00 = C05F.A00(4);
        int length = A00.length;
        for (int i = 0; i < length; i++) {
            switch (MSW.A07(A00, i)) {
                case 1:
                    str2 = "android.test.canceled";
                    break;
                case 2:
                    str2 = "android.test.refunded";
                    break;
                case 3:
                    str2 = "android.test.item_unavailable";
                    break;
                default:
                    str2 = "android.test.purchased";
                    break;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}

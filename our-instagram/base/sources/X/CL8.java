package X;

/* loaded from: classes5.dex */
public abstract class CL8 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ConsentSecondary";
            case 2:
                return "Text";
            case 3:
                return "PrimaryDeemphasized";
            case 4:
                return "ConsentPrimary";
            default:
                return "Primary";
        }
    }
}

package X;

/* renamed from: X.Kij, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46544Kij {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
            case 1:
                return "DOES_NOT_REQUIRE_MIGRATION";
            case 2:
                return "REQUIRES_MIGRATION";
            case 3:
                return "REQUIRES_PIN_RESET_FOR_NORMALIZATION";
            default:
                return "REQUIRES_PIN_RESET_FOR_PIN_NOT_REGISTERED";
        }
    }
}

package X;

/* renamed from: X.NzJ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54299NzJ {
    public static String A00() {
        if (!"true".equals(System.getProperty("is_e2e_testing"))) {
            return null;
        }
        return System.getProperty("fb.e2e.DOGFOOD_CARRIER_ID");
    }
}

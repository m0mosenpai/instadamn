package X;

/* renamed from: X.Krc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47081Krc {
    public static final String A00(EnumC117355Su enumC117355Su) {
        int ordinal;
        if (enumC117355Su == null) {
            ordinal = -1;
        } else {
            AbstractC47080Krb abstractC47080Krb = AbstractC47080Krb.$redex_init_class;
            ordinal = enumC117355Su.ordinal();
        }
        if (ordinal == 1) {
            return "direct_v2_text";
        }
        if (ordinal != 4) {
            if (ordinal == 2 || ordinal == 3) {
                return "direct_v2_text";
            }
            return "";
        }
        return "direct_v2_reel_share";
    }
}

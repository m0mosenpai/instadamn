package X;

import java.util.Locale;

/* renamed from: X.Sfm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63234Sfm {
    public static final boolean A01(EnumC61122Rfc enumC61122Rfc) {
        C14360o3.A0B(enumC61122Rfc, 0);
        if (enumC61122Rfc != EnumC61122Rfc.A02 && enumC61122Rfc != EnumC61122Rfc.A04) {
            return false;
        }
        return true;
    }

    public static final boolean A02(EnumC61122Rfc enumC61122Rfc) {
        C14360o3.A0B(enumC61122Rfc, 0);
        if (enumC61122Rfc != EnumC61122Rfc.A02 && enumC61122Rfc != EnumC61122Rfc.A03) {
            return false;
        }
        return true;
    }

    public static final EnumC61122Rfc A00(String str) {
        if (str == null) {
            return EnumC61122Rfc.A02;
        }
        Locale locale = Locale.US;
        C14360o3.A08(locale);
        return EnumC61122Rfc.valueOf(AbstractC002300n.A0d(AbstractC166997dE.A10(locale, str), "-", "_", false));
    }
}

package X;

import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33407Epe {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33407Epe[] A03;
    public static final EnumC33407Epe A04;
    public static final EnumC33407Epe A05;
    public static final EnumC33407Epe A06;
    public static final EnumC33407Epe A07;
    public static final EnumC33407Epe A08;
    public static final EnumC33407Epe A09;
    public static final EnumC33407Epe A0A;
    public static final EnumC33407Epe A0B;
    public static final EnumC33407Epe A0C;
    public static final EnumC33407Epe A0D;
    public static final EnumC33407Epe A0E;
    public static final EnumC33407Epe A0F;
    public final String A00;

    static {
        EnumC33407Epe enumC33407Epe = new EnumC33407Epe(PaymentDetailChangeTypes$Companion.EMAIL, 0, "email");
        A04 = enumC33407Epe;
        EnumC33407Epe enumC33407Epe2 = new EnumC33407Epe("MONETIZATION_INBOX", 1, "monetization_inbox");
        A06 = enumC33407Epe2;
        EnumC33407Epe enumC33407Epe3 = new EnumC33407Epe("NOTIFICATION", 2, "notification");
        A08 = enumC33407Epe3;
        EnumC33407Epe enumC33407Epe4 = new EnumC33407Epe("POST_LIVE", 3, "post_live");
        A0A = enumC33407Epe4;
        EnumC33407Epe enumC33407Epe5 = new EnumC33407Epe("PRO_HOME", 4, "pro_home");
        A0C = enumC33407Epe5;
        EnumC33407Epe enumC33407Epe6 = new EnumC33407Epe("QP", 5, "qp");
        A0D = enumC33407Epe6;
        EnumC33407Epe enumC33407Epe7 = new EnumC33407Epe("SETTINGS", 6, "settings");
        A0E = enumC33407Epe7;
        EnumC33407Epe enumC33407Epe8 = new EnumC33407Epe("UNKNOWN", 7, "unknown");
        A0F = enumC33407Epe8;
        EnumC33407Epe enumC33407Epe9 = new EnumC33407Epe("MONETIZATION_ELIGIBILITY_SCREEN", 8, "monetization_eligibility_screen");
        A05 = enumC33407Epe9;
        EnumC33407Epe enumC33407Epe10 = new EnumC33407Epe("PAYOUT_HUB", 9, "payout_hub");
        A09 = enumC33407Epe10;
        EnumC33407Epe enumC33407Epe11 = new EnumC33407Epe("PROFILE", 10, "profile");
        A0B = enumC33407Epe11;
        EnumC33407Epe enumC33407Epe12 = new EnumC33407Epe("NATIVE_PROMO_DIALOG", 11, "native_promo_dialog");
        A07 = enumC33407Epe12;
        EnumC33407Epe[] enumC33407EpeArr = {enumC33407Epe, enumC33407Epe2, enumC33407Epe3, enumC33407Epe4, enumC33407Epe5, enumC33407Epe6, enumC33407Epe7, enumC33407Epe8, enumC33407Epe9, enumC33407Epe10, enumC33407Epe11, enumC33407Epe12, new EnumC33407Epe("BSC_PRO_DASH", 12, "bsc_pro_dash")};
        A03 = enumC33407EpeArr;
        A02 = AbstractC12190kN.A00(enumC33407EpeArr);
        EnumC33407Epe[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33407Epe enumC33407Epe13 : values) {
            A18.put(enumC33407Epe13.A00, enumC33407Epe13);
        }
        A01 = A18;
    }

    public static EnumC33407Epe valueOf(String str) {
        return (EnumC33407Epe) Enum.valueOf(EnumC33407Epe.class, str);
    }

    public static EnumC33407Epe[] values() {
        return (EnumC33407Epe[]) A03.clone();
    }

    public EnumC33407Epe(String str, int i, String str2) {
        this.A00 = str2;
    }
}

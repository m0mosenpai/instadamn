package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33403Epa {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33403Epa[] A03;
    public static final EnumC33403Epa A04;
    public static final EnumC33403Epa A05;
    public static final EnumC33403Epa A06;
    public static final EnumC33403Epa A07;
    public static final EnumC33403Epa A08;
    public static final EnumC33403Epa A09;
    public static final EnumC33403Epa A0A;
    public final String A00;

    static {
        EnumC33403Epa enumC33403Epa = new EnumC33403Epa("LOGIN", 0, "Login");
        A08 = enumC33403Epa;
        EnumC33403Epa enumC33403Epa2 = new EnumC33403Epa("REGISTRATION", 1, "Registration");
        A09 = enumC33403Epa2;
        EnumC33403Epa enumC33403Epa3 = new EnumC33403Epa("ACCOUNT_RECOVERY", 2, "AccountRecovery");
        A04 = enumC33403Epa3;
        EnumC33403Epa enumC33403Epa4 = new EnumC33403Epa("AYMH", 3, "AccountsYouMayHave");
        A05 = enumC33403Epa4;
        EnumC33403Epa enumC33403Epa5 = new EnumC33403Epa("EAR", 4, "ExtendedAccountRecovery");
        A06 = enumC33403Epa5;
        EnumC33403Epa enumC33403Epa6 = new EnumC33403Epa("EPSILONMAGICLINK", 5, "EpsilonMagicLink");
        A07 = enumC33403Epa6;
        EnumC33403Epa enumC33403Epa7 = new EnumC33403Epa("UNKNOWN", 6, "Unknown");
        A0A = enumC33403Epa7;
        EnumC33403Epa[] enumC33403EpaArr = {enumC33403Epa, enumC33403Epa2, enumC33403Epa3, enumC33403Epa4, enumC33403Epa5, enumC33403Epa6, enumC33403Epa7};
        A03 = enumC33403EpaArr;
        A02 = AbstractC12190kN.A00(enumC33403EpaArr);
        EnumC33403Epa[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33403Epa enumC33403Epa8 : values) {
            A18.put(enumC33403Epa8.A00, enumC33403Epa8);
        }
        A01 = A18;
    }

    public static EnumC33403Epa valueOf(String str) {
        return (EnumC33403Epa) Enum.valueOf(EnumC33403Epa.class, str);
    }

    public static EnumC33403Epa[] values() {
        return (EnumC33403Epa[]) A03.clone();
    }

    public EnumC33403Epa(String str, int i, String str2) {
        this.A00 = str2;
    }
}

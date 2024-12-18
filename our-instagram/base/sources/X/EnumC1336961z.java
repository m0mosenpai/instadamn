package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.61z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1336961z {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC1336961z[] A02;
    public static final EnumC1336961z A03;
    public static final EnumC1336961z A04;
    public static final EnumC1336961z A05;
    public final String A00;

    static {
        EnumC1336961z enumC1336961z = new EnumC1336961z("RecoveryCode", 0, "rc");
        A05 = enumC1336961z;
        EnumC1336961z enumC1336961z2 = new EnumC1336961z("MessageExpirationOptOutKey", 1, "me_opt_out_flag");
        A03 = enumC1336961z2;
        EnumC1336961z enumC1336961z3 = new EnumC1336961z("MessageExpirationTriggeredKey", 2, "me_triggered_flag");
        A04 = enumC1336961z3;
        EnumC1336961z[] enumC1336961zArr = {enumC1336961z, enumC1336961z2, enumC1336961z3, new EnumC1336961z("TestSharedKey", 3, "testSharedKey")};
        A02 = enumC1336961zArr;
        A01 = AbstractC12190kN.A00(enumC1336961zArr);
    }

    public static EnumC1336961z valueOf(String str) {
        return (EnumC1336961z) Enum.valueOf(EnumC1336961z.class, str);
    }

    public static EnumC1336961z[] values() {
        return (EnumC1336961z[]) A02.clone();
    }

    public EnumC1336961z(String str, int i, String str2) {
        this.A00 = str2;
    }
}

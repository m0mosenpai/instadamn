package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Eph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33410Eph {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33410Eph[] A03;
    public static final EnumC33410Eph A04;
    public static final EnumC33410Eph A05;
    public static final EnumC33410Eph A06;
    public static final EnumC33410Eph A07;
    public final int A00;
    public final String A01;

    public static EnumC33410Eph valueOf(String str) {
        return (EnumC33410Eph) Enum.valueOf(EnumC33410Eph.class, str);
    }

    public static EnumC33410Eph[] values() {
        return (EnumC33410Eph[]) A03.clone();
    }

    static {
        EnumC33410Eph enumC33410Eph = new EnumC33410Eph(0, 2131964800, "ENGLISH", "en");
        A04 = enumC33410Eph;
        EnumC33410Eph enumC33410Eph2 = new EnumC33410Eph(1, 2131964803, "JAPANESE", "ja");
        A06 = enumC33410Eph2;
        EnumC33410Eph enumC33410Eph3 = new EnumC33410Eph(2, 2131964804, "SPANISH", "es");
        A07 = enumC33410Eph3;
        EnumC33410Eph enumC33410Eph4 = new EnumC33410Eph(3, 2131964801, "FRENCH", "fr");
        A05 = enumC33410Eph4;
        EnumC33410Eph[] enumC33410EphArr = {enumC33410Eph, enumC33410Eph2, enumC33410Eph3, enumC33410Eph4, new EnumC33410Eph(4, 2131964802, "GERMAN", "de")};
        A03 = enumC33410EphArr;
        A02 = AbstractC12190kN.A00(enumC33410EphArr);
    }

    public EnumC33410Eph(int i, int i2, String str, String str2) {
        this.A01 = str2;
        this.A00 = i2;
    }
}

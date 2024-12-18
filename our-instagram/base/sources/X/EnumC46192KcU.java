package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.KcU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46192KcU {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC46192KcU[] A02;
    public static final EnumC46192KcU A03;
    public static final EnumC46192KcU A04;
    public static final EnumC46192KcU A05;
    public final String A00;

    static {
        EnumC46192KcU enumC46192KcU = new EnumC46192KcU("REPEATING_PATTERN", 0, "REPEATING_PATTERN");
        A04 = enumC46192KcU;
        EnumC46192KcU enumC46192KcU2 = new EnumC46192KcU("TEXTURE", 1, "TEXTURE");
        A05 = enumC46192KcU2;
        EnumC46192KcU enumC46192KcU3 = new EnumC46192KcU("MINIMALISTIC", 2, "MINIMALISTIC");
        A03 = enumC46192KcU3;
        EnumC46192KcU[] enumC46192KcUArr = {enumC46192KcU, enumC46192KcU2, enumC46192KcU3};
        A02 = enumC46192KcUArr;
        A01 = AbstractC12190kN.A00(enumC46192KcUArr);
    }

    public static EnumC46192KcU valueOf(String str) {
        return (EnumC46192KcU) Enum.valueOf(EnumC46192KcU.class, str);
    }

    public static EnumC46192KcU[] values() {
        return (EnumC46192KcU[]) A02.clone();
    }

    public EnumC46192KcU(String str, int i, String str2) {
        this.A00 = str2;
    }
}

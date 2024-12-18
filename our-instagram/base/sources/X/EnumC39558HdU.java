package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39558HdU {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC39558HdU[] A02;
    public static final EnumC39558HdU A03;
    public static final EnumC39558HdU A04;
    public final String A00;

    static {
        EnumC39558HdU enumC39558HdU = new EnumC39558HdU("RECON_ROW_SECTION", 0, "destination_row_section");
        A03 = enumC39558HdU;
        EnumC39558HdU enumC39558HdU2 = new EnumC39558HdU("UNKNOWN", 1, "UNKNOWN");
        A04 = enumC39558HdU2;
        EnumC39558HdU[] enumC39558HdUArr = {enumC39558HdU, enumC39558HdU2};
        A02 = enumC39558HdUArr;
        A01 = AbstractC12190kN.A00(enumC39558HdUArr);
    }

    public static EnumC39558HdU valueOf(String str) {
        return (EnumC39558HdU) Enum.valueOf(EnumC39558HdU.class, str);
    }

    public static EnumC39558HdU[] values() {
        return (EnumC39558HdU[]) A02.clone();
    }

    public EnumC39558HdU(String str, int i, String str2) {
        this.A00 = str2;
    }
}

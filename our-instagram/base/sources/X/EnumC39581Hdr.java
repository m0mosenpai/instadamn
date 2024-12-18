package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39581Hdr {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39581Hdr[] A03;
    public static final EnumC39581Hdr A04;
    public static final EnumC39581Hdr A05;
    public static final EnumC39581Hdr A06;
    public static final EnumC39581Hdr A07;
    public static final EnumC39581Hdr A08;
    public static final EnumC39581Hdr A09;
    public static final EnumC39581Hdr A0A;
    public final String A00;

    static {
        EnumC39581Hdr enumC39581Hdr = new EnumC39581Hdr("GRID_PACK", 0, "grid_pack");
        A08 = enumC39581Hdr;
        EnumC39581Hdr enumC39581Hdr2 = new EnumC39581Hdr("CARD", 1, "card");
        A05 = enumC39581Hdr2;
        EnumC39581Hdr enumC39581Hdr3 = new EnumC39581Hdr("TRAY", 2, "tray");
        A0A = enumC39581Hdr3;
        EnumC39581Hdr enumC39581Hdr4 = new EnumC39581Hdr("BRAND_ROWS", 3, "brand_rows");
        A04 = enumC39581Hdr4;
        EnumC39581Hdr enumC39581Hdr5 = new EnumC39581Hdr("POGS", 4, "pogs");
        A09 = enumC39581Hdr5;
        EnumC39581Hdr enumC39581Hdr6 = new EnumC39581Hdr("CHANNEL_HSCROLL", 5, "channel_hscroll");
        A07 = enumC39581Hdr6;
        EnumC39581Hdr enumC39581Hdr7 = new EnumC39581Hdr("CARD_WITH_PREVIEW", 6, "card_with_preview");
        A06 = enumC39581Hdr7;
        EnumC39581Hdr[] enumC39581HdrArr = {enumC39581Hdr, enumC39581Hdr2, enumC39581Hdr3, enumC39581Hdr4, enumC39581Hdr5, enumC39581Hdr6, enumC39581Hdr7, new EnumC39581Hdr("UNKNOWN", 7, "UNKNOWN")};
        A03 = enumC39581HdrArr;
        A02 = AbstractC12190kN.A00(enumC39581HdrArr);
        EnumC39581Hdr[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39581Hdr enumC39581Hdr8 : values) {
            A18.put(enumC39581Hdr8.A00, enumC39581Hdr8);
        }
        A01 = A18;
    }

    public static EnumC39581Hdr valueOf(String str) {
        return (EnumC39581Hdr) Enum.valueOf(EnumC39581Hdr.class, str);
    }

    public static EnumC39581Hdr[] values() {
        return (EnumC39581Hdr[]) A03.clone();
    }

    public EnumC39581Hdr(String str, int i, String str2) {
        this.A00 = str2;
    }
}

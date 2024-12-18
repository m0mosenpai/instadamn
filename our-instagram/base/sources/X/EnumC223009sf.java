package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223009sf {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC223009sf[] A03;
    public static final EnumC223009sf A04;
    public static final EnumC223009sf A05;
    public static final EnumC223009sf A06;
    public static final EnumC223009sf A07;
    public static final EnumC223009sf A08;
    public static final EnumC223009sf A09;
    public static final EnumC223009sf A0A;
    public static final EnumC223009sf A0B;
    public static final EnumC223009sf A0C;
    public static final EnumC223009sf A0D;
    public static final EnumC223009sf A0E;
    public static final EnumC223009sf A0F;
    public static final EnumC223009sf A0G;
    public final String A00;

    public static EnumC223009sf valueOf(String str) {
        return (EnumC223009sf) Enum.valueOf(EnumC223009sf.class, str);
    }

    public static EnumC223009sf[] values() {
        return (EnumC223009sf[]) A03.clone();
    }

    static {
        EnumC223009sf enumC223009sf = new EnumC223009sf("CLASSIC", 0, "classic");
        A05 = enumC223009sf;
        EnumC223009sf enumC223009sf2 = new EnumC223009sf("TYPEWRITER", 1, "typewriter");
        A0E = enumC223009sf2;
        EnumC223009sf enumC223009sf3 = new EnumC223009sf("ROTATING", 2, "rotating");
        A0B = enumC223009sf3;
        EnumC223009sf enumC223009sf4 = new EnumC223009sf("STRONG", 3, "strong");
        A0D = enumC223009sf4;
        EnumC223009sf enumC223009sf5 = new EnumC223009sf("ELEGANT", 4, "elegant");
        A06 = enumC223009sf5;
        EnumC223009sf enumC223009sf6 = new EnumC223009sf("STRETCH_SHRINK", 5, "stretch_shrink");
        A0C = enumC223009sf6;
        EnumC223009sf enumC223009sf7 = new EnumC223009sf("LITERATURE", 6, "literature");
        A09 = enumC223009sf7;
        EnumC223009sf enumC223009sf8 = new EnumC223009sf("BOUNCE_IN", 7, "bounce_in");
        A04 = enumC223009sf8;
        EnumC223009sf enumC223009sf9 = new EnumC223009sf("FLASHING", 8, "flashing");
        A07 = enumC223009sf9;
        EnumC223009sf enumC223009sf10 = new EnumC223009sf("TYPEWRITER_NO_CURSOR", 9, "typewriter_no_cursor");
        A0F = enumC223009sf10;
        EnumC223009sf enumC223009sf11 = new EnumC223009sf("TYPEWRITER_NO_CURSOR_V2", 10, "typewriter_no_cursor_v2");
        A0G = enumC223009sf11;
        EnumC223009sf enumC223009sf12 = new EnumC223009sf("POP", 11, "pop");
        A0A = enumC223009sf12;
        EnumC223009sf enumC223009sf13 = new EnumC223009sf("JUMP", 12, "jump");
        A08 = enumC223009sf13;
        EnumC223009sf[] enumC223009sfArr = {enumC223009sf, enumC223009sf2, enumC223009sf3, enumC223009sf4, enumC223009sf5, enumC223009sf6, enumC223009sf7, enumC223009sf8, enumC223009sf9, enumC223009sf10, enumC223009sf11, enumC223009sf12, enumC223009sf13};
        A03 = enumC223009sfArr;
        A02 = AbstractC12190kN.A00(enumC223009sfArr);
        EnumC223009sf[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC223009sf enumC223009sf14 : values) {
            linkedHashMap.put(enumC223009sf14.A00, enumC223009sf14);
        }
        A01 = linkedHashMap;
    }

    public EnumC223009sf(String str, int i, String str2) {
        this.A00 = str2;
    }
}

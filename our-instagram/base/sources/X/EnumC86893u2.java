package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3u2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC86893u2 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC86893u2[] A03;
    public static final EnumC86893u2 A04;
    public static final EnumC86893u2 A05;
    public static final EnumC86893u2 A06;
    public static final EnumC86893u2 A07;
    public static final EnumC86893u2 A08;
    public final String A00;

    static {
        EnumC86893u2 enumC86893u2 = new EnumC86893u2("PRODUCTION", 0, "");
        A05 = enumC86893u2;
        EnumC86893u2 enumC86893u22 = new EnumC86893u2("ENDCARD_AUTOPLAY", 1, "endcard_autoplay");
        A04 = enumC86893u22;
        EnumC86893u2 enumC86893u23 = new EnumC86893u2("THREE_CARDS", 2, "three_cards");
        A07 = enumC86893u23;
        EnumC86893u2 enumC86893u24 = new EnumC86893u2("UP_NEXT_OVERLAY", 3, "up_next_overlay");
        A08 = enumC86893u24;
        EnumC86893u2 enumC86893u25 = new EnumC86893u2("RIFU_OVERLAY", 4, "rifu_overlay");
        A06 = enumC86893u25;
        EnumC86893u2[] enumC86893u2Arr = {enumC86893u2, enumC86893u22, enumC86893u23, enumC86893u24, enumC86893u25, new EnumC86893u2("MINI_PLAYER", 5, "mini_player")};
        A03 = enumC86893u2Arr;
        A02 = AbstractC12190kN.A00(enumC86893u2Arr);
        EnumC86893u2[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC86893u2 enumC86893u26 : values) {
            linkedHashMap.put(enumC86893u26.A00, enumC86893u26);
        }
        A01 = linkedHashMap;
    }

    public static EnumC86893u2 valueOf(String str) {
        return (EnumC86893u2) Enum.valueOf(EnumC86893u2.class, str);
    }

    public static EnumC86893u2[] values() {
        return (EnumC86893u2[]) A03.clone();
    }

    public EnumC86893u2(String str, int i, String str2) {
        this.A00 = str2;
    }
}

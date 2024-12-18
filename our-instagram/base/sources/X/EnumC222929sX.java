package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222929sX {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222929sX[] A03;
    public static final EnumC222929sX A04;
    public static final EnumC222929sX A05;
    public static final EnumC222929sX A06;
    public static final EnumC222929sX A07;
    public static final EnumC222929sX A08;
    public final String A00;

    static {
        EnumC222929sX enumC222929sX = new EnumC222929sX("SIDE_BY_SIDE", 0, "side_by_side");
        A07 = enumC222929sX;
        EnumC222929sX enumC222929sX2 = new EnumC222929sX("TOP_AND_BOTTOM", 1, "top_and_bottom");
        A08 = enumC222929sX2;
        EnumC222929sX enumC222929sX3 = new EnumC222929sX("PICTURE_IN_PICTURE", 2, "picture_in_picture");
        A05 = enumC222929sX3;
        EnumC222929sX enumC222929sX4 = new EnumC222929sX("GREEN_SCREEN", 3, "green_screen");
        A04 = enumC222929sX4;
        EnumC222929sX enumC222929sX5 = new EnumC222929sX("SEQUENTIAL", 4, "sequential");
        A06 = enumC222929sX5;
        EnumC222929sX[] enumC222929sXArr = {enumC222929sX, enumC222929sX2, enumC222929sX3, enumC222929sX4, enumC222929sX5, new EnumC222929sX("HIDDEN", 5, "hidden")};
        A03 = enumC222929sXArr;
        A02 = AbstractC12190kN.A00(enumC222929sXArr);
        EnumC222929sX[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222929sX enumC222929sX6 : values) {
            linkedHashMap.put(enumC222929sX6.A00, enumC222929sX6);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222929sX valueOf(String str) {
        return (EnumC222929sX) Enum.valueOf(EnumC222929sX.class, str);
    }

    public static EnumC222929sX[] values() {
        return (EnumC222929sX[]) A03.clone();
    }

    public EnumC222929sX(String str, int i, String str2) {
        this.A00 = str2;
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Qj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC138786Qj {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC138786Qj[] A03;
    public static final EnumC138786Qj A04;
    public static final EnumC138786Qj A05;
    public static final EnumC138786Qj A06;
    public static final EnumC138786Qj A07;
    public static final EnumC138786Qj A08;
    public static final EnumC138786Qj A09;
    public static final EnumC138786Qj A0A;
    public static final EnumC138786Qj A0B;
    public static final EnumC138786Qj A0C;
    public final int A00;

    static {
        EnumC138786Qj enumC138786Qj = new EnumC138786Qj("THREE_THUMBNAILS", 0, 1);
        A07 = enumC138786Qj;
        EnumC138786Qj enumC138786Qj2 = new EnumC138786Qj("FOUR_THUMBNAILS", 1, 2);
        A04 = enumC138786Qj2;
        EnumC138786Qj enumC138786Qj3 = new EnumC138786Qj("HIDE_THUMBNAILS", 2, 3);
        A05 = enumC138786Qj3;
        EnumC138786Qj enumC138786Qj4 = new EnumC138786Qj("TWO_THUMBNAILS", 3, 5);
        A0C = enumC138786Qj4;
        EnumC138786Qj enumC138786Qj5 = new EnumC138786Qj("TOP_MAIN_BOTTOM_TWO_TAPPABLE_THUMBNAILS", 4, 6);
        A0A = enumC138786Qj5;
        EnumC138786Qj enumC138786Qj6 = new EnumC138786Qj("TOP_MAIN_BOTTOM_THREE_TAPPABLE_THUMBNAILS", 5, 7);
        A09 = enumC138786Qj6;
        EnumC138786Qj enumC138786Qj7 = new EnumC138786Qj("TOP_MAIN_BOTTOM_TWO_TAPPABLE_THUMBNAILS_WITH_TITLES", 6, 8);
        A0B = enumC138786Qj7;
        EnumC138786Qj enumC138786Qj8 = new EnumC138786Qj("TOP_MAIN_BOTTOM_SCROLLABLE_THUMBNAILS", 7, 9);
        A08 = enumC138786Qj8;
        EnumC138786Qj enumC138786Qj9 = new EnumC138786Qj("SECOND_CARD_TAPPABLE_THUMBNAILS", 8, 10);
        A06 = enumC138786Qj9;
        EnumC138786Qj[] enumC138786QjArr = {enumC138786Qj, enumC138786Qj2, enumC138786Qj3, enumC138786Qj4, enumC138786Qj5, enumC138786Qj6, enumC138786Qj7, enumC138786Qj8, enumC138786Qj9, new EnumC138786Qj("SECOND_CARD_TAPPABLE_THUMBNAILS_WITH_TITLES", 9, 11)};
        A03 = enumC138786QjArr;
        A02 = AbstractC12190kN.A00(enumC138786QjArr);
        EnumC138786Qj[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC138786Qj enumC138786Qj10 : values) {
            linkedHashMap.put(Integer.valueOf(enumC138786Qj10.A00), enumC138786Qj10);
        }
        A01 = linkedHashMap;
    }

    public static EnumC138786Qj valueOf(String str) {
        return (EnumC138786Qj) Enum.valueOf(EnumC138786Qj.class, str);
    }

    public static EnumC138786Qj[] values() {
        return (EnumC138786Qj[]) A03.clone();
    }

    public EnumC138786Qj(String str, int i, int i2) {
        this.A00 = i2;
    }
}

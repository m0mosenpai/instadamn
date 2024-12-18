package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC132885zD {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC132885zD[] A03;
    public static final EnumC132885zD A04;
    public static final EnumC132885zD A05;
    public static final EnumC132885zD A06;
    public static final EnumC132885zD A07;
    public static final EnumC132885zD A08;
    public static final EnumC132885zD A09;
    public static final EnumC132885zD A0A;
    public final String A00;

    static {
        EnumC132885zD enumC132885zD = new EnumC132885zD("BOTTOM_WITH_ICON_STACKED", 0, "bottom_with_icon_stacked");
        A06 = enumC132885zD;
        EnumC132885zD enumC132885zD2 = new EnumC132885zD("BOTTOM_WITH_ICON_HORIZONTAL", 1, "bottom_with_icon_horizontal");
        A05 = enumC132885zD2;
        EnumC132885zD enumC132885zD3 = new EnumC132885zD("BOTTOM_WITH_TOP_RIGHT_ICON", 2, "bottom_with_top_right_icon");
        A07 = enumC132885zD3;
        EnumC132885zD enumC132885zD4 = new EnumC132885zD("BOTTOM", 3, "bottom");
        A04 = enumC132885zD4;
        EnumC132885zD enumC132885zD5 = new EnumC132885zD("TOP_RIGHT_CIRCLE", 4, "top_right");
        A09 = enumC132885zD5;
        EnumC132885zD enumC132885zD6 = new EnumC132885zD("TOP_RIGHT_ICON", 5, "top_right_icon");
        A0A = enumC132885zD6;
        EnumC132885zD enumC132885zD7 = new EnumC132885zD("NO_DESIGN", 6, "no_design");
        A08 = enumC132885zD7;
        EnumC132885zD[] enumC132885zDArr = {enumC132885zD, enumC132885zD2, enumC132885zD3, enumC132885zD4, enumC132885zD5, enumC132885zD6, enumC132885zD7};
        A03 = enumC132885zDArr;
        A02 = AbstractC12190kN.A00(enumC132885zDArr);
        A01 = new HashMap();
        for (EnumC132885zD enumC132885zD8 : values()) {
            A01.put(enumC132885zD8.A00, enumC132885zD8);
        }
    }

    public static EnumC132885zD valueOf(String str) {
        return (EnumC132885zD) Enum.valueOf(EnumC132885zD.class, str);
    }

    public static EnumC132885zD[] values() {
        return (EnumC132885zD[]) A03.clone();
    }

    public EnumC132885zD(String str, int i, String str2) {
        this.A00 = str2;
    }
}

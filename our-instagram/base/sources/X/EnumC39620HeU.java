package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HeU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39620HeU {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39620HeU[] A03;
    public static final EnumC39620HeU A04;
    public static final EnumC39620HeU A05;
    public static final EnumC39620HeU A06;
    public static final EnumC39620HeU A07;
    public static final EnumC39620HeU A08;
    public final String A00;

    static {
        EnumC39620HeU enumC39620HeU = new EnumC39620HeU("GRID", 0, "grid");
        A04 = enumC39620HeU;
        EnumC39620HeU enumC39620HeU2 = new EnumC39620HeU("GRID_WITH_SINGLE_IMAGE_FALLBACK", 1, "grid_with_single_image_fallback");
        A05 = enumC39620HeU2;
        EnumC39620HeU enumC39620HeU3 = new EnumC39620HeU("HSCROLL", 2, "hscroll");
        A06 = enumC39620HeU3;
        EnumC39620HeU enumC39620HeU4 = new EnumC39620HeU("PRODUCT_GRID_LIST", 3, "product_grid_list");
        A07 = enumC39620HeU4;
        EnumC39620HeU enumC39620HeU5 = new EnumC39620HeU("SLIDESHOW", 4, "slideshow");
        A08 = enumC39620HeU5;
        EnumC39620HeU[] enumC39620HeUArr = {enumC39620HeU, enumC39620HeU2, enumC39620HeU3, enumC39620HeU4, enumC39620HeU5};
        A03 = enumC39620HeUArr;
        A02 = AbstractC12190kN.A00(enumC39620HeUArr);
        EnumC39620HeU[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39620HeU enumC39620HeU6 : values) {
            A18.put(enumC39620HeU6.A00, enumC39620HeU6);
        }
        A01 = A18;
    }

    public static EnumC39620HeU valueOf(String str) {
        return (EnumC39620HeU) Enum.valueOf(EnumC39620HeU.class, str);
    }

    public static EnumC39620HeU[] values() {
        return (EnumC39620HeU[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC39620HeU(String str, int i, String str2) {
        this.A00 = str2;
    }
}

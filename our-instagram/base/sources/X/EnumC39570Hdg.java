package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hdg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39570Hdg {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39570Hdg[] A03;
    public static final EnumC39570Hdg A04;
    public static final EnumC39570Hdg A05;
    public static final EnumC39570Hdg A06;
    public static final EnumC39570Hdg A07;
    public final String A00;

    static {
        EnumC39570Hdg enumC39570Hdg = new EnumC39570Hdg("BELOW_THUMBNAIL", 0, "below_thumbnail");
        A04 = enumC39570Hdg;
        EnumC39570Hdg enumC39570Hdg2 = new EnumC39570Hdg("ON_THUMBNAIL_TOP", 1, "on_thumbnail_top");
        A06 = enumC39570Hdg2;
        EnumC39570Hdg enumC39570Hdg3 = new EnumC39570Hdg("ON_THUMBNAIL_TOP_EMPHASIZED", 2, "on_thumbnail_top_emphasized");
        A07 = enumC39570Hdg3;
        EnumC39570Hdg enumC39570Hdg4 = new EnumC39570Hdg("ON_THUMBNAIL_BOTTOM", 3, "on_thumbnail_bottom");
        A05 = enumC39570Hdg4;
        EnumC39570Hdg[] enumC39570HdgArr = {enumC39570Hdg, enumC39570Hdg2, enumC39570Hdg3, enumC39570Hdg4, new EnumC39570Hdg("ON_THUMBNAIL_BOTTOM_EMPHASIZED", 4, "on_thumbnail_bottom_emphasized")};
        A03 = enumC39570HdgArr;
        A02 = AbstractC12190kN.A00(enumC39570HdgArr);
        EnumC39570Hdg[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39570Hdg enumC39570Hdg5 : values) {
            A18.put(enumC39570Hdg5.A00, enumC39570Hdg5);
        }
        A01 = A18;
    }

    public static EnumC39570Hdg valueOf(String str) {
        return (EnumC39570Hdg) Enum.valueOf(EnumC39570Hdg.class, str);
    }

    public static EnumC39570Hdg[] values() {
        return (EnumC39570Hdg[]) A03.clone();
    }

    public EnumC39570Hdg(String str, int i, String str2) {
        this.A00 = str2;
    }
}

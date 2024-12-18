package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC59022n0 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC59022n0[] A03;
    public static final EnumC59022n0 A04;
    public static final EnumC59022n0 A05;
    public static final EnumC59022n0 A06;
    public static final EnumC59022n0 A07;
    public static final EnumC59022n0 A08;
    public static final EnumC59022n0 A09;
    public final String A00;

    static {
        EnumC59022n0 enumC59022n0 = new EnumC59022n0("INAPPLICABLE", 0, "-2");
        A05 = enumC59022n0;
        EnumC59022n0 enumC59022n02 = new EnumC59022n0("UNKNOWN", 1, "-1");
        A09 = enumC59022n02;
        EnumC59022n0 enumC59022n03 = new EnumC59022n0("AD", 2, "4");
        A04 = enumC59022n03;
        EnumC59022n0 enumC59022n04 = new EnumC59022n0("INSTAGRAM_PHOTO", 3, "15");
        A06 = enumC59022n04;
        EnumC59022n0 enumC59022n05 = new EnumC59022n0("INSTAGRAM_VIDEO", 4, "16");
        A08 = enumC59022n05;
        EnumC59022n0 enumC59022n06 = new EnumC59022n0("INSTAGRAM_PROFILE_PIC", 5, "19");
        A07 = enumC59022n06;
        EnumC59022n0[] enumC59022n0Arr = {enumC59022n0, enumC59022n02, enumC59022n03, enumC59022n04, enumC59022n05, enumC59022n06};
        A03 = enumC59022n0Arr;
        A02 = AbstractC12190kN.A00(enumC59022n0Arr);
        EnumC59022n0[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC59022n0 enumC59022n07 : values) {
            linkedHashMap.put(enumC59022n07.A00, enumC59022n07);
        }
        A01 = linkedHashMap;
    }

    public static EnumC59022n0 valueOf(String str) {
        return (EnumC59022n0) Enum.valueOf(EnumC59022n0.class, str);
    }

    public static EnumC59022n0[] values() {
        return (EnumC59022n0[]) A03.clone();
    }

    public EnumC59022n0(String str, int i, String str2) {
        this.A00 = str2;
    }
}

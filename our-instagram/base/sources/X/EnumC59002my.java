package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2my, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC59002my {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC59002my[] A03;
    public static final EnumC59002my A04;
    public static final EnumC59002my A05;
    public static final EnumC59002my A06;
    public static final EnumC59002my A07;
    public final String A00;

    static {
        EnumC59002my enumC59002my = new EnumC59002my("INAPPLICABLE", 0, "-2");
        A05 = enumC59002my;
        EnumC59002my enumC59002my2 = new EnumC59002my("UNKNOWN", 1, "-1");
        A07 = enumC59002my2;
        EnumC59002my enumC59002my3 = new EnumC59002my("HAYSTACK_AD", 2, "45");
        A04 = enumC59002my3;
        EnumC59002my enumC59002my4 = new EnumC59002my("INSTAGRAM_VIDEO", 3, "50");
        A06 = enumC59002my4;
        EnumC59002my[] enumC59002myArr = {enumC59002my, enumC59002my2, enumC59002my3, enumC59002my4, new EnumC59002my("INSTAGRAM_PHOTO", 4, "51")};
        A03 = enumC59002myArr;
        A02 = AbstractC12190kN.A00(enumC59002myArr);
        EnumC59002my[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC59002my enumC59002my5 : values) {
            linkedHashMap.put(enumC59002my5.A00, enumC59002my5);
        }
        A01 = linkedHashMap;
    }

    public static EnumC59002my valueOf(String str) {
        return (EnumC59002my) Enum.valueOf(EnumC59002my.class, str);
    }

    public static EnumC59002my[] values() {
        return (EnumC59002my[]) A03.clone();
    }

    public EnumC59002my(String str, int i, String str2) {
        this.A00 = str2;
    }
}

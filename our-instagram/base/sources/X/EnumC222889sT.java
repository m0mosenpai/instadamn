package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222889sT {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222889sT[] A03;
    public static final EnumC222889sT A04;
    public static final EnumC222889sT A05;
    public static final EnumC222889sT A06;
    public final String A00;

    static {
        EnumC222889sT enumC222889sT = new EnumC222889sT("STORY_MEDIA", 0, "story_media");
        A06 = enumC222889sT;
        EnumC222889sT enumC222889sT2 = new EnumC222889sT("FEED_MEDIA", 1, "feed_media");
        A04 = enumC222889sT2;
        EnumC222889sT enumC222889sT3 = new EnumC222889sT("FRIENDSHIP_CREATION", 2, "friendship_creation");
        A05 = enumC222889sT3;
        EnumC222889sT[] enumC222889sTArr = {enumC222889sT, enumC222889sT2, enumC222889sT3};
        A03 = enumC222889sTArr;
        A02 = AbstractC12190kN.A00(enumC222889sTArr);
        EnumC222889sT[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222889sT enumC222889sT4 : values) {
            linkedHashMap.put(enumC222889sT4.A00, enumC222889sT4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222889sT valueOf(String str) {
        return (EnumC222889sT) Enum.valueOf(EnumC222889sT.class, str);
    }

    public static EnumC222889sT[] values() {
        return (EnumC222889sT[]) A03.clone();
    }

    public EnumC222889sT(String str, int i, String str2) {
        this.A00 = str2;
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222859sQ {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222859sQ[] A03;
    public static final EnumC222859sQ A04;
    public static final EnumC222859sQ A05;
    public static final EnumC222859sQ A06;
    public final String A00;

    static {
        EnumC222859sQ enumC222859sQ = new EnumC222859sQ("MUSIC_PARTNER", 0, "music_partner");
        A05 = enumC222859sQ;
        EnumC222859sQ enumC222859sQ2 = new EnumC222859sQ("BARCELONA_CLIPS", 1, "barcelona_clips");
        A04 = enumC222859sQ2;
        EnumC222859sQ enumC222859sQ3 = new EnumC222859sQ("UNKNOWN", 2, "unknown");
        A06 = enumC222859sQ3;
        EnumC222859sQ[] enumC222859sQArr = {enumC222859sQ, enumC222859sQ2, enumC222859sQ3};
        A03 = enumC222859sQArr;
        A02 = AbstractC12190kN.A00(enumC222859sQArr);
        EnumC222859sQ[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222859sQ enumC222859sQ4 : values) {
            linkedHashMap.put(enumC222859sQ4.A00, enumC222859sQ4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222859sQ valueOf(String str) {
        return (EnumC222859sQ) Enum.valueOf(EnumC222859sQ.class, str);
    }

    public static EnumC222859sQ[] values() {
        return (EnumC222859sQ[]) A03.clone();
    }

    public EnumC222859sQ(String str, int i, String str2) {
        this.A00 = str2;
    }
}

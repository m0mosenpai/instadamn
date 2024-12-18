package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68155VDz {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68155VDz[] A03;
    public static final EnumC68155VDz A04;
    public static final EnumC68155VDz A05;
    public static final EnumC68155VDz A06;
    public static final EnumC68155VDz A07;
    public static final EnumC68155VDz A08;
    public static final EnumC68155VDz A09;
    public final String A00;

    public static EnumC68155VDz valueOf(String str) {
        return (EnumC68155VDz) Enum.valueOf(EnumC68155VDz.class, str);
    }

    public static EnumC68155VDz[] values() {
        return (EnumC68155VDz[]) A03.clone();
    }

    static {
        EnumC68155VDz enumC68155VDz = new EnumC68155VDz("SPARKLE", 0, "sparkle");
        A09 = enumC68155VDz;
        EnumC68155VDz enumC68155VDz2 = new EnumC68155VDz("NEON", 1, "neon");
        A06 = enumC68155VDz2;
        EnumC68155VDz enumC68155VDz3 = new EnumC68155VDz("SHIMMER", 2, "shimmer");
        A08 = enumC68155VDz3;
        EnumC68155VDz enumC68155VDz4 = new EnumC68155VDz("PIXEL", 3, "pixel");
        A07 = enumC68155VDz4;
        EnumC68155VDz enumC68155VDz5 = new EnumC68155VDz("GLITCH", 4, "glitch");
        A04 = enumC68155VDz5;
        EnumC68155VDz enumC68155VDz6 = new EnumC68155VDz("HAUNTED", 5, "haunted");
        A05 = enumC68155VDz6;
        EnumC68155VDz[] enumC68155VDzArr = {enumC68155VDz, enumC68155VDz2, enumC68155VDz3, enumC68155VDz4, enumC68155VDz5, enumC68155VDz6};
        A03 = enumC68155VDzArr;
        A02 = AbstractC12190kN.A00(enumC68155VDzArr);
        EnumC68155VDz[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68155VDz enumC68155VDz7 : values) {
            linkedHashMap.put(enumC68155VDz7.A00, enumC68155VDz7);
        }
        A01 = linkedHashMap;
    }

    public EnumC68155VDz(String str, int i, String str2) {
        this.A00 = str2;
    }
}

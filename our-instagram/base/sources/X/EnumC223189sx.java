package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223189sx {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC223189sx[] A03;
    public static final EnumC223189sx A04;
    public static final EnumC223189sx A05;
    public final String A00;

    static {
        EnumC223189sx enumC223189sx = new EnumC223189sx("MUSIC_SOUNDWAVE", 0, "album_art_soundwave");
        A05 = enumC223189sx;
        EnumC223189sx enumC223189sx2 = new EnumC223189sx("GIPHY", 1, "giphy");
        A04 = enumC223189sx2;
        EnumC223189sx[] enumC223189sxArr = {enumC223189sx, enumC223189sx2};
        A03 = enumC223189sxArr;
        A02 = AbstractC12190kN.A00(enumC223189sxArr);
        EnumC223189sx[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC223189sx enumC223189sx3 : values) {
            linkedHashMap.put(enumC223189sx3.A00, enumC223189sx3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC223189sx valueOf(String str) {
        return (EnumC223189sx) Enum.valueOf(EnumC223189sx.class, str);
    }

    public static EnumC223189sx[] values() {
        return (EnumC223189sx[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC223189sx(String str, int i, String str2) {
        this.A00 = str2;
    }
}

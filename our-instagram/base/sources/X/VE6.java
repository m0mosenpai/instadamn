package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VE6 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VE6[] A03;
    public static final VE6 A04;
    public static final VE6 A05;
    public static final VE6 A06;
    public static final VE6 A07;
    public static final VE6 A08;
    public static final VE6 A09;
    public static final VE6 A0A;
    public static final VE6 A0B;
    public static final VE6 A0C;
    public final String A00;

    public static VE6 valueOf(String str) {
        return (VE6) Enum.valueOf(VE6.class, str);
    }

    public static VE6[] values() {
        return (VE6[]) A03.clone();
    }

    static {
        VE6 ve6 = new VE6("SIMPLE", 0, "simple");
        A09 = ve6;
        VE6 ve62 = new VE6("SIMPLE_LINE", 1, "simple_line");
        A0A = ve62;
        VE6 ve63 = new VE6("SIMPLE_LINE_WORD_EMPHASIS", 2, "simple_line_word_emphasis");
        A0B = ve63;
        VE6 ve64 = new VE6("DYNAMIC_SIMPLE_LINE", 3, "dynamic_simple_line");
        A07 = ve64;
        VE6 ve65 = new VE6("DYNAMIC_REVEAL", 4, "dynamic_reveal");
        A06 = ve65;
        VE6 ve66 = new VE6("TYPEWRITER", 5, "typewriter");
        A0C = ve66;
        VE6 ve67 = new VE6("CUBE_REVEAL", 6, "cube_reveal");
        A05 = ve67;
        VE6 ve68 = new VE6("KARAOKE", 7, "karaoke");
        A08 = ve68;
        VE6 ve69 = new VE6("ALBUM_ART", 8, "album_art");
        A04 = ve69;
        VE6[] ve6Arr = {ve6, ve62, ve63, ve64, ve65, ve66, ve67, ve68, ve69, new VE6("HIDDEN", 9, "hidden")};
        A03 = ve6Arr;
        A02 = AbstractC12190kN.A00(ve6Arr);
        VE6[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VE6 ve610 : values) {
            linkedHashMap.put(ve610.A00, ve610);
        }
        A01 = linkedHashMap;
    }

    public VE6(String str, int i, String str2) {
        this.A00 = str2;
    }
}

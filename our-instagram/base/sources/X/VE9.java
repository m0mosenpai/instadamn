package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VE9 {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VE9[] A03;
    public static final VE9 A04;
    public static final VE9 A05;
    public static final VE9 A06;
    public static final VE9 A07;
    public static final VE9 A08;
    public static final VE9 A09;
    public static final VE9 A0A;
    public static final VE9 A0B;
    public static final VE9 A0C;
    public static final VE9 A0D;
    public static final VE9 A0E;
    public static final VE9 A0F;
    public final String A00;

    public static VE9 valueOf(String str) {
        return (VE9) Enum.valueOf(VE9.class, str);
    }

    public static VE9[] values() {
        return (VE9[]) A03.clone();
    }

    static {
        VE9 ve9 = new VE9("MUSIC_OVERLAY_SIMPLE", 0, "music_overlay_simple");
        A0C = ve9;
        VE9 ve92 = new VE9("MUSIC_OVERLAY_ALBUM_ART", 1, "music_overlay_album_art");
        A0B = ve92;
        VE9 ve93 = new VE9("LYRICS_KARAOKE", 2, "lyrics_karaoke");
        A06 = ve93;
        VE9 ve94 = new VE9("LYRICS_CUBE_REVEAL", 3, "lyrics_cube_reveal");
        A04 = ve94;
        VE9 ve95 = new VE9("LYRICS_DYNAMIC_REVEAL", 4, "lyrics_dynamic_reveal");
        A05 = ve95;
        VE9 ve96 = new VE9("LYRICS_TYPEWRITER", 5, "lyrics_typewriter");
        A08 = ve96;
        VE9 ve97 = new VE9("LYRICS_LINE_BY_LINE_CUBE_REVEAL", 6, "lyrics_line_by_line_cube_reveal");
        A07 = ve97;
        VE9 ve98 = new VE9("MUSIC_ONLY", 7, "music_only");
        A0A = ve98;
        VE9 ve99 = new VE9("MUSIC_HIDDEN", 8, "music_hidden");
        A09 = ve99;
        VE9 ve910 = new VE9("SIMPLE_LINE", 9, "simple_line");
        A0D = ve910;
        VE9 ve911 = new VE9("SIMPLE_LINE_WORD_EMPHASIS", 10, "simple_line_word_emphasis");
        A0E = ve911;
        VE9 ve912 = new VE9("UNKNOWN", 11, "unknown");
        A0F = ve912;
        VE9[] ve9Arr = {ve9, ve92, ve93, ve94, ve95, ve96, ve97, ve98, ve99, ve910, ve911, ve912};
        A03 = ve9Arr;
        A02 = AbstractC12190kN.A00(ve9Arr);
        VE9[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (VE9 ve913 : values) {
            linkedHashMap.put(ve913.A00, ve913);
        }
        A01 = linkedHashMap;
    }

    public VE9(String str, int i, String str2) {
        this.A00 = str2;
    }
}

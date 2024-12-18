package X;

import com.facebook.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VES {
    public static final Map A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ VES[] A05;
    public static final VES A06;
    public static final VES A07;
    public static final VES A08;
    public static final VES A09;
    public static final VES A0A;
    public static final VES A0B;
    public final int A00;
    public final int A01;
    public final String A02;

    public static VES valueOf(String str) {
        return (VES) Enum.valueOf(VES.class, str);
    }

    public static VES[] values() {
        return (VES[]) A05.clone();
    }

    static {
        VES ves = new VES("SIMPLE_LINE", 0, R.drawable.instagram_icons_exceptions_captions_simple_1_filled_68, 2131964705, "simple_line");
        A0A = ves;
        VES ves2 = new VES("DYNAMIC_SIMPLE_LINE", 1, R.drawable.instagram_icons_exceptions_captions_simple_2_filled_68, 2131964705, "simple_line_word_emphasis");
        A08 = ves2;
        VES ves3 = new VES("DYNAMIC_REVEAL", 2, R.drawable.instagram_music_sticker_lyrics_dynamic_reveal, 2131964706, "dynamic_reveal");
        A07 = ves3;
        VES ves4 = new VES("TYPEWRITER", 3, R.drawable.instagram_music_sticker_lyrics_typewriter, 2131964715, "typewriter");
        A0B = ves4;
        VES ves5 = new VES("CUBE_REVEAL", 4, R.drawable.instagram_music_sticker_lyrics_cube_reveal, 2131964705, "cube_reveal");
        A06 = ves5;
        VES ves6 = new VES("KARAOKE", 5, R.drawable.instagram_music_sticker_lyrics_karaoke, 2131964708, "karaoke");
        A09 = ves6;
        VES[] vesArr = {ves, ves2, ves3, ves4, ves5, ves6};
        A05 = vesArr;
        A04 = AbstractC12190kN.A00(vesArr);
        A03 = new HashMap();
        for (VES ves7 : values()) {
            A03.put(ves7.A02, ves7);
        }
    }

    public VES(String str, int i, int i2, int i3, String str2) {
        this.A02 = str2;
        this.A01 = i2;
        this.A00 = i3;
    }
}

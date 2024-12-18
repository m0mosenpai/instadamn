package X;

import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.HashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC138556Pl {
    public static final Map A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC138556Pl[] A05;
    public static final EnumC138556Pl A06;
    public static final EnumC138556Pl A07;
    public static final EnumC138556Pl A08;
    public static final EnumC138556Pl A09;
    public static final EnumC138556Pl A0A;
    public static final EnumC138556Pl A0B;
    public static final EnumC138556Pl A0C;
    public static final EnumC138556Pl A0D;
    public static final EnumC138556Pl A0E;
    public static final EnumC138556Pl A0F;
    public static final EnumC138556Pl A0G;
    public static final EnumC138556Pl A0H;
    public static final EnumC138556Pl A0I;
    public static final EnumC138556Pl A0J;
    public final int A00;
    public final int A01;
    public final String A02;

    public static EnumC138556Pl valueOf(String str) {
        return (EnumC138556Pl) Enum.valueOf(EnumC138556Pl.class, str);
    }

    public static EnumC138556Pl[] values() {
        return (EnumC138556Pl[]) A05.clone();
    }

    static {
        EnumC138556Pl enumC138556Pl = new EnumC138556Pl("MUSIC_OVERLAY_SIMPLE", 0, R.drawable.instagram_music_sticker_overlay_small_art, 2131968053, "music_overlay_simple");
        A0F = enumC138556Pl;
        EnumC138556Pl enumC138556Pl2 = new EnumC138556Pl("MUSIC_OVERLAY_ALBUM_ART", 1, R.drawable.instagram_music_sticker_overlay_large_art, 2131968050, "music_overlay_album_art");
        A0E = enumC138556Pl2;
        EnumC138556Pl enumC138556Pl3 = new EnumC138556Pl("LYRICS_KARAOKE", 2, R.drawable.instagram_music_sticker_lyrics_karaoke, 2131968049, "lyrics_karaoke");
        A0A = enumC138556Pl3;
        EnumC138556Pl enumC138556Pl4 = new EnumC138556Pl("LYRICS_CUBE_REVEAL", 3, R.drawable.instagram_music_sticker_lyrics_cube_reveal, 2131968047, "lyrics_cube_reveal");
        A08 = enumC138556Pl4;
        EnumC138556Pl enumC138556Pl5 = new EnumC138556Pl("LYRICS_DYNAMIC_REVEAL", 4, R.drawable.instagram_music_sticker_lyrics_dynamic_reveal, 2131968048, "lyrics_dynamic_reveal");
        A09 = enumC138556Pl5;
        EnumC138556Pl enumC138556Pl6 = new EnumC138556Pl("LYRICS_TYPEWRITER", 5, R.drawable.instagram_music_sticker_lyrics_typewriter, 2131968054, "lyrics_typewriter");
        A0C = enumC138556Pl6;
        EnumC138556Pl enumC138556Pl7 = new EnumC138556Pl("LYRICS_LINE_BY_LINE_CUBE_REVEAL", 6, R.drawable.instagram_music_sticker_lyrics_karaoke, 2131968051, "lyrics_line_by_line_cube_reveal");
        A0B = enumC138556Pl7;
        EnumC138556Pl enumC138556Pl8 = new EnumC138556Pl("MUSIC_ONLY", 7, R.drawable.instagram_block_pano_filled_24, 2131968052, "music_only");
        A0D = enumC138556Pl8;
        EnumC138556Pl enumC138556Pl9 = new EnumC138556Pl("MUSIC_VINYL", 8, R.drawable.new_music_icon_sticker_new_music_icon_sticker_selected, 2131968055, "music_vinyl");
        A0G = enumC138556Pl9;
        EnumC138556Pl enumC138556Pl10 = new EnumC138556Pl("HIDDEN", 9, -1, -1, "music_hidden");
        A06 = enumC138556Pl10;
        EnumC138556Pl enumC138556Pl11 = new EnumC138556Pl("UNKNOWN", 10, -1, -1, "unknown");
        A0J = enumC138556Pl11;
        EnumC138556Pl enumC138556Pl12 = new EnumC138556Pl("SMALL_ART_SOLID", 11, -1, -1, "music_small_art_solid");
        A0I = enumC138556Pl12;
        EnumC138556Pl enumC138556Pl13 = new EnumC138556Pl("SMALL_ART_FROSTED", 12, -1, -1, "music_small_art_frosted");
        A0H = enumC138556Pl13;
        EnumC138556Pl enumC138556Pl14 = new EnumC138556Pl("LARGE_ART_ALBUM", 13, -1, -1, "music_large_art_album");
        A07 = enumC138556Pl14;
        EnumC138556Pl[] enumC138556PlArr = {enumC138556Pl, enumC138556Pl2, enumC138556Pl3, enumC138556Pl4, enumC138556Pl5, enumC138556Pl6, enumC138556Pl7, enumC138556Pl8, enumC138556Pl9, enumC138556Pl10, enumC138556Pl11, enumC138556Pl12, enumC138556Pl13, enumC138556Pl14};
        A05 = enumC138556PlArr;
        A04 = AbstractC12190kN.A00(enumC138556PlArr);
        A03 = new HashMap();
        for (EnumC138556Pl enumC138556Pl15 : values()) {
            A03.put(enumC138556Pl15.A02, enumC138556Pl15);
        }
    }

    public EnumC138556Pl(String str, int i, int i2, int i3, String str2) {
        this.A02 = str2;
        this.A01 = i2;
        this.A00 = i3;
    }

    public final EnumC138556Pl A00() {
        switch (ordinal()) {
            case 9:
                return A0D;
            case 10:
            default:
                return this;
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return A0F;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return A0E;
        }
    }

    public final String A01() {
        switch (ordinal()) {
            case 0:
                return "music_overlay_sticker_simple";
            case 1:
                return "music_overlay_sticker_album_art";
            case 2:
                return "music_overlay_sticker_lyrics_karaoke";
            case 3:
                return "music_overlay_sticker_lyrics_cube_reveal";
            case 4:
                return "music_overlay_sticker_lyrics_dynamic_reveal";
            case 5:
                return "music_overlay_sticker_lyrics_typewriter";
            case 6:
                return "music_overlay_sticker_lyrics_line_by_line_cube_reveal";
            case 7:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                throw new IllegalStateException("The display type is not mapped to a valid sticker id");
            case 8:
                return "music_overlay_sticker_vinyl";
            default:
                throw new RuntimeException();
        }
    }

    public final boolean A02() {
        int ordinal = ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5 || ordinal == 6) {
            return true;
        }
        return false;
    }
}

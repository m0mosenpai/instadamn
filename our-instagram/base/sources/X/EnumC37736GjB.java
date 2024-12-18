package X;

import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerSource;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.GjB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC37736GjB {
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ EnumC37736GjB[] A06;
    public static final EnumC37736GjB A07;
    public static final EnumC37736GjB A08;
    public static final EnumC37736GjB A09;
    public static final EnumC37736GjB A0A;
    public static final EnumC37736GjB A0B;
    public static final EnumC37736GjB A0C;
    public static final EnumC37736GjB A0D;
    public static final EnumC37736GjB A0E;
    public static final EnumC37736GjB A0F;
    public static final EnumC37736GjB A0G;
    public final int A00;
    public final EnumC37738GjD A01;
    public final ClipsViewerSource A02;
    public final JJC A03;
    public final Integer A04;

    static {
        ClipsViewerSource clipsViewerSource = ClipsViewerSource.A0g;
        C37737GjC c37737GjC = new JJC() { // from class: X.GjC
        };
        EnumC37736GjB enumC37736GjB = new EnumC37736GjB(null, clipsViewerSource, c37737GjC, null, "DEFAULT", 0, 2131955577);
        A08 = enumC37736GjB;
        Integer valueOf = Integer.valueOf(R.drawable.instagram_users_pano_outline_24);
        EnumC37736GjB enumC37736GjB2 = new EnumC37736GjB(EnumC37738GjD.CONNECTED, ClipsViewerSource.A0I, c37737GjC, valueOf, "FOLLOWING", 1, 2131955937);
        A09 = enumC37736GjB2;
        Integer valueOf2 = Integer.valueOf(R.drawable.instagram_location_pano_outline_24);
        EnumC37736GjB enumC37736GjB3 = new EnumC37736GjB(EnumC37738GjD.LOCATION, ClipsViewerSource.A0T, c37737GjC, valueOf2, "LOCATION", 2, 2131955941);
        A0B = enumC37736GjB3;
        Integer valueOf3 = Integer.valueOf(R.drawable.instagram_content_note_pano_outline_24);
        EnumC37736GjB enumC37736GjB4 = new EnumC37736GjB(EnumC37738GjD.MEDIA_NOTES, ClipsViewerSource.A0M, new JJC() { // from class: X.GjE
        }, valueOf3, "MEDIA_NOTES", 3, 2131955942);
        A0C = enumC37736GjB4;
        EnumC37736GjB enumC37736GjB5 = new EnumC37736GjB(EnumC37738GjD.SOCIAL, ClipsViewerSource.A0K, c37737GjC, valueOf3, "FRIENDLY_VIEWER", 4, 2131955939);
        A0A = enumC37736GjB5;
        Integer valueOf4 = Integer.valueOf(R.drawable.instagram_carousel_pano_outline_24);
        EnumC37736GjB enumC37736GjB6 = new EnumC37736GjB(EnumC37738GjD.MIXED_MEDIA_ONLY, ClipsViewerSource.A1q, c37737GjC, valueOf4, "MIXED_MEDIA_CHAINS", 5, 2131955940);
        A0D = enumC37736GjB6;
        Integer valueOf5 = Integer.valueOf(R.drawable.instagram_stars_pano_outline_24);
        EnumC37736GjB enumC37736GjB7 = new EnumC37736GjB(EnumC37738GjD.STAR_SEARCH_ONLY, ClipsViewerSource.A2S, c37737GjC, valueOf5, "STAR_SEARCH", 6, 2131955943);
        A0E = enumC37736GjB7;
        Integer valueOf6 = Integer.valueOf(R.drawable.instagram_ads_on_reels_pano_outline_24);
        EnumC37736GjB enumC37736GjB8 = new EnumC37736GjB(EnumC37738GjD.ADS_ONLY, ClipsViewerSource.A07, c37737GjC, valueOf6, "ADS_ONLY", 7, 2131955934);
        A07 = enumC37736GjB8;
        Integer valueOf7 = Integer.valueOf(R.drawable.instagram_translate_pano_outline_24);
        ClipsViewerSource clipsViewerSource2 = ClipsViewerSource.A0l;
        EnumC37738GjD enumC37738GjD = EnumC37738GjD.VOICE_TRANSLATION;
        EnumC37736GjB enumC37736GjB9 = new EnumC37736GjB(enumC37738GjD, clipsViewerSource2, c37737GjC, valueOf7, "VOICE_TRANSLATION", 8, 2131955946);
        A0G = enumC37736GjB9;
        EnumC37736GjB enumC37736GjB10 = new EnumC37736GjB(enumC37738GjD, ClipsViewerSource.A0i, c37737GjC, valueOf7, "TRANSLATED_CLOSED_CAPTIONS", 9, 2131955944);
        A0F = enumC37736GjB10;
        EnumC37736GjB[] enumC37736GjBArr = {enumC37736GjB, enumC37736GjB2, enumC37736GjB3, enumC37736GjB4, enumC37736GjB5, enumC37736GjB6, enumC37736GjB7, enumC37736GjB8, enumC37736GjB9, enumC37736GjB10};
        A06 = enumC37736GjBArr;
        A05 = AbstractC12190kN.A00(enumC37736GjBArr);
    }

    public static EnumC37736GjB valueOf(String str) {
        return (EnumC37736GjB) Enum.valueOf(EnumC37736GjB.class, str);
    }

    public static EnumC37736GjB[] values() {
        return (EnumC37736GjB[]) A06.clone();
    }

    public EnumC37736GjB(EnumC37738GjD enumC37738GjD, ClipsViewerSource clipsViewerSource, JJC jjc, Integer num, String str, int i, int i2) {
        this.A00 = i2;
        this.A04 = num;
        this.A02 = clipsViewerSource;
        this.A01 = enumC37738GjD;
        this.A03 = jjc;
    }
}

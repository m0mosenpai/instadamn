package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEN {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VEN[] A03;
    public static final VEN A04;
    public static final VEN A05;
    public static final VEN A06;
    public static final VEN A07;
    public static final VEN A08;
    public static final VEN A09;
    public static final VEN A0A;
    public final int A00;
    public final int A01;

    public static VEN valueOf(String str) {
        return (VEN) Enum.valueOf(VEN.class, str);
    }

    public static VEN[] values() {
        return (VEN[]) A03.clone();
    }

    static {
        VEN ven = new VEN("FOR_YOU", 0, 2131962785, R.drawable.instagram_menu_pano_outline_24);
        A06 = ven;
        VEN ven2 = new VEN("USERS", 1, 2131975124, R.drawable.instagram_user_pano_outline_24);
        A0A = ven2;
        VEN ven3 = new VEN("AUDIO", 2, 2131953293, R.drawable.instagram_music_pano_outline_24);
        A04 = ven3;
        VEN ven4 = new VEN("CLIPS", 3, 2131955577, R.drawable.instagram_reels_pano_outline_24);
        A05 = ven4;
        VEN ven5 = new VEN("HASHTAGS", 4, 2131975190, R.drawable.instagram_hashtag_pano_outline_24);
        A07 = ven5;
        VEN ven6 = new VEN("PLACES", 5, 2131962014, R.drawable.instagram_location_pano_outline_24);
        A08 = ven6;
        VEN ven7 = new VEN("TOP", 6, 2131968691, R.drawable.instagram_globe_pano_outline_24);
        A09 = ven7;
        VEN[] venArr = {ven, ven2, ven3, ven4, ven5, ven6, ven7};
        A03 = venArr;
        A02 = AbstractC12190kN.A00(venArr);
    }

    public VEN(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}

package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VG5 {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ VG5[] A03;
    public static final VG5 A04;
    public static final VG5 A05;
    public static final VG5 A06;
    public static final VG5 A07;
    public static final VG5 A08;
    public static final VG5 A09;
    public final int A00;
    public final String A01;

    public static VG5 valueOf(String str) {
        return (VG5) Enum.valueOf(VG5.class, str);
    }

    public static VG5[] values() {
        return (VG5[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A01;
    }

    static {
        VG5 vg5 = new VG5("ACCOUNT_SPENDING_LIMIT", 0, R.drawable.instagram_warning_pano_outline_24, "account_spending_limit");
        A04 = vg5;
        VG5 vg52 = new VG5("AD_SLIDER", 1, R.drawable.instagram_sliders_pano_outline_24, "ad_slider");
        A05 = vg52;
        VG5 vg53 = new VG5("BOOST", 2, R.drawable.instagram_browse_effects_pano_outline_24, "open_boost");
        A06 = vg53;
        VG5 vg54 = new VG5("OPEN_LINK", 3, R.drawable.instagram_browse_effects_pano_outline_24, "open_link");
        A08 = vg54;
        VG5 vg55 = new VG5("MEDIA_PICKER", 4, R.drawable.instagram_reels_pano_outline_24, "media_picker");
        A07 = vg55;
        VG5 vg56 = new VG5("RESUME_AD", 5, R.drawable.instagram_promote_pano_outline_24, "resume_ad");
        A09 = vg56;
        VG5[] vg5Arr = {vg5, vg52, vg53, vg54, vg55, vg56};
        A03 = vg5Arr;
        A02 = AbstractC12190kN.A00(vg5Arr);
    }

    public VG5(String str, int i, int i2, String str2) {
        this.A00 = i2;
        this.A01 = str2;
    }
}

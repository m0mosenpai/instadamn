package X;

import com.facebook.R;
import com.google.common.collect.ImmutableList;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEU {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ VEU[] A05;
    public static final VEU A06;
    public static final VEU A07;
    public final int A00;
    public final int A01;
    public final ImmutableList A02;
    public final String A03;

    public static VEU valueOf(String str) {
        return (VEU) Enum.valueOf(VEU.class, str);
    }

    public static VEU[] values() {
        return (VEU[]) A05.clone();
    }

    static {
        Integer valueOf = Integer.valueOf(R.id.ad_image_1);
        Integer valueOf2 = Integer.valueOf(R.id.ad_image_2);
        Integer valueOf3 = Integer.valueOf(R.id.ad_image_3);
        Integer valueOf4 = Integer.valueOf(R.id.ad_image_4);
        ImmutableList of = ImmutableList.of((Object) valueOf, (Object) valueOf2, (Object) valueOf3, (Object) valueOf4);
        C14360o3.A07(of);
        A07 = new VEU(of, "TOPICS", "topics", 0, R.drawable.ig_ads_netego_horizontal_layout_background, R.id.netego_ig_consent_media_horizontal);
        ImmutableList of2 = ImmutableList.of((Object) valueOf, (Object) valueOf2, (Object) valueOf3, (Object) valueOf4, (Object) Integer.valueOf(R.id.ad_image_5));
        C14360o3.A07(of2);
        VEU veu = new VEU(of2, "ADS", "ads", 1, R.drawable.ig_ads_netego_stacked_layout_background, R.id.netego_ig_consent_media_stacked);
        A06 = veu;
        VEU[] veuArr = {A07, veu};
        A05 = veuArr;
        A04 = AbstractC12190kN.A00(veuArr);
    }

    public VEU(ImmutableList immutableList, String str, String str2, int i, int i2, int i3) {
        this.A03 = str2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = immutableList;
    }
}

package X;

import com.facebook.R;
import com.instagram.realtimeclient.RealtimeSubscription;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46215Kcr {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC46215Kcr[] A04;
    public static final EnumC46215Kcr A05;
    public static final EnumC46215Kcr A06;
    public static final EnumC46215Kcr A07;
    public static final EnumC46215Kcr A08;
    public static final EnumC46215Kcr A09;
    public static final EnumC46215Kcr A0A;
    public static final EnumC46215Kcr A0B;
    public static final EnumC46215Kcr A0C;
    public final int A00;
    public final int A01;
    public final String A02;

    public static EnumC46215Kcr valueOf(String str) {
        return (EnumC46215Kcr) Enum.valueOf(EnumC46215Kcr.class, str);
    }

    public static EnumC46215Kcr[] values() {
        return (EnumC46215Kcr[]) A04.clone();
    }

    static {
        EnumC46215Kcr enumC46215Kcr = new EnumC46215Kcr("POPULAR", 0, 2131953531, R.drawable.instagram_promote_pano_outline_24, "-1");
        A0A = enumC46215Kcr;
        EnumC46215Kcr enumC46215Kcr2 = new EnumC46215Kcr("HAPPY", 1, 2131953528, R.drawable.instagram_face1_pano_outline_24, "0");
        A07 = enumC46215Kcr2;
        EnumC46215Kcr enumC46215Kcr3 = new EnumC46215Kcr("LOVE", 2, 2131953530, R.drawable.instagram_heart_pano_outline_24, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A09 = enumC46215Kcr3;
        EnumC46215Kcr enumC46215Kcr4 = new EnumC46215Kcr("SAD_OR_ANGRY", 3, 2131953533, R.drawable.instagram_face4_pano_outline_24, "2");
        A0C = enumC46215Kcr4;
        EnumC46215Kcr enumC46215Kcr5 = new EnumC46215Kcr("GREETING", 4, 2131953527, R.drawable.instagram_wave_pano_outline_24, "3");
        A06 = enumC46215Kcr5;
        EnumC46215Kcr enumC46215Kcr6 = new EnumC46215Kcr("REACTION", 5, 2131953532, R.drawable.instagram_thumb_up_pano_outline_24, "4");
        A0B = enumC46215Kcr6;
        EnumC46215Kcr enumC46215Kcr7 = new EnumC46215Kcr("CELEBRATING", 6, 2131953526, R.drawable.instagram_cake_pano_outline_24, "5");
        A05 = enumC46215Kcr7;
        EnumC46215Kcr enumC46215Kcr8 = new EnumC46215Kcr("LIFESTYLE", 7, 2131953529, R.drawable.instagram_basketball_pano_outline_24, "6");
        A08 = enumC46215Kcr8;
        EnumC46215Kcr[] enumC46215KcrArr = {enumC46215Kcr, enumC46215Kcr2, enumC46215Kcr3, enumC46215Kcr4, enumC46215Kcr5, enumC46215Kcr6, enumC46215Kcr7, enumC46215Kcr8};
        A04 = enumC46215KcrArr;
        A03 = AbstractC12190kN.A00(enumC46215KcrArr);
    }

    public EnumC46215Kcr(String str, int i, int i2, int i3, String str2) {
        this.A02 = str2;
        this.A01 = i2;
        this.A00 = i3;
    }
}

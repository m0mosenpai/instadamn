package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rgk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61184Rgk {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC61184Rgk[] A03;
    public static final EnumC61184Rgk A04;
    public static final EnumC61184Rgk A05;
    public static final EnumC61184Rgk A06;
    public static final EnumC61184Rgk A07;
    public static final EnumC61184Rgk A08;
    public static final EnumC61184Rgk A09;
    public static final EnumC61184Rgk A0A;
    public static final EnumC61184Rgk A0B;
    public static final EnumC61184Rgk A0C;
    public static final EnumC61184Rgk A0D;
    public final int A00;
    public final Integer A01;

    static {
        EnumC61184Rgk enumC61184Rgk = new EnumC61184Rgk(null, "ALL", 0, 2131961728);
        A05 = enumC61184Rgk;
        EnumC61184Rgk enumC61184Rgk2 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_clock_pano_outline_24), "RECENT", 1, 2131961733);
        A0A = enumC61184Rgk2;
        EnumC61184Rgk enumC61184Rgk3 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_face1_pano_outline_24), "SMILEYS_AND_PEOPLE", 2, 2131961734);
        A0B = enumC61184Rgk3;
        EnumC61184Rgk enumC61184Rgk4 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_dog_pano_outline_24), "ANIMALS_AND_NATURE", 3, 2131961729);
        A06 = enumC61184Rgk4;
        EnumC61184Rgk enumC61184Rgk5 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_knife_fork_pano_outline_24), "FOOD_AND_DRINK", 4, 2131961731);
        A08 = enumC61184Rgk5;
        EnumC61184Rgk enumC61184Rgk6 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_car_pano_outline_24), "TRAVEL_AND_PLACES", 5, 2131961736);
        A0D = enumC61184Rgk6;
        EnumC61184Rgk enumC61184Rgk7 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_basketball_pano_outline_24), "ACTIVITIES", 6, 2131961727);
        A04 = enumC61184Rgk7;
        EnumC61184Rgk enumC61184Rgk8 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_bulb_pano_outline_24), "OBJECTS", 7, 2131961732);
        A09 = enumC61184Rgk8;
        EnumC61184Rgk enumC61184Rgk9 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_math_symbols_pano_outline_24), "SYMBOLS", 8, 2131961735);
        A0C = enumC61184Rgk9;
        EnumC61184Rgk enumC61184Rgk10 = new EnumC61184Rgk(Integer.valueOf(R.drawable.instagram_flag_pano_outline_24), "FLAGS", 9, 2131961730);
        A07 = enumC61184Rgk10;
        EnumC61184Rgk[] enumC61184RgkArr = {enumC61184Rgk, enumC61184Rgk2, enumC61184Rgk3, enumC61184Rgk4, enumC61184Rgk5, enumC61184Rgk6, enumC61184Rgk7, enumC61184Rgk8, enumC61184Rgk9, enumC61184Rgk10};
        A03 = enumC61184RgkArr;
        A02 = AbstractC12190kN.A00(enumC61184RgkArr);
    }

    public static EnumC61184Rgk valueOf(String str) {
        return (EnumC61184Rgk) Enum.valueOf(EnumC61184Rgk.class, str);
    }

    public static EnumC61184Rgk[] values() {
        return (EnumC61184Rgk[]) A03.clone();
    }

    public EnumC61184Rgk(Integer num, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = num;
    }
}

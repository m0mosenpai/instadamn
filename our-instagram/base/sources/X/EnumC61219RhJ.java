package X;

import com.facebook.R;
import java.util.regex.Pattern;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RhJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61219RhJ {
    public static final C63156Se5 A06;
    public static final int[] A07;
    public static final int[] A08;
    public static final /* synthetic */ EnumEntries A09;
    public static final /* synthetic */ EnumC61219RhJ[] A0A;
    public static final EnumC61219RhJ A0E;
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Pattern A05;
    public static final EnumC61219RhJ A0B = new EnumC61219RhJ("AMERICAN_EXPRESS", "American Express", "amex", "^3[47]\\d*", "4", 0, 15, 15);
    public static final EnumC61219RhJ A0D = new EnumC61219RhJ("DISCOVER", "Discover", "disc", "^(6011|65|64[4-9]|622)\\d*", "3", 1, 16, 16);
    public static final EnumC61219RhJ A0H = new EnumC61219RhJ("JCB", "JCB", "jcb", "^35\\d*", "3", 2, 16, 16);
    public static final EnumC61219RhJ A0I = new EnumC61219RhJ("MASTERCARD", "Mastercard", "mastercard", "^(5[1-5]|222[1-9]|22[3-9]|2[3-6]|27[0-1]|2720)\\d*", "3", 3, 16, 16);
    public static final EnumC61219RhJ A0J = new EnumC61219RhJ("RUPAY", "RuPay", "rupay", "^(508[5-9]|6521[5-9]|652[2-9]|6530|6531[0-4]|60[6-8])\\d*", "3", 4, 16, 16);
    public static final EnumC61219RhJ A0M = new EnumC61219RhJ("VISA", "Visa", "visa", "^4\\d*", "3", 5, 16, 16);
    public static final EnumC61219RhJ A0C = new EnumC61219RhJ("DINERS_CLUB", "Diners Club", "diners", "^(36|38|30[0-5])\\d*", "3", 6, 14, 14);
    public static final EnumC61219RhJ A0K = new EnumC61219RhJ("UNIONPAY", "UnionPay", "cup", "^62\\d*", "3", 7, 16, 19);
    public static final EnumC61219RhJ A0F = new EnumC61219RhJ("HIPER", "Hiper", "hiper", "^637(095|568|599|609|612)\\d*", "3", 8, 16, 16);
    public static final EnumC61219RhJ A0G = new EnumC61219RhJ("HIPERCARD", "Hipercard", "hipercard", "^606282\\d*", "3", 9, 16, 16);
    public static final EnumC61219RhJ A0L = new EnumC61219RhJ("UNKNOWN", "Unknown", "unknown", "\\d+", "3", 10, 16, 16);

    /* JADX WARN: Type inference failed for: r0v13, types: [X.Se5, java.lang.Object] */
    static {
        EnumC61219RhJ enumC61219RhJ = new EnumC61219RhJ("EMPTY", "", "", "^$", "3", 11, 16, 16);
        A0E = enumC61219RhJ;
        EnumC61219RhJ[] enumC61219RhJArr = {A0B, A0D, A0H, A0I, A0J, A0M, A0C, A0K, A0F, A0G, A0L, enumC61219RhJ};
        A0A = enumC61219RhJArr;
        A09 = AbstractC12190kN.A00(enumC61219RhJArr);
        A06 = new Object();
        A07 = new int[]{4, 10};
        A08 = new int[]{4, 8, 12};
    }

    public static EnumC61219RhJ valueOf(String str) {
        return (EnumC61219RhJ) Enum.valueOf(EnumC61219RhJ.class, str);
    }

    public static EnumC61219RhJ[] values() {
        return (EnumC61219RhJ[]) A0A.clone();
    }

    public EnumC61219RhJ(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = str5;
        Pattern compile = Pattern.compile(str4);
        C14360o3.A07(compile);
        this.A05 = compile;
    }

    public final int A00() {
        switch (ordinal()) {
            case 0:
                return R.drawable.payment_amex_40;
            case 1:
                return R.drawable.payment_discover_40;
            case 2:
                return R.drawable.payment_jcb_40;
            case 3:
                return R.drawable.payment_mastercard_40;
            case 4:
            default:
                return R.drawable.payment_generic_card_icon;
            case 5:
                return R.drawable.payment_visa_40;
            case 6:
                return R.drawable.payment_diners_club_40;
        }
    }
}

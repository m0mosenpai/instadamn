package X;

import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33414Epl {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33414Epl[] A03;
    public static final EnumC33414Epl A04;
    public static final EnumC33414Epl A05;
    public static final EnumC33414Epl A06;
    public static final EnumC33414Epl A07;
    public static final EnumC33414Epl A08;
    public static final EnumC33414Epl A09;
    public static final EnumC33414Epl A0A;
    public final int A00;
    public final int A01;

    public static EnumC33414Epl valueOf(String str) {
        return (EnumC33414Epl) Enum.valueOf(EnumC33414Epl.class, str);
    }

    public static EnumC33414Epl[] values() {
        return (EnumC33414Epl[]) A03.clone();
    }

    static {
        EnumC33414Epl enumC33414Epl = new EnumC33414Epl("Collections", 0, R.drawable.instagram_save_pano_outline_24, 2131959080);
        A04 = enumC33414Epl;
        EnumC33414Epl enumC33414Epl2 = new EnumC33414Epl("Reshares", 1, R.drawable.instagram_reshare_pano_outline_24, 2131959141);
        A0A = enumC33414Epl2;
        EnumC33414Epl enumC33414Epl3 = new EnumC33414Epl("Media", 2, R.drawable.instagram_media_pano_outline_24, 2131959141);
        A06 = enumC33414Epl3;
        EnumC33414Epl enumC33414Epl4 = new EnumC33414Epl("Orders", 3, R.drawable.instagram_receipt_pano_outline_24, 2131959122);
        A07 = enumC33414Epl4;
        EnumC33414Epl enumC33414Epl5 = new EnumC33414Epl("People", 4, -1, -1);
        A08 = enumC33414Epl5;
        EnumC33414Epl enumC33414Epl6 = new EnumC33414Epl("PrivacyControls", 5, -1, -1);
        A09 = enumC33414Epl6;
        EnumC33414Epl enumC33414Epl7 = new EnumC33414Epl("Links", 6, R.drawable.instagram_link_pano_outline_24, 2131959139);
        A05 = enumC33414Epl7;
        EnumC33414Epl[] enumC33414EplArr = {enumC33414Epl, enumC33414Epl2, enumC33414Epl3, enumC33414Epl4, enumC33414Epl5, enumC33414Epl6, enumC33414Epl7};
        A03 = enumC33414EplArr;
        A02 = AbstractC12190kN.A00(enumC33414EplArr);
    }

    public EnumC33414Epl(String str, int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }
}

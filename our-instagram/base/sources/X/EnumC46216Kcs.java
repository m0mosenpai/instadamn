package X;

import com.facebook.R;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kcs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46216Kcs {
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC46216Kcs[] A05;
    public static final EnumC46216Kcs A06;
    public static final EnumC46216Kcs A07;
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final int[] A03;

    public static EnumC46216Kcs valueOf(String str) {
        return (EnumC46216Kcs) Enum.valueOf(EnumC46216Kcs.class, str);
    }

    public static EnumC46216Kcs[] values() {
        return (EnumC46216Kcs[]) A05.clone();
    }

    static {
        EnumC46216Kcs enumC46216Kcs = new EnumC46216Kcs(C05F.A00, "DEFAULT", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new int[]{R.attr.igds_color_secondary_text_on_media, R.attr.igds_color_secondary_text_on_media}, 0, 155);
        A06 = enumC46216Kcs;
        EnumC46216Kcs enumC46216Kcs2 = new EnumC46216Kcs(C05F.A01, "PRIDE", "pride", new int[]{R.attr.igds_color_gradient_purple, R.attr.igds_color_gradient_blue, R.attr.igds_color_gradient_green, R.attr.igds_color_gradient_yellow, R.attr.igds_color_gradient_orange, R.attr.igds_color_gradient_red}, 1, 225);
        A07 = enumC46216Kcs2;
        EnumC46216Kcs[] enumC46216KcsArr = {enumC46216Kcs, enumC46216Kcs2};
        A05 = enumC46216KcsArr;
        A04 = AbstractC12190kN.A00(enumC46216KcsArr);
    }

    public EnumC46216Kcs(Integer num, String str, String str2, int[] iArr, int i, int i2) {
        this.A02 = str2;
        this.A03 = iArr;
        this.A01 = num;
        this.A00 = i2;
    }
}

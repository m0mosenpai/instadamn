package X;

import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nh8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53270Nh8 {
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC53270Nh8[] A04;
    public static final EnumC53270Nh8 A05;
    public static final EnumC53270Nh8 A06;
    public static final EnumC53270Nh8 A07;
    public static final EnumC53270Nh8 A08;
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;

    public static EnumC53270Nh8 valueOf(String str) {
        return (EnumC53270Nh8) Enum.valueOf(EnumC53270Nh8.class, str);
    }

    public static EnumC53270Nh8[] values() {
        return (EnumC53270Nh8[]) A04.clone();
    }

    static {
        EnumC53270Nh8 enumC53270Nh8 = new EnumC53270Nh8(Integer.valueOf(R.drawable.instagram_chevron_down_pano_outline_24), "EXPANDED_FIRST_PAGE", 0, true, false);
        A06 = enumC53270Nh8;
        EnumC53270Nh8 enumC53270Nh82 = new EnumC53270Nh8(Integer.valueOf(R.drawable.instagram_arrow_back_24), "EXPANDED_NOT_FIRST_PAGE", 1, true, true);
        A07 = enumC53270Nh82;
        EnumC53270Nh8 enumC53270Nh83 = new EnumC53270Nh8(null, "ANCHORED", 2, false, false);
        A05 = enumC53270Nh83;
        EnumC53270Nh8 enumC53270Nh84 = new EnumC53270Nh8(null, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 3, false, false);
        A08 = enumC53270Nh84;
        EnumC53270Nh8[] enumC53270Nh8Arr = {enumC53270Nh8, enumC53270Nh82, enumC53270Nh83, enumC53270Nh84};
        A04 = enumC53270Nh8Arr;
        A03 = AbstractC12190kN.A00(enumC53270Nh8Arr);
    }

    public EnumC53270Nh8(Integer num, String str, int i, boolean z, boolean z2) {
        this.A00 = num;
        this.A02 = z;
        this.A01 = z2;
    }
}

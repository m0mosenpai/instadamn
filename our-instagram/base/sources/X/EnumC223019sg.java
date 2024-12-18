package X;

import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC223019sg {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC223019sg[] A03;
    public static final EnumC223019sg A04;
    public static final EnumC223019sg A05;
    public final int A00;
    public final Integer A01;

    static {
        EnumC223019sg enumC223019sg = new EnumC223019sg(null, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A05 = enumC223019sg;
        EnumC223019sg enumC223019sg2 = new EnumC223019sg(Integer.valueOf(R.drawable.instagram_circle_x_pano_outline_24), "CIRCLED_X", 1, 7);
        A04 = enumC223019sg2;
        EnumC223019sg[] enumC223019sgArr = {enumC223019sg, enumC223019sg2, new EnumC223019sg(Integer.valueOf(R.drawable.instagram_edit_pano_outline_24), "PENCIL", 2, 8)};
        A03 = enumC223019sgArr;
        A02 = AbstractC12190kN.A00(enumC223019sgArr);
    }

    public static EnumC223019sg valueOf(String str) {
        return (EnumC223019sg) Enum.valueOf(EnumC223019sg.class, str);
    }

    public static EnumC223019sg[] values() {
        return (EnumC223019sg[]) A03.clone();
    }

    public EnumC223019sg(Integer num, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = num;
    }
}

package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.RgJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61158RgJ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC61158RgJ[] A02;
    public static final EnumC61158RgJ A03;
    public static final EnumC61158RgJ A04;
    public static final EnumC61158RgJ A05;
    public static final EnumC61158RgJ A06;
    public static final EnumC61158RgJ A07;
    public final String A00;

    static {
        EnumC61158RgJ enumC61158RgJ = new EnumC61158RgJ("WIFI", 0, NetInfoModule.CONNECTION_TYPE_WIFI);
        A07 = enumC61158RgJ;
        EnumC61158RgJ enumC61158RgJ2 = new EnumC61158RgJ("NETWORK_5G", 1, "5g");
        A04 = enumC61158RgJ2;
        EnumC61158RgJ enumC61158RgJ3 = new EnumC61158RgJ("NETWORK_4G", 2, NetInfoModule.EFFECTIVE_CONNECTION_TYPE_4G);
        A03 = enumC61158RgJ3;
        EnumC61158RgJ enumC61158RgJ4 = new EnumC61158RgJ("OTHERS", 3, "others");
        A06 = enumC61158RgJ4;
        EnumC61158RgJ enumC61158RgJ5 = new EnumC61158RgJ(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4, NetInfoModule.CONNECTION_TYPE_NONE);
        A05 = enumC61158RgJ5;
        EnumC61158RgJ[] enumC61158RgJArr = {enumC61158RgJ, enumC61158RgJ2, enumC61158RgJ3, enumC61158RgJ4, enumC61158RgJ5};
        A02 = enumC61158RgJArr;
        A01 = AbstractC12190kN.A00(enumC61158RgJArr);
    }

    public static EnumC61158RgJ valueOf(String str) {
        return (EnumC61158RgJ) Enum.valueOf(EnumC61158RgJ.class, str);
    }

    public static EnumC61158RgJ[] values() {
        return (EnumC61158RgJ[]) A02.clone();
    }

    public EnumC61158RgJ(String str, int i, String str2) {
        this.A00 = str2;
    }
}

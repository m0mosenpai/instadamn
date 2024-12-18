package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HdD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39541HdD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39541HdD[] A01;
    public static final EnumC39541HdD A02;
    public static final EnumC39541HdD A03;
    public static final EnumC39541HdD A04;

    static {
        EnumC39541HdD enumC39541HdD = new EnumC39541HdD(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A02 = enumC39541HdD;
        EnumC39541HdD enumC39541HdD2 = new EnumC39541HdD("PREPARING", 1);
        A04 = enumC39541HdD2;
        EnumC39541HdD enumC39541HdD3 = new EnumC39541HdD("PLAYING", 2);
        A03 = enumC39541HdD3;
        EnumC39541HdD[] enumC39541HdDArr = {enumC39541HdD, enumC39541HdD2, enumC39541HdD3};
        A01 = enumC39541HdDArr;
        A00 = AbstractC12190kN.A00(enumC39541HdDArr);
    }

    public static EnumC39541HdD valueOf(String str) {
        return (EnumC39541HdD) Enum.valueOf(EnumC39541HdD.class, str);
    }

    public static EnumC39541HdD[] values() {
        return (EnumC39541HdD[]) A01.clone();
    }

    public EnumC39541HdD(String str, int i) {
    }
}

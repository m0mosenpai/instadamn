package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC09460dv {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC09460dv[] A01;
    public static final EnumC09460dv A02;
    public static final EnumC09460dv A03;
    public static final EnumC09460dv A04;

    public static EnumC09460dv valueOf(String str) {
        return (EnumC09460dv) Enum.valueOf(EnumC09460dv.class, str);
    }

    public static EnumC09460dv[] values() {
        return (EnumC09460dv[]) A01.clone();
    }

    static {
        EnumC09460dv enumC09460dv = new EnumC09460dv("SYNCHRONIZED", 0);
        A04 = enumC09460dv;
        EnumC09460dv enumC09460dv2 = new EnumC09460dv("PUBLICATION", 1);
        A03 = enumC09460dv2;
        EnumC09460dv enumC09460dv3 = new EnumC09460dv(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2);
        A02 = enumC09460dv3;
        EnumC09460dv[] enumC09460dvArr = {enumC09460dv, enumC09460dv2, enumC09460dv3};
        A01 = enumC09460dvArr;
        A00 = AbstractC12190kN.A00(enumC09460dvArr);
    }

    public EnumC09460dv(String str, int i) {
    }
}

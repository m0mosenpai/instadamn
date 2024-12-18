package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Hd6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39535Hd6 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC39535Hd6[] A01;
    public static final EnumC39535Hd6 A02;
    public static final EnumC39535Hd6 A03;
    public static final EnumC39535Hd6 A04;

    static {
        EnumC39535Hd6 enumC39535Hd6 = new EnumC39535Hd6(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A03 = enumC39535Hd6;
        EnumC39535Hd6 enumC39535Hd62 = new EnumC39535Hd6("PENDING", 1);
        A04 = enumC39535Hd62;
        EnumC39535Hd6 enumC39535Hd63 = new EnumC39535Hd6("COMPLETE", 2);
        A02 = enumC39535Hd63;
        EnumC39535Hd6[] enumC39535Hd6Arr = {enumC39535Hd6, enumC39535Hd62, enumC39535Hd63};
        A01 = enumC39535Hd6Arr;
        A00 = AbstractC12190kN.A00(enumC39535Hd6Arr);
    }

    public static EnumC39535Hd6 valueOf(String str) {
        return (EnumC39535Hd6) Enum.valueOf(EnumC39535Hd6.class, str);
    }

    public static EnumC39535Hd6[] values() {
        return (EnumC39535Hd6[]) A01.clone();
    }

    public EnumC39535Hd6(String str, int i) {
    }
}

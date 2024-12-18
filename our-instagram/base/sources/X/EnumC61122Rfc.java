package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Rfc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC61122Rfc {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC61122Rfc[] A01;
    public static final EnumC61122Rfc A02;
    public static final EnumC61122Rfc A03;
    public static final EnumC61122Rfc A04;
    public static final EnumC61122Rfc A05;

    public static EnumC61122Rfc valueOf(String str) {
        return (EnumC61122Rfc) Enum.valueOf(EnumC61122Rfc.class, str);
    }

    public static EnumC61122Rfc[] values() {
        return (EnumC61122Rfc[]) A01.clone();
    }

    static {
        EnumC61122Rfc enumC61122Rfc = new EnumC61122Rfc(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0);
        A05 = enumC61122Rfc;
        EnumC61122Rfc enumC61122Rfc2 = new EnumC61122Rfc("BOX_NONE", 1);
        A03 = enumC61122Rfc2;
        EnumC61122Rfc enumC61122Rfc3 = new EnumC61122Rfc("BOX_ONLY", 2);
        A04 = enumC61122Rfc3;
        EnumC61122Rfc enumC61122Rfc4 = new EnumC61122Rfc("AUTO", 3);
        A02 = enumC61122Rfc4;
        EnumC61122Rfc[] enumC61122RfcArr = {enumC61122Rfc, enumC61122Rfc2, enumC61122Rfc3, enumC61122Rfc4};
        A01 = enumC61122RfcArr;
        A00 = AbstractC12190kN.A00(enumC61122RfcArr);
    }

    public EnumC61122Rfc(String str, int i) {
    }
}

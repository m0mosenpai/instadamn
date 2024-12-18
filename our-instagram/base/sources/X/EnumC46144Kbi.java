package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Kbi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC46144Kbi {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46144Kbi[] A01;
    public static final EnumC46144Kbi A02;
    public static final EnumC46144Kbi A03;
    public static final EnumC46144Kbi A04;

    static {
        EnumC46144Kbi enumC46144Kbi = new EnumC46144Kbi("E2EE", 0);
        A02 = enumC46144Kbi;
        EnumC46144Kbi enumC46144Kbi2 = new EnumC46144Kbi("OT", 1);
        A04 = enumC46144Kbi2;
        EnumC46144Kbi enumC46144Kbi3 = new EnumC46144Kbi(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2);
        A03 = enumC46144Kbi3;
        EnumC46144Kbi[] enumC46144KbiArr = {enumC46144Kbi, enumC46144Kbi2, enumC46144Kbi3};
        A01 = enumC46144KbiArr;
        A00 = AbstractC12190kN.A00(enumC46144KbiArr);
    }

    public static EnumC46144Kbi valueOf(String str) {
        return (EnumC46144Kbi) Enum.valueOf(EnumC46144Kbi.class, str);
    }

    public static EnumC46144Kbi[] values() {
        return (EnumC46144Kbi[]) A01.clone();
    }

    public EnumC46144Kbi(String str, int i) {
    }
}

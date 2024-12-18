package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53215NgD {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53215NgD[] A03;
    public static final EnumC53215NgD A04;
    public static final EnumC53215NgD A05;
    public final String A00;

    static {
        EnumC53215NgD enumC53215NgD = new EnumC53215NgD(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, NetInfoModule.CONNECTION_TYPE_NONE);
        A04 = enumC53215NgD;
        EnumC53215NgD enumC53215NgD2 = new EnumC53215NgD("SHOW_ALL", 1, "show_all");
        A05 = enumC53215NgD2;
        EnumC53215NgD[] enumC53215NgDArr = {enumC53215NgD, enumC53215NgD2, new EnumC53215NgD("SHOW_X_MORE", 2, "show_x_more")};
        A03 = enumC53215NgDArr;
        A02 = AbstractC12190kN.A00(enumC53215NgDArr);
        EnumC53215NgD[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53215NgD enumC53215NgD3 : values) {
            A18.put(enumC53215NgD3.A00, enumC53215NgD3);
        }
        A01 = A18;
    }

    public static EnumC53215NgD valueOf(String str) {
        return (EnumC53215NgD) Enum.valueOf(EnumC53215NgD.class, str);
    }

    public static EnumC53215NgD[] values() {
        return (EnumC53215NgD[]) A03.clone();
    }

    public EnumC53215NgD(String str, int i, String str2) {
        this.A00 = str2;
    }
}

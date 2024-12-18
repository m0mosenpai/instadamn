package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.HeP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class EnumC39615HeP {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC39615HeP[] A03;
    public static final EnumC39615HeP A04;
    public final String A00;

    static {
        EnumC39615HeP enumC39615HeP = new EnumC39615HeP(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, NetInfoModule.CONNECTION_TYPE_NONE);
        A04 = enumC39615HeP;
        EnumC39615HeP[] enumC39615HePArr = {enumC39615HeP, new EnumC39615HeP("WARNING", 1, "warning")};
        A03 = enumC39615HePArr;
        A02 = AbstractC12190kN.A00(enumC39615HePArr);
        EnumC39615HeP[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC39615HeP enumC39615HeP2 : values) {
            A18.put(enumC39615HeP2.A00, enumC39615HeP2);
        }
        A01 = A18;
    }

    public static EnumC39615HeP valueOf(String str) {
        return (EnumC39615HeP) Enum.valueOf(EnumC39615HeP.class, str);
    }

    public static EnumC39615HeP[] values() {
        return (EnumC39615HeP[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public EnumC39615HeP(String str, int i, String str2) {
        this.A00 = str2;
    }
}

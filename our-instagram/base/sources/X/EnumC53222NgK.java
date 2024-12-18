package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NgK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC53222NgK {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53222NgK[] A03;
    public static final EnumC53222NgK A04;
    public static final EnumC53222NgK A05;
    public static final EnumC53222NgK A06;
    public final int A00;

    static {
        EnumC53222NgK enumC53222NgK = new EnumC53222NgK(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A05 = enumC53222NgK;
        EnumC53222NgK enumC53222NgK2 = new EnumC53222NgK("EVERYONE", 1, 1);
        A04 = enumC53222NgK2;
        EnumC53222NgK enumC53222NgK3 = new EnumC53222NgK("PEOPLE_YOU_FOLLOW", 2, 2);
        A06 = enumC53222NgK3;
        EnumC53222NgK[] enumC53222NgKArr = {enumC53222NgK, enumC53222NgK2, enumC53222NgK3, new EnumC53222NgK("FOLLOWERS_AND_PEOPLE_YOU_FOLLOW", 3, 3)};
        A03 = enumC53222NgKArr;
        A02 = AbstractC12190kN.A00(enumC53222NgKArr);
        EnumC53222NgK[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC53222NgK enumC53222NgK4 : values) {
            AbstractC25227BEk.A1O(enumC53222NgK4, A18, enumC53222NgK4.A00);
        }
        A01 = A18;
    }

    public static EnumC53222NgK valueOf(String str) {
        return (EnumC53222NgK) Enum.valueOf(EnumC53222NgK.class, str);
    }

    public static EnumC53222NgK[] values() {
        return (EnumC53222NgK[]) A03.clone();
    }

    public EnumC53222NgK(String str, int i, int i2) {
        this.A00 = i2;
    }
}

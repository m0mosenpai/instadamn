package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC189548aZ {
    public static final Map A02;
    public static final /* synthetic */ EnumEntries A03;
    public static final /* synthetic */ EnumC189548aZ[] A04;
    public static final EnumC189548aZ A05;
    public static final EnumC189548aZ A06;
    public static final EnumC189548aZ A07;
    public static final EnumC189548aZ A08;
    public final String A00;
    public final boolean A01;

    static {
        EnumC189548aZ enumC189548aZ = new EnumC189548aZ("REMIX", "REMIX", 0, true);
        A06 = enumC189548aZ;
        EnumC189548aZ enumC189548aZ2 = new EnumC189548aZ("REFERENCE", "REFERENCE", 1, false);
        A05 = enumC189548aZ2;
        EnumC189548aZ enumC189548aZ3 = new EnumC189548aZ("SEQUENTIAL_REMIX", "SEQUENTIAL_REMIX", 2, true);
        A07 = enumC189548aZ3;
        EnumC189548aZ enumC189548aZ4 = new EnumC189548aZ("TEMPLATE", "TEMPLATE", 3, false);
        A08 = enumC189548aZ4;
        EnumC189548aZ[] enumC189548aZArr = {enumC189548aZ, enumC189548aZ2, enumC189548aZ3, enumC189548aZ4, new EnumC189548aZ(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 4, true)};
        A04 = enumC189548aZArr;
        A03 = AbstractC12190kN.A00(enumC189548aZArr);
        EnumC189548aZ[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC189548aZ enumC189548aZ5 : values) {
            linkedHashMap.put(enumC189548aZ5.A00, enumC189548aZ5);
        }
        A02 = linkedHashMap;
    }

    public static EnumC189548aZ valueOf(String str) {
        return (EnumC189548aZ) Enum.valueOf(EnumC189548aZ.class, str);
    }

    public static EnumC189548aZ[] values() {
        return (EnumC189548aZ[]) A04.clone();
    }

    public EnumC189548aZ(String str, String str2, int i, boolean z) {
        this.A00 = str2;
        this.A01 = z;
    }
}

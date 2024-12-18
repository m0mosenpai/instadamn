package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5Iu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC115235Iu {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC115235Iu[] A03;
    public static final EnumC115235Iu A04;
    public static final EnumC115235Iu A05;
    public final int A00;

    static {
        EnumC115235Iu enumC115235Iu = new EnumC115235Iu(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A05 = enumC115235Iu;
        EnumC115235Iu enumC115235Iu2 = new EnumC115235Iu("INSTALLED", 1, 1);
        A04 = enumC115235Iu2;
        EnumC115235Iu[] enumC115235IuArr = {enumC115235Iu, enumC115235Iu2, new EnumC115235Iu("NOT_INSTALLED", 2, 2)};
        A03 = enumC115235IuArr;
        A02 = AbstractC12190kN.A00(enumC115235IuArr);
        EnumC115235Iu[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (EnumC115235Iu enumC115235Iu3 : values) {
            linkedHashMap.put(Integer.valueOf(enumC115235Iu3.A00), enumC115235Iu3);
        }
        A01 = linkedHashMap;
    }

    public static EnumC115235Iu valueOf(String str) {
        return (EnumC115235Iu) Enum.valueOf(EnumC115235Iu.class, str);
    }

    public static EnumC115235Iu[] values() {
        return (EnumC115235Iu[]) A03.clone();
    }

    public EnumC115235Iu(String str, int i, int i2) {
        this.A00 = i2;
    }
}

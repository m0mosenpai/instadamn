package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Epj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33412Epj {
    public static final Map A02;
    public static final Map A03;
    public static final /* synthetic */ EnumEntries A04;
    public static final /* synthetic */ EnumC33412Epj[] A05;
    public static final EnumC33412Epj A06;
    public static final EnumC33412Epj A07;
    public static final EnumC33412Epj A08;
    public final int A00;
    public final String A01;

    static {
        EnumC33412Epj enumC33412Epj = new EnumC33412Epj(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        A07 = enumC33412Epj;
        EnumC33412Epj enumC33412Epj2 = new EnumC33412Epj("CLOSE_FRIENDS", 1, 1, "CLOSE_FRIENDS");
        A06 = enumC33412Epj2;
        EnumC33412Epj enumC33412Epj3 = new EnumC33412Epj("RECIPROCAL_FOLLOWS", 2, 2, "RECIPROCAL_FOLLOWS");
        A08 = enumC33412Epj3;
        EnumC33412Epj[] enumC33412EpjArr = {enumC33412Epj, enumC33412Epj2, enumC33412Epj3};
        A05 = enumC33412EpjArr;
        A04 = AbstractC12190kN.A00(enumC33412EpjArr);
        EnumC33412Epj[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap A18 = AbstractC25225BEi.A18(A0L < 16 ? 16 : A0L);
        for (EnumC33412Epj enumC33412Epj4 : values) {
            A18.put(Integer.valueOf(enumC33412Epj4.A00), enumC33412Epj4);
        }
        A02 = A18;
        EnumC33412Epj[] values2 = values();
        int A0L2 = AbstractC16850sd.A0L(values2.length);
        LinkedHashMap A182 = AbstractC25225BEi.A18(A0L2 < 16 ? 16 : A0L2);
        for (EnumC33412Epj enumC33412Epj5 : values2) {
            A182.put(enumC33412Epj5.A01, enumC33412Epj5);
        }
        A03 = A182;
    }

    public static EnumC33412Epj valueOf(String str) {
        return (EnumC33412Epj) Enum.valueOf(EnumC33412Epj.class, str);
    }

    public static EnumC33412Epj[] values() {
        return (EnumC33412Epj[]) A05.clone();
    }

    public EnumC33412Epj(String str, int i, int i2, String str2) {
        this.A00 = i2;
        this.A01 = str2;
    }
}

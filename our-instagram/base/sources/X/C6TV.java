package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6TV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6TV {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C6TV[] A03;
    public static final C6TV A04;
    public static final C6TV A05;
    public static final C6TV A06;
    public static final C6TV A07;
    public static final C6TV A08;
    public final int A00;

    static {
        C6TV c6tv = new C6TV(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 0, 0);
        A07 = c6tv;
        C6TV c6tv2 = new C6TV("CHEVRON_AND_TEXT", 1, 1);
        A04 = c6tv2;
        C6TV c6tv3 = new C6TV("CHEVRON_ONLY", 2, 2);
        A05 = c6tv3;
        C6TV c6tv4 = new C6TV("CHEVRON_ONLY_ABOVE_CTA", 3, 6);
        A06 = c6tv4;
        C6TV c6tv5 = new C6TV("PERSIST_CHEVRON_AND_TEXT", 4, 1001);
        A08 = c6tv5;
        C6TV[] c6tvArr = {c6tv, c6tv2, c6tv3, c6tv4, c6tv5};
        A03 = c6tvArr;
        A02 = AbstractC12190kN.A00(c6tvArr);
        C6TV[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C6TV c6tv6 : values) {
            linkedHashMap.put(Integer.valueOf(c6tv6.A00), c6tv6);
        }
        A01 = linkedHashMap;
    }

    public static C6TV valueOf(String str) {
        return (C6TV) Enum.valueOf(C6TV.class, str);
    }

    public static C6TV[] values() {
        return (C6TV[]) A03.clone();
    }

    public C6TV(String str, int i, int i2) {
        this.A00 = i2;
    }
}

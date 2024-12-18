package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.EpN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33390EpN {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC33390EpN[] A03;
    public static final EnumC33390EpN A04;
    public static final EnumC33390EpN A05;
    public final int A00;

    static {
        EnumC33390EpN enumC33390EpN = new EnumC33390EpN("REACTIVE", 0, 0);
        A05 = enumC33390EpN;
        EnumC33390EpN enumC33390EpN2 = new EnumC33390EpN("PROACTIVE", 1, 2);
        A04 = enumC33390EpN2;
        EnumC33390EpN[] enumC33390EpNArr = {enumC33390EpN, enumC33390EpN2, new EnumC33390EpN("BLUEBADGE", 2, 8)};
        A03 = enumC33390EpNArr;
        A02 = AbstractC12190kN.A00(enumC33390EpNArr);
        EnumC33390EpN[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (EnumC33390EpN enumC33390EpN3 : values) {
            A18.put(Integer.valueOf(enumC33390EpN3.A00), enumC33390EpN3);
        }
        A01 = A18;
    }

    public static EnumC33390EpN valueOf(String str) {
        return (EnumC33390EpN) Enum.valueOf(EnumC33390EpN.class, str);
    }

    public static EnumC33390EpN[] values() {
        return (EnumC33390EpN[]) A03.clone();
    }

    public EnumC33390EpN(String str, int i, int i2) {
        this.A00 = i2;
    }
}

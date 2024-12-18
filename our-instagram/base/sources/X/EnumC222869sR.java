package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.9sR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC222869sR {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC222869sR[] A03;
    public static final EnumC222869sR A04;
    public static final EnumC222869sR A05;
    public static final EnumC222869sR A06;
    public final String A00;

    static {
        EnumC222869sR enumC222869sR = new EnumC222869sR("LEFT", 0, "left");
        A05 = enumC222869sR;
        EnumC222869sR enumC222869sR2 = new EnumC222869sR("RIGHT", 1, "right");
        A06 = enumC222869sR2;
        EnumC222869sR enumC222869sR3 = new EnumC222869sR("CENTER", 2, "center");
        A04 = enumC222869sR3;
        EnumC222869sR[] enumC222869sRArr = {enumC222869sR, enumC222869sR2, enumC222869sR3};
        A03 = enumC222869sRArr;
        A02 = AbstractC12190kN.A00(enumC222869sRArr);
        EnumC222869sR[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC222869sR enumC222869sR4 : values) {
            linkedHashMap.put(enumC222869sR4.A00, enumC222869sR4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC222869sR valueOf(String str) {
        return (EnumC222869sR) Enum.valueOf(EnumC222869sR.class, str);
    }

    public static EnumC222869sR[] values() {
        return (EnumC222869sR[]) A03.clone();
    }

    public EnumC222869sR(String str, int i, String str2) {
        this.A00 = str2;
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.VDi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC68145VDi {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC68145VDi[] A03;
    public static final EnumC68145VDi A04;
    public static final EnumC68145VDi A05;
    public static final EnumC68145VDi A06;
    public final String A00;

    public static EnumC68145VDi valueOf(String str) {
        return (EnumC68145VDi) Enum.valueOf(EnumC68145VDi.class, str);
    }

    public static EnumC68145VDi[] values() {
        return (EnumC68145VDi[]) A03.clone();
    }

    static {
        EnumC68145VDi enumC68145VDi = new EnumC68145VDi("ENABLED", 0, "enabled");
        A05 = enumC68145VDi;
        EnumC68145VDi enumC68145VDi2 = new EnumC68145VDi("DISABLED", 1, "disabled");
        A04 = enumC68145VDi2;
        EnumC68145VDi enumC68145VDi3 = new EnumC68145VDi("UNKNOWN", 2, "unknown");
        A06 = enumC68145VDi3;
        EnumC68145VDi[] enumC68145VDiArr = {enumC68145VDi, enumC68145VDi2, enumC68145VDi3};
        A03 = enumC68145VDiArr;
        A02 = AbstractC12190kN.A00(enumC68145VDiArr);
        EnumC68145VDi[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC68145VDi enumC68145VDi4 : values) {
            linkedHashMap.put(enumC68145VDi4.A00, enumC68145VDi4);
        }
        A01 = linkedHashMap;
    }

    public EnumC68145VDi(String str, int i, String str2) {
        this.A00 = str2;
    }
}

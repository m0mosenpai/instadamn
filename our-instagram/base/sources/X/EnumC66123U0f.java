package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.U0f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC66123U0f {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC66123U0f[] A03;
    public static final EnumC66123U0f A04;
    public static final EnumC66123U0f A05;
    public static final EnumC66123U0f A06;
    public final String A00;

    static {
        EnumC66123U0f enumC66123U0f = new EnumC66123U0f("DWELL_TIME", 0, "dwelltime");
        A04 = enumC66123U0f;
        EnumC66123U0f enumC66123U0f2 = new EnumC66123U0f("TIME", 1, "time");
        A05 = enumC66123U0f2;
        EnumC66123U0f enumC66123U0f3 = new EnumC66123U0f("UNKNOWN", 2, "unknown");
        A06 = enumC66123U0f3;
        EnumC66123U0f[] enumC66123U0fArr = {enumC66123U0f, enumC66123U0f2, enumC66123U0f3};
        A03 = enumC66123U0fArr;
        A02 = AbstractC12190kN.A00(enumC66123U0fArr);
        EnumC66123U0f[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (EnumC66123U0f enumC66123U0f4 : values) {
            linkedHashMap.put(enumC66123U0f4.A00, enumC66123U0f4);
        }
        A01 = linkedHashMap;
    }

    public static EnumC66123U0f valueOf(String str) {
        return (EnumC66123U0f) Enum.valueOf(EnumC66123U0f.class, str);
    }

    public static EnumC66123U0f[] values() {
        return (EnumC66123U0f[]) A03.clone();
    }

    public EnumC66123U0f(String str, int i, String str2) {
        this.A00 = str2;
    }
}

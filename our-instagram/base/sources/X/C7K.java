package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7K {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C7K[] A03;
    public static final C7K A04;
    public final int A00;

    static {
        C7K c7k = new C7K("HORIZONTAL", 0, 0);
        A04 = c7k;
        C7K[] c7kArr = {c7k, new C7K("VERTICAL", 1, 1)};
        A03 = c7kArr;
        A02 = AbstractC12190kN.A00(c7kArr);
        C7K[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (C7K c7k2 : values) {
            AbstractC25227BEk.A1O(c7k2, A18, c7k2.A00);
        }
        A01 = AbstractC09990gB.A0J(A18, C30091DNz.A00);
    }

    public static C7K valueOf(String str) {
        return (C7K) Enum.valueOf(C7K.class, str);
    }

    public static C7K[] values() {
        return (C7K[]) A03.clone();
    }

    public C7K(String str, int i, int i2) {
        this.A00 = i2;
    }
}

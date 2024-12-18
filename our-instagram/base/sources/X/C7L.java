package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7L {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C7L[] A03;
    public static final C7L A04;
    public final C1XV A00;

    static {
        C7L c7l = new C7L(C1XV.A0C);
        A04 = c7l;
        C7L[] c7lArr = {c7l};
        A03 = c7lArr;
        A02 = AbstractC12190kN.A00(c7lArr);
        C7L[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (C7L c7l2 : values) {
            A18.put(c7l2.A00, c7l2);
        }
        A01 = A18;
    }

    public C7L(C1XV c1xv) {
        this.A00 = c1xv;
    }

    public static C7L valueOf(String str) {
        return (C7L) Enum.valueOf(C7L.class, str);
    }

    public static C7L[] values() {
        return (C7L[]) A03.clone();
    }
}

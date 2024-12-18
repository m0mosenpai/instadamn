package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4ZY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZY {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C4ZY[] A03;
    public static final C4ZY A04;
    public static final C4ZY A05;
    public static final C4ZY A06;
    public static final C4ZY A07;
    public final String A00;

    static {
        C4ZY c4zy = new C4ZY("ALMOST_TALL", 0, "almost_tall");
        A04 = c4zy;
        C4ZY c4zy2 = new C4ZY("BALANCED", 1, "balanced");
        A05 = c4zy2;
        C4ZY c4zy3 = new C4ZY("RATIO", 2, "ratio");
        A07 = c4zy3;
        C4ZY c4zy4 = new C4ZY("PORTRAIT", 3, "portrait");
        A06 = c4zy4;
        C4ZY[] c4zyArr = {c4zy, c4zy2, c4zy3, c4zy4, new C4ZY("REDUCED", 4, "reduced")};
        A03 = c4zyArr;
        A02 = AbstractC12190kN.A00(c4zyArr);
        C4ZY[] values = values();
        int A0L = AbstractC16850sd.A0L(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L < 16 ? 16 : A0L);
        for (C4ZY c4zy5 : values) {
            linkedHashMap.put(c4zy5.A00, c4zy5);
        }
        A01 = linkedHashMap;
    }

    public static C4ZY valueOf(String str) {
        return (C4ZY) Enum.valueOf(C4ZY.class, str);
    }

    public static C4ZY[] values() {
        return (C4ZY[]) A03.clone();
    }

    public C4ZY(String str, int i, String str2) {
        this.A00 = str2;
    }
}

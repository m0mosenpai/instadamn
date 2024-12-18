package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7P {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7P[] A02;
    public static final C7P A03;
    public static final C7P A04;
    public static final C7P A05;
    public final String A00;

    static {
        C7P c7p = new C7P("ABOVE_GRID", 0, "above_grid");
        A03 = c7p;
        C7P c7p2 = new C7P("BELOW_GRID", 1, "below_grid");
        A04 = c7p2;
        C7P c7p3 = new C7P("WITHIN_CARD", 2, "within_card");
        A05 = c7p3;
        C7P[] c7pArr = {c7p, c7p2, c7p3};
        A02 = c7pArr;
        A01 = AbstractC12190kN.A00(c7pArr);
    }

    public static C7P valueOf(String str) {
        return (C7P) Enum.valueOf(C7P.class, str);
    }

    public static C7P[] values() {
        return (C7P[]) A02.clone();
    }

    public C7P(String str, int i, String str2) {
        this.A00 = str2;
    }
}

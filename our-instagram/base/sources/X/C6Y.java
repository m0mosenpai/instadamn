package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6Y {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6Y[] A01;
    public static final C6Y A02;
    public static final C6Y A03;
    public static final C6Y A04;

    static {
        C6Y c6y = new C6Y("Hidden", 0);
        A04 = c6y;
        C6Y c6y2 = new C6Y("Expanded", 1);
        A02 = c6y2;
        C6Y c6y3 = new C6Y("HalfExpanded", 2);
        A03 = c6y3;
        C6Y[] c6yArr = {c6y, c6y2, c6y3};
        A01 = c6yArr;
        A00 = AbstractC12190kN.A00(c6yArr);
    }

    public static C6Y valueOf(String str) {
        return (C6Y) Enum.valueOf(C6Y.class, str);
    }

    public static C6Y[] values() {
        return (C6Y[]) A01.clone();
    }

    public C6Y(String str, int i) {
    }
}

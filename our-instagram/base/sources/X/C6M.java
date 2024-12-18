package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6M {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6M[] A01;
    public static final C6M A02;
    public static final C6M A03;
    public static final C6M A04;

    static {
        C6M c6m = new C6M("DEFAULT", 0);
        A02 = c6m;
        C6M c6m2 = new C6M("ON_MEDIA", 1);
        A04 = c6m2;
        C6M c6m3 = new C6M("ON_COLOR", 2);
        A03 = c6m3;
        C6M[] c6mArr = {c6m, c6m2, c6m3, new C6M("ON_WHITE", 3)};
        A01 = c6mArr;
        A00 = AbstractC12190kN.A00(c6mArr);
    }

    public static C6M valueOf(String str) {
        return (C6M) Enum.valueOf(C6M.class, str);
    }

    public static C6M[] values() {
        return (C6M[]) A01.clone();
    }

    public C6M(String str, int i) {
    }
}

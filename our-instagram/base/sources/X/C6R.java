package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6R {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6R[] A01;
    public static final C6R A02;
    public static final C6R A03;
    public static final C6R A04;

    static {
        C6R c6r = new C6R("LOADING", 0);
        A03 = c6r;
        C6R c6r2 = new C6R("SUCCESS", 1);
        A04 = c6r2;
        C6R c6r3 = new C6R("ERROR", 2);
        A02 = c6r3;
        C6R[] c6rArr = {c6r, c6r2, c6r3};
        A01 = c6rArr;
        A00 = AbstractC12190kN.A00(c6rArr);
    }

    public static C6R valueOf(String str) {
        return (C6R) Enum.valueOf(C6R.class, str);
    }

    public static C6R[] values() {
        return (C6R[]) A01.clone();
    }

    public C6R(String str, int i) {
    }
}

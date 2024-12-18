package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7R {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7R[] A02;
    public static final C7R A03;
    public static final C7R A04;
    public static final C7R A05;
    public final String A00;

    static {
        C7R c7r = new C7R("ENGAGEMENT", 0, "ENGAGEMENT");
        A03 = c7r;
        C7R c7r2 = new C7R("PARTICIPATION", 1, "PARTICIPATION");
        A05 = c7r2;
        C7R c7r3 = new C7R("GROWTH", 2, "GROWTH");
        A04 = c7r3;
        C7R[] c7rArr = {c7r, c7r2, c7r3};
        A02 = c7rArr;
        A01 = AbstractC12190kN.A00(c7rArr);
    }

    public static C7R valueOf(String str) {
        return (C7R) Enum.valueOf(C7R.class, str);
    }

    public static C7R[] values() {
        return (C7R[]) A02.clone();
    }

    public C7R(String str, int i, String str2) {
        this.A00 = str2;
    }
}

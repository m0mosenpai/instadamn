package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6T {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6T[] A01;
    public static final C6T A02;
    public static final C6T A03;
    public static final C6T A04;

    static {
        C6T c6t = new C6T("Bold", 0);
        A02 = c6t;
        C6T c6t2 = new C6T("Italic", 1);
        A03 = c6t2;
        C6T c6t3 = new C6T("Strikethrough", 2);
        A04 = c6t3;
        C6T[] c6tArr = {c6t, c6t2, c6t3};
        A01 = c6tArr;
        A00 = AbstractC12190kN.A00(c6tArr);
    }

    public static C6T valueOf(String str) {
        return (C6T) Enum.valueOf(C6T.class, str);
    }

    public static C6T[] values() {
        return (C6T[]) A01.clone();
    }

    public C6T(String str, int i) {
    }
}

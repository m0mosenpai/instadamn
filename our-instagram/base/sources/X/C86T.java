package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.86T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86T {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C86T[] A01;
    public static final C86T A02;
    public static final C86T A03;
    public static final C86T A04;

    static {
        C86T c86t = new C86T("OPTION_NOT_ALLOWED", 0);
        A04 = c86t;
        C86T c86t2 = new C86T("OFF", 1);
        A02 = c86t2;
        C86T c86t3 = new C86T("ON", 2);
        A03 = c86t3;
        C86T[] c86tArr = {c86t, c86t2, c86t3};
        A01 = c86tArr;
        A00 = AbstractC12190kN.A00(c86tArr);
    }

    public static C86T valueOf(String str) {
        return (C86T) Enum.valueOf(C86T.class, str);
    }

    public static C86T[] values() {
        return (C86T[]) A01.clone();
    }

    public C86T(String str, int i) {
    }
}

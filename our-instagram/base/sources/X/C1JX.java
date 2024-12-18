package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1JX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JX {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1JX[] A01;
    public static final C1JX A02;
    public static final C1JX A03;
    public static final C1JX A04;

    public static C1JX valueOf(String str) {
        return (C1JX) Enum.valueOf(C1JX.class, str);
    }

    public static C1JX[] values() {
        return (C1JX[]) A01.clone();
    }

    static {
        C1JX c1jx = new C1JX("COROUTINE_SUSPENDED", 0);
        A02 = c1jx;
        C1JX c1jx2 = new C1JX("UNDECIDED", 1);
        A04 = c1jx2;
        C1JX c1jx3 = new C1JX("RESUMED", 2);
        A03 = c1jx3;
        C1JX[] c1jxArr = {c1jx, c1jx2, c1jx3};
        A01 = c1jxArr;
        A00 = AbstractC12190kN.A00(c1jxArr);
    }

    public C1JX(String str, int i) {
    }
}

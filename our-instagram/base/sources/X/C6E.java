package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6E {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6E[] A01;
    public static final C6E A02;
    public static final C6E A03;

    static {
        C6E c6e = new C6E("GRAY", 0);
        A03 = c6e;
        C6E c6e2 = new C6E("GRADIENT", 1);
        A02 = c6e2;
        C6E[] c6eArr = {c6e, c6e2};
        A01 = c6eArr;
        A00 = AbstractC12190kN.A00(c6eArr);
    }

    public static C6E valueOf(String str) {
        return (C6E) Enum.valueOf(C6E.class, str);
    }

    public static C6E[] values() {
        return (C6E[]) A01.clone();
    }

    public C6E(String str, int i) {
    }
}

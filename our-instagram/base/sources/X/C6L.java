package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6L {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6L[] A01;
    public static final C6L A02;
    public static final C6L A03;
    public static final C6L A04;

    static {
        C6L c6l = new C6L("THROW", 0);
        A04 = c6l;
        C6L c6l2 = new C6L("SHOW", 1);
        A03 = c6l2;
        C6L c6l3 = new C6L("HIDE", 2);
        A02 = c6l3;
        C6L[] c6lArr = {c6l, c6l2, c6l3};
        A01 = c6lArr;
        A00 = AbstractC12190kN.A00(c6lArr);
    }

    public static C6L valueOf(String str) {
        return (C6L) Enum.valueOf(C6L.class, str);
    }

    public static C6L[] values() {
        return (C6L[]) A01.clone();
    }

    public C6L(String str, int i) {
    }
}

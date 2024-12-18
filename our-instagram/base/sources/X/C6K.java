package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6K {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6K[] A01;
    public static final C6K A02;
    public static final C6K A03;
    public static final C6K A04;

    static {
        C6K c6k = new C6K("IMMEDIATE", 0);
        A03 = c6k;
        C6K c6k2 = new C6K("UI_NORMAL", 1);
        A04 = c6k2;
        C6K c6k3 = new C6K("BACKGROUND", 2);
        A02 = c6k3;
        C6K[] c6kArr = {c6k, c6k2, c6k3};
        A01 = c6kArr;
        A00 = AbstractC12190kN.A00(c6kArr);
    }

    public static C6K valueOf(String str) {
        return (C6K) Enum.valueOf(C6K.class, str);
    }

    public static C6K[] values() {
        return (C6K[]) A01.clone();
    }

    public C6K(String str, int i) {
    }
}

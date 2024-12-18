package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C63 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C63[] A01;
    public static final C63 A02;
    public static final C63 A03;

    static {
        C63 c63 = new C63("CLOSE_ACTIVITY", 0);
        A02 = c63;
        C63 c632 = new C63("POP_FRAGMENT", 1);
        A03 = c632;
        C63[] c63Arr = {c63, c632};
        A01 = c63Arr;
        A00 = AbstractC12190kN.A00(c63Arr);
    }

    public static C63 valueOf(String str) {
        return (C63) Enum.valueOf(C63.class, str);
    }

    public static C63[] values() {
        return (C63[]) A01.clone();
    }

    public C63(String str, int i) {
    }
}

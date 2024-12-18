package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C64 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C64[] A01;
    public static final C64 A02;
    public static final C64 A03;

    static {
        C64 c64 = new C64("VERTICAL", 0);
        A03 = c64;
        C64 c642 = new C64("HORIZONTAL", 1);
        A02 = c642;
        C64[] c64Arr = {c64, c642};
        A01 = c64Arr;
        A00 = AbstractC12190kN.A00(c64Arr);
    }

    public static C64 valueOf(String str) {
        return (C64) Enum.valueOf(C64.class, str);
    }

    public static C64[] values() {
        return (C64[]) A01.clone();
    }

    public C64(String str, int i) {
    }
}

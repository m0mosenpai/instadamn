package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C60 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C60[] A01;
    public static final C60 A02;
    public static final C60 A03;

    static {
        C60 c60 = new C60("TOP_DOWN", 0);
        A03 = c60;
        C60 c602 = new C60("BOTTOM_UP", 1);
        A02 = c602;
        C60[] c60Arr = {c60, c602};
        A01 = c60Arr;
        A00 = AbstractC12190kN.A00(c60Arr);
    }

    public static C60 valueOf(String str) {
        return (C60) Enum.valueOf(C60.class, str);
    }

    public static C60[] values() {
        return (C60[]) A01.clone();
    }

    public C60(String str, int i) {
    }
}

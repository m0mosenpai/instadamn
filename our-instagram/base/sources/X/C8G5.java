package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8G5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8G5 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8G5[] A01;
    public static final C8G5 A02;
    public static final C8G5 A03;
    public static final C8G5 A04;
    public static final C8G5 A05;

    static {
        C8G5 c8g5 = new C8G5("PLAY", 0);
        A04 = c8g5;
        C8G5 c8g52 = new C8G5("LOADING", 1);
        A03 = c8g52;
        C8G5 c8g53 = new C8G5("STOP", 2);
        A05 = c8g53;
        C8G5 c8g54 = new C8G5("AUTO_PLAY", 3);
        A02 = c8g54;
        C8G5[] c8g5Arr = {c8g5, c8g52, c8g53, c8g54};
        A01 = c8g5Arr;
        A00 = AbstractC12190kN.A00(c8g5Arr);
    }

    public static C8G5 valueOf(String str) {
        return (C8G5) Enum.valueOf(C8G5.class, str);
    }

    public static C8G5[] values() {
        return (C8G5[]) A01.clone();
    }

    public C8G5(String str, int i) {
    }
}

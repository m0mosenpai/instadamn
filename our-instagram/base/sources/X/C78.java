package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C78 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C78[] A01;
    public static final C78 A02;
    public static final C78 A03;
    public static final C78 A04;
    public static final C78 A05;
    public static final C78 A06;
    public static final C78 A07;
    public static final C78 A08;

    static {
        C78 c78 = new C78("SUNDAY", 0);
        A05 = c78;
        C78 c782 = new C78("MONDAY", 1);
        A03 = c782;
        C78 c783 = new C78("TUESDAY", 2);
        A07 = c783;
        C78 c784 = new C78("WEDNESDAY", 3);
        A08 = c784;
        C78 c785 = new C78("THURSDAY", 4);
        A06 = c785;
        C78 c786 = new C78("FRIDAY", 5);
        A02 = c786;
        C78 c787 = new C78("SATURDAY", 6);
        A04 = c787;
        C78[] c78Arr = {c78, c782, c783, c784, c785, c786, c787};
        A01 = c78Arr;
        A00 = AbstractC12190kN.A00(c78Arr);
    }

    public static C78 valueOf(String str) {
        return (C78) Enum.valueOf(C78.class, str);
    }

    public static C78[] values() {
        return (C78[]) A01.clone();
    }

    public C78(String str, int i) {
    }
}

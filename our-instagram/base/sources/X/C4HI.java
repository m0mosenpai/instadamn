package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4HI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4HI {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4HI[] A01;
    public static final C4HI A02;
    public static final C4HI A03;
    public static final C4HI A04;
    public static final C4HI A05;
    public static final C4HI A06;
    public static final C4HI A07;
    public static final C4HI A08;
    public static final C4HI A09;
    public static final C4HI A0A;
    public static final C4HI A0B;
    public static final C4HI A0C;
    public static final C4HI A0D;
    public static final C4HI A0E;

    static {
        C4HI c4hi = new C4HI("MEMORY_NORMAL", 0);
        A06 = c4hi;
        C4HI c4hi2 = new C4HI("MEMORY_RED", 1);
        A07 = c4hi2;
        C4HI c4hi3 = new C4HI("MEMORY_YELLOW", 2);
        A08 = c4hi3;
        C4HI c4hi4 = new C4HI("THERMAL_NORMAL", 3);
        A0E = c4hi4;
        C4HI c4hi5 = new C4HI("SEVERE_THERMAL", 4);
        A0A = c4hi5;
        C4HI c4hi6 = new C4HI("BATTERY_THRESHOLD", 5);
        A03 = c4hi6;
        C4HI c4hi7 = new C4HI("LOW_BATTERY", 6);
        A05 = c4hi7;
        C4HI c4hi8 = new C4HI("BATTERY_NORMAL", 7);
        A02 = c4hi8;
        C4HI c4hi9 = new C4HI("STORAGE_GREEN", 8);
        A0B = c4hi9;
        C4HI c4hi10 = new C4HI("STORAGE_YELLOW", 9);
        A0D = c4hi10;
        C4HI c4hi11 = new C4HI("STORAGE_RED", 10);
        A0C = c4hi11;
        C4HI c4hi12 = new C4HI("FAST_SCROLL", 11);
        A04 = c4hi12;
        C4HI c4hi13 = new C4HI("SCROLL_SPEED_THRESHOLD", 12);
        A09 = c4hi13;
        C4HI[] c4hiArr = {c4hi, c4hi2, c4hi3, c4hi4, c4hi5, c4hi6, c4hi7, c4hi8, c4hi9, c4hi10, c4hi11, c4hi12, c4hi13, new C4HI("SMART_AUTOPLAY_ACTIONS", 13)};
        A01 = c4hiArr;
        A00 = AbstractC12190kN.A00(c4hiArr);
    }

    public static C4HI valueOf(String str) {
        return (C4HI) Enum.valueOf(C4HI.class, str);
    }

    public static C4HI[] values() {
        return (C4HI[]) A01.clone();
    }

    public C4HI(String str, int i) {
    }
}

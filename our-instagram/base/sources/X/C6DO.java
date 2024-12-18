package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6DO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DO {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6DO[] A01;
    public static final C6DO A02;
    public static final C6DO A03;
    public static final C6DO A04;
    public static final C6DO A05;
    public static final C6DO A06;
    public static final C6DO A07;
    public static final C6DO A08;
    public static final C6DO A09;
    public static final C6DO A0A;
    public static final C6DO A0B;
    public static final C6DO A0C;
    public static final C6DO A0D;
    public static final C6DO A0E;
    public static final C6DO A0F;
    public static final C6DO A0G;

    static {
        C6DO c6do = new C6DO("RESET", 0);
        A0C = c6do;
        C6DO c6do2 = new C6DO("ROTATE_POSITIVE_90", 1);
        A0G = c6do2;
        C6DO c6do3 = new C6DO("ROTATE_180", 2);
        A0D = c6do3;
        C6DO c6do4 = new C6DO("ROTATE_NEGATIVE_90", 3);
        A0F = c6do4;
        C6DO c6do5 = new C6DO("ROTATE_BY_90", 4);
        A0E = c6do5;
        C6DO c6do6 = new C6DO("CROP_16_9", 5);
        A06 = c6do6;
        C6DO c6do7 = new C6DO("CROP_4_3", 6);
        A09 = c6do7;
        C6DO c6do8 = new C6DO("CROP_1_1", 7);
        A07 = c6do8;
        C6DO c6do9 = new C6DO("CROP_3_4", 8);
        A08 = c6do9;
        C6DO c6do10 = new C6DO("CROP_9_16", 9);
        A0A = c6do10;
        C6DO c6do11 = new C6DO("ALIGN_LEFT", 10);
        A03 = c6do11;
        C6DO c6do12 = new C6DO("ALIGN_RIGHT", 11);
        A04 = c6do12;
        C6DO c6do13 = new C6DO("ALIGN_TOP", 12);
        A05 = c6do13;
        C6DO c6do14 = new C6DO("ALIGN_BOTTOM", 13);
        A02 = c6do14;
        C6DO c6do15 = new C6DO("FIT", 14);
        A0B = c6do15;
        C6DO[] c6doArr = {c6do, c6do2, c6do3, c6do4, c6do5, c6do6, c6do7, c6do8, c6do9, c6do10, c6do11, c6do12, c6do13, c6do14, c6do15};
        A01 = c6doArr;
        A00 = AbstractC12190kN.A00(c6doArr);
    }

    public static C6DO valueOf(String str) {
        return (C6DO) Enum.valueOf(C6DO.class, str);
    }

    public static C6DO[] values() {
        return (C6DO[]) A01.clone();
    }

    public C6DO(String str, int i) {
    }
}

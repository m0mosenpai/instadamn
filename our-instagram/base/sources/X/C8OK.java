package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8OK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OK {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8OK[] A01;
    public static final C8OK A02;
    public static final C8OK A03;
    public static final C8OK A04;
    public static final C8OK A05;
    public static final C8OK A06;
    public static final C8OK A07;
    public static final C8OK A08;
    public static final C8OK A09;
    public static final C8OK A0A;
    public static final C8OK A0B;
    public static final C8OK A0C;
    public static final C8OK A0D;
    public static final C8OK A0E;
    public static final C8OK A0F;
    public static final C8OK A0G;
    public static final C8OK A0H;

    static {
        C8OK c8ok = new C8OK("RECTANGLE", 0);
        A0A = c8ok;
        C8OK c8ok2 = new C8OK("CIRCLE", 1);
        A04 = c8ok2;
        C8OK c8ok3 = new C8OK("SQUARE", 2);
        A0C = c8ok3;
        C8OK c8ok4 = new C8OK("HEART", 3);
        A06 = c8ok4;
        C8OK c8ok5 = new C8OK("HEART_FILLABLE", 4);
        A07 = c8ok5;
        C8OK c8ok6 = new C8OK("STAR_FILLABLE", 5);
        A0F = c8ok6;
        C8OK c8ok7 = new C8OK("STAR", 6);
        A0D = c8ok7;
        C8OK c8ok8 = new C8OK("ROLL_CALL", 7);
        A0B = c8ok8;
        C8OK c8ok9 = new C8OK("BEFORE_AND_AFTER", 8);
        A03 = c8ok9;
        C8OK c8ok10 = new C8OK("POTATO", 9);
        A09 = c8ok10;
        C8OK c8ok11 = new C8OK("HEART_REFRESH", 10);
        A08 = c8ok11;
        C8OK c8ok12 = new C8OK("STAR_REFRESH", 11);
        A0G = c8ok12;
        C8OK c8ok13 = new C8OK("BADGE", 12);
        A02 = c8ok13;
        C8OK c8ok14 = new C8OK("FLOWER", 13);
        A05 = c8ok14;
        C8OK c8ok15 = new C8OK("TILES", 14);
        A0H = c8ok15;
        C8OK c8ok16 = new C8OK("STARBURST", 15);
        A0E = c8ok16;
        C8OK[] c8okArr = {c8ok, c8ok2, c8ok3, c8ok4, c8ok5, c8ok6, c8ok7, c8ok8, c8ok9, c8ok10, c8ok11, c8ok12, c8ok13, c8ok14, c8ok15, c8ok16};
        A01 = c8okArr;
        A00 = AbstractC12190kN.A00(c8okArr);
    }

    public static C8OK valueOf(String str) {
        return (C8OK) Enum.valueOf(C8OK.class, str);
    }

    public static C8OK[] values() {
        return (C8OK[]) A01.clone();
    }

    public C8OK(String str, int i) {
    }
}

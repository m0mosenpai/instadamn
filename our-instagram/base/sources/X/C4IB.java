package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4IB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IB {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C4IB[] A02;
    public static final C4IB A03;
    public static final C4IB A04;
    public static final C4IB A05;
    public static final C4IB A06;
    public static final C4IB A07;
    public static final C4IB A08;
    public static final C4IB A09;
    public static final C4IB A0A;
    public static final C4IB A0B;
    public static final C4IB A0C;
    public final String A00;

    static {
        C4IB c4ib = new C4IB("LOCATION_PRECISE", 0, "LOCATION_PRECISE");
        A05 = c4ib;
        C4IB c4ib2 = new C4IB("LOCATION_IMPRECISE", 1, "LOCATION_IMPRECISE");
        A04 = c4ib2;
        C4IB c4ib3 = new C4IB("PHOTO_READ", 2, "PHOTO_READ");
        A06 = c4ib3;
        C4IB c4ib4 = new C4IB("PHOTO_WRITE", 3, "PHOTO_WRITE");
        A08 = c4ib4;
        C4IB c4ib5 = new C4IB("PHOTO_READ_WRITE", 4, "PHOTO_READ_WRITE");
        A07 = c4ib5;
        C4IB c4ib6 = new C4IB("STORAGE_READ", 5, "STORAGE_READ");
        A09 = c4ib6;
        C4IB c4ib7 = new C4IB("STORAGE_WRITE", 6, "STORAGE_WRITE");
        A0B = c4ib7;
        C4IB c4ib8 = new C4IB("STORAGE_READ_WRITE", 7, "STORAGE_READ_WRITE");
        A0A = c4ib8;
        C4IB c4ib9 = new C4IB("CONTACTS_READ_WRITE", 8, "CONTACTS_READ_WRITE");
        A03 = c4ib9;
        C4IB c4ib10 = new C4IB("UNSPECIFIED", 9, "UNSPECIFIED");
        A0C = c4ib10;
        C4IB[] c4ibArr = {c4ib, c4ib2, c4ib3, c4ib4, c4ib5, c4ib6, c4ib7, c4ib8, c4ib9, c4ib10};
        A02 = c4ibArr;
        A01 = AbstractC12190kN.A00(c4ibArr);
    }

    public static C4IB valueOf(String str) {
        return (C4IB) Enum.valueOf(C4IB.class, str);
    }

    public static C4IB[] values() {
        return (C4IB[]) A02.clone();
    }

    public C4IB(String str, int i, String str2) {
        this.A00 = str2;
    }
}

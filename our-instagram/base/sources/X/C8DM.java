package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8DM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DM {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8DM[] A01;
    public static final C8DM A02;
    public static final C8DM A03;
    public static final C8DM A04;
    public static final C8DM A05;
    public static final C8DM A06;
    public static final C8DM A07;
    public static final C8DM A08;
    public static final C8DM A09;
    public static final C8DM A0A;
    public static final C8DM A0B;
    public static final C8DM A0C;
    public static final C8DM A0D;
    public static final C8DM A0E;

    static {
        C8DM c8dm = new C8DM("FILL", 0);
        A02 = c8dm;
        C8DM c8dm2 = new C8DM("SMART_CROP_FILL_FROM_FIT", 1);
        A04 = c8dm2;
        C8DM c8dm3 = new C8DM("SMART_CROP_FILL_FROM_FREE_TRANSFORM", 2);
        A05 = c8dm3;
        C8DM c8dm4 = new C8DM("FIT", 3);
        A03 = c8dm4;
        C8DM c8dm5 = new C8DM("SMART_CROP_FIT", 4);
        A06 = c8dm5;
        C8DM c8dm6 = new C8DM("SMART_CROP_FREE_TRANSFORM", 5);
        A07 = c8dm6;
        C8DM c8dm7 = new C8DM("SMART_CROP_FREE_TRANSFORM_CACHED", 6);
        A08 = c8dm7;
        C8DM c8dm8 = new C8DM("SMART_TRACKING_FIT", 7);
        A0A = c8dm8;
        C8DM c8dm9 = new C8DM("SMART_TRACKING_FILL", 8);
        A09 = c8dm9;
        C8DM c8dm10 = new C8DM("SMART_TRACKING_FREE_TRANSFORM", 9);
        A0B = c8dm10;
        C8DM c8dm11 = new C8DM("SMART_TRACKING_PROCESSING", 10);
        A0C = c8dm11;
        C8DM c8dm12 = new C8DM("SMART_TRACKING_PROCESSING_TOOLTIP", 11);
        A0E = c8dm12;
        C8DM c8dm13 = new C8DM("SMART_TRACKING_PROCESSING_INVALID", 12);
        A0D = c8dm13;
        C8DM[] c8dmArr = {c8dm, c8dm2, c8dm3, c8dm4, c8dm5, c8dm6, c8dm7, c8dm8, c8dm9, c8dm10, c8dm11, c8dm12, c8dm13};
        A01 = c8dmArr;
        A00 = AbstractC12190kN.A00(c8dmArr);
    }

    public static C8DM valueOf(String str) {
        return (C8DM) Enum.valueOf(C8DM.class, str);
    }

    public static C8DM[] values() {
        return (C8DM[]) A01.clone();
    }

    public C8DM(String str, int i) {
    }
}

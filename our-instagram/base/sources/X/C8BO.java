package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8BO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BO {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8BO[] A01;
    public static final C8BO A02;
    public static final C8BO A03;
    public static final C8BO A04;
    public static final C8BO A05;
    public static final C8BO A06;
    public static final C8BO A07;
    public static final C8BO A08;
    public static final C8BO A09;

    static {
        C8BO c8bo = new C8BO("AUDIO_PAGE", 0);
        A02 = c8bo;
        C8BO c8bo2 = new C8BO("CAMERA", 1);
        A04 = c8bo2;
        C8BO c8bo3 = new C8BO("GALLERY", 2);
        A06 = c8bo3;
        C8BO c8bo4 = new C8BO("BROWSER", 3);
        A03 = c8bo4;
        C8BO c8bo5 = new C8BO("POSTCAP", 4);
        A07 = c8bo5;
        C8BO c8bo6 = new C8BO("TREND_REPORT", 5);
        A08 = c8bo6;
        C8BO c8bo7 = new C8BO("CREATORS_INSPIRATION_HUB_AUDIO", 6);
        A05 = c8bo7;
        C8BO c8bo8 = new C8BO("UNKNOWN", 7);
        A09 = c8bo8;
        C8BO[] c8boArr = {c8bo, c8bo2, c8bo3, c8bo4, c8bo5, c8bo6, c8bo7, c8bo8};
        A01 = c8boArr;
        A00 = AbstractC12190kN.A00(c8boArr);
    }

    public static C8BO valueOf(String str) {
        return (C8BO) Enum.valueOf(C8BO.class, str);
    }

    public static C8BO[] values() {
        return (C8BO[]) A01.clone();
    }

    public C8BO(String str, int i) {
    }
}

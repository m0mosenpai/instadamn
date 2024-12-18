package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4JD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4JD[] A01;
    public static final C4JD A02;
    public static final C4JD A03;
    public static final C4JD A04;
    public static final C4JD A05;

    static {
        C4JD c4jd = new C4JD("SOUND_ON", 0);
        A04 = c4jd;
        C4JD c4jd2 = new C4JD("SOUND_OFF", 1);
        A03 = c4jd2;
        C4JD c4jd3 = new C4JD("NO_SOUND", 2);
        A02 = c4jd3;
        C4JD c4jd4 = new C4JD("ZERO_RATING_NUX", 3);
        A05 = c4jd4;
        C4JD[] c4jdArr = {c4jd, c4jd2, c4jd3, c4jd4};
        A01 = c4jdArr;
        A00 = AbstractC12190kN.A00(c4jdArr);
    }

    public static C4JD valueOf(String str) {
        return (C4JD) Enum.valueOf(C4JD.class, str);
    }

    public static C4JD[] values() {
        return (C4JD[]) A01.clone();
    }

    public C4JD(String str, int i) {
    }
}

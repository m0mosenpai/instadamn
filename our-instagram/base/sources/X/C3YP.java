package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3YP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3YP {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C3YP[] A02;
    public static final C3YP A03;
    public static final C3YP A04;
    public static final C3YP A05;
    public static final C3YP A06;
    public final String A00;

    static {
        C3YP c3yp = new C3YP("FEED", 0, "feed");
        A05 = c3yp;
        C3YP c3yp2 = new C3YP("EXPLORE", 1, "explore");
        A03 = c3yp2;
        C3YP c3yp3 = new C3YP("EXPLORE_GRID", 2, "explore_grid");
        A04 = c3yp3;
        C3YP c3yp4 = new C3YP("REELS", 3, "reels");
        A06 = c3yp4;
        C3YP[] c3ypArr = {c3yp, c3yp2, c3yp3, c3yp4};
        A02 = c3ypArr;
        A01 = AbstractC12190kN.A00(c3ypArr);
    }

    public static C3YP valueOf(String str) {
        return (C3YP) Enum.valueOf(C3YP.class, str);
    }

    public static C3YP[] values() {
        return (C3YP[]) A02.clone();
    }

    public C3YP(String str, int i, String str2) {
        this.A00 = str2;
    }
}

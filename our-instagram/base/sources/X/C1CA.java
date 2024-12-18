package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1CA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CA {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C1CA[] A02;
    public static final C1CA A03;
    public static final C1CA A04;
    public static final C1CA A05;
    public static final C1CA A06;
    public static final C1CA A07;
    public final String A00;

    static {
        C1CA c1ca = new C1CA("COLD", 0, "cold");
        A03 = c1ca;
        C1CA c1ca2 = new C1CA("LUKE_WARM", 1, "lukewarm");
        A06 = c1ca2;
        C1CA c1ca3 = new C1CA("HOT", 2, "hot");
        A05 = c1ca3;
        C1CA c1ca4 = new C1CA("COLD_BACKGROUND", 3, "cold_background");
        A04 = c1ca4;
        C1CA c1ca5 = new C1CA("NOT_SET", 4, "not set");
        A07 = c1ca5;
        C1CA[] c1caArr = {c1ca, c1ca2, c1ca3, c1ca4, c1ca5};
        A02 = c1caArr;
        A01 = AbstractC12190kN.A00(c1caArr);
    }

    public static C1CA valueOf(String str) {
        return (C1CA) Enum.valueOf(C1CA.class, str);
    }

    public static C1CA[] values() {
        return (C1CA[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public C1CA(String str, int i, String str2) {
        this.A00 = str2;
    }
}

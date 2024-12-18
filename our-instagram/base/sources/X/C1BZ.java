package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1BZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1BZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C1BZ[] A01;
    public static final C1BZ A02;
    public static final C1BZ A03;
    public static final C1BZ A04;

    static {
        C1BZ c1bz = new C1BZ("LAZY_PREFERENCES", 0);
        A02 = c1bz;
        C1BZ c1bz2 = new C1BZ("NORMAL_PREFERENCES", 1);
        A03 = c1bz2;
        C1BZ c1bz3 = new C1BZ("NORMAL_PREFERENCES_EARLY_LOAD", 2);
        A04 = c1bz3;
        C1BZ[] c1bzArr = {c1bz, c1bz2, c1bz3};
        A01 = c1bzArr;
        A00 = AbstractC12190kN.A00(c1bzArr);
    }

    public static C1BZ valueOf(String str) {
        return (C1BZ) Enum.valueOf(C1BZ.class, str);
    }

    public static C1BZ[] values() {
        return (C1BZ[]) A01.clone();
    }

    public C1BZ(String str, int i) {
    }
}

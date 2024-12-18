package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3VZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VZ {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3VZ[] A01;
    public static final C3VZ A02;
    public static final C3VZ A03;
    public static final C3VZ A04;

    static {
        C3VZ c3vz = new C3VZ("DRAGGING", 0);
        A02 = c3vz;
        C3VZ c3vz2 = new C3VZ("SETTLING", 1);
        A04 = c3vz2;
        C3VZ c3vz3 = new C3VZ("IDLE", 2);
        A03 = c3vz3;
        C3VZ[] c3vzArr = {c3vz, c3vz2, c3vz3};
        A01 = c3vzArr;
        A00 = AbstractC12190kN.A00(c3vzArr);
    }

    public static C3VZ valueOf(String str) {
        return (C3VZ) Enum.valueOf(C3VZ.class, str);
    }

    public static C3VZ[] values() {
        return (C3VZ[]) A01.clone();
    }

    public C3VZ(String str, int i) {
    }
}

package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6Z {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6Z[] A01;
    public static final C6Z A02;
    public static final C6Z A03;
    public static final C6Z A04;

    static {
        C6Z c6z = new C6Z("SHOW", 0);
        A04 = c6z;
        C6Z c6z2 = new C6Z("HIDE", 1);
        A02 = c6z2;
        C6Z c6z3 = new C6Z("HIDE_FOR_30_DAYS", 2);
        A03 = c6z3;
        C6Z[] c6zArr = {c6z, c6z2, c6z3};
        A01 = c6zArr;
        A00 = AbstractC12190kN.A00(c6zArr);
    }

    public static C6Z valueOf(String str) {
        return (C6Z) Enum.valueOf(C6Z.class, str);
    }

    public static C6Z[] values() {
        return (C6Z[]) A01.clone();
    }

    public C6Z(String str, int i) {
    }
}

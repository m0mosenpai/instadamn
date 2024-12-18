package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.3KP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KP {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C3KP[] A01;
    public static final C3KP A02;

    static {
        C3KP c3kp = new C3KP("VIPER", 0);
        A02 = c3kp;
        C3KP[] c3kpArr = {c3kp, new C3KP("GNV", 1)};
        A01 = c3kpArr;
        A00 = AbstractC12190kN.A00(c3kpArr);
    }

    public static C3KP valueOf(String str) {
        return (C3KP) Enum.valueOf(C3KP.class, str);
    }

    public static C3KP[] values() {
        return (C3KP[]) A01.clone();
    }

    public C3KP(String str, int i) {
    }
}

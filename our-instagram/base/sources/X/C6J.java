package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6J {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6J[] A01;
    public static final C6J A02;
    public static final C6J A03;
    public static final C6J A04;

    static {
        C6J c6j = new C6J("CanManualRetry", 0);
        A02 = c6j;
        C6J c6j2 = new C6J("WaitingForAutoRetry", 1);
        A04 = c6j2;
        C6J c6j3 = new C6J("CannotRetry", 2);
        A03 = c6j3;
        C6J[] c6jArr = {c6j, c6j2, c6j3};
        A01 = c6jArr;
        A00 = AbstractC12190kN.A00(c6jArr);
    }

    public static C6J valueOf(String str) {
        return (C6J) Enum.valueOf(C6J.class, str);
    }

    public static C6J[] values() {
        return (C6J[]) A01.clone();
    }

    public C6J(String str, int i) {
    }
}

package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5FD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C5FD[] A01;
    public static final C5FD A02;
    public static final C5FD A03;

    static {
        C5FD c5fd = new C5FD("ALWAYS", 0);
        A02 = c5fd;
        C5FD c5fd2 = new C5FD("AUTO", 1);
        A03 = c5fd2;
        C5FD[] c5fdArr = {c5fd, c5fd2, new C5FD("NEVER", 2)};
        A01 = c5fdArr;
        A00 = AbstractC12190kN.A00(c5fdArr);
    }

    public static C5FD valueOf(String str) {
        return (C5FD) Enum.valueOf(C5FD.class, str);
    }

    public static C5FD[] values() {
        return (C5FD[]) A01.clone();
    }

    public C5FD(String str, int i) {
    }
}

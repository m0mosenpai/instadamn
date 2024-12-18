package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6D {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6D[] A01;
    public static final C6D A02;
    public static final C6D A03;

    static {
        C6D c6d = new C6D("CIRCLE", 0);
        A02 = c6d;
        C6D c6d2 = new C6D("STAR", 1);
        A03 = c6d2;
        C6D[] c6dArr = {c6d, c6d2};
        A01 = c6dArr;
        A00 = AbstractC12190kN.A00(c6dArr);
    }

    public static C6D valueOf(String str) {
        return (C6D) Enum.valueOf(C6D.class, str);
    }

    public static C6D[] values() {
        return (C6D[]) A01.clone();
    }

    public C6D(String str, int i) {
    }
}

package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8DF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DF {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C8DF[] A01;
    public static final C8DF A02;
    public static final C8DF A03;

    static {
        C8DF c8df = new C8DF("SINGLE_COLOR", 0);
        A03 = c8df;
        C8DF c8df2 = new C8DF("LONG_PRESS_GRADIENT", 1);
        A02 = c8df2;
        C8DF[] c8dfArr = {c8df, c8df2};
        A01 = c8dfArr;
        A00 = AbstractC12190kN.A00(c8dfArr);
    }

    public static C8DF valueOf(String str) {
        return (C8DF) Enum.valueOf(C8DF.class, str);
    }

    public static C8DF[] values() {
        return (C8DF[]) A01.clone();
    }

    public C8DF(String str, int i) {
    }
}

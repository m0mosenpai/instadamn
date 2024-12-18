package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.6GD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GD {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6GD[] A01;
    public static final C6GD A02;
    public static final C6GD A03;

    static {
        C6GD c6gd = new C6GD("SMALL", 0);
        A03 = c6gd;
        C6GD c6gd2 = new C6GD("LARGE", 1);
        A02 = c6gd2;
        C6GD[] c6gdArr = {c6gd, c6gd2};
        A01 = c6gdArr;
        A00 = AbstractC12190kN.A00(c6gdArr);
    }

    public static C6GD valueOf(String str) {
        return (C6GD) Enum.valueOf(C6GD.class, str);
    }

    public static C6GD[] values() {
        return (C6GD[]) A01.clone();
    }

    public C6GD(String str, int i) {
    }
}

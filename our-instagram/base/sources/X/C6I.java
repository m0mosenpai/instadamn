package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6I {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6I[] A01;
    public static final C6I A02;
    public static final C6I A03;
    public static final C6I A04;

    static {
        C6I c6i = new C6I("COVER", 0);
        A03 = c6i;
        C6I c6i2 = new C6I("CONTAIN", 1);
        A02 = c6i2;
        C6I c6i3 = new C6I("STRETCH", 2);
        A04 = c6i3;
        C6I[] c6iArr = {c6i, c6i2, c6i3};
        A01 = c6iArr;
        A00 = AbstractC12190kN.A00(c6iArr);
    }

    public static C6I valueOf(String str) {
        return (C6I) Enum.valueOf(C6I.class, str);
    }

    public static C6I[] values() {
        return (C6I[]) A01.clone();
    }

    public C6I(String str, int i) {
    }
}

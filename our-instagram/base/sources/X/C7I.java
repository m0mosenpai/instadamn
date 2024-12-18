package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7I {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7I[] A02;
    public static final C7I A03;
    public final int A00;

    static {
        C7I c7i = new C7I("TYPE_012", 0, 0);
        A03 = c7i;
        C7I[] c7iArr = {c7i, new C7I("TYPE_021", 1, 1)};
        A02 = c7iArr;
        A01 = AbstractC12190kN.A00(c7iArr);
    }

    public static C7I valueOf(String str) {
        return (C7I) Enum.valueOf(C7I.class, str);
    }

    public static C7I[] values() {
        return (C7I[]) A02.clone();
    }

    public C7I(String str, int i, int i2) {
        this.A00 = i2;
    }
}

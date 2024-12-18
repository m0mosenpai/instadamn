package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6A {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6A[] A01;
    public static final C6A A02;
    public static final C6A A03;

    static {
        C6A c6a = new C6A("FOLLOW", 0);
        A02 = c6a;
        C6A c6a2 = new C6A("MESSAGE", 1);
        A03 = c6a2;
        C6A[] c6aArr = {c6a, c6a2};
        A01 = c6aArr;
        A00 = AbstractC12190kN.A00(c6aArr);
    }

    public static C6A valueOf(String str) {
        return (C6A) Enum.valueOf(C6A.class, str);
    }

    public static C6A[] values() {
        return (C6A[]) A01.clone();
    }

    public C6A(String str, int i) {
    }
}

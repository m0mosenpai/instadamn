package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6U {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6U[] A01;
    public static final C6U A02;
    public static final C6U A03;
    public static final C6U A04;

    static {
        C6U c6u = new C6U("COLLAPSED", 0);
        A03 = c6u;
        C6U c6u2 = new C6U("ANIMATING", 1);
        A02 = c6u2;
        C6U c6u3 = new C6U("EXPANDED", 2);
        A04 = c6u3;
        C6U[] c6uArr = {c6u, c6u2, c6u3};
        A01 = c6uArr;
        A00 = AbstractC12190kN.A00(c6uArr);
    }

    public static C6U valueOf(String str) {
        return (C6U) Enum.valueOf(C6U.class, str);
    }

    public static C6U[] values() {
        return (C6U[]) A01.clone();
    }

    public C6U(String str, int i) {
    }
}

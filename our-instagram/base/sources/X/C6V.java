package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C6V {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C6V[] A01;
    public static final C6V A02;
    public static final C6V A03;
    public static final C6V A04;

    static {
        C6V c6v = new C6V("HIDE_PLACES_INTRO", 0);
        A02 = c6v;
        C6V c6v2 = new C6V("HIDE_PLACES_RADIUS", 1);
        A04 = c6v2;
        C6V c6v3 = new C6V("HIDE_PLACES_NAME", 2);
        A03 = c6v3;
        C6V[] c6vArr = {c6v, c6v2, c6v3};
        A01 = c6vArr;
        A00 = AbstractC12190kN.A00(c6vArr);
    }

    public static C6V valueOf(String str) {
        return (C6V) Enum.valueOf(C6V.class, str);
    }

    public static C6V[] values() {
        return (C6V[]) A01.clone();
    }

    public C6V(String str, int i) {
    }
}

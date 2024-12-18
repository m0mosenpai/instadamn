package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C7V {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7V[] A02;
    public static final C7V A03;
    public static final C7V A04;
    public static final C7V A05;
    public static final C7V A06;
    public final String A00;

    static {
        C7V c7v = new C7V("LEFT", 0, "left");
        A05 = c7v;
        C7V c7v2 = new C7V("RIGHT", 1, "right");
        A06 = c7v2;
        C7V c7v3 = new C7V("CENTER", 2, "center");
        A04 = c7v3;
        C7V c7v4 = new C7V("CAMERA_ROLL", 3, "camera_roll");
        A03 = c7v4;
        C7V[] c7vArr = {c7v, c7v2, c7v3, c7v4};
        A02 = c7vArr;
        A01 = AbstractC12190kN.A00(c7vArr);
    }

    public static C7V valueOf(String str) {
        return (C7V) Enum.valueOf(C7V.class, str);
    }

    public static C7V[] values() {
        return (C7V[]) A02.clone();
    }

    public C7V(String str, int i, String str2) {
        this.A00 = str2;
    }
}

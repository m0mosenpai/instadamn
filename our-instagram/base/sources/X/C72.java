package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C72 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C72[] A01;
    public static final C72 A02;
    public static final C72 A03;
    public static final C72 A04;
    public static final C72 A05;
    public static final C72 A06;
    public static final C72 A07;

    static {
        C72 c72 = new C72("UP_CENTER", 0);
        A05 = c72;
        C72 c722 = new C72("UP_RIGHT", 1);
        A07 = c722;
        C72 c723 = new C72("UP_LEFT", 2);
        A06 = c723;
        C72 c724 = new C72("DOWN_CENTER", 3);
        A02 = c724;
        C72 c725 = new C72("DOWN_LEFT", 4);
        A03 = c725;
        C72 c726 = new C72("DOWN_RIGHT", 5);
        A04 = c726;
        C72[] c72Arr = {c72, c722, c723, c724, c725, c726};
        A01 = c72Arr;
        A00 = AbstractC12190kN.A00(c72Arr);
    }

    public static C72 valueOf(String str) {
        return (C72) Enum.valueOf(C72.class, str);
    }

    public static C72[] values() {
        return (C72[]) A01.clone();
    }

    public C72(String str, int i) {
    }
}

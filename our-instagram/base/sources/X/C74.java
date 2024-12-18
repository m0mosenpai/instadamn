package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C74 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C74[] A01;
    public static final C74 A02;
    public static final C74 A03;
    public static final C74 A04;
    public static final C74 A05;
    public static final C74 A06;
    public static final C74 A07;

    static {
        C74 c74 = new C74("BackgroundLoading", 0);
        A02 = c74;
        C74 c742 = new C74("Error", 1);
        A03 = c742;
        C74 c743 = new C74("Loaded", 2);
        A04 = c743;
        C74 c744 = new C74("Loading", 3);
        A05 = c744;
        C74 c745 = new C74("Saving", 4);
        A06 = c745;
        C74 c746 = new C74("Uninitialized", 5);
        A07 = c746;
        C74[] c74Arr = {c74, c742, c743, c744, c745, c746};
        A01 = c74Arr;
        A00 = AbstractC12190kN.A00(c74Arr);
    }

    public static C74 valueOf(String str) {
        return (C74) Enum.valueOf(C74.class, str);
    }

    public static C74[] values() {
        return (C74[]) A01.clone();
    }

    public C74(String str, int i) {
    }
}

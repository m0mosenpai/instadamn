package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C73 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C73[] A01;
    public static final C73 A02;
    public static final C73 A03;
    public static final C73 A04;
    public static final C73 A05;
    public static final C73 A06;
    public static final C73 A07;

    static {
        C73 c73 = new C73("Initial", 0);
        A04 = c73;
        C73 c732 = new C73("Loading", 1);
        A05 = c732;
        C73 c733 = new C73("Regenerate", 2);
        A06 = c733;
        C73 c734 = new C73("Failed", 3);
        A03 = c734;
        C73 c735 = new C73("Success", 4);
        A07 = c735;
        C73 c736 = new C73("EditPrompt", 5);
        A02 = c736;
        C73[] c73Arr = {c73, c732, c733, c734, c735, c736};
        A01 = c73Arr;
        A00 = AbstractC12190kN.A00(c73Arr);
    }

    public static C73 valueOf(String str) {
        return (C73) Enum.valueOf(C73.class, str);
    }

    public static C73[] values() {
        return (C73[]) A01.clone();
    }

    public C73(String str, int i) {
    }
}

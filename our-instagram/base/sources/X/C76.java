package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C76 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C76[] A01;
    public static final C76 A02;
    public static final C76 A03;
    public static final C76 A04;
    public static final C76 A05;
    public static final C76 A06;
    public static final C76 A07;

    static {
        C76 c76 = new C76("None", 0);
        A05 = c76;
        C76 c762 = new C76("Connecting", 1);
        A02 = c762;
        C76 c763 = new C76("Listening", 2);
        A04 = c763;
        C76 c764 = new C76("Responding", 3);
        A06 = c764;
        C76 c765 = new C76("Thinking", 4);
        A07 = c765;
        C76 c766 = new C76("Disconnected", 5);
        A03 = c766;
        C76[] c76Arr = {c76, c762, c763, c764, c765, c766};
        A01 = c76Arr;
        A00 = AbstractC12190kN.A00(c76Arr);
    }

    public static C76 valueOf(String str) {
        return (C76) Enum.valueOf(C76.class, str);
    }

    public static C76[] values() {
        return (C76[]) A01.clone();
    }

    public C76(String str, int i) {
    }
}

package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C67 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C67[] A01;
    public static final C67 A02;
    public static final C67 A03;

    static {
        C67 c67 = new C67("MainFeed", 0);
        A03 = c67;
        C67 c672 = new C67("Clips", 1);
        A02 = c672;
        C67[] c67Arr = {c67, c672};
        A01 = c67Arr;
        A00 = AbstractC12190kN.A00(c67Arr);
    }

    public static C67 valueOf(String str) {
        return (C67) Enum.valueOf(C67.class, str);
    }

    public static C67[] values() {
        return (C67[]) A01.clone();
    }

    public C67(String str, int i) {
    }
}

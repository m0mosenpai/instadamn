package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4P9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4P9 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C4P9[] A02;
    public static final C4P9 A03;
    public static final C4P9 A04;
    public static final C4P9 A05;
    public static final C4P9 A06;
    public final int A00;

    static {
        C4P9 c4p9 = new C4P9("DISCONNECTED", 0, 0);
        A06 = c4p9;
        C4P9 c4p92 = new C4P9("CONNECTING", 1, 1);
        A05 = c4p92;
        C4P9 c4p93 = new C4P9("CONNECTED", 2, 2);
        A03 = c4p93;
        C4P9 c4p94 = new C4P9("CONNECTED_AND_ACK", 3, 3);
        A04 = c4p94;
        C4P9[] c4p9Arr = {c4p9, c4p92, c4p93, c4p94};
        A02 = c4p9Arr;
        A01 = AbstractC12190kN.A00(c4p9Arr);
    }

    public static C4P9 valueOf(String str) {
        return (C4P9) Enum.valueOf(C4P9.class, str);
    }

    public static C4P9[] values() {
        return (C4P9[]) A02.clone();
    }

    public C4P9(String str, int i, int i2) {
        this.A00 = i2;
    }
}

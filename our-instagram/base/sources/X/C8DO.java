package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8DO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DO {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C8DO[] A02;
    public static final C8DO A03;
    public static final C8DO A04;
    public static final C8DO A05;
    public static final C8DO A06;
    public final String A00;

    static {
        C8DO c8do = new C8DO("ONE_VIEW", 0, "once");
        A06 = c8do;
        C8DO c8do2 = new C8DO("ALLOW_REPLAY", 1, "replayable");
        A03 = c8do2;
        C8DO c8do3 = new C8DO("KEEP_IN_CHAT", 2, "permanent");
        A05 = c8do3;
        C8DO c8do4 = new C8DO("DISAPPEARING", 3, "replayable");
        A04 = c8do4;
        C8DO[] c8doArr = {c8do, c8do2, c8do3, c8do4, new C8DO("PERMANENT", 4, "permanent")};
        A02 = c8doArr;
        A01 = AbstractC12190kN.A00(c8doArr);
    }

    public static C8DO valueOf(String str) {
        return (C8DO) Enum.valueOf(C8DO.class, str);
    }

    public static C8DO[] values() {
        return (C8DO[]) A02.clone();
    }

    public C8DO(String str, int i, String str2) {
        this.A00 = str2;
    }
}

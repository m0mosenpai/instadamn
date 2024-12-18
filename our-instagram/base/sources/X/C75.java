package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class C75 {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C75[] A01;
    public static final C75 A02;
    public static final C75 A03;
    public static final C75 A04;
    public static final C75 A05;
    public static final C75 A06;
    public static final C75 A07;

    static {
        C75 c75 = new C75("ADD_SCHOOL", 0);
        A02 = c75;
        C75 c752 = new C75("SWITCH_SCHOOL", 1);
        A07 = c752;
        C75 c753 = new C75("STUDENT_EMAIL", 2);
        A06 = c753;
        C75 c754 = new C75("SCHOOL_SELECTION", 3);
        A05 = c754;
        C75 c755 = new C75("GRADUATION_DATE", 4);
        A04 = c755;
        C75 c756 = new C75("CONFIRM_SCHOOL", 5);
        A03 = c756;
        C75[] c75Arr = {c75, c752, c753, c754, c755, c756};
        A01 = c75Arr;
        A00 = AbstractC12190kN.A00(c75Arr);
    }

    public static C75 valueOf(String str) {
        return (C75) Enum.valueOf(C75.class, str);
    }

    public static C75[] values() {
        return (C75[]) A01.clone();
    }

    public C75(String str, int i) {
    }
}

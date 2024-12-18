package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.27x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC456327x {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC456327x[] A02;
    public static final EnumC456327x A03;
    public static final EnumC456327x A04;
    public static final EnumC456327x A05;
    public static final EnumC456327x A06;
    public static final EnumC456327x A07;
    public static final EnumC456327x A08;
    public static final EnumC456327x A09;
    public static final EnumC456327x A0A;
    public static final EnumC456327x A0B;
    public final String A00;

    static {
        EnumC456327x enumC456327x = new EnumC456327x("DAILY_LIMIT", 0, "daily_limit");
        A03 = enumC456327x;
        EnumC456327x enumC456327x2 = new EnumC456327x("DAILY_LIMIT_NEAR_REMINDER", 1, "daily_limit_near_reminder");
        A04 = enumC456327x2;
        EnumC456327x enumC456327x3 = new EnumC456327x("TAKE_A_BREAK", 2, "take_break");
        A0B = enumC456327x3;
        EnumC456327x enumC456327x4 = new EnumC456327x("GUARDIAN_DAILY_LIMIT_NEAR", 3, "guardian_daily_limit_near");
        A05 = enumC456327x4;
        EnumC456327x enumC456327x5 = new EnumC456327x("SCHEDULED_BREAK_NEAR", 4, "scheduled_break_near");
        A0A = enumC456327x5;
        EnumC456327x enumC456327x6 = new EnumC456327x("SCHEDULED_BREAK", 5, "scheduled_break");
        A09 = enumC456327x6;
        EnumC456327x enumC456327x7 = new EnumC456327x("QUIET_MODE_START", 6, "quiet_mode_start");
        A08 = enumC456327x7;
        EnumC456327x enumC456327x8 = new EnumC456327x("QUIET_MODE_IN_PROGRESS", 7, "quiet_mode_in_progress");
        A06 = enumC456327x8;
        EnumC456327x enumC456327x9 = new EnumC456327x("QUIET_MODE_NEAR", 8, "quiet_mode_near");
        A07 = enumC456327x9;
        EnumC456327x[] enumC456327xArr = {enumC456327x, enumC456327x2, enumC456327x3, enumC456327x4, enumC456327x5, enumC456327x6, enumC456327x7, enumC456327x8, enumC456327x9};
        A02 = enumC456327xArr;
        A01 = AbstractC12190kN.A00(enumC456327xArr);
    }

    public static EnumC456327x valueOf(String str) {
        return (EnumC456327x) Enum.valueOf(EnumC456327x.class, str);
    }

    public static EnumC456327x[] values() {
        return (EnumC456327x[]) A02.clone();
    }

    public EnumC456327x(String str, int i, String str2) {
        this.A00 = str2;
    }
}

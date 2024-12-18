package X;

import java.util.Date;
import java.util.GregorianCalendar;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.EoC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC33317EoC {
    public static final EnumC33317EoC A03;
    public static final EnumC33317EoC A04;
    public static final EnumC33317EoC A05;
    public final Date A00;
    public final Date A01;
    public final String[] A02;

    static {
        new EnumC33317EoC("PLACE_HOLDER_EXPERIMENT", A00(2021, 8, 17), A00(2021, 8, 27), new String[]{"control", "test"}, 0);
        new EnumC33317EoC("TEST_EXPERIMENT", A00(2021, 8, 17), A00(2021, 11, 27), new String[]{"control", "test", "test2"}, 1);
        new EnumC33317EoC("INTERNAL_SETTING_EXPERIMENT", A00(2020, 8, 17), A00(2050, 11, 27), new String[]{"control", "test1", "test2", "test3", "test4", "test5", "test6", "test7", "test8", "test9"}, 2);
        A03 = new EnumC33317EoC("AA_TEST_EXPERIMENT", A00(2021, 9, 12), A00(2021, 11, 1), new String[]{"control", "test", "test2"}, 3);
        A05 = new EnumC33317EoC("NDX_FDID_HOLDOUT", A00(2022, 1, 7), A00(2022, 5, 1), new String[]{"control", "holdout"}, 4);
        new EnumC33317EoC("FB4A_FDID_OE_INTEGRATION_TEST_FDID", A00(2022, 1, 14), A00(2022, 3, 10), new String[]{"control", "backtest"}, 5);
        A04 = new EnumC33317EoC("IG4A_MULTIPLE_AR_FDID_BACKTEST", A00(2022, 1, 16), A00(2022, 3, 10), new String[]{"control", "test"}, 6);
        new EnumC33317EoC("CAA_V1_FULL_TEST_TRIAGE_ANDROID", A00(2022, 8, 12), A00(2024, 1, 28), new String[]{"caa_oe_group_1", "caa_oe_group_2", "caa_oe_group_3", "caa_oe_group_4", "caa_oe_group_5", "caa_oe_group_6", "caa_oe_group_7", "caa_oe_group_8", "caa_oe_group_9", "caa_oe_group_10", "caa_switcher_universe_1", "caa_switcher_universe_2", "caa_switcher_universe_3", "caa_switcher_universe_4", "caa_switcher_universe_5", "caa_switcher_universe_6", "caa_switcher_universe_7"}, 7);
        new EnumC33317EoC("CAA_LOGGED_OUT_PUSH_NOTIF_HOLDOUT", A00(2023, 4, 2), A00(2023, 7, 30), new String[]{"control", "holdout"}, 8);
    }

    public static Date A00(int i, int i2, int i3) {
        return new GregorianCalendar(i, i2, i3).getTime();
    }

    public EnumC33317EoC(String str, Date date, Date date2, String[] strArr, int i) {
        this.A02 = strArr;
        this.A01 = date;
        this.A00 = date2;
    }
}

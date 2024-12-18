package X;

import com.facebook.react.modules.appstate.AppStateModule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.0OP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OP {
    public static final /* synthetic */ C0OP[] A02;
    public static final C0OP A03;
    public static final C0OP A04;
    public static final C0OP A05;
    public static final C0OP A06;
    public static final C0OP A07;
    public static final C0OP A08;
    public static final C0OP A09;
    public static final C0OP A0A;
    public static final C0OP A0B;
    public static final C0OP A0C;
    public static final C0OP A0D;
    public static final C0OP A0E;
    public static final C0OP A0F;
    public static final C0OP A0G;
    public static final C0OP A0H;
    public static final C0OP A0I;
    public static final C0OP A0J;
    public static final C0OP A0K;
    public static final C0OP A0L;
    public static final C0OP A0M;
    public static final C0OP A0N;
    public static final C0OP A0O;
    public static final C0OP A0P;
    public static final C0OP A0Q;
    public static final C0OP A0R;
    public static final C0OP A0S;
    public static final C0OP A0T;
    public static final C0OP A0U;
    public static final C0OP A0V;
    public static final C0OP A0W;
    public static final C0OP A0X;
    public static final C0OP A0Y;
    public static final C0OP A0Z;
    public final String A00;
    public final boolean A01;

    static {
        C0OP c0op = new C0OP("ANR", "anr", 0, false);
        A04 = c0op;
        C0OP c0op2 = new C0OP("ANR_APP_DEATH", "anr_app_death", 1, false);
        A05 = c0op2;
        C0OP c0op3 = new C0OP("ANR_APP_DEATH_EARLY", "anr_app_death_early", 2, false);
        A06 = c0op3;
        C0OP c0op4 = new C0OP("APP_LIFECYCLE", "app_lifecycle", 3, true);
        A07 = c0op4;
        C0OP c0op5 = new C0OP("ATTRIBUTION_ID", "attribution_id", 4, true);
        A08 = c0op5;
        C0OP c0op6 = new C0OP("JAVA", "java", 5, false);
        A0E = c0op6;
        C0OP c0op7 = new C0OP("JAVA_DETECT", "java_detect", 6, true);
        A0I = c0op7;
        C0OP c0op8 = new C0OP("JAVA_APP_DEATH", "java_app_death", 7, false);
        A0G = c0op8;
        C0OP c0op9 = new C0OP("JAVA_APP_DEATH_EARLY", "java_app_death_early", 8, false);
        A0H = c0op9;
        C0OP c0op10 = new C0OP("JAVASCRIPT", "javascript", 9, false);
        A0F = c0op10;
        C0OP c0op11 = new C0OP("NATIVE", "native", 10, false);
        A0N = c0op11;
        C0OP c0op12 = new C0OP("NATIVE_APP_DEATH_EARLY", "native_app_death_early", 11, false);
        A0O = c0op12;
        C0OP c0op13 = new C0OP("HELIUM_RENDERER_CRASH", "helium_renderer_crash", 12, false);
        A0D = c0op13;
        C0OP c0op14 = new C0OP("LIGHT_MOBILE_CONFIG", "light_mobile_config", 13, true);
        A0K = c0op14;
        C0OP c0op15 = new C0OP("MOBILE_CONFIG", "mobile_config", 14, true);
        A0M = c0op15;
        C0OP c0op16 = new C0OP("NAVIGATION", "navigation", 15, true);
        A0P = c0op16;
        C0OP c0op17 = new C0OP("PERIODIC_MEMORY", "periodic_memory", 16, true);
        A0R = c0op17;
        C0OP c0op18 = new C0OP("LATE_STARTUP", "late_startup", 17, true);
        A0J = c0op18;
        C0OP c0op19 = new C0OP("AFTER_STARTUP", "after_startup", 18, true);
        A03 = c0op19;
        C0OP c0op20 = new C0OP("REPORT_SOURCE", "report_source", 19, true);
        A0S = c0op20;
        C0OP c0op21 = new C0OP("SOFT_ERROR", "soft_error", 20, false);
        A0T = c0op21;
        C0OP c0op22 = new C0OP("STARTUP", "startup", 21, true);
        A0U = c0op22;
        C0OP c0op23 = new C0OP("UNEXPLAINED", "unexplained", 22, false);
        A0W = c0op23;
        C0OP c0op24 = new C0OP("UNEXPLAINED_APP_DEATH_EARLY", "unexplained_app_death_early", 23, false);
        A0X = c0op24;
        C0OP c0op25 = new C0OP("TEST_CRASH", "test", 24, false);
        A0V = c0op25;
        C0OP c0op26 = new C0OP("BUG_REPORT", "bug_report", 25, false);
        A0A = c0op26;
        C0OP c0op27 = new C0OP("CUSTOM_DATA", "custom_data", 26, true);
        A0B = c0op27;
        C0OP c0op28 = new C0OP("FOREGROUND_TRANSITION", "foreground_transition", 27, true);
        A0C = c0op28;
        C0OP c0op29 = new C0OP("USER_PERCEPTIBLE_SCOPE", "user_perceptible_scope", 28, true);
        A0Z = c0op29;
        C0OP c0op30 = new C0OP("USER_CHANGE", "user_change", 29, true);
        A0Y = c0op30;
        C0OP c0op31 = new C0OP("PERIODIC_BATTERY", "periodic_battery", 30, true);
        A0Q = c0op31;
        C0OP c0op32 = new C0OP("MEMORY_TRIM", "memory_trim", 31, true);
        A0L = c0op32;
        C0OP c0op33 = new C0OP("BACKGROUND", AppStateModule.APP_STATE_BACKGROUND, 32, true);
        A09 = c0op33;
        C0OP[] c0opArr = new C0OP[33];
        System.arraycopy(new C0OP[]{c0op, c0op2, c0op3, c0op4, c0op5, c0op6, c0op7, c0op8, c0op9, c0op10, c0op11, c0op12, c0op13, c0op14, c0op15, c0op16, c0op17, c0op18, c0op19, c0op20, c0op21, c0op22, c0op23, c0op24, c0op25, c0op26, c0op27}, 0, c0opArr, 0, 27);
        System.arraycopy(new C0OP[]{c0op28, c0op29, c0op30, c0op31, c0op32, c0op33}, 0, c0opArr, 27, 6);
        A02 = c0opArr;
    }

    public static C0OP valueOf(String str) {
        return (C0OP) Enum.valueOf(C0OP.class, str);
    }

    public static C0OP[] values() {
        return (C0OP[]) A02.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public C0OP(String str, String str2, int i, boolean z) {
        this.A00 = str2;
        this.A01 = z;
    }
}

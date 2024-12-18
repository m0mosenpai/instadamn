package X;

import com.instagram.appreciation.analytics.LoggingData;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LLN {
    public final LoggingData A00;
    public final InterfaceC11380iw A01;
    public final C18920wW A02;

    public final void A09(Boolean bool, Boolean bool2, Integer num, String str, Map map) {
        String str2;
        C14360o3.A0B(str, 4);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationcreatorsettings_fail");
        if (A0f.isSampled()) {
            LoggingData loggingData = this.A00;
            JQ1.A0d(A0f, loggingData.A01);
            C0Zx c0Zx = new C0Zx();
            A02(c0Zx, loggingData, bool, "view_name", AbstractC46601Kje.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
                c0Zx.A06("gifts_enabled", str2);
            }
            if (map != null) {
                c0Zx.A08("total_earnings_in_cents", map);
            }
            A0f.AAQ(c0Zx, "event_payload");
            A0f.AAP("error_message", str);
            AbstractC43593JPy.A1K(A0f, AbstractC06930Yk.A0E());
        }
    }

    public static C8T A00(C0Zx c0Zx, Integer num, String str, int i) {
        c0Zx.A06("view_name", str);
        c0Zx.A06("target_name", AbstractC46600Kjd.A00(num));
        if (i != 0) {
            return C8T.ONBOARDED;
        }
        return C8T.NOT_ONBOARDED;
    }

    public static void A01(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, C0Zx c0Zx, String str) {
        c0Zx.A01(interfaceC02530Ab, "onboarding_status");
        c0Zx.A06("media_id", str);
        interfaceC02590Ai.AAQ(c0Zx, "event_payload");
        interfaceC02590Ai.Cht();
    }

    public static final void A03(LLN lln, Integer num, Integer num2, String str, boolean z, boolean z2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lln.A02, "user_click_appreciationmediasettings_atomic");
        if (A0f.isSampled()) {
            JQ1.A0d(A0f, lln.A00.A01);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A01(A00(c0Zx, num2, AbstractC46601Kje.A00(num), z ? 1 : 0), "onboarding_status");
            if (str != null) {
                c0Zx.A06("media_id", str);
            }
            A0f.AAQ(c0Zx, "event_payload");
            AbstractC43593JPy.A1K(A0f, AbstractC167007dF.A0n("is_sticky", String.valueOf(z2)));
        }
    }

    public static final void A04(LLN lln, Integer num, String str, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lln.A02, "client_load_appreciationmediasettings_fail");
        if (A0f.isSampled()) {
            JQ1.A0d(A0f, lln.A00.A01);
            C0Zx c0Zx = new C0Zx();
            A01(A00(c0Zx, num, "reels_overflow_menu", z ? 1 : 0), A0f, c0Zx, str);
        }
    }

    public static final void A05(LLN lln, Integer num, String str, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lln.A02, "client_load_appreciationmediasettings_init");
        if (A0f.isSampled()) {
            JQ1.A0d(A0f, lln.A00.A01);
            C0Zx c0Zx = new C0Zx();
            A01(A00(c0Zx, num, "reels_overflow_menu", z ? 1 : 0), A0f, c0Zx, str);
        }
    }

    public static final void A06(LLN lln, Integer num, String str, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(lln.A02, "client_load_appreciationmediasettings_success");
        if (A0f.isSampled()) {
            JQ1.A0d(A0f, lln.A00.A01);
            C0Zx c0Zx = new C0Zx();
            A01(A00(c0Zx, num, "reels_overflow_menu", z ? 1 : 0), A0f, c0Zx, str);
        }
    }

    public final void A07(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, Map map, Map map2, Map map3) {
        C8T c8t;
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "user_click_appreciationcreatorsettings_atomic");
        if (A0f.isSampled()) {
            LoggingData loggingData = this.A00;
            JQ1.A0d(A0f, loggingData.A01);
            C0Zx c0Zx = new C0Zx();
            AbstractC43592JPx.A1N(c0Zx, AbstractC46601Kje.A00(num));
            A02(c0Zx, loggingData, bool, "target_name", AbstractC46600Kjd.A00(num2));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                c0Zx.A06("gifts_enabled", str);
            }
            if (map != null) {
                c0Zx.A08("total_earnings_in_cents", map);
            }
            if (map2 != null) {
                c0Zx.A08("reel_earnings_in_cents", map2);
            }
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    c8t = C8T.ONBOARDED;
                } else {
                    c8t = C8T.NOT_ONBOARDED;
                }
                c0Zx.A01(c8t, "onboarding_status");
            }
            if (bool4 != null) {
                c0Zx.A03("is_default_on", Boolean.valueOf(bool4.booleanValue()));
            }
            A0f.AAQ(c0Zx, "event_payload");
            AbstractC43593JPy.A1K(A0f, map3);
        }
    }

    public final void A08(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Map map) {
        C8T c8t;
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationcreatorsettings_init");
        if (A0f.isSampled()) {
            LoggingData loggingData = this.A00;
            JQ1.A0d(A0f, loggingData.A01);
            C0Zx c0Zx = new C0Zx();
            A02(c0Zx, loggingData, bool, "view_name", AbstractC46601Kje.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                c0Zx.A06("gifts_enabled", str);
            }
            if (map != null) {
                c0Zx.A08("total_earnings_in_cents", map);
            }
            if (bool3 != null) {
                if (bool3.booleanValue()) {
                    c8t = C8T.ONBOARDED;
                } else {
                    c8t = C8T.NOT_ONBOARDED;
                }
                c0Zx.A01(c8t, "onboarding_status");
            }
            if (bool4 != null) {
                c0Zx.A03("is_default_on", Boolean.valueOf(bool4.booleanValue()));
            }
            A0f.AAQ(c0Zx, "event_payload");
            AbstractC43593JPy.A1K(A0f, AbstractC06930Yk.A0E());
        }
    }

    public final void A0A(Boolean bool, Boolean bool2, Integer num, Map map) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationcreatorsettings_display");
        if (A0f.isSampled()) {
            LoggingData loggingData = this.A00;
            JQ1.A0d(A0f, loggingData.A01);
            C0Zx c0Zx = new C0Zx();
            A02(c0Zx, loggingData, bool, "view_name", AbstractC46601Kje.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                c0Zx.A06("gifts_enabled", str);
            }
            if (map != null) {
                c0Zx.A08("total_earnings_in_cents", map);
            }
            A0f.AAQ(c0Zx, "event_payload");
            AbstractC43593JPy.A1K(A0f, AbstractC06930Yk.A0E());
        }
    }

    public final void A0B(Boolean bool, Boolean bool2, Integer num, Map map) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "user_click_appreciationcreatorsettings_exit");
        if (A0f.isSampled()) {
            LoggingData loggingData = this.A00;
            JQ1.A0d(A0f, loggingData.A01);
            C0Zx c0Zx = new C0Zx();
            AbstractC43592JPx.A1N(c0Zx, AbstractC46601Kje.A00(num));
            A02(c0Zx, loggingData, bool, "target_name", "exit");
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                c0Zx.A06("gifts_enabled", str);
            }
            if (map != null) {
                c0Zx.A08("total_earnings_in_cents", map);
            }
            A0f.AAQ(c0Zx, "event_payload");
            AbstractC43593JPy.A1K(A0f, AbstractC06930Yk.A0E());
        }
    }

    public final void A0C(Boolean bool, Boolean bool2, Integer num, Map map, Map map2) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A02, "client_load_appreciationcreatorsettings_success");
        if (A0f.isSampled()) {
            LoggingData loggingData = this.A00;
            JQ1.A0d(A0f, loggingData.A01);
            C0Zx c0Zx = new C0Zx();
            A02(c0Zx, loggingData, bool, "view_name", AbstractC46601Kje.A00(num));
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    str = "on";
                } else {
                    str = "off";
                }
                c0Zx.A06("gifts_enabled", str);
            }
            if (map != null) {
                c0Zx.A08("total_earnings_in_cents", map);
            }
            A0f.AAQ(c0Zx, "event_payload");
            AbstractC43593JPy.A1K(A0f, map2);
        }
    }

    public LLN(LoggingData loggingData, InterfaceC11380iw interfaceC11380iw, C18920wW c18920wW) {
        AbstractC37302Gc3.A1U(loggingData, c18920wW);
        this.A01 = interfaceC11380iw;
        this.A00 = loggingData;
        this.A02 = c18920wW;
    }

    public static void A02(C0Zx c0Zx, LoggingData loggingData, Boolean bool, String str, String str2) {
        c0Zx.A06(str, str2);
        c0Zx.A06(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, loggingData.A00);
        if (bool != null) {
            c0Zx.A03("is_content_appreciation_eligible", Boolean.valueOf(bool.booleanValue()));
        }
    }
}

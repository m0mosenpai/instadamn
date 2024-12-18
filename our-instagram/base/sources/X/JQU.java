package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

/* loaded from: classes8.dex */
public final class JQU {
    public static final JQU A01 = new JQU();
    public final C18920wW A00;

    public final boolean A0B(JQO jqo) {
        if (!JQV.A00().booleanValue()) {
            return false;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_notification_received");
        if (!A0f.isSampled()) {
            return false;
        }
        JQ0.A17(A0f, jqo, "push_type", A03(A0f, jqo));
        JQ0.A16(A0f, jqo);
        C0Zx c0Zx = new C0Zx();
        long j = jqo.A00;
        c0Zx.A05("badge_count", Long.valueOf(j));
        A0f.AAQ(c0Zx, "direct_badge_context");
        C0Zx c0Zx2 = new C0Zx();
        long j2 = jqo.A01;
        c0Zx2.A05("badge_count", Long.valueOf(j2));
        A0f.AAQ(c0Zx2, "af_badge_context");
        A0f.A9K("total_badge_count", Long.valueOf(j + j2));
        A0f.Cht();
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.Jta] */
    public static final C44860Jta A00(JQO jqo) {
        long j;
        Long A0j;
        ?? c0Zx = new C0Zx();
        c0Zx.A05("occamadillo_thread_id", Long.valueOf(jqo.A02));
        String str = jqo.A0B;
        if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        c0Zx.A05("armadillo_thread_id", Long.valueOf(j));
        c0Zx.A06("open_thread_id", jqo.A0H);
        c0Zx.A07("feature_tags", jqo.A0N);
        c0Zx.A03("is_bg_account", Boolean.valueOf(jqo.A0P));
        c0Zx.A05("mitrace_id", jqo.A09);
        c0Zx.A06("otid", jqo.A0I);
        return c0Zx;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0Zx, X.Jtc] */
    public static final C44862Jtc A01(JQO jqo) {
        String str;
        ?? c0Zx = new C0Zx();
        c0Zx.A01(EnumC37319GcL.PUSH, "notification_channel");
        c0Zx.A05("recipient_ig_id", Long.valueOf(jqo.A03));
        c0Zx.A06("ndid", jqo.A0F);
        c0Zx.A06("notification_type", jqo.A0G);
        c0Zx.A06("trace_id", jqo.A0M);
        Long l = jqo.A0A;
        if (l != null) {
            c0Zx.A05("sender_ig_id", l);
        }
        String str2 = jqo.A0K;
        int i = 0;
        if ((str2 == null || str2.length() == 0) && !"direct_v2_delete_item".equals(jqo.A0D)) {
            i = Integer.MIN_VALUE;
        }
        if (i != Integer.MIN_VALUE) {
            c0Zx.A00.put("notification_objective", Integer.valueOf(i));
        } else {
            c0Zx.A06("notification_objective", null);
        }
        char c = 0;
        if ((str2 == null || str2.length() == 0) && !"direct_v2_delete_item".equals(jqo.A0D)) {
            c = 0;
        }
        int i2 = 1;
        if (c != 0 && (((str = jqo.A0C) == null || !AbstractC001900j.A0a(str, "silent_", false)) && jqo.A0O)) {
            i2 = 0;
        }
        c0Zx.A00.put("notification_behavior", Integer.valueOf(i2));
        return c0Zx;
    }

    public static final String A02() {
        int ordinal = C1CC.A09.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return null;
                }
                return "hot";
            }
            return "luke_warm";
        }
        return "cold";
    }

    public static final String A04(JQO jqo) {
        if (AbstractC002300n.A0h(jqo.A0C, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, false)) {
            if (jqo.A0Q) {
                return "direct_private";
            }
            return "direct_open";
        }
        return "instagram";
    }

    public static final String A05(JQO jqo) {
        switch (jqo.A06.ordinal()) {
            case 1:
                return "amazon";
            case 2:
            case 4:
            case 8:
            default:
                return "unknown";
            case 3:
                return "fbns";
            case 5:
                return "fcm";
            case 6:
                return "msys";
            case 7:
                return "local";
            case 9:
                return BaseJavaModule.METHOD_TYPE_SYNC;
            case 10:
                return "mem";
            case 11:
                return "iris";
        }
    }

    public static final String A06(JQO jqo) {
        int intValue = jqo.A07.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return null;
            }
            return "custom_in_app";
        }
        return "system";
    }

    public static final List A07(JQO jqo) {
        Long A0j = AbstractC25231BEo.A0j(0, jqo.A0L);
        if (A0j != null) {
            return AbstractC166987dD.A1J(A0j);
        }
        return C16930sl.A00;
    }

    public JQU() {
        C12210kP c12210kP = new C12210kP(AbstractC12960li.A00);
        c12210kP.A00 = AbstractC31171DnF.A0D("ig_push_notifications");
        this.A00 = c12210kP.A00();
    }

    public static String A03(InterfaceC02590Ai interfaceC02590Ai, JQO jqo) {
        interfaceC02590Ai.AAQ(A01(jqo), "notif_logging_data");
        interfaceC02590Ai.AAP("landing_path", jqo.A0E);
        return A05(jqo);
    }

    public final void A08(JQO jqo, String str) {
        if (JQV.A00().booleanValue()) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_notification_suppressed");
            if (A0f.isSampled()) {
                A0f.AAP("push_type", A03(A0f, jqo));
                JQ0.A17(A0f, jqo, "reason", str);
                A0f.AAP("platform", A04(jqo));
                A0f.AAQ(A00(jqo), "messaging_data");
                A0f.AAk("push_token_fbid", A07(jqo));
                A0f.AAk("push_token_fbid", A07(jqo));
                A0f.AAP("push_infra_notif_id", jqo.A0J);
                A0f.Cht();
            }
        }
    }

    public final void A09(JQO jqo, List list) {
        if (JQV.A00().booleanValue()) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_notification_clicked");
            if (A0f.isSampled()) {
                C44875Jtp A00 = AbstractC47146Ksf.A00.A00(list);
                JQ0.A17(A0f, jqo, "push_type", A03(A0f, jqo));
                A0f.A9K("time_in_push_tray_seconds", Long.valueOf(jqo.A04));
                JQ0.A16(A0f, jqo);
                A0f.AAQ(A00, "push_tray_state");
                A0f.Cht();
            }
        }
    }

    public final void A0A(JQO jqo, List list) {
        if (JQV.A00().booleanValue()) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "ig_notification_will_display");
            if (A0f.isSampled()) {
                C44875Jtp A00 = AbstractC47146Ksf.A00.A00(list);
                JQ0.A17(A0f, jqo, "push_type", A03(A0f, jqo));
                JQ0.A16(A0f, jqo);
                A0f.AAQ(A00, "push_tray_state");
                A0f.Cht();
            }
        }
    }
}

package X;

import com.facebook.forker.Process;

/* renamed from: X.Ntg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53969Ntg {
    public static final String A00(C7T3 c7t3) {
        switch (c7t3.ordinal()) {
            case 2:
                return "direct_missed_call_notification_action";
            case 7:
                return "direct_vc_icon";
            case 8:
                return "direct_ac_icon";
            case 9:
                return "direct_inbox_recipients_picker";
            case 10:
                return "direct_inbox_accessory_icon";
            case 11:
                return "direct_inbox_call_back_button";
            case Process.SIGTERM /* 15 */:
                return "direct_action_log";
            case Process.SIGSTOP /* 19 */:
                return "direct_thread_xma";
            default:
                return c7t3.A00;
        }
    }
}

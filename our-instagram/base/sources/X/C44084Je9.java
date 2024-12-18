package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.Je9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44084Je9 {
    public static final C44084Je9 A02 = new Object();
    public static final UQE A03 = new UQE("notification_received", "0", 6);
    public static final UQE A00 = new UQE("notification_rendering", "15", 6);
    public static final UserFlowLogger A01 = new UserFlowLoggerImpl(C006802i.A0p);

    public static final boolean A00(C116155Nu c116155Nu) {
        String str;
        String str2;
        String str3;
        if (C1AD.A06(C06090Tz.A05, 18307989588945110L) && (str = c116155Nu.A0x) != null && str.length() != 0 && (str2 = c116155Nu.A0g) != null && !c116155Nu.A05() && !AbstractC001900j.A0a(str2, "ig_advanced_crypto_transport", false) && (((str3 = c116155Nu.A0g) == null || !AbstractC001900j.A0a(str3, "is_vanish_mode", false)) && !c116155Nu.A1S)) {
            return true;
        }
        return false;
    }

    public final void A01(C116155Nu c116155Nu, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        if (A00(c116155Nu)) {
            UserFlowLogger userFlowLogger = A01;
            long generateFlowId = userFlowLogger.generateFlowId(550451290, str.hashCode());
            UserFlowConfig userFlowConfig = new UserFlowConfig("notification_open_message", false);
            userFlowConfig.mTtlMs = 30000L;
            userFlowLogger.flowStartIfNotOngoing(generateFlowId, userFlowConfig);
            UQE uqe = A03;
            userFlowLogger.flowMarkPoint(generateFlowId, uqe.A01);
            userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "mtrid", c116155Nu.A0x);
            String str4 = c116155Nu.A1G;
            if (str4 == null) {
                str4 = c116155Nu.A1F;
            }
            userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "open_thread_id", str4);
            userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "c", uqe.A00);
            if (z3) {
                userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "feature_tags", "23");
            }
            userFlowLogger.flowAnnotate(generateFlowId, "push_source", str3);
            if (str2 != null) {
                userFlowLogger.flowAnnotate(generateFlowId, "push_infra_notif_id", str2);
            }
            userFlowLogger.flowAnnotate(generateFlowId, "is_bg_account", !z);
            userFlowLogger.flowAnnotate(generateFlowId, AbstractC111324zv.A00(5090), i);
            userFlowLogger.flowAnnotate(generateFlowId, AbstractC58317Pt9.A00(43), z2);
            userFlowLogger.flowAnnotate(generateFlowId, "notification_id", str);
        }
    }
}

package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class JQZ implements MRU {
    public static final JQZ A01 = new Object();
    public static final UserFlowLogger A00 = JQY.A00;

    @Override // X.MRU
    public final void DW4(long j, int i, String str) {
        UserFlowLogger userFlowLogger = A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            A00(j, -1, str);
            userFlowLogger.flowEndCancel(j, CancelReason.SYSTEM_CANCELLED);
        }
    }

    @Override // X.MRU
    public final void DW5(long j, Integer num) {
        C14360o3.A0B(num, 1);
        if (A00.isOngoingFlow(j)) {
            A01(num, "DISPLAYED", j);
        }
    }

    @Override // X.MRU
    public final void DW7(long j, int i, String str) {
        C14360o3.A0B(str, 2);
        UserFlowLogger userFlowLogger = A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            A00(j, i, str);
            userFlowLogger.flowEndFail(j, String.valueOf(i), str);
        }
    }

    @Override // X.MRU
    public final void DW9(long j, Integer num) {
        C14360o3.A0B(num, 1);
        if (A00.isOngoingFlow(j)) {
            A01(num, "REVOKED", j);
        }
    }

    @Override // X.MRU
    public final Integer DWA(Integer num, String str, int i, long j) {
        C14360o3.A0B(str, 3);
        if (A00.isOngoingFlow(j)) {
            A00(j, i, str);
            A01(num, "SUPPRESSED", j);
            return C05F.A00;
        }
        if (j == 0) {
            return C05F.A0C;
        }
        return C05F.A0N;
    }

    @Override // X.MRU
    public final void DWB(long j, Integer num) {
        C14360o3.A0B(num, 1);
        if (A00.isOngoingFlow(j)) {
            A01(num, "UPDATED", j);
        }
    }

    @Override // X.MRU
    public final MRU EWa(long j, boolean z) {
        A00.flowAnnotate(j, "is_engine", true);
        return this;
    }

    @Override // X.MRU
    public final MRU EZj(String str, long j) {
        C14360o3.A0B(str, 1);
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotate(j, "notification_type", str);
        userFlowLogger.flowAnnotateWithCrucialData(j, "nt", str);
        return this;
    }

    @Override // X.MRU
    public final MRU EcB(String str, long j) {
        C14360o3.A0B(str, 1);
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotateWithCrucialData(j, "rcpid", str);
        InterfaceC09390do interfaceC09390do = C09Z.A00;
        if (interfaceC09390do != null && interfaceC09390do.CWa()) {
            userFlowLogger.flowAnnotate(j, "is_fg_account", C09Y.A00().A05(str));
        }
        return this;
    }

    @Override // X.MRU
    public final long Enf(Integer num) {
        String str;
        String str2;
        C14360o3.A0B(num, 0);
        UserFlowLogger userFlowLogger = A00;
        long generateFlowId = userFlowLogger.generateFlowId(89141344, C0HM.A00().hashCode());
        long millis = TimeUnit.SECONDS.toMillis(60L);
        UserFlowConfig userFlowConfig = new UserFlowConfig("ig_notification_journey", false);
        userFlowConfig.mTtlMs = millis;
        userFlowLogger.flowStart(generateFlowId, userFlowConfig);
        switch (num.intValue()) {
            case 0:
                str = "FBNS";
                break;
            case 1:
                str = "FCM";
                break;
            case 2:
                str = "ADM";
                break;
            case 3:
                str = "IRIS";
                break;
            default:
                str = "MEM";
                break;
        }
        userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "dc", str);
        userFlowLogger.flowAnnotate(generateFlowId, "app_startup_type", C1CC.A09.toString());
        if (C218914p.A08()) {
            C1KX c1kx = C226218q.A01(AbstractC12960li.A00).A04;
            if (c1kx != null && c1kx.A0O == C1CA.A03 && !c1kx.A0E) {
                str2 = "BACKGROUND_STARTED";
            } else {
                str2 = "BACKGROUNDED";
            }
        } else {
            str2 = "FOREGROUNDED";
        }
        userFlowLogger.flowAnnotate(generateFlowId, "app_state", str2);
        return generateFlowId;
    }

    public static final void A00(long j, int i, String str) {
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotate(j, "reason_code", i);
        userFlowLogger.flowAnnotate(j, "reason_for_debug", str);
    }

    private final void A01(Integer num, String str, long j) {
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotate(j, "render_target", AbstractC44092JeH.A00(num));
        userFlowLogger.flowAnnotate(j, "outcome", str);
        userFlowLogger.flowEndSuccess(j);
    }

    @Override // X.MRU
    public final boolean CZf(long j) {
        return A00.isOngoingFlow(j);
    }

    @Override // X.MRU
    public final Integer Cn5(String str, long j) {
        UserFlowLogger userFlowLogger = A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            userFlowLogger.flowMarkPoint(j, str);
            return C05F.A00;
        }
        if (j == 0) {
            return C05F.A0C;
        }
        return C05F.A0N;
    }

    @Override // X.MRU
    public final void DW6(long j) {
        UserFlowLogger userFlowLogger = A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            userFlowLogger.flowAnnotate(j, "outcome", "DROPPED");
            userFlowLogger.flowEndSuccess(j);
        }
    }

    @Override // X.MRU
    public final MRU EPq(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "atrid", str);
        return this;
    }

    @Override // X.MRU
    public final MRU ES0(String str, long j) {
        A00.flowAnnotate(j, "consistent_thread_fbid", str);
        return this;
    }

    @Override // X.MRU
    public final MRU EWP(long j, boolean z) {
        A00.flowAnnotate(j, "is_e2ee", z);
        return this;
    }

    @Override // X.MRU
    public final MRU EWo(String str, long j) {
        A00.flowAnnotate(j, "initiated_from", str);
        return this;
    }

    @Override // X.MRU
    public final MRU EZ7(long j, long j2) {
        A00.flowAnnotate(j, "message_timestamp_ms", j2);
        return this;
    }

    @Override // X.MRU
    public final MRU EZ8(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "mtrid", str);
        return this;
    }

    @Override // X.MRU
    public final MRU Ea4(long j, boolean z) {
        A00.flowAnnotate(j, "only_alert_once", z);
        return this;
    }

    @Override // X.MRU
    public final MRU EaJ(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "otid", str);
        return this;
    }

    @Override // X.MRU
    public final MRU Ebw(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "pinid", str);
        return this;
    }

    @Override // X.MRU
    public final MRU Ebx(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "pnid", str);
        return this;
    }

    @Override // X.MRU
    public final MRU Edf(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "sid", str);
        return this;
    }

    @Override // X.MRU
    public final MRU Efl(String str, long j) {
        A00.flowAnnotate(j, "thread_subtype", str);
        return this;
    }

    @Override // X.MRU
    public final MRU Efm(long j, boolean z) {
        Integer num;
        int i;
        UserFlowLogger userFlowLogger = A00;
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        if (num.intValue() != 0) {
            i = 2;
        } else {
            i = 1;
        }
        userFlowLogger.flowAnnotate(j, "thread_type", i);
        return this;
    }
}

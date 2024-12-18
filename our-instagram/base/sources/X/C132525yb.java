package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5yb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132525yb {
    public int A00;
    public String A01;
    public InterfaceC16660sJ A02;
    public boolean A03;
    public final long A04;
    public final UserFlowLogger A05;
    public final boolean A06;
    public final UserSession A07;
    public static final C9C9 A0A = new C9C9("message_saved", "12", 9);
    public static final C9C9 A0P = new C9C9("notification_rendering", "15", 9);
    public static final C9C9 A0M = new C9C9("notification_synced", "14", 9);
    public static final C9C9 A0L = new C9C9("notification_received", "0", 9);
    public static final C9C9 A0H = new C9C9("badging", "17", 9);
    public static final C9C9 A08 = new C9C9("message_delta_received_app_layer", "100", 9);
    public static final C9C9 A09 = new C9C9(CancelReason.MESSAGE_DROPPED, "101", 9);
    public static final C9C9 A0O = new C9C9("server_thread_fetch", "102", 9);
    public static final C9C9 A0J = new C9C9("handle_armadillo_push_operation", "103", 9);
    public static final C9C9 A0I = new C9C9("handle_push_notification_with_configs", "104", 9);
    public static final C9C9 A0K = new C9C9("notification_operation_execution_scheduled", "105", 9);
    public static final C9C9 A0E = new C9C9("mi_notification_skip", "106", 9);
    public static final C9C9 A0C = new C9C9("mi_notification_enqueue", "107", 9);
    public static final C9C9 A0B = new C9C9("mi_notification_dequeue", "108", 9);
    public static final C9C9 A0G = new C9C9("mi_notification_sync_start", "109", 9);
    public static final C9C9 A0D = new C9C9("mi_notification_remove_queue", "110", 9);
    public static final C9C9 A0F = new C9C9("mi_notification_sync_end", "111", 9);
    public static final C9C9 A0N = new C9C9("offline_sync_retry", "112", 9);

    public C132525yb(UserSession userSession) {
        long j;
        C14360o3.A0B(userSession, 1);
        this.A07 = userSession;
        this.A00 = -1;
        this.A02 = C132535yc.A00;
        this.A06 = C18U.A06(C06090Tz.A05, userSession, 36319424570989992L);
        if (!UserFlowJNIProvider.isInitialized()) {
            UserFlowJNIProvider.setUserFlowLogger(new UserFlowLoggerImpl(C006802i.A0p));
        }
        UserFlowLogger userFlowLogger = UserFlowJNIProvider.mUserFlowLogger;
        if (userFlowLogger != null) {
            this.A05 = userFlowLogger;
            User A00 = C08730cb.A00(userSession).A00();
            int i = 0;
            if (A00.BTC() != null) {
                Long BTC = A00.BTC();
                if (BTC != null) {
                    j = BTC.longValue();
                } else {
                    j = 0;
                }
                i = (int) j;
            } else {
                C0K8.A0C("SecureMessageOverWAIGNotificationsE2ENotificationLevelLogger", "EIMU not available");
            }
            this.A04 = userFlowLogger.generateFlowId(98893825, i);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00(InterfaceC16660sJ interfaceC16660sJ) {
        long millis = TimeUnit.SECONDS.toMillis(C18U.A01(C06090Tz.A05, this.A07, 36600899547828298L));
        UserFlowLogger userFlowLogger = this.A05;
        long j = this.A04;
        UserFlowConfig userFlowConfig = new UserFlowConfig("notification_e2e_notification_level", false);
        userFlowConfig.mTtlMs = millis;
        this.A00 = userFlowLogger.flowStartIfNotOngoing(j, userFlowConfig) ? 0 : this.A00 + 1;
        this.A02 = interfaceC16660sJ;
        if (!this.A03) {
            this.A03 = true;
            new Handler(Looper.getMainLooper()).postDelayed(new M2A(this), millis);
        }
    }

    public final void A01(boolean z, String str) {
        if (this.A03) {
            UserFlowLogger userFlowLogger = this.A05;
            long j = this.A04;
            C9C9 c9c9 = A0P;
            userFlowLogger.flowMarkPoint(j, c9c9.A01);
            if (this.A00 == 0 && !z) {
                userFlowLogger.flowAnnotate(j, "suppress_in_app_layer", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                if (str != null) {
                    userFlowLogger.flowAnnotate(j, "suppress_reason", str);
                }
            }
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
        }
    }
}

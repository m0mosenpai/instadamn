package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.5yd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132545yd {
    public UserFlowLogger A00;
    public final boolean A01;
    public final boolean A02;
    public static final C9C9 A05 = new C9C9("message_saved", "12", 9);
    public static final C9C9 A06 = new C9C9("notification_rendering", "15", 9);
    public static final C9C9 A07 = new C9C9("notification_synced", "14", 9);
    public static final C9C9 A03 = new C9C9("message_delta_received_app_layer", "100", 9);
    public static final C9C9 A04 = new C9C9(CancelReason.MESSAGE_DROPPED, "101", 9);
    public static final C9C9 A08 = new C9C9("server_thread_fetch", "102", 9);

    public C132545yd(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A01 = C18U.A06(c06090Tz, userSession, 36319428865957290L);
        this.A02 = C18U.A06(c06090Tz, userSession, 36319428866088364L);
        if (!UserFlowJNIProvider.isInitialized()) {
            UserFlowJNIProvider.setUserFlowLogger(new UserFlowLoggerImpl(C006802i.A0p));
        }
        UserFlowLogger userFlowLogger = UserFlowJNIProvider.mUserFlowLogger;
        if (userFlowLogger != null) {
            this.A00 = userFlowLogger;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final Long A00(C132545yd c132545yd, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (c132545yd.A00.isOngoingFlow(parseLong)) {
                return Long.valueOf(parseLong);
            }
            return null;
        } catch (NumberFormatException e) {
            e.getMessage();
            return null;
        }
    }
}

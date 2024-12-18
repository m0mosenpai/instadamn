package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLoggingController;
import java.util.HashMap;

/* renamed from: X.7Sp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163307Sp {
    public static final /* synthetic */ C163307Sp A07 = new Object();
    public static final C47282Ev A06 = new C47282Ev(936447229, "MSYS_TRACE_MESSAGE_SEND_TO_SENT");
    public static final C47282Ev A05 = new C47282Ev(20126011, "IG_DIRECT_MESSAGE_TEXT_SEND_TO_SENT");
    public static final C47282Ev A03 = new C47282Ev(20130765, "IG_DIRECT_OPEN_MESSAGE_MEDIA_SEND_TO_SENT");
    public static final C47282Ev A00 = new C47282Ev(20132240, "IG_DIRECT_E2EE_MESSAGE_MEDIA_SEND_TO_SENT");
    public static final C47282Ev A02 = new C47282Ev(20125233, "MESSAGE_TEXT_RELIABILITY");
    public static final C47282Ev A04 = new C47282Ev(20135754, "IG_DIRECT_OPEN_MESSAGE_MEDIA_RELIABILITY");
    public static final C47282Ev A01 = new C47282Ev(20125328, "IG_DIRECT_E2EE_MESSAGE_MEDIA_RELIABILITY");

    public static final IGFOAMessagingSendToSentLogger A00(UserSession userSession, int i) {
        C14360o3.A0B(userSession, 1);
        return ((IGFOAMessagingSendToSentLoggingController) userSession.A01(IGFOAMessagingSendToSentLoggingController.class, new C206829Dn(userSession, 9))).getLogger(Integer.valueOf(i));
    }

    public static final C46105Kb5 A01(UserSession userSession, Integer num, int i, boolean z, boolean z2) {
        C47282Ev c47282Ev;
        C47282Ev c47282Ev2;
        if (num.intValue() != 0) {
            if (z) {
                c47282Ev = A00;
                c47282Ev2 = A01;
            } else {
                c47282Ev = A03;
                c47282Ev2 = A04;
            }
        } else {
            if (z) {
                c47282Ev = A05;
            } else {
                c47282Ev = A06;
            }
            c47282Ev2 = A02;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36323968646459114L)) {
            C14360o3.A0B(c47282Ev, 1);
            return new C46105Kb5((AbstractC47302Ey) userSession.A01(IGFOAMessagingSendToSentLoggingController.class, new C206829Dn(userSession, 9)), c47282Ev, c47282Ev2, new HashMap(), i, z2);
        }
        return null;
    }
}

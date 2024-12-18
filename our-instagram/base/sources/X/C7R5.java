package X;

import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLogger;
import com.meta.foa.instagram.performancelogging.lss.IGFOAMessagingLocalSendSpeedLoggingController;
import java.util.HashMap;

/* renamed from: X.7R5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7R5 {
    public static final /* synthetic */ C7R5 A02 = new Object();
    public static final C47282Ev A00 = new C47282Ev(20122678, "DIRECT_LOCAL_SEND_SPEED");
    public static final C47282Ev A01 = new C47282Ev(20134487, "FOA_DIRECT_LOCAL_SEND_SPEED");

    public static final IGFOAMessagingLocalSendSpeedLogger A00(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 1);
        return C7N0.A00(userSession).getLogger(num);
    }

    public static final C46103Kb3 A01(UserSession userSession, int i) {
        C47282Ev c47282Ev;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36323968646393577L)) {
            HashMap hashMap = new HashMap();
            IGFOAMessagingLocalSendSpeedLoggingController A002 = C7N0.A00(userSession);
            hashMap.put("generate_message_list_view_models", new SPA());
            if (C18U.A06(c06090Tz, userSession, 2342166977860349677L)) {
                c47282Ev = A00;
            } else {
                c47282Ev = A01;
            }
            C14360o3.A0B(c47282Ev, 0);
            return new C46103Kb3(A002, c47282Ev, hashMap, i);
        }
        return null;
    }
}

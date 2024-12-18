package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.pando.PandoConsistencyServiceJNI;
import com.instagram.common.session.UserSession;
import com.instagram.pando.livetree.SupportedFieldsJNI;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.18A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18A {
    public static final Map A04 = Collections.synchronizedMap(new HashMap());
    public final UserSession A00;
    public final ConcurrentMap A01;
    public final ConcurrentMap A02;
    public final ConcurrentMap A03;

    public C18A(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C18B c18b = new C18B();
        c18b.A03(64);
        c18b.A01();
        this.A01 = c18b.A00();
        C18B c18b2 = new C18B();
        c18b2.A03(64);
        c18b2.A01();
        this.A02 = c18b2.A00();
        C18B c18b3 = new C18B();
        c18b3.A03(64);
        c18b3.A01();
        this.A03 = c18b3.A00();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [X.1tL] */
    public final User A01(User user, boolean z, boolean z2) {
        C14360o3.A0B(user, 0);
        String id = user.getId();
        if (id.length() == 0) {
            throw new RuntimeException() { // from class: X.3zq
            };
        }
        User user2 = (User) this.A01.putIfAbsent(id, user);
        Long BTC = user.BTC();
        if (BTC != null) {
            this.A03.putIfAbsent(BTC, user);
        }
        boolean z3 = false;
        if (user.BJ8() == 0) {
            z3 = true;
        }
        String username = user.getUsername();
        if (z3) {
            if (username.length() == 0) {
                C0w9.A04("username_missing_exception", AnonymousClass001.A0g("Received user ", id, " is missing a username"), 100000);
                user.A0s((String) A04.get(id));
            } else {
                Map map = A04;
                if (!map.containsKey(id)) {
                    map.put(id, username);
                }
            }
        }
        if (user2 != null) {
            UserSession userSession = this.A00;
            if (C14360o3.A0K(userSession.userId, user.getId()) && !z) {
                return user2;
            }
            user2.A0h(userSession, user, z2);
            HandlerC39971tL handlerC39971tL = User.A07;
            HandlerC39971tL handlerC39971tL2 = handlerC39971tL;
            if (handlerC39971tL == null) {
                ?? r5 = new Handler() { // from class: X.1tL
                    @Override // android.os.Handler
                    public final void handleMessage(Message message) {
                        C14360o3.A0B(message, 0);
                        Object obj = message.obj;
                        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.user.model.User.UpdateHandlerMessage");
                        C39991tN c39991tN = (C39991tN) obj;
                        c39991tN.A01.A0c(c39991tN.A00);
                    }

                    {
                        Looper.getMainLooper();
                    }
                };
                User.A07 = r5;
                handlerC39971tL2 = r5;
            }
            Message obtainMessage = handlerC39971tL2.obtainMessage(user2.getId().hashCode(), new C39991tN(userSession, user2));
            C14360o3.A07(obtainMessage);
            handlerC39971tL2.removeMessages(user2.getId().hashCode());
            handlerC39971tL2.sendMessageDelayed(obtainMessage, 1000L);
            if (C14360o3.A0K(userSession.userId, user2.getId())) {
                AbstractC03650Id.A00(userSession, user2);
            }
            return user2;
        }
        if (z3) {
            if (username.length() == 0) {
                C0w9.A03("cache_put_username_missing", AnonymousClass001.A0g("Trying to put user ", id, " into UserCache without username."));
            } else {
                this.A02.put(username, user);
            }
        }
        C17050sx A01 = AbstractC09440dt.A01(new C206839Do(this, 49));
        UserSession userSession2 = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36327164103965010L)) {
            String id2 = user.getId();
            C17P c17p = user.A03;
            SupportedFieldsJNI supportedFieldsJNI = AbstractC39680HjC.A00;
            if (supportedFieldsJNI == null) {
                supportedFieldsJNI = new SupportedFieldsJNI(C72093Lh.A03);
                AbstractC39680HjC.A00 = supportedFieldsJNI;
            }
            C1DU A00 = C1DS.A00(userSession2);
            C14360o3.A07(A00);
            user.A03 = new C72093Lh((PandoConsistencyServiceJNI) A01.getValue(), A00, supportedFieldsJNI, c17p, id2, C18U.A06(c06090Tz, userSession2, 36327164104292694L));
        }
        return user;
    }

    public final void A03(User user) {
        C14360o3.A0B(user, 0);
        User A01 = A01(user, true, false);
        UserSession userSession = this.A00;
        if (C14360o3.A0K(userSession.userId, user.getId())) {
            AbstractC03650Id.A00(userSession, A01);
        }
    }

    public final void A04(User user, boolean z) {
        C14360o3.A0B(user, 0);
        A01(user, z, false);
    }

    public final User A00(long j) {
        return (User) this.A03.get(Long.valueOf(j));
    }

    public final User A02(String str) {
        return (User) this.A01.get(str);
    }
}

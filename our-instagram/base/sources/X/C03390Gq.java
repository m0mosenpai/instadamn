package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03390Gq {
    public UserSession A00;
    public final InterfaceC02900Bo A01;
    public final C18720vz A02;
    public final C17120t7 A03;
    public final Map A04;

    public C03390Gq(C18720vz c18720vz, C17120t7 c17120t7, InterfaceC02900Bo interfaceC02900Bo) {
        C14360o3.A0B(interfaceC02900Bo, 2);
        C14360o3.A0B(c17120t7, 3);
        this.A02 = c18720vz;
        this.A01 = interfaceC02900Bo;
        this.A03 = c17120t7;
        this.A04 = new ConcurrentHashMap();
    }

    public static final synchronized UserSession A00(C03390Gq c03390Gq, User user, boolean z) {
        UserSession userSession;
        synchronized (c03390Gq) {
            String id = user.getId();
            Map map = c03390Gq.A04;
            userSession = (UserSession) map.get(id);
            if (userSession == null) {
                userSession = A01(c03390Gq, user, z, true);
                map.put(id, userSession);
            } else if (z) {
                userSession.sessionState = EnumC13040lq.A04;
                userSession.isManaged = true;
                c03390Gq.A00 = userSession;
            }
        }
        return userSession;
    }

    public static final synchronized void A02(C03390Gq c03390Gq, InterfaceC03950Jk interfaceC03950Jk, String str) {
        synchronized (c03390Gq) {
            Map map = c03390Gq.A04;
            UserSession userSession = (UserSession) map.get(str);
            if (userSession == null) {
                C0w9.A03("UserSessionManager", "operations for given userId is already null");
            } else {
                java.util.Set set = ((C0Gp) userSession.A01(C0Gp.class, C01V.A00)).A00;
                set.remove(interfaceC03950Jk);
                if (set.isEmpty() || (userSession.sessionState.ordinal() == 1 && userSession.isLoggedOut)) {
                    map.remove(str);
                    if (userSession.isManaged) {
                        if (userSession.sessionState.ordinal() == 1) {
                            for (Object obj : userSession.A02()) {
                                if (obj instanceof InterfaceC13050lr) {
                                    ((InterfaceC13050lr) obj).onUserSessionWillEnd(userSession.isLoggedOut);
                                } else if (obj instanceof InterfaceC13000lm) {
                                    ((InterfaceC13000lm) obj).onSessionWillEnd();
                                }
                            }
                            userSession.sessionState = EnumC13040lq.A03;
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0t9, java.lang.Object] */
    public final UserSession A03(User user, boolean z) {
        if (z) {
            final String id = user.getId();
            final UserSession A00 = A00(this, user, true);
            final ?? obj = new Object();
            ((C0Gp) A00.A01(C0Gp.class, C01V.A00)).A00.add(obj);
            A00.userSessionEnder = new C17150tA(new InterfaceC03960Jm() { // from class: X.0t2
                @Override // X.InterfaceC03960Jm
                public final /* bridge */ /* synthetic */ void AIn(Object obj2) {
                    UserSession.this.userSessionEnder = null;
                    C03390Gq.A02(this, obj, id);
                }
            });
            return A00;
        }
        return A01(this, user, false, false);
    }

    public static final UserSession A01(C03390Gq c03390Gq, User user, boolean z, boolean z2) {
        UserSession userSession = new UserSession(c03390Gq.A02, user.getId(), c03390Gq.A03, z, z2);
        C17060sy A00 = C08730cb.A00(userSession);
        if (A00.A00 == null) {
            A00.A00 = user;
            if (z) {
                c03390Gq.A00 = userSession;
            }
            return userSession;
        }
        throw new IllegalStateException("Check failed.");
    }
}

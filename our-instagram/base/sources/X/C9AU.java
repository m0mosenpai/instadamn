package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.9AU, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9AU implements InterfaceC13000lm {
    public C6Eh A00;
    public final SessionedNotificationCenter A01;
    public final C9AW A02;
    public final List A03;
    public final java.util.Set A04;
    public final AccountSession A05;

    public C9AU(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = new ArrayList();
        this.A04 = new LinkedHashSet();
        AccountSession A02 = C61A.A02(userSession, true);
        this.A05 = A02;
        SessionedNotificationCenter sessionedNotificationCenter = A02.getSessionedNotificationCenter();
        C14360o3.A07(sessionedNotificationCenter);
        this.A01 = sessionedNotificationCenter;
        this.A02 = C9AV.A00(userSession);
        C6Eh c6Eh = new C6Eh() { // from class: X.9AX
            @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
            public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
                final String str2;
                int i;
                Number number;
                if (map != null) {
                    Object obj = map.get("MEMOnScreenDisplayMessage");
                    if ((obj instanceof String) && (str2 = (String) obj) != null) {
                        Object obj2 = map.get("MEMOnScreenDisplayMessageColor");
                        if ((obj2 instanceof Integer) && (number = (Number) obj2) != null) {
                            i = number.intValue();
                        } else {
                            i = -1;
                        }
                        C9AU c9au = C9AU.this;
                        C9AW c9aw = c9au.A02;
                        if (C18U.A06(C06090Tz.A05, c9aw.A01, 36322705926597032L)) {
                            EvictingQueue evictingQueue = c9aw.A00;
                            C14360o3.A06(evictingQueue);
                            synchronized (evictingQueue) {
                                evictingQueue.add(new ABN(str2) { // from class: X.9nf
                                    public final String A00;

                                    {
                                        super(C05F.A15, null);
                                        this.A00 = str2;
                                    }

                                    @Override // X.ABN
                                    public final String A00() {
                                        String A0R = AnonymousClass001.A0R("message=", this.A00);
                                        C14360o3.A07(A0R);
                                        return A0R;
                                    }
                                });
                            }
                        }
                        C137246Jd c137246Jd = new C137246Jd(str2, i);
                        Iterator it = c9au.A04.iterator();
                        while (it.hasNext()) {
                            C11T.A02(new RunnableC49946M3n((L3O) it.next(), c137246Jd));
                        }
                    }
                }
            }
        };
        this.A00 = c6Eh;
        this.A01.addObserver(c6Eh, "MEMOnScreenDisplayNotification", 1, null);
    }

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        C137246Jd c137246Jd = new C137246Jd(AnonymousClass001.A0R("[app]", str), 4);
        this.A03.add(c137246Jd);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            C11T.A02(new RunnableC49946M3n((L3O) it.next(), c137246Jd));
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        SessionedNotificationCenter sessionedNotificationCenter = this.A01;
        C6Eh c6Eh = this.A00;
        if (c6Eh == null) {
            C14360o3.A0F("osdDebugInfoCallback");
            throw C00O.createAndThrow();
        }
        sessionedNotificationCenter.removeEveryObserver(c6Eh);
        this.A03.clear();
        this.A04.clear();
    }
}

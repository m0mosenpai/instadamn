package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.user.model.FollowStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.7NH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7NH implements InterfaceC13000lm {
    public final C7NM A00;
    public final C7NK A01;
    public final InterfaceC41501vz A02;
    public final UserSession A03;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A05(false);
    }

    public static C7NH A00(final UserSession userSession) {
        return (C7NH) userSession.A01(C7NH.class, new InterfaceC16820sZ() { // from class: X.7NI
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C7NH(UserSession.this);
            }
        });
    }

    public final ImmutableList A01() {
        C7NK c7nk = this.A01;
        c7nk.A01.writeLock().lock();
        C7NL c7nl = c7nk.A00;
        try {
            C7NM c7nm = this.A00;
            c7nm.A03.A00();
            ImmutableList copyOf = ImmutableList.copyOf((Collection) c7nm.A00);
            if (c7nl != null) {
                c7nl.close();
            }
            return copyOf;
        } catch (Throwable th) {
            if (c7nl != null) {
                try {
                    c7nl.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final void A02(DirectShareTarget directShareTarget) {
        C7NK c7nk = this.A01;
        c7nk.A01.writeLock().lock();
        C7NL c7nl = c7nk.A00;
        try {
            C7NM c7nm = this.A00;
            c7nm.A03.A00();
            c7nm.A00(directShareTarget, false);
            c7nm.A00.add(0, directShareTarget);
            c7nm.A02.ATO(new RcR(c7nm, directShareTarget, System.currentTimeMillis()));
            if (c7nl != null) {
                c7nl.close();
            }
        } catch (Throwable th) {
            if (c7nl != null) {
                try {
                    c7nl.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final void A03(DirectShareTarget directShareTarget) {
        C7NK c7nk = this.A01;
        c7nk.A01.writeLock().lock();
        C7NL c7nl = c7nk.A00;
        try {
            this.A00.A00(directShareTarget, true);
            if (c7nl != null) {
                c7nl.close();
            }
        } catch (Throwable th) {
            if (c7nl != null) {
                try {
                    c7nl.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.instagram.model.direct.DirectShareTargetLoggingInfo, java.lang.Object] */
    public final void A04(DirectShareTarget directShareTarget, int i) {
        C7NK c7nk = this.A01;
        c7nk.A01.writeLock().lock();
        C7NL c7nl = c7nk.A00;
        try {
            C7NM c7nm = this.A00;
            c7nm.A03.A00();
            DirectShareTargetLoggingInfo directShareTargetLoggingInfo = ((DirectShareTarget) c7nm.A00.get(i)).A08;
            if (directShareTargetLoggingInfo != null) {
                Double d = directShareTargetLoggingInfo.A01;
                Boolean bool = directShareTargetLoggingInfo.A00;
                ?? obj = new Object();
                obj.A01 = d;
                obj.A00 = bool;
                directShareTarget.A08 = obj;
            }
            c7nm.A00.set(i, directShareTarget);
            if (c7nl != null) {
                c7nl.close();
            }
        } catch (Throwable th) {
            if (c7nl != null) {
                try {
                    c7nl.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final void A05(boolean z) {
        C7NK c7nk = this.A01;
        c7nk.A01.writeLock().lock();
        C7NL c7nl = c7nk.A00;
        try {
            C7NM c7nm = this.A00;
            c7nm.A03.A00();
            c7nm.A00.clear();
            if (z) {
                c7nm.A02.ATO(new Rc6(c7nm));
            }
            AbstractC25651Mw.A00(this.A03).A02(this.A02, C3MC.class);
            if (c7nl != null) {
                c7nl.close();
            }
        } catch (Throwable th) {
            if (c7nl != null) {
                try {
                    c7nl.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public C7NH(UserSession userSession) {
        InterfaceC41501vz interfaceC41501vz = new InterfaceC41501vz() { // from class: X.7NJ
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                String str;
                int A03 = C0f9.A03(-1555350477);
                C3MC c3mc = (C3MC) obj;
                int A032 = C0f9.A03(1998429667);
                if (c3mc.A00 == FollowStatus.A06) {
                    ArrayList arrayList = new ArrayList();
                    C7NH c7nh = C7NH.this;
                    C1LC it = c7nh.A01().iterator();
                    while (it.hasNext()) {
                        DirectShareTarget directShareTarget = (DirectShareTarget) it.next();
                        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo = directShareTarget.A04;
                        if (creatorBroadcastThreadInfo != null && (str = creatorBroadcastThreadInfo.A03) != null && str.equals(c3mc.A01)) {
                            arrayList.add(directShareTarget);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        c7nh.A03((DirectShareTarget) it2.next());
                    }
                }
                C0f9.A0A(1096727732, A032);
                C0f9.A0A(-91160783, A03);
            }
        };
        this.A02 = interfaceC41501vz;
        C7NK c7nk = new C7NK();
        this.A01 = c7nk;
        this.A00 = new C7NM(userSession, c7nk);
        this.A03 = userSession;
        AbstractC25651Mw.A00(userSession).A01(interfaceC41501vz, C3MC.class);
    }
}

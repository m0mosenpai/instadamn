package X;

import android.os.SystemClock;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.GrO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38219GrO implements InterfaceC43071ya {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final InterfaceC43589JPu A03;
    public final AtomicReference A04;
    public final LruCache A05;

    public C38219GrO(UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC43589JPu interfaceC43589JPu) {
        C14360o3.A0B(interfaceC43589JPu, 3);
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A03 = interfaceC43589JPu;
        this.A04 = new AtomicReference(null);
        this.A05 = new LruCache(10);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        UserSession userSession;
        C06090Tz c06090Tz;
        C37729Gj4 c37729Gj4;
        C75113Zb c75113Zb;
        EnumC37742GjH enumC37742GjH;
        boolean A1R = AbstractC167007dF.A1R(0, c59062n7, interfaceC57162jr);
        C37644Ghd c37644Ghd = (C37644Ghd) c59062n7.A04;
        C37648Ghh c37648Ghh = c37644Ghd.A0F;
        if (c37648Ghh != null) {
            C38221GrQ c38221GrQ = (C38221GrQ) c37648Ghh.A08.getValue();
            Object obj = c59062n7.A03;
            C120985dq c120985dq = (C120985dq) obj;
            String id = c120985dq.getId();
            float CGk = interfaceC57162jr.CGk(c59062n7);
            int A01 = AbstractC37301Gc2.A01(c59062n7, interfaceC57162jr);
            if (A01 != 0) {
                if (A01 != A1R) {
                    C75113Zb c75113Zb2 = c37644Ghd.A0E;
                    this.A05.put(id, false);
                    if (c75113Zb2 != null && c75113Zb2.A1l == A1R) {
                        return;
                    }
                    if (this.A00) {
                        c38221GrQ.A01();
                        this.A04.set(null);
                        if (c75113Zb2 != null && c75113Zb2.A2P != A1R) {
                            c75113Zb2.A2P = A1R;
                        }
                        c37648Ghh.A00 = -1L;
                        return;
                    }
                    C37648Ghh c37648Ghh2 = c38221GrQ.A00;
                    C37651Ghk c37651Ghk = c37648Ghh2.A02;
                    while (!C14360o3.A0K(c37651Ghk, c37648Ghh2.A01)) {
                        if (c37651Ghk != null) {
                            InterfaceC43446JHk interfaceC43446JHk = c37651Ghk.A01.A00;
                            if (interfaceC43446JHk != null) {
                                interfaceC43446JHk.Cmv();
                            }
                            c37651Ghk = c37651Ghk.A00;
                        } else {
                            c37651Ghk = null;
                        }
                    }
                    c37648Ghh2.A01.A01.A00.Cmv();
                    return;
                }
                userSession = this.A01;
                c06090Tz = C06090Tz.A05;
                if (!C18U.A06(c06090Tz, userSession, 36329968715711068L) || CGk < ((float) C18U.A00(c06090Tz, userSession, 37174393645892205L))) {
                    return;
                }
                LruCache lruCache = this.A05;
                Object obj2 = lruCache.get(id);
                Boolean valueOf = Boolean.valueOf(A1R);
                if (C14360o3.A0K(obj2, valueOf)) {
                    return;
                } else {
                    lruCache.put(id, valueOf);
                }
            } else {
                userSession = this.A01;
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36329968715711068L)) {
                    return;
                }
            }
            C14360o3.A0B(c38221GrQ, A1R ? 1 : 0);
            String id2 = c120985dq.getId();
            if (C14360o3.A0K(this.A04.getAndSet(id2), id2)) {
                return;
            }
            AtomicBoolean atomicBoolean = c38221GrQ.A01;
            if (!atomicBoolean.get()) {
                c37729Gj4 = C38221GrQ.A00(c38221GrQ.A00.A02.A01.A04, c38221GrQ);
                if (c37729Gj4.A01) {
                    atomicBoolean.set(A1R);
                }
                c37648Ghh.A00 = SystemClock.elapsedRealtime();
                C14360o3.A06(obj);
                AbstractC37674GiB.A02 = AbstractC167007dF.A0p(c120985dq.getId(), SystemClock.elapsedRealtime());
                C006802i.A0p.markEventBuilder(630199745, "delayed_cta_timeline").annotate("visible_percentage", CGk * 100.0d).report();
                AbstractC37674GiB.A00(c37729Gj4, c37648Ghh);
                c75113Zb = c37644Ghd.A0E;
                if (c75113Zb != null || c75113Zb.A2P != A1R) {
                }
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    if (!c38321qM.A4Y() && c38321qM.A1Y() != null) {
                        enumC37742GjH = EnumC37742GjH.A05;
                    } else if (!c38321qM.A4Y() && C18U.A06(c06090Tz, userSession, 36320201960398982L)) {
                        enumC37742GjH = EnumC37742GjH.A03;
                    } else if (!c38321qM.A4Y() && C18U.A06(c06090Tz, userSession, 36320201960661130L)) {
                        enumC37742GjH = EnumC37742GjH.A04;
                    }
                    AbstractC167007dF.A0J().postDelayed(new J5Z(c59062n7, enumC37742GjH, this), C18U.A01(c06090Tz, userSession, 36601676937826622L));
                    return;
                }
                enumC37742GjH = null;
                AbstractC167007dF.A0J().postDelayed(new J5Z(c59062n7, enumC37742GjH, this), C18U.A01(c06090Tz, userSession, 36601676937826622L));
                return;
            }
            c37729Gj4 = C37729Gj4.A02;
            c37648Ghh.A00 = SystemClock.elapsedRealtime();
            C14360o3.A06(obj);
            AbstractC37674GiB.A02 = AbstractC167007dF.A0p(c120985dq.getId(), SystemClock.elapsedRealtime());
            C006802i.A0p.markEventBuilder(630199745, "delayed_cta_timeline").annotate("visible_percentage", CGk * 100.0d).report();
            AbstractC37674GiB.A00(c37729Gj4, c37648Ghh);
            c75113Zb = c37644Ghd.A0E;
            if (c75113Zb != null) {
            }
        }
    }
}

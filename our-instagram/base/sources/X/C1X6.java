package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1X6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1X6 implements C1X7 {
    public C121715fO A00;
    public C80583in A01;
    public final Context A02;
    public final UserSession A03;
    public final java.util.Set A04;
    public final AtomicBoolean A05;
    public final InterfaceC09390do A06;
    public final C19L A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    @Override // X.C1X7
    public final void DM4(EnumC73363Qm enumC73363Qm, String str) {
        C14360o3.A0B(enumC73363Qm, 0);
        synchronized (this) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((C61922rt) it.next()).A08(enumC73363Qm, str);
            }
        }
    }

    @Override // X.C1X7
    public final void DM5(C74283Vj c74283Vj, EnumC73363Qm enumC73363Qm, List list, long j) {
        C80583in c80583in;
        C17570ts c17570ts;
        C14360o3.A0B(enumC73363Qm, 2);
        if (j > 0 && j < C1XT.A01(this.A03)) {
            DM4(enumC73363Qm, "invalid cache timestamp");
            return;
        }
        boolean z = true;
        if (!list.isEmpty()) {
            UserSession userSession = this.A03;
            int A00 = C1XT.A00(userSession);
            C28091Xn A002 = C28071Xl.A00(this.A02, userSession);
            if (C18U.A06(C06090Tz.A05, userSession, 36317594918065547L)) {
                c17570ts = (C17570ts) userSession.A00(C17570ts.class);
            } else {
                c17570ts = null;
            }
            AbstractC80573im.A00(userSession, c17570ts, c74283Vj, A002, list, A00);
        }
        if (this.A08 && this.A05.get()) {
            synchronized (this) {
                if (this.A04.isEmpty()) {
                    z = false;
                    this.A01 = new C80583in(c74283Vj, enumC73363Qm, list, j);
                }
            }
            if (this.A0A && (c80583in = this.A01) != null) {
                Iterator it = c80583in.A01.A00().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3XG c3xg = (C3XG) it.next();
                    if (c3xg.A06 == C1XV.A0Y) {
                        C38321qM A02 = C3XH.A02(c3xg.A05);
                        if (A02 != null && A02.A55()) {
                            if (C18U.A06(C06090Tz.A05, this.A03, 36314893381012375L)) {
                                AbstractC23641Du.A05(AnonymousClass191.A00, new PZM(this, A02, null, 23), this.A07);
                            } else {
                                A00(A02, this);
                            }
                        }
                    }
                }
            }
            if (!z) {
                return;
            }
        }
        synchronized (this) {
            Iterator it2 = this.A04.iterator();
            while (it2.hasNext()) {
                ((C61922rt) it2.next()).A07(c74283Vj, enumC73363Qm, list, j);
            }
        }
    }

    @Override // X.C1X7
    public final void DVT(Integer num, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(num, 1);
        boolean z = true;
        if (this.A08 && this.A05.get() && num == C05F.A00) {
            synchronized (this) {
                if (this.A04.isEmpty()) {
                    this.A00 = new C121715fO(num, list);
                    z = false;
                }
            }
            if (!z) {
                return;
            }
        }
        synchronized (this) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((C61922rt) it.next()).A0A(list);
            }
        }
    }

    public /* synthetic */ C1X6(UserSession userSession) {
        Context A06 = userSession.deviceSession.A06();
        this.A03 = userSession;
        this.A02 = A06;
        this.A06 = AbstractC09440dt.A01(new C9EA(this, 12));
        C12L c12l = C12L.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A07 = AnonymousClass194.A02(c12l.AOT(1099672250, (int) C18U.A01(c06090Tz, userSession, 36596368357853616L)));
        this.A04 = new LinkedHashSet();
        this.A08 = C18U.A06(c06090Tz, userSession, 36314893380488079L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36314893380684690L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36314893380750227L);
        this.A09 = C18U.A06(c06090Tz, userSession, 36314893380619153L);
        this.A05 = new AtomicBoolean(false);
    }

    public static final void A00(C38321qM c38321qM, C1X6 c1x6) {
        Context context = c1x6.A02;
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        if (A1q != null) {
            C14M.A05(new C14M());
            C25821No.A07(new C55953Osl(c38321qM, A1q));
        }
        if (c1x6.A0B && c38321qM.Cff()) {
            UserSession userSession = c1x6.A03;
            C4AG.A00(userSession).A00(context);
            if (!c38321qM.A5M() || (c38321qM = c38321qM.A1e(c38321qM.A0x())) != null) {
                C75363a3 CFR = c38321qM.CFR();
                C4AG.A00(userSession).A01(new C4AD(CFR, "feed_timeline"));
                if (c1x6.A09) {
                    C4VX c4vx = new C4VX(context, userSession, CFR, "feed_timeline");
                    c4vx.A02 = true;
                    C4VZ.A00(c4vx.A00());
                }
            }
        }
    }

    public static final void A01(C1X6 c1x6, C61922rt c61922rt) {
        ((C1Y3) c1x6.A06.getValue()).stop();
        synchronized (c1x6) {
            c1x6.A04.remove(c61922rt);
        }
    }

    public static final void A02(C1X6 c1x6, C61922rt c61922rt, boolean z) {
        if (c1x6.A08) {
            AtomicBoolean atomicBoolean = c1x6.A05;
            if (atomicBoolean.get()) {
                synchronized (c1x6) {
                    java.util.Set set = c1x6.A04;
                    set.add(c61922rt);
                    C80583in c80583in = c1x6.A01;
                    C121715fO c121715fO = c1x6.A00;
                    c1x6.A01 = null;
                    c1x6.A00 = null;
                    atomicBoolean.set(false);
                    if (c80583in != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((C61922rt) it.next()).A07(c80583in.A01, c80583in.A02, c80583in.A03, c80583in.A00);
                        }
                    }
                    if (c121715fO != null) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            ((C61922rt) it2.next()).A0A(c121715fO.A01);
                        }
                    }
                }
                return;
            }
        }
        synchronized (c1x6) {
            c1x6.A04.add(c61922rt);
        }
        ((C1Y3) c1x6.A06.getValue()).Emk(c1x6, z);
    }

    public final void A03() {
        if (this.A08) {
            this.A05.set(true);
            UserSession userSession = this.A03;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36314893380881301L)) {
                AbstractC24641Ih.A02.Ep8(new C52399NGu(this));
            } else {
                if (C18U.A06(c06090Tz, userSession, 36314893380946838L)) {
                    C19L c19l = this.A07;
                    AbstractC23641Du.A05(AnonymousClass191.A00, new PZF(this, null, 13), c19l);
                    return;
                }
                ((FeedCacheCoordinator) ((C1Y3) this.A06.getValue())).Emk(this, true);
            }
        }
    }
}

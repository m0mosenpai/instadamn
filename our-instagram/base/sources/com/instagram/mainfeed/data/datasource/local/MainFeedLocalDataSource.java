package com.instagram.mainfeed.data.datasource.local;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC16960so;
import X.AbstractC25061Kk;
import X.AbstractC25225BEi;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31174DnI;
import X.AnonymousClass139;
import X.AnonymousClass194;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C0eB;
import X.C0f9;
import X.C12L;
import X.C14360o3;
import X.C14M;
import X.C18U;
import X.C19L;
import X.C1M1;
import X.C1XT;
import X.C1XV;
import X.C1Y1;
import X.C1Y4;
import X.C1Y7;
import X.C218914p;
import X.C25821No;
import X.C28001Xe;
import X.C28061Xk;
import X.C28071Xl;
import X.C28091Xn;
import X.C28141Xs;
import X.C28171Xv;
import X.C38321qM;
import X.C3XG;
import X.C4AD;
import X.C4AG;
import X.C4QH;
import X.C4VX;
import X.C4VZ;
import X.C50530MSj;
import X.C50533MSm;
import X.C54420O3a;
import X.C55952Osk;
import X.C61942rv;
import X.C61982rz;
import X.C74283Vj;
import X.C75363a3;
import X.C9FM;
import X.EnumC220415e;
import X.EnumC73363Qm;
import X.InterfaceC12870lZ;
import X.O8A;
import X.OC1;
import X.PZM;
import X.PZP;
import X.PZW;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class MainFeedLocalDataSource implements InterfaceC12870lZ, C1Y1, C1Y4 {
    public static final AtomicInteger A0O = new AtomicInteger();
    public int A00;
    public OC1 A01;
    public C61942rv A02;
    public C1M1 A03;
    public O8A A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final Context A08;
    public final UserSession A09;
    public final C61982rz A0A;
    public final C1Y7 A0B;
    public final FlashFeedCache A0C;
    public final List A0D;
    public final Set A0E;
    public final AtomicBoolean A0F;
    public final C19L A0G;
    public final C19L A0H;
    public final AnonymousClass139 A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource.A03(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource.A04(X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.C1Y1
    public final void A8s(List list, boolean z) {
        FlashFeedCache flashFeedCache = this.A0C;
        if (flashFeedCache != null) {
            AbstractC166987dD.A1Z(new C50533MSm(flashFeedCache, list, this, null, 12, z), this.A0G);
        }
    }

    public static final C0eB A00(MainFeedLocalDataSource mainFeedLocalDataSource, C54420O3a c54420O3a, boolean z) {
        if (mainFeedLocalDataSource.A0J) {
            AtomicBoolean atomicBoolean = mainFeedLocalDataSource.A0F;
            if (atomicBoolean.get()) {
                synchronized (mainFeedLocalDataSource) {
                    Set<C54420O3a> set = mainFeedLocalDataSource.A0E;
                    set.add(c54420O3a);
                    OC1 oc1 = mainFeedLocalDataSource.A01;
                    O8A o8a = mainFeedLocalDataSource.A04;
                    mainFeedLocalDataSource.A01 = null;
                    mainFeedLocalDataSource.A04 = null;
                    atomicBoolean.set(false);
                    if (oc1 != null) {
                        for (C54420O3a c54420O3a2 : set) {
                            C74283Vj c74283Vj = oc1.A01;
                            List list = oc1.A03;
                            EnumC73363Qm enumC73363Qm = oc1.A02;
                            long j = oc1.A00;
                            C14360o3.A0B(enumC73363Qm, 2);
                            c54420O3a2.A00.A07(c74283Vj, enumC73363Qm, list, j);
                        }
                    }
                    if (o8a != null) {
                        A02(o8a, mainFeedLocalDataSource);
                    }
                }
                return C0eB.A00;
            }
        }
        PZW.A01(mainFeedLocalDataSource, mainFeedLocalDataSource.A0G, 27, z);
        return C0eB.A00;
    }

    public static final void A01(C38321qM c38321qM, MainFeedLocalDataSource mainFeedLocalDataSource) {
        Context context = mainFeedLocalDataSource.A08;
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        if (A1q != null) {
            C14M.A05(new C14M());
            C25821No.A07(new C55952Osk(c38321qM, A1q));
        }
        if (mainFeedLocalDataSource.A0M && c38321qM.Cff()) {
            UserSession userSession = mainFeedLocalDataSource.A09;
            C4AG.A00(userSession).A00(context);
            if (!c38321qM.A5M() || (c38321qM = c38321qM.A1e(c38321qM.A0x())) != null) {
                C75363a3 CFR = c38321qM.CFR();
                C4AG.A00(userSession).A01(new C4AD(CFR, "feed_timeline"));
                if (mainFeedLocalDataSource.A0K) {
                    C4VX c4vx = new C4VX(context, userSession, CFR, "feed_timeline");
                    c4vx.A02 = true;
                    C4VZ.A00(c4vx.A00());
                }
            }
        }
    }

    public static final void A02(O8A o8a, MainFeedLocalDataSource mainFeedLocalDataSource) {
        boolean z;
        if (mainFeedLocalDataSource.A0J && mainFeedLocalDataSource.A0F.get() && o8a.A00 == C05F.A00) {
            synchronized (mainFeedLocalDataSource) {
                z = true;
                if (mainFeedLocalDataSource.A0E.isEmpty()) {
                    z = false;
                    mainFeedLocalDataSource.A04 = o8a;
                }
            }
            if (!z) {
                return;
            }
        }
        synchronized (mainFeedLocalDataSource) {
            UserSession userSession = mainFeedLocalDataSource.A09;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 2342154105843155377L)) {
                List list = o8a.A01;
                if (AbstractC166987dD.A1b(list)) {
                    C61982rz c61982rz = mainFeedLocalDataSource.A0A;
                    c61982rz.A01(userSession, list);
                    C61942rv c61942rv = mainFeedLocalDataSource.A02;
                    if (c61942rv != null) {
                        c61942rv.A00(c61982rz, new C4QH(Integer.MAX_VALUE, AbstractC25225BEi.A07(c06090Tz, userSession, 36592571606237809L)), AbstractC25225BEi.A07(c06090Tz, userSession, 36592571606106736L));
                    }
                }
            }
        }
    }

    public final void A05() {
        C006802i c006802i = C006802i.A0p;
        int incrementAndGet = A0O.incrementAndGet();
        c006802i.markerStart(974459630, incrementAndGet);
        c006802i.markerAnnotate(974459630, incrementAndGet, "CACHE_NAME", "RECS");
        if (this.A0C != null) {
            AbstractC166987dD.A1Z(new C50530MSj(this, c006802i, null, incrementAndGet, 18), this.A0G);
        }
        c006802i.markerEnd(974459630, incrementAndGet, (short) 2);
    }

    public final void A06() {
        AbstractC166987dD.A1Z(new PZP(this, null, 24), this.A0G);
        if (this.A0N) {
            C218914p.A07(this);
        }
    }

    @Override // X.C1Y1
    public final void AHk() {
        FlashFeedCache flashFeedCache = this.A0C;
        if (flashFeedCache != null) {
            PZM.A01(this, flashFeedCache, this.A0G, 18);
        }
    }

    @Override // X.C1Y4
    public final void DVU(List list) {
        A02(new O8A(C05F.A00, list), this);
    }

    @Override // X.C1Y1
    public final void FA3(C3XG c3xg) {
        PZM.A01(this, c3xg, this.A0G, 22);
    }

    public /* synthetic */ MainFeedLocalDataSource(UserSession userSession) {
        long j;
        int A07;
        Context A0F = AbstractC25225BEi.A0F(userSession);
        this.A09 = userSession;
        this.A08 = A0F;
        C12L c12l = C12L.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0H = AnonymousClass194.A02(c12l.AOT(1099672250, AbstractC25225BEi.A07(c06090Tz, userSession, 36596368357853616L)));
        this.A0G = AbstractC167017dG.A0w(c12l, 739);
        this.A0E = AbstractC31171DnF.A0l();
        this.A0J = C18U.A06(c06090Tz, userSession, 36314893380488079L);
        this.A0L = C18U.A06(c06090Tz, userSession, 36314893380684690L);
        this.A0M = C18U.A06(c06090Tz, userSession, 36314893380750227L);
        this.A0K = C18U.A06(c06090Tz, userSession, 36314893380619153L);
        this.A0F = new AtomicBoolean(false);
        C28091Xn A00 = C28071Xl.A00(A0F.getApplicationContext(), userSession);
        ArrayList A10 = AbstractC31174DnI.A10(A00);
        A10.add(new C28061Xk(userSession));
        A10.add(new C28141Xs(A00));
        this.A0A = new C61982rz(A10);
        if (C18U.A06(c06090Tz, userSession, 36317775303808570L)) {
            A07 = 0;
        } else {
            if (!AbstractC25061Kk.A00().A0D() && !AbstractC25061Kk.A00().A0E()) {
                j = 36592571606303346L;
            } else {
                j = 36592571606368883L;
            }
            A07 = AbstractC25225BEi.A07(c06090Tz, userSession, j);
        }
        this.A00 = A07;
        this.A05 = C1XT.A00(userSession) * 3;
        this.A07 = C18U.A01(c06090Tz, userSession, 36592571606893177L) * 1000;
        this.A06 = C18U.A01(c06090Tz, userSession, 36592571606827640L) * 1000;
        List A1Q = AbstractC16960so.A1Q(new C28001Xe(C18U.A01(c06090Tz, userSession, 36592571606499957L), AbstractC25233BEq.A0p(C1XV.A0Y, AbstractC166997dE.A0i(c06090Tz, userSession, 36592571606499957L), AbstractC166987dD.A1L(C1XV.A0H, AbstractC166997dE.A0i(c06090Tz, userSession, 36595281730537584L)))), new C28061Xk(userSession), new C28141Xs(C28071Xl.A00(AbstractC25225BEi.A0F(userSession), userSession)), new C28171Xv(C18U.A06(c06090Tz, userSession, 2342154105844007347L), C1XT.A03(userSession)));
        this.A0D = A1Q;
        boolean A1O = AbstractC167007dF.A1O(this.A00);
        this.A0N = A1O;
        AtomicInteger atomicInteger = A0O;
        C14360o3.A0B(atomicInteger, 2);
        this.A0B = (C1Y7) userSession.A01(C1Y7.class, new C9FM(48, atomicInteger, userSession, A0F));
        this.A0I = new AnonymousClass139();
        this.A0C = A1O ? new FlashFeedCache(A0F, userSession, A1Q, this.A00) : null;
        if (A1O) {
            C218914p.A04(EnumC220415e.A02, this, false, false);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1517151500);
        FlashFeedCache flashFeedCache = this.A0C;
        if (flashFeedCache != null) {
            PZM.A01(this, flashFeedCache, this.A0G, 19);
        }
        C0f9.A0A(1709845279, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1533182671, C0f9.A03(1294238696));
    }
}

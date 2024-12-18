package com.instagram.mainfeed.network;

import X.AbstractC18280vF;
import X.AbstractC23641Du;
import X.AbstractC24641Ih;
import X.AbstractC24771Iv;
import X.AbstractC80523ih;
import X.AbstractC80543ij;
import X.AnonymousClass139;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.C006802i;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0K8;
import X.C0f9;
import X.C12L;
import X.C14090nZ;
import X.C14360o3;
import X.C18U;
import X.C19K;
import X.C19L;
import X.C1JX;
import X.C1X7;
import X.C1XT;
import X.C1Y1;
import X.C1Y3;
import X.C1Y4;
import X.C1Y7;
import X.C1YZ;
import X.C218914p;
import X.C25821No;
import X.C28071Xl;
import X.C38321qM;
import X.C3XG;
import X.C3XH;
import X.C3YV;
import X.C3YW;
import X.C4HP;
import X.C9D4;
import X.C9DB;
import X.C9DG;
import X.C9DJ;
import X.C9FM;
import X.EnumC220415e;
import X.InterfaceC12870lZ;
import X.InterfaceC23621Ds;
import X.PZF;
import X.PZM;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.network.FeedCacheCoordinator;
import com.instagram.mainfeed.network.flashfeed.FeedItemDatabase;
import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class FeedCacheCoordinator implements InterfaceC12870lZ, C1Y1, C1Y3, C1Y4 {
    public static final AtomicInteger A0F = new AtomicInteger();
    public int A00;
    public C1X7 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final long A05;
    public final long A06;
    public final UserSession A07;
    public final C1Y7 A08;
    public final FlashFeedCache A09;
    public final List A0A;
    public final C19L A0B;
    public final AnonymousClass139 A0C;
    public final int A0D;
    public final Context A0E;

    public final void A07() {
        this.A01 = null;
        this.A02 = false;
        FlashFeedCache flashFeedCache = this.A09;
        if (flashFeedCache != null) {
            UserSession userSession = this.A07;
            flashFeedCache.A04.clear();
            C1YZ.A01(userSession, FeedItemDatabase.A00);
        }
        C1Y7 c1y7 = this.A08;
        c1y7.A00 = null;
        File A00 = C1Y7.A06.A00(c1y7.A02, c1y7.A03);
        if (A00.exists() && !A00.delete()) {
            C0K8.A0O("ColdStartFeedCache", "fail to delete file: %s", A00.getName());
        }
    }

    @Override // X.C1Y1
    public final void A8s(List list, boolean z) {
        FlashFeedCache flashFeedCache = this.A09;
        if (flashFeedCache != null) {
            C19L c19l = this.A0B;
            C9DJ c9dj = new C9DJ(this, list, flashFeedCache, null, 5, z);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dj, c19l);
        }
    }

    @Override // X.C1Y3
    public final void Emk(C1X7 c1x7, boolean z) {
        C19L c19l = this.A0B;
        C9DB c9db = new C9DB(this, c1x7, null, 2, z);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9db, c19l);
        AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.1c0
            {
                super("flashCacheInitialization", 1908411235);
            }

            @Override // X.AbstractC18280vF
            public final void loggedRun() {
                FeedCacheCoordinator feedCacheCoordinator = FeedCacheCoordinator.this;
                C19L c19l2 = feedCacheCoordinator.A0B;
                C206649Cv c206649Cv = new C206649Cv(feedCacheCoordinator, null, 25);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l2);
            }
        });
    }

    public static final int A00(FeedCacheCoordinator feedCacheCoordinator, List list) {
        int min = Math.min(C1XT.A00(feedCacheCoordinator.A07), list.size());
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            C3XG c3xg = (C3XG) list.get(i2);
            if (!C3YW.A04(c3xg)) {
                C14360o3.A0B(c3xg, 0);
                if (!C3YV.A08(C3XH.A02(c3xg.A05))) {
                }
            }
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.mainfeed.network.FeedCacheCoordinator r19, X.InterfaceC23621Ds r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FeedCacheCoordinator.A01(com.instagram.mainfeed.network.FeedCacheCoordinator, X.1Ds):java.lang.Object");
    }

    public static final Object A02(FeedCacheCoordinator feedCacheCoordinator, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        Integer num;
        FlashFeedCache flashFeedCache = feedCacheCoordinator.A09;
        if (flashFeedCache == null) {
            return null;
        }
        int i = feedCacheCoordinator.A0D;
        UserSession userSession = feedCacheCoordinator.A07;
        long A01 = C1XT.A01(userSession);
        ArrayList A03 = A03(feedCacheCoordinator, C05F.A00, z);
        if (z && C4HP.A00(userSession).booleanValue()) {
            num = null;
        } else {
            num = new Integer((int) C18U.A01(C06090Tz.A05, userSession, 36592571606958714L));
        }
        Object A04 = flashFeedCache.A04(num, null, null, A03, interfaceC23621Ds, i, A01, false, false, true);
        C1JX c1jx = C1JX.A02;
        return A04;
    }

    public static final C09530e4 A04(FeedCacheCoordinator feedCacheCoordinator, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3XG c3xg = (C3XG) it.next();
                C38321qM A02 = C3XH.A02(c3xg.A05);
                if (A02 != null && C25821No.A00() != null && AbstractC80543ij.A00(feedCacheCoordinator.A07).A00(feedCacheCoordinator.A0E, A02)) {
                    arrayList.add(c3xg);
                    z = true;
                } else {
                    arrayList2.add(c3xg);
                }
            }
        }
        arrayList.addAll(arrayList2);
        return new C09530e4(Boolean.valueOf(z), arrayList);
    }

    public static final void A06(FeedCacheCoordinator feedCacheCoordinator, int i) {
        if (feedCacheCoordinator.A03) {
            C19K A02 = AbstractC24771Iv.A02(117128848, i);
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZF(feedCacheCoordinator, null, 15), A02);
        }
    }

    @Override // X.C1Y1
    public final void AHk() {
        FlashFeedCache flashFeedCache = this.A09;
        if (flashFeedCache != null) {
            C19L c19l = this.A0B;
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZM(this, flashFeedCache, null, 24), c19l);
        }
    }

    @Override // X.C1Y4
    public final void DVU(List list) {
        C1X7 c1x7 = this.A01;
        if (c1x7 != null) {
            c1x7.DVT(C05F.A00, list);
        }
    }

    @Override // X.C1Y1
    public final void FA3(C3XG c3xg) {
        C19L c19l = this.A0B;
        C9D4 c9d4 = new C9D4(c3xg, this, (InterfaceC23621Ds) null, 13);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
    }

    @Override // X.C1Y3
    public final void stop() {
        C19L c19l = this.A0B;
        C9DG c9dg = new C9DG(this, (InterfaceC23621Ds) null, 0);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9dg, c19l);
        if (this.A04) {
            C218914p.A07(this);
        }
    }

    public FeedCacheCoordinator(Context context, UserSession userSession, List list, int i, int i2, long j, long j2) {
        C14090nZ AOT;
        this.A0E = context;
        this.A07 = userSession;
        this.A00 = i;
        this.A0D = i2;
        this.A06 = j;
        this.A05 = j2;
        this.A0A = list;
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36315284222839937L);
        C12L c12l = C12L.A00;
        if (A06) {
            AOT = c12l.CPG(739, 3);
        } else {
            AOT = c12l.AOT(739, 3);
        }
        this.A0B = AnonymousClass194.A02(AOT);
        this.A04 = this.A00 > 0;
        AtomicInteger atomicInteger = A0F;
        C14360o3.A0B(atomicInteger, 2);
        this.A08 = (C1Y7) userSession.A01(C1Y7.class, new C9FM(48, atomicInteger, userSession, context));
        this.A0C = new AnonymousClass139();
        this.A09 = this.A04 ? new FlashFeedCache(context, userSession, list, this.A00) : null;
        if (this.A04) {
            C218914p.A04(EnumC220415e.A02, this, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A03(com.instagram.mainfeed.network.FeedCacheCoordinator r3, java.lang.Integer r4, boolean r5) {
        /*
            int r2 = r4.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L22
            if (r2 != r1) goto L48
            X.1XV r0 = X.C1XV.A0Y
            X.1XV[] r0 = new X.C1XV[]{r0}
            java.util.ArrayList r1 = X.AbstractC16960so.A1M(r0)
            com.instagram.common.session.UserSession r0 = r3.A07
            boolean r0 = X.C1XT.A03(r0)
        L1a:
            if (r0 == 0) goto L21
            X.1XV r0 = X.C1XV.A0a
            r1.add(r0)
        L21:
            return r1
        L22:
            com.instagram.common.session.UserSession r2 = r3.A07
            java.lang.Boolean r0 = X.C4HP.A00(r2)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3d
            X.1XV r0 = X.C1XV.A0Y
            X.1XV[] r0 = new X.C1XV[]{r0}
        L34:
            java.util.ArrayList r1 = X.AbstractC16960so.A1M(r0)
            boolean r0 = X.C1XT.A02(r2)
            goto L1a
        L3d:
            if (r5 != 0) goto L48
            X.1XV r1 = X.C1XV.A0Y
            X.1XV r0 = X.C1XV.A0H
            X.1XV[] r0 = new X.C1XV[]{r1, r0}
            goto L34
        L48:
            X.1XV r0 = X.C1XV.A0H
            X.1XV[] r0 = new X.C1XV[]{r0}
            java.util.ArrayList r1 = X.AbstractC16960so.A1M(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.mainfeed.network.FeedCacheCoordinator.A03(com.instagram.mainfeed.network.FeedCacheCoordinator, java.lang.Integer, boolean):java.util.ArrayList");
    }

    public static final void A05(C006802i c006802i, FeedCacheCoordinator feedCacheCoordinator, List list, int i) {
        c006802i.markerAnnotate(974459630, i, "LIKED_ITEM_COUNT", AbstractC80523ih.A01(list));
        c006802i.markerAnnotate(974459630, i, "SUB_VPVD_COUNT", AbstractC80523ih.A00(C28071Xl.A00(feedCacheCoordinator.A0E, feedCacheCoordinator.A07), list));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(276008033);
        FlashFeedCache flashFeedCache = this.A09;
        if (flashFeedCache != null) {
            C19L c19l = this.A0B;
            C9D4 c9d4 = new C9D4(flashFeedCache, this, (InterfaceC23621Ds) null, 12);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, c19l);
        }
        C0f9.A0A(-119482070, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(2072221169, C0f9.A03(479953721));
    }
}

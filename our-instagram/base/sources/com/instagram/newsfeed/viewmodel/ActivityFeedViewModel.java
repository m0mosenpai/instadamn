package com.instagram.newsfeed.viewmodel;

import X.AbstractC107294sa;
import X.AbstractC129825tm;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.AbstractC43593JPy;
import X.C05A;
import X.C0ST;
import X.C0UO;
import X.C107264sX;
import X.C10Q;
import X.C141796aw;
import X.C14360o3;
import X.C15370ps;
import X.C193578hc;
import X.C1ON;
import X.C25671My;
import X.C50576MUh;
import X.C50579MUm;
import X.C51729Mt8;
import X.C54602fI;
import X.CSH;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC19390xP;
import X.InterfaceC37103GWn;
import X.JWB;
import X.MUD;
import X.PZG;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import com.instagram.newsfeed.data.ActivityPagedData;
import com.instagram.user.model.User;
import java.util.LinkedHashSet;

/* loaded from: classes9.dex */
public final class ActivityFeedViewModel extends C193578hc {
    public AbstractC129825tm A00;
    public ActivityPagedData A01;
    public boolean A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C50579MUm A05;
    public final C107264sX A06;
    public final ActivityFeedRecommendedUserRepository A07;
    public final ActivityFeedRepository A08;
    public final C50576MUh A09;
    public final JWB A0A;
    public final C54602fI A0B;
    public final InterfaceC09390do A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C25671My A0J;
    public final InterfaceC19390xP A0K;
    public final C0UO A0L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0076, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r26, 36322628616661367L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ActivityFeedViewModel(android.app.Application r23, X.InterfaceC11380iw r24, X.C25671My r25, com.instagram.common.session.UserSession r26, X.AbstractC129825tm r27, X.C50579MUm r28, X.C107264sX r29, com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository r30, com.instagram.newsfeed.data.ActivityFeedRepository r31, X.C50576MUh r32, X.JWB r33, X.C54602fI r34) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel.<init>(android.app.Application, X.0iw, X.1My, com.instagram.common.session.UserSession, X.5tm, X.MUm, X.4sX, com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository, com.instagram.newsfeed.data.ActivityFeedRepository, X.MUh, X.JWB, X.2fI):void");
    }

    public final void A0G(MUD mud, User user, Integer num, int i) {
        AbstractC166987dD.A1Z(new ActivityFeedViewModel$followUser$1(mud, this, user, num, null, i), AbstractC37302Gc3.A08(this, user));
        A0F();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C0eB A00(X.C5HW r5, com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 9
            boolean r0 = X.PXA.A03(r7, r3)
            if (r0 == 0) goto L82
            r4 = r7
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L5f
            if (r0 != r3) goto L87
            java.lang.Object r5 = r4.A02
            X.5HW r5 = (X.C5HW) r5
            java.lang.Object r6 = r4.A01
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r6 = (com.instagram.newsfeed.viewmodel.ActivityFeedViewModel) r6
            X.AbstractC09560e7.A00(r1)
        L2a:
            X.4sX r0 = r6.A06
            java.lang.String r6 = r5.A09
            X.C14360o3.A07(r6)
            X.05A r5 = r0.A06
        L33:
            java.lang.Object r4 = r5.getValue()
            r1 = r4
            X.4sa r1 = (X.AbstractC107294sa) r1
            boolean r0 = r1 instanceof X.C109374wM
            if (r0 == 0) goto L79
            X.4wM r1 = (X.C109374wM) r1
            java.lang.Object r0 = r1.A00
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r0.iterator()
        L4c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5HW r0 = (X.C5HW) r0
            java.lang.String r0 = r0.A09
            X.AbstractC25232BEp.A1Q(r0, r6, r1, r3)
            goto L4c
        L5f:
            X.AbstractC09560e7.A00(r1)
            if (r5 == 0) goto L7f
            com.instagram.newsfeed.data.ActivityPagedData r2 = r6.A01
            r1 = 17
            X.Pjf r0 = new X.Pjf
            r0.<init>(r5, r1)
            X.PXA.A01(r6, r5, r4, r3)
            com.instagram.newsfeed.data.ActivityPagedData.A01(r2, r0)
            goto L2a
        L74:
            X.4wM r1 = new X.4wM
            r1.<init>(r3)
        L79:
            boolean r0 = r5.AIi(r4, r1)
            if (r0 == 0) goto L33
        L7f:
            X.0eB r0 = X.C0eB.A00
            return r0
        L82:
            X.PXA r4 = X.PXA.A00(r6, r7, r3)
            goto L16
        L87:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel.A00(X.5HW, com.instagram.newsfeed.viewmodel.ActivityFeedViewModel, X.1Ds):X.0eB");
    }

    public static final void A01(InterfaceC37103GWn interfaceC37103GWn, ActivityFeedViewModel activityFeedViewModel) {
        Object value;
        LinkedHashSet linkedHashSet;
        C05A c05a = activityFeedViewModel.A0D;
        do {
            value = c05a.getValue();
            LinkedHashSet linkedHashSet2 = (LinkedHashSet) value;
            C14360o3.A0B(linkedHashSet2, 0);
            linkedHashSet = new LinkedHashSet(linkedHashSet2);
            linkedHashSet.add(interfaceC37103GWn);
        } while (!c05a.AIi(value, linkedHashSet));
    }

    public final void A0F() {
        Object value;
        C51729Mt8 c51729Mt8;
        C05A c05a = this.A0E;
        do {
            value = c05a.getValue();
            c51729Mt8 = (C51729Mt8) value;
        } while (!c05a.AIi(value, new C51729Mt8(c51729Mt8.A01 + 1, c51729Mt8.A02, 4)));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        CSH csh = (CSH) this.A0C.getValue();
        if (csh != null) {
            C1ON c1on = csh.A00;
            if (c1on != null) {
                c1on.cancel();
            }
            csh.A00 = null;
        }
    }

    public final InterfaceC19390xP A0E(AbstractC129825tm abstractC129825tm, boolean z, boolean z2) {
        Object obj;
        C15370ps A1F = AbstractC25225BEi.A1F();
        if (z && z2) {
            obj = ((AbstractC107294sa) this.A01.A05.getValue()).A00();
        } else {
            obj = null;
        }
        A1F.A00 = obj;
        if (!abstractC129825tm.equals(this.A00) || z) {
            this.A00 = abstractC129825tm;
            this.A01 = this.A08.A01(abstractC129825tm, z);
            C50576MUh c50576MUh = this.A09;
            C141796aw A00 = AbstractC141776au.A00(this);
            if (AbstractC167007dF.A1Z(c50576MUh.A03) && c50576MUh.A00) {
                c50576MUh.A00(A00);
                c50576MUh.A00 = false;
            }
            PZG.A01(this, AbstractC141776au.A00(this), 1);
        }
        return C0ST.A01(AbstractC43593JPy.A16(C10Q.A02(new ActivityFeedViewModel$getUiState$2(abstractC129825tm, this, null, A1F), this.A01.A04, this.A0K, this.A0D, this.A0E, this.A0L), this.A0F, 34));
    }
}

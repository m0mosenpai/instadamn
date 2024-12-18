package com.instagram.newsfeed.data;

import X.AbstractC129825tm;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.C05F;
import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import X.C19L;
import X.C206649Cv;
import X.C4A7;
import X.C4A8;
import X.C4DT;
import X.C92654Da;
import X.C92664Db;
import X.C92674Dc;
import X.C92694De;
import X.C9CN;
import com.instagram.common.session.UserSession;
import com.instagram.repository.common.MemoryCache;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ActivityFeedRepository extends C4A7 {
    public final C92694De A00;
    public final UserSession A01;
    public final C92654Da A02;
    public final C4DT A03;
    public final MemoryCache A04;
    public final C92664Db A05;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC11380iw r14, java.lang.String r15, X.InterfaceC23621Ds r16, boolean r17) {
        /*
            r13 = this;
            r7 = r15
            r3 = 40
            r5 = r16
            boolean r0 = X.C9CY.A00(r5, r3)
            if (r0 == 0) goto L7a
            r4 = r5
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.A00 = r2
        L19:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L4e
            if (r0 != r2) goto L86
            java.lang.Object r7 = r4.A01
            java.lang.String r7 = (java.lang.String) r7
            X.AbstractC09560e7.A00(r1)
        L2b:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L4b
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L80
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r2 = r1.A00
            X.5If r2 = (X.AbstractC115105If) r2
            boolean r1 = r2 instanceof X.C115115Ig
            r0 = 0
            if (r1 == 0) goto L48
            X.5Ig r2 = (X.C115115Ig) r2
            if (r2 == 0) goto L48
            java.lang.Object r0 = r2.A00
            X.N2k r0 = (X.C52084N2k) r0
        L48:
            X.AbstractC55152OdF.A04(r0, r7)
        L4b:
            X.0eB r3 = X.C0eB.A00
            return r3
        L4e:
            X.AbstractC09560e7.A00(r1)
            X.4Da r0 = r13.A02
            r0.A00()
            com.instagram.common.session.UserSession r5 = r13.A01
            r6 = 0
            java.lang.String r8 = r14.getModuleName()
            r11 = 0
            r9 = -1
            r10 = r9
            r12 = r11
            if (r17 == 0) goto L75
            X.1ON r1 = X.AbstractC55152OdF.A01(r5, r6, r7, r8, r9, r10, r11, r12)
        L67:
            r4.A01 = r15
            r4.A00 = r2
            r0 = 2109432776(0x7dbb63c8, float:3.1135466E37)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r3) goto L2b
            return r3
        L75:
            X.1ON r1 = X.AbstractC55152OdF.A02(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L67
        L7a:
            X.9CY r4 = new X.9CY
            r4.<init>(r13, r5, r3)
            goto L19
        L80:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L86:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.data.ActivityFeedRepository.A02(X.0iw, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    public static final boolean A00(ActivityFeedRepository activityFeedRepository) {
        C92654Da c92654Da = activityFeedRepository.A02;
        if (System.currentTimeMillis() >= c92654Da.A00 + 10000 && !c92654Da.A02.A01.getBoolean("notification_feed_is_304_disabled", false)) {
            if (C18U.A06(C06090Tz.A05, c92654Da.A01, 36317934217336534L)) {
                return true;
            }
        }
        return false;
    }

    public final void A03(boolean z) {
        if (!z && !this.A05.A00.A01.getBoolean("HAS_NEW_NOTIFICATION", false)) {
            return;
        }
        C19L c19l = super.A01;
        C206649Cv c206649Cv = new C206649Cv(this, null, 26);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
    }

    public ActivityFeedRepository(UserSession userSession, C92654Da c92654Da, C92664Db c92664Db, C4DT c4dt, MemoryCache memoryCache) {
        super("ActivityFeed", C4A8.A01(2109432776, 3));
        this.A01 = userSession;
        this.A03 = c4dt;
        this.A04 = memoryCache;
        this.A02 = c92654Da;
        this.A05 = c92664Db;
        this.A00 = new C92694De(C92674Dc.A00);
    }

    public final ActivityPagedData A01(AbstractC129825tm abstractC129825tm, boolean z) {
        String obj = Locale.getDefault().toString();
        C14360o3.A07(obj);
        return new ActivityPagedData(new C9CN(abstractC129825tm, obj), this.A01, this.A03, this.A04, z, A00(this));
    }
}

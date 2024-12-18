package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2pD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60302pD implements InterfaceC12870lZ, InterfaceC13000lm {
    public static final C60312pE A04 = new Object();
    public final Context A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final UserSession A02;
    public final C23031Ai A03;

    public final void A04(long j) {
        C23031Ai c23031Ai = this.A03;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + j;
        InterfaceC19610xo ARD = c23031Ai.A01.ARD();
        ARD.E7G("bg_fetch_schedule_target_ms", currentTimeMillis);
        ARD.apply();
        A02(Integer.valueOf(R.id.background_prefetch_job_scheduler_id), "BackgroundPrefetchJobService", new C207039Ei(this, j, 6), j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ae, code lost:
    
        if ((r26 + r8) < r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c9, code lost:
    
        if (r22 > r10) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fc, code lost:
    
        if (r0 == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C60302pD r39) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60302pD.A01(X.2pD):void");
    }

    private final void A02(Integer num, String str, InterfaceC16820sZ interfaceC16820sZ, long j) {
        C111314zu c111314zu = new C111314zu(this.A02, 276374386);
        c111314zu.A03();
        if (C111314zu.A01(c111314zu)) {
            C1QT c1qt = c111314zu.A02;
            long j2 = c111314zu.A01;
            c1qt.flowAnnotate(j2, "scheduled_latency_ms", j);
            c1qt.flowAnnotate(j2, "job_class", str);
            c1qt.flowAnnotate(j2, "standby_bucket", C111314zu.A00(c111314zu));
            c1qt.flowAnnotate(j2, "is_backgrounded", C218914p.A08());
            c1qt.flowAnnotate(j2, "job_id", num.intValue());
        }
        interfaceC16820sZ.invoke();
        if (C111314zu.A01(c111314zu)) {
            c111314zu.A02.flowEndSuccess(c111314zu.A01);
        }
    }

    public final void A05(long j) {
        A02(Integer.valueOf(R.id.feed_background_prefetch_job_scheduler_id), "MainFeedBackgroundPrefetchJobService", new C9GY(j, this, 4), j);
    }

    public final void A06(long j) {
        A02(Integer.valueOf(R.id.story_background_prefetch_job_scheduler_id), "StoryBackgroundPrefetchJobService", new C207039Ei(this, j, 7), j);
    }

    public C60302pD(Context context, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = AbstractC23021Ah.A00(userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.InterfaceC65459TkV r13, X.C4Mk r14, java.lang.Integer r15, long r16) {
        /*
            r12 = this;
            int r3 = r15.intValue()
            r2 = 1
            r1 = 2
            r8 = 0
            r10 = r16
            if (r3 == r2) goto L93
            r0 = 0
            if (r3 == r0) goto L3c
            if (r3 != r1) goto La7
            int r0 = r14.ordinal()
            if (r0 == r1) goto L32
            if (r0 != r2) goto La7
            com.instagram.common.session.UserSession r3 = r12.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36597678322289530(0x82056500010b7a, double:3.207857365813447E-306)
        L22:
            long r1 = X.C18U.A01(r2, r3, r0)
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 * r3
        L2a:
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto La7
            r13.DaB(r1)
            return
        L32:
            com.instagram.common.session.UserSession r3 = r12.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36596763494451837(0x82049000040a7d, double:3.2072788250051736E-306)
            goto L22
        L3c:
            int r0 = r14.ordinal()
            if (r0 == r1) goto L87
            if (r0 != r2) goto La7
            X.1Ai r0 = r12.A03
            X.C14360o3.A0B(r0, r2)
            long r6 = java.lang.System.currentTimeMillis()
            java.util.List r0 = X.AbstractC225749xt.A00(r0)
            java.util.ArrayList r0 = X.AbstractC001800i.A0U(r0)
            X.C01T.A1C(r0)
            java.util.Iterator r5 = r0.iterator()
        L5c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La7
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r1 = r6 / r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L5c
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L78:
            if (r0 == 0) goto La7
            long r1 = r0.longValue()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            long r3 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            goto L2a
        L87:
            X.1Ai r1 = r12.A03
            X.L9P r0 = new X.L9P
            r0.<init>(r1)
            java.lang.Long r0 = r0.A01()
            goto L78
        L93:
            com.instagram.common.session.UserSession r1 = r12.A02
            android.content.Context r0 = r12.A00
            com.instagram.casper.IgSignalsCasper r0 = X.AbstractC46292Aq.A00(r0, r1)
            if (r0 == 0) goto La7
            r14 = 8
            X.Tc7 r9 = new X.Tc7
            r9.<init>(r10, r12, r13, r14)
            r0.A03(r9)
        La7:
            r13.DaB(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60302pD.A00(X.TkV, X.4Mk, java.lang.Integer, long):void");
    }

    public final void A03() {
        for (C4Mk c4Mk : C4Mk.values()) {
            C40Y.A00(this.A00, this.A02).A04(new C902040d(new C901940c(c4Mk.A01, c4Mk.A00)));
        }
        InterfaceC19610xo ARD = this.A03.A01.ARD();
        ARD.EEj("bg_fetch_schedule_target_ms");
        ARD.apply();
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1668738042);
        if (C18U.A06(C06090Tz.A05, this.A02, 36326816209778828L)) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk(913571864) { // from class: X.0vQ
                @Override // java.lang.Runnable
                public final void run() {
                    runnable.run();
                }
            });
        } else {
            A01(this);
        }
        C0f9.A0A(1468357340, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-954288967);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3Js
            {
                super(1667153338, 3, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                C60302pD.this.A03();
            }
        });
        C0f9.A0A(-103069644, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        A03();
        C218914p.A06(this);
    }
}

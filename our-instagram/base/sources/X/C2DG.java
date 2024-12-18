package X;

import android.content.Context;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2DG, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DG implements InterfaceC13000lm {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final InterfaceC12870lZ A08;
    public final UserSession A09;
    public final C18240vB A0A;

    public static C2DG A00(final UserSession userSession) {
        return (C2DG) userSession.A01(C2DG.class, new InterfaceC16820sZ() { // from class: X.2DH
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C2DG(AbstractC12290kX.A00, UserSession.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a8, code lost:
    
        if (X.C18U.A06(r4, r8.A02, 36328061751278730L) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012e, code lost:
    
        if ((r12 - r8.A04.A01.getLong("last_interop_sync_time", 0)) > java.util.concurrent.TimeUnit.HOURS.toMillis(((java.lang.Number) r8.A08.getValue()).longValue())) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.C2DG r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2DG.A01(X.2DG):void");
    }

    public static void A02(C2DG c2dg) {
        boolean z;
        final C6JS A00;
        UserSession userSession = c2dg.A09;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36326897814091955L)) {
            A03(c2dg);
            z = true;
        } else {
            z = false;
        }
        if (C18U.A06(c06090Tz, userSession, 36324243524300807L)) {
            synchronized (C6JS.class) {
                A00 = C6JS.A05.A00(userSession);
            }
            final C6JU c6ju = new C6JU(c2dg, z);
            UserSession userSession2 = A00.A03;
            if (C18U.A06(c06090Tz, userSession2, 36324243524366344L)) {
                AbstractC09800fd.A01("IGDWellbeingDatabase.initializeWellbeingDatabase", -1488947350);
                try {
                    C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9Ae
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(15289485, 3, false, false);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C6JS.A00(c6ju, A00);
                        }
                    });
                    AbstractC09800fd.A00(-780312779);
                    return;
                } catch (Throwable th) {
                    AbstractC09800fd.A00(1247108641);
                    throw th;
                }
            }
            new C41761wQ(null).A02(C42221xC.A09(C61A.A02(userSession2, true)), new InterfaceC42241xE() { // from class: X.9Al
                @Override // X.InterfaceC42241xE
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    AccountSession accountSession = (AccountSession) obj;
                    C14360o3.A0A(accountSession);
                    C99R A002 = C99Q.A00(accountSession, "initializeWellbeingDatabase");
                    final C6JS c6js = A00;
                    final C6JU c6ju2 = c6ju;
                    A002.execute(new Runnable() { // from class: X.9Am
                        @Override // java.lang.Runnable
                        public final void run() {
                            C6JS.A00(c6ju2, c6js);
                        }
                    });
                }
            });
            C99Q.A00(C61A.A02(userSession2, true), "initializeWellbeingDatabase").execute(new Runnable() { // from class: X.9An
                @Override // java.lang.Runnable
                public final void run() {
                    C6JS.A00(c6ju, A00);
                }
            });
        }
    }

    public static void A03(C2DG c2dg) {
        if (!c2dg.A03) {
            c2dg.A0A.ATO(new C6JR(c2dg));
        }
    }

    public static void A04(C2DG c2dg) {
        UserSession userSession = c2dg.A09;
        C14360o3.A0B(userSession, 0);
        if (C18U.A06(C06090Tz.A05, userSession, 36325763942724939L)) {
            C2JM c2jm = new C2JM();
            C2JM c2jm2 = new C2JM();
            String str = userSession.userId;
            c2jm.A04(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            boolean z = false;
            if (str != null) {
                z = true;
            }
            C18C.A0E(z);
            C2JQ c2jq = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "HasMEmuProfile", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67003Ueo.class, false, null, 0, null, "xfb_has_memu_profile", new ArrayList());
            AbstractC40691uc.A01(userSession).ATV(C23361AXk.A00, new C28910CpJ(userSession), pandoGraphQLRequest);
        }
    }

    public static void A05(C2DG c2dg, Integer num) {
        UserSession userSession = c2dg.A09;
        if (AbstractC23021Ah.A00(userSession).A22()) {
            AbstractC92924Ek.A00(userSession).A06(num);
        }
    }

    public static void A06(final C2DG c2dg, final String str) {
        UserSession userSession = c2dg.A09;
        if (userSession.isStopped()) {
            C0K8.A0E("DirectUserScopedInitializer", "Trying to initialize Round Robin sync for a stopped user session");
            return;
        }
        if (C218914p.A08()) {
            return;
        }
        final C47142Eg A00 = AbstractC47132Ef.A00(userSession);
        if (!((Boolean) A00.A0y.A00()).booleanValue() && !((Boolean) A00.A10.A00()).booleanValue()) {
            return;
        }
        AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.5sb
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("InitMultiInstancesSyncForAllBackgroundAccounts", 726478904, 5, false, false);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0139, code lost:
            
                if (r5.equals("apps_start_offline_completion") != false) goto L68;
             */
            /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:86:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0097  */
            /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, X.KoK] */
            @Override // X.AbstractC18280vF
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void loggedRun() {
                /*
                    Method dump skipped, instructions count: 454
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C129145sb.loggedRun():void");
            }
        });
    }

    public static void A07(final C2DG c2dg, final String str, final boolean z) {
        if (c2dg.A06) {
            if (C18U.A06(C06090Tz.A05, c2dg.A09, 36326154785470136L)) {
                return;
            }
        }
        c2dg.A06 = true;
        UserSession userSession = c2dg.A09;
        if (AbstractC47132Ef.A00(userSession).A02()) {
            C14360o3.A0B(userSession, 0);
            C99H c99h = (C99H) userSession.A01(C99H.class, new MHJ(userSession, 36));
            C006802i c006802i = c99h.A02;
            int i = c99h.A01;
            if (!c006802i.isMarkerOn(20127518, i) && !c99h.A00) {
                c99h.A00 = true;
                c006802i.markerStart(20127518, i, false);
                if (c006802i.isMarkerOn(20127518, i)) {
                    c006802i.markerAnnotate(20127518, i, "msys_callsite", str);
                }
            }
            Execution.initialize();
            TraceLogger.addConfig(34, 1, 1, 0);
            TraceLogger.createBootstrapTrace(true);
        }
        final SessionedNotificationCenter sessionedNotificationCenter = C61A.A02(userSession, true).getSessionedNotificationCenter();
        sessionedNotificationCenter.addObserver(new C6Eh() { // from class: X.99I
            @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
            public final void onNewNotification(String str2, InterfaceC49122Nj interfaceC49122Nj, Map map) {
                C2DG.A06(c2dg, "apps_start_offline_completion");
                sessionedNotificationCenter.removeObserver(this, "MEMOfflineMessageProcessingFinishedNotification", null);
            }
        }, "MEMOfflineMessageProcessingFinishedNotification", 1, null);
        C99K c99k = new C99K(c2dg.A07, C18U.A06(C06090Tz.A05, userSession, 36328066045852820L));
        C57243PbR c57243PbR = new C57243PbR(c99k, 41);
        if (c99k.A05) {
            synchronized (c99k) {
                c57243PbR.invoke();
            }
        }
        C2FQ A00 = C2FO.A00(userSession);
        C006802i c006802i2 = A00.A02;
        int i2 = A00.A01;
        int i3 = A00.A00;
        if (c006802i2.isMarkerOn(i2, i3)) {
            c006802i2.markerPoint(i2, i3, "init_msys_armadillo");
            A00.A06++;
            c006802i2.markerAnnotate(i2, i3, "msys_init_attempt", A00.A06);
        }
        IGFOAMessagingReadyLogger A002 = C47272Eu.A00(userSession);
        if (A002 != null) {
            A002.onLogInitMsysArmadillo();
            A002.annotateMsysCallsite(str);
        }
        C2FO.A00(userSession).A06("msys_callsite", str);
        C99Q.A01("DirectUserScopedInitializer.maybeInitializeMsys").execute(new Runnable() { // from class: X.99S
            /* JADX WARN: Removed duplicated region for block: B:128:0x015e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0159 A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r15v0, types: [X.0ps, java.lang.Object] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1123
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C99S.run():void");
            }
        });
    }

    public final void A09(String str) {
        A0B(A08(this.A09), str);
    }

    public final void A0A(final String str) {
        if (!this.A04) {
            final int intValue = Long.valueOf(C18U.A01(C06090Tz.A05, this.A09, 36607629762041472L)).intValue();
            this.A04 = true;
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF(intValue) { // from class: X.518
                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    C2DG c2dg = C2DG.this;
                    UserSession userSession = c2dg.A09;
                    if (userSession.hasEnded()) {
                        C0w9.A03("DirectUserScopedInitializer", "Trying to initialize msys for an ended user session in critical path.");
                        C2FO.A00(userSession).A04("stop_for_ended_user_session_in_critical_path");
                    } else {
                        C2DG.A01(c2dg);
                        C2DG.A07(c2dg, str, C2DG.A08(userSession));
                    }
                }
            });
        }
        UserSession userSession = this.A09;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (((int) C18U.A01(c06090Tz, userSession, 36600336908160885L)) >= 0) {
            AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.519
                {
                    super("CleanExpiredArmadilloExpressMessages", 953162525, 5, false, false);
                }

                @Override // X.AbstractC18280vF
                public final void loggedRun() {
                    UserSession userSession2 = C2DG.this.A09;
                    C14360o3.A0B(userSession2, 0);
                    C99V.A00(userSession2).A00(new Long((System.currentTimeMillis() - (((int) C18U.A01(C06090Tz.A05, userSession2, 36600336908160885L)) * 86400000)) / 1000).intValue());
                }
            });
        }
        if (!this.A05 && C18U.A06(c06090Tz, userSession, 36320283568644402L)) {
            this.A05 = true;
            AbstractC24641Ih.A02.Ep8(new C45728KMf(this));
        }
    }

    public final void A0B(boolean z, String str) {
        if (!this.A04) {
            this.A04 = true;
            A01(this);
        }
        A07(this, str, z);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this.A08);
    }

    public C2DG(Context context, UserSession userSession) {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "DirectUserScopedInitializer";
        this.A0A = new C18240vB(A00);
        this.A05 = false;
        this.A08 = new InterfaceC12870lZ() { // from class: X.2DI
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                C0f9.A0A(-645608863, C0f9.A03(-1465884334));
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int A03 = C0f9.A03(-437966476);
                C2DG c2dg = C2DG.this;
                C2DG.A04(c2dg);
                C2DG.A06(c2dg, "apps_resume");
                C0f9.A0A(35583289, A03);
            }
        };
        this.A07 = context.getApplicationContext();
        this.A09 = userSession;
    }

    public static boolean A08(UserSession userSession) {
        if (AbstractC47132Ef.A00(userSession).A01() && ((Boolean) AbstractC47132Ef.A00(userSession).A04.get()).booleanValue()) {
            return true;
        }
        return false;
    }
}

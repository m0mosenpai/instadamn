package X;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.direct.notifications.armadillo.service.IgSecureMessageOverWANotificationService;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Map;

/* renamed from: X.6Ly, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137766Ly {
    public static C137766Ly A0L;
    public final C42221xC A04;
    public final C42221xC A05;
    public final C42221xC A06;
    public final C42221xC A07;
    public final C42221xC A08;
    public final C42221xC A09;
    public final C42221xC A0A;
    public final C42221xC A0B;
    public final C42221xC A0C;
    public final C42221xC A0D;
    public final C137096In A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final C42221xC A0K;
    public final C42201xA A03 = AbstractC42021ws.A01(true);
    public final C2ES A0E = C2EP.A00();
    public final C2ES A0F = C2EP.A00();
    public final C6Eh A00 = new C6Eh() { // from class: X.6Io
        @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
        public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
            long now;
            C137766Ly.this.A03.accept(true);
            Context applicationContext = AbstractC12290kX.A00.getApplicationContext();
            C14360o3.A0B(applicationContext, 0);
            long j = AbstractC129105sV.A00;
            if (j == -1) {
                now = 0;
            } else {
                now = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT - (AbstractC129105sV.A02.now() - j);
            }
            Intent intent = new Intent(applicationContext, (Class<?>) IgSecureMessageOverWANotificationService.class);
            if (now > 0) {
                AbstractC129105sV.A01.postDelayed(new RunnableC56987PQd(intent, applicationContext), now);
            } else {
                C12260kU.A00.A07().A0D(applicationContext, intent);
            }
        }
    };
    public final C6Eh A01 = new C6Eh() { // from class: X.6Ip
        @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
        public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
            C137766Ly.this.A03.accept(false);
        }
    };
    public final C6Eh A02 = new C6Eh() { // from class: X.6Iq
        @Override // com.facebook.msys.mci.NotificationCenterInternal.NotificationCallbackInternal
        public final void onNewNotification(String str, InterfaceC49122Nj interfaceC49122Nj, Map map) {
            C137766Ly c137766Ly = C137766Ly.this;
            if (map != null) {
                java.util.Set set = (java.util.Set) map.get("MEMRemovedMessageIdUserInfoKey");
                Object obj = map.get("MEMRemovedThreadPkUserInfoKey");
                if (set != null && !set.isEmpty()) {
                    c137766Ly.A0E.accept(set);
                }
                if (obj != null) {
                    c137766Ly.A0F.accept(obj);
                }
            }
        }
    };
    public final Handler A0J = new Handler(Looper.getMainLooper());

    static {
        AbstractC42051wv abstractC42051wv = C137776Lz.A00;
        A0L = new C137766Ly(new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), new C42221xC(abstractC42051wv), C137096In.A02, false, false);
    }

    public static C42221xC A00(C137766Ly c137766Ly) {
        return c137766Ly.A04.A0L(new C6D2() { // from class: X.6JP
            @Override // X.C6D2
            public final Object apply(Object obj) {
                final Mailbox mailbox = (Mailbox) obj;
                C137766Ly c137766Ly2 = C137766Ly.A0L;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.JSX
                    @Override // X.InterfaceC1345866i
                    public final void EpD(final C1346766r c1346766r) {
                        final Mailbox mailbox2 = Mailbox.this;
                        C137766Ly c137766Ly3 = C137766Ly.A0L;
                        c1346766r.getClass();
                        final InterfaceC41521w1 interfaceC41521w1 = new InterfaceC41521w1() { // from class: X.69f
                            @Override // X.InterfaceC41521w1
                            public final void DpC(java.util.Set set) {
                                C1346766r.this.A02(set);
                            }
                        };
                        c1346766r.A01(new InterfaceC1350869h() { // from class: X.69g
                            @Override // X.InterfaceC1350869h
                            public final void cancel() {
                                Mailbox mailbox3 = mailbox2;
                                InterfaceC41521w1 interfaceC41521w12 = interfaceC41521w1;
                                C137766Ly c137766Ly4 = C137766Ly.A0L;
                                mailbox3.mStoredProcedureChangedListeners.remove(interfaceC41521w12);
                            }
                        });
                        mailbox2.addStoredProcedureChangedListener(interfaceC41521w1);
                    }
                }, AbstractC137146It.A00("stored_procedure_listener"));
            }
        });
    }

    public final C42221xC A01(final MsysThreadId msysThreadId) {
        return this.A09.A0L(new C6D2() { // from class: X.LaD
            @Override // X.C6D2
            public final Object apply(Object obj) {
                MsysThreadId msysThreadId2 = MsysThreadId.this;
                C137766Ly c137766Ly = C137766Ly.A0L;
                return C42221xC.A07(new C44091JeG(10, msysThreadId2, obj), AbstractC137146It.A00("load_secure_participants"));
            }
        });
    }

    public final C42221xC A02(final MsysThreadId msysThreadId) {
        return C42221xC.A01(new YO2() { // from class: X.La3
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
            
                if (r4 != false) goto L11;
             */
            @Override // X.YO2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r93, java.lang.Object r94) {
                /*
                    Method dump skipped, instructions count: 363
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C48330La3.apply(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, this.A09.A0L(new C48339LaF(msysThreadId)), A01(msysThreadId));
    }

    public C137766Ly(C42221xC c42221xC, C42221xC c42221xC2, C42221xC c42221xC3, C42221xC c42221xC4, C42221xC c42221xC5, C42221xC c42221xC6, C42221xC c42221xC7, C42221xC c42221xC8, C42221xC c42221xC9, C42221xC c42221xC10, C42221xC c42221xC11, C137096In c137096In, boolean z, boolean z2) {
        this.A04 = c42221xC;
        this.A09 = c42221xC2;
        this.A08 = c42221xC3;
        this.A0K = c42221xC4;
        this.A0A = c42221xC5;
        this.A0B = c42221xC6;
        this.A0C = c42221xC7;
        this.A05 = c42221xC8;
        this.A0D = c42221xC9;
        this.A06 = c42221xC10;
        this.A0G = c137096In;
        this.A0I = z2;
        this.A0H = z;
        this.A07 = c42221xC11;
        final C41761wQ c41761wQ = new C41761wQ(null);
        c41761wQ.A02(c42221xC.A0K(new C6D2() { // from class: X.6Ir
            @Override // X.C6D2
            public final Object apply(Object obj) {
                C137766Ly c137766Ly = C137766Ly.A0L;
                return ((Mailbox) obj).getAccountSession();
            }
        }), new InterfaceC42241xE() { // from class: X.6Is
            @Override // X.InterfaceC42241xE
            public final void accept(Object obj) {
                C137766Ly c137766Ly = this;
                C41761wQ c41761wQ2 = c41761wQ;
                SessionedNotificationCenter sessionedNotificationCenter = ((AccountSession) obj).getSessionedNotificationCenter();
                sessionedNotificationCenter.addObserver(c137766Ly.A00, "MEMOfflineHandlingCompletionNotification", 1, null);
                sessionedNotificationCenter.addObserver(c137766Ly.A01, "MEMOfflineHandlingPreviewNotification", 1, null);
                sessionedNotificationCenter.addObserver(c137766Ly.A02, "MEMRemovedMessageIdReadyNotification", 1, null);
                c41761wQ2.A01();
            }
        });
    }
}

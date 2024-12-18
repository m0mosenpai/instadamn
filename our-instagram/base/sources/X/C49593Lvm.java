package X;

import android.os.Handler;
import com.facebook.advancedcryptotransport.ACTRegistrationDeviceIdProvider;
import com.facebook.advancedcryptotransport.PlatformStorageProvider;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.ExecutionLogger;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Lvm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49593Lvm implements InterfaceC03950Jk {
    public int A00;
    public Handler A01;
    public C006802i A02;
    public UserSession A03;
    public C2FQ A04;
    public InterfaceC03960Jm A05;
    public IGFOAMessagingReadyLogger A06;
    public java.util.Set A07;
    public java.util.Set A08;
    public java.util.Set A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final MailboxCallback A0E;
    public final C6Eh A0F;
    public final C6Eh A0G;
    public final C6Eh A0H;
    public final C41761wQ A0I;
    public final C41761wQ A0J;
    public final C41761wQ A0K;
    public final C41761wQ A0L;
    public final C132515ya A0M;
    public final String A0N;
    public final String A0O;
    public final HashMap A0P;
    public final AtomicBoolean A0Q;

    public C49593Lvm(MailboxCallback mailboxCallback, C132515ya c132515ya, String str, String str2, HashMap hashMap) {
        AbstractC167007dF.A1D(str, 1, str2);
        this.A0N = str;
        this.A0O = str2;
        this.A0P = hashMap;
        this.A0M = c132515ya;
        this.A0E = mailboxCallback;
        this.A0G = new LVO(this, 5);
        this.A0H = new LVO(this, 6);
        this.A0F = new LVO(this, 4);
        this.A0Q = AbstractC166997dE.A17();
        this.A0C = true;
        this.A07 = AbstractC31171DnF.A0l();
        this.A08 = AbstractC31171DnF.A0l();
        this.A09 = AbstractC31171DnF.A0l();
        this.A0L = new C41761wQ(null);
        this.A0K = new C41761wQ(null);
        this.A0I = new C41761wQ(null);
        this.A0J = new C41761wQ(null);
    }

    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        String str;
        LG5 A00;
        C135816Cj c135816Cj;
        String str2;
        C132515ya c132515ya;
        String str3;
        AbstractC167007dF.A1D(userSession, 0, interfaceC03960Jm);
        if (AbstractC94034Kn.A00(userSession)) {
            boolean A09 = C023409i.A0A.A09(userSession);
            c132515ya = this.A0M;
            if (A09) {
                if (c132515ya != null) {
                    str3 = "user_session_active";
                    c132515ya.A05(str3);
                }
                interfaceC03960Jm.AIn(null);
            }
            if (c132515ya != null) {
                str3 = "foreground_account";
                c132515ya.A05(str3);
            }
            interfaceC03960Jm.AIn(null);
        }
        C47142Eg A002 = AbstractC47132Ef.A00(userSession);
        if (!AbstractC31177DnL.A1Z(A002.A10) && !C14360o3.A0K(this.A0O, "push_notification")) {
            c132515ya = this.A0M;
            if (c132515ya != null) {
                str3 = "mi_disabled";
                c132515ya.A05(str3);
            }
        } else if (!AbstractC31177DnL.A1Z(A002.A0x) || AbstractC15820qc.A0F(AbstractC25225BEi.A0F(userSession))) {
            this.A0A = AbstractC31177DnL.A1Z(A002.A0A);
            C2FQ A003 = C2FO.A00(userSession);
            this.A04 = A003;
            if (A003 != null) {
                A003.A07(false, true);
            }
            C2F2 A01 = C47272Eu.A01(userSession);
            this.A06 = A01;
            A01.onStartFlow(false, true);
            Map A0n = AbstractC167007dF.A0n("TraceId", AbstractC166997dE.A0n());
            C132515ya c132515ya2 = this.A0M;
            if (c132515ya2 != null) {
                C132525yb c132525yb = c132515ya2.A02;
                if (c132525yb.A06 && c132525yb.A03) {
                    UserFlowLogger userFlowLogger = c132525yb.A05;
                    long j = c132525yb.A04;
                    C9C9 c9c9 = C132525yb.A0G;
                    userFlowLogger.flowMarkPoint(j, c9c9.A01);
                    userFlowLogger.flowAnnotateWithCrucialData(j, "c", c9c9.A00);
                }
            }
            this.A03 = userSession;
            this.A05 = interfaceC03960Jm;
            C006802i c006802i = C006802i.A0p;
            this.A02 = c006802i;
            if (c006802i != null) {
                c006802i.markerStart(755177991, A00(this), false);
            }
            ExecutionLogger.activeFlowMarkerStart(755177991);
            C006802i c006802i2 = this.A02;
            if (c006802i2 != null) {
                MarkerEditor withMarker = c006802i2.withMarker(755177991);
                withMarker.setSurviveUserSwitch(true);
                withMarker.markerEditingCompleted();
            }
            A04(this, null, null, "SyncBatchId", this.A0N);
            A04(this, null, null, "SyncTriggerFrom", this.A0O);
            A04(this, Boolean.valueOf(AbstractC14480oK.A01(AbstractC12290kX.A00)), null, "IsDeviceNotificationEnabled", null);
            A04(this, null, null, "TraceId", (String) A0n.get("TraceId"));
            if (C218914p.A08()) {
                str = AppStateModule.APP_STATE_BACKGROUND;
            } else {
                str = "foreground";
            }
            A04(this, null, null, "AppState", str);
            UserSession userSession2 = this.A03;
            if (userSession2 != null) {
                long A0N = AbstractC166987dD.A0N(AbstractC47132Ef.A00(userSession2).A11.A00());
                if (A0N > 0) {
                    Handler handler = this.A01;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                    Handler A0J = AbstractC167007dF.A0J();
                    this.A01 = A0J;
                    A0J.postDelayed(new M1M(this), 1000 * A0N);
                }
                boolean A04 = AbstractC453326q.A04(userSession);
                C15370ps A1F = AbstractC25225BEi.A1F();
                if (A04) {
                    C1334460n A004 = C1334460n.A00(userSession, EnumC132075xi.A0d);
                    A1F.A00 = A004;
                    c135816Cj = A004.A04;
                    C42201xA c42201xA = AbstractC41841wY.A00(userSession).A00;
                    C50367MLu A012 = C50367MLu.A01(this, 35);
                    C41761wQ c41761wQ = this.A0L;
                    c41761wQ.A01();
                    C49799Lz6.A00(c42201xA.A0F(), c41761wQ, A012, 0);
                    A00 = null;
                } else {
                    A00 = LG5.A05.A00(userSession);
                    c135816Cj = A00.A02;
                    C42201xA c42201xA2 = A00.A01;
                    C50367MLu A013 = C50367MLu.A01(this, 36);
                    C41761wQ c41761wQ2 = this.A0L;
                    c41761wQ2.A01();
                    C49799Lz6.A00(c42201xA2.A0F(), c41761wQ2, A013, 0);
                }
                C50367MLu A014 = C50367MLu.A01(this, 34);
                C41761wQ c41761wQ3 = this.A0K;
                c41761wQ3.A01();
                UserSession userSession3 = this.A03;
                if (userSession3 != null) {
                    C49799Lz6.A00(C6AH.A00(userSession3).A0D.A0F(), c41761wQ3, A014, 0);
                    C50367MLu A015 = C50367MLu.A01(this, 32);
                    C41761wQ c41761wQ4 = this.A0I;
                    c41761wQ4.A01();
                    UserSession userSession4 = this.A03;
                    if (userSession4 != null) {
                        C49799Lz6.A00(C6AH.A00(userSession4).A0B.A0F(), c41761wQ4, A015, 0);
                        C50367MLu A016 = C50367MLu.A01(this, 33);
                        C41761wQ c41761wQ5 = this.A0J;
                        c41761wQ5.A01();
                        UserSession userSession5 = this.A03;
                        if (userSession5 != null) {
                            C49799Lz6.A00(C6AH.A00(userSession5).A0C.A0F(), c41761wQ5, A016, 0);
                            UserSession userSession6 = this.A03;
                            if (userSession6 != null) {
                                SessionedNotificationCenter sessionedNotificationCenter = C61A.A02(userSession6, false).getSessionedNotificationCenter();
                                C14360o3.A07(sessionedNotificationCenter);
                                sessionedNotificationCenter.addObserver(this.A0H, "MEMOfflineHandlingCompletionNotification", 1, null);
                                UserSession userSession7 = this.A03;
                                if (userSession7 != null) {
                                    SessionedNotificationCenter sessionedNotificationCenter2 = C61A.A02(userSession7, false).getSessionedNotificationCenter();
                                    C14360o3.A07(sessionedNotificationCenter2);
                                    sessionedNotificationCenter2.addObserver(this.A0F, "MEBHandleProtobufBackupWriteResultNotification", 1, null);
                                    UserSession userSession8 = this.A03;
                                    if (userSession8 != null) {
                                        if (AbstractC31177DnL.A1Z(AbstractC47132Ef.A00(userSession8).A12)) {
                                            UserSession userSession9 = this.A03;
                                            if (userSession9 != null) {
                                                SessionedNotificationCenter sessionedNotificationCenter3 = C61A.A02(userSession9, false).getSessionedNotificationCenter();
                                                C14360o3.A07(sessionedNotificationCenter3);
                                                sessionedNotificationCenter3.addObserver(this.A0G, "MEMContextConnectionStateChangeNotification", 5, null);
                                            } else {
                                                throw AbstractC166997dE.A0g();
                                            }
                                        }
                                        C135656Br c135656Br = new C135656Br(C61A.A02(userSession, false));
                                        ME4 me4 = new ME4(20, c135656Br, this, A002);
                                        if (C99Y.A00.A03(userSession, true)) {
                                            A04(this, null, null, "SyncInstanceType", "mem");
                                            ACTRegistrationDeviceIdProvider.initialize(AbstractC12290kX.A00);
                                            ((C48521LdJ) userSession.A01(C48521LdJ.class, MHS.A00(userSession, 28))).A00(new C50363MLp(41, me4, this));
                                            return;
                                        }
                                        if (A04) {
                                            A04(this, null, null, "SyncInstanceType", "mailbox");
                                            if (A1F.A00 != null) {
                                                C9AH.A00(userSession).initialize("multi_instance_sync");
                                                ((C1334460n) A1F.A00).A03(new M8J(userSession, this, me4, A1F));
                                                return;
                                            }
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                        A04(this, null, null, "SyncInstanceType", "message_sync_service");
                                        if (A00 != null) {
                                            C43752JWo c43752JWo = new C43752JWo(12, this, me4, A0n, userSession, c135656Br, c135816Cj);
                                            boolean z = true;
                                            if (A00.A03.getAndSet(true)) {
                                                return;
                                            }
                                            PlatformStorageProvider.initialize(AbstractC12290kX.A00);
                                            AccountSession accountSession = A00.A02.A01.A00.A02;
                                            String A005 = AbstractC111324zv.A00(1423);
                                            synchronized (accountSession) {
                                                str2 = accountSession.mInjectedMailboxType;
                                            }
                                            String A0R = AnonymousClass001.A0R(A005, str2);
                                            C02R.A07(accountSession.isValid(), AnonymousClass001.A0R("IgMsysMessageSyncServiceProvider: invalid account session", A0R));
                                            if (accountSession.getState() != 1) {
                                                z = false;
                                            }
                                            C02R.A07(z, AnonymousClass001.A0c("IgMsysMessageSyncServiceProvider: invalid account session state ", A0R, accountSession.getState()));
                                            accountSession.setInjectedMailboxType_DO_NOT_USE("message_sync_service");
                                            A00.A00.A00(new C44176Jff(46, c43752JWo, A00));
                                            return;
                                        }
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                                throw AbstractC166997dE.A0g();
                            }
                            throw AbstractC166997dE.A0g();
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        interfaceC03960Jm.AIn(null);
    }

    public static final int A00(C49593Lvm c49593Lvm) {
        UserSession userSession = c49593Lvm.A03;
        if (userSession != null) {
            int hashCode = userSession.userId.hashCode();
            User A0Y = AbstractC166997dE.A0Y(userSession);
            if (A0Y.BTC() != null) {
                return (int) (AbstractC25232BEp.A0t(A0Y.BTC()) & 65535);
            }
            return hashCode;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    private final SessionedNotificationCenter A01() {
        AccountSession accountSession;
        UserSession userSession = this.A03;
        if (userSession != null) {
            if (AbstractC453326q.A04(userSession)) {
                accountSession = C61A.A02(userSession, false);
            } else {
                accountSession = (AccountSession) userSession.A00(AccountSession.class);
            }
            if (accountSession != null) {
                return accountSession.getSessionedNotificationCenter();
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r9.A0B != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r11.equals("MEMConnectionStateDisconnected") != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C49593Lvm r9, X.InterfaceC03960Jm r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Timeout"
            boolean r8 = r11.equals(r0)
            r7 = 0
            r3 = 1
            if (r8 != 0) goto L1b
            java.lang.String r0 = "SwitchAccount"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "MEMConnectionStateDisconnected"
            boolean r0 = r11.equals(r0)
            r4 = 0
            if (r0 == 0) goto L1c
        L1b:
            r4 = 1
        L1c:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L25
            boolean r0 = r9.A0B
            r2 = 1
            if (r0 == 0) goto L26
        L25:
            r2 = 0
        L26:
            int r1 = r9.A00
            if (r1 <= 0) goto L33
            java.util.Set r0 = r9.A08
            int r0 = r0.size()
            if (r1 > r0) goto L33
            r2 = 0
        L33:
            java.util.Set r0 = r9.A07
            int r1 = r0.size()
            java.util.Set r0 = r9.A08
            int r0 = r0.size()
            int r1 = r1 + r0
            if (r4 != 0) goto L4d
            boolean r0 = r9.A0D
            if (r0 == 0) goto L4c
            if (r2 != 0) goto L4c
            int r0 = r9.A00
            if (r0 <= r1) goto L4d
        L4c:
            return
        L4d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0Q
            boolean r0 = r0.getAndSet(r3)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "DeactivateInstance"
            A05(r9, r0)
            r4 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "ProcessedMessageCount"
            A04(r9, r4, r1, r0, r4)
            A06(r9, r11)
            com.instagram.common.session.UserSession r6 = r9.A03
            if (r6 == 0) goto L83
            boolean r0 = r6.hasEnded()
            if (r0 != 0) goto L83
            boolean r0 = X.AbstractC453326q.A04(r6)
            if (r0 != 0) goto L83
            X.6CK r1 = X.C6Ek.A00(r6)
            X.8vx r0 = new X.8vx
            r0.<init>(r6)
            r1.A00(r0)
        L83:
            r5 = 2
            if (r6 == 0) goto Ld6
            boolean r0 = r6.hasEnded()
            if (r0 != 0) goto Ld6
            r3 = 2
            if (r8 == 0) goto L91
            r3 = 113(0x71, float:1.58E-43)
        L91:
            X.02i r2 = r9.A02
            if (r2 == 0) goto L9f
            r1 = 755177991(0x2d031a07, float:7.452267E-12)
            int r0 = A00(r9)
            r2.markerEnd(r1, r0, r3)
        L9f:
            r9.A02 = r4
            if (r6 == 0) goto Lb0
            boolean r0 = r6.hasEnded()
            if (r0 != 0) goto Lb0
            X.5ya r0 = r9.A0M
            if (r0 == 0) goto Lb0
            r0.A01()
        Lb0:
            X.1wQ r0 = r9.A0L
            r0.A01()
            X.1wQ r0 = r9.A0K
            r0.A01()
            X.1wQ r0 = r9.A0I
            r0.A01()
            X.1wQ r0 = r9.A0J
            r0.A01()
            com.facebook.msys.mca.MailboxCallback r1 = r9.A0E
            if (r1 == 0) goto Ld2
            if (r3 != r5) goto Lcb
            r7 = 1
        Lcb:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.onCompletion(r0)
        Ld2:
            r10.AIn(r4)
            return
        Ld6:
            r3 = 4
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49593Lvm.A02(X.Lvm, X.0Jm, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r9.A0B != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r11.equals("MEMConnectionStateDisconnected") != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0Jk, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C49593Lvm r9, X.InterfaceC03960Jm r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Timeout"
            boolean r8 = r11.equals(r0)
            r7 = 0
            r3 = 1
            if (r8 != 0) goto L1b
            java.lang.String r0 = "SwitchAccount"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "MEMConnectionStateDisconnected"
            boolean r0 = r11.equals(r0)
            r4 = 0
            if (r0 == 0) goto L1c
        L1b:
            r4 = 1
        L1c:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L25
            boolean r0 = r9.A0B
            r2 = 1
            if (r0 == 0) goto L26
        L25:
            r2 = 0
        L26:
            int r1 = r9.A00
            if (r1 <= 0) goto L33
            java.util.Set r0 = r9.A08
            int r0 = r0.size()
            if (r1 > r0) goto L33
            r2 = 0
        L33:
            java.util.Set r0 = r9.A07
            int r1 = r0.size()
            java.util.Set r0 = r9.A08
            int r0 = r0.size()
            int r1 = r1 + r0
            if (r4 != 0) goto L4d
            boolean r0 = r9.A0D
            if (r0 == 0) goto L4c
            if (r2 != 0) goto L4c
            int r0 = r9.A00
            if (r0 <= r1) goto L4d
        L4c:
            return
        L4d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.A0Q
            boolean r0 = r0.getAndSet(r3)
            if (r0 != 0) goto L4c
            java.lang.String r0 = "DeactivateInstanceSequence"
            A05(r9, r0)
            A06(r9, r11)
            com.instagram.common.session.UserSession r6 = r9.A03
            r5 = 0
            if (r6 == 0) goto L88
            boolean r0 = r6.hasEnded()
            if (r0 != 0) goto L88
            X.09Y r3 = X.C023409i.A0A
            java.lang.String r2 = r6.userId
            X.Alb r1 = new X.Alb
            r1.<init>()
            X.Lvn r0 = X.C49594Lvn.A00
            r3.A0A(r1, r0, r5, r2)
            boolean r0 = X.AbstractC453326q.A04(r6)
            if (r0 != 0) goto L88
            X.6CK r1 = X.C6Ek.A00(r6)
            X.Ais r0 = new X.Ais
            r0.<init>(r6)
            r1.A00(r0)
        L88:
            r4 = 2
            if (r6 == 0) goto Ld3
            boolean r0 = r6.hasEnded()
            if (r0 != 0) goto Ld3
            r3 = 2
            if (r8 == 0) goto L96
            r3 = 113(0x71, float:1.58E-43)
        L96:
            X.02i r2 = r9.A02
            if (r2 == 0) goto La4
            r1 = 755177991(0x2d031a07, float:7.452267E-12)
            int r0 = A00(r9)
            r2.markerEnd(r1, r0, r3)
        La4:
            r9.A02 = r5
            X.5ya r0 = r9.A0M
            if (r0 == 0) goto Lad
            r0.A01()
        Lad:
            X.1wQ r0 = r9.A0L
            r0.A01()
            X.1wQ r0 = r9.A0K
            r0.A01()
            X.1wQ r0 = r9.A0I
            r0.A01()
            X.1wQ r0 = r9.A0J
            r0.A01()
            com.facebook.msys.mca.MailboxCallback r1 = r9.A0E
            if (r1 == 0) goto Lcf
            if (r3 != r4) goto Lc8
            r7 = 1
        Lc8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.onCompletion(r0)
        Lcf:
            r10.AIn(r5)
            return
        Ld3:
            r3 = 4
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49593Lvm.A03(X.Lvm, X.0Jm, java.lang.String):void");
    }

    public static final void A04(C49593Lvm c49593Lvm, Boolean bool, Integer num, String str, String str2) {
        C006802i c006802i;
        C006802i c006802i2;
        C006802i c006802i3;
        if (c49593Lvm.A02 != null && c49593Lvm.A03 != null) {
            int A00 = A00(c49593Lvm);
            C006802i c006802i4 = c49593Lvm.A02;
            if (c006802i4 != null) {
                if (c006802i4.isMarkerOn(755177991, A00)) {
                    if (str2 != null && (c006802i3 = c49593Lvm.A02) != null) {
                        c006802i3.markerAnnotate(755177991, A00, str, str2);
                    }
                    if (bool != null && (c006802i2 = c49593Lvm.A02) != null) {
                        c006802i2.markerAnnotate(755177991, A00, str, bool.booleanValue());
                    }
                    if (num != null && (c006802i = c49593Lvm.A02) != null) {
                        c006802i.markerAnnotate(755177991, A00, str, num.intValue());
                        return;
                    }
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A05(C49593Lvm c49593Lvm, String str) {
        C006802i c006802i;
        if (c49593Lvm.A02 != null && c49593Lvm.A03 != null) {
            int A00 = A00(c49593Lvm);
            C006802i c006802i2 = c49593Lvm.A02;
            if (c006802i2 != null) {
                if (c006802i2.isMarkerOn(755177991, A00) && (c006802i = c49593Lvm.A02) != null) {
                    c006802i.markerPoint(755177991, A00, str);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A06(C49593Lvm c49593Lvm, String str) {
        SessionedNotificationCenter A01;
        Handler handler = c49593Lvm.A01;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        c49593Lvm.A01 = null;
        SessionedNotificationCenter A012 = c49593Lvm.A01();
        if (A012 != null) {
            A012.removeObserver(c49593Lvm.A0H, "MEMOfflineHandlingCompletionNotification", null);
        }
        SessionedNotificationCenter A013 = c49593Lvm.A01();
        if (A013 != null) {
            A013.removeObserver(c49593Lvm.A0F, "MEBHandleProtobufBackupWriteResultNotification", null);
        }
        UserSession userSession = c49593Lvm.A03;
        if (userSession != null) {
            if (AbstractC31177DnL.A1Z(AbstractC47132Ef.A00(userSession).A12) && (A01 = c49593Lvm.A01()) != null) {
                A01.removeObserver(c49593Lvm.A0G, "MEMContextConnectionStateChangeNotification", null);
            }
            A04(c49593Lvm, Boolean.valueOf(str.equals("SwitchAccount")), null, "TearDownByAccountSwitch", null);
            A04(c49593Lvm, null, null, "TearDownReason", str);
            A04(c49593Lvm, Boolean.valueOf(c49593Lvm.A0C), null, "EncryptedBackupsEnabled", null);
            java.util.Set set = c49593Lvm.A09;
            if (AbstractC31171DnF.A1b(set)) {
                A04(c49593Lvm, null, null, "ThreadIds", AbstractC25226BEj.A1H(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, set, null));
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}

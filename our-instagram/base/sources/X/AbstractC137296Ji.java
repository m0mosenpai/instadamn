package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.distribgw.client.chatd.DGWPluginSessionImpl;
import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.dasm.DasmSupportHelper;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxDatabaseCallback;
import com.facebook.msys.mca.MailboxDatabaseConfig;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxMessengerMediaSendManagerConfig;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SqlUtils;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.ohai.OhaiPlugin;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.distribgw.client.DGWClientHolder;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.6Ji, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC137296Ji {
    public static boolean A00 = true;
    public static String A01;

    public static MailboxDatabaseConfig A00(final C135806Ci c135806Ci, final AbstractC136036Di abstractC136036Di, MailboxCallback mailboxCallback, final MailboxDatabaseCallback mailboxDatabaseCallback, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback) {
        String str;
        C6CN c6cn = c135806Ci.A00;
        C1334860s c1334860s = c6cn.A01;
        Context context = c1334860s.A01;
        String str2 = c6cn.A09;
        File file = new File(str2);
        InterfaceC136176Dz interfaceC136176Dz = c6cn.A00;
        QuickPerformanceLogger quickPerformanceLogger = c1334860s.A08;
        C131085vw c131085vw = new C131085vw(interfaceC136176Dz, AbstractC136036Di.A00(quickPerformanceLogger));
        try {
            File databasePath = context.getDatabasePath(AnonymousClass001.A0R("msys_database_health_", c6cn.A03.getFacebookUserID()));
            File parentFile = databasePath.getParentFile();
            parentFile.getClass();
            parentFile.mkdirs();
            try {
                str = databasePath.getCanonicalPath();
            } catch (IOException unused) {
                str = databasePath.getAbsolutePath();
            }
        } catch (SecurityException unused2) {
            abstractC136036Di.A0A();
            str = null;
        }
        final C131095vx c131095vx = new C131095vx(c135806Ci, abstractC136036Di, mailboxCallback, mailboxDatabaseCallback);
        MailboxDatabaseCallback mailboxDatabaseCallback2 = new MailboxDatabaseCallback() { // from class: X.5vy
            @Override // com.facebook.msys.mca.MailboxDatabaseCallback
            public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, DatabaseConnectionSettings databaseConnectionSettings) {
                boolean z2;
                int i2;
                AbstractC09800fd.A01("Mailbox.DatabaseCallback.onConfig", -1249421343);
                try {
                    MailboxDatabaseCallback mailboxDatabaseCallback3 = mailboxDatabaseCallback;
                    if (mailboxDatabaseCallback3 != null) {
                        z2 = mailboxDatabaseCallback3.onConfig(sqliteHolder, i, z, databaseConnectionSettings);
                        i2 = 2032341631;
                    } else {
                        z2 = true;
                        i2 = -795237602;
                    }
                    AbstractC09800fd.A00(i2);
                    return z2;
                } catch (Throwable th) {
                    AbstractC09800fd.A00(1276426261);
                    throw th;
                }
            }

            @Override // com.facebook.msys.mca.MailboxDatabaseCallback
            public final void onInit(SqliteHolder sqliteHolder) {
                AbstractC09800fd.A01("Mailbox.DatabaseCallback.onInit", 308444084);
                abstractC136036Di.A07();
                AbstractC09800fd.A00(884681565);
            }

            /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.msys.mca.MailboxFeature, X.65x] */
            @Override // com.facebook.msys.mca.MailboxDatabaseCallback
            public final void onOpenWithMailbox(boolean z, final Mailbox mailbox, Throwable th) {
                String message;
                AbstractC09800fd.A01("Mailbox.DatabaseCallback.onOpen", -1389401408);
                try {
                    try {
                        C131095vx c131095vx2 = c131095vx;
                        if (th != null) {
                            if (th.getMessage() == null) {
                                message = "Error while client opening DB";
                            } else {
                                message = th.getMessage();
                            }
                            c131095vx2.A01.A0R(message);
                            MailboxDatabaseCallback mailboxDatabaseCallback3 = c131095vx2.A03;
                            if (mailboxDatabaseCallback3 != null) {
                                mailboxDatabaseCallback3.onOpenWithMailbox(z, mailbox, th);
                            } else {
                                throw new RuntimeException(AnonymousClass001.A0R("Open MSYS database failed:", th.getMessage()), th);
                            }
                        } else {
                            AbstractC136036Di abstractC136036Di2 = c131095vx2.A01;
                            abstractC136036Di2.A0S(z);
                            C135806Ci c135806Ci2 = c131095vx2.A00;
                            C6CN c6cn2 = c135806Ci2.A00;
                            AuthData authData = c6cn2.A03;
                            NetworkSession A002 = MsysInfraNoSqliteObjectHolder.A00();
                            A002.getClass();
                            C135746Cc c135746Cc = (C135746Cc) c135806Ci2.A0H.get();
                            if (c135746Cc != null) {
                                C14360o3.A0B(mailbox, 0);
                                C47142Eg c47142Eg = c135746Cc.A01;
                                if (C47142Eg.A00()) {
                                    ((OhaiPlugin) c135746Cc.A00.A01(OhaiPlugin.class, C1344565t.A00)).register(mailbox, "567067343352427", ((Number) c47142Eg.A0p.A00()).doubleValue(), ((Number) c47142Eg.A0q.A00()).doubleValue(), ((Boolean) c47142Eg.A0r.A00()).booleanValue(), ((Number) c47142Eg.A0o.A00()).doubleValue(), ((Boolean) c47142Eg.A0n.A00()).booleanValue(), (String) c47142Eg.A15.A00(), ((Boolean) c47142Eg.A1E.A00()).booleanValue(), (String) c47142Eg.A00.A00(), ((Number) c47142Eg.A0s.A00()).doubleValue(), false);
                                }
                                if (((Boolean) c47142Eg.A0N.get()).booleanValue()) {
                                    UserSession userSession = c135746Cc.A00;
                                    DgwNetworkSessionPluginImpl dgwNetworkSessionPluginImpl = (DgwNetworkSessionPluginImpl) userSession.A01(DgwNetworkSessionPluginImpl.class, new C9E3(userSession, 12));
                                    C06090Tz c06090Tz = C06090Tz.A05;
                                    dgwNetworkSessionPluginImpl.register(mailbox, 1L, false, false, true, false, false, C18U.A06(c06090Tz, userSession, 36311663567045330L), C18U.A06(c06090Tz, userSession, 36311663567176404L), false);
                                }
                                if (((Boolean) c47142Eg.A1C.get()).booleanValue()) {
                                    C225049wT c225049wT = DGWPluginSessionImpl.Companion;
                                    DGWClient dGWClient = DGWClientHolder.Companion.A00(c135746Cc.A00).client;
                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                                    C14360o3.A07(scheduledThreadPoolExecutor);
                                    boolean booleanValue = ((Boolean) c47142Eg.A0O.get()).booleanValue();
                                    long longValue = ((Number) c47142Eg.A0D.get()).longValue();
                                    boolean booleanValue2 = ((Boolean) c47142Eg.A0C.get()).booleanValue();
                                    C14360o3.A0B(dGWClient, 0);
                                    DGWPluginSessionImpl.registerSessionNative(dGWClient, scheduledThreadPoolExecutor, booleanValue, longValue, booleanValue2, false);
                                }
                            }
                            NotificationCenter A003 = C136066Dl.A00();
                            AnonymousClass610 anonymousClass610 = c135806Ci2.A0G;
                            if (anonymousClass610 != null && ((C47617L1c) anonymousClass610.get()) != null) {
                                MqttNetworkSessionPlugin.get().register((C47617L1c) anonymousClass610.get(), A002, authData, A003, mailbox, c135806Ci2.A01(), ((Boolean) c135806Ci2.A0C.get()).booleanValue(), ((Boolean) c135806Ci2.A0A.get()).booleanValue(), false, false, ((Boolean) c135806Ci2.A09.get()).booleanValue(), false);
                                AbstractC136036Di.A00(c6cn2.A01.A08).A06();
                            }
                            AbstractC09800fd.A01("MsysSync.configureSyncParams", -962755523);
                            try {
                                C1334860s c1334860s2 = c6cn2.A01;
                                Context context2 = c1334860s2.A01;
                                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                                int i = displayMetrics.widthPixels;
                                int i2 = displayMetrics.heightPixels;
                                float f = displayMetrics.density;
                                AbstractC1345065z abstractC1345065z = C1344865x.A00;
                                ?? mailboxFeature = new MailboxFeature(new C137266Jf(mailbox));
                                float f2 = i;
                                Integer valueOf = Integer.valueOf((int) (f2 * 0.5f));
                                float f3 = i2;
                                Integer valueOf2 = Integer.valueOf((int) (0.5f * f3));
                                Integer valueOf3 = Integer.valueOf(i);
                                Integer valueOf4 = Integer.valueOf(i2);
                                Float valueOf5 = Float.valueOf(f);
                                Integer valueOf6 = Integer.valueOf((int) (f2 * 0.3f));
                                Integer valueOf7 = Integer.valueOf((int) (f3 * 0.3f));
                                AnonymousClass610 anonymousClass6102 = c135806Ci2.A0E;
                                Object obj = anonymousClass6102.get();
                                obj.getClass();
                                String str3 = (String) c135806Ci2.A01.get();
                                InterfaceExecutorC135866Co ASj = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                                MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                                if (!ASj.ELJ(new AnonymousClass666(mailboxFeature, mailboxFutureImpl, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, 0, (String) obj, str3))) {
                                    mailboxFutureImpl.cancel(false);
                                }
                                Object obj2 = anonymousClass6102.get();
                                obj2.getClass();
                                InterfaceExecutorC135866Co ASj2 = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                                MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(ASj2);
                                if (!ASj2.ELJ(new C66F(mailboxFeature, mailboxFutureImpl2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, (String) obj2))) {
                                    mailboxFutureImpl2.cancel(false);
                                }
                                Integer valueOf8 = Integer.valueOf((int) (context2.getResources().getDisplayMetrics().density * 60.0f));
                                Integer valueOf9 = Integer.valueOf((int) (context2.getResources().getDisplayMetrics().density * 100.0f));
                                InterfaceExecutorC135866Co ASj3 = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                                MailboxFutureImpl mailboxFutureImpl3 = new MailboxFutureImpl(ASj3);
                                if (!ASj3.ELJ(new C66H(mailboxFeature, mailboxFutureImpl3, valueOf8, valueOf9))) {
                                    mailboxFutureImpl3.cancel(false);
                                }
                                Object obj3 = anonymousClass6102.get();
                                obj3.getClass();
                                InterfaceExecutorC135866Co ASj4 = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                                MailboxFutureImpl mailboxFutureImpl4 = new MailboxFutureImpl(ASj4);
                                if (!ASj4.ELJ(new C66J(mailboxFeature, mailboxFutureImpl4, valueOf5, (String) obj3))) {
                                    mailboxFutureImpl4.cancel(false);
                                }
                                Object obj4 = anonymousClass6102.get();
                                obj4.getClass();
                                InterfaceExecutorC135866Co ASj5 = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                                MailboxFutureImpl mailboxFutureImpl5 = new MailboxFutureImpl(ASj5);
                                if (!ASj5.ELJ(new C66K(mailboxFeature, mailboxFutureImpl5, (String) obj4))) {
                                    mailboxFutureImpl5.cancel(false);
                                }
                                Object obj5 = anonymousClass6102.get();
                                obj5.getClass();
                                InterfaceExecutorC135866Co ASj6 = mailboxFeature.mMailboxApiHandleMetaProvider.ASj(2);
                                MailboxFutureImpl mailboxFutureImpl6 = new MailboxFutureImpl(ASj6);
                                if (!ASj6.ELJ(new C66M(mailboxFeature, mailboxFutureImpl6, (String) obj5))) {
                                    mailboxFutureImpl6.cancel(false);
                                }
                                QuickPerformanceLogger quickPerformanceLogger2 = c1334860s2.A08;
                                AbstractC136036Di.A00(quickPerformanceLogger2).A05();
                                AbstractC09800fd.A00(688980843);
                                MailboxCallback mailboxCallback2 = (MailboxCallback) c135806Ci2.A0F.get();
                                if (mailboxCallback2 != null) {
                                    AbstractC09800fd.A01("mailboxWillActivateCallback.onCompletion", 816892482);
                                    mailboxCallback2.onCompletion(mailbox);
                                    AbstractC09800fd.A00(-1162144287);
                                }
                                Execution.executePossiblySync(new AbstractRunnableC94874Os() { // from class: X.66O
                                    {
                                        super("setMailboxStateActive");
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        AbstractC09800fd.A01("Mailbox.setStateActive.run", -1346576094);
                                        try {
                                            Mailbox.this.setStateNative(1);
                                            AbstractC09800fd.A00(-801468984);
                                        } catch (Throwable th2) {
                                            AbstractC09800fd.A00(-1490602993);
                                            throw th2;
                                        }
                                    }
                                }, mailbox.getAccountSession(), 1);
                                AbstractC136036Di.A00(quickPerformanceLogger2).A0J();
                                abstractC136036Di2.A01();
                                TraceLogger.endBootstrapTrace();
                                C6KE.A00(c1334860s2.A09).A01();
                                MailboxDatabaseCallback mailboxDatabaseCallback4 = c131095vx2.A03;
                                if (mailboxDatabaseCallback4 != null) {
                                    mailboxDatabaseCallback4.onOpenWithMailbox(z, mailbox, th);
                                }
                                MailboxCallback mailboxCallback3 = c131095vx2.A02;
                                if (mailboxCallback3 != null) {
                                    mailboxCallback3.onCompletion(mailbox);
                                }
                            } catch (Throwable th2) {
                                AbstractC09800fd.A00(1051379952);
                                throw th2;
                            }
                        }
                        AbstractC09800fd.A00(-861612108);
                    } catch (Exception e) {
                        C0K8.A0F("MsysDatabase", "Exception when handling onOpen", e);
                        throw e;
                    }
                } catch (Throwable th3) {
                    AbstractC09800fd.A00(1054685188);
                    throw th3;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
            
                if (r0 != null) goto L11;
             */
            @Override // com.facebook.msys.mca.MailboxDatabaseCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onOpenWithMessageSyncService(boolean r5, final com.facebook.msys.mca.MessageSyncService r6, java.lang.Throwable r7) {
                /*
                    r4 = this;
                    java.lang.String r1 = "MessageSyncService.DatabaseCallback.onOpen"
                    r0 = 1922964892(0x729e1d9c, float:6.2636067E30)
                    X.AbstractC09800fd.A01(r1, r0)
                    X.5vx r3 = r2     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    if (r7 == 0) goto L20
                    com.facebook.msys.mca.MailboxDatabaseCallback r0 = r3.A03     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    if (r0 != 0) goto L2f
                    java.lang.String r1 = "Open MSYS database failed:"
                    java.lang.String r0 = r7.getMessage()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    r0.<init>(r1, r7)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    throw r0     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                L20:
                    r2 = 1
                    X.9ar r1 = new X.9ar     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    r1.<init>()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    com.facebook.msys.mci.AccountSession r0 = r6.mAccountSession     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    com.facebook.msys.mci.Execution.executePossiblySync(r1, r0, r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    com.facebook.msys.mca.MailboxDatabaseCallback r0 = r3.A03     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                    if (r0 == 0) goto L32
                L2f:
                    r0.onOpenWithMessageSyncService(r5, r6, r7)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L42
                L32:
                    r0 = -955440584(0xffffffffc70d2238, float:-36130.22)
                    X.AbstractC09800fd.A00(r0)
                    return
                L39:
                    r2 = move-exception
                    java.lang.String r1 = "MsysDatabase"
                    java.lang.String r0 = "Exception when handling onOpenWithMessageSyncService"
                    X.C0K8.A0F(r1, r0, r2)     // Catch: java.lang.Throwable -> L42
                    throw r2     // Catch: java.lang.Throwable -> L42
                L42:
                    r1 = move-exception
                    r0 = 519654276(0x1ef94b84, float:2.6395133E-20)
                    X.AbstractC09800fd.A00(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C131105vy.onOpenWithMessageSyncService(boolean, com.facebook.msys.mca.MessageSyncService, java.lang.Throwable):void");
            }
        };
        MailboxDatabaseConfig mailboxDatabaseConfig = MailboxDatabaseConfig.$redex_init_class;
        Map map = c6cn.A06.A00;
        boolean z = c6cn.A0D;
        Object obj = c135806Ci.A08.get();
        obj.getClass();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c135806Ci.A0N.getClass();
        c135806Ci.A0Q.getClass();
        c135806Ci.A0X.getClass();
        c135806Ci.A0Y.getClass();
        InterfaceC136176Dz interfaceC136176Dz2 = c131085vw.A00;
        Database.SchemaDeployer Bcc = interfaceC136176Dz2.Bcc();
        file.exists();
        return new MailboxDatabaseConfig(str2, str, map, databaseHealthMonitorFatalErrorCallback, mailboxDatabaseCallback2, true, z, false, false, booleanValue, false, false, false, 0, -1, false, true, new C131115vz(context, AbstractC136036Di.A00(quickPerformanceLogger), Bcc), new C131125w0(c131085vw), new C131135w1(c131085vw), new C131145w2(c131085vw), interfaceC136176Dz2.CGa());
    }

    public static MailboxMessengerMediaSendManagerConfig A01(C135806Ci c135806Ci) {
        String absolutePath;
        String absolutePath2;
        File cacheDir = c135806Ci.A00.A01.A01.getCacheDir();
        MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig = MailboxMessengerMediaSendManagerConfig.$redex_init_class;
        try {
            absolutePath = cacheDir.getCanonicalPath();
        } catch (IOException unused) {
            absolutePath = cacheDir.getAbsolutePath();
        }
        try {
            absolutePath2 = cacheDir.getCanonicalPath();
        } catch (IOException unused2) {
            absolutePath2 = cacheDir.getAbsolutePath();
        }
        return new MailboxMessengerMediaSendManagerConfig(absolutePath, absolutePath2, 262144000, 262144000, null);
    }

    public static SlimMailbox A02(C135806Ci c135806Ci) {
        C6CN c6cn = c135806Ci.A00;
        AbstractC136036Di A002 = AbstractC136036Di.A00(c6cn.A01.A08);
        AbstractC09800fd.A01("MsysBootstrapper.SlimMailbox.Create", -1403554724);
        A002.A0H();
        SlimMailbox slimMailbox = SlimMailbox.$redex_init_class;
        SlimMailbox slimMailbox2 = new SlimMailbox(c6cn.A02, C136066Dl.A00(), c135806Ci.A01(), new Executor() { // from class: X.6K9
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        });
        A002.A0G();
        AbstractC09800fd.A00(766861128);
        return slimMailbox2;
    }

    public static void A03(C135806Ci c135806Ci, AbstractC136036Di abstractC136036Di, SlimMailbox slimMailbox) {
        String A012;
        C4Mp c4Mp;
        C4Mp c4Mp2;
        AbstractC09800fd.A01("MsysBootstrapper.configureInfra", 435002070);
        try {
            C6CN c6cn = c135806Ci.A00;
            C1334860s c1334860s = c6cn.A01;
            Context context = c1334860s.A01;
            DasmSupportHelper.initialize(context);
            NotificationCenter A002 = C136066Dl.A00();
            QuickPerformanceLogger quickPerformanceLogger = c1334860s.A08;
            AbstractC136036Di.A00(quickPerformanceLogger).A0F();
            slimMailbox.mAccountSession.injectNetworkSession(C61G.A00(c1334860s, A002));
            synchronized (C131955xV.class) {
                try {
                    SqlUtils.disableSqliteMemoryStatus();
                    if (c6cn.A0C) {
                        boolean z = true;
                        if (Execution.getExecutionContext() != 1) {
                            z = false;
                        }
                        AbstractC124695ka.A00(z);
                        C61G.A02(c1334860s);
                        String str = c6cn.A09;
                        File file = new File(str);
                        C131085vw c131085vw = new C131085vw(c6cn.A00, AbstractC136036Di.A00(quickPerformanceLogger));
                        C131125w0 c131125w0 = null;
                        if (!c6cn.A0A) {
                            c131125w0 = new C131125w0(c131085vw);
                        }
                        String facebookUserID = c6cn.A03.getFacebookUserID();
                        Database.SchemaDeployer BXG = c131085vw.A00.BXG();
                        file.exists();
                        C131115vz c131115vz = new C131115vz(context, AbstractC136036Di.A00(quickPerformanceLogger), BXG);
                        AbstractC09800fd.A01("MsysBootstrapper.SlimMailbox.DeployEarlyDatabaseConnection", -2005266312);
                        abstractC136036Di.A0N();
                        MsysInfraNoSqliteObjectHolder.A00();
                        slimMailbox.deployEarlyDatabaseConnection(facebookUserID, str, c135806Ci.A00(), c131115vz, c131125w0, false, c6cn.A06.A00, false, false, false, false, false, true);
                        abstractC136036Di.A0M();
                        AbstractC09800fd.A00(-154474788);
                    }
                    A012 = C61G.A01(c1334860s);
                } catch (Throwable th) {
                    throw th;
                }
            }
            A01 = A012;
            Object obj = c135806Ci.A0D.get();
            obj.getClass();
            boolean booleanValue = ((Boolean) obj).booleanValue();
            synchronized (C4Mp.class) {
                try {
                    c4Mp = C4Mp.A01;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c4Mp == null) {
                synchronized (C4Mp.class) {
                    if (C4Mp.A01 == null) {
                        C4Mp.A01 = new C4Mp(context);
                    }
                }
            }
            synchronized (C4Mp.class) {
                c4Mp2 = C4Mp.A01;
            }
            if (c4Mp2 != null) {
                c4Mp2.A00.edit().putBoolean("vault_enabled", booleanValue).apply();
            }
            AbstractC09800fd.A00(369012725);
        } catch (Throwable th3) {
            AbstractC09800fd.A00(-60431781);
            throw th3;
        }
    }
}

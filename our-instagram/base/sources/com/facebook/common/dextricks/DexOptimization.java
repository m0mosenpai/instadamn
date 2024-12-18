package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.AnonymousClass028;
import X.C0DJ;
import X.C0JJ;
import X.C0f9;
import X.C0fM;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.DeadObjectException;
import android.os.Messenger;
import com.facebook.common.dextricks.OptimizationConfiguration;
import com.facebook.endtoend.EndToEnd;
import java.io.File;

/* loaded from: classes.dex */
public final class DexOptimization {
    public static final String ACTION_OPTIMIZE = "com.facebook.dexopt";
    public static final int JOB_ID = -87105851;
    public static final String OPT_KEY_CLIENT = "client";
    public static final String OPT_KEY_DEX_STORE_ROOT = "dexStoreRoot";
    public static final String PROCESS_NAME = "optsvc";

    /* loaded from: classes.dex */
    public final class Client {
        public static volatile Messenger sOptListener;

        public static Messenger getMessenger(Context context, DexStore dexStore) {
            if (sOptListener == null) {
                synchronized (Client.class) {
                    if (sOptListener == null) {
                        sOptListener = constructClientMessenger(context, dexStore);
                    }
                }
            }
            return sOptListener;
        }

        public static boolean getShouldDisableRestartProcessAfterDexOpt(Context context, DexStore dexStore, C0JJ c0jj) {
            if ((c0jj.A12 && dexStore.isReoptimization(context)) || EndToEnd.isRunningEndToEndTest()) {
                return true;
            }
            return false;
        }

        public static void startBackgroundOptimization(Context context, DexStore dexStore) {
            try {
                Mlog.safeFmt("starting background optimization", new Object[0]);
                AnonymousClass028.enqueueWork(context, Service.class, DexOptimization.JOB_ID, new Intent(DexOptimization.ACTION_OPTIMIZE).putExtra(DexOptimization.OPT_KEY_DEX_STORE_ROOT, dexStore.root.getAbsolutePath()).putExtra(DexOptimization.OPT_KEY_CLIENT, getMessenger(context, dexStore)));
            } catch (SecurityException e) {
                Mlog.w("Failure to start DexOptimization.Service", e);
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    Mlog.w("Failure to start DexOptimization.Service", e2);
                    return;
                }
                throw e2;
            }
        }

        public static Messenger constructClientMessenger(Context context, DexStore dexStore) {
            C0JJ A00 = C0JJ.A00(context);
            return new Messenger(new DexOptimizationMessageHandler(context, getShouldDisableRestartProcessAfterDexOpt(context, dexStore, A00), A00.A0m, A00.A2U));
        }
    }

    /* loaded from: classes.dex */
    public final class Service extends AnonymousClass028 {
        public boolean isScreenOn;
        public OptSvcBroadcastReceiver mReceiver;
        public long unpauseTime;

        /* loaded from: classes.dex */
        public final class OptSvcBroadcastReceiver extends BroadcastReceiver {
            public OptSvcBroadcastReceiver() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int i;
                Object[] objArr;
                String str;
                int A01 = C0f9.A01(-1965829126);
                C0fM.A01(this, context, intent);
                if (intent != null) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_ON".equals(action)) {
                        Service.this.isScreenOn = true;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen on";
                    } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        Service.this.isScreenOn = false;
                        objArr = new Object[0];
                        str = "[optsvc] noticed screen off";
                    } else if (DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE.equals(action)) {
                        long longExtra = intent.getLongExtra(DexOptimizationConstants.OPTIMIZE_UNPAUSE_TIME, -1L);
                        if (longExtra < 0) {
                            Mlog.w("bogus pause broadcast received", new Object[0]);
                            i = -1358566438;
                            C0f9.A0E(i, A01, intent);
                        } else {
                            Service service = Service.this;
                            long max = Math.max(service.unpauseTime, longExtra);
                            service.unpauseTime = max;
                            objArr = new Object[]{Long.valueOf(max), Long.valueOf((System.nanoTime() - max) / 1000000)};
                            str = "pause broadcast received: will unpause at time %s (%s ms from now)";
                        }
                    }
                    Mlog.safeFmt(str, objArr);
                }
                i = -378443707;
                C0f9.A0E(i, A01, intent);
            }
        }

        /* loaded from: classes.dex */
        public final class OptSvcOptimizationConfigurationProvider extends OptimizationConfiguration.Provider {
            public OptimizationConfiguration mPausedConfig;
            public OptimizationConfiguration mScreenOffConfig;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public OptSvcOptimizationConfigurationProvider() {
                /*
                    r3 = this;
                    com.facebook.common.dextricks.DexOptimization.Service.this = r4
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r1 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r1.<init>()
                    com.facebook.common.dextricks.Prio r0 = com.facebook.common.dextricks.Prio.lowest()
                    r1.mPrio = r0
                    r0 = 1
                    r1.setInBackground(r0)
                    r0 = 300(0x12c, float:4.2E-43)
                    r1.mOptTimeSliceMs = r0
                    r0 = 1000(0x3e8, float:1.401E-42)
                    r1.mYieldTimeSliceMs = r0
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r1.build()
                    r3.<init>(r0)
                    com.facebook.common.dextricks.OptimizationConfiguration r2 = r3.baseline
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r1 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r1.<init>(r2)
                    r0 = 900(0x384, float:1.261E-42)
                    r1.mOptTimeSliceMs = r0
                    r0 = 300(0x12c, float:4.2E-43)
                    r1.mYieldTimeSliceMs = r0
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r1.build()
                    r3.mScreenOffConfig = r0
                    com.facebook.common.dextricks.OptimizationConfiguration$Builder r1 = new com.facebook.common.dextricks.OptimizationConfiguration$Builder
                    r1.<init>(r2)
                    r0 = 0
                    r1.mOptTimeSliceMs = r0
                    r0 = 100
                    r1.mYieldTimeSliceMs = r0
                    com.facebook.common.dextricks.OptimizationConfiguration r0 = r1.build()
                    r3.mPausedConfig = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexOptimization.Service.OptSvcOptimizationConfigurationProvider.<init>(com.facebook.common.dextricks.DexOptimization$Service):void");
            }

            @Override // com.facebook.common.dextricks.OptimizationConfiguration.Provider
            public OptimizationConfiguration getInstantaneous() {
                long nanoTime = System.nanoTime();
                Service service = Service.this;
                if (nanoTime < service.unpauseTime) {
                    return this.mPausedConfig;
                }
                if (service.isScreenOn) {
                    return this.baseline;
                }
                return this.mScreenOffConfig;
            }
        }

        @Override // X.AnonymousClass028, android.app.Service
        public void onCreate() {
            int A04 = C0f9.A04(954401035);
            super.onCreate();
            Mlog.safeFmt("optsvc created", new Object[0]);
            this.isScreenOn = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction(DexOptimizationConstants.ACTION_OPTIMIZE_PAUSE);
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = new OptSvcBroadcastReceiver();
            this.mReceiver = optSvcBroadcastReceiver;
            C0DJ.A00(optSvcBroadcastReceiver, this, intentFilter);
            this.mInterruptIfStopped = true;
            C0f9.A0B(1529376969, A04);
        }

        @Override // X.AnonymousClass028, android.app.Service
        public void onDestroy() {
            int A04 = C0f9.A04(1172643408);
            Mlog.safeFmt("optsvc being shut down", new Object[0]);
            OptSvcBroadcastReceiver optSvcBroadcastReceiver = this.mReceiver;
            if (optSvcBroadcastReceiver != null) {
                unregisterReceiver(optSvcBroadcastReceiver);
                this.mReceiver = null;
            }
            super.onDestroy();
            C0f9.A0B(1823019804, A04);
        }

        @Override // X.AnonymousClass028
        public void onHandleWork(Intent intent) {
            SocketLock socketLock;
            DexStore findOpened;
            if (DexOptimization.ACTION_OPTIMIZE.equals(intent.getAction())) {
                Mlog.safeFmt("optsvc received opt intent", new Object[0]);
                String stringExtra = intent.getStringExtra(DexOptimization.OPT_KEY_DEX_STORE_ROOT);
                Messenger messenger = (Messenger) intent.getParcelableExtra(DexOptimization.OPT_KEY_CLIENT);
                DexOptimizationMessageHandler.send(messenger, 1, 0);
                try {
                    try {
                        socketLock = new SocketLock("com.facebook.dexopt.lock");
                        while (!socketLock.tryAcquire()) {
                            try {
                                Mlog.safeFmt("another application is optimizing; waiting", new Object[0]);
                                Thread.sleep(1000L);
                            } catch (InterruptedException unused) {
                                Mlog.safeFmt("optimization canceled for dex store %s", stringExtra);
                                DexOptimizationMessageHandler.send(messenger, 2, 2);
                                Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                                Fs.safeClose(socketLock);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                Mlog.w(th, "optimization failed for dex store %s", stringExtra);
                                DexOptimizationMessageHandler.send(messenger, 2, 1);
                                Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                                Fs.safeClose(socketLock);
                                return;
                            }
                        }
                        Mlog.safeFmt("acquired xappLock", new Object[0]);
                        findOpened = DexStore.findOpened(new File(stringExtra));
                    } catch (Throwable th2) {
                        Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                        Fs.safeClose(socketLock);
                        throw th2;
                    }
                } catch (InterruptedException unused2) {
                    socketLock = null;
                } catch (Throwable th3) {
                    th = th3;
                    socketLock = null;
                }
                if (findOpened != null) {
                    findOpened.optimize(getApplicationContext(), new OptSvcOptimizationConfigurationProvider(this));
                    DexOptimizationMessageHandler.send(messenger, 2, 0);
                    Mlog.safeFmt("optsvc opt work finished", new Object[0]);
                    Fs.safeClose(socketLock);
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0R("no such opened dex store: ", stringExtra));
            }
            Mlog.w("optsvc received intent with unknown action: %s", intent.getAction());
        }
    }
}

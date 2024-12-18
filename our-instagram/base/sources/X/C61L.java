package X;

import android.content.ContentResolver;
import android.content.Context;
import com.facebook.msys.mci.AuthDataStorage;
import com.facebook.msys.mci.Connectivity;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.FileManager;
import com.facebook.msys.mci.JsonSerialization;
import com.facebook.msys.mci.Localization;
import com.facebook.msys.mci.Proxies;
import com.facebook.msys.mci.ProxyProvider;
import java.io.File;

/* renamed from: X.61L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C61L {
    public static synchronized void A00(Context context, C1335360y c1335360y, ProxyProvider proxyProvider, AnonymousClass612 anonymousClass612, C1335160w c1335160w, Integer num, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (C61L.class) {
            try {
                Proxies.configure(proxyProvider);
            } catch (IllegalStateException e) {
                com.facebook.msys.mci.Log.log(5, AnonymousClass001.A0R("Proxies already configured: ", e.getMessage()));
            }
            AuthDataStorage.initialize(context);
            Execution.initialize(num, null);
            if (z && num != null) {
                Execution.setThreadPriorities(num);
            }
            JsonSerialization.initialize();
            File cacheDir = context.getCacheDir();
            ContentResolver contentResolver = context.getContentResolver();
            boolean z2 = FileManager.sInitialized;
            synchronized (FileManager.class) {
                try {
                    AbstractC09780fb.A01("FileManager.initialize", -1610663637);
                    try {
                        if (FileManager.sInitialized) {
                            i2 = 2034290770;
                        } else {
                            FileManager.mCacheDir = cacheDir;
                            FileManager.mContentResolver = contentResolver;
                            FileManager.nativeInitialize();
                            FileManager.sInitialized = true;
                            i2 = -423764293;
                        }
                        AbstractC09780fb.A00(i2);
                    } catch (Throwable th) {
                        th = th;
                        i = -198587051;
                    }
                } finally {
                }
            }
            boolean z3 = com.facebook.msys.mci.Log.sRegistered;
            synchronized (com.facebook.msys.mci.Log.class) {
                try {
                    AbstractC09780fb.A01("registerLogger", -1350856990);
                    try {
                        if (com.facebook.msys.mci.Log.sRegistered) {
                            i3 = 1776903346;
                        } else {
                            com.facebook.msys.mci.Log.registerLoggerNative(823L, 5, false, 5);
                            com.facebook.msys.mci.Log.setLogLevel(C0K8.A01.getMinimumLoggingLevel());
                            C0K9 c0k9 = new C0K9() { // from class: X.6Dh
                                @Override // X.C0K9
                                public final void DQL(int i6) {
                                    com.facebook.msys.mci.Log.setLogLevel(i6);
                                }
                            };
                            synchronized (C0K8.class) {
                                C0K8.A00.add(c0k9);
                            }
                            com.facebook.msys.mci.Log.sRegistered = true;
                            i3 = -338705183;
                        }
                        AbstractC09780fb.A00(i3);
                    } catch (Throwable th2) {
                        AbstractC09780fb.A00(985533260);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (c1335160w != null) {
                boolean z4 = Connectivity.sInitialized;
                synchronized (Connectivity.class) {
                    AbstractC09780fb.A01("Connectivity.initialize", -1613548771);
                    try {
                        if (Connectivity.sInitialized) {
                            i5 = -329550800;
                        } else {
                            Connectivity.sConnectivityHandler = c1335160w;
                            Connectivity.nativeInitialize();
                            Connectivity.sInitialized = true;
                            i5 = -1803039536;
                        }
                        AbstractC09780fb.A00(i5);
                    } catch (Throwable th4) {
                        th = th4;
                        i = 702405992;
                        AbstractC09780fb.A00(i);
                        throw th;
                    }
                }
            }
            if (c1335360y != null) {
                C1335360y c1335360y2 = Localization.sLocalizedStringProvider;
                synchronized (Localization.class) {
                    AbstractC09780fb.A01("Localization.initialize", -1483488643);
                    try {
                        if (Localization.sLocalizedStringProvider == null && Localization.sLocalizedStringResolver == null) {
                            Localization.nativeInitialize();
                            Localization.sLocalizedStringProvider = c1335360y;
                            Localization.sLocalizedStringResolver = anonymousClass612;
                            i4 = -604778595;
                        } else {
                            i4 = 1520686648;
                        }
                        AbstractC09780fb.A00(i4);
                    } catch (Throwable th5) {
                        th = th5;
                        i = -326436352;
                        AbstractC09780fb.A00(i);
                        throw th;
                    }
                }
            }
        }
    }
}

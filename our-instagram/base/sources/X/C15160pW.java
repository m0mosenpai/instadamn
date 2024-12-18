package X;

import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import java.util.List;

/* renamed from: X.0pW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15160pW implements InterfaceC04640Mg {
    public final int A00;

    public C15160pW(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC04640Mg
    public final void DI7(boolean z) {
        if (this.A00 != 0) {
            synchronized (C0O4.class) {
                C0O4.A00 = true;
                C0O4.A01 = z;
                synchronized (AppStateLoggerNative.class) {
                    if (AppStateLoggerNative.sAppStateLoggerNativeInited) {
                        AppStateLoggerNative.appInForeground(z, z);
                    } else {
                        C0K8.A0D("AppStateLoggerNative", "AppStateLoggerNative.initializeNativeCrashReporting not called.");
                    }
                }
            }
            return;
        }
        C05980Tm c05980Tm = C0SM.A0C;
        if (c05980Tm != null) {
            List<C08140bc> list = c05980Tm.A00;
            synchronized (list) {
                if (z) {
                    for (final C08140bc c08140bc : list) {
                        c08140bc.A00.A0S.post(new Runnable() { // from class: X.09D
                            @Override // java.lang.Runnable
                            public final void run() {
                                C09S c09s;
                                MultiSignalANRDetector multiSignalANRDetector = C08140bc.this.A00;
                                multiSignalANRDetector.A0K = false;
                                if (multiSignalANRDetector.A0L) {
                                    C0K8.A0D(multiSignalANRDetector.A0E, "Resuming error state checks");
                                    C09V c09v = multiSignalANRDetector.A0B;
                                    synchronized (c09v) {
                                        if (c09v.A02 != C05F.A00 && (c09s = c09v.A01) != null) {
                                            Object obj = c09s.A05;
                                            synchronized (obj) {
                                                c09s.A01 = false;
                                                obj.notifyAll();
                                            }
                                        }
                                    }
                                    multiSignalANRDetector.A0L = false;
                                }
                            }
                        });
                    }
                    return;
                }
                for (final C08140bc c08140bc2 : list) {
                    c08140bc2.A00.A0S.post(new Runnable() { // from class: X.09E
                        @Override // java.lang.Runnable
                        public final void run() {
                            MultiSignalANRDetector multiSignalANRDetector = C08140bc.this.A00;
                            C0K8.A0D(multiSignalANRDetector.A0E, "Moving to background");
                            multiSignalANRDetector.A0K = true;
                        }
                    });
                }
            }
        }
    }
}

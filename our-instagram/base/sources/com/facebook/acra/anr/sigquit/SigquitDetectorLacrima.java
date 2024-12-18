package com.facebook.acra.anr.sigquit;

import X.C09X;
import X.C0K8;
import X.InterfaceC04550Lx;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SigquitDetectorLacrima implements C09X {
    public static C09X sInstance;
    public static boolean sIsArt;
    public MultiSignalANRDetector mListener;
    public Handler mMainThreadHandler;
    public boolean mNotifyJavaOnSigquit;

    public static native void nativeAddSignalHandler();

    public static native void nativeCleanupAppStateFile();

    public static native boolean nativeHookMethods();

    public static native void nativeInit(Object obj, boolean z, int i, String str, String str2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str5, boolean z7, boolean z8, boolean z9, boolean z10);

    public static native void nativeSendNextSigquitTraceUnconditionally();

    public static native void nativeStartDetector();

    public static native void nativeStopDetector();

    public static native void nativeWaitForSignal();

    private void onSigquit() {
        MultiSignalANRDetector multiSignalANRDetector = this.mListener;
        if (!multiSignalANRDetector.A0e) {
            Object andSet = multiSignalANRDetector.A0b.getAndSet(null);
            if (andSet != null) {
                multiSignalANRDetector.A0c.set(andSet);
                return;
            }
            multiSignalANRDetector.A04 = SystemClock.uptimeMillis();
            multiSignalANRDetector.A03 = System.currentTimeMillis();
            InterfaceC04550Lx interfaceC04550Lx = multiSignalANRDetector.A0W;
            if (interfaceC04550Lx == null) {
                return;
            }
            interfaceC04550Lx.DmF();
        }
    }

    private void onSigquitTracesAvailable(final String str, final String str2, final boolean z, final boolean z2) {
        C0K8.A0P("SigquitDetectorLacrima", "sigquitDetected inFgV1: %b inFgV2: %b", Boolean.valueOf(z), Boolean.valueOf(z2));
        final MultiSignalANRDetector multiSignalANRDetector = this.mListener;
        if (!multiSignalANRDetector.A0e) {
            C0K8.A0D(multiSignalANRDetector.A0E, "On onSigquitTracesAvailable call");
            synchronized (multiSignalANRDetector.A0Y) {
                if (!multiSignalANRDetector.A0M) {
                    return;
                }
                multiSignalANRDetector.A0c.getAndSet(null);
                InterfaceC04550Lx interfaceC04550Lx = multiSignalANRDetector.A0W;
                if (interfaceC04550Lx != null) {
                    interfaceC04550Lx.DmG();
                }
                final long uptimeMillis = SystemClock.uptimeMillis();
                final long currentTimeMillis = System.currentTimeMillis();
                multiSignalANRDetector.A0S.post(new Runnable() { // from class: X.09G
                    @Override // java.lang.Runnable
                    public final void run() {
                        Integer num;
                        MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                        EnumC07670ah enumC07670ah = multiSignalANRDetector2.A0D;
                        if (enumC07670ah != EnumC07670ah.A04 && enumC07670ah != EnumC07670ah.A05 && enumC07670ah != EnumC07670ah.A06) {
                            num = C05F.A00;
                        } else {
                            num = C05F.A0C;
                        }
                        if (num == C05F.A00) {
                            C0K8.A0D(multiSignalANRDetector2.A0E, "Ignoring new sigquit");
                            String str3 = str2;
                            if (str3 != null) {
                                new File(str3).delete();
                            }
                            SigquitDetectorLacrima.nativeCleanupAppStateFile();
                            if (multiSignalANRDetector2.A0J) {
                                C06420Vj c06420Vj = multiSignalANRDetector2.A0X.A03;
                                c06420Vj.A06 = uptimeMillis;
                                C06420Vj.A00(c06420Vj);
                                return;
                            }
                            return;
                        }
                        multiSignalANRDetector2.A08 = multiSignalANRDetector2.A03;
                        multiSignalANRDetector2.A09 = multiSignalANRDetector2.A04;
                        Integer num2 = C05F.A01;
                        String str4 = multiSignalANRDetector2.A0E;
                        if (num == num2) {
                            C0K8.A0D(str4, "Will clear error state");
                            MultiSignalANRDetector.A01(multiSignalANRDetector2);
                        } else {
                            C0K8.A0D(str4, "Will start new report");
                        }
                        long j = uptimeMillis;
                        multiSignalANRDetector2.A07 = j;
                        multiSignalANRDetector2.A0F = str;
                        multiSignalANRDetector2.A0G = str2;
                        multiSignalANRDetector2.A06 = currentTimeMillis;
                        C09M c09m = C09M.SIGQUIT_RECEIVED;
                        multiSignalANRDetector2.A02(c09m, z, z2);
                        String A00 = multiSignalANRDetector2.A0X.A00();
                        if (A00 != null) {
                            synchronized (AnonymousClass094.class) {
                                ArrayList arrayList = AnonymousClass094.A01;
                                if (arrayList.size() <= 0 || ((AnonymousClass094) arrayList.get(arrayList.size() - 1)).A00 != j) {
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(A00);
                                        try {
                                            if (fileInputStream.read(new byte[8]) != 8) {
                                                C0K8.A0P("SigquitRecord", "Corrupted file %s", A00);
                                            } else {
                                                int i = 0;
                                                do {
                                                    i++;
                                                } while (i < 8);
                                            }
                                            fileInputStream.close();
                                        } catch (Throwable th) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th2) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e) {
                                        C0K8.A0P("SigquitRecord", "Could not read from file %s", A00, e);
                                    }
                                    arrayList.add(new AnonymousClass094(j));
                                }
                            }
                        }
                        MultiSignalANRDetector.A00(c09m, multiSignalANRDetector2);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r1.endsWith(":browser") != false) goto L6;
     */
    @Override // X.C09X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void init(X.C0M9 r22, boolean r23) {
        /*
            r21 = this;
            java.lang.String r1 = "SigquitDetectorLacrima"
            java.lang.String r0 = "nativeInit"
            X.C0K8.A0D(r1, r0)
            r3 = r22
            android.os.Handler r0 = r3.A02
            r4 = r21
            r4.mMainThreadHandler = r0
            boolean r2 = r3.A06
            r4.mNotifyJavaOnSigquit = r2
            boolean r5 = com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.sIsArt
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = ""
            java.lang.String r9 = r3.A05
            java.lang.String r10 = ".stacktrace"
            java.lang.String r1 = r3.A04
            java.lang.String r0 = ":"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = ":browser"
            boolean r0 = r1.endsWith(r0)
            r11 = 0
            if (r0 == 0) goto L32
        L31:
            r11 = 1
        L32:
            r13 = 0
            r14 = 1
            java.lang.String r16 = r3.A00()
            r12 = r23
            r8 = r7
            r15 = r13
            r17 = r13
            r18 = r2
            r19 = r13
            r20 = r13
            nativeInit(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.init(X.0M9, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1.startsWith("0.") != false) goto L8;
     */
    static {
        /*
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L1a
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "0."
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 == 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.sIsArt = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.acra.anr.sigquit.SigquitDetectorLacrima.<clinit>():void");
    }
}

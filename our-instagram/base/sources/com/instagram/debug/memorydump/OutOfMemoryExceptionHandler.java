package com.instagram.debug.memorydump;

import X.C03400Gs;
import X.C0Gl;
import X.C0K8;
import X.C14360o3;
import X.InterfaceC03430Gv;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class OutOfMemoryExceptionHandler {
    public static final Companion Companion = new Object();
    public static final int DO_NOT_SEND_HPROF_DUMPING = 1;
    public static final int MEMORY_MANAGER_NOT_INITIALIZED = 1;
    public static final String TAG = "OutOfMemoryExceptionHandler";
    public static OutOfMemoryExceptionHandler handler;
    public boolean alreadyRun;
    public final int asyncBehavior;
    public byte[] buffer;
    public boolean returnNotInitialized;
    public final boolean runFirstOnOOM;

    /* loaded from: classes.dex */
    public final class Companion {
        public final void init(int i, boolean z, final int i2) {
            if (OutOfMemoryExceptionHandler.handler == null) {
                OutOfMemoryExceptionHandler.handler = new OutOfMemoryExceptionHandler(i, z, i2);
                if (i2 != 3 && z) {
                    C03400Gs.A03(new InterfaceC03430Gv() { // from class: com.instagram.debug.memorydump.OutOfMemoryExceptionHandler$Companion$init$1
                        public int getId() {
                            return 5;
                        }

                        @Override // X.InterfaceC03430Gv
                        public int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
                            C14360o3.A0B(th, 1);
                            OutOfMemoryExceptionHandler outOfMemoryExceptionHandler = OutOfMemoryExceptionHandler.handler;
                            C14360o3.A0A(outOfMemoryExceptionHandler);
                            return outOfMemoryExceptionHandler.handleUncaughtException(th);
                        }

                        public /* synthetic */ int getFlags() {
                            return 0;
                        }
                    }, 1000);
                }
                C03400Gs.A03(new InterfaceC03430Gv() { // from class: com.instagram.debug.memorydump.OutOfMemoryExceptionHandler$Companion$init$2
                    public int getId() {
                        return 18;
                    }

                    @Override // X.InterfaceC03430Gv
                    public int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
                        C14360o3.A0B(th, 1);
                        OutOfMemoryExceptionHandler outOfMemoryExceptionHandler = OutOfMemoryExceptionHandler.handler;
                        C14360o3.A0A(outOfMemoryExceptionHandler);
                        return outOfMemoryExceptionHandler.handleUncaughtException(th);
                    }

                    public int getFlags() {
                        if (i2 != 3) {
                            return 0;
                        }
                        return 1;
                    }
                }, -100);
                return;
            }
            C0K8.A0D(OutOfMemoryExceptionHandler.TAG, "Trying to initialize MemoryDumpHandler twice");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final void init(int i, boolean z, int i2) {
        Companion.init(i, z, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r1 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int handleUncaughtException(java.lang.Throwable r7) {
        /*
            r6 = this;
            r4 = 0
            X.C14360o3.A0B(r7, r4)
            X.2S1 r1 = X.C2S1.A0Z
            r0 = 0
            if (r1 == 0) goto La
            r0 = 1
        La:
            r1 = 1
            if (r0 == 0) goto L61
            boolean r0 = r6.returnNotInitialized
            if (r0 != 0) goto L61
            boolean r5 = r7 instanceof java.lang.OutOfMemoryError
            X.2S1 r3 = X.C2S1.A00()
            X.C14360o3.A07(r3)
            boolean r2 = r6.alreadyRun
            r6.alreadyRun = r1
            int r1 = r6.asyncBehavior
            r0 = 3
            if (r1 == r0) goto L29
            if (r5 == 0) goto L44
            if (r2 == 0) goto L31
            if (r1 == 0) goto L30
        L29:
            X.2SC r0 = r3.A02()
            r0.A08()
        L30:
            return r4
        L31:
            r0 = 0
            r6.buffer = r0
            X.2SC r3 = r3.A02()
            java.lang.String r2 = r7.getMessage()
            int r1 = r6.asyncBehavior
            java.lang.String r0 = "OOM"
            r3.A09(r0, r2, r1)
            return r4
        L44:
            boolean r0 = r6.runFirstOnOOM
            if (r0 == 0) goto L4b
            if (r2 != 0) goto L4b
            return r4
        L4b:
            X.2SC r2 = r3.A02()
            java.lang.Throwable r0 = X.AbstractC63327Shb.A00(r7)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "Exception"
            r2.A09(r0, r1, r4)
            return r4
        L61:
            r6.returnNotInitialized = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.memorydump.OutOfMemoryExceptionHandler.handleUncaughtException(java.lang.Throwable):int");
    }

    public OutOfMemoryExceptionHandler(int i, boolean z, int i2) {
        byte[] bArr;
        this.runFirstOnOOM = z;
        this.asyncBehavior = i2;
        if (i > 0) {
            bArr = new byte[i];
        } else {
            bArr = null;
        }
        this.buffer = bArr;
    }
}

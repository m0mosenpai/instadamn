package com.facebook.tigon;

import X.AnonymousClass001;
import X.C1T4;
import X.C1T5;
import X.C1T7;
import X.C9BO;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public class TigonCallbacksIntegerBufferJavaHelper {
    public static void onResponse(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        C1T7 c1t7 = new C1T7(bArr, i);
        tigonCallbacks.onResponse(new C9BO(C1T5.A00(c1t7), 0, C1T4.A00.A03(c1t7)));
    }

    public static void onEOM(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        boolean z;
        try {
            z = true;
            try {
                tigonCallbacks.onEOM(C1T4.A01(bArr, i));
            } catch (OutOfMemoryError e) {
                e = e;
                String A0u = AnonymousClass001.A0u("OutOfMemory in TigonCallbacksIntegerBufferJavaHelper onEOM. size:", String.valueOf(i), " tigonSummaryDeserialized:", String.valueOf(z));
                PrintStream printStream = System.out;
                printStream.println(A0u);
                printStream.println(Arrays.toString(e.getStackTrace()));
                throw new Error(A0u, e);
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
            z = false;
        }
    }

    public static void onError(TigonCallbacks tigonCallbacks, byte[] bArr, int i, byte[] bArr2, int i2) {
        tigonCallbacks.onError(C1T4.A00(bArr, i), C1T4.A01(bArr2, i2));
    }

    public static void onStarted(TigonCallbacks tigonCallbacks, byte[] bArr, int i) {
        tigonCallbacks.onStarted(C1T4.A03(bArr, i));
    }

    public static void onWillRetry(TigonCallbacks tigonCallbacks, byte[] bArr, int i, byte[] bArr2, int i2) {
        tigonCallbacks.onWillRetry(C1T4.A00(bArr, i), C1T4.A01(bArr2, i2));
    }
}

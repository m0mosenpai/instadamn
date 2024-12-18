package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* renamed from: X.0Ja, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03850Ja {
    public static Runnable A00;

    public static final void A01(String str) {
        C14360o3.A0B(str, 0);
        RuntimeException runtimeException = new RuntimeException(str);
        if (C0L6.A07() && C03400Gs.A01() != null) {
            android.util.Log.e("AppExitUtil", "App in foreground, sending exception to ExceptionHandlerManager");
            Thread currentThread = Thread.currentThread();
            synchronized (C03400Gs.class) {
                C03400Gs.A00().uncaughtException(currentThread, runtimeException);
                throw null;
            }
        }
        synchronized (C03850Ja.class) {
            if (A00 != null) {
                android.util.Log.e("AppExitUtil", AnonymousClass001.A0R("Killing process silently, bypassing error reporting: ", runtimeException.getMessage()), new Throwable());
                Runnable runnable = A00;
                C14360o3.A0A(runnable);
                runnable.run();
            }
        }
        Process.killProcess(Process.myPid());
    }

    public static final void A00(final String str) {
        final Handler handler = new Handler(Looper.getMainLooper());
        final Runnable runnable = new Runnable() { // from class: X.0JZ
            @Override // java.lang.Runnable
            public final void run() {
                if (!C0L6.A07()) {
                    android.util.Log.e("AppExitUtil", "Killing process in background.");
                    String str2 = str;
                    C14360o3.A0A(str2);
                    C03850Ja.A01(str2);
                }
            }
        };
        if (!C0L6.A07()) {
            handler.postDelayed(runnable, 30000L);
        }
        C0L6.A03(new C0L3() { // from class: X.0D5
            @Override // X.C0L3
            public final void Cwx() {
            }

            @Override // X.C0L3
            public final void Cx1() {
                handler.postDelayed(runnable, 30000L);
            }
        }, false);
    }
}

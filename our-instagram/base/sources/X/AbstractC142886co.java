package X;

import java.util.concurrent.Callable;

/* renamed from: X.6co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC142886co {
    public static Runnable A01(Runnable runnable) {
        AbstractC42141x4.A01(runnable, "run is null");
        return runnable;
    }

    public static void A02(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof YK7) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C64866TXr)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
            sb.append(th);
            th = new IllegalStateException(sb.toString(), th);
        }
        th.printStackTrace();
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static AbstractC150996r0 A00(Callable callable) {
        try {
            Object call = callable.call();
            AbstractC42141x4.A01(call, "Scheduler Callable result can't be null");
            return (AbstractC150996r0) call;
        } catch (Throwable th) {
            throw Y4X.A00(th);
        }
    }
}

package X;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4r3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class RunnableC106494r3 implements Runnable, InterfaceC106504r4 {
    public static Method A06;
    public static final java.util.Set A07 = new HashSet();
    public long A00;
    public C61245Rji A01;
    public final Looper A02;
    public final Handler A03;
    public final AtomicBoolean A04 = new AtomicBoolean(true);
    public final AtomicBoolean A05 = new AtomicBoolean(false);

    static {
        try {
            Method declaredMethod = MessageQueue.class.getDeclaredMethod("isPolling", new Class[0]);
            A06 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Throwable unused) {
        }
    }

    public final String A00(long j) {
        String A0R;
        long uptimeMillis;
        long j2;
        if (this instanceof C106524r6) {
            C106524r6 c106524r6 = (C106524r6) this;
            A0R = AnonymousClass001.A0R("Blocked on ", c106524r6.getName());
            InterfaceC106514r5 interfaceC106514r5 = c106524r6.A00;
            if (interfaceC106514r5 != null) {
                A0R = AnonymousClass001.A0g(A0R, " in ", interfaceC106514r5.getName());
            }
            uptimeMillis = SystemClock.uptimeMillis();
            j2 = ((RunnableC106494r3) c106524r6).A00;
        } else {
            A0R = AnonymousClass001.A0R("Blocked on ", getName());
            uptimeMillis = SystemClock.uptimeMillis();
            j2 = this.A00;
        }
        return AnonymousClass001.A0s(AnonymousClass001.A0s(A0R, " for ", " seconds; ", (uptimeMillis - j2) / 1000), "dump took ", AbstractC43591JPw.A00(225), j);
    }

    public boolean A01() {
        Method method = A06;
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(this.A02.getQueue(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable, X.Rji, java.lang.Exception] */
    @Override // X.InterfaceC106504r4
    public final boolean AHE() {
        if (this.A04.get()) {
            return true;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        StackTraceElement[] stackTrace = this.A02.getThread().getStackTrace();
        ?? exc = new Exception(A00((SystemClock.uptimeMillis() - uptimeMillis) / 1000));
        exc.setStackTrace(stackTrace);
        this.A01 = exc;
        return false;
    }

    @Override // X.InterfaceC106514r5
    public final void Cpp() {
        if (!this.A05.get() && !A01()) {
            this.A04.set(false);
            this.A00 = SystemClock.uptimeMillis();
            this.A03.postAtFrontOfQueue(this);
            return;
        }
        this.A04.set(true);
    }

    @Override // X.InterfaceC106504r4
    public final void EHc() {
        AtomicBoolean atomicBoolean = this.A04;
        if (!atomicBoolean.get()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StackTraceElement[] stackTrace = this.A02.getThread().getStackTrace();
            Exception exc = new Exception(A00((SystemClock.uptimeMillis() - uptimeMillis) / 1000));
            exc.setStackTrace(stackTrace);
            C61245Rji c61245Rji = this.A01;
            if (c61245Rji != null) {
                exc.initCause(c61245Rji);
            }
            if (!atomicBoolean.get()) {
                C106484r2.A00().A05(AnonymousClass001.A0R("LooperWatchdog-", getName()), exc);
                this.A05.set(true);
                C106484r2 A00 = C106484r2.A00();
                synchronized (A00.A03) {
                    A00.A05.add(this);
                }
                return;
            }
        }
        this.A01 = null;
    }

    @Override // X.InterfaceC106514r5
    public final String getName() {
        return this.A02.getThread().getName();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A04.set(true);
        if (this.A05.getAndSet(false)) {
            C106484r2 A00 = C106484r2.A00();
            synchronized (A00.A03) {
                A00.A05.remove(this);
            }
        }
    }

    public RunnableC106494r3(Handler handler) {
        Looper looper = handler.getLooper();
        this.A02 = looper;
        this.A03 = handler;
        A07.add(looper);
    }
}

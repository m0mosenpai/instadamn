package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.7qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175227qw {
    public static final UUID A06 = UUID.randomUUID();
    public Handler A00;
    public UUID A01;
    public final Handler A02;
    public final Handler A03;
    public final HandlerThread A04;
    public final HandlerThread A05;

    public final synchronized C176617tJ A00(AbstractC184688Hj abstractC184688Hj, String str, Callable callable) {
        C176617tJ c176617tJ;
        UUID uuid = this.A01;
        uuid.getClass();
        c176617tJ = new C176617tJ(this, str, uuid, callable);
        if (abstractC184688Hj != null) {
            c176617tJ.A01(abstractC184688Hj);
        }
        this.A03.postAtTime(c176617tJ, this.A01, SystemClock.uptimeMillis());
        return c176617tJ;
    }

    public final synchronized C176617tJ A01(AbstractC184688Hj abstractC184688Hj, String str, Callable callable) {
        C176617tJ c176617tJ;
        UUID uuid = A06;
        c176617tJ = new C176617tJ(this, str, uuid, callable);
        c176617tJ.A01(abstractC184688Hj);
        this.A03.postAtTime(c176617tJ, uuid, SystemClock.uptimeMillis());
        return c176617tJ;
    }

    public final synchronized C176617tJ A02(String str, Callable callable, long j) {
        C176617tJ c176617tJ;
        UUID uuid = this.A01;
        uuid.getClass();
        c176617tJ = new C176617tJ(this, str, uuid, callable);
        this.A03.postAtTime(c176617tJ, this.A01, SystemClock.uptimeMillis() + j);
        return c176617tJ;
    }

    public final Object A03(String str, Callable callable) {
        C176617tJ c176617tJ;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            c176617tJ = new C176617tJ(this, str, uuid, callable);
            this.A02.post(c176617tJ);
        }
        return c176617tJ.get();
    }

    public final Object A04(String str, Callable callable) {
        C176617tJ c176617tJ;
        synchronized (this) {
            UUID uuid = this.A01;
            uuid.getClass();
            c176617tJ = new C176617tJ(this, str, uuid, callable);
            this.A02.post(c176617tJ);
        }
        InterfaceC175347rA interfaceC175347rA = (InterfaceC175347rA) c176617tJ.get();
        interfaceC175347rA.AE4();
        return interfaceC175347rA.Bos();
    }

    public final synchronized void A05(Runnable runnable, UUID uuid) {
        UUID uuid2 = this.A01;
        if ((uuid2 != null && uuid2.equals(uuid)) || A06.equals(uuid)) {
            Handler handler = this.A00;
            if (handler != null) {
                handler.postAtTime(runnable, uuid, SystemClock.uptimeMillis());
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                synchronized (C176567tE.class) {
                    C176567tE.A00.postAtTime(runnable, uuid, uptimeMillis);
                }
            }
        }
    }

    public final synchronized void A07(String str, Callable callable) {
        A00(null, str, callable);
    }

    public final synchronized void A08(FutureTask futureTask) {
        this.A03.removeCallbacks(futureTask);
    }

    public final boolean A09() {
        if (this.A03.getLooper().getThread() != Thread.currentThread()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        HandlerThread handlerThread = this.A04;
        handlerThread.quitSafely();
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        HandlerThread handlerThread2 = this.A05;
        handlerThread2.quitSafely();
        try {
            handlerThread2.join();
        } catch (InterruptedException unused2) {
            Thread.currentThread().interrupt();
        }
    }

    public C175227qw() {
        HandlerThread handlerThread = new HandlerThread("Optic-Task-Handler-Thread");
        AbstractC09770fa.A00(handlerThread);
        this.A05 = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        looper.getClass();
        this.A03 = new Handler(looper);
        HandlerThread handlerThread2 = new HandlerThread("Optic-Camera-Handler-Thread");
        AbstractC09770fa.A00(handlerThread2);
        this.A04 = handlerThread2;
        handlerThread2.start();
        Looper looper2 = handlerThread2.getLooper();
        looper2.getClass();
        this.A02 = new Handler(looper2);
    }

    public final void A06(String str) {
        if (A09()) {
        } else {
            throw new RuntimeException(AnonymousClass001.A0g(str, " Current thread: ", Thread.currentThread().getName()));
        }
    }
}

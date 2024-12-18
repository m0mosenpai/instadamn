package X;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import ca.psiphon.PsiphonTunnel;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3IC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IC implements Runnable {
    public static Handler A05;
    public final FutureTask A00;
    public final AtomicBoolean A01;
    public final AtomicBoolean A02;
    public volatile Integer A03;
    public final /* synthetic */ AbstractC62442sj A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3IC(AbstractC62442sj abstractC62442sj) {
        this();
        this.A04 = abstractC62442sj;
    }

    public final void A00(final Object obj) {
        Handler handler;
        synchronized (C3IC.class) {
            handler = A05;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                A05 = handler;
            }
        }
        handler.post(new Runnable() { // from class: X.3Nb
            @Override // java.lang.Runnable
            public final void run() {
                C3IC c3ic = C3IC.this;
                Object obj2 = obj;
                if (c3ic.A01.get()) {
                    c3ic.A04.A0A(c3ic);
                } else {
                    AbstractC62442sj abstractC62442sj = c3ic.A04;
                    if (abstractC62442sj.A01 != c3ic) {
                        abstractC62442sj.A0A(c3ic);
                    } else if (!abstractC62442sj.A03) {
                        abstractC62442sj.A05 = false;
                        SystemClock.uptimeMillis();
                        abstractC62442sj.A01 = null;
                        abstractC62442sj.A03(obj2);
                    }
                }
                c3ic.A03 = C05F.A0C;
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.A08();
    }

    public C3IC() {
        this.A03 = C05F.A00;
        this.A01 = new AtomicBoolean();
        this.A02 = new AtomicBoolean();
        final Callable callable = new Callable() { // from class: X.3ID
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3IC c3ic = C3IC.this;
                c3ic.A02.set(true);
                Object obj = null;
                try {
                    Process.setThreadPriority(10);
                    try {
                        obj = c3ic.A04.A06();
                    } catch (AbstractC902340i e) {
                        if (!c3ic.A01.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    return obj;
                } finally {
                }
            }
        };
        this.A00 = new FutureTask(callable) { // from class: X.3IE
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                try {
                    Object obj = get();
                    C3IC c3ic = C3IC.this;
                    if (!c3ic.A02.get()) {
                        c3ic.A00(obj);
                    }
                } catch (InterruptedException e) {
                    android.util.Log.w(AbstractC111324zv.A00(PsiphonTunnel.VPN_INTERFACE_MTU), e);
                } catch (CancellationException unused) {
                    C3IC c3ic2 = C3IC.this;
                    if (!c3ic2.A02.get()) {
                        c3ic2.A00(null);
                    }
                } catch (ExecutionException e2) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }
}

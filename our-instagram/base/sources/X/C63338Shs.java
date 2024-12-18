package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: X.Shs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63338Shs {
    public static Executor A04 = Executors.newCachedThreadPool(new TVJ());
    public final java.util.Set A02 = new LinkedHashSet(1);
    public final java.util.Set A01 = new LinkedHashSet(1);
    public final Handler A00 = AbstractC167007dF.A0J();
    public volatile C62958SZa A03 = null;

    public final synchronized void A02(InterfaceC65307Thj interfaceC65307Thj) {
        Throwable th;
        C62958SZa c62958SZa = this.A03;
        if (c62958SZa != null && (th = c62958SZa.A01) != null) {
            interfaceC65307Thj.onResult(th);
        }
        this.A01.add(interfaceC65307Thj);
    }

    public final synchronized void A03(InterfaceC65307Thj interfaceC65307Thj) {
        Object obj;
        C62958SZa c62958SZa = this.A03;
        if (c62958SZa != null && (obj = c62958SZa.A00) != null) {
            interfaceC65307Thj.onResult(obj);
        }
        this.A02.add(interfaceC65307Thj);
    }

    public static void A00(C62958SZa c62958SZa, final C63338Shs c63338Shs) {
        if (c63338Shs.A03 == null) {
            c63338Shs.A03 = c62958SZa;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                A01(c63338Shs);
                return;
            } else {
                c63338Shs.A00.post(new Runnable() { // from class: X.TJT
                    @Override // java.lang.Runnable
                    public final void run() {
                        C63338Shs.A01(C63338Shs.this);
                    }
                });
                return;
            }
        }
        throw AbstractC166987dD.A14("A task may only be set once.");
    }

    public static void A01(C63338Shs c63338Shs) {
        C62958SZa c62958SZa = c63338Shs.A03;
        if (c62958SZa != null) {
            Object obj = c62958SZa.A00;
            if (obj != null) {
                synchronized (c63338Shs) {
                    Iterator it = AbstractC166987dD.A1F(c63338Shs.A02).iterator();
                    while (it.hasNext()) {
                        ((InterfaceC65307Thj) it.next()).onResult(obj);
                    }
                }
            }
            Throwable th = c62958SZa.A01;
            synchronized (c63338Shs) {
                ArrayList A1F = AbstractC166987dD.A1F(c63338Shs.A01);
                if (A1F.isEmpty()) {
                    SQZ.A01("Lottie encountered an error but no failure listener was added:", th);
                } else {
                    Iterator it2 = A1F.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC65307Thj) it2.next()).onResult(th);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.TZy, java.util.concurrent.FutureTask, java.lang.Runnable] */
    public C63338Shs(Callable callable, boolean z) {
        if (z) {
            try {
                A00((C62958SZa) callable.call(), this);
                return;
            } catch (Throwable th) {
                A00(new C62958SZa(th), this);
                return;
            }
        }
        Executor executor = A04;
        ?? futureTask = new FutureTask(callable);
        futureTask.A00 = this;
        executor.execute(futureTask);
    }

    public C63338Shs(Object obj) {
        A00(new C62958SZa(obj), this);
    }
}

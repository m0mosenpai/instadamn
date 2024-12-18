package X;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SLw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62683SLw {
    public final C63175Sea A00;
    public final AtomicInteger A02 = MSW.A1C(0);
    public final AtomicBoolean A01 = new AtomicBoolean(false);

    public final C5KS A01(final C62446SBz c62446SBz, final Callable callable, final Executor executor) {
        if (this.A02.get() > 0) {
            if (c62446SBz.A00.A0E()) {
                C5KS c5ks = new C5KS();
                c5ks.A07();
                return c5ks;
            }
            final SKc sKc = new SKc();
            final C58411Pup c58411Pup = new C58411Pup(sKc.A00);
            this.A00.A02(new Runnable() { // from class: X.TR8
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC62683SLw abstractC62683SLw = this;
                    C62446SBz c62446SBz2 = c62446SBz;
                    SKc sKc2 = sKc;
                    Callable callable2 = callable;
                    C58411Pup c58411Pup2 = c58411Pup;
                    C5KS c5ks2 = c62446SBz2.A00;
                    try {
                        if (!c5ks2.A0E()) {
                            try {
                                AtomicBoolean atomicBoolean = abstractC62683SLw.A01;
                                if (!atomicBoolean.get()) {
                                    RW7 rw7 = (RW7) abstractC62683SLw;
                                    synchronized (rw7) {
                                        rw7.A00.FFq();
                                    }
                                    atomicBoolean.set(true);
                                }
                                if (c5ks2.A0E()) {
                                    sKc2.A00();
                                    return;
                                }
                                Object call = callable2.call();
                                if (c5ks2.A0E()) {
                                    sKc2.A00();
                                    return;
                                } else {
                                    c58411Pup2.A01(call);
                                    return;
                                }
                            } catch (RuntimeException e) {
                                throw new RkG("Internal error has occurred when executing ML Kit tasks", e);
                            }
                        }
                    } catch (Exception e2) {
                        if (!c5ks2.A0E()) {
                            c58411Pup2.A00(e2);
                            return;
                        }
                    }
                    sKc2.A00();
                }
            }, new Executor() { // from class: X.TUk
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    Executor executor2 = executor;
                    C62446SBz c62446SBz2 = c62446SBz;
                    SKc sKc2 = sKc;
                    C58411Pup c58411Pup2 = c58411Pup;
                    try {
                        executor2.execute(runnable);
                    } catch (RuntimeException e) {
                        if (c62446SBz2.A00.A0E()) {
                            sKc2.A00();
                            throw e;
                        }
                        c58411Pup2.A00(e);
                        throw e;
                    }
                }
            });
            return c58411Pup.A00;
        }
        throw AbstractC58318PtA.A0Z();
    }

    public AbstractC62683SLw(C63175Sea c63175Sea) {
        this.A00 = c63175Sea;
    }
}

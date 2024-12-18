package X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6r0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC150996r0 {
    public static final AbstractC150996r0 $redex_init_class = null;

    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public AbstractC151006r1 A00() {
        C142966cw c142966cw;
        if (this instanceof C151026r3) {
            C151026r3 c151026r3 = (C151026r3) this;
            final Handler handler = c151026r3.A00;
            final boolean z = c151026r3.A01;
            return new AbstractC151006r1(handler, z) { // from class: X.9Ac
                public final Handler A00;
                public final boolean A01;
                public volatile boolean A02;

                @Override // X.InterfaceC41801wU
                public final void dispose() {
                    this.A02 = true;
                    this.A00.removeCallbacksAndMessages(this);
                }

                @Override // X.AbstractC151006r1
                public final InterfaceC41801wU A01(Runnable runnable, TimeUnit timeUnit, long j) {
                    if (runnable != null) {
                        if (timeUnit != null) {
                            if (!this.A02) {
                                Runnable A01 = AbstractC142886co.A01(runnable);
                                Handler handler2 = this.A00;
                                RunnableC207529Gf runnableC207529Gf = new RunnableC207529Gf(handler2, A01);
                                Message obtain = Message.obtain(handler2, runnableC207529Gf);
                                obtain.obj = this;
                                if (this.A01) {
                                    obtain.setAsynchronous(true);
                                }
                                handler2.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                                if (this.A02) {
                                    handler2.removeCallbacks(runnableC207529Gf);
                                } else {
                                    return runnableC207529Gf;
                                }
                            }
                            return EnumC137086Im.INSTANCE;
                        }
                        throw new NullPointerException(AbstractC111324zv.A00(5527));
                    }
                    throw new NullPointerException("run == null");
                }

                {
                    this.A00 = handler;
                    this.A01 = z;
                }
            };
        }
        if (this instanceof C151016r2) {
            return new C6JH(((C151016r2) this).A00);
        }
        if (this instanceof C142956cv) {
            C142986cy c142986cy = (C142986cy) ((C142956cv) this).A01.get();
            int i = c142986cy.A01;
            if (i == 0) {
                c142966cw = C142956cv.A04;
            } else {
                C142966cw[] c142966cwArr = c142986cy.A02;
                long j = c142986cy.A00;
                c142986cy.A00 = 1 + j;
                c142966cw = c142966cwArr[(int) (j % i)];
            }
            return new JSZ(c142966cw);
        }
        if (this instanceof C143046d4) {
            return new C72331XbT();
        }
        if (this instanceof C142906cq) {
            return new C46113KbD((ScheduledExecutorService) ((C142906cq) this).A01.get());
        }
        if (this instanceof C143076d7) {
            return new C142976cx(((C143076d7) this).A00);
        }
        return new C46114KbE((RunnableC143036d3) ((C143016d1) this).A01.get());
    }

    public final InterfaceC41801wU A01(Runnable runnable) {
        if (this instanceof C151016r2) {
            C151016r2 c151016r2 = (C151016r2) this;
            AbstractC42141x4.A01(runnable, "run is null");
            try {
                Executor executor = c151016r2.A00;
                if (executor instanceof ExecutorService) {
                    CallableC73554YKh callableC73554YKh = new CallableC73554YKh(runnable);
                    callableC73554YKh.A00(((ExecutorService) executor).submit(callableC73554YKh));
                    return callableC73554YKh;
                }
                RunnableC1345766h runnableC1345766h = new RunnableC1345766h(runnable);
                executor.execute(runnableC1345766h);
                return runnableC1345766h;
            } catch (RejectedExecutionException e) {
                AbstractC142886co.A02(e);
                return EnumC137086Im.INSTANCE;
            }
        }
        if (this instanceof C143046d4) {
            AbstractC42141x4.A01(runnable, "run is null");
            runnable.run();
            return EnumC137086Im.INSTANCE;
        }
        return A02(runnable, TimeUnit.NANOSECONDS, 0L);
    }

    public final InterfaceC41801wU A02(Runnable runnable, TimeUnit timeUnit, long j) {
        C142966cw c142966cw;
        Future submit;
        Future schedule;
        if (this instanceof C151026r3) {
            C151026r3 c151026r3 = (C151026r3) this;
            if (timeUnit != null) {
                AbstractC42141x4.A01(runnable, "run is null");
                Handler handler = c151026r3.A00;
                RunnableC207529Gf runnableC207529Gf = new RunnableC207529Gf(handler, runnable);
                Message obtain = Message.obtain(handler, runnableC207529Gf);
                if (c151026r3.A01) {
                    obtain.setAsynchronous(true);
                }
                handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                return runnableC207529Gf;
            }
            throw new NullPointerException("unit == null");
        }
        if (this instanceof C143046d4) {
            try {
                timeUnit.sleep(j);
                AbstractC42141x4.A01(runnable, "run is null");
                runnable.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                AbstractC142886co.A02(e);
            }
            return EnumC137086Im.INSTANCE;
        }
        if (this instanceof C142906cq) {
            C142906cq c142906cq = (C142906cq) this;
            FutureTask futureTask = CallableC73554YKh.A03;
            AbstractC42141x4.A01(runnable, "run is null");
            CallableC73554YKh callableC73554YKh = new CallableC73554YKh(runnable);
            try {
                if (j <= 0) {
                    schedule = ((ExecutorService) c142906cq.A01.get()).submit(callableC73554YKh);
                } else {
                    schedule = ((ScheduledExecutorService) c142906cq.A01.get()).schedule(callableC73554YKh, j, timeUnit);
                }
                callableC73554YKh.A00(schedule);
                return callableC73554YKh;
            } catch (RejectedExecutionException e2) {
                AbstractC142886co.A02(e2);
                return EnumC137086Im.INSTANCE;
            }
        }
        if (this instanceof C151016r2) {
            C151016r2 c151016r2 = (C151016r2) this;
            AbstractC42141x4.A01(runnable, "run is null");
            Executor executor = c151016r2.A00;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    CallableC73554YKh callableC73554YKh2 = new CallableC73554YKh(runnable);
                    callableC73554YKh2.A00(((ScheduledExecutorService) executor).schedule(callableC73554YKh2, j, timeUnit));
                    return callableC73554YKh2;
                } catch (RejectedExecutionException e3) {
                    AbstractC142886co.A02(e3);
                    return EnumC137086Im.INSTANCE;
                }
            }
            RunnableC73555YKi runnableC73555YKi = new RunnableC73555YKi(runnable);
            C6KP.A00(C151016r2.A01.A02(new RunnableC73524YHo(runnableC73555YKi, c151016r2), timeUnit, j), runnableC73555YKi.A01);
            return runnableC73555YKi;
        }
        if (this instanceof C142956cv) {
            C142986cy c142986cy = (C142986cy) ((C142956cv) this).A01.get();
            int i = c142986cy.A01;
            if (i == 0) {
                c142966cw = C142956cv.A04;
            } else {
                C142966cw[] c142966cwArr = c142986cy.A02;
                long j2 = c142986cy.A00;
                c142986cy.A00 = 1 + j2;
                c142966cw = c142966cwArr[(int) (j2 % i)];
            }
            FutureTask futureTask2 = CallableC73554YKh.A03;
            AbstractC42141x4.A01(runnable, "run is null");
            CallableC73554YKh callableC73554YKh3 = new CallableC73554YKh(runnable);
            try {
                if (j > 0) {
                    submit = c142966cw.A00.schedule(callableC73554YKh3, j, timeUnit);
                } else {
                    submit = c142966cw.A00.submit(callableC73554YKh3);
                }
                callableC73554YKh3.A00(submit);
                return callableC73554YKh3;
            } catch (RejectedExecutionException e4) {
                AbstractC142886co.A02(e4);
                return EnumC137086Im.INSTANCE;
            }
        }
        AbstractC151006r1 A00 = A00();
        AbstractC42141x4.A01(runnable, "run is null");
        M7P m7p = new M7P(A00, runnable);
        A00.A01(m7p, timeUnit, j);
        return m7p;
    }
}

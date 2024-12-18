package com.facebook.react.bridge.queue;

import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.C0I2;
import X.C62155S0c;
import X.C62791SRl;
import X.FutureC64809TUx;
import X.MSY;
import X.Q3Z;
import X.SBH;
import X.SWC;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes10.dex */
public class MessageQueueThreadImpl implements MessageQueueThread {
    public final Looper A00;
    public final C62155S0c A01;
    public final String A02;
    public final Q3Z A03;
    public final String A04;
    public volatile boolean A05 = false;

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        this.A05 = true;
        Looper looper = this.A00;
        looper.quit();
        if (looper.getThread() != Thread.currentThread()) {
            try {
                looper.getThread().join();
            } catch (InterruptedException unused) {
                throw MSY.A0d("Got interrupted waiting to join thread ", this.A02);
            }
        }
    }

    public static MessageQueueThreadImpl A00(SBH sbh, SWC swc) {
        Looper mainLooper;
        C62155S0c c62155S0c;
        int intValue = swc.A00.intValue();
        String str = swc.A01;
        if (intValue != 0) {
            final FutureC64809TUx futureC64809TUx = new FutureC64809TUx();
            new Thread(null, new Runnable() { // from class: X.TKc
                @Override // java.lang.Runnable
                public final void run() {
                    FutureC64809TUx futureC64809TUx2 = FutureC64809TUx.this;
                    Process.setThreadPriority(-4);
                    Looper.prepare();
                    Object obj = new Object();
                    SystemClock.uptimeMillis();
                    SystemClock.currentThreadTimeMillis();
                    Pair pair = new Pair(Looper.myLooper(), obj);
                    CountDownLatch countDownLatch = futureC64809TUx2.A02;
                    if (countDownLatch.getCount() != 0) {
                        futureC64809TUx2.A01 = pair;
                        countDownLatch.countDown();
                        Looper.loop();
                        return;
                    }
                    throw AbstractC166987dD.A18("Result has already been set!");
                }
            }, AnonymousClass001.A0R("mqt_", str), 0L).start();
            try {
                Pair pair = (Pair) futureC64809TUx.get();
                mainLooper = (Looper) pair.first;
                c62155S0c = (C62155S0c) pair.second;
            } catch (InterruptedException e) {
                throw AbstractC58318PtA.A0f(e);
            } catch (ExecutionException e2) {
                throw AbstractC58318PtA.A0f(e2);
            }
        } else {
            mainLooper = Looper.getMainLooper();
            c62155S0c = null;
        }
        return new MessageQueueThreadImpl(mainLooper, sbh, c62155S0c, str);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public Future callOnQueue(final Callable callable) {
        final FutureC64809TUx futureC64809TUx = new FutureC64809TUx();
        runOnQueue(new Runnable() { // from class: X.TNk
            @Override // java.lang.Runnable
            public final void run() {
                FutureC64809TUx futureC64809TUx2 = FutureC64809TUx.this;
                try {
                    Object call = callable.call();
                    CountDownLatch countDownLatch = futureC64809TUx2.A02;
                    if (countDownLatch.getCount() != 0) {
                        futureC64809TUx2.A01 = call;
                        countDownLatch.countDown();
                        return;
                    }
                    throw AbstractC166987dD.A18("Result has already been set!");
                } catch (Exception e) {
                    CountDownLatch countDownLatch2 = futureC64809TUx2.A02;
                    if (countDownLatch2.getCount() != 0) {
                        futureC64809TUx2.A00 = e;
                        countDownLatch2.countDown();
                        return;
                    }
                    throw AbstractC166987dD.A18("Result has already been set!");
                }
            }
        });
        return futureC64809TUx;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public C62155S0c getPerfStats() {
        return this.A01;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isIdle() {
        return this.A00.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return AbstractC167007dF.A1X(this.A00.getThread(), Thread.currentThread());
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        runOnQueue(new Runnable() { // from class: X.TKd
            @Override // java.lang.Runnable
            public final void run() {
                SystemClock.uptimeMillis();
                SystemClock.currentThreadTimeMillis();
            }
        });
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean runOnQueue(Runnable runnable) {
        if (this.A05) {
            C0I2.A04("ReactNative", AnonymousClass001.A0g("Tried to enqueue runnable on already finished thread: '", this.A02, "... dropping Runnable."));
            return false;
        }
        this.A03.post(runnable);
        return true;
    }

    public MessageQueueThreadImpl(Looper looper, SBH sbh, C62155S0c c62155S0c, String str) {
        this.A02 = str;
        this.A00 = looper;
        this.A03 = new Q3Z(looper, sbh);
        this.A01 = c62155S0c;
        this.A04 = AnonymousClass001.A0g("Expected to be called from the '", this.A02, "' thread!");
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(String str) {
        C62791SRl.A00(isOnThread(), AnonymousClass001.A0g(this.A04, " ", str));
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        C62791SRl.A00(isOnThread(), this.A04);
    }
}

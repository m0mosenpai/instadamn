package com.facebook.msys.mca;

import X.AnonymousClass603;
import X.AnonymousClass663;
import X.AnonymousClass664;
import X.AnonymousClass665;
import X.C0K8;
import X.C1347166v;
import X.InterfaceExecutorC135866Co;
import android.os.ConditionVariable;
import android.os.Looper;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.util.NotificationScope;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class MailboxFutureImpl extends MailboxObservableImpl implements AnonymousClass663 {
    public static final Thread UI_THREAD = Looper.getMainLooper().getThread();
    public boolean A00;
    public final AnonymousClass665 A01;
    public final ConditionVariable mCompletionCV;
    public final InterfaceExecutorC135866Co mMailboxApiHandleProvider;
    public String mNotificationName;
    public NotificationScope mNotificationScope;

    @Override // X.AnonymousClass663
    public final synchronized AnonymousClass663 A84(MailboxCallback mailboxCallback, Executor executor) {
        this.A01.A01(mailboxCallback, new AnonymousClass603(this), null, executor, isCancelled());
        return this;
    }

    @Override // X.AnonymousClass663
    @Deprecated
    public final synchronized AnonymousClass663 Ecq(MailboxCallback mailboxCallback) {
        AnonymousClass664 anonymousClass664 = (AnonymousClass664) this.resultCallbacks;
        boolean z = this.A00;
        C1347166v c1347166v = new C1347166v(this);
        boolean z2 = this.mSetResult;
        Object obj = this.mResult;
        synchronized (anonymousClass664) {
            if (!anonymousClass664.A01) {
                anonymousClass664.A01 = true;
                if (!z) {
                    anonymousClass664.A00 = mailboxCallback;
                    if (!c1347166v.A00.isDisabled()) {
                        anonymousClass664.A01(anonymousClass664.A00, c1347166v, obj, null, z2);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot set multiple callbacks");
            }
        }
        return this;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        boolean z2;
        z2 = false;
        if (!isDone()) {
            z2 = true;
        }
        if (!this.A00) {
            this.A00 = true;
            ((AnonymousClass664) this.resultCallbacks).A00();
            cancelNotificationCallback(z);
            if (z2) {
                this.A01.A02(new AnonymousClass603(this), null);
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        Object obj;
        synchronized (this) {
            if (this.mSetResult) {
                return this.mResult;
            }
            if (!this.A00) {
                getResultBlocking(j, timeUnit);
                synchronized (this) {
                    if (this.mSetResult) {
                        obj = this.mResult;
                    } else {
                        if (this.A00) {
                            throw new CancellationException();
                        }
                        throw new TimeoutException();
                    }
                }
                return obj;
            }
            throw new CancellationException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r2.mSetResult != false) goto L7;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isCancelled() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.A00     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto La
            boolean r1 = r2.mSetResult     // Catch: java.lang.Throwable -> Ld
            r0 = 1
            if (r1 == 0) goto Lb
        La:
            r0 = 0
        Lb:
            monitor-exit(r2)
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.MailboxFutureImpl.isCancelled():boolean");
    }

    @Override // com.facebook.msys.mca.MailboxObservableImpl
    public final synchronized boolean isDisabled() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
    
        if (isCancelled() != false) goto L7;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isDone() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mSetResult     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lc
            boolean r1 = r2.isCancelled()     // Catch: java.lang.Throwable -> Lf
            r0 = 0
            if (r1 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.msys.mca.MailboxFutureImpl.isDone():boolean");
    }

    public synchronized MailboxFutureImpl setNotification(String str, NotificationScope notificationScope) {
        if (this.mNotificationName == null && this.mNotificationScope == null) {
            str.getClass();
            this.mNotificationName = str;
            this.mNotificationScope = notificationScope;
            if (this.A00) {
                cancelNotificationCallback();
            }
        } else {
            throw new IllegalStateException("Cannot set multiple notifications");
        }
        return this;
    }

    public MailboxFutureImpl(InterfaceExecutorC135866Co interfaceExecutorC135866Co) {
        super(new AnonymousClass665(interfaceExecutorC135866Co));
        this.A01 = new AnonymousClass665(interfaceExecutorC135866Co);
        this.mCompletionCV = new ConditionVariable();
        this.mMailboxApiHandleProvider = interfaceExecutorC135866Co;
    }

    public void getResultBlocking(long j, TimeUnit timeUnit) {
        if (UI_THREAD.equals(Thread.currentThread())) {
            C0K8.A0E("MailboxFutureImpl", "Do not block on Mailbox API calls from the UI thread because it will result in hangs in the UI.");
        }
        if (Execution.getExecutionContext() != 0) {
            throw new IllegalStateException("The task cannot run on any MSYS thread");
        }
        this.mCompletionCV.block(TimeUnit.MILLISECONDS.convert(j, timeUnit));
    }

    public void cancelNotificationCallback(boolean z) {
        cancelNotificationCallback();
        this.mCompletionCV.open();
    }

    private synchronized void cancelNotificationCallback() {
        NotificationScope notificationScope;
        String str = this.mNotificationName;
        if (str != null && (notificationScope = this.mNotificationScope) != null) {
            this.mMailboxApiHandleProvider.AGa(notificationScope, str);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return get(0L, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            throw new IllegalStateException(e);
        }
    }
}

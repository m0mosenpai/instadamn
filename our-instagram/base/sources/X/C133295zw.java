package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133295zw implements ListenableFuture, AnonymousClass663 {
    public final AnonymousClass663 A00;

    @Override // X.AnonymousClass663
    public final AnonymousClass663 A84(MailboxCallback mailboxCallback, Executor executor) {
        return this.A00.A84(mailboxCallback, executor);
    }

    @Override // X.AnonymousClass663
    public final AnonymousClass663 Ecq(MailboxCallback mailboxCallback) {
        throw C00O.createAndThrow();
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(final Runnable runnable, Executor executor) {
        C14360o3.A0B(runnable, 0);
        C14360o3.A0B(executor, 1);
        AnonymousClass663 anonymousClass663 = this.A00;
        synchronized (anonymousClass663) {
            anonymousClass663.addResultCallback(executor, new MailboxCallback() { // from class: X.601
                @Override // com.facebook.msys.mca.MailboxCallback
                public final void onCompletion(Object obj) {
                    runnable.run();
                }
            });
            anonymousClass663.A84(new MailboxCallback() { // from class: X.602
                @Override // com.facebook.msys.mca.MailboxCallback
                public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                    runnable.run();
                }
            }, executor);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.A00.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.A00.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.A00.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A00.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A00.isDone();
    }

    @Override // com.facebook.msys.mca.MailboxObservable
    public final /* bridge */ /* synthetic */ MailboxObservable addResultCallback(MailboxCallback mailboxCallback) {
        return this.A00.addResultCallback(mailboxCallback);
    }

    public C133295zw(AnonymousClass663 anonymousClass663) {
        this.A00 = anonymousClass663;
    }

    @Override // com.facebook.msys.mca.MailboxObservable
    public final /* bridge */ /* synthetic */ MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback) {
        return this.A00.addResultCallback(executor, mailboxCallback);
    }
}

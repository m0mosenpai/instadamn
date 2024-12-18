package com.facebook.msys.mca;

import X.AnonymousClass665;
import X.C1350469d;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class MailboxObservableImpl implements MailboxObservable {
    public Object mResult;
    public boolean mSetResult;
    public final AnonymousClass665 resultCallbacks;

    @Override // com.facebook.msys.mca.MailboxObservable
    public synchronized MailboxObservable addResultCallback(MailboxCallback mailboxCallback) {
        if (!isDisabled() && mailboxCallback != null) {
            AnonymousClass665 anonymousClass665 = this.resultCallbacks;
            boolean z = this.mSetResult;
            anonymousClass665.A01(mailboxCallback, new C1350469d(this), this.mResult, null, z);
        }
        return this;
    }

    public abstract boolean isDisabled();

    public synchronized MailboxObservable setResult(Object obj) {
        if (!this.mSetResult) {
            this.mResult = obj;
            this.mSetResult = true;
            MailboxFutureImpl mailboxFutureImpl = (MailboxFutureImpl) this;
            mailboxFutureImpl.A01.A00();
            mailboxFutureImpl.mCompletionCV.open();
            this.resultCallbacks.A02(new C1350469d(this), this.mResult);
        } else {
            throw new IllegalStateException("Cannot set multiple results");
        }
        return this;
    }

    public MailboxObservableImpl(AnonymousClass665 anonymousClass665) {
        this.resultCallbacks = anonymousClass665;
    }

    @Override // com.facebook.msys.mca.MailboxObservable
    public synchronized MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback) {
        if (!isDisabled()) {
            AnonymousClass665 anonymousClass665 = this.resultCallbacks;
            mailboxCallback.getClass();
            executor.getClass();
            boolean z = this.mSetResult;
            anonymousClass665.A01(mailboxCallback, new C1350469d(this), this.mResult, executor, z);
        }
        return this;
    }
}

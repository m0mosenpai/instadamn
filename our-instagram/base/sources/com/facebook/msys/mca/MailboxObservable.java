package com.facebook.msys.mca;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public interface MailboxObservable {
    MailboxObservable addResultCallback(MailboxCallback mailboxCallback);

    MailboxObservable addResultCallback(Executor executor, MailboxCallback mailboxCallback);
}

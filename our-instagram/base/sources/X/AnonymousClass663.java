package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxObservable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: X.663, reason: invalid class name */
/* loaded from: classes3.dex */
public interface AnonymousClass663 extends Future, MailboxObservable {
    AnonymousClass663 A84(MailboxCallback mailboxCallback, Executor executor);

    @Deprecated
    AnonymousClass663 Ecq(MailboxCallback mailboxCallback);
}

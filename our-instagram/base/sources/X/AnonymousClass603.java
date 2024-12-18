package X;

import com.facebook.msys.mca.MailboxFutureImpl;

/* renamed from: X.603, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class AnonymousClass603 implements InterfaceC1350569e {
    public final /* synthetic */ MailboxFutureImpl A00;

    public /* synthetic */ AnonymousClass603(MailboxFutureImpl mailboxFutureImpl) {
        this.A00 = mailboxFutureImpl;
    }

    @Override // X.InterfaceC1350569e
    public final boolean Eq0() {
        MailboxFutureImpl mailboxFutureImpl = this.A00;
        Thread thread = MailboxFutureImpl.UI_THREAD;
        return mailboxFutureImpl.mSetResult;
    }
}

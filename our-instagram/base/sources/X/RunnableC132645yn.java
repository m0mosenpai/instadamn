package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.5yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC132645yn implements Runnable {
    public final /* synthetic */ MailboxCallback A00;
    public final /* synthetic */ InterfaceC1350569e A01;
    public final /* synthetic */ Object A02;

    public /* synthetic */ RunnableC132645yn(MailboxCallback mailboxCallback, InterfaceC1350569e interfaceC1350569e, Object obj) {
        this.A01 = interfaceC1350569e;
        this.A00 = mailboxCallback;
        this.A02 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1350569e interfaceC1350569e = this.A01;
        MailboxCallback mailboxCallback = this.A00;
        Object obj = this.A02;
        if (!interfaceC1350569e.Eq0()) {
            mailboxCallback.onCompletion(obj);
        }
    }
}

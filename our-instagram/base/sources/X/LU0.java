package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.tam.mca.MailboxTamJNI;

/* loaded from: classes8.dex */
public final class LU0 implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ K3a A01;

    public LU0(MailboxFutureImpl mailboxFutureImpl, K3a k3a) {
        this.A01 = k3a;
        this.A00 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A00.setResult(MailboxTamJNI.dispatchOO(9, obj));
    }
}

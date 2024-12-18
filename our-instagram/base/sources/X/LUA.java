package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.tam.mca.MailboxTamJNI;

/* loaded from: classes8.dex */
public final class LUA implements MailboxCallback {
    public final /* synthetic */ MailboxFutureImpl A00;
    public final /* synthetic */ K3a A01;
    public final /* synthetic */ byte[] A02;

    public LUA(MailboxFutureImpl mailboxFutureImpl, K3a k3a, byte[] bArr) {
        this.A01 = k3a;
        this.A02 = bArr;
        this.A00 = mailboxFutureImpl;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        this.A00.setResult(MailboxTamJNI.dispatchOOO(7, obj, this.A02));
    }
}

package X;

import com.instagram.model.direct.messageid.MessageIdentifier;

/* loaded from: classes8.dex */
public final class M4C implements Runnable {
    public final /* synthetic */ C49083Ln9 A00;
    public final /* synthetic */ MessageIdentifier A01;

    public M4C(C49083Ln9 c49083Ln9, MessageIdentifier messageIdentifier) {
        this.A00 = c49083Ln9;
        this.A01 = messageIdentifier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C49083Ln9.A00(this.A00, this.A01);
    }
}

package X;

import com.facebook.msys.mci.AccountSession;

/* renamed from: X.6Br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135656Br implements InterfaceC135846Cm {
    public final AccountSession A01;
    public final InterfaceExecutorC135866Co A02 = new C135666Bs(this);
    public final int A00 = 1;

    @Override // X.InterfaceC135846Cm
    public final InterfaceExecutorC135866Co ASj(int i) {
        if (i == 2) {
            return this.A02;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("MailboxApiHandleProviderType with type ", " is not supported by AccountSessionMailboxApiHandleMetaProvider.", i));
    }

    public C135656Br(AccountSession accountSession) {
        this.A01 = accountSession;
    }

    public C135656Br(AccountSession accountSession, int i) {
        this.A01 = accountSession;
    }
}

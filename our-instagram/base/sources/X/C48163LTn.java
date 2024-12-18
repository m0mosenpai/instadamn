package X;

import com.facebook.msys.mci.AccountSession;

/* renamed from: X.LTn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48163LTn implements InterfaceC135846Cm {
    public final AccountSession A00;
    public final C6Ee A01;
    public final boolean A02;

    @Override // X.InterfaceC135846Cm
    public final InterfaceExecutorC135866Co ASj(int i) {
        if (this.A02) {
            C6Ee c6Ee = this.A01;
            InterfaceExecutorC135866Co ASj = new C135656Br(this.A00).ASj(i);
            C14360o3.A07(ASj);
            return new C48164LTo(ASj, c6Ee);
        }
        InterfaceExecutorC135866Co ASj2 = new C135656Br(this.A00).ASj(i);
        C14360o3.A0A(ASj2);
        return ASj2;
    }

    public C48163LTn(AccountSession accountSession, C6Ee c6Ee, boolean z) {
        this.A01 = c6Ee;
        this.A00 = accountSession;
        this.A02 = z;
    }
}

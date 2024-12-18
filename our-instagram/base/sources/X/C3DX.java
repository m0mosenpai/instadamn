package X;

/* renamed from: X.3DX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DX extends C19Q {
    public final /* synthetic */ C24171Gm A00;

    @Override // X.C19Q, X.C19O
    public final void onRequestCallbackDone(C1QW c1qw, C1QY c1qy) {
        C14360o3.A0B(c1qy, 1);
        C24171Gm c24171Gm = this.A00;
        synchronized (c24171Gm.A02) {
            C23351Bx c23351Bx = c24171Gm.A01;
            synchronized (c23351Bx) {
                if (c1qy.A09 == c23351Bx.A02) {
                    if (C1RN.A00(c1qy)) {
                        c23351Bx.A01--;
                    } else {
                        c23351Bx.A00--;
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            C24171Gm.A00(c24171Gm);
        }
    }

    public C3DX(C24171Gm c24171Gm) {
        this.A00 = c24171Gm;
    }
}

package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PUc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57089PUc implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    public C57089PUc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        switch (this.A00) {
            case 0:
                return new C55197Oe4((UserSession) this.A01);
            case 1:
                return new C55122Obj((UserSession) this.A01);
            case 2:
                return AbstractC12220kQ.A02((AbstractC12990ll) this.A01);
            default:
                return new MWN((UserSession) this.A01);
        }
    }
}

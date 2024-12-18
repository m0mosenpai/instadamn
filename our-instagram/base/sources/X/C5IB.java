package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5IB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IB extends C32J {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5IB(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31F c31f, C1PY c1py, C1PK c1pk, boolean z, boolean z2, boolean z3) {
        super(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk);
        C14360o3.A0B(c31f, 3);
        C14360o3.A0B(c1pk, 6);
        this.A00 = userSession;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        return AbstractC001800i.A0U(AbstractC001800i.A0X(AbstractC16960so.A1N(((C130455uq) c206259Bi.A02).A00())));
    }

    @Override // X.C32J
    public final boolean A0C() {
        return this.A02;
    }

    @Override // X.C32J
    public final boolean A0D() {
        return this.A03;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0F(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        C38321qM A00 = ((C130455uq) c206259Bi.A02).A00();
        if (A00 != null) {
            return C3YS.A00(this.A00).A05(A00);
        }
        return false;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0G(Object obj, boolean z, boolean z2) {
        if (this.A01 && z) {
            return true;
        }
        return false;
    }
}

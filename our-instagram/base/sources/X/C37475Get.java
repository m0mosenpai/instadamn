package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Get, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37475Get extends C32J {
    public final C3YT A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    @Override // X.C32J
    public final boolean A0C() {
        return this.A01;
    }

    @Override // X.C32J
    public final boolean A0D() {
        return this.A02;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0G(Object obj, boolean z, boolean z2) {
        if (this.A03 && z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37475Get(UserSession userSession, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31F c31f, C1PY c1py, C1PK c1pk, boolean z, boolean z2, boolean z3) {
        super(userSession, interfaceC62242sP, interfaceC671231d, c31f, c1py, c1pk);
        C3YT A00 = C3YS.A00(userSession);
        C14360o3.A0B(A00, 7);
        this.A00 = A00;
        this.A03 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ Iterable A05(Object obj) {
        return AbstractC16960so.A1N(AbstractC37301Gc2.A0J(obj).A0K);
    }

    @Override // X.C32J
    public final /* bridge */ /* synthetic */ boolean A0F(Object obj) {
        return this.A00.A05(AbstractC37301Gc2.A0J(obj).A0K);
    }
}

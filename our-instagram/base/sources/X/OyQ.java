package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OyQ implements InterfaceC143326dX, C8D4, C8PO {
    public C57012jc A00;
    public C8D9 A01;
    public ViewOnTouchListenerC1829889t A02;
    public final View A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public OyQ(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A04 = abstractC59962oe;
        this.A05 = userSession;
        this.A03 = view;
        C57550PgO A01 = C57550PgO.A01(this, 40);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(abstractC59962oe, 36), EnumC09460dv.A02, 37);
        this.A09 = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 38), A01, C57530Pg4.A00(null, A00, 35), AbstractC25225BEi.A1D(C50917Mem.class));
        this.A06 = C1XM.A00(C57550PgO.A01(this, 34));
        this.A08 = C1XM.A00(C57550PgO.A01(this, 39));
        this.A07 = AbstractC09440dt.A01(C57550PgO.A01(this, 35));
    }

    @Override // X.InterfaceC143326dX
    public final boolean CPd() {
        return false;
    }

    @Override // X.C8PO
    public final void Cj7(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
    }

    @Override // X.C8PO
    public final void Cll() {
    }

    @Override // X.InterfaceC143326dX
    public final void D5W(C8BD c8bd) {
    }

    @Override // X.C8D4
    public final void D5y(C8DD c8dd, int i, int i2) {
    }

    @Override // X.C8D4
    public final void D5z(int i, float f, float f2) {
    }

    @Override // X.C8D4
    public final void DJe(boolean z, int i) {
    }

    @Override // X.InterfaceC143326dX
    public final void DWb(C8BD c8bd) {
    }

    @Override // X.InterfaceC143326dX
    public final /* synthetic */ C8BD AYo() {
        return null;
    }

    @Override // X.InterfaceC143326dX
    public final /* synthetic */ boolean CKf() {
        return false;
    }
}

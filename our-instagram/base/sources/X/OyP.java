package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* loaded from: classes9.dex */
public final class OyP implements InterfaceC143326dX, C8D4, InterfaceC60152ox {
    public C57012jc A00;
    public C8D9 A01;
    public ViewOnTouchListenerC1829889t A02;
    public InteractiveDrawableContainer A03;
    public final View A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;
    public final C3I9 A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;

    public OyP(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A05 = abstractC59962oe;
        this.A06 = userSession;
        this.A04 = view;
        C57556PgU c57556PgU = new C57556PgU(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57556PgU(new C57556PgU(abstractC59962oe, 6), 7));
        this.A0F = AbstractC25225BEi.A0a(new C57556PgU(A00, 8), c57556PgU, C57530Pg4.A00(null, A00, 40), AbstractC25225BEi.A1D(C50941MfA.class));
        this.A0A = C57556PgU.A01(this, 4);
        this.A08 = C57556PgU.A01(this, 2);
        this.A09 = C57556PgU.A01(this, 3);
        this.A07 = C3I7.A01(this, false, false);
        this.A0E = AbstractC09440dt.A01(new C57556PgU(this, 13));
        this.A0C = AbstractC09440dt.A01(B8M.A00);
        this.A0B = AbstractC09440dt.A01(new C57556PgU(this, 5));
        this.A0D = AbstractC09440dt.A01(new C57556PgU(this, 12));
    }

    @Override // X.InterfaceC143326dX
    public final boolean CPd() {
        return false;
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

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
    }

    @Override // X.InterfaceC143326dX
    public final /* synthetic */ C8BD AYo() {
        return null;
    }

    @Override // X.InterfaceC143326dX
    public final /* synthetic */ boolean CKf() {
        return false;
    }

    @Override // X.InterfaceC143326dX
    public final void D5W(C8BD c8bd) {
        C50941MfA c50941MfA = (C50941MfA) this.A0F.getValue();
        C23851Ah3 c23851Ah3 = (C23851Ah3) this.A0D.getValue();
        boolean z = false;
        if (c23851Ah3 != null) {
            z = AbstractC23126AKl.A03(c23851Ah3.A0R.getAllDrawables(), false, false);
        }
        OLC olc = c50941MfA.A00;
        olc.A0Q.Egh(false);
        AbstractC166997dE.A1Y(olc.A08, z);
        c50941MfA.A04.Egh(false);
    }

    @Override // X.InterfaceC143326dX
    public final void DWb(C8BD c8bd) {
        AbstractC166997dE.A1Y(((C50941MfA) this.A0F.getValue()).A00.A0Q, true);
    }
}

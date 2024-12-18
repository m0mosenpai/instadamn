package X;

import android.graphics.Bitmap;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.Oy3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56256Oy3 implements C8D4, InterfaceC185958Mp {
    public Bitmap A00;
    public C57012jc A01;
    public InteractiveDrawableContainer A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    public C56256Oy3(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        C57550PgO A01 = C57550PgO.A01(this, 47);
        InterfaceC09390do A00 = C57550PgO.A00(C57550PgO.A01(abstractC59962oe, 44), EnumC09460dv.A02, 45);
        this.A0A = AbstractC25225BEi.A0a(C57550PgO.A01(A00, 46), A01, C57530Pg4.A00(null, A00, 38), AbstractC25225BEi.A1D(C50908Med.class));
        this.A08 = C1XM.A00(C57550PgO.A01(view, 42));
        this.A09 = C1XM.A00(C57550PgO.A01(view, 43));
        this.A06 = C1XM.A00(C57550PgO.A01(view, 41));
        this.A07 = AbstractC09440dt.A01(C57530Pg4.A00(view, this, 37));
        this.A05 = AbstractC09440dt.A01(C57530Pg4.A00(view, this, 36));
    }

    @Override // X.C8D4
    public final void D5z(int i, float f, float f2) {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFI() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFL() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFN(int i) {
    }

    @Override // X.C8D4
    public final void DJe(boolean z, int i) {
    }

    @Override // X.C8D4
    public final void D5y(C8DD c8dd, int i, int i2) {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0A);
        C57157PZb.A01(c8dd, A0Z, AbstractC141776au.A00(A0Z), 2);
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A0A);
        PZD.A02(A0Z, AbstractC141776au.A00(A0Z), 31);
    }
}

package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.NdB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53039NdB extends AbstractC52113N4l {
    public static final String __redex_internal_original_name = "WallUserMediaPickerFragment";
    public final InterfaceC43406JFw A00;
    public final InterfaceC09390do A01;
    public final V5X[] A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C66095TzW c66095TzW = super.A00;
        if (c66095TzW != null) {
            c66095TzW.A07 = this.A02;
            C65823Tug A01 = A01();
            A01.A05(view, false);
            C153156uj c153156uj = A01.A05;
            if (c153156uj != null) {
                c153156uj.A05 = true;
            }
            A01.A06(new P2N(this, 9));
            A04(true);
            C57157PZb.A01(this.A01.getValue(), this, AbstractC25229BEm.A0a(this), 31);
            return;
        }
        C14360o3.A0F("gridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C53039NdB() {
        C29892DGg c29892DGg = new C29892DGg(this, 5);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29892DGg(new C29892DGg(this, 6), 7));
        this.A01 = AbstractC25225BEi.A0a(new C29892DGg(A00, 8), c29892DGg, new C29895DGj(32, null, A00), AbstractC25225BEi.A1D(C53042NdE.class));
        this.A02 = new V5X[]{new C38124Gpr(EnumC38183Gqo.A0B)};
        this.A00 = P2I.A00;
    }
}

package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.NPd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52608NPd extends N73 {
    public static final String __redex_internal_original_name = "MediaKitMediaPickerFragment";
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
            A01.A06(new P2N(this, 1));
            A04(true);
            PZM.A01(this, this.A01.getValue(), AbstractC25229BEm.A0a(this), 25);
            return;
        }
        C14360o3.A0F("gridAdapter");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C52608NPd() {
        C57546PgK c57546PgK = new C57546PgK(this, 33);
        InterfaceC09390do A00 = C57546PgK.A00(new C57546PgK(this, 34), EnumC09460dv.A02, 35);
        this.A01 = AbstractC25225BEi.A0a(new C57546PgK(A00, 36), c57546PgK, C57535Pg9.A00(null, A00, 34), AbstractC25225BEi.A1D(C52619NPo.class));
        this.A02 = new V5X[]{new C38124Gpr(EnumC38183Gqo.A0B)};
        this.A00 = P2H.A00;
    }
}

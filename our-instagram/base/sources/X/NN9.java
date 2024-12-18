package X;

import android.os.Bundle;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* loaded from: classes9.dex */
public final class NN9 extends AbstractC52139N5o implements InterfaceC60442pS, InterfaceC58119Ppi {
    public static final String __redex_internal_original_name = "IGTVUploadEditProfileCropFragment";
    public C56062Ouf A00;
    public final InterfaceC09390do A01 = C57538PgC.A00(this, C57538PgC.A01(this, 31), new C57251PbZ(25, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class), 32);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(getString(2131964189));
        AbstractC31176DnK.A1B(ViewOnClickListenerC55455Ok9.A00(this, 19), OPJ.A00(this, interfaceC56362iU), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "igtv_edit_profile_crop_fragment";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.InterfaceC58119Ppi
    public final boolean BCs() {
        return this.A03;
    }

    @Override // X.InterfaceC58119Ppi
    public final void Cyw() {
        OPI.A01(this, this.A01);
    }

    @Override // X.InterfaceC58119Ppi
    public final void DAV() {
        MSW.A0b(this.A01).A04(this, NN6.A00);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C56062Ouf c56062Ouf = this.A00;
        if (c56062Ouf == null) {
            C14360o3.A0F("backHandlerDelegate");
            throw C00O.createAndThrow();
        }
        return c56062Ouf.onBackPressed();
    }

    @Override // X.AbstractC52139N5o, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2053818176);
        super.onCreate(bundle);
        this.A00 = new C56062Ouf(requireContext(), this);
        C0f9.A09(-1462994465, A02);
    }
}

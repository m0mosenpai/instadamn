package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.appreciation.analytics.LoggingData;

/* loaded from: classes8.dex */
public final class KYg extends N6G {
    public static final String __redex_internal_original_name = "AppreciationCreatorSettingsFragment";
    public Dialog A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C50157MDk(this, 49));
    public final InterfaceC09390do A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131956687);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.N6G, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, this, null, 8), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.N6G
    public final UserMonetizationProductType A05() {
        return UserMonetizationProductType.A0A;
    }

    @Override // X.N6G
    public final AbstractC53500NlR A07() {
        return new NQ5("com.instagram.content_appreciation.navigation_handler");
    }

    @Override // X.N6G
    public final void A0A() {
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCQ(viewLifecycleOwner, c07s, this, null, 7), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.N6G
    public final void A0B() {
        C44550Jmu c44550Jmu = (C44550Jmu) this.A02.getValue();
        if (AbstractC166987dD.A1a(c44550Jmu.A0A.getValue())) {
            c44550Jmu.A05(true);
        } else {
            MCD.A02(c44550Jmu, AbstractC141776au.A00(c44550Jmu), 27);
        }
    }

    @Override // X.N6G
    public final void A0D(String str) {
        if (str != null) {
            Bundle requireArguments = requireArguments();
            String str2 = LAu.A01(this).A00;
            C14360o3.A0B(str2, 1);
            requireArguments.putParcelable("appreciation_logging_data", new LoggingData(str, str2));
        }
    }

    @Override // X.N6G
    public final void A0E(boolean z) {
        AbstractC166997dE.A1Y(((C44550Jmu) this.A02.getValue()).A0C, z);
    }

    public KYg() {
        C50250MHf A01 = C50250MHf.A01(this, 3);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50250MHf.A01(C50250MHf.A01(this, 0), 1));
        this.A02 = AbstractC25225BEi.A0a(C50250MHf.A01(A00, 2), A01, new C29897DGl(31, null, A00), AbstractC25225BEi.A1D(C44550Jmu.class));
    }

    @Override // X.N6G
    public final String A08() {
        return LAu.A01(this).A01;
    }

    @Override // X.N6G
    public final boolean A0F() {
        if (!requireArguments().getBoolean("arg_start_onboarding", false)) {
            C44550Jmu c44550Jmu = (C44550Jmu) this.A02.getValue();
            if (c44550Jmu.A02.A03(c44550Jmu.A03, C05F.A0C, true)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.N6G, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1766948337);
        super.onCreate(bundle);
        if (!A0F()) {
            A0E(false);
            C44550Jmu c44550Jmu = (C44550Jmu) this.A02.getValue();
            if (AbstractC166987dD.A1a(c44550Jmu.A0A.getValue())) {
                c44550Jmu.A05(true);
            } else {
                MCD.A02(c44550Jmu, AbstractC141776au.A00(c44550Jmu), 27);
            }
        }
        C0f9.A09(553755506, A02);
    }
}

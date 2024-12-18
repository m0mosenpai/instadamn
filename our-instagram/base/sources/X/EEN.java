package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment;

/* loaded from: classes6.dex */
public final class EEN extends AvatarConvergenceUpsellBottomSheetFragment {
    public static final String __redex_internal_original_name = "AvatarConvergenceIdentitySheetUpsellFragment";
    public C34393FEj A00;
    public String A01;
    public final InterfaceC09390do A02 = C1XM.A00(C37048GUe.A00(this, 39));

    @Override // com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C148236lt c148236lt = (C148236lt) this.A0B.getValue();
        String A01 = A01();
        InterfaceC19610xo ARD = c148236lt.A00.A00.A00.ARD();
        ARD.E77(AbstractC111324zv.A00(4800), true);
        ARD.apply();
        c148236lt.A01();
        c148236lt.A00();
        c148236lt.A02.A01(C05F.A00, A01, "mux_identity_sheet", true);
    }

    @Override // com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment
    public final void A02() {
        super.A02();
        C148236lt c148236lt = (C148236lt) this.A0B.getValue();
        String A01 = A01();
        Integer num = C05F.A00;
        c148236lt.A02.A00(num, num, A01, "mux_identity_sheet", true);
        AbstractC25233BEq.A14(this);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "avatar_convergence_private_access_upsell";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-589314459);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_editor_logging_surface");
        if (string != null) {
            this.A01 = string;
            C0f9.A09(2014579186, A02);
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("editor logging surface required");
            C0f9.A09(327674695, A02);
            throw A14;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1679809318);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
        C0f9.A09(287268929, A02);
    }
}

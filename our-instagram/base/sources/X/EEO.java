package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment;

/* loaded from: classes6.dex */
public final class EEO extends AvatarConvergenceUpsellBottomSheetFragment implements JPX {
    public static final String __redex_internal_original_name = "AvatarConvergenceMimicryUpsellFragment";
    public C189478aR A00;
    public String A01;
    public String A02;
    public final InterfaceC09390do A07 = C1XM.A00(C37048GUe.A00(this, 44));
    public final InterfaceC09390do A06 = C1XM.A00(C37048GUe.A00(this, 43));
    public final InterfaceC09390do A03 = C1XM.A00(C37048GUe.A00(this, 40));
    public final InterfaceC09390do A05 = C1XM.A00(C37048GUe.A00(this, 42));
    public final InterfaceC09390do A04 = C1XM.A00(C37048GUe.A00(this, 41));

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A0B;
        boolean A1b = AbstractC31180DnO.A1b(interfaceC09390do);
        C148236lt c148236lt = (C148236lt) interfaceC09390do.getValue();
        if (A1b) {
            AbstractC167007dF.A17(c148236lt.A00.A00.A00.ARD(), AbstractC111324zv.A00(4797));
            c148236lt.A01();
        } else if (c148236lt.A06()) {
            C148236lt c148236lt2 = (C148236lt) interfaceC09390do.getValue();
            AbstractC167007dF.A17(c148236lt2.A00.A00.A00.ARD(), AbstractC111324zv.A00(4799));
            c148236lt2.A01();
            c148236lt2.A00();
        }
        C148236lt c148236lt3 = (C148236lt) interfaceC09390do.getValue();
        if (AbstractC31180DnO.A1b(interfaceC09390do)) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        c148236lt3.A02.A01(num, "ig_stories_consumption", "mux_mimicry_bottom_sheet", AbstractC31180DnO.A1a(interfaceC09390do));
    }

    @Override // com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment
    public final void A02() {
        super.A02();
        InterfaceC09390do interfaceC09390do = this.A0B;
        if (!AbstractC31180DnO.A1b(interfaceC09390do)) {
            C148236lt c148236lt = (C148236lt) interfaceC09390do.getValue();
            Integer num = C05F.A00;
            c148236lt.A02.A00(num, num, "ig_stories_consumption", "mux_mimicry_bottom_sheet", AbstractC31180DnO.A1a(interfaceC09390do));
        }
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A01;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "avatar_convergence_mimicry_upsell_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(1886667303);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("args_editor_logging_surface");
        if (string != null) {
            this.A02 = string;
            String string2 = requireArguments.getString("args_editor_logging_mechanism");
            if (string2 != null) {
                this.A01 = string2;
                C0f9.A09(2036231824, A02);
                return;
            } else {
                A14 = AbstractC166987dD.A14("editor logging mechanism required");
                i = 246557641;
            }
        } else {
            A14 = AbstractC166987dD.A14("editor logging surface required");
            i = 1969520560;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // com.instagram.avatars.convergence2.AvatarConvergenceUpsellBottomSheetFragment, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(749991831);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(-1101891320, A02);
    }
}

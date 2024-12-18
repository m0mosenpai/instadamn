package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;

/* loaded from: classes9.dex */
public final class N61 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorRevshareAccountLevelMonetizationToggleFragment";
    public C51043Mgu A00;
    public final InterfaceC09390do A03 = C57509Pfj.A00(this, 15);
    public final InterfaceC09390do A02 = C57509Pfj.A00(this, 14);
    public final InterfaceC09390do A01 = C57509Pfj.A00(this, 13);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (AbstractC50523MSb.A04(this.A03) == 2) {
            i = 2131963762;
        } else {
            i = 2131963805;
            if (AbstractC167007dF.A1Z(this.A01)) {
                i = 2131963855;
            }
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "creator_revshare_account_level_monetization_toggle";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N61.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(N61 n61, String str, String str2) {
        C56136Ovw c56136Ovw = (C56136Ovw) n61.A02.getValue();
        C51043Mgu c51043Mgu = n61.A00;
        if (c51043Mgu != null) {
            String A01 = AbstractC35078Fcp.A01(c51043Mgu.A04());
            C51043Mgu c51043Mgu2 = n61.A00;
            if (c51043Mgu2 != null) {
                String A02 = AbstractC35078Fcp.A02(c51043Mgu2.A04());
                C51043Mgu c51043Mgu3 = n61.A00;
                if (c51043Mgu3 != null) {
                    c56136Ovw.A01(A01, A02, str, "igtv_ads_account_toggle", "creator_revshare_account_level_monetization_toggle", c51043Mgu3.A05(), str2);
                    return;
                }
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C51043Mgu c51043Mgu = this.A00;
        if (c51043Mgu != null) {
            OnboardingRepository onboardingRepository = c51043Mgu.A05;
            C51746MtV c51746MtV = (C51746MtV) onboardingRepository.A00.get(c51043Mgu.A04());
            if (c51746MtV != null && c51746MtV.A00 != 0) {
                C51043Mgu c51043Mgu2 = this.A00;
                if (c51043Mgu2 != null) {
                    c51043Mgu2.A06();
                    AbstractC25226BEj.A1P(this);
                    return true;
                }
            } else {
                C51043Mgu c51043Mgu3 = this.A00;
                if (c51043Mgu3 != null) {
                    F9C.A00(this, c51043Mgu3);
                    return true;
                }
            }
        }
        C14360o3.A0F("productOnboardingViewModel");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-243993200);
        super.onCreate(bundle);
        this.A00 = C52332NDw.A00(requireActivity(), this.A04);
        C0f9.A09(1802606165, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1029895705);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.igtv_account_level_monetization_toggle, viewGroup, false);
        A00(this, "impression", null);
        C0f9.A09(286490844, A02);
        return inflate;
    }
}

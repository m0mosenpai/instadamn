package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HBe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38907HBe extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ReelFundraiserAmountRaisedDisclaimerBottomsheetFragment";
    public AbstractC18680vv A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_fundraiser_amount_raised_disclaimer_bottomsheet_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2032076819);
        super.onCreate(bundle);
        this.A00 = AbstractC166987dD.A0n(AbstractC60492pY.A02(this));
        C0f9.A09(13174517, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1949458806);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.reel_dashboard_fundraiser_results_amount_raised_disclaimer, viewGroup, false);
        C0f9.A09(1089689941, A02);
        return inflate;
    }
}

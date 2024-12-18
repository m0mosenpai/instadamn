package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EIj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32250EIj extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectOutcomeUpsellFragment";
    public boolean A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "outcome_upsell_sheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.headline);
        int i = 2131960693;
        if (this.A00) {
            i = 2131960694;
        }
        A0N.setText(i);
        A00(AbstractC166997dE.A0S(view, R.id.first_row), 2131960690, 2131960687, R.drawable.instagram_ads_pano_outline_24);
        A00(AbstractC166997dE.A0S(view, R.id.second_row), 2131960691, 2131960688, R.drawable.instagram_promote_pano_outline_24);
        A00(AbstractC166997dE.A0S(view, R.id.third_row), 2131960692, 2131960689, R.drawable.instagram_shield_star_pano_outline_24);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    public static final void A00(View view, int i, int i2, int i3) {
        AbstractC31173DnH.A0I(view, R.id.icon).setImageResource(i3);
        AbstractC31180DnO.A06(view).setText(i);
        AbstractC166997dE.A0T(view, R.id.content).setText(i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-115433912);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = false;
        if (bundle2 != null) {
            z = bundle2.getBoolean("open_from_first_banner", false);
        }
        this.A00 = z;
        C0f9.A09(-1633605583, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-897951967);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.outcome_upsell_sheet_container, viewGroup, false);
        C0f9.A09(-1651135932, A02);
        return inflate;
    }
}

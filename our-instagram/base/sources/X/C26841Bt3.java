package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Bt3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26841Bt3 extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "WearableAttributionSheetFragment";
    public String A00;
    public UserSession A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0e = AbstractC166987dD.A0e(view, R.id.wearable_attribution_sheet_title);
        String str = this.A05;
        if (A0e != null && str != null) {
            A0e.setText(str);
        }
        TextView A0e2 = AbstractC166987dD.A0e(view, R.id.wearable_attribution_sheet_subtitle);
        String str2 = this.A04;
        if (A0e2 != null && str2 != null) {
            A0e2.setText(str2);
        }
        IgImageView igImageView = (IgImageView) view.findViewById(R.id.wearable_attribution_sheet_icon);
        String str3 = this.A03;
        if (igImageView != null && str3 != null) {
            AbstractC25235BEs.A1I(this, igImageView, str3);
        }
        TextView A0e3 = AbstractC166987dD.A0e(view, R.id.wearable_attribution_sheet_cta_button);
        String str4 = this.A02;
        if (A0e3 != null && str4 != null) {
            A0e3.setText(str4);
            C0fQ.A00(new ViewOnClickListenerC28604Cjt(this, 4), A0e3);
        }
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A0H;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1370404553);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC166987dD.A0r(AbstractC60492pY.A02(this));
        this.A05 = requireArguments.getString(AbstractC111324zv.A00(3934));
        this.A04 = requireArguments.getString(AbstractC111324zv.A00(3933));
        this.A03 = requireArguments.getString(AbstractC111324zv.A00(3932));
        this.A02 = requireArguments.getString(AbstractC111324zv.A00(3931));
        this.A00 = requireArguments.getString(AbstractC111324zv.A00(3930));
        C0f9.A09(2145928166, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1241515591);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.wearable_attribution_sheet, viewGroup, false);
        C0f9.A09(-524848857, A02);
        return inflate;
    }
}

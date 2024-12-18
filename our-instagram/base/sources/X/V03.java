package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class V03 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteMessagingAppsMultiDestinationBottomSheet";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_messaging_apps_multi_destination_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.ctx_multi_destination_bottom_sheet_layout);
        AbstractC166987dD.A1P(requireActivity(), AbstractC167007dF.A0N(A0S, R.id.ctx_multi_destination_bottom_sheet_title), 2131957317);
        A00(A0S, R.id.engage_row, 2131957319, 2131957318, R.drawable.instagram_direct_pano_outline_24);
        A00(A0S, R.id.maximize_performance_row, 2131957321, 2131957320, R.drawable.instagram_promote_pano_outline_24);
        A00(A0S, R.id.simplify_ad_setup_row, 2131957323, 2131957322, R.drawable.instagram_app_imessage_pano_outline_24);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A00.getValue();
    }

    public static final void A00(View view, int i, int i2, int i3, int i4) {
        View A0S = AbstractC166997dE.A0S(view, i);
        ((TextView) A0S.findViewById(R.id.primary_text)).setText(i2);
        ((TextView) A0S.findViewById(R.id.secondary_text)).setText(i3);
        ((ImageView) A0S.findViewById(R.id.row_icon)).setImageResource(i4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1566218730);
        super.onCreate(bundle);
        C0f9.A09(-112224291, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-864264729);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_messaging_apps_multi_destination_bottom_sheet_view, viewGroup, false);
        C0f9.A09(-1317047243, A02);
        return inflate;
    }
}

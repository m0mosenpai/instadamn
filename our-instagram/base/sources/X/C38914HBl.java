package X;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HBl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38914HBl extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SimilarAdvertiserBudgetDurationRecommendationBottomSheetFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(3328);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC167007dF.A0N(view, R.id.similar_business).setText(Html.fromHtml(AbstractC166997dE.A0N(this).getString(2131970438)));
        AbstractC167007dF.A0N(view, R.id.ad_spend).setText(Html.fromHtml(AbstractC166997dE.A0N(this).getString(2131970422)));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1524862390);
        super.onCreate(bundle);
        C0f9.A09(402768414, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-547489905);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.similar_advertiser_budget_duration_recommendation_bottom_sheet, viewGroup, false);
        C0f9.A09(-292741526, A02);
        return inflate;
    }
}

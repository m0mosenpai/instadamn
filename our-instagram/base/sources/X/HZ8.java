package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;

/* loaded from: classes7.dex */
public final class HZ8 extends AbstractC38938HCn {
    public static final String __redex_internal_original_name = "ThumbnailImageVariantSelectorFragment";
    public final C38361Gtx A00 = new C38361Gtx(this);
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "thumbnail_image_variant_selector";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(443494764);
        C14360o3.A0B(layoutInflater, 0);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            View inflate = layoutInflater.inflate(R.layout.thumbnail_image_variant_selector_drawer, viewGroup, false);
            int i = bundle2.getInt("arg_fixed_height");
            if (i > 0) {
                C14360o3.A0A(inflate);
                AbstractC13880nE.A0W(inflate, i);
            }
            RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(inflate, R.id.variant_selector_recycler_view);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            linearLayoutManager.A12(true);
            recyclerView.setLayoutManager(linearLayoutManager);
            AbstractC37304Gc5.A0z(recyclerView, AbstractC167017dG.A03(requireContext()), AbstractC167017dG.A05(requireContext()));
            VariantSelectorModel variantSelectorModel = (VariantSelectorModel) bundle2.getParcelable("variant_selector_model");
            if (variantSelectorModel != null) {
                C38361Gtx c38361Gtx = this.A00;
                boolean z = bundle2.getBoolean("arg_disable_sold_out");
                boolean[] zArr = variantSelectorModel.A0B;
                int length = zArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (!zArr[i2]) {
                        c38361Gtx.A03 = true;
                        break;
                    }
                    i2++;
                }
                c38361Gtx.A05 = variantSelectorModel.A09;
                c38361Gtx.A06 = variantSelectorModel.A0A;
                c38361Gtx.A07 = zArr;
                c38361Gtx.A00 = variantSelectorModel.A06;
                c38361Gtx.A01 = variantSelectorModel.A08;
                c38361Gtx.A04 = z;
                c38361Gtx.notifyDataSetChanged();
            }
            recyclerView.setAdapter(this.A00);
            Context context = inflate.getContext();
            int A0A = (AbstractC13880nE.A0A(context) / 2) - (context.getResources().getDimensionPixelSize(R.dimen.dynamic_ads_picker_padding_top) / 2);
            if (variantSelectorModel != null) {
                linearLayoutManager.A1p(variantSelectorModel.A06, A0A);
            }
            C0f9.A09(-373209328, A02);
            return inflate;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1982916599, A02);
        throw A0g;
    }
}

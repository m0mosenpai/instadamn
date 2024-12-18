package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import com.instagram.user.model.Product;
import java.util.Collections;

/* loaded from: classes7.dex */
public final class HC1 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "GenericThumbnailVariantSelectorFragment";
    public LinearLayout A00;
    public LinearLayout A01;
    public ProductGroup A02;
    public ProductVariantDimension A03;
    public C41205ILt A04;
    public IH0 A05;
    public RefreshSpinner A06;
    public RecyclerView A07;
    public boolean A08;
    public final C38361Gtx A09 = new C38361Gtx(this);
    public final IDB A0B = new IDB(this);
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "generic_thumbnail_image_variant_selector";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C41205ILt c41205ILt = this.A04;
        if (c41205ILt == null) {
            C14360o3.A0F("controller");
            throw C00O.createAndThrow();
        }
        c41205ILt.A00(AbstractC018607g.A00(this));
    }

    public static final void A00(HC1 hc1) {
        String str;
        LinearLayout linearLayout = hc1.A01;
        if (linearLayout == null) {
            str = "errorContainer";
        } else {
            linearLayout.setVisibility(0);
            RefreshSpinner refreshSpinner = hc1.A06;
            if (refreshSpinner == null) {
                str = "refreshSpinner";
            } else {
                refreshSpinner.setVisibility(8);
                LinearLayout linearLayout2 = hc1.A00;
                if (linearLayout2 == null) {
                    str = "contentContainer";
                } else {
                    linearLayout2.setVisibility(8);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final void A01(HC1 hc1, Product product) {
        if (hc1.A08) {
            AbstractC31176DnK.A0Q(hc1.A0A).E4s(new C42248InY(product));
            AbstractC25227BEk.A1B(hc1);
            return;
        }
        IH0 ih0 = hc1.A05;
        if (ih0 != null) {
            C43025J0q c43025J0q = ih0.A02;
            c43025J0q.A00 = product;
            ih0.A00.A0L(c43025J0q);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A0g;
        int i;
        int A02 = C0f9.A02(-978569719);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            ProductGroup productGroup = (ProductGroup) AbstractC153636vY.A00(bundle2, ProductGroup.class, "EXTRAS_PRODUCT_GROUP");
            this.A02 = productGroup;
            if (productGroup != null) {
                if (!AbstractC37301Gc2.A1b(productGroup.A02)) {
                    ProductGroup productGroup2 = this.A02;
                    if (productGroup2 != null) {
                        if (((ProductVariantDimension) Collections.unmodifiableList(productGroup2.A02).get(0)).A00 == ProductVariantVisualStyle.A05) {
                            ProductGroup productGroup3 = this.A02;
                            if (productGroup3 != null) {
                                this.A03 = (ProductVariantDimension) Collections.unmodifiableList(productGroup3.A02).get(0);
                                Context requireContext = requireContext();
                                UserSession A0r = AbstractC166987dD.A0r(this.A0A);
                                ProductGroup productGroup4 = this.A02;
                                if (productGroup4 != null) {
                                    this.A04 = new C41205ILt(requireContext, A0r, productGroup4, this.A0B);
                                    C0f9.A09(-2037501522, A02);
                                    return;
                                }
                            }
                        }
                    }
                }
                A0g = AbstractC166987dD.A14("No product variant dimension found with visual style as THUMBNAIL");
                i = -729658797;
            }
            C14360o3.A0F("productGroup");
            throw C00O.createAndThrow();
        }
        A0g = AbstractC166997dE.A0g();
        i = 1565541986;
        C0f9.A09(i, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-507315343);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.generic_thumbnail_image_variant_selector_drawer, viewGroup, false);
        this.A00 = (LinearLayout) inflate.findViewById(R.id.layout_content_container);
        this.A01 = (LinearLayout) inflate.findViewById(R.id.layout_error_container);
        this.A06 = (RefreshSpinner) inflate.findViewById(R.id.loading_spinner);
        ViewOnClickListenerC42033Ik2.A00(inflate.requireViewById(R.id.text_try_again), 68, this);
        this.A08 = requireArguments().getBoolean("extra_is_modal");
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            AbstractC166997dE.A0S(inflate, R.id.text_message).setVisibility(AbstractC167007dF.A05(bundle2.getBoolean("extra_show_subtitle") ? 1 : 0));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            linearLayoutManager.A12(true);
            RecyclerView A0G = AbstractC31172DnG.A0G(inflate, R.id.variant_selector_recycler_view);
            this.A07 = A0G;
            if (A0G != null) {
                A0G.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView = this.A07;
                if (recyclerView != null) {
                    AbstractC37304Gc5.A0z(recyclerView, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), AbstractC167017dG.A05(requireContext()));
                    RecyclerView recyclerView2 = this.A07;
                    if (recyclerView2 != null) {
                        C38361Gtx c38361Gtx = this.A09;
                        recyclerView2.setAdapter(c38361Gtx);
                        c38361Gtx.A02 = new C42843IxJ(this);
                        C0f9.A09(-780266891, A02);
                        return inflate;
                    }
                }
            }
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(194049745, A02);
        throw A0g;
    }
}

package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class HC3 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DebugFragment";
    public final InterfaceC09390do A00 = C43206J8d.A00(this, 10);
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131969984);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "pdp_debug";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(view, R.id.recycler_view);
        AbstractC37304Gc5.A10(recyclerView, this.A00);
        AbstractC31177DnL.A0s(getContext(), recyclerView);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        int A02 = C0f9.A02(-2138554340);
        super.onCreate(bundle);
        Product product = (Product) requireArguments().getParcelable("product");
        if (product != null) {
            User user = product.A0B;
            C66413UGh c66413UGh = (C66413UGh) this.A00.getValue();
            VAM vam = new VAM("Info");
            String str3 = product.A0H;
            VAO vao = new VAO("Product ID", str3);
            VAO vao2 = new VAO("Name", product.A0J);
            VAO vao3 = new VAO("Description", product.A0E);
            ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
            VAO vao4 = new VAO("Has Rich Text Description", String.valueOf(AbstractC167007dF.A1W(productDetailsProductItemDict.A0m)));
            VAO vao5 = new VAO("Checkout Style", AbstractC31180DnO.A0k(productDetailsProductItemDict.A00));
            String str4 = null;
            VAO vao6 = new VAO("Merchant ID", AbstractC37301Gc2.A0o(user));
            if (user != null) {
                str = AbstractC37300Gc1.A0U(user);
            } else {
                str = null;
            }
            VAO vao7 = new VAO("Merchant Username", str);
            VAO vao8 = new VAO("External URL", product.A0F);
            if (user != null) {
                str2 = AbstractC37300Gc1.A0U(user);
                str4 = AbstractC76433bn.A00(user);
            } else {
                str2 = null;
            }
            String format = String.format("http://www.instagram.com/_n/product_details_page?business_username=%s&business_user_id=%s&product_id=%s", Arrays.copyOf(new Object[]{str2, str4, str3}, 3));
            C14360o3.A07(format);
            c66413UGh.A00 = AbstractC16960so.A1Q(vam, vao, vao2, vao3, vao4, vao5, vao6, vao7, vao8, new VAO("Deeplink URL", format), new VAO("Review Status", product.A05.A00), new VAM("Deep Link Launcher"), new VAN("Pin this Product Details Page", C43208J8f.A00(product, this, 2)), new VAN("Pin this User's Profile Shop", C43208J8f.A00(product, this, 3)));
            c66413UGh.notifyDataSetChanged();
            C0f9.A09(1841214951, A02);
            return;
        }
        IllegalArgumentException A12 = AbstractC166987dD.A12("Product is required to launch DebugFragment");
        C0f9.A09(-2035311328, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-67654276);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        C0f9.A09(-2049686965, A02);
        return inflate;
    }
}

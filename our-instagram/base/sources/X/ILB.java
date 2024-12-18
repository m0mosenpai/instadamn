package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.user.model.Product;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class ILB {
    public final /* synthetic */ HCL A00;

    public ILB(HCL hcl) {
        this.A00 = hcl;
    }

    public final void A00(C41643IbZ c41643IbZ, Product product) {
        ProductGroup productGroup;
        List unmodifiableList;
        HCL hcl = this.A00;
        C25671My A0Q = AbstractC31176DnK.A0Q(hcl.A0N);
        ProductPickerArguments productPickerArguments = hcl.A08;
        String str = "arguments";
        if (productPickerArguments != null) {
            A0Q.E4s(new NYB(product, productPickerArguments.A01, productPickerArguments.A05));
            C41701IdV c41701IdV = hcl.A05;
            if (c41701IdV == null) {
                str = "logger";
            } else {
                ProductSourceOverrideState productSourceOverrideState = hcl.A09;
                if (productSourceOverrideState == null) {
                    str = "productSourceOverrideState";
                } else {
                    ProductSource productSource = productSourceOverrideState.A00;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c41701IdV.A03, "instagram_shopping_product_tagging_product_selected");
                    AbstractC37300Gc1.A0n(A0f, c41701IdV.A04);
                    A0f.AAP("product_id", product.A0H);
                    String str2 = c41643IbZ.A01;
                    if (str2 != null) {
                        A0f.AAP("section_group", str2);
                        A0f.AAP("section_type", c41643IbZ.A03());
                        AbstractC37301Gc2.A17(A0f, AbstractC37302Gc3.A0d(product));
                        A0f.A7v("is_sku_match", Boolean.valueOf(I6N.A00(c41643IbZ)));
                        A0f.AAP("waterfall_id", c41701IdV.A06);
                        C41701IdV.A01(A0f, c41701IdV);
                        UntaggableReason untaggableReason = product.A06;
                        if (untaggableReason != null) {
                            A0f.AAP(AbstractC111324zv.A00(1359), untaggableReason.A04);
                        }
                        IH7 ih7 = c41643IbZ.A01().A01;
                        if (ih7 != null && (productGroup = ih7.A00) != null && (unmodifiableList = Collections.unmodifiableList(productGroup.A02)) != null) {
                            A0f.AAP("variant_id", ((ProductVariantDimension) unmodifiableList.get(0)).A02);
                        }
                        if (productSource != null) {
                            A0f.AAP("selected_source_id", productSource.A01);
                            String str3 = productSource.A03;
                            if (str3 == null) {
                                str3 = productSource.A04;
                            }
                            A0f.AAP("selected_source_name", str3);
                            A0f.AAP("selected_source_type", productSource.A00.toString());
                        }
                        A0f.Cht();
                        ProductPickerArguments productPickerArguments2 = hcl.A08;
                        if (productPickerArguments2 != null) {
                            if (productPickerArguments2.A0B && productPickerArguments2.A0C) {
                                FragmentActivity activity = hcl.getActivity();
                                if (activity != null) {
                                    Intent intent = new Intent();
                                    intent.putExtra("selected_product", product);
                                    activity.setResult(-1, intent);
                                    activity.finish();
                                    return;
                                }
                                throw AbstractC166997dE.A0g();
                            }
                            hcl.A0D = false;
                            FragmentActivity activity2 = hcl.getActivity();
                            if (activity2 != null) {
                                activity2.onBackPressed();
                                return;
                            }
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        C14360o3.A0F("sectionGroup");
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}

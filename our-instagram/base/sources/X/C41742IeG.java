package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.shopping.fragment.variantselector.MultiVariantSelectorLoadingFragment;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.IeG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41742IeG {
    public C189478aR A00;
    public InterfaceC1119153d A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final IHO A05;
    public final Map A06;
    public final int A07;
    public final boolean A08;

    public static final void A02(C41742IeG c41742IeG, List list, int[] iArr, int i, boolean z) {
        ProductVariantDimension productVariantDimension = (ProductVariantDimension) list.get(i);
        C189448aO A0y = AbstractC25225BEi.A0y(c41742IeG.A04);
        A0y.A0d = AbstractC166997dE.A0r(c41742IeG.A03.getResources(), productVariantDimension.A03, 2131976586);
        if (i > 0) {
            C189458aP c189458aP = new C189458aP(null, null, "", 0, 0);
            c189458aP.A02 = R.drawable.instagram_arrow_back_24;
            c189458aP.A05 = new ViewOnClickListenerC42005Ija(i, 1, list, null, c41742IeG, productVariantDimension, z);
            A0y.A06(c189458aP.A00());
        } else {
            A0y.A01();
        }
        A0y.A04(iArr[0], iArr[1], iArr[2], iArr[3]);
        AbstractC38938HCn A01 = A01(c41742IeG, list, i, z);
        A0y.A0T = A01;
        C189478aR c189478aR = c41742IeG.A00;
        if (c189478aR != null) {
            c189478aR.A0G(A01, A0y, false, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final MultiVariantSelectorLoadingFragment A00(C41048IFr c41048IFr, C41742IeG c41742IeG) {
        Product product = c41048IFr.A00;
        MultiVariantSelectorLoadingFragment multiVariantSelectorLoadingFragment = new MultiVariantSelectorLoadingFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putInt("arg_fixed_height", c41742IeG.A07);
        A0b.putString("product_id", product.A0H);
        A0b.putString("merchant_id", AbstractC37302Gc3.A0d(product));
        A0b.putSerializable(AbstractC111324zv.A00(2913), null);
        multiVariantSelectorLoadingFragment.setArguments(A0b);
        multiVariantSelectorLoadingFragment.A01 = new C41049IFs(c41048IFr, c41742IeG);
        return multiVariantSelectorLoadingFragment;
    }

    public static final AbstractC38938HCn A01(C41742IeG c41742IeG, List list, int i, boolean z) {
        AbstractC38938HCn hz8;
        ProductVariantDimension productVariantDimension = (ProductVariantDimension) list.get(i);
        if (productVariantDimension.A00.ordinal() != 2) {
            hz8 = new HZ9();
        } else {
            hz8 = new HZ8();
        }
        IHO iho = c41742IeG.A05;
        ProductGroup productGroup = iho.A00;
        ArrayList arrayList = null;
        if (productGroup != null) {
            C41226IMr c41226IMr = new C41226IMr(productGroup, productVariantDimension);
            ProductGroup productGroup2 = iho.A00;
            if (productGroup2 != null) {
                Iterator A13 = AbstractC31174DnI.A13(productGroup2.A02);
                while (A13.hasNext()) {
                    ProductVariantDimension productVariantDimension2 = (ProductVariantDimension) AbstractC166997dE.A0l(A13);
                    String A1A = AbstractC166987dD.A1A(productVariantDimension2, iho.A02);
                    if (A1A != null && !C14360o3.A0K(productVariantDimension2, productVariantDimension)) {
                        c41226IMr.A01(productVariantDimension2, A1A);
                    }
                }
                C41225IMq A00 = c41226IMr.A00();
                ArrayList A01 = A00.A01();
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : A00.A02.A00.A05) {
                    Map map = A00.A01;
                    if (map.containsKey(obj)) {
                        A1E.add(map.get(obj));
                    }
                }
                ProductGroup productGroup3 = iho.A00;
                if (productGroup3 != null) {
                    int indexOf = Collections.unmodifiableList(productGroup3.A02).indexOf(productVariantDimension);
                    if (productVariantDimension.A00 == ProductVariantVisualStyle.A05) {
                        arrayList = A1E;
                    }
                    ArrayList A002 = A00.A00();
                    Object obj2 = iho.A02.get(productVariantDimension);
                    C14360o3.A0B(A01, 0);
                    VariantSelectorModel variantSelectorModel = new VariantSelectorModel(productVariantDimension, A01, arrayList, A002, indexOf, A01.indexOf(obj2));
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putInt("arg_fixed_height", c41742IeG.A07);
                    A0b.putParcelable("variant_selector_model", variantSelectorModel);
                    A0b.putBoolean("arg_disable_sold_out", c41742IeG.A08);
                    hz8.setArguments(A0b);
                    hz8.A01(new C42847IxN(c41742IeG, list, z));
                    I6K.A00(c41742IeG.A04).A06(false);
                    return hz8;
                }
            }
        }
        C14360o3.A0F("_productGroup");
        throw C00O.createAndThrow();
    }

    public C41742IeG(FragmentActivity fragmentActivity, UserSession userSession) {
        this(fragmentActivity, userSession, AbstractC167007dF.A1V(userSession));
    }

    public C41742IeG(FragmentActivity fragmentActivity, UserSession userSession, boolean z) {
        AbstractC167017dG.A1P(fragmentActivity, userSession);
        this.A03 = fragmentActivity;
        this.A04 = userSession;
        this.A08 = z;
        this.A05 = new IHO();
        this.A06 = AbstractC166987dD.A1G();
        this.A07 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
    }
}

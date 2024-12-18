package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.user.model.Product;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ixf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42865Ixf implements JHP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C42865Ixf(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static HDP A00(C42865Ixf c42865Ixf) {
        HDP hdp = (HDP) c42865Ixf.A02;
        C41199ILn c41199ILn = hdp.A00;
        if (c41199ILn != null) {
            IKU iku = c41199ILn.A01;
            ShimmerFrameLayout shimmerFrameLayout = iku.A03;
            shimmerFrameLayout.A03();
            iku.A01.setVisibility(0);
            shimmerFrameLayout.A04(null);
            shimmerFrameLayout.setVisibility(8);
        }
        return hdp;
    }

    @Override // X.JHP
    public final void DFf() {
        switch (this.A00) {
            case 0:
                A00(this).A01 = null;
                return;
            case 1:
                C05A c05a = ((IMV) this.A02).A04;
                Boolean A0a = AbstractC166997dE.A0a();
                c05a.Egh(A0a);
                ((InterfaceC23621Ds) this.A01).resumeWith(A0a);
                return;
            default:
                C41644Iba.A00((C41644Iba) this.A01, (Product) this.A02, C05F.A0N);
                return;
        }
    }

    @Override // X.JHP
    public final void Dq0(ProductGroup productGroup) {
        String str;
        ExtendedImageUrl extendedImageUrl;
        switch (this.A00) {
            case 0:
                HDP A00 = A00(this);
                if (productGroup != null && AbstractC166987dD.A1b(AbstractC31172DnG.A19(productGroup.A02))) {
                    C38359Gtv c38359Gtv = A00.A01;
                    if (c38359Gtv != null) {
                        Product product = (Product) this.A01;
                        List A002 = productGroup.A00();
                        C14360o3.A07(A002);
                        List list = c38359Gtv.A04;
                        list.clear();
                        List list2 = c38359Gtv.A06;
                        list2.clear();
                        List list3 = c38359Gtv.A05;
                        list3.clear();
                        Iterator A13 = AbstractC31174DnI.A13(productGroup.A02);
                        while (true) {
                            if (A13.hasNext()) {
                                ProductVariantDimension productVariantDimension = (ProductVariantDimension) A13.next();
                                if (productVariantDimension.A00 == ProductVariantVisualStyle.A05) {
                                    c38359Gtv.A01 = productVariantDimension;
                                }
                            }
                        }
                        ProductVariantDimension productVariantDimension2 = c38359Gtv.A01;
                        if (productVariantDimension2 != null) {
                            Iterator it = A002.iterator();
                            while (it.hasNext()) {
                                Product A0L = AbstractC37300Gc1.A0L(it);
                                ImageInfo imageInfo = A0L.A08;
                                List<ProductVariantPossibleValueDictIntf> list4 = A0L.A0O;
                                if (list4 != null) {
                                    for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list4) {
                                        ExtendedImageUrl extendedImageUrl2 = null;
                                        if (C14360o3.A0K(productVariantPossibleValueDictIntf.getId(), productVariantDimension2.A02) && !list2.contains(productVariantPossibleValueDictIntf.getValue())) {
                                            list2.add(productVariantPossibleValueDictIntf.getValue());
                                            list3.add(A0L);
                                            if (imageInfo != null) {
                                                extendedImageUrl = AbstractC40161tk.A02(imageInfo);
                                            } else {
                                                extendedImageUrl = null;
                                            }
                                            list.add(extendedImageUrl);
                                        }
                                        if (C14360o3.A0K(productVariantPossibleValueDictIntf.getId(), productVariantDimension2.A02)) {
                                            if (product != null) {
                                                str = product.A0H;
                                            } else {
                                                str = null;
                                            }
                                            if (C14360o3.A0K(str, A0L.A0H)) {
                                                int indexOf = list2.indexOf(productVariantPossibleValueDictIntf.getValue());
                                                list3.set(indexOf, product);
                                                c38359Gtv.A00 = indexOf;
                                                if (imageInfo != null) {
                                                    extendedImageUrl2 = AbstractC40161tk.A02(imageInfo);
                                                }
                                                list.set(indexOf, extendedImageUrl2);
                                            }
                                        }
                                    }
                                }
                            }
                            if (c38359Gtv.A00 == -1) {
                                c38359Gtv.A00 = 0;
                            }
                            c38359Gtv.notifyDataSetChanged();
                            return;
                        }
                        return;
                    }
                    return;
                }
                A00.A01 = null;
                return;
            case 1:
                AbstractC166997dE.A1Y(((IMV) this.A02).A04, false);
                ((InterfaceC23621Ds) this.A01).resumeWith(AbstractC166997dE.A0b());
                return;
            default:
                C41644Iba c41644Iba = (C41644Iba) this.A01;
                C41644Iba.A00(c41644Iba, (Product) this.A02, C05F.A0C);
                if (productGroup != null) {
                    Iterator it2 = productGroup.A00().iterator();
                    while (it2.hasNext()) {
                        Product A0L2 = AbstractC37300Gc1.A0L(it2);
                        c41644Iba.A03.put(AbstractC41555Ia4.A00(A0L2), A0L2);
                    }
                    return;
                }
                return;
        }
    }
}

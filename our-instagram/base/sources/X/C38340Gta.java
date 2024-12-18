package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gta, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38340Gta extends AbstractC66542zW {
    public FBProductItemDetailsDictImpl A00;
    public Product A01;
    public List A02;
    public List A03;
    public final C2US A04;

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A02.size();
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A03.size();
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        FBProductItemDetailsDict fBProductItemDetailsDict;
        Object obj = ((C41218IMh) this.A03.get(i)).A01;
        if (obj instanceof C42335Iox) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.shopping.viewmodel.destination.ProductFeedGridRowViewModel");
            C42335Iox c42335Iox = (C42335Iox) obj;
            Object obj2 = ((C41218IMh) this.A02.get(i2)).A01;
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.shopping.viewmodel.destination.ProductFeedGridRowViewModel");
            C42335Iox c42335Iox2 = (C42335Iox) obj2;
            Iterator it = c42335Iox.A05.iterator();
            while (it.hasNext()) {
                ProductFeedItem productFeedItem = (ProductFeedItem) it.next();
                int intValue = productFeedItem.A06.intValue();
                if (intValue != 2) {
                    if (intValue == 0 && C14360o3.A0K(productFeedItem.A01, null)) {
                        return false;
                    }
                } else {
                    Product product = this.A01;
                    if (product != null && C14360o3.A0K(productFeedItem.A02(), product)) {
                        return false;
                    }
                    if (this.A00 != null) {
                        ProductTile productTile = productFeedItem.A02;
                        if (productTile != null) {
                            fBProductItemDetailsDict = AbstractC41709Idf.A01(productTile);
                        } else {
                            fBProductItemDetailsDict = null;
                        }
                        if (C14360o3.A0K(fBProductItemDetailsDict, this.A00)) {
                            return false;
                        }
                    }
                    if (!C14360o3.A0K(c42335Iox.A09, c42335Iox2.A09)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        return C14360o3.A0K(AbstractC001800i.A0O(this.A03, i), AbstractC001800i.A0O(this.A02, i2));
    }

    public final void A06() {
        C2US c2us = this.A04;
        ArrayList A1E = AbstractC166987dD.A1E();
        int count = c2us.getCount();
        for (int i = 0; i < count; i++) {
            A1E.add(new C41218IMh(c2us.getItemViewType(i), c2us.getItem(i)));
        }
        this.A02 = A1E;
        AbstractC66552zX.A00(this).A03(c2us);
        this.A03 = A1E;
        this.A01 = null;
        this.A00 = null;
    }

    public C38340Gta(C2US c2us) {
        this.A04 = c2us;
        C16930sl c16930sl = C16930sl.A00;
        this.A03 = c16930sl;
        this.A02 = c16930sl;
    }
}

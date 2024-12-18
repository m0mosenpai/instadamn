package X;

import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class INR {
    public int A00;
    public LinkedHashMap A01;
    public final MultiProductComponent A02;
    public final C41634IbP A03;

    public final C41634IbP A00() {
        C41634IbP c41634IbP = this.A03;
        User user = c41634IbP.A05;
        IDF idf = c41634IbP.A04;
        Collections.unmodifiableList(c41634IbP.A06);
        if (!c41634IbP.A07.isEmpty()) {
            c41634IbP.A07.get(0);
        }
        boolean z = c41634IbP.A08;
        return new C41634IbP(this.A02, c41634IbP.A03, idf, user, AbstractC166987dD.A1F(this.A01.values()), z);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.Ie1, java.lang.Object] */
    public final C41730Ie1 A01(String str, int i) {
        if (this.A01.containsKey(str)) {
            Object obj = this.A01.get(str);
            if (obj != null) {
                C41730Ie1 c41730Ie1 = (C41730Ie1) obj;
                LinkedHashMap linkedHashMap = this.A01;
                C41224IMp c41224IMp = c41730Ie1.A02;
                int i2 = c41730Ie1.A00;
                ?? obj2 = new Object();
                obj2.A02 = c41224IMp;
                obj2.A01 = i;
                obj2.A00 = i2;
                linkedHashMap.put(str, obj2);
                this.A00 = (this.A00 - c41730Ie1.A01) + i;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return (C41730Ie1) this.A01.get(str);
    }

    public final void A02(C41730Ie1 c41730Ie1) {
        if (!this.A01.containsKey(c41730Ie1.A05())) {
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            A1I.put(c41730Ie1.A05(), c41730Ie1);
            A1I.putAll(this.A01);
            this.A01 = A1I;
            this.A00 += c41730Ie1.A01;
        }
    }

    public final void A03(C41730Ie1 c41730Ie1) {
        if (this.A01.containsKey(c41730Ie1.A05())) {
            this.A01.remove(c41730Ie1.A05());
            this.A00 -= c41730Ie1.A01;
        }
    }

    public final void A04(C41730Ie1 c41730Ie1, Product product) {
        int i;
        Integer num;
        if (product.A01.A0C != null) {
            String str = product.A0H;
            C14360o3.A0B(str, 0);
            C41730Ie1 c41730Ie12 = (C41730Ie1) this.A01.get(str);
            int A03 = c41730Ie1.A03();
            if (c41730Ie12 != null) {
                A03 += c41730Ie12.A03();
            }
            ProductCheckoutProperties productCheckoutProperties = product.A01.A0C;
            int i2 = 0;
            if (productCheckoutProperties != null && (num = productCheckoutProperties.A0C) != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C41730Ie1 A01 = C41730Ie1.A01(product, Math.min(i, A03));
            int i3 = this.A00 - c41730Ie1.A01;
            this.A00 = i3;
            if (c41730Ie12 != null) {
                i2 = c41730Ie12.A01;
            }
            int i4 = i3 - i2;
            this.A00 = i4;
            this.A00 = i4 + A01.A01;
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            Iterator A14 = AbstractC166997dE.A14(this.A01);
            while (A14.hasNext()) {
                Map.Entry entry = (Map.Entry) AbstractC166997dE.A0l(A14);
                if (!C14360o3.A0K(entry.getKey(), A01.A05())) {
                    if (C14360o3.A0K(entry.getKey(), c41730Ie1.A05())) {
                        A1I.put(A01.A05(), A01);
                    } else {
                        A1I.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            this.A01 = A1I;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public INR(C41634IbP c41634IbP) {
        MultiProductComponent multiProductComponent;
        this.A03 = c41634IbP;
        if (c41634IbP.A07.isEmpty()) {
            multiProductComponent = null;
        } else {
            multiProductComponent = (MultiProductComponent) AbstractC166987dD.A16(c41634IbP.A07);
        }
        this.A02 = multiProductComponent;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        this.A01 = A1I;
        A1I.clear();
        this.A00 = 0;
        Iterator A13 = AbstractC31174DnI.A13(c41634IbP.A06);
        while (A13.hasNext()) {
            C41730Ie1 c41730Ie1 = (C41730Ie1) AbstractC166997dE.A0l(A13);
            this.A01.put(c41730Ie1.A05(), c41730Ie1);
            this.A00 += c41730Ie1.A01;
        }
    }
}

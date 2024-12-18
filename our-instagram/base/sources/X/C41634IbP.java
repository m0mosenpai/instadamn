package X;

import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IbP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41634IbP {
    public int A00;
    public int A01;
    public C43079J2u A02;
    public C41032IFb A03;
    public IDF A04;
    public User A05;
    public List A06;
    public List A07;
    public boolean A08;
    public final List A09;

    public final void A01() {
        ProductCheckoutProperties productCheckoutProperties;
        BigDecimal bigDecimal;
        this.A00 = 0;
        this.A01 = 0;
        C41032IFb c41032IFb = this.A03;
        this.A02 = new C43079J2u(c41032IFb.A01, BigDecimal.ZERO, c41032IFb.A00);
        for (C41730Ie1 c41730Ie1 : this.A06) {
            this.A00 += c41730Ie1.A03();
            Product A04 = c41730Ie1.A04();
            if (A04 != null && (productCheckoutProperties = A04.A01.A0C) != null && Boolean.TRUE.equals(productCheckoutProperties.A02) && c41730Ie1.A04().A0P) {
                this.A01 += c41730Ie1.A03();
                C43079J2u c43079J2u = this.A02;
                Product A042 = c41730Ie1.A04();
                if (A042 != null && A042.A0P) {
                    bigDecimal = new BigDecimal(A042.A01.A0C.A00.getAmountWithOffset()).multiply(new BigDecimal(c41730Ie1.A03()));
                } else {
                    bigDecimal = new BigDecimal(0);
                }
                this.A02 = new C43079J2u(c43079J2u.A01, c43079J2u.A02.add(bigDecimal), c43079J2u.A00);
                this.A09.add(c41730Ie1);
            }
        }
    }

    public C41634IbP(MultiProductComponent multiProductComponent, C41032IFb c41032IFb, IDF idf, User user, List list, boolean z) {
        this.A07 = AbstractC166987dD.A1E();
        this.A09 = AbstractC166987dD.A1E();
        user.getClass();
        this.A05 = user;
        idf.getClass();
        this.A04 = idf;
        list.getClass();
        this.A06 = list;
        this.A07 = Arrays.asList(multiProductComponent);
        c41032IFb.getClass();
        this.A03 = c41032IFb;
        this.A08 = z;
        A01();
    }

    public final ArrayList A00() {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            Product A04 = ((C41730Ie1) it.next()).A04();
            if (A04 != null) {
                A1E.add(A04);
            }
        }
        return A1E;
    }

    public C41634IbP() {
        this.A07 = AbstractC166987dD.A1E();
        this.A09 = AbstractC166987dD.A1E();
    }
}

package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes4.dex */
public final class AM0 {
    public final Product A00;
    public final ProductCollection A01;
    public final User A02;
    public final User A03;
    public final List A04;

    public AM0(User user) {
        this.A00 = null;
        this.A04 = null;
        this.A03 = user;
        this.A01 = null;
        this.A02 = null;
    }

    public final User A00() {
        List list;
        User user;
        Product product;
        Product product2 = this.A00;
        if ((product2 == null || (user = product2.A0B) == null) && (((list = this.A04) == null || (product = (Product) AbstractC001800i.A0J(list)) == null || (user = product.A0B) == null) && (user = this.A03) == null && (user = this.A02) == null)) {
            throw AbstractC166987dD.A14("expected merchant");
        }
        return user;
    }

    public AM0(ProductCollection productCollection, User user) {
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = productCollection;
        this.A02 = user;
    }

    public AM0(Product product) {
        this.A00 = product;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public AM0(List list) {
        this.A00 = null;
        this.A04 = list;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
    }
}

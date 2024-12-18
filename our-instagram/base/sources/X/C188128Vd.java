package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.8Vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C188128Vd {
    public EnumC53230NgS A00;
    public final AM0 A01;
    public final String A02;

    public C188128Vd(User user) {
        this.A01 = new AM0(user);
        this.A02 = null;
    }

    public C188128Vd(EnumC53230NgS enumC53230NgS, Product product) {
        this.A01 = new AM0(product);
        this.A02 = null;
        this.A00 = enumC53230NgS;
    }

    public C188128Vd(List list) {
        this.A01 = new AM0(list);
        this.A02 = null;
    }

    public C188128Vd(ProductCollection productCollection, User user) {
        this.A01 = new AM0(productCollection, user);
        this.A02 = null;
    }

    public C188128Vd(Product product, String str) {
        C14360o3.A0B(product, 1);
        this.A01 = new AM0(product);
        this.A02 = str;
    }
}

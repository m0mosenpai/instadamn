package X;

import com.instagram.user.model.Product;

/* renamed from: X.Eba, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32770Eba extends FKR {
    public final Product A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32770Eba) {
                C32770Eba c32770Eba = (C32770Eba) obj;
                if (!C14360o3.A0K(this.A01, c32770Eba.A01) || !C14360o3.A0K(this.A00, c32770Eba.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32770Eba(Product product, String str) {
        super(C2EY.A1a, str);
        this.A01 = str;
        this.A00 = product;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}

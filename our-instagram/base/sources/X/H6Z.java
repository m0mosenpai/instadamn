package X;

import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;

/* loaded from: classes7.dex */
public final class H6Z extends C0T6 implements JJ0 {
    public final ProductImageContainer A00;
    public final long A01;
    public final long A02;
    public final long A03;

    public H6Z(ProductImageContainer productImageContainer, long j, long j2, long j3) {
        C14360o3.A0B(productImageContainer, 2);
        this.A01 = j;
        this.A00 = productImageContainer;
        this.A02 = j2;
        this.A03 = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6Z) {
                H6Z h6z = (H6Z) obj;
                if (this.A01 != h6z.A01 || !C14360o3.A0K(this.A00, h6z.A00) || this.A02 != h6z.A02 || this.A03 != h6z.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        int A07 = AbstractC167007dF.A07(this.A02, AbstractC166997dE.A0J(this.A00, ((int) (j ^ (j >>> 32))) * 31));
        long j2 = this.A03;
        return A07 + ((int) (j2 ^ (j2 >>> 32)));
    }
}

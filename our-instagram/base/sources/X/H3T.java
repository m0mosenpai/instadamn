package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class H3T extends C0T6 implements InterfaceC43470JIi {
    public final C50627MWo A00;
    public final InterfaceC43471JIj A01;
    public final ProductDetailsProductItemDict A02;
    public final User A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3T) {
                H3T h3t = (H3T) obj;
                if (!C14360o3.A0K(this.A03, h3t.A03) || !C14360o3.A0K(this.A01, h3t.A01) || !C14360o3.A0K(this.A02, h3t.A02) || !C14360o3.A0K(this.A00, h3t.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A03) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H3T(C50627MWo c50627MWo, InterfaceC43471JIj interfaceC43471JIj, ProductDetailsProductItemDict productDetailsProductItemDict, User user) {
        this.A03 = user;
        this.A01 = interfaceC43471JIj;
        this.A02 = productDetailsProductItemDict;
        this.A00 = c50627MWo;
    }
}

package X;

import com.instagram.user.model.Product;
import java.util.Arrays;

/* renamed from: X.IMu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41229IMu {
    public EnumC39537Hd9 A00;
    public final EnumC39548HdK A01;
    public final C41730Ie1 A02;
    public final Product A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C41229IMu c41229IMu = (C41229IMu) obj;
            if (this.A01 != c41229IMu.A01 || this.A00 != c41229IMu.A00 || !C14360o3.A0K(this.A02, c41229IMu.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A02});
    }

    public C41229IMu(EnumC39548HdK enumC39548HdK, EnumC39537Hd9 enumC39537Hd9, C41730Ie1 c41730Ie1, Product product) {
        this.A01 = enumC39548HdK;
        this.A00 = enumC39537Hd9;
        this.A02 = c41730Ie1;
        this.A03 = product;
    }
}

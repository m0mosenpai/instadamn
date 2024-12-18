package X;

import com.instagram.api.schemas.ProductPivotsButton;
import com.instagram.api.schemas.ProductPivotsSourceMediaType;
import com.instagram.api.schemas.ShoppingPivotItemType;
import java.util.List;

/* renamed from: X.Gys, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38651Gys extends C0T6 {
    public final ProductPivotsButton A00;
    public final ProductPivotsSourceMediaType A01;
    public final InterfaceC39571se A02;
    public final ShoppingPivotItemType A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;
    public final List A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38651Gys) {
                C38651Gys c38651Gys = (C38651Gys) obj;
                if (!C14360o3.A0K(this.A00, c38651Gys.A00) || !C14360o3.A0K(this.A04, c38651Gys.A04) || !C14360o3.A0K(this.A02, c38651Gys.A02) || !C14360o3.A0K(this.A0A, c38651Gys.A0A) || !C14360o3.A0K(this.A06, c38651Gys.A06) || this.A03 != c38651Gys.A03 || !C14360o3.A0K(this.A0B, c38651Gys.A0B) || !C14360o3.A0K(this.A07, c38651Gys.A07) || !C14360o3.A0K(this.A08, c38651Gys.A08) || this.A01 != c38651Gys.A01 || !C14360o3.A0K(this.A09, c38651Gys.A09) || !C14360o3.A0K(this.A05, c38651Gys.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C38651Gys(ProductPivotsButton productPivotsButton, ProductPivotsSourceMediaType productPivotsSourceMediaType, InterfaceC39571se interfaceC39571se, ShoppingPivotItemType shoppingPivotItemType, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, List list2) {
        this.A00 = productPivotsButton;
        this.A04 = num;
        this.A02 = interfaceC39571se;
        this.A0A = list;
        this.A06 = str;
        this.A03 = shoppingPivotItemType;
        this.A0B = list2;
        this.A07 = str2;
        this.A08 = str3;
        this.A01 = productPivotsSourceMediaType;
        this.A09 = str4;
        this.A05 = num2;
    }
}

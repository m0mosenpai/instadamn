package X;

import java.util.List;

/* renamed from: X.Gxg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38577Gxg extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public EnumC39571Hdh A04;
    public Integer A05;
    public List A06;
    public boolean A07;
    public boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38577Gxg) {
                C38577Gxg c38577Gxg = (C38577Gxg) obj;
                if (this.A04 != c38577Gxg.A04 || !C14360o3.A0K(this.A06, c38577Gxg.A06) || this.A07 != c38577Gxg.A07 || this.A08 != c38577Gxg.A08 || this.A02 != c38577Gxg.A02 || this.A01 != c38577Gxg.A01 || this.A03 != c38577Gxg.A03 || this.A00 != c38577Gxg.A00 || this.A05 != c38577Gxg.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0D = (((((((AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A06, AbstractC166987dD.A0G(this.A04)))) + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + this.A00) * 31;
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "PRODUCT_COLLECTION";
                break;
            case 2:
                str = "PROFILE_SHOP";
                break;
            case 3:
                str = "PROFILE_SHOP_RECONSIDERATION";
                break;
            case 4:
                str = "RELATED_PRODUCTS";
                break;
            case 5:
                str = "SAVED_PRODUCTS_COLLECTION";
                break;
            case 6:
                str = "SHOPPING_CART";
                break;
            case 7:
                str = "SHOPPING_HOME_PRODUCT_HSCROLL";
                break;
            case 8:
                str = "TAGGED_PRODUCTS";
                break;
            case 9:
                str = "VISUAL_SEARCH";
                break;
            default:
                str = "FEED_PRODUCT_PIVOTS";
                break;
        }
        return A0D + AbstractC25226BEj.A02(str, intValue);
    }
}

package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductSource;
import java.util.List;

/* renamed from: X.HYy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39333HYy extends PIC {
    public ProductSource A00;
    public String A01;
    public List A02;
    public final EnumC39584Hdu A03;

    @Override // X.PIC
    public final String A00() {
        ProductSource productSource = this.A00;
        if (productSource != null && productSource.A00 == EnumC39617HeR.A03) {
            return "commerce/highlighted_and_available_products/";
        }
        return "commerce/catalogs/selected/available_product_sections/";
    }

    @Override // X.PIC
    public final void A02(C25621Ms c25621Ms) {
        ProductSource productSource = this.A00;
        if (productSource != null && productSource.A00 == EnumC39617HeR.A03) {
            C14360o3.A0A(productSource);
            c25621Ms.A9s("merchant_id", productSource.A01);
        }
        List list = this.A02;
        if (list != null) {
            c25621Ms.A9s("suggested_product_ids", AbstractC31175DnJ.A0b(list));
        }
        EnumC39584Hdu enumC39584Hdu = this.A03;
        if (enumC39584Hdu != null) {
            c25621Ms.A9s("surface", enumC39584Hdu.A00);
        }
        String str = this.A01;
        if (str != null) {
            c25621Ms.A9s("waterfall_id", str);
        }
    }

    @Override // X.PIC
    public final void A03(ProductSource productSource) {
        String str;
        if (productSource != null) {
            EnumC39617HeR enumC39617HeR = productSource.A00;
            if (enumC39617HeR == EnumC39617HeR.A03 && productSource.A01 == null) {
                return;
            }
            ProductSource productSource2 = this.A00;
            if (productSource2 != null && (str = productSource2.A01) != null && (enumC39617HeR != productSource2.A00 || !C2I7.A00(productSource.A01, str))) {
                A01();
            }
            this.A00 = productSource;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39333HYy(UserSession userSession, InterfaceC58157PqM interfaceC58157PqM, EnumC39584Hdu enumC39584Hdu) {
        super(userSession, interfaceC58157PqM);
        AbstractC167017dG.A1P(userSession, interfaceC58157PqM);
        this.A03 = enumC39584Hdu;
    }

    @Override // X.PIC
    public final void A04(String str) {
        this.A01 = str;
    }

    @Override // X.PIC
    public final void A05(List list) {
        this.A02 = list;
    }
}

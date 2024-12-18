package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

/* renamed from: X.IyK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42906IyK implements InterfaceC43416JGg {
    public final /* synthetic */ ProductTile A00;
    public final /* synthetic */ C38375GuC A01;

    public C42906IyK(ProductTile productTile, C38375GuC c38375GuC) {
        this.A01 = c38375GuC;
        this.A00 = productTile;
    }

    @Override // X.InterfaceC43416JGg
    public final void DbP(EnumC77213d7 enumC77213d7) {
        C14360o3.A0B(enumC77213d7, 0);
        C38375GuC c38375GuC = this.A01;
        EnumC39622HeW B60 = c38375GuC.A00.B60();
        if (B60 != null && B60 == EnumC39622HeW.A0P && enumC77213d7 == EnumC77213d7.A03) {
            Product product = this.A00.A07;
            if (product != null) {
                C38375GuC.A01(c38375GuC, product.A0H);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}

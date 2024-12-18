package X;

import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* renamed from: X.IoG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42292IoG implements InterfaceC66482zP {
    public final ProductDetailsProductItemDictIntf A00;
    public final String A01;

    public C42292IoG(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        C14360o3.A0B(productDetailsProductItemDictIntf, 1);
        this.A00 = productDetailsProductItemDictIntf;
        String productId = productDetailsProductItemDictIntf.getProductId();
        this.A01 = productId == null ? "" : productId;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C42292IoG c42292IoG = (C42292IoG) obj;
        C14360o3.A0B(c42292IoG, 0);
        return C14360o3.A0K(this.A01, c42292IoG.A01);
    }
}

package X;

import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.user.model.Product;

/* renamed from: X.IxO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42848IxO implements JGT {
    public final /* synthetic */ IM5 A00;
    public final /* synthetic */ J0U A01;
    public final /* synthetic */ C41616Ib6 A02;
    public final /* synthetic */ String A03;

    public C42848IxO(IM5 im5, J0U j0u, C41616Ib6 c41616Ib6, String str) {
        this.A02 = c41616Ib6;
        this.A00 = im5;
        this.A03 = str;
        this.A01 = j0u;
    }

    @Override // X.JGT
    public final void Dyh(ProductVariantDimension productVariantDimension, String str) {
        AbstractC167017dG.A1N(productVariantDimension, str);
        C41616Ib6 c41616Ib6 = this.A02;
        c41616Ib6.A01(productVariantDimension, str);
        IM5 im5 = this.A00;
        String str2 = this.A03;
        Product A00 = C41616Ib6.A00(c41616Ib6);
        C14360o3.A06(A00);
        im5.A00(A00, str2);
        this.A01.A03(null);
    }
}

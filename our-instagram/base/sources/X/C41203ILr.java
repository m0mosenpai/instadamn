package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.ILr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41203ILr {
    public final UserSession A00;
    public final JHR A01;
    public final Context A02;
    public final AbstractC018607g A03;

    public C41203ILr(Context context, AbstractC018607g abstractC018607g, UserSession userSession, JHR jhr) {
        this.A01 = jhr;
        this.A00 = userSession;
        this.A02 = context;
        this.A03 = abstractC018607g;
    }

    public final void A00(C41643IbZ c41643IbZ, Product product) {
        long currentTimeMillis = System.currentTimeMillis();
        String str = product.A0H;
        C25621Ms A0c = AbstractC167017dG.A0c(this.A00);
        A0c.A0B("commerce/shop_management/hide_product/");
        C1ON A0K = AbstractC31178DnM.A0K(A0c, "product_id", str);
        A0K.A00 = new HG1(1, currentTimeMillis, this, c41643IbZ, product);
        C1GJ.A00(this.A02, this.A03, A0K);
    }
}

package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.ILt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41205ILt {
    public final IDB A00;
    public final Context A01;
    public final UserSession A02;
    public final ProductGroup A03;

    public C41205ILt(Context context, UserSession userSession, ProductGroup productGroup, IDB idb) {
        AbstractC167007dF.A1F(userSession, 2, idb);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = productGroup;
        this.A00 = idb;
    }

    public final void A00(AbstractC018607g abstractC018607g) {
        String A00;
        String str;
        HC1 hc1 = this.A00.A00;
        RefreshSpinner refreshSpinner = hc1.A06;
        if (refreshSpinner == null) {
            str = "refreshSpinner";
        } else {
            refreshSpinner.setVisibility(0);
            LinearLayout linearLayout = hc1.A01;
            if (linearLayout == null) {
                str = "errorContainer";
            } else {
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = hc1.A00;
                if (linearLayout2 == null) {
                    str = "contentContainer";
                } else {
                    linearLayout2.setVisibility(8);
                    Product product = (Product) this.A03.A00().get(0);
                    Context context = this.A01;
                    UserSession userSession = this.A02;
                    String str2 = product.A0H;
                    User user = product.A0B;
                    if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                        ISX.A01(context, abstractC018607g, userSession, new C42862Ixc(this, 0), str2, A00);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}

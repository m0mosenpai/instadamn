package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class J3T implements Runnable {
    public final /* synthetic */ HHG A00;

    public J3T(HHG hhg) {
        this.A00 = hhg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HHG hhg = this.A00;
        List list = HHG.A0U;
        IK3 ik3 = (IK3) hhg.A0R.getValue();
        ProductTile productTile = hhg.A07;
        if (productTile != null) {
            Product product = productTile.A07;
            if (product != null) {
                User user = product.A0B;
                if (user != null) {
                    C1XJ c1xj = C1XJ.A00;
                    Activity activity = ik3.A00;
                    AbstractC31171DnF.A1P(activity);
                    UserSession userSession = ik3.A02;
                    InterfaceC60442pS interfaceC60442pS = ik3.A03;
                    String str = ik3.A06;
                    String str2 = ik3.A05;
                    String A0W = AbstractC37303Gc4.A0W(user);
                    String A0U = AbstractC37300Gc1.A0U(user);
                    C14360o3.A0A(A0U);
                    C41749IeN A0N = c1xj.A0N((FragmentActivity) activity, AbstractC37300Gc1.A08(user), userSession, interfaceC60442pS, str, str2, "peek", A0W, A0U);
                    A0N.A0H = AbstractC16960so.A1M(product.A0H);
                    A0N.A05();
                    return;
                }
                throw AbstractC166987dD.A14("productTile product merchant id must not be null");
            }
            throw AbstractC166987dD.A14("productTile product must not be null");
        }
        throw AbstractC166987dD.A14("No productTile supplied");
    }
}

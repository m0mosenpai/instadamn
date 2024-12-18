package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment;
import com.instagram.user.model.Product;
import java.util.List;

/* loaded from: classes7.dex */
public final class J5O implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public J5O(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str, String str2) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ComponentActivity componentActivity;
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = this.A00;
        Activity currentActivity = igReactPurchaseExperienceBridgeModule.getCurrentActivity();
        currentActivity.getClass();
        List list = igReactPurchaseExperienceBridgeModule.mProducts;
        if (list == null) {
            String str = this.A02;
            if (!str.isEmpty()) {
                String str2 = this.A01;
                if (!str2.isEmpty()) {
                    UserSession A06 = C023409i.A0A.A06(currentActivity.getIntent().getExtras());
                    igReactPurchaseExperienceBridgeModule.mUserSession = A06;
                    C42926Iye c42926Iye = new C42926Iye(currentActivity, A06, str, str2);
                    Activity activity = c42926Iye.A01;
                    if ((activity instanceof FragmentActivity) && (componentActivity = (ComponentActivity) activity) != null) {
                        new J1L(activity, AbstractC018607g.A00(componentActivity), c42926Iye.A02, c42926Iye, null).A01(true, false);
                        return;
                    }
                    return;
                }
            }
        }
        if (igReactPurchaseExperienceBridgeModule.mUserSession == null || list == null || igReactPurchaseExperienceBridgeModule.getCurrentActivity() == null) {
            return;
        }
        C02R.A07(!igReactPurchaseExperienceBridgeModule.mProducts.isEmpty(), null);
        if (igReactPurchaseExperienceBridgeModule.mProducts.size() == 1) {
            int A0A = AbstractC13880nE.A0A(igReactPurchaseExperienceBridgeModule.getReactApplicationContext());
            float A09 = AbstractC13880nE.A09(igReactPurchaseExperienceBridgeModule.getReactApplicationContext());
            float f = A0A;
            RectF rectF = new RectF(0.0f, A09, f, A09);
            RectF rectF2 = new RectF(0.0f, A09, f, r0 * 2);
            FQL fql = new FQL(igReactPurchaseExperienceBridgeModule.getCurrentActivity(), igReactPurchaseExperienceBridgeModule.mUserSession, (Product) AbstractC166987dD.A16(igReactPurchaseExperienceBridgeModule.mProducts));
            fql.A01 = rectF;
            fql.A02 = rectF2;
            fql.A00();
            return;
        }
        C189448aO A0y = AbstractC25225BEi.A0y(igReactPurchaseExperienceBridgeModule.mUserSession);
        AbstractC25226BEj.A1M(igReactPurchaseExperienceBridgeModule.getReactApplicationContext(), A0y, 2131970005);
        C189478aR A00 = A0y.A00();
        Activity currentActivity2 = igReactPurchaseExperienceBridgeModule.getCurrentActivity();
        C1XJ.A00.A0T();
        List list2 = igReactPurchaseExperienceBridgeModule.mProducts;
        ProductSharePickerFragment productSharePickerFragment = new ProductSharePickerFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelableArrayList(AbstractC111324zv.A00(2889), AbstractC166987dD.A1F(list2));
        productSharePickerFragment.setArguments(A0b);
        A00.A02(currentActivity2, productSharePickerFragment);
    }
}

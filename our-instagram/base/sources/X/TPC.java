package X;

import android.app.Activity;
import android.content.Intent;
import com.instagram.fbpay.shoppay.IGShopPayCustomTabsActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class TPC implements Runnable {
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A00;
    public final /* synthetic */ String A01;

    public TPC(IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule, String str) {
        this.A00 = igReactPurchaseExperienceBridgeModule;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity A01 = AbstractC58321PtD.A0b(this.A00).A01();
        A01.getClass();
        AbstractC59962oe A00 = AbstractC62820SSs.A00(A01);
        A00.getClass();
        String str = this.A01;
        Intent A08 = MSW.A08(A01, IGShopPayCustomTabsActivity.class);
        A08.putExtra("extra_url", str);
        C12260kU.A06(A00, A08, 1);
    }
}

package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* loaded from: classes10.dex */
public final class TPD implements Runnable {
    public final /* synthetic */ ReadableMap A00;
    public final /* synthetic */ IgReactPurchaseExperienceBridgeModule A01;

    public TPD(ReadableMap readableMap, IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule) {
        this.A01 = igReactPurchaseExperienceBridgeModule;
        this.A00 = readableMap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string = this.A00.getString(IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY);
        Bundle A0b = AbstractC166987dD.A0b();
        if (!TextUtils.isEmpty(string)) {
            A0b.putString("PAYMENT_TYPE", string);
        }
        C2FP.A03().A04(A0b);
    }
}

package X;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.SsR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63711SsR implements InterfaceC65318Thu {
    public final /* synthetic */ InAppPurchaseControllerCoro A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ C15370ps A04;

    public C63711SsR(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Integer num, String str, Map map, C15370ps c15370ps) {
        this.A00 = inAppPurchaseControllerCoro;
        this.A02 = str;
        this.A04 = c15370ps;
        this.A01 = num;
        this.A03 = map;
    }

    @Override // X.InterfaceC65318Thu
    public final void Dmw(SYG syg, List list) {
        Activity activity;
        C14360o3.A0B(syg, 0);
        if (syg.A00 == 0 && list != null && !list.isEmpty()) {
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
            Object A0I = AbstractC001800i.A0I(list);
            C14360o3.A07(A0I);
            InAppPurchaseControllerCoro.A09((SkuDetails) A0I, inAppPurchaseControllerCoro);
            WeakReference weakReference = inAppPurchaseControllerCoro.A03;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
            String str = this.A02;
            Object A0I2 = AbstractC001800i.A0I(list);
            C14360o3.A07(A0I2);
            InAppPurchaseControllerCoro.A04(activity, (Purchase) this.A04.A00, (SkuDetails) A0I2, inAppPurchaseControllerCoro, this.A01, str);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A00;
        inAppPurchaseControllerCoro2.A06.A05(syg, this.A03);
        InAppPurchaseControllerCoro.A0E(inAppPurchaseControllerCoro2, EnumC61185Rgl.A0Q);
    }
}

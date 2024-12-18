package X;

import android.app.Activity;
import com.android.billingclient.api.Purchase;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: X.SsM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63707SsM implements InterfaceC65314Thq {
    public final /* synthetic */ Purchase A00;
    public final /* synthetic */ InAppPurchaseControllerCoro A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C63707SsM(Purchase purchase, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Integer num, String str, String str2, Map map) {
        this.A03 = str;
        this.A01 = inAppPurchaseControllerCoro;
        this.A04 = str2;
        this.A00 = purchase;
        this.A02 = num;
        this.A05 = map;
    }

    @Override // X.InterfaceC65314Thq
    public final void DbN(SYG syg, List list) {
        AbstractC61609RqY r27;
        Activity activity;
        AbstractC167017dG.A1N(syg, list);
        if (syg.A00 == 0 && AbstractC166987dD.A1b(list)) {
            C62755SPm c62755SPm = (C62755SPm) AbstractC001800i.A0I(list);
            C14360o3.A0A(c62755SPm);
            C14360o3.A0B(c62755SPm, 0);
            if (C14360o3.A0K(c62755SPm.A01, "inapp")) {
                r27 = new R25(c62755SPm, null);
            } else {
                r27 = new R27(c62755SPm, null);
            }
            String A06 = r27.A06(this.A03);
            InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A01;
            InAppPurchaseControllerCoro.A0D(inAppPurchaseControllerCoro, r27);
            WeakReference weakReference = inAppPurchaseControllerCoro.A03;
            if (weakReference != null) {
                activity = (Activity) weakReference.get();
            } else {
                activity = null;
            }
            InAppPurchaseControllerCoro.A05(activity, this.A00, inAppPurchaseControllerCoro, r27, this.A02, this.A04, A06);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro2 = this.A01;
        inAppPurchaseControllerCoro2.A06.A05(syg, this.A05);
        InterfaceC65490TlB interfaceC65490TlB = inAppPurchaseControllerCoro2.A01;
        if (interfaceC65490TlB == null) {
            return;
        }
        interfaceC65490TlB.DcW(EnumC61185Rgl.A0Q);
    }
}

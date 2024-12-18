package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;

/* renamed from: X.SsK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63705SsK implements InterfaceC65314Thq {
    public final /* synthetic */ InterfaceC65345TiS A00;
    public final /* synthetic */ InAppPurchaseControllerCoro A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C63705SsK(InterfaceC65345TiS interfaceC65345TiS, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2) {
        this.A01 = inAppPurchaseControllerCoro;
        this.A02 = list;
        this.A03 = list2;
        this.A00 = interfaceC65345TiS;
    }

    @Override // X.InterfaceC65314Thq
    public final void DbN(SYG syg, List list) {
        AbstractC167017dG.A1N(syg, list);
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A01;
        List list2 = this.A02;
        C14360o3.A0A(list2);
        InAppPurchaseControllerCoro.A06(syg, this.A00, inAppPurchaseControllerCoro, AbstractC001800i.A0S(list, list2), this.A03);
    }
}

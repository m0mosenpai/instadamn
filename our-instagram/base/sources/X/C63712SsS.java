package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;

/* renamed from: X.SsS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63712SsS implements InterfaceC65318Thu {
    public final /* synthetic */ SD8 A00;
    public final /* synthetic */ InterfaceC65597Tng A01;
    public final /* synthetic */ InterfaceC65345TiS A02;
    public final /* synthetic */ InAppPurchaseControllerCoro A03;
    public final /* synthetic */ List A04;

    public C63712SsS(SD8 sd8, InterfaceC65597Tng interfaceC65597Tng, InterfaceC65345TiS interfaceC65345TiS, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list) {
        this.A00 = sd8;
        this.A01 = interfaceC65597Tng;
        this.A03 = inAppPurchaseControllerCoro;
        this.A04 = list;
        this.A02 = interfaceC65345TiS;
    }

    @Override // X.InterfaceC65318Thu
    public final void Dmw(SYG syg, List list) {
        SD8 sd8;
        List list2 = list;
        C14360o3.A0B(syg, 0);
        if (syg.A00 == 0 && (sd8 = this.A00) != null) {
            this.A01.E7W(sd8, new C63713SsT(0, this.A04, this.A02, list2, this.A03), false);
            return;
        }
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A03;
        if (list == null) {
            list2 = C16930sl.A00;
        }
        InAppPurchaseControllerCoro.A07(syg, this.A02, inAppPurchaseControllerCoro, list2, this.A04);
    }
}

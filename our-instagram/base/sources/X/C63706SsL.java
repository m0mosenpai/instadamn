package X;

import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;

/* renamed from: X.SsL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63706SsL implements InterfaceC65314Thq {
    public final /* synthetic */ SAO A00;
    public final /* synthetic */ InterfaceC65597Tng A01;
    public final /* synthetic */ InterfaceC65345TiS A02;
    public final /* synthetic */ InAppPurchaseControllerCoro A03;
    public final /* synthetic */ List A04;

    public C63706SsL(SAO sao, InterfaceC65597Tng interfaceC65597Tng, InterfaceC65345TiS interfaceC65345TiS, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list) {
        this.A00 = sao;
        this.A01 = interfaceC65597Tng;
        this.A03 = inAppPurchaseControllerCoro;
        this.A04 = list;
        this.A02 = interfaceC65345TiS;
    }

    @Override // X.InterfaceC65314Thq
    public final void DbN(SYG syg, List list) {
        SAO sao;
        AbstractC167017dG.A1N(syg, list);
        if (syg.A00 == 0 && (sao = this.A00) != null) {
            this.A01.E7T(new C63705SsK(this.A02, this.A03, list, this.A04), sao, false);
        } else {
            InAppPurchaseControllerCoro.A06(syg, this.A02, this.A03, list, this.A04);
        }
    }
}

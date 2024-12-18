package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.Ovy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56138Ovy implements InterfaceC13000lm {
    public final InAppPurchaseControllerCoro A00;

    public final C42221xC A00(Context context, C51740MtP c51740MtP) {
        C14360o3.A0B(context, 0);
        return C42221xC.A06(new C48486Lcd(10, context, this, c51740MtP));
    }

    public final void A03(InterfaceC65345TiS interfaceC65345TiS, String str, List list, List list2) {
        this.A00.A0I(interfaceC65345TiS, str, list, list2);
    }

    @Deprecated(message = "Use queryDcpProductDetailsAsync instead. querySkuDetailsAsync is deprecated by Google since PBL v5.0. We now use queryDcpProductDetailsAsync to query product details from Google. We will remove this method in H2 2024.")
    public final void A04(InterfaceC65347TiU interfaceC65347TiU, List list, List list2) {
        this.A00.A0K(interfaceC65347TiU, list, list2);
    }

    public final void A01() {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        InAppPurchaseControllerCoro.A0C(inAppPurchaseControllerCoro);
        InterfaceC65597Tng interfaceC65597Tng = inAppPurchaseControllerCoro.A0B.A02;
        if (interfaceC65597Tng != null) {
            interfaceC65597Tng.AST();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        InAppPurchaseControllerCoro inAppPurchaseControllerCoro = this.A00;
        InAppPurchaseControllerCoro.A0C(inAppPurchaseControllerCoro);
        InterfaceC65597Tng interfaceC65597Tng = inAppPurchaseControllerCoro.A0B.A02;
        if (interfaceC65597Tng != null) {
            interfaceC65597Tng.AST();
        }
    }

    public C56138Ovy(InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        this.A00 = inAppPurchaseControllerCoro;
    }

    public final void A02(Activity activity, QIo qIo, InterfaceC65490TlB interfaceC65490TlB, SCO sco) {
        AbstractC167017dG.A1N(activity, qIo);
        this.A00.A0G(activity, qIo, interfaceC65490TlB, sco);
    }
}

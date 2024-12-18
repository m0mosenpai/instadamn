package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class REJ extends Q8X {
    public FBPayLoggerData A00;
    public InterfaceC65511Tlg A01;
    public String A02;
    public final C2GC A06;
    public final SMH A07;
    public final C58252li A04 = AbstractC58318PtA.A0I();
    public final C58252li A05 = AbstractC58318PtA.A0I();
    public boolean A03 = false;

    public static void A00(REJ rej) {
        rej.A03 = true;
        LinkedHashMap A08 = AbstractC58442PvL.A08(rej.A00);
        AbstractC58318PtA.A1X(A08);
        A08.put("target_name", "add_shoppay_cancel");
        A08.put("product", rej.A02);
        rej.A06.Chz("user_add_credential_exit", A08);
        InterfaceC65511Tlg interfaceC65511Tlg = rej.A01;
        if (interfaceC65511Tlg != null) {
            interfaceC65511Tlg.D1p();
        }
    }

    public REJ(C2GC c2gc, SMH smh) {
        this.A07 = smh;
        this.A06 = c2gc;
    }

    @Override // X.Q8X
    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A00 = AbstractC58320PtC.A0Z(bundle);
        this.A02 = AbstractC31173DnH.A0j(bundle, IgReactPurchaseExperienceBridgeModule.RN_PAYMENT_TYPE_KEY);
        SMH smh = this.A07;
        String A00 = this.A00.A00();
        A00.getClass();
        String str = this.A02;
        Q8J A002 = REU.A00(new C63549SpH(smh, str, A00, 1), smh.A02);
        C63627SqZ.A02(A002, this.A05, this, 41);
        C63627SqZ.A02(A002, this.A04, this, 42);
        C63627SqZ.A02(A002, super.A03, this, 43);
    }
}

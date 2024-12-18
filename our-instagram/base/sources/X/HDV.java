package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HDV extends AbstractC69784VvL {
    public final /* synthetic */ CheckoutLaunchParams A00;
    public final /* synthetic */ C1XE A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public HDV(CheckoutLaunchParams checkoutLaunchParams, C1XE c1xe, String str, String str2) {
        this.A01 = c1xe;
        this.A00 = checkoutLaunchParams;
        this.A03 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC69784VvL
    public final void A00() {
        HashMap A1G = AbstractC166987dD.A1G();
        CheckoutLaunchParams checkoutLaunchParams = this.A00;
        A1G.put("merchant_id", checkoutLaunchParams.A07);
        A1G.put("receiver_id", checkoutLaunchParams.A06);
        String str = this.A03;
        A1G.put("is_from_shopping_bag", new Boolean(str.equals("cart")).toString());
        A1G.put("is_from_drops_onboarding", new Boolean(checkoutLaunchParams.A0B).toString());
        A1G.put("products", this.A02);
        A1G.put("is_bloks", "true");
        A1G.put(CacheBehaviorLogger.SOURCE, str);
        C41579IaS c41579IaS = this.A01.A00;
        C19280xC A00 = C41579IaS.A00(c41579IaS, "cancel");
        A00.A0C("flow_step", "init_load");
        try {
            String A002 = AbstractC58317Pt9.A00(907);
            StringWriter A0O = AbstractC37300Gc1.A0O();
            C17z A0S = AbstractC167007dF.A0S(A0O);
            Iterator A14 = AbstractC166997dE.A14(A1G);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                String A17 = AbstractC31172DnG.A17(A1K);
                String str2 = (String) A1K.getValue();
                A0S.A0r(A17);
                if (str2 == null) {
                    A0S.A0b();
                } else {
                    A0S.A0u(str2);
                }
            }
            String A0l = AbstractC167017dG.A0l(A0S, A0O);
            C14360o3.A07(A0l);
            A00.A0C(A002, A0l);
        } catch (IOException unused) {
        }
        AbstractC31173DnH.A1S(A00, c41579IaS.A00);
    }
}

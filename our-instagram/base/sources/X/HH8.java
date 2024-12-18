package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class HH8 extends AbstractC60592pi {
    public C1338462s A00;
    public final JGV A01;
    public final UserSession A02;
    public final HH0 A03;

    public HH8(Context context, AbstractC018607g abstractC018607g, UserSession userSession, JGV jgv, Integer num, String str) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = jgv;
        this.A03 = new HH0(context, abstractC018607g, userSession, new C40966ICn(this), num, str);
    }

    public final void A00() {
        String str;
        HH0 hh0 = this.A03;
        HashMap A1G = AbstractC166987dD.A1G();
        String str2 = hh0.A05;
        if (str2 != null) {
            A1G.put("merchant_igid", str2);
        }
        switch (hh0.A04.intValue()) {
            case 1:
                str = "IG_SINGLE_MERCHANT_RECONSIDERATION";
                break;
            case 2:
                str = "IG_WISHLIST";
                break;
            default:
                str = "IG_MULTI_MERCHANT_RECONSIDERATION";
                break;
        }
        A1G.put("surface", str);
        C61972ry c61972ry = new C61972ry(hh0.A00, hh0.A01, null);
        AbstractC192798gL A06 = C192108fB.A06(hh0.A02, "com.bloks.www.minishops.ssh.data_signifier", A1G);
        A06.A00(new C38949HDb(hh0, 2));
        c61972ry.schedule(A06);
    }
}

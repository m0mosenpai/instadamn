package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.NrY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53844NrY {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        List list = c6fw.A00;
        if (list.size() == 0) {
            str = "";
        } else {
            str = (String) AbstractC166987dD.A16(list);
        }
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        FragmentActivity A042 = C6BQ.A04(c6fq);
        if (str == null) {
            str = "unknown";
        }
        AbstractC25230BEn.A15(1, A042, A04);
        C14360o3.A0B(A0W, 2);
        C71603Jf c71603Jf = new C71603Jf(A0W);
        C71167Wp2 c71167Wp2 = new C71167Wp2(A0W, c71603Jf, str);
        C193328hC A0H = AbstractC31171DnF.A0H(A042);
        AbstractC31173DnH.A15(A04, A0H, R.drawable.ig_illustrations_qp_moon_refresh);
        AbstractC31172DnG.A1C(A04, A0H, 2131971377);
        A0H.A09(2131971375);
        A0H.A0d(new DialogInterfaceOnClickListenerC55291OgC(A04, A042, A0W, c71603Jf, c71167Wp2, str, 2), AbstractC166997dE.A0p(A04, 2131971378));
        AbstractC31176DnK.A16(new DialogInterfaceOnClickListenerC55287Og2(A0W, c71603Jf, str, 3), A0H, 2131971376);
        C65761Ttc.A02(FDN.A00(AbstractC206099Aq.A00, A0W), c71603Jf.A03(0L), "ig_quiet_mode_upsell_enable_flow_dialog_shown", str);
        return null;
    }
}

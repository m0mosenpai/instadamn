package X;

import android.telephony.PhoneNumberUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.FbO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34991FbO {
    public static final C34991FbO A00 = new Object();

    public final void A00(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, C145726hV c145726hV, String str, String str2) {
        boolean A1Y = AbstractC25229BEm.A1Y(fragmentActivity);
        C64480TFq c64480TFq = new C64480TFq(userSession, c38321qM.CAR(), str2);
        c64480TFq.A02(AbstractC23451Ch.A07(fragmentActivity, "android.permission.CALL_PHONE"));
        if (c145726hV != null) {
            c145726hV.A01();
        }
        C50674MYs c50674MYs = new C50674MYs(fragmentActivity, userSession);
        String formatNumber = PhoneNumberUtils.formatNumber(AbstractC002300n.A0d(str, "tel:", "", A1Y), C1Q2.A02().getCountry());
        C14360o3.A07(formatNumber);
        c50674MYs.A0B(AbstractC31177DnL.A0b(fragmentActivity, formatNumber, 2131954463), new ViewOnClickListenerC63505SoY(fragmentActivity, c64480TFq, str, 2));
        c50674MYs.A03 = new C56406P2t(3, c145726hV, c64480TFq);
        C31727DwY.A00(fragmentActivity, c50674MYs);
        C64480TFq.A01(c64480TFq, AbstractC58317Pt9.A00(755));
    }
}

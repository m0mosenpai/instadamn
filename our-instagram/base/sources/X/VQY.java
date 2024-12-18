package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* loaded from: classes11.dex */
public abstract class VQY {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        Context requireContext = C6BQ.A00(C6BQ.A09(c6fq)).requireContext();
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        C1Y6 A00 = AbstractC69888VxF.A00();
        C1Y5 A002 = VRF.A00();
        String str = "";
        String str2 = "";
        String A0F = A0O.A0F();
        if (A0F != null) {
            str2 = A0F;
        }
        String str3 = "";
        String A0I = A0O.A0I();
        if (A0I != null) {
            str3 = A0I;
        }
        WEX A003 = A002.A00(requireContext, userSession, str2, str3);
        String str4 = "";
        String A0I2 = A0O.A0I();
        if (A0I2 != null) {
            str4 = A0I2;
        }
        A003.A0A = WEX.A02(str4);
        String A0F2 = A0O.A0F();
        if (A0F2 != null) {
            str = A0F2;
        }
        A003.A04 = new SimpleImageUrl(str);
        A003.A06 = A0O.A0E();
        A003.A05 = A0O.A0E();
        A003.A02 = PromoteLaunchOrigin.A07;
        A00.A0B(A003);
        return null;
    }
}

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.VQe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68422VQe {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        String str = "";
        String str2 = "";
        String A0I = A0O.A0I();
        if (A0I != null) {
            str2 = A0I;
        }
        String str3 = "";
        String A0G = A0O.A0G();
        if (A0G != null) {
            str3 = A0G;
        }
        Context requireContext = C6BQ.A00(C6BQ.A09(c6fq)).requireContext();
        C1Y6 A00 = AbstractC69888VxF.A00();
        WEX A002 = VRF.A00().A00(requireContext, (UserSession) C6BQ.A0B(c6fq), str2, str3);
        String A0I2 = A0O.A0I();
        if (A0I2 != null) {
            str = A0I2;
        }
        A002.A0A = WEX.A02(str);
        A002.A0C = "ctwa_afterparty_upsell".equals(str3);
        A00.A0B(A002);
        return null;
    }
}

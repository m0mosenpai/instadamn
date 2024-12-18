package X;

import androidx.fragment.app.Fragment;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.boost.model.BoostFlowType;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VQP {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        int i = 0;
        boolean z = false;
        C102884kP A0P = AbstractC65702TsY.A0P(c6fw, 0);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        Fragment A00 = C6BQ.A00(C6BQ.A09(c6fq));
        if (A0B instanceof UserSession) {
            String A0J = A0P.A0J();
            boolean A0S = A0P.A0S(42, false);
            if (A0J != null) {
                VEI[] values = VEI.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    VEI vei = values[i];
                    if (A0J.equals(vei.A01)) {
                        if (vei.A00 != null) {
                            z = true;
                        }
                    } else {
                        i++;
                    }
                }
            }
            C1Y5 A002 = VRF.A00();
            String str2 = "";
            String A0G = A0P.A0G();
            if (A0G != null) {
                str2 = A0G;
            }
            if (z && A0S) {
                str = "feed_ad4ad_express";
            } else {
                str = "feed_ad4ad";
            }
            WEX A003 = A002.A00(A00.requireContext(), (UserSession) C6BQ.A0B(c6fq), str2, str);
            A0P.A0L(38);
            A0P.A0L(40);
            if (A0P.A0E() != null) {
                A003.A07 = A0P.A0E();
            }
            if (C14360o3.A0K(A0J, "whatsapp_message")) {
                A003.A0C = true;
            } else if (C14360o3.A0K(A0J, DialogModule.KEY_MESSAGE)) {
                A003.A09 = "feed_ctd_ad4ad";
            }
            if (z) {
                if (A0J != null) {
                    VEI[] values2 = VEI.values();
                    int length2 = values2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        VEI vei2 = values2[i2];
                        if (A0J.equals(vei2.A01)) {
                            XIGIGBoostDestination xIGIGBoostDestination = vei2.A00;
                            if (xIGIGBoostDestination != null) {
                                A003.A00 = xIGIGBoostDestination;
                                A003.A01 = BoostFlowType.A04;
                            }
                        } else {
                            i2++;
                        }
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            AbstractC69888VxF.A00().A06(A00, A003, C6BQ.A08(c6fq));
            return null;
        }
        return null;
    }
}

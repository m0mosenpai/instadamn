package X;

import com.instagram.business.promote.model.LinkingAuthState;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VQ0 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Map map;
        LinkingAuthState linkingAuthState;
        XCO xco;
        String str;
        Object A00 = c6fw.A00();
        if ((A00 instanceof Map) && (map = (Map) A00) != null) {
            boolean A01 = C6DZ.A01(c6fw.A03(3));
            String str2 = (String) map.get("access_token");
            if (str2 == null) {
                str2 = "";
            }
            Object obj = map.get("access_token_type");
            Integer[] A002 = C05F.A00(3);
            int length = A002.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Integer num = A002[i];
                    switch (num.intValue()) {
                        case 1:
                            str = "facebook_access_token_pro2pro";
                            break;
                        case 2:
                            str = "business_user_access_token";
                            break;
                        default:
                            str = "facebook_access_token_cal";
                            break;
                    }
                    if (str.equals(obj)) {
                        int intValue = num.intValue();
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue == 2) {
                                    linkingAuthState = LinkingAuthState.A03;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                linkingAuthState = LinkingAuthState.A05;
                            }
                        } else {
                            linkingAuthState = LinkingAuthState.A04;
                        }
                    } else {
                        i++;
                    }
                } else {
                    linkingAuthState = null;
                }
            }
            C1UC A04 = C6BQ.A04(c6fq);
            if (A04 instanceof XCO) {
                xco = (XCO) A04;
            } else {
                xco = null;
            }
            if (linkingAuthState == null) {
                if (xco != null) {
                    xco.AV2();
                }
            } else if (xco != null) {
                xco.CJg(linkingAuthState, str2, A01);
                return null;
            }
        }
        return null;
    }
}

package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VQ2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0066. Please report as an issue. */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Map map;
        Integer num;
        XCO xco;
        Object obj;
        String str;
        LinkingAuthState linkingAuthState;
        XCO xco2;
        XCO xco3;
        String str2;
        Object A02 = c6fw.A02();
        if ((A02 instanceof String) && A02 != null) {
            Object A03 = c6fw.A03(2);
            if ((A03 instanceof Map) && (map = (Map) A03) != null) {
                Integer[] A00 = C05F.A00(15);
                int length = A00.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        num = A00[i];
                        switch (num.intValue()) {
                            case 1:
                                str2 = "pro2pro_fulcrum_disclosure_cancel";
                                break;
                            case 2:
                                str2 = "pro2pro_missing_viewer_context";
                                break;
                            case 3:
                                str2 = "pro2pro_igba_success";
                                break;
                            case 4:
                                str2 = "pro2pro_flow_can_promote_with_business_user";
                                break;
                            case 5:
                                str2 = "pro2pro_not_eligible_for_fulcrum_disclosure";
                                break;
                            case 6:
                                str2 = "pro2pro_pro_disclosure_cancel";
                                break;
                            case 7:
                                str2 = "pro2pro_not_eligible_for_pro_disclosure";
                                break;
                            case 8:
                                str2 = "pro2pro_pro_disclosure_promotion_payments";
                                break;
                            case 9:
                                str2 = "pro2pro_pro_disclosure_hardlink_success";
                                break;
                            case 10:
                                str2 = "pro2pro_pro_disclosure_hardlink_fail";
                                break;
                            case 11:
                                str2 = "promote_prevalidation_missing_bridge_to_promote_callsite";
                                break;
                            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                str2 = "promote_prevalidation_resolution_cancel";
                                break;
                            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                str2 = "promote_prevalidation_resolution_promotion_payments";
                                break;
                            case 14:
                                str2 = "promote_prevalidation_cal_fallback";
                                break;
                            default:
                                str2 = "unknown";
                                break;
                        }
                        if (!str2.equals(A02)) {
                            i++;
                        }
                    } else {
                        num = C05F.A00;
                    }
                }
                switch (num.intValue()) {
                    case 0:
                    case 1:
                    case 6:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        C6BQ.A04(c6fq).finish();
                        return null;
                    case 2:
                    case 5:
                        C1UC A04 = C6BQ.A04(c6fq);
                        if ((A04 instanceof XCO) && (xco = (XCO) A04) != null) {
                            PromoteActivity promoteActivity = (PromoteActivity) xco;
                            PromoteActivity.A09(promoteActivity, new C50259MHo(promoteActivity, 45));
                            break;
                        }
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 14:
                        C1UC A042 = C6BQ.A04(c6fq);
                        if ((A042 instanceof XCO) && (xco3 = (XCO) A042) != null) {
                            xco3.AV2();
                            return null;
                        }
                        break;
                    case 7:
                    case 10:
                        String str3 = (String) map.get("access_token");
                        if (str3 != null && str3.length() != 0 && (obj = map.get("access_token_type")) != null) {
                            for (Integer num2 : C05F.A00(3)) {
                                switch (num2.intValue()) {
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
                                    int intValue = num2.intValue();
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
                                    C1UC A043 = C6BQ.A04(c6fq);
                                    if ((A043 instanceof XCO) && (xco2 = (XCO) A043) != null) {
                                        xco2.CJg(linkingAuthState, str3, false);
                                        return null;
                                    }
                                }
                            }
                        }
                        C6BQ.A04(c6fq).finish();
                        return null;
                    case 8:
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        AbstractC31177DnL.A0w(null, new C68096VAq(), C6BQ.A04(c6fq), C6BQ.A0B(c6fq));
                        return null;
                    default:
                        throw new RuntimeException();
                }
            }
        }
        return null;
    }
}

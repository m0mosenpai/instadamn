package X;

import com.instagram.api.schemas.AudienceMessageEntityRangeImpl;
import com.instagram.api.schemas.AudienceValidationActionImpl;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.AudienceValidationResponseStatus;
import com.instagram.api.schemas.BoostedComponentMessageType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HkN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39751HkN {
    public static AudienceValidationResponse parseFromJson(C16L c16l) {
        String A00;
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            ArrayList arrayList2 = null;
            BoostedComponentMessageType boostedComponentMessageType = null;
            AudienceValidationResponseStatus audienceValidationResponseStatus = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(2718);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("available_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AudienceValidationActionImpl parseFromJson = AbstractC33663EuD.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("entity_ranges".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AudienceMessageEntityRangeImpl parseFromJson2 = AbstractC39750HkM.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    boostedComponentMessageType = (BoostedComponentMessageType) BoostedComponentMessageType.A01.get(A1P2);
                    if (boostedComponentMessageType == null) {
                        boostedComponentMessageType = BoostedComponentMessageType.A0A;
                    }
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    audienceValidationResponseStatus = (AudienceValidationResponseStatus) AudienceValidationResponseStatus.A01.get(A1P);
                    if (audienceValidationResponseStatus == null) {
                        audienceValidationResponseStatus = AudienceValidationResponseStatus.A05;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("display_message", c16l, "AudienceValidationResponse");
            } else if (boostedComponentMessageType != null || !(c16l instanceof C07950bF)) {
                if (audienceValidationResponseStatus == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, c16l, "AudienceValidationResponse");
                } else {
                    return new AudienceValidationResponse(audienceValidationResponseStatus, boostedComponentMessageType, str, str2, arrayList, arrayList2);
                }
            } else {
                AbstractC166997dE.A1V(A00, c16l, "AudienceValidationResponse");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

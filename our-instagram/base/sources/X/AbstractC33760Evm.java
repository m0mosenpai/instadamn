package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AdsTargetingGender;
import com.instagram.api.schemas.XFBIGBoostAudienceGeolocationImportance;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Evm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33760Evm {
    public static E6Z parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            String str = null;
            AdsTargetingGender adsTargetingGender = null;
            XFBIGBoostAudienceGeolocationImportance xFBIGBoostAudienceGeolocationImportance = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str2 = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audience_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("genders".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    adsTargetingGender = (AdsTargetingGender) AdsTargetingGender.A01.get(A1P2);
                    if (adsTargetingGender == null) {
                        adsTargetingGender = AdsTargetingGender.A07;
                    }
                } else if ("geolocation_importance".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    xFBIGBoostAudienceGeolocationImportance = (XFBIGBoostAudienceGeolocationImportance) XFBIGBoostAudienceGeolocationImportance.A01.get(A1P);
                    if (xFBIGBoostAudienceGeolocationImportance == null) {
                        xFBIGBoostAudienceGeolocationImportance = XFBIGBoostAudienceGeolocationImportance.A06;
                    }
                } else if ("geolocations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            E6R parseFromJson = AbstractC33764Evq.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("interests".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C50679MYx parseFromJson2 = AbstractC33660EuA.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("max_age".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("min_age".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(3186).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("audience_id", c16l, "UnifiedAudienceGenericResponsePayload");
            } else if (adsTargetingGender != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("geolocations", c16l, "UnifiedAudienceGenericResponsePayload");
                } else if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("interests", c16l, "UnifiedAudienceGenericResponsePayload");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("max_age", c16l, "UnifiedAudienceGenericResponsePayload");
                } else if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("min_age", c16l, "UnifiedAudienceGenericResponsePayload");
                } else {
                    return new E6Z(adsTargetingGender, xFBIGBoostAudienceGeolocationImportance, bool, str, str2, arrayList, arrayList2, num.intValue(), num2.intValue());
                }
            } else {
                AbstractC166997dE.A1V("genders", c16l, "UnifiedAudienceGenericResponsePayload");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

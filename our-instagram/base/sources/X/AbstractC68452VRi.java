package X;

import com.facebook.graphql.enums.EnumHelper;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.promote.model.AdsManagerBoostingStatusErrorCode;
import com.instagram.business.promote.model.AdsManagerPaymentAnomalyType;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VRi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68452VRi {
    public static C70654Wea parseFromJson(C16L c16l) {
        InstagramMediaProductType instagramMediaProductType;
        String A1P;
        AdsManagerBoostingStatusErrorCode adsManagerBoostingStatusErrorCode;
        C14360o3.A0B(c16l, 0);
        try {
            C70654Wea c70654Wea = new C70654Wea();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("ads_media_igid".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c70654Wea.A0C = A0m;
                } else if ("organic_media_igid".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c70654Wea.A0K = A0m2;
                } else if ("boosted_id".equals(A0s)) {
                    c70654Wea.A0F = AbstractC167017dG.A0m(c16l);
                } else if ("boosting_status".equals(A0s)) {
                    EnumC68195VFn enumC68195VFn = (EnumC68195VFn) EnumHelper.A00(c16l.A1Q(), EnumC68195VFn.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    C14360o3.A0B(enumC68195VFn, 0);
                    c70654Wea.A09 = enumC68195VFn;
                } else if ("boosting_status_error_code".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    AdsManagerBoostingStatusErrorCode[] values = AdsManagerBoostingStatusErrorCode.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            adsManagerBoostingStatusErrorCode = values[i];
                            String str = adsManagerBoostingStatusErrorCode.A00;
                            if (str != null && str.equalsIgnoreCase(A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            adsManagerBoostingStatusErrorCode = AdsManagerBoostingStatusErrorCode.A03;
                            break;
                        }
                    }
                    c70654Wea.A03 = adsManagerBoostingStatusErrorCode;
                } else if ("objective".equals(A0s)) {
                    c70654Wea.A02 = VPS.A00(AbstractC167017dG.A0m(c16l));
                } else if ("audience_name".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c70654Wea.A0E = A0m3;
                } else if (AbstractC111324zv.A00(945).equals(A0s)) {
                    c70654Wea.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("formatted_spent_budget".equals(A0s)) {
                    c70654Wea.A0H = AbstractC167017dG.A0m(c16l);
                } else if ("formatted_time_remaining".equals(A0s)) {
                    c70654Wea.A0I = AbstractC167017dG.A0m(c16l);
                } else if ("metric".equals(A0s)) {
                    PromotionMetric parseFromJson = AbstractC68451VRh.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c70654Wea.A06 = parseFromJson;
                } else if ("new_leads_count".equals(A0s)) {
                    c70654Wea.A00 = c16l.A1D();
                } else if ("thumbnail_url".equals(A0s)) {
                    SimpleImageUrl A00 = AbstractC222616c.A00(c16l);
                    C14360o3.A0B(A00, 0);
                    c70654Wea.A08 = A00;
                } else if ("cta_type".equals(A0s)) {
                    c70654Wea.A01 = XIGIGBoostCallToAction.valueOf(c16l.A1Q());
                } else if ("organic_media_fbid".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c70654Wea.A0J = A0m4;
                } else if ("appeal_status".equals(A0s)) {
                    c70654Wea.A0A = (EnumC68172VEq) EnumHelper.A00(c16l.A1Q(), EnumC68172VEq.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                } else if ("appeal_support_inbox_url".equals(A0s)) {
                    c70654Wea.A0D = AbstractC167017dG.A0m(c16l);
                } else if ("rejection_reason".equals(A0s)) {
                    c70654Wea.A07 = AbstractC68454VRk.parseFromJson(c16l);
                } else if ("page_id".equals(A0s)) {
                    String A0m5 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m5, 0);
                    c70654Wea.A0L = A0m5;
                } else if ("instagram_positions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            arrayList2.add(AbstractC68362VNw.A00(A1P));
                        }
                        arrayList = arrayList2;
                    }
                    C14360o3.A0B(arrayList, 0);
                    c70654Wea.A0N = arrayList;
                } else if ("media_product_type".equals(A0s)) {
                    String A1Q2 = c16l.A1Q();
                    InstagramMediaProductType[] values2 = InstagramMediaProductType.values();
                    int length2 = values2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            instagramMediaProductType = values2[i2];
                            if (AbstractC002300n.A0g(instagramMediaProductType.toString(), A1Q2, true)) {
                                break;
                            }
                            i2++;
                        } else {
                            instagramMediaProductType = InstagramMediaProductType.A08;
                            break;
                        }
                    }
                    c70654Wea.A05 = instagramMediaProductType;
                } else if ("ad_account_id".equals(A0s)) {
                    c70654Wea.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("audience_id".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("political_ad_byline_text".equals(A0s)) {
                    c70654Wea.A0M = AbstractC167017dG.A0m(c16l);
                } else {
                    if ("payment_anomaly_type".equals(A0s)) {
                        String A1Q3 = c16l.A1Q();
                        C14360o3.A0B(A1Q3, 0);
                        for (AdsManagerPaymentAnomalyType adsManagerPaymentAnomalyType : AdsManagerPaymentAnomalyType.values()) {
                            if (C14360o3.A0K(adsManagerPaymentAnomalyType.A00, A1Q3)) {
                                c70654Wea.A04 = adsManagerPaymentAnomalyType;
                            }
                        }
                        throw new IllegalArgumentException("can not parse payment anomaly type string from server");
                    }
                    if ("split_test_partner_promotions".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C70654Wea parseFromJson2 = parseFromJson(c16l);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        c70654Wea.A0O = arrayList;
                    }
                }
                c16l.A0z();
            }
            return c70654Wea;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

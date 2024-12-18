package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VOH {
    public static C66615UPc parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            BoostedActionStatus boostedActionStatus = null;
            String str = null;
            CallToActionType callToActionType = null;
            String str2 = null;
            Integer num = null;
            Integer num2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Integer num3 = null;
            UPA upa = null;
            ArrayList arrayList = null;
            String str6 = null;
            InstagramMediaProductType instagramMediaProductType = null;
            String str7 = null;
            AdproRegulatedCategory adproRegulatedCategory = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            Long l = null;
            Long l2 = null;
            String str8 = null;
            Integer num7 = null;
            String str9 = null;
            Integer num8 = null;
            Integer num9 = null;
            String str10 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("boosting_status".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P5 = null;
                    } else {
                        A1P5 = c16l.A1P();
                    }
                    boostedActionStatus = (BoostedActionStatus) BoostedActionStatus.A01.get(A1P5);
                    if (boostedActionStatus == null) {
                        boostedActionStatus = BoostedActionStatus.A0N;
                    }
                } else if ("cta_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cta_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    callToActionType = (CallToActionType) CallToActionType.A01.get(A1P4);
                    if (callToActionType == null) {
                        callToActionType = CallToActionType.A1z;
                    }
                } else if ("currency".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("currency_offset".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("daily_spend_offset_amount".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("display_audience_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("display_budget_and_duration_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("display_destination_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("elapsed_duration_in_days".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("error".equals(A0s)) {
                    upa = AbstractC40190HsA.parseFromJson(c16l);
                } else if ("instagram_positions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P3 = null;
                            } else {
                                A1P3 = c16l.A1P();
                            }
                            arrayList.add(AbstractC68362VNw.A00(A1P3));
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("media_fbid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("media_product_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    instagramMediaProductType = (InstagramMediaProductType) InstagramMediaProductType.A01.get(A1P2);
                    if (instagramMediaProductType == null) {
                        instagramMediaProductType = InstagramMediaProductType.A0r;
                    }
                } else if ("political_ads_byline_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("regulated_category".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    adproRegulatedCategory = (AdproRegulatedCategory) AdproRegulatedCategory.A01.get(A1P);
                    if (adproRegulatedCategory == null) {
                        adproRegulatedCategory = AdproRegulatedCategory.A0D;
                    }
                } else if ("remaining_budget_offset_amount".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("remaining_duration_in_days".equals(A0s)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if ("run_continuously".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("spent_budget_offset_amount".equals(A0s)) {
                    num6 = AbstractC166997dE.A0h(c16l);
                } else if (TraceFieldType.StartTime.equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("stop_time".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else if ("thumbnail_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("time_remaining_in_hours".equals(A0s)) {
                    num7 = AbstractC166997dE.A0h(c16l);
                } else if ("total_budget_formatted".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("total_budget_offset_amount".equals(A0s)) {
                    num8 = AbstractC166997dE.A0h(c16l);
                } else if ("total_duration_in_days".equals(A0s)) {
                    num9 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37310GcC.A00().equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("run_continuously", c16l, "FetchCampaignControlsResponse");
                throw C00O.createAndThrow();
            }
            return new C66615UPc(adproRegulatedCategory, boostedActionStatus, callToActionType, instagramMediaProductType, upa, num, num2, num3, num4, num5, num6, num7, num8, num9, l, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

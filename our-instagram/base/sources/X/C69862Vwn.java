package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.AdproObjectiveTypesEnum;
import com.instagram.api.schemas.AdproRegulatedCategory;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.CallToActionType;
import com.instagram.api.schemas.InstagramMediaProductType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vwn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69862Vwn {
    /* JADX WARN: Type inference failed for: r14v0, types: [X.Uya, X.1um, X.1ul] */
    public static C67801Uya parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("boosting_status".equals(A0s)) {
                    BoostedActionStatus boostedActionStatus = (BoostedActionStatus) BoostedActionStatus.A01.get(AbstractC167017dG.A0m(c16l));
                    if (boostedActionStatus == null) {
                        boostedActionStatus = BoostedActionStatus.A0N;
                    }
                    c40791um.A02 = boostedActionStatus;
                } else if ("cta_link".equals(A0s)) {
                    c40791um.A0J = AbstractC167017dG.A0m(c16l);
                } else if ("cta_type".equals(A0s)) {
                    CallToActionType callToActionType = (CallToActionType) CallToActionType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (callToActionType == null) {
                        callToActionType = CallToActionType.A1z;
                    }
                    c40791um.A03 = callToActionType;
                } else if ("currency".equals(A0s)) {
                    c40791um.A0K = AbstractC167017dG.A0m(c16l);
                } else if ("currency_offset".equals(A0s)) {
                    c40791um.A08 = AbstractC166997dE.A0h(c16l);
                } else if ("daily_spend_offset_amount".equals(A0s)) {
                    c40791um.A09 = AbstractC166997dE.A0h(c16l);
                } else if ("display_audience_subtitle".equals(A0s)) {
                    c40791um.A0L = AbstractC167017dG.A0m(c16l);
                } else if ("display_budget_and_duration_subtitle".equals(A0s)) {
                    c40791um.A0M = AbstractC167017dG.A0m(c16l);
                } else if ("display_destination_subtitle".equals(A0s)) {
                    c40791um.A0N = AbstractC167017dG.A0m(c16l);
                } else if ("elapsed_duration_in_days".equals(A0s)) {
                    c40791um.A0A = AbstractC166997dE.A0h(c16l);
                } else if ("error".equals(A0s)) {
                    c40791um.A06 = AbstractC40190HsA.parseFromJson(c16l);
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
                    c40791um.A0T = arrayList;
                } else if ("media_fbid".equals(A0s)) {
                    c40791um.A0O = AbstractC167017dG.A0m(c16l);
                } else if ("media_product_type".equals(A0s)) {
                    InstagramMediaProductType instagramMediaProductType = (InstagramMediaProductType) InstagramMediaProductType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (instagramMediaProductType == null) {
                        instagramMediaProductType = InstagramMediaProductType.A0r;
                    }
                    c40791um.A05 = instagramMediaProductType;
                } else if ("objective".equals(A0s)) {
                    AdproObjectiveTypesEnum adproObjectiveTypesEnum = (AdproObjectiveTypesEnum) AdproObjectiveTypesEnum.A01.get(AbstractC167017dG.A0m(c16l));
                    if (adproObjectiveTypesEnum == null) {
                        adproObjectiveTypesEnum = AdproObjectiveTypesEnum.A0o;
                    }
                    c40791um.A00 = adproObjectiveTypesEnum;
                } else if ("political_ads_byline_text".equals(A0s)) {
                    c40791um.A0P = AbstractC167017dG.A0m(c16l);
                } else if ("regulated_category".equals(A0s)) {
                    AdproRegulatedCategory adproRegulatedCategory = (AdproRegulatedCategory) AdproRegulatedCategory.A01.get(AbstractC167017dG.A0m(c16l));
                    if (adproRegulatedCategory == null) {
                        adproRegulatedCategory = AdproRegulatedCategory.A0D;
                    }
                    c40791um.A01 = adproRegulatedCategory;
                } else if ("remaining_budget_offset_amount".equals(A0s)) {
                    c40791um.A0B = AbstractC166997dE.A0h(c16l);
                } else if ("remaining_duration_in_days".equals(A0s)) {
                    c40791um.A0C = AbstractC166997dE.A0h(c16l);
                } else if ("run_continuously".equals(A0s)) {
                    c40791um.A07 = AbstractC166997dE.A0d(c16l);
                } else if ("spent_budget_offset_amount".equals(A0s)) {
                    c40791um.A0D = AbstractC166997dE.A0h(c16l);
                } else if (TraceFieldType.StartTime.equals(A0s)) {
                    c40791um.A0H = AbstractC31173DnH.A0h(c16l);
                } else if ("stop_time".equals(A0s)) {
                    c40791um.A0I = AbstractC31173DnH.A0h(c16l);
                } else if ("thumbnail_url".equals(A0s)) {
                    c40791um.A0Q = AbstractC167017dG.A0m(c16l);
                } else if ("time_remaining_in_hours".equals(A0s)) {
                    c40791um.A0E = AbstractC166997dE.A0h(c16l);
                } else if ("total_budget_formatted".equals(A0s)) {
                    c40791um.A0R = AbstractC167017dG.A0m(c16l);
                } else if ("total_budget_offset_amount".equals(A0s)) {
                    c40791um.A0F = AbstractC166997dE.A0h(c16l);
                } else if ("total_duration_in_days".equals(A0s)) {
                    c40791um.A0G = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37310GcC.A00().equals(A0s)) {
                    c40791um.A0S = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            BoostedActionStatus boostedActionStatus2 = c40791um.A02;
            String str = c40791um.A0J;
            CallToActionType callToActionType2 = c40791um.A03;
            String str2 = c40791um.A0K;
            Integer num = c40791um.A08;
            Integer num2 = c40791um.A09;
            String str3 = c40791um.A0L;
            String str4 = c40791um.A0M;
            String str5 = c40791um.A0N;
            Integer num3 = c40791um.A0A;
            UPA upa = c40791um.A06;
            List list = c40791um.A0T;
            String str6 = c40791um.A0O;
            InstagramMediaProductType instagramMediaProductType2 = c40791um.A05;
            AdproObjectiveTypesEnum adproObjectiveTypesEnum2 = c40791um.A00;
            String str7 = c40791um.A0P;
            AdproRegulatedCategory adproRegulatedCategory2 = c40791um.A01;
            Integer num4 = c40791um.A0B;
            Integer num5 = c40791um.A0C;
            Boolean bool = c40791um.A07;
            C14360o3.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            c40791um.A04 = new C66616UPd(adproObjectiveTypesEnum2, adproRegulatedCategory2, boostedActionStatus2, callToActionType2, instagramMediaProductType2, upa, num, num2, num3, num4, num5, c40791um.A0D, c40791um.A0E, c40791um.A0F, c40791um.A0G, c40791um.A0H, c40791um.A0I, str, str2, str3, str4, str5, str6, str7, c40791um.A0Q, c40791um.A0R, c40791um.A0S, list, booleanValue);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

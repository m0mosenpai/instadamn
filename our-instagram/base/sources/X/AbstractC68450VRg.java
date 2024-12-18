package X;

import com.instagram.api.schemas.PublisherPlatform;
import com.instagram.api.schemas.XFBCTXWelcomeMessageStatus;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.boost.model.AdCreativeAuthorizationCategory;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VRg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68450VRg {
    public static C69482Vo5 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            C69482Vo5 c69482Vo5 = new C69482Vo5();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("destination".equals(A0s)) {
                    c69482Vo5.A06 = VPS.A00(AbstractC167017dG.A0m(c16l));
                } else if ("call_to_action".equals(A0s)) {
                    c69482Vo5.A05 = XIGIGBoostCallToAction.valueOf(c16l.A1Q());
                } else if ("website_url".equals(A0s)) {
                    c69482Vo5.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("audience".equals(A0s)) {
                    c69482Vo5.A09 = AbstractC68447VRd.parseFromJson(c16l);
                } else if ("unified_audience".equals(A0s)) {
                    c69482Vo5.A03 = VPL.parseFromJson(c16l);
                } else if ("duration_in_days".equals(A0s)) {
                    c69482Vo5.A01 = c16l.A1D();
                } else if ("daily_budget_with_offset".equals(A0s)) {
                    c69482Vo5.A00 = c16l.A1D();
                } else if ("authorization_category".equals(A0s)) {
                    AdCreativeAuthorizationCategory adCreativeAuthorizationCategory = (AdCreativeAuthorizationCategory) AdCreativeAuthorizationCategory.A01.get(c16l.A1Q());
                    if (adCreativeAuthorizationCategory == null) {
                        adCreativeAuthorizationCategory = AdCreativeAuthorizationCategory.A04;
                    }
                    c69482Vo5.A07 = adCreativeAuthorizationCategory;
                } else if ("regulated_categories".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(AbstractC68456VRm.A00(c16l.A1Q()));
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c69482Vo5.A0H = arrayList;
                } else if ("instagram_positions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P3 = null;
                            } else {
                                A1P3 = c16l.A1P();
                            }
                            arrayList2.add(AbstractC68362VNw.A00(A1P3));
                        }
                        arrayList = arrayList2;
                    }
                    C14360o3.A0B(arrayList, 0);
                    c69482Vo5.A0G = arrayList;
                } else if ("reach_estimate".equals(A0s)) {
                    c69482Vo5.A02 = VOG.parseFromJson(c16l);
                } else if ("draft_id".equals(A0s)) {
                    c69482Vo5.A0B = AbstractC167017dG.A0m(c16l);
                } else if ("lead_gen_form_id".equals(A0s)) {
                    c69482Vo5.A0C = AbstractC167017dG.A0m(c16l);
                } else if ("lead_gen_form_name".equals(A0s)) {
                    c69482Vo5.A0D = AbstractC167017dG.A0m(c16l);
                } else if ("additional_publisher_platforms".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            PublisherPlatform publisherPlatform = (PublisherPlatform) PublisherPlatform.A01.get(A1P2);
                            if (publisherPlatform == null) {
                                publisherPlatform = PublisherPlatform.A05;
                            }
                            arrayList3.add(publisherPlatform);
                        }
                        arrayList = arrayList3;
                    }
                    C14360o3.A0B(arrayList, 0);
                    c69482Vo5.A0F = arrayList;
                } else if ("messaging_destinations".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            arrayList4.add(VPS.A00(A1P));
                        }
                        arrayList = arrayList4;
                    }
                    C14360o3.A0B(arrayList, 0);
                    c69482Vo5.A0I = arrayList;
                } else if ("ctx_welcome_message_status".equals(A0s)) {
                    XFBCTXWelcomeMessageStatus xFBCTXWelcomeMessageStatus = (XFBCTXWelcomeMessageStatus) XFBCTXWelcomeMessageStatus.A01.get(AbstractC167017dG.A0m(c16l));
                    if (xFBCTXWelcomeMessageStatus == null) {
                        xFBCTXWelcomeMessageStatus = XFBCTXWelcomeMessageStatus.A06;
                    }
                    c69482Vo5.A04 = xFBCTXWelcomeMessageStatus;
                } else if ("selected_audio_name".equals(A0s)) {
                    c69482Vo5.A0E = AbstractC167017dG.A0m(c16l);
                } else if ("boost_packages".equals(A0s)) {
                    c69482Vo5.A08 = AbstractC68445VRb.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69482Vo5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}

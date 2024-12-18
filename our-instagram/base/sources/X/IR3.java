package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetail;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IR3 {
    public static C38813H7d parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            C38815H7f c38815H7f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("rich_destination".equals(A0s)) {
                    c38815H7f = I32.parseFromJson(c16l);
                } else if ("rich_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("rich_text", c16l, "DeepLinkText");
                throw C00O.createAndThrow();
            }
            return new C38813H7d(c38815H7f, str2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38813H7d c38813H7d) {
        anonymousClass182.A0d();
        String str = c38813H7d.A01;
        if (str != null) {
            anonymousClass182.A0S("destination", str);
        }
        C38815H7f c38815H7f = c38813H7d.A00;
        if (c38815H7f != null) {
            anonymousClass182.A0r("rich_destination");
            anonymousClass182.A0d();
            C38814H7e c38814H7e = c38815H7f.A00;
            if (c38814H7e != null) {
                anonymousClass182.A0r("incentive");
                anonymousClass182.A0d();
                IgFundedIncentive igFundedIncentive = c38814H7e.A00;
                if (igFundedIncentive != null) {
                    anonymousClass182.A0r("incentive_details");
                    anonymousClass182.A0d();
                    IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = igFundedIncentive.A02;
                    if (igFundedIncentiveBannerIconType != null) {
                        anonymousClass182.A0S("banner_icon", igFundedIncentiveBannerIconType.A00);
                    }
                    Integer num = igFundedIncentive.A04;
                    if (num != null) {
                        anonymousClass182.A0Q("countdown_expiration_time", num.intValue());
                    }
                    Integer num2 = igFundedIncentive.A05;
                    if (num2 != null) {
                        anonymousClass182.A0Q("countdown_grace_period", num2.intValue());
                    }
                    String str2 = igFundedIncentive.A06;
                    if (str2 != null) {
                        anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str2);
                    }
                    List list = igFundedIncentive.A0B;
                    if (list != null) {
                        Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "details", list);
                        while (A0q.hasNext()) {
                            IgFundedIncentiveDetail igFundedIncentiveDetail = (IgFundedIncentiveDetail) A0q.next();
                            if (igFundedIncentiveDetail != null) {
                                IgFundedIncentiveDetailImpl F68 = igFundedIncentiveDetail.F68();
                                anonymousClass182.A0d();
                                String str3 = F68.A00;
                                if (str3 != null) {
                                    anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str3);
                                }
                                String str4 = F68.A01;
                                if (str4 != null) {
                                    anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4);
                                }
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = igFundedIncentive.A00;
                    if (igFundedIncentiveBannerButton != null) {
                        anonymousClass182.A0r("first_button");
                        IRB.A00(anonymousClass182, igFundedIncentiveBannerButton);
                    }
                    anonymousClass182.A0T("has_line_break", igFundedIncentive.A0C);
                    String str5 = igFundedIncentive.A07;
                    if (str5 != null) {
                        anonymousClass182.A0S("incentive_id", str5);
                    }
                    anonymousClass182.A0T("is_navigated_from_bottom_sheet", igFundedIncentive.A0D);
                    String str6 = igFundedIncentive.A08;
                    if (str6 != null) {
                        anonymousClass182.A0S("nux_dialog_subtitle", str6);
                    }
                    String str7 = igFundedIncentive.A09;
                    if (str7 != null) {
                        anonymousClass182.A0S("nux_dialog_title", str7);
                    }
                    IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle = igFundedIncentive.A03;
                    if (igFundedIncentiveNuxDisplayStyle != null) {
                        anonymousClass182.A0S("nux_display_style", igFundedIncentiveNuxDisplayStyle.A00);
                    }
                    IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2 = igFundedIncentive.A01;
                    if (igFundedIncentiveBannerButton2 != null) {
                        anonymousClass182.A0r("second_button");
                        IRB.A00(anonymousClass182, igFundedIncentiveBannerButton2);
                    }
                    anonymousClass182.A0T("should_show_shop_eligible_items_button", igFundedIncentive.A0E);
                    AbstractC37301Gc2.A1F(anonymousClass182, igFundedIncentive.A0A);
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        String str8 = c38813H7d.A02;
        if (str8 != null) {
            anonymousClass182.A0S("rich_text", str8);
        }
        anonymousClass182.A0a();
    }
}

package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerIconType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveDetailImpl;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveNuxDisplayStyle;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I3d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40723I3d {
    public static IgFundedIncentive parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            IgFundedIncentiveBannerIconType igFundedIncentiveBannerIconType = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            ArrayList arrayList = null;
            IgFundedIncentiveBannerButton igFundedIncentiveBannerButton = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            IgFundedIncentiveNuxDisplayStyle igFundedIncentiveNuxDisplayStyle = null;
            IgFundedIncentiveBannerButton igFundedIncentiveBannerButton2 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("banner_icon".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    igFundedIncentiveBannerIconType = (IgFundedIncentiveBannerIconType) IgFundedIncentiveBannerIconType.A01.get(A1P2);
                    if (igFundedIncentiveBannerIconType == null) {
                        igFundedIncentiveBannerIconType = IgFundedIncentiveBannerIconType.A05;
                    }
                } else if ("countdown_expiration_time".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("countdown_grace_period".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("details".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            IgFundedIncentiveDetailImpl parseFromJson = AbstractC40721I3b.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("first_button".equals(A0s)) {
                    igFundedIncentiveBannerButton = IRB.parseFromJson(c16l);
                } else if ("has_line_break".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("incentive_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_navigated_from_bottom_sheet".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("nux_dialog_subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("nux_dialog_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("nux_display_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    igFundedIncentiveNuxDisplayStyle = (IgFundedIncentiveNuxDisplayStyle) IgFundedIncentiveNuxDisplayStyle.A01.get(A1P);
                    if (igFundedIncentiveNuxDisplayStyle == null) {
                        igFundedIncentiveNuxDisplayStyle = IgFundedIncentiveNuxDisplayStyle.A05;
                    }
                } else if ("second_button".equals(A0s)) {
                    igFundedIncentiveBannerButton2 = IRB.parseFromJson(c16l);
                } else if ("should_show_shop_eligible_items_button".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(DevServerEntity.COLUMN_DESCRIPTION, c16l, "IgFundedIncentive");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("incentive_id", c16l, "IgFundedIncentive");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_navigated_from_bottom_sheet", c16l, "IgFundedIncentive");
                } else if (igFundedIncentiveNuxDisplayStyle == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("nux_display_style", c16l, "IgFundedIncentive");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("should_show_shop_eligible_items_button", c16l, "IgFundedIncentive");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "IgFundedIncentive");
                } else {
                    return new IgFundedIncentive(igFundedIncentiveBannerButton, igFundedIncentiveBannerButton2, igFundedIncentiveBannerIconType, igFundedIncentiveNuxDisplayStyle, num, num2, str, str2, str3, str4, str5, arrayList, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_line_break", c16l, "IgFundedIncentive");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}

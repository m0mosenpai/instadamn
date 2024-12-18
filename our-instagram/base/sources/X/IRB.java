package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButton;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveBannerButtonStyleType;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentiveButtonDestinationType;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IRB {
    public static IgFundedIncentiveBannerButton parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType = null;
            IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    igFundedIncentiveButtonDestinationType = (IgFundedIncentiveButtonDestinationType) IgFundedIncentiveButtonDestinationType.A01.get(A1P2);
                    if (igFundedIncentiveButtonDestinationType == null) {
                        igFundedIncentiveButtonDestinationType = IgFundedIncentiveButtonDestinationType.A05;
                    }
                } else if ("style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    igFundedIncentiveBannerButtonStyleType = (IgFundedIncentiveBannerButtonStyleType) IgFundedIncentiveBannerButtonStyleType.A01.get(A1P);
                    if (igFundedIncentiveBannerButtonStyleType == null) {
                        igFundedIncentiveBannerButtonStyleType = IgFundedIncentiveBannerButtonStyleType.A06;
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (igFundedIncentiveButtonDestinationType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("destination", c16l, "IgFundedIncentiveBannerButton");
            } else if (igFundedIncentiveBannerButtonStyleType != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("text", c16l, "IgFundedIncentiveBannerButton");
                } else {
                    return new IgFundedIncentiveBannerButton(igFundedIncentiveBannerButtonStyleType, igFundedIncentiveButtonDestinationType, str);
                }
            } else {
                AbstractC166997dE.A1V("style", c16l, "IgFundedIncentiveBannerButton");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, IgFundedIncentiveBannerButton igFundedIncentiveBannerButton) {
        anonymousClass182.A0d();
        IgFundedIncentiveButtonDestinationType igFundedIncentiveButtonDestinationType = igFundedIncentiveBannerButton.A01;
        if (igFundedIncentiveButtonDestinationType != null) {
            anonymousClass182.A0S("destination", igFundedIncentiveButtonDestinationType.A00);
        }
        IgFundedIncentiveBannerButtonStyleType igFundedIncentiveBannerButtonStyleType = igFundedIncentiveBannerButton.A00;
        if (igFundedIncentiveBannerButtonStyleType != null) {
            anonymousClass182.A0S("style", igFundedIncentiveBannerButtonStyleType.A00);
        }
        AbstractC37301Gc2.A1E(anonymousClass182, igFundedIncentiveBannerButton.A02);
        anonymousClass182.A0a();
    }
}

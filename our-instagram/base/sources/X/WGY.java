package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.DestinationRecommendationReason;
import com.instagram.api.schemas.LinkStickerType;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WGY {
    public static final WGY A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.api.schemas.XIGIGBoostDestination A00(com.instagram.business.promote.model.PromoteData r3) {
        /*
            java.util.List r0 = r3.A20
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto Ld
        Lc:
            r0 = 1
        Ld:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L1b
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r3.A0j
            if (r0 != 0) goto L34
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L1b:
            java.util.List r0 = r3.A20
            if (r0 == 0) goto L28
            int r0 = r0.size()
            if (r0 <= r2) goto L28
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.A08
            return r0
        L28:
            java.util.List r0 = r3.A20
            if (r0 == 0) goto L35
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            com.instagram.api.schemas.XIGIGBoostDestination r0 = (com.instagram.api.schemas.XIGIGBoostDestination) r0
            if (r0 == 0) goto L35
        L34:
            return r0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WGY.A00(com.instagram.business.promote.model.PromoteData):com.instagram.api.schemas.XIGIGBoostDestination");
    }

    public static final void A01(FragmentActivity fragmentActivity, PromoteData promoteData, C66359UCf c66359UCf) {
        UserSession userSession = promoteData.A0y;
        C14360o3.A06(userSession);
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A002, A002.A40, C23031Ai.A8c, 113) && WGQ.A04(promoteData)) {
            c66359UCf.post(new RunnableC71565WwF(fragmentActivity, c66359UCf, A002));
        }
    }

    public static final void A03(PromoteData promoteData) {
        XIGIGBoostCallToAction xIGIGBoostCallToAction;
        XIGIGBoostCallToAction xIGIGBoostCallToAction2;
        XIGIGBoostCallToAction xIGIGBoostCallToAction3;
        XIGIGBoostDestination xIGIGBoostDestination = promoteData.A0j;
        XIGIGBoostDestination xIGIGBoostDestination2 = XIGIGBoostDestination.A04;
        if (xIGIGBoostDestination == xIGIGBoostDestination2 && promoteData.A0e == null && promoteData.A2C) {
            xIGIGBoostCallToAction2 = XIGIGBoostCallToAction.A0U;
        } else {
            if (!promoteData.A2q && promoteData.A0e == null) {
                if (xIGIGBoostDestination != XIGIGBoostDestination.A08 && xIGIGBoostDestination != XIGIGBoostDestination.A0G) {
                    xIGIGBoostCallToAction3 = XIGIGBoostCallToAction.A0J;
                } else {
                    xIGIGBoostCallToAction3 = XIGIGBoostCallToAction.A0W;
                }
                promoteData.A0e = xIGIGBoostCallToAction3;
            }
            if ((xIGIGBoostDestination == XIGIGBoostDestination.A08 || xIGIGBoostDestination == XIGIGBoostDestination.A0G) && ((xIGIGBoostCallToAction = promoteData.A0e) == XIGIGBoostCallToAction.A0J || xIGIGBoostCallToAction == XIGIGBoostCallToAction.A0U)) {
                xIGIGBoostCallToAction2 = XIGIGBoostCallToAction.A0W;
            } else {
                if (xIGIGBoostDestination != xIGIGBoostDestination2) {
                    return;
                }
                XIGIGBoostCallToAction xIGIGBoostCallToAction4 = promoteData.A0e;
                if (xIGIGBoostCallToAction4 != XIGIGBoostCallToAction.A0W && xIGIGBoostCallToAction4 != XIGIGBoostCallToAction.A0C) {
                    return;
                } else {
                    xIGIGBoostCallToAction2 = XIGIGBoostCallToAction.A0J;
                }
            }
        }
        promoteData.A0e = xIGIGBoostCallToAction2;
    }

    public static final boolean A04(PromoteData promoteData) {
        String str = promoteData.A1K;
        if (!str.equals("messaging_hub") && !str.equals("ad_tools_ctd_aymt") && !str.equals("direct_ctd_aymt") && !str.equals("feed_ctd_ad4ad") && !str.equals("ctd_top_post_upsell_notification") && !str.equals(VG4.A0Z.toString()) && !promoteData.A2i) {
            String str2 = promoteData.A1Y;
            if (str2 != null && promoteData.A1K.equals("aymt_dropoff") && str2.equals("aymt_ctd_dropoff")) {
                C70399WUb.A00(promoteData.A0y).A0L(VG4.A17, "messaging_recommendation_subtitle", XIGIGBoostDestination.A04.toString(), "aymt_ctd_dropoff");
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A05(PromoteData promoteData) {
        LinkStickerType linkStickerType;
        if (!promoteData.A2h && !promoteData.A1K.equals("messaging_hub_ctwa")) {
            XFK xfk = promoteData.A0V;
            if (xfk != null) {
                linkStickerType = ((UR2) xfk).A00;
            } else {
                linkStickerType = null;
            }
            if (linkStickerType != LinkStickerType.A06 || !C97F.A04(promoteData)) {
                if (promoteData.A1Y != null && C97F.A04(promoteData) && C14360o3.A0K(promoteData.A1K, "aymt_dropoff") && C14360o3.A0K(promoteData.A1Y, "aymt_ctwa_dropoff")) {
                    C70399WUb.A00(promoteData.A0y).A0L(VG4.A17, "messaging_recommendation_subtitle", XIGIGBoostDestination.A0G.toString(), "aymt_ctwa_dropoff");
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean A06(PromoteData promoteData) {
        return AbstractC001800i.A0u(AbstractC16960so.A1Q(DestinationRecommendationReason.A0G, DestinationRecommendationReason.A0F, DestinationRecommendationReason.A0A, DestinationRecommendationReason.A0C, DestinationRecommendationReason.A0E, DestinationRecommendationReason.A0J, DestinationRecommendationReason.A0I), promoteData.A0S);
    }

    public static final boolean A07(PromoteData promoteData) {
        return AbstractC001800i.A0u(AbstractC16960so.A1Q(DestinationRecommendationReason.A07, DestinationRecommendationReason.A06, DestinationRecommendationReason.A08, DestinationRecommendationReason.A0L, DestinationRecommendationReason.A0C, DestinationRecommendationReason.A0E, DestinationRecommendationReason.A0I), promoteData.A0S);
    }

    public static final void A02(FragmentActivity fragmentActivity, PromoteData promoteData, C66359UCf c66359UCf, UserSession userSession) {
        if (A06(promoteData) || A07(promoteData) || promoteData.A2i) {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A05, userSession, 36323186962345026L)) {
                c66359UCf.setRecommendedTextV2(fragmentActivity, userSession, true, false, null);
            } else {
                c66359UCf.setRecommendedText(2131970541);
            }
            if (A06(promoteData) || A07(promoteData)) {
                C70399WUb.A00(userSession).A0L(VG4.A17, "messaging_recommendation_subtitle", String.valueOf(promoteData.A0h), String.valueOf(promoteData.A0S));
            }
        }
    }
}

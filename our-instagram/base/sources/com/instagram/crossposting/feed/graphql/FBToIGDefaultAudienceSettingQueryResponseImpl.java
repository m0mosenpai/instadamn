package com.instagram.crossposting.feed.graphql;

import X.C126895oT;
import X.C2JS;
import X.C2JT;
import X.C4OK;
import X.C4OM;
import X.C4OU;
import X.C4OW;
import X.C94754Oe;
import X.C95124Py;

/* loaded from: classes3.dex */
public final class FBToIGDefaultAudienceSettingQueryResponseImpl extends C2JS implements C2JT {

    /* loaded from: classes3.dex */
    public final class XcxpGetFeedCrosspostingDefaultAudienceStatus extends C2JS implements C2JT {
        @Override // X.C2JS
        public final C4OU modelSelectionSet() {
            C95124Py c95124Py = C95124Py.A00;
            C126895oT c126895oT = new C126895oT(new C4OW(c95124Py, "is_ig_user_opt_in_default_audience"), "is_opt_in_default_audience");
            C94754Oe c94754Oe = C94754Oe.A00;
            return new C4OU(new C4OM[]{c126895oT, new C126895oT(new C4OW(c94754Oe, "current_phase"), "enable_default_audience_migration"), new C126895oT(new C4OW(c94754Oe, "fb_feed_audience"), "enable_default_audience_migration"), new C126895oT(new C4OW(c94754Oe, "consent_accept_deadline"), "enable_default_audience_migration"), new C126895oT(new C4OW(c95124Py, "is_old_crossposter"), "is_opt_in_default_audience"), new C126895oT(new C4OW(c94754Oe, "audience_cohort"), "is_opt_in_default_audience")});
        }

        public XcxpGetFeedCrosspostingDefaultAudienceStatus() {
            super(-1843243575);
        }
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        return new C4OU(new C4OM[]{new C4OK(XcxpGetFeedCrosspostingDefaultAudienceStatus.class, "xcxp_get_feed_crossposting_default_audience_status", -1843243575)});
    }

    public FBToIGDefaultAudienceSettingQueryResponseImpl() {
        super(1537164479);
    }
}

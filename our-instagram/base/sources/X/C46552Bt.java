package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46552Bt {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final InterfaceC19630xq A04;
    public final UserSession A05;

    public final int A00() {
        InterfaceC19630xq interfaceC19630xq = this.A04;
        if (interfaceC19630xq.getLong("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_COMMENT_DISCLOSURE_VERSION", 0L) < 1) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7G("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_COMMENT_DISCLOSURE_VERSION", 1L);
            ARD.E7D("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", 0);
            ARD.apply();
        }
        return interfaceC19630xq.getInt("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_CONSUMPTION_DISCLOSURE_IMPRESSION_COUNT", 0);
    }

    public final void A01(int i) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E7D("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_VIEW_COUNT", i);
        ARD.apply();
    }

    public final void A02(long j) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E7G("PREFERENCE_CROSSPOST_TO_FACEBOOK_UPSELL_LAST_SEEN_TIME_MS", j);
        ARD.apply();
    }

    public final void A03(long j) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E7G("PREFERENCE_REELS_XAR_UPSELL_LAST_SEEN_MS", j);
        ARD.apply();
    }

    public final void A04(boolean z) {
        if (!z && !A0D(this.A02)) {
            InterfaceC19610xo ARD = this.A04.ARD();
            ARD.E7G("PREFERENCE_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", System.currentTimeMillis() / 1000);
            ARD.apply();
        }
        this.A02 = System.currentTimeMillis();
    }

    public final void A05(boolean z) {
        if (!z && !A0D(this.A03)) {
            InterfaceC19610xo ARD = this.A04.ARD();
            ARD.E7G("PREFERENCE_STORY_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", System.currentTimeMillis() / 1000);
            ARD.apply();
        }
        this.A03 = System.currentTimeMillis();
    }

    public final void A06(boolean z) {
        InterfaceC19630xq interfaceC19630xq = this.A04;
        if (z != interfaceC19630xq.getBoolean("PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING", false)) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E77("PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING", z);
            ARD.E7G("PREFERENCE_CREATOR_REELS_BPL_AUTO_XPOSTING_LAST_CHANGED_MS", System.currentTimeMillis());
            ARD.apply();
        }
    }

    public final void A07(boolean z) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E77("PREFERENCE_HAS_SEEN_SHARE_TO_FACEBOOK_TOOLTIP_ON_PANAVISION_M15", z);
        ARD.apply();
    }

    public final void A08(boolean z) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E77("PREFERENCE_REELS_HAS_SHOWN_CROSS_POST_TO_FACEBOOK_TOOLTIP", z);
        ARD.apply();
    }

    public final void A09(boolean z) {
        InterfaceC19630xq interfaceC19630xq = this.A04;
        if (z != interfaceC19630xq.getBoolean("PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED", false)) {
            interfaceC19630xq.getBoolean("PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED", false);
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E77("PREFERENCE_REELS_IS_AUTO_CROSS_POST_TO_FACEBOOK_ENABLED", z);
            ARD.E7G("PREFERENCE_AUTO_CROSS_POST_TO_FACEBOOK_REELS_LAST_CHANGED_MS", System.currentTimeMillis());
            ARD.apply();
            if (!z && !A0D(this.A00)) {
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G("PREFERENCE_REEL_CROSSPOST_SETTING_LAST_DISABLED_SECONDS", System.currentTimeMillis() / 1000);
                ARD2.apply();
            }
            this.A00 = System.currentTimeMillis();
        }
    }

    public final void A0A(boolean z) {
        if (!z) {
            InterfaceC19610xo ARD = this.A04.ARD();
            ARD.E7D("PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_ENABLED_CONSECUTIVE_SHARE_COUNT", 0);
            ARD.apply();
        }
        InterfaceC19630xq interfaceC19630xq = this.A04;
        if (z != interfaceC19630xq.getBoolean("PREFERENCE_REELS_IS_AUTO_RECOMMEND_ON_FACEBOOK_ENABLED", false)) {
            boolean z2 = interfaceC19630xq.getBoolean("PREFERENCE_REELS_IS_AUTO_RECOMMEND_ON_FACEBOOK_ENABLED", false);
            InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
            ARD2.E77("PREFERENCE_REELS_IS_AUTO_RECOMMEND_ON_FACEBOOK_ENABLED", z);
            ARD2.E7G("PREFERENCE_REELS_AUTO_RECOMMEND_ON_FACEBOOK_LAST_CHANGED_MS", System.currentTimeMillis());
            ARD2.apply();
            if (z2 && !z) {
                InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
                ARD3.E7G("PREFERENCE_REEL_RECOMMEND_SETTING_LAST_DISABLED_SECONDS", System.currentTimeMillis() / 1000);
                ARD3.apply();
            }
        }
    }

    public final void A0B(boolean z) {
        InterfaceC19610xo ARD = this.A04.ARD();
        ARD.E77("PREFERENCE_REELS_SHOULD_SHOW_RECOMMEND_ON_FACEBOOK_CREATION_PRIMER", z);
        ARD.apply();
    }

    public final boolean A0C() {
        InterfaceC19630xq interfaceC19630xq = this.A04;
        if (!interfaceC19630xq.getBoolean("PREFERENCE_IS_REELS_XAR_UNAVAILABLE", false) && interfaceC19630xq.getBoolean("PREFERENCE_REELS_IS_AUTO_RECOMMEND_ON_FACEBOOK_ENABLED", false)) {
            return true;
        }
        return false;
    }

    public final boolean A0D(long j) {
        if (System.currentTimeMillis() >= j + (C18U.A01(C06090Tz.A05, this.A05, 36599855870906002L) * 1000)) {
            return false;
        }
        return true;
    }

    public C46552Bt(UserSession userSession) {
        this.A05 = userSession;
        this.A04 = C1AT.A01(userSession).A04(C1AV.A10, getClass());
    }
}

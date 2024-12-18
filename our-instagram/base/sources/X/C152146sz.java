package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.6sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152146sz implements InterfaceC13000lm, CallerContextable {
    public static final String __redex_internal_original_name = "FxAcProfilePictureEligibility";
    public boolean A00;
    public final UserSession A01;

    public C152146sz(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A01;
        boolean A0B = AbstractC149576oA.A00(userSession).A0B(userSession, "IG_PROFILE_PHOTO_CHANGE_CHAINING", true);
        C06090Tz c06090Tz = C06090Tz.A06;
        if (!C18U.A06(c06090Tz, userSession, 36316057316757426L)) {
            if (!C18U.A06(c06090Tz, userSession, 36319716628897376L) && C18U.A06(c06090Tz, userSession, 36316057316691889L)) {
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if (!C18U.A06(c06090Tz2, userSession, 36314395164281377L)) {
                    boolean A06 = C18U.A06(c06090Tz2, userSession, 36319716629552746L);
                    boolean z = AbstractC23021Ah.A00(userSession).A01.getBoolean("fx_cal_profile_photo_chaining_ac_upsell_seen", false);
                    if (A06) {
                        if (z || this.A00) {
                            MWX mwx = new MWX(userSession);
                            if (!mwx.A02("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                                mwx.A01("IG_PROFILE_PHOTO_CHANGE_CHAINING");
                                mwx.A00("IG_PROFILE_PHOTO_CHANGE_CHAINING");
                                return false;
                            }
                            return false;
                        }
                    } else if (z) {
                        return false;
                    }
                }
            }
            if (AbstractC49092Nc.A00(userSession).A00(CallerContext.A00(C152146sz.class), "ig_android_linking_cache_fx_ac_eligibility_linkage_check") || !A0B) {
                return false;
            }
            return C18U.A06(C06090Tz.A05, userSession, 36316057316626352L);
        }
        return false;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C152146sz.class);
    }
}

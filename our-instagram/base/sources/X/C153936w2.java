package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6w2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153936w2 {
    public final UserSession A00;
    public final C18920wW A01;
    public final String A02;

    public static final C38541Gx2 A03(Boolean bool, String str) {
        return A00(null, null, null, null, null, bool, null, null, null, null, null, null, null, null, str, null);
    }

    public static final void A05(C153936w2 c153936w2, String str, String str2, String str3) {
        A04(null, c153936w2, str, str2, str3, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Zx, X.Gx2] */
    public static final C38541Gx2 A00(EnumC37319GcL enumC37319GcL, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, List list) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        ?? c0Zx = new C0Zx();
        c0Zx.A06("trial_status", str);
        c0Zx.A06("notification_type", str2);
        c0Zx.A01(enumC37319GcL, "notification_channel");
        c0Zx.A03("is_auto_open", bool);
        c0Zx.A07("override_conflicting_settings", list);
        c0Zx.A03("is_opened_with_toggle", bool2);
        Long l6 = null;
        if (num != null) {
            l = Long.valueOf(num.intValue());
        } else {
            l = null;
        }
        c0Zx.A05("views_count", l);
        if (num2 != null) {
            l2 = Long.valueOf(num2.intValue());
        } else {
            l2 = null;
        }
        c0Zx.A05("likes_count", l2);
        if (num3 != null) {
            l3 = Long.valueOf(num3.intValue());
        } else {
            l3 = null;
        }
        c0Zx.A05("comments_count", l3);
        if (num4 != null) {
            l4 = Long.valueOf(num4.intValue());
        } else {
            l4 = null;
        }
        c0Zx.A05("shares_count", l4);
        c0Zx.A03("has_trials", bool3);
        c0Zx.A03("has_drafts", bool4);
        c0Zx.A03("more_trials_available", bool5);
        if (num6 != null) {
            l5 = Long.valueOf(num6.intValue());
        } else {
            l5 = null;
        }
        c0Zx.A05("trials_count", l5);
        if (num5 != null) {
            l6 = Long.valueOf(num5.intValue());
        }
        c0Zx.A05("non_follower_view_count", l6);
        c0Zx.A06(CacheBehaviorLogger.SOURCE, str3);
        return c0Zx;
    }

    public static final C38541Gx2 A01(EnumC37319GcL enumC37319GcL, Boolean bool, String str) {
        return A00(enumC37319GcL, bool, null, null, null, null, null, null, null, null, null, null, AppStateModule.APP_STATE_ACTIVE, str, null, null);
    }

    public static final C38541Gx2 A02(EnumC37319GcL enumC37319GcL, String str) {
        return A00(enumC37319GcL, null, null, null, null, null, null, null, null, null, null, null, AppStateModule.APP_STATE_ACTIVE, str, null, null);
    }

    public static final void A04(C38541Gx2 c38541Gx2, C153936w2 c153936w2, String str, String str2, String str3, String str4, String str5) {
        long j;
        Long l;
        Long A0k;
        C18920wW c18920wW = c153936w2.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "trial_clips");
        if (A00.isSampled()) {
            String fbidV2 = C08730cb.A00(c153936w2.A00).A00().A03.getFbidV2();
            if (fbidV2 != null && (A0k = AbstractC003100w.A0k(10, fbidV2)) != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            A00.A9K("creator_user_id", Long.valueOf(j));
            A00.AAP("event_source", str);
            A00.AAP("screen", str2);
            A00.AAP("event_action", str3);
            A00.AAP(AbstractC65709Tsi.A02(42, 10, 99), c153936w2.A02);
            if (str4 != null) {
                l = AbstractC003100w.A0k(10, str4);
            } else {
                l = null;
            }
            A00.A9K("media_id", l);
            A00.AAQ(c38541Gx2, AbstractC43591JPw.A00(360));
            if (str5 != null) {
                A00.AAP("error_message", str5);
            }
            A00.Cht();
        }
    }

    public C153936w2(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A06(boolean z) {
        A04(A00(null, null, null, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null), this, PublicKeyCredentialControllerUtility.JSON_KEY_USER, "self_profile_trials_page_entry_point", "tap_entry_point", null, null);
    }

    public final void A07(boolean z) {
        A04(A00(null, null, null, null, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null), this, DexOptimization.OPT_KEY_CLIENT, "self_profile_trials_page_entry_point", "impression", null, null);
    }
}

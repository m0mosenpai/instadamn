package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.70p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1564470p {
    public final Context context;
    public final String entryPoint;
    public final UserSession userSession;

    public AbstractC1564470p(Context context, UserSession userSession, String str) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 3);
        this.context = context;
        this.userSession = userSession;
        this.entryPoint = str;
    }

    public abstract InterfaceC58198Pr4 getUpsellContent();

    public boolean isUpsellEligible() {
        return false;
    }

    public abstract void showUpsell(InterfaceC58134Ppx interfaceC58134Ppx, Activity activity);

    public void showUpsellWithoutPrescreen(Activity activity) {
        C14360o3.A0B(activity, 0);
        AbstractC34213F7l.A00().A00(activity, this.userSession, new C36779GJc()).A06(this.entryPoint, null);
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public boolean isKillswitchEnabled() {
        C06090Tz c06090Tz;
        long j;
        String str = this.entryPoint;
        UserSession userSession = this.userSession;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(userSession, 1);
        if (str.equals("IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL")) {
            c06090Tz = C06090Tz.A06;
            j = 2342158370745617569L;
        } else if (str.equals("IG_LOGOUT_UPSELL")) {
            c06090Tz = C06090Tz.A06;
            j = 2342156429420398555L;
        } else {
            return false;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public final boolean isLinked() {
        if (!AbstractC49092Nc.A00(this.userSession).A00(CallerContext.A01("FxIgUnifiedACUpsellBaseImpl"), "ig_android_linking_cache_fx_ac_eligibility_linkage_check") && !C180377zR.A04(this.userSession)) {
            return false;
        }
        return true;
    }

    public void prefetchEligibility() {
        if (!isKillswitchEnabled()) {
            C149586oB A00 = AbstractC149576oA.A00(this.userSession);
            Context applicationContext = this.context.getApplicationContext();
            C14360o3.A07(applicationContext);
            UserSession userSession = this.userSession;
            String str = this.entryPoint;
            A00.A09(applicationContext, userSession, null, str, null, C1564570q.A00(str), false);
        }
    }
}

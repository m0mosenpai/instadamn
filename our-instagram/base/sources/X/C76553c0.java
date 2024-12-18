package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.unifiedfeedback.disclosure.UnifiedFeedbackDisclosureApi;
import com.instagram.user.model.User;

/* renamed from: X.3c0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76553c0 {
    public final UserSession A00;
    public final UnifiedFeedbackDisclosureApi A01;
    public final C76573c2 A02;
    public final C07X A03;

    /* JADX WARN: Multi-variable type inference failed */
    public C76553c0(Context context, UserSession userSession) {
        C07X c07x;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
        C76573c2 c76573c2 = (C76573c2) userSession.A01(C76573c2.class, new C57239PbN(userSession, 48));
        this.A02 = c76573c2;
        if (context instanceof C07X) {
            c07x = (C07X) context;
        } else {
            c07x = null;
        }
        this.A03 = c07x;
        this.A01 = new UnifiedFeedbackDisclosureApi(userSession);
        if (!c76573c2.A00.getBoolean("has_seen_unified_feedback_disclosure_nux_dialog", false)) {
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession, 36314266315262469L) && C18U.A06(c06090Tz, userSession, 2342157275529349638L) && c07x != null) {
                C57312k6 A00 = AbstractC57302k5.A00(c07x.getLifecycle());
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206649Cv(this, null, 36), A00);
            }
        }
    }

    public final void A01(Context context) {
        UserSession userSession = this.A00;
        C63397SjR c63397SjR = new C63397SjR(context, userSession, C2Fb.A48, C18U.A04(C06090Tz.A06, userSession, 36877216268746881L), false);
        c63397SjR.A0S = "unified_feedback_disclosure";
        c63397SjR.A0A();
    }

    public final boolean A02(C38321qM c38321qM) {
        String str;
        if (c38321qM == null) {
            return false;
        }
        UserSession userSession = this.A00;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        return !C14360o3.A0K(str, userSession.userId) && AbstractC76713cJ.A01(c38321qM, false) && C18U.A06(C06090Tz.A05, userSession, 36314266315262469L) && !this.A02.A00.getBoolean("has_seen_unified_feedback_disclosure_nux_dialog", false);
    }

    public final void A00() {
        C07X c07x;
        InterfaceC19610xo ARD = this.A02.A00.ARD();
        ARD.E77("has_seen_unified_feedback_disclosure_nux_dialog", true);
        ARD.apply();
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36314266315262469L) && C18U.A06(c06090Tz, userSession, 2342157275529349638L) && (c07x = this.A03) != null) {
            AbstractC23641Du.A05(AnonymousClass191.A00, new PZE(this, null, 19), AbstractC57302k5.A00(c07x.getLifecycle()));
        }
    }
}

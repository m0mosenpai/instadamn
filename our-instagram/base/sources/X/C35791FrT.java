package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.User;

/* renamed from: X.FrT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35791FrT implements CallerContextable {
    public static final String __redex_internal_original_name = "BusinessOptionsController";
    public final BaseFragmentActivity A00;
    public final AbstractC60672pq A01;
    public final UserSession A02;
    public final MonetizationRepository A03;
    public final C35150Fes A04;
    public final C33232ElR A05;
    public final C33232ElR A06;
    public final User A07;
    public static final String A09 = C33232ElR.class.getName();
    public static final CallerContext A08 = CallerContext.A00(C35791FrT.class);

    public C35791FrT(AbstractC60672pq abstractC60672pq, UserSession userSession, C33232ElR c33232ElR, C33232ElR c33232ElR2) {
        BaseFragmentActivity baseFragmentActivity;
        C14360o3.A0B(userSession, 2);
        this.A01 = abstractC60672pq;
        this.A02 = userSession;
        FragmentActivity activity = abstractC60672pq.getActivity();
        if (activity instanceof BaseFragmentActivity) {
            baseFragmentActivity = (BaseFragmentActivity) activity;
        } else {
            baseFragmentActivity = null;
        }
        this.A00 = baseFragmentActivity;
        this.A07 = AbstractC166997dE.A0Y(userSession);
        this.A05 = c33232ElR;
        this.A06 = c33232ElR2;
        this.A04 = new C35150Fes(abstractC60672pq, userSession);
        if (A01()) {
            ((C36292Fzm) C31651DvH.A00(this.A02, C36292Fzm.class, 4)).A03();
        }
        if (A00(this)) {
            F3H.A00(this.A01, this.A02).A00();
        }
        UserSession userSession2 = this.A02;
        if (AbstractC31303DpP.A00(userSession2, false)) {
            C36286Fzd A00 = AbstractC34058F1l.A00(userSession2);
            UserSession userSession3 = A00.A00;
            C40701ud A01 = AbstractC40691uc.A01(userSession3);
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A01("include_consumer_status");
            A0b.A01("ignore_business_opt_in_status");
            String str = userSession3.userId;
            A0b.A04("business_ig_id", str);
            C1Dk ensureCacheWrite = new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC167007dF.A1W(str)), "AdsEventSharingSettingsQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59378Qdb.class, false, null, 0, null, "xfb_biig_ads_event_sharing_settings", AbstractC166987dD.A1E()).setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false);
            A01.ATV(C35809Frl.A00, new C31463Ds7(A00, 3), ensureCacheWrite);
        }
        this.A03 = AbstractC63302u8.A00(userSession);
    }

    public static final boolean A00(C35791FrT c35791FrT) {
        Bundle bundle = c35791FrT.A01.mArguments;
        if (bundle != null) {
            bundle.getBoolean("is_entered_from_QP", false);
        }
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = c35791FrT.A02;
        if (!C2E7.A03(c08730cb.A01(userSession))) {
            return false;
        }
        return AbstractC31176DnK.A1a(C06090Tz.A06, userSession, 36314042977159555L);
    }

    public final boolean A01() {
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A02;
        if (C2E7.A03(c08730cb.A01(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36311324262728184L)) {
            return true;
        }
        return false;
    }
}

package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;

/* renamed from: X.43m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C909443m implements InterfaceC909543n {
    public boolean A00;
    public final AbstractC10360h2 A01;
    public final Fragment A02;
    public final UserSession A03;
    public final C57112jm A04;
    public final InterfaceC60442pS A05;
    public final C684736k A06;
    public final User A07;

    @Override // X.InterfaceC909543n
    public final void DME(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A03;
        InterfaceC60442pS interfaceC60442pS = this.A05;
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A00 = interfaceC60442pS;
        F0L.A00(c12210kP.A00(), MSV.A00(1714), "single_feed");
        F7S.A00(this.A02, userSession, c38321qM, interfaceC60442pS.getModuleName());
    }

    @Override // X.InterfaceC909543n
    public final void Dc4(View view, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C684736k c684736k = this.A06;
        if (c684736k != null) {
            c684736k.A00(view, this.A04, c38321qM, QPTooltipAnchor.A12, Trigger.A0Y);
        }
    }

    @Override // X.InterfaceC909543n
    public final void Dc5(View view, C38321qM c38321qM, C75113Zb c75113Zb, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str, 3);
        Fragment fragment = this.A02;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && !(!C06P.A01(this.A01))) {
            UserSession userSession = this.A03;
            W6I A00 = VRC.A00(userSession);
            if (c38321qM.A61()) {
                C18920wW c18920wW = A00.A00;
                InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ads_manager_finish_step");
                A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "promotion_media");
                A002.AAP("waterfall_id", A00.A00());
                A002.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
                A002.Cht();
                F0J.A00().A02(activity, userSession, str, null, false);
                return;
            }
            AbstractC69888VxF.A00().A07(fragment, null, PromoteLaunchOrigin.A06, this.A05, userSession, c38321qM, str, null, false);
        }
    }

    @Override // X.InterfaceC909543n
    public final void ElS(View view, C38321qM c38321qM, C75113Zb c75113Zb, Integer num, String str) {
        C14360o3.A0B(num, 3);
        Fragment fragment = this.A02;
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            UserSession userSession = this.A03;
            C23962Ajw c23962Ajw = new C23962Ajw(this);
            int intValue = num.intValue();
            int i = 2131970771;
            if (intValue != 1) {
                i = 2131966892;
            }
            String string = fragment.getString(i);
            C14360o3.A07(string);
            GQL gql = new GQL(activity, view, c23962Ajw, string);
            View view2 = fragment.mView;
            if (view2 != null) {
                if (intValue != 1) {
                    InterfaceC19610xo ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                    ARD.E77("reel_boost_with_instagram_effect_seen_tooltip_on_more_button", true);
                    ARD.apply();
                } else {
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    A00.A4d.Egi(A00, true, C23031Ai.A8c[110]);
                }
                view2.postDelayed(gql, 500L);
            }
        }
    }

    @Override // X.InterfaceC909543n
    public final boolean CbG() {
        return this.A00;
    }

    public C909443m(Fragment fragment, AbstractC10360h2 abstractC10360h2, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, C684736k c684736k, User user) {
        this.A03 = userSession;
        this.A05 = interfaceC60442pS;
        this.A02 = fragment;
        this.A07 = user;
        this.A06 = c684736k;
        this.A04 = c57112jm;
        this.A01 = abstractC10360h2;
    }
}

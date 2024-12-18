package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.profile.fragment.ProfileFollowRelationshipFragment;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GBY implements AnonymousClass741 {
    public final /* synthetic */ GBF A00;

    @Override // X.AnonymousClass741
    public final boolean CoO() {
        return false;
    }

    @Override // X.AnonymousClass741
    public final void D2g(String str) {
    }

    @Override // X.AnonymousClass741
    public final void D3n(String str) {
    }

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
    }

    @Override // X.AnonymousClass741
    public final void D3x(User user, String str, boolean z) {
    }

    @Override // X.AnonymousClass741
    public final void D3z(String str, String str2) {
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.AnonymousClass741
    public final void D4V(User user) {
    }

    @Override // X.AnonymousClass741
    public final void DFO() {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.AnonymousClass741
    public final void DQf(C38321qM c38321qM, UserDetailEntryInfo userDetailEntryInfo, String str, String str2, String str3) {
    }

    @Override // X.AnonymousClass741
    public final boolean DQp(User user) {
        return false;
    }

    @Override // X.AnonymousClass742
    public final void DT3(boolean z) {
    }

    @Override // X.AnonymousClass741
    public final void EJH() {
    }

    @Override // X.AnonymousClass741
    public final void ENm(String str) {
    }

    @Override // X.AnonymousClass741
    public final void El6(View view) {
    }

    public GBY(GBF gbf) {
        this.A00 = gbf;
    }

    @Override // X.AnonymousClass741
    public final void D3w(C38321qM c38321qM, UserDetailEntryInfo userDetailEntryInfo, FollowButton followButton, String str, String str2, String str3, String str4) {
        String id;
        String str5 = str3;
        String str6 = str2;
        UserDetailEntryInfo userDetailEntryInfo2 = userDetailEntryInfo;
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, AbstractC111324zv.A00(2561));
        UserSession userSession = gbf.A02;
        User user = gbf.A04;
        Fragment fragment = gbf.A01;
        Context context = fragment.getContext();
        context.getClass();
        FragmentActivity activity = fragment.getActivity();
        if (userDetailEntryInfo == null) {
            userDetailEntryInfo2 = new UserDetailEntryInfo(null, null, null, null, null, null, null, null, null, null, null, null);
        }
        if (str2 == null) {
            str6 = AbstractC43591JPw.A00(575);
        }
        if (str3 == null) {
            str5 = "MAP_PROFILE_BUSINESS_ACTIONS";
        }
        FollowStatus A0j = AbstractC31174DnI.A0j(userSession, user);
        if (user.CQf()) {
            AbstractC35271Fh6.A02(activity, userSession, followButton, null, user, str5);
            return;
        }
        if (A0j == FollowStatus.A05) {
            if (c38321qM == null) {
                id = null;
            } else {
                id = c38321qM.getId();
            }
            AbstractC31364DqT.A03();
            C14360o3.A0B(userSession, 0);
            Bundle A05 = AbstractC31178DnM.A05(userSession);
            A05.putString(AbstractC111324zv.A00(1720), user.getId());
            A05.putString(AbstractC111324zv.A00(1719), null);
            A05.putString(AbstractC111324zv.A00(3713), id);
            ProfileFollowRelationshipFragment profileFollowRelationshipFragment = new ProfileFollowRelationshipFragment();
            C189448aO A0W = AbstractC31174DnI.A0W(A05, profileFollowRelationshipFragment, userSession);
            A0W.A0T = profileFollowRelationshipFragment;
            AbstractC25225BEi.A1Q(A0W, false);
            A0W.A03 = 0.7f;
            A0W.A0d = user.getUsername();
            C189478aR A00 = A0W.A00();
            profileFollowRelationshipFragment.A00 = new GIQ(activity, context, userSession, c38321qM, A00, null, userDetailEntryInfo2, user, null, new GJO(), str6, str5);
            A00.A02((Activity) context, profileFollowRelationshipFragment);
            return;
        }
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
        C14360o3.A0B(userSession, 0);
        viewOnAttachStateChangeListenerC110564yT.A05(null, userSession, c38321qM, null, null, null, user, null, null, null);
    }

    @Override // X.AnonymousClass742
    public final void DSz(String str, boolean z) {
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_message");
        UserSession userSession = gbf.A02;
        User user = gbf.A04;
        AbstractC34904FZq.A00(gbf.A00, gbf.A01, userSession, user, str);
    }
}

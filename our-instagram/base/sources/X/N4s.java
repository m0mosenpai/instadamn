package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableMap;
import com.instagram.igds.components.textcell.IgdsFooterCell;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class N4s extends AbstractC59962oe {
    public static final ImmutableMap A02;
    public static final ImmutableMap A03;
    public static final String __redex_internal_original_name = "ProfileBroadcastChatNotificationsSettingsFragment";
    public User A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "broadcast_chat_notifications_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsFooterCell igdsFooterCell = (IgdsFooterCell) AbstractC166997dE.A0R(view, R.id.profile_follow_sheet_footer);
        Context requireContext = requireContext();
        User user = this.A00;
        if (user != null) {
            String A0c = AbstractC31178DnM.A0c(requireContext, user, 2131976450);
            C14360o3.A07(A0c);
            igdsFooterCell.A00(A0c);
            ImmutableMap immutableMap = A03;
            User user2 = this.A00;
            if (user2 != null) {
                Number number = (Number) immutableMap.get(user2.A0G());
                if (number != null) {
                    ((CompoundButton) AbstractC166997dE.A0R(view, number.intValue())).setChecked(true);
                    ((RadioGroup) AbstractC166997dE.A0R(view, R.id.follow_sheet_radio_group)).setOnCheckedChangeListener(new C55525OlJ(this, 1));
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F("displayedUser");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    static {
        Integer valueOf = Integer.valueOf(R.id.follow_sheet_all_notifications);
        EnumC154216wW enumC154216wW = EnumC154216wW.A03;
        Integer valueOf2 = Integer.valueOf(R.id.follow_sheet_some_notifications);
        EnumC154216wW enumC154216wW2 = EnumC154216wW.A05;
        Integer valueOf3 = Integer.valueOf(R.id.follow_sheet_no_notifications);
        EnumC154216wW enumC154216wW3 = EnumC154216wW.A04;
        A02 = ImmutableMap.of((Object) valueOf, (Object) enumC154216wW, (Object) valueOf2, (Object) enumC154216wW2, (Object) valueOf3, (Object) enumC154216wW3);
        A03 = ImmutableMap.of((Object) enumC154216wW, (Object) valueOf, (Object) enumC154216wW2, (Object) valueOf2, (Object) enumC154216wW3, (Object) valueOf3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A022 = C0f9.A02(752314272);
        super.onCreate(bundle);
        User A023 = AbstractC31176DnK.A0h(this.A01).A02(requireArguments().getString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID"));
        if (A023 != null) {
            this.A00 = A023;
        }
        if (this.A00 == null) {
            C14360o3.A0F("displayedUser");
            throw C00O.createAndThrow();
        }
        C0f9.A09(749338989, A022);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C0f9.A02(1355532423);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_profile_follow_sheet_multi_options_notifications, viewGroup, false);
        C0f9.A09(-929636458, A022);
        return inflate;
    }
}

package com.instagram.connections.notifyme.modules.fragments;

import X.AbstractC09440dt;
import X.AbstractC141776au;
import X.AbstractC153636vY;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC52922bZ;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.AnonymousClass191;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C29889DGd;
import X.C29899DGn;
import X.C44495Jm1;
import X.C50120MBu;
import X.C57312k6;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.MBT;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.lifecycleannotations.LifecycleUtil;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.follow.FollowButton;

/* loaded from: classes8.dex */
public final class NotifyMeNotFollowedFragment extends AbstractC59962oe {
    public String A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public CircularImageView avatar;
    public FollowButton followButton;
    public View loadingIndicator;
    public IgTextView message;
    public IgTextView title;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "notify_me_not_followed";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CircularImageView A0T = AbstractC31173DnH.A0T(view, R.id.notify_me_not_followed_avatar);
        C14360o3.A0B(A0T, 0);
        this.avatar = A0T;
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.notify_me_not_followed_title);
        C14360o3.A0B(A0X, 0);
        this.title = A0X;
        IgTextView A0X2 = AbstractC31172DnG.A0X(view, R.id.notify_me_not_followed_message);
        C14360o3.A0B(A0X2, 0);
        this.message = A0X2;
        FollowButton followButton = (FollowButton) view.requireViewById(R.id.notify_me_not_followed_follow_button);
        C14360o3.A0B(followButton, 0);
        this.followButton = followButton;
        View requireViewById = view.requireViewById(R.id.notify_me_not_followed_loading_indicator);
        C14360o3.A0B(requireViewById, 0);
        this.loadingIndicator = requireViewById;
        C57312k6 A0S = AbstractC25235BEs.A0S(this);
        MBT mbt = new MBT(this, null, 35);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mbt, A0S);
        AbstractC23641Du.A05(anonymousClass191, new MBT(this, null, 36), AbstractC25235BEs.A0S(this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public NotifyMeNotFollowedFragment() {
        C29889DGd c29889DGd = new C29889DGd(this, 15);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C29889DGd(new C29889DGd(this, 16), 17));
        this.A01 = AbstractC25225BEi.A0a(new C29889DGd(A00, 18), c29889DGd, new C29899DGn(29, null, A00), AbstractC25225BEi.A1D(C44495Jm1.class));
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-122702806);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = AbstractC153636vY.A01(bundle2, "otherUserId");
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A01);
            String str = this.A00;
            if (str == null) {
                C14360o3.A0F("otherUserId");
                throw C00O.createAndThrow();
            }
            C50120MBu.A01(A0Z, str, AbstractC141776au.A00(A0Z), 35);
            C0f9.A09(376595599, A02);
            return;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("Arguments should be set on the fragment");
        C0f9.A09(1170966719, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1230184013);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_notify_me_not_followed, viewGroup, false);
        C0f9.A09(-243125543, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1551267187);
        super.onDestroyView();
        LifecycleUtil.cleanupReferences(this);
        C0f9.A09(-765875862, A02);
    }
}

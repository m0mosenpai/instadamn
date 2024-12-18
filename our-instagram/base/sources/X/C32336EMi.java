package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.EMi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32336EMi extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ChannelChooserFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_interest_based_channel_chooser";
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C56342iS.A01(ViewOnClickListenerC35681FpG.A00(this, 33), AbstractC31176DnK.A0C(view, R.id.direct_interest_channel_action_bar)).A0X(C35890FtA.A00);
        FragmentActivity requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((BaseFragmentActivity) requireActivity).A0a();
        RecyclerView A0D = AbstractC31178DnM.A0D(view);
        FragmentActivity requireActivity2 = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(this.A04);
        InterfaceC09390do interfaceC09390do = this.A01;
        A0D.setAdapter(new C31880Dzm(requireActivity2, A0r, (ChannelCreationFlowExtraArgs) this.A02.getValue(), (ChannelCreationSource) interfaceC09390do.getValue()));
        C142846ck A0d = AbstractC31172DnG.A0d(this.A00);
        ChannelCreationSource channelCreationSource = (ChannelCreationSource) interfaceC09390do.getValue();
        C14360o3.A0B(channelCreationSource, 0);
        C25531Mh A0I = AbstractC31172DnG.A0I(A0d);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A0d);
            AbstractC31174DnI.A1I(A0I, "create_channel_sheet_rendered");
            A0I.A0o("channel_item");
            AbstractC31175DnJ.A1D(A0I, C142846ck.A00(channelCreationSource));
            A0I.A0u(A0d.A01);
            A0I.Cht();
        }
        C36299Fzu c36299Fzu = (C36299Fzu) this.A05.getValue();
        ChannelCreationSource channelCreationSource2 = (ChannelCreationSource) interfaceC09390do.getValue();
        C14360o3.A0B(channelCreationSource2, 0);
        C25531Mh A00 = C36299Fzu.A00(c36299Fzu);
        if (AbstractC25226BEj.A1Z(A00)) {
            C36299Fzu.A04(A00, c36299Fzu);
            AbstractC31174DnI.A1I(A00, "create_channel_sheet_rendered");
            A00.A0o("channel_item");
            C36299Fzu.A05(A00, c36299Fzu, C36299Fzu.A01(channelCreationSource2));
            A00.Cht();
        }
        if (AbstractC167007dF.A1Z(this.A03)) {
            int A01 = AbstractC31177DnL.A01(view, R.id.direct_interest_channel_action_bar);
            AbstractC31172DnG.A1J(view, R.id.header_title, A01);
            AbstractC31172DnG.A1J(view, R.id.header_description, A01);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public C32336EMi() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = DH5.A01(this, "social_channel_creation_source", enumC09460dv, 11);
        this.A03 = C37055GUl.A00(this, enumC09460dv, 4);
        this.A02 = DH5.A01(this, "direct_channel_creation_flow_extra_args", enumC09460dv, 12);
        this.A00 = C37055GUl.A00(this, enumC09460dv, 3);
        this.A05 = C37055GUl.A00(this, enumC09460dv, 5);
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(248770421);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_direct_interest_channel_chooser, false);
        C0f9.A09(-1958049361, A02);
        return A0R;
    }
}

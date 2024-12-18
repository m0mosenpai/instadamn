package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.EMr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32345EMr extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "RestrictInfoBottomSheetFragmentImpl";
    public View A00;
    public C18920wW A01;
    public EnumC33371Ep4 A02;
    public InterfaceC37142GYd A03;
    public String A04;
    public String A05;
    public boolean A06;
    public ImageUrl A07;
    public String A08;
    public boolean A09;
    public final C28151Xt A0A = C28151Xt.A02;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

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
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (r0.booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32345EMr.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        View view = this.A00;
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public C32345EMr() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C57511Pfl(this, 38));
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new C57511Pfl(this, 37));
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "restrict_half_sheet";
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
    public final void onCreate(Bundle bundle) {
        EnumC33371Ep4 enumC33371Ep4;
        int A02 = C0f9.A02(-993508712);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC12220kQ.A01(this, getSession());
        Object obj = requireArguments.get(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (!(obj instanceof EnumC33371Ep4) || (enumC33371Ep4 = (EnumC33371Ep4) obj) == null) {
            enumC33371Ep4 = EnumC33371Ep4.A0H;
        }
        this.A02 = enumC33371Ep4;
        this.A04 = requireArguments.getString("analytics_extra");
        this.A05 = requireArguments.getString("target_user_id", "");
        this.A08 = requireArguments.getString("target_username", "");
        this.A07 = (ImageUrl) requireArguments.getParcelable("target_profile_url");
        this.A09 = requireArguments.getBoolean("hide_action_button");
        this.A06 = requireArguments.getBoolean("dont_dismiss_on_restrict_success");
        C0f9.A09(1421280467, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-451799264);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_restrict_user_bottom_sheet, false);
        C0f9.A09(1046787591, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(197923933);
        super.onDestroyView();
        this.A00 = null;
        C0f9.A09(-704684650, A02);
    }
}

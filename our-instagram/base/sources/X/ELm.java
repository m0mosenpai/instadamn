package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes6.dex */
public final class ELm extends AbstractC59962oe implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "MultiBlockBottomSheetFragment";
    public int A00;
    public GZW A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public View A06;
    public ImageUrl A07;
    public String A08;
    public boolean A09;
    public final InterfaceC09390do A0A = AbstractC60492pY.A02(this);

    public static final void A00(ELm eLm, boolean z) {
        eLm.A03 = true;
        AbstractC31176DnK.A12(eLm.requireContext(), C3DN.A00);
        C28238Cci c28238Cci = C28238Cci.A00;
        InterfaceC09390do interfaceC09390do = eLm.A0A;
        AbstractC12990ll A0M = AbstractC31178DnM.A0M(interfaceC09390do);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerPoint(309476254, AbstractC111324zv.A00(1986));
        c28238Cci.A01(A0M);
        c28238Cci.A01(AbstractC166987dD.A0o(interfaceC09390do));
        GZW gzw = eLm.A01;
        if (gzw != null) {
            gzw.D6u(2, z);
        } else {
            C14360o3.A0F("callback");
            throw C00O.createAndThrow();
        }
    }

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
        return "multi_block_bottom_sheet";
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

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC166987dD.A0o(r4), 36321395960980878L) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0161, code lost:
    
        if (X.C4GR.A01(r1) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0114  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELm.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        View view = this.A06;
        if (view != null && !view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.1vN] */
    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        GZW gzw = this.A01;
        if (gzw != null) {
            gzw.onCancel();
            AbstractC31176DnK.A0Q(this.A0A).E4s(new Object());
            return false;
        }
        C14360o3.A0F("callback");
        throw C00O.createAndThrow();
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1119870091);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A08 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(732));
        this.A07 = (ImageUrl) AbstractC153636vY.A00(requireArguments, ImageUrl.class, "arg_target_profile_pic_url");
        if (AbstractC31172DnG.A1X(requireArguments, "arg_is_report_after_block_supported")) {
            this.A09 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0A), 36313965667617112L);
        }
        this.A04 = requireArguments.getBoolean("arg_is_group_chat_admin");
        this.A00 = requireArguments.getInt("arg_thread_sub_type");
        this.A05 = requireArguments.getBoolean("arg_is_user_subscribed_to_creator");
        this.A02 = requireArguments.getBoolean("arg_is_block_from_comment_deletion_upsell");
        C0f9.A09(-1940870215, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1100570233);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.multi_block_bottom_sheet_fragment, false);
        C0f9.A09(1947606470, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1312152395);
        super.onDestroyView();
        this.A06 = null;
        C28238Cci.A00.A00(AbstractC166987dD.A0o(this.A0A));
        C0f9.A09(40210306, A02);
    }
}

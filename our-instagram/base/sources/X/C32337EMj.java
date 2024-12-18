package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.EMj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32337EMj extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "ReuseForFeedPostsBottomSheetNux";
    public UserSession A00;

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
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.new_remix_introduction_headline);
        Context A0L = AbstractC166997dE.A0L(igdsHeadline);
        Resources resources = A0L.getResources();
        Boolean A0b = AbstractC166997dE.A0b();
        C35228FgL A00 = C35228FgL.A00(A0L, A0b);
        igdsHeadline.setHeadline(2131972578);
        A00.A04(null, resources.getString(2131972576), R.drawable.instagram_new_post_pano_outline_24);
        A00.A04(null, resources.getString(2131972577), R.drawable.instagram_remix_pano_outline_24);
        C35228FgL.A02(A00, igdsHeadline, null, resources.getString(2131972583), R.drawable.instagram_settings_pano_outline_24);
        UserSession userSession = this.A00;
        if (userSession != null) {
            C23031Ai A002 = AbstractC23021Ah.A00(userSession);
            AbstractC31171DnF.A1S(A002, A0b, A002.A4p, C23031Ai.A8c, 331);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                C37855Gl9.A06(userSession2);
                return;
            }
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0u();
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "metadata_reuse_for_feed_posts_bottom_sheet_nux";
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
        int A02 = C0f9.A02(2066180132);
        super.onCreate(bundle);
        this.A00 = AbstractC31177DnL.A0R(this);
        C0f9.A09(851540006, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1453493507);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_new_remix_introduction_bottomsheet, false);
        C0f9.A09(-1282325007, A02);
        return A0R;
    }
}

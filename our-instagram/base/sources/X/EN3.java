package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EN3 extends AbstractC59962oe implements C51E, C51D {
    public static final String __redex_internal_original_name = "OptimizedNuxFragment";
    public final UserSession A00;
    public final Integer A01;
    public final InterfaceC16820sZ A02;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
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
    public final int getExtraDragSpace() {
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
    public final boolean isScrolledToBottom() {
        return false;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String str4 = null;
        if (this.A01 != C05F.A00) {
            TextView A0T = AbstractC166997dE.A0T(view, R.id.clips_nux_sheet_text2);
            Context context = getContext();
            if (context != null) {
                str4 = context.getString(2131955798);
            }
            A0T.setText(str4);
            int A01 = AbstractC31177DnL.A01(view, R.id.clips_nux_sheet_icon3);
            AbstractC31172DnG.A1J(view, R.id.clips_nux_sheet_text3, A01);
            AbstractC31172DnG.A1J(view, R.id.clips_nux_sheet_icon4, A01);
            AbstractC31172DnG.A1J(view, R.id.clips_nux_sheet_text4, A01);
            AbstractC31173DnH.A10(requireContext(), AbstractC166997dE.A0S(view, R.id.clips_nux_sheet_scroll_view).getLayoutParams(), 200);
        } else {
            TextView A0T2 = AbstractC166997dE.A0T(view, R.id.clips_nux_sheet_text1);
            Context context2 = A0T2.getContext();
            if (context2 != null) {
                str = context2.getString(2131955796);
            } else {
                str = null;
            }
            A0T2.setText(str);
            A0T2.setTextAppearance(R.style.igds_body_1);
            TextView A0T3 = AbstractC166997dE.A0T(view, R.id.clips_nux_sheet_text2);
            Context context3 = A0T3.getContext();
            if (context3 != null) {
                str2 = context3.getString(2131955799);
            } else {
                str2 = null;
            }
            A0T3.setText(str2);
            A0T3.setTextAppearance(R.style.igds_body_1);
            TextView A0T4 = AbstractC166997dE.A0T(view, R.id.clips_nux_sheet_text3);
            Context context4 = A0T4.getContext();
            if (context4 != null) {
                str3 = context4.getString(2131955801);
            } else {
                str3 = null;
            }
            A0T4.setText(str3);
            A0T4.setTextAppearance(R.style.igds_body_1);
            TextView A0T5 = AbstractC166997dE.A0T(view, R.id.clips_nux_sheet_text4);
            Context context5 = A0T5.getContext();
            if (context5 != null) {
                str4 = context5.getString(2131955803);
            }
            A0T5.setText(str4);
            A0T5.setTextAppearance(R.style.igds_body_1);
            AbstractC31173DnH.A0I(view, R.id.clips_nux_sheet_icon3).setImageResource(R.drawable.instagram_remix_pano_outline_24);
        }
        ViewOnClickListenerC35679FpE.A01(AbstractC166997dE.A0S(view, R.id.clips_nux_sheet_share_button), 54, this);
        ViewOnClickListenerC35679FpE.A01(AbstractC166997dE.A0S(view, R.id.clips_nux_sheet_cancel_button), 55, this);
        View A0S = AbstractC166997dE.A0S(view, R.id.clips_nux_sheet_learn_more);
        AbstractC56952jT.A01(A0S);
        ViewOnClickListenerC35679FpE.A01(A0S, 56, this);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        AnonymousClass229.A01(this.A00);
    }

    public EN3(UserSession userSession, Integer num, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = userSession;
        this.A01 = num;
        this.A02 = interfaceC16820sZ;
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
        return "ig_camera_clips_optimized_nux";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
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
        int A02 = C0f9.A02(1098352154);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_optimized_nux, viewGroup, false);
        C0f9.A09(1607947593, A02);
        return inflate;
    }
}

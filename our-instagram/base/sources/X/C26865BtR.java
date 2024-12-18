package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.BtR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26865BtR extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "InThreadFeedbackBottomSheet";
    public InterfaceC16820sZ A00;
    public C18920wW A01;
    public String A02;
    public final String A04 = "creator_ai_in_thread_feedback";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

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
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A03;
        this.A01 = AbstractC12220kQ.A02(AbstractC166987dD.A0o(interfaceC09390do));
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString(AbstractC111324zv.A00(858))) == null) {
            str = "";
        }
        this.A02 = str;
        A00(this, "open_ig_creator_ai_feedback");
        ViewOnClickListenerC28667ClF.A01(view.findViewById(R.id.creator_ai_wrong_information), 55, new C50371MLy(this, requireArguments(), "feedback_negative_correction", "creator_ai_add_fact", 25));
        View findViewById = view.findViewById(R.id.creator_ai_avoided_topic);
        findViewById.setVisibility(0);
        ViewOnClickListenerC28667ClF.A01(findViewById, 55, new C50371MLy(this, requireArguments(), "feedback_negative_avoided_topic", AbstractC111324zv.A00(2205), 25));
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36322929264634607L)) {
            View findViewById2 = view.findViewById(R.id.creator_ai_freeform_feedback);
            findViewById2.setVisibility(0);
            ViewOnClickListenerC28667ClF.A01(findViewById2, 55, new C50371MLy(this, requireArguments(), "feedback_negative_give_feedback_to_meta", AbstractC111324zv.A00(4201), 25));
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A00(C26865BtR c26865BtR, String str) {
        String str2;
        C18920wW c18920wW = c26865BtR.A01;
        if (c18920wW == null) {
            str2 = "logger";
        } else {
            C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(c18920wW, "gen_ai_response_feedback"), 162);
            if (AbstractC25226BEj.A1Z(c25531Mh)) {
                c25531Mh.A0R("feedback_surface", "instagram");
                c25531Mh.A0R("feedback_type", "thumbs_down");
                String str3 = c26865BtR.A02;
                if (str3 == null) {
                    str2 = "botResponseId";
                } else {
                    c25531Mh.A0R("response_id", str3);
                    ((AbstractC02600Aj) c25531Mh).A00.A9M("bool_feedback", AbstractC167007dF.A0n(str, AbstractC166997dE.A0b()));
                    c25531Mh.Cht();
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
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
        return this.A04;
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
        int A02 = C0f9.A02(-1572043242);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_ai_in_thread_feedback_bottom_sheet_layout, false);
        C0f9.A09(1462935867, A02);
        return A0R;
    }
}

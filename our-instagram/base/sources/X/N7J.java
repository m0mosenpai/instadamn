package X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes9.dex */
public final class N7J extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "HideCommentNUXBottomSheetFragment";
    public C54592O9t A00;
    public C84923qg A01;
    public String A02;
    public boolean A03;
    public View A04;
    public boolean A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final String A07 = "hide_comment_nux_bottom_sheet";

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
        OOJ.A01(AbstractC166987dD.A0r(this.A06), this.A01, "show_bottomsheet_nux");
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.hide_comment_nux_headline_component);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_hide_comments_refresh);
        igdsHeadline.setHeadline(AbstractC166997dE.A0N(this).getString(2131963487));
        C35228FgL A01 = C35228FgL.A01(requireContext(), true);
        A01.A04(null, AbstractC166997dE.A0N(this).getString(2131963484), R.drawable.instagram_eye_off_pano_outline_24);
        Resources A0N = AbstractC166997dE.A0N(this);
        String str = this.A02;
        if (str == null) {
            C14360o3.A0F("targetUsername");
            throw C00O.createAndThrow();
        }
        A01.A04(null, AbstractC07900bA.A01(A0N, new String[]{str}, 2131963486), R.drawable.instagram_alert_off_pano_outline_24);
        A01.A04(null, AbstractC07900bA.A01(AbstractC166997dE.A0N(this), new String[0], 2131963485), R.drawable.instagram_limited_interactions_pano_outline_24);
        igdsHeadline.setBulletList(A01.A03());
        C64P c64p = (C64P) view.findViewById(R.id.hide_comment_nux_bottom_button_layout);
        c64p.setPrimaryActionOnClickListener(ViewOnClickListenerC55457OkB.A00(this, 1));
        c64p.setSecondaryActionOnClickListener(ViewOnClickListenerC55457OkB.A00(this, 2));
        C3DN A012 = C3DN.A00.A01(requireContext());
        if (A012 != null) {
            ((C3DP) A012).A0H = new C56769PHm(this, 1);
        }
        View findViewById = view.findViewById(R.id.hide_comment_nux_bottom_sheet_scrollview);
        this.A04 = findViewById;
        c64p.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC55474OkT(0, findViewById, c64p));
    }

    public static final void A00(N7J n7j) {
        C3DN A01 = C3DN.A00.A01(n7j.requireContext());
        if (n7j.A05) {
            C189478aR A00 = F86.A00(A01);
            if (!n7j.A03) {
                OOJ.A00(AbstractC166987dD.A0r(n7j.A06), n7j.A01, "comment_hidden_nux_dismiss");
                C54592O9t c54592O9t = n7j.A00;
                if (c54592O9t != null) {
                    C25814BbV c25814BbV = c54592O9t.A00;
                    c25814BbV.A0A.A0M(c54592O9t.A01, c54592O9t.A02);
                }
            }
            if (A00 != null) {
                A00.A0T();
                return;
            }
            return;
        }
        if (A01 == null) {
            return;
        }
        A01.A0B();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
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
    public final boolean isScrolledToTop() {
        View view = this.A04;
        if (view != null && !AbstractC43592JPx.A1X(view)) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2010256882);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = AbstractC153636vY.A01(requireArguments, AbstractC111324zv.A00(732));
        this.A05 = requireArguments.getBoolean(AbstractC111324zv.A00(3926));
        C0f9.A09(-327681606, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1967315858);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.hide_comment_nux_bottom_sheet_fragment, false);
        C0f9.A09(894089054, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1251460041);
        super.onDestroyView();
        this.A04 = null;
        C0f9.A09(1203017739, A02);
    }
}

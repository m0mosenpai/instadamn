package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes8.dex */
public final class KDA extends AbstractC59962oe implements InterfaceC189488aT, C51D {
    public static final C55942hf A08 = C55942hf.A00();
    public static final String __redex_internal_original_name = "ReelPicsPleaseMediaSelectionFragment";
    public ViewGroup A00;
    public IgdsBottomButtonLayout A01;
    public L2B A02;
    public C45489KCe A03;
    public String A04;
    public View A05;
    public final MPG A07 = new C49638LwV(this, 2);
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 0.7f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttachFragment(Fragment fragment) {
        C45489KCe c45489KCe;
        C14360o3.A0B(fragment, 0);
        if ((fragment instanceof C45489KCe) && (c45489KCe = (C45489KCe) fragment) != null) {
            MPG mpg = this.A07;
            c45489KCe.A01 = mpg;
            C47958LGu c47958LGu = c45489KCe.A00;
            if (c47958LGu != null) {
                c47958LGu.A02 = mpg;
            }
            c45489KCe.setDayNightMode(this.dayNightMode);
        }
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A04 != null) {
            ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.media_picker_root_container);
            this.A00 = A0F;
            if (A0F != null) {
                AbstractC13880nE.A0s(A0F, new RunnableC49915M2i(this));
            }
            Context context = view.getContext();
            String A0p = AbstractC166997dE.A0p(context, 2131966074);
            TextView A0N = AbstractC167007dF.A0N(view, R.id.description_text);
            InterfaceC09390do interfaceC09390do = this.A06;
            C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
            InterfaceC16530ry interfaceC16530ry = A0l.A4W;
            C0YR[] c0yrArr = C23031Ai.A8c;
            boolean A1b = AbstractC167017dG.A1b(A0l, interfaceC16530ry, c0yrArr, 129);
            int i = 2131966073;
            if (A1b) {
                i = 2131966072;
            }
            SpannableStringBuilder A09 = AbstractC31178DnM.A09(AbstractC167007dF.A0f(context, this.A04, i), A0p);
            if (!A1b) {
                AbstractC167007dF.A1L(A0l, interfaceC16530ry, c0yrArr, 129, true);
            }
            Em1 em1 = new Em1(this, context.getColor(R.color.default_cta_dominant_color));
            C14360o3.A0A(A09);
            AnonymousClass773.A05(A09, em1, A0p);
            A0N.setMovementMethod(C6R6.A00);
            A0N.setText(A09);
            this.A05 = view.requireViewById(R.id.bottom_container);
            AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
            C45489KCe c45489KCe = new C45489KCe();
            c45489KCe.setArguments(AbstractC31174DnI.A0D(A0k));
            c45489KCe.setDayNightMode(this.dayNightMode);
            AbstractC43593JPy.A1D(c45489KCe, AbstractC43593JPy.A0F(this));
            this.A03 = c45489KCe;
            IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(view, R.id.send_bottom_button);
            A0j.setPrimaryActionOnClickListener(new ViewOnClickListenerC48065LPq(this, 10));
            this.A01 = A0j;
        }
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        C45489KCe c45489KCe = this.A03;
        if (c45489KCe == null) {
            C14360o3.A0F("currentFragment");
            throw C00O.createAndThrow();
        }
        return c45489KCe.CQn();
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

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        C45489KCe c45489KCe = this.A03;
        if (c45489KCe == null) {
            C14360o3.A0F("currentFragment");
            throw C00O.createAndThrow();
        }
        return c45489KCe.isScrolledToTop();
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        AbstractC43594JPz.A17(this.A05, i, i2);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return ViewConfiguration.get(getThemedContext()).getScaledTouchSlop();
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 0.7f;
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
        int A02 = C0f9.A02(39983382);
        super.onCreate(bundle);
        this.A04 = requireArguments().getString(AbstractC111324zv.A00(3734));
        C0f9.A09(466752222, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1613420643);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.pics_please_media_selection_fragment, viewGroup, false);
        C0f9.A09(76258420, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-473751042);
        this.A01 = null;
        this.A00 = null;
        this.A05 = null;
        super.onDestroyView();
        C0f9.A09(-396107049, A02);
    }
}

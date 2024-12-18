package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import java.util.Collection;
import java.util.List;

/* renamed from: X.KDq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45525KDq extends AbstractC43842Ja5 implements C51D, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AppreciationGiftFeedFragment";
    public final String A00 = AbstractC58442PvL.A02();
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (requireArguments().getBoolean("arg_full_screen")) {
            AbstractC25229BEm.A1G(interfaceC56362iU, 2131953070);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "appreciation_gift_feed";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC37304Gc5.A0y(getRecyclerView().A0D, getRecyclerView(), new JY9(this, 1), C153146ui.A0A);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 13);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcq, A00);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A09);
        String A01 = AbstractC153636vY.A01(requireArguments(), "arg_media_id");
        C14360o3.A0B(A01, 0);
        AbstractC23641Du.A05(anonymousClass191, new C50120MBu(A0Z, A01, null, 8), AbstractC141776au.A00(A0Z));
    }

    public static final C70791Wh4 A00(C45094JxO c45094JxO, C45525KDq c45525KDq) {
        String str;
        long j = c45094JxO.A01;
        C5QE c5qe = (C5QE) c45094JxO.A04;
        if (c5qe != null) {
            str = JQ0.A0i(c45525KDq, c5qe);
        } else {
            str = null;
        }
        return new C70791Wh4((ImageUrl) c45094JxO.A03, str, JQ0.A0i(c45525KDq, (C5QE) c45094JxO.A02), j, c45094JxO.A05);
    }

    public static final void A02(Activity activity, C45525KDq c45525KDq, String str) {
        InterfaceC09390do interfaceC09390do = c45525KDq.A08;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), str, "appreciation_gift_feed", "appreciation_gift_feed");
        AbstractC25228BEl.A1G(activity, AbstractC31364DqT.A02().A01(AbstractC166987dD.A0r(interfaceC09390do), A01.A03()), AbstractC166987dD.A0o(interfaceC09390do), ModalActivity.class, "profile");
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

    /* JADX WARN: Type inference failed for: r11v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.KHp, X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        ?? obj = new Object();
        HIJ hij = new HIJ(this, new C50356MLi(this, 26));
        V5T v5t = new V5T(this, AbstractC166987dD.A0r(this.A08), new C30480DbP(this, 12), new C30480DbP(this, 13), new C30712DfA(this, 23), new C30750Dfn(this, 5));
        ?? obj2 = new Object();
        C47243KuG c47243KuG = (C47243KuG) this.A04.getValue();
        ?? obj3 = new Object();
        obj3.A00 = c47243KuG;
        return AbstractC16960so.A1Q(obj, hij, v5t, obj2, obj3, new KHJ(C50250MHf.A01(this, 20)), new NEC(C50250MHf.A01(this, 21)));
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C50356MLi(this, 27));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
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
        if (this.mView != null && getRecyclerView().computeVerticalScrollOffset() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45525KDq() {
        C50250MHf A01 = C50250MHf.A01(this, 31);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, C50250MHf.A01(C50250MHf.A01(this, 28), 29));
        this.A09 = AbstractC25225BEi.A0a(C50250MHf.A01(A00, 30), A01, new C29897DGl(37, null, A00), AbstractC25225BEi.A1D(C44553Jmz.class));
        this.A01 = C50250MHf.A00(this, 19);
        this.A03 = C50250MHf.A00(this, 23);
        this.A02 = C50250MHf.A00(this, 22);
        this.A07 = C50250MHf.A00(this, 27);
        this.A05 = C50250MHf.A00(this, 25);
        this.A06 = C50250MHf.A00(this, 26);
        this.A04 = C50250MHf.A00(this, 24);
        this.A08 = AbstractC60492pY.A02(this);
    }

    public static final List A01(C45525KDq c45525KDq, boolean z, boolean z2) {
        L84 l84;
        boolean z3;
        C01L A1I = C0eM.A1I();
        if (z) {
            l84 = new L84();
            l84.A06 = "onboard_banner_start_button_tag";
            l84.A05 = Integer.valueOf(R.drawable.instagram_money_pano_outline_24);
            l84.A03 = 2131953069;
            l84.A02 = 2131953068;
            z3 = false;
        } else {
            if (z2) {
                l84 = new L84();
                l84.A06 = "non_recorded_gifters_disclaimer_dismiss_tag";
                l84.A05 = Integer.valueOf(R.drawable.instagram_gift_box_pano_outline_24);
                l84.A03 = 2131953066;
                z3 = true;
            }
            A1I.add(c45525KDq.A01.getValue());
            return C0eM.A1J(A1I);
        }
        l84.A07 = z3;
        l84.A00 = 1;
        l84.A04 = Integer.valueOf(AbstractC53242c7.A0H(c45525KDq.getContext(), R.attr.igds_color_elevated_separator));
        A1I.add(l84.A00());
        A1I.add(c45525KDq.A01.getValue());
        return C0eM.A1J(A1I);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }
}

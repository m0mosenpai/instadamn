package X;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45814KPt extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A08 = {new AnonymousClass019(C45814KPt.class, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0), new AnonymousClass019(C45814KPt.class, "descriptionText", "getDescriptionText()Landroid/widget/TextView;", 0), new AnonymousClass019(C45814KPt.class, "loadingSpinner", "getLoadingSpinner()Landroid/view/View;", 0)};
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeWaitFragment";
    public CountDownTimer A00;
    public IgdsBottomButtonLayout A01;
    public InterfaceC16820sZ A02 = new MHP(this, 41);
    public final KFH A03;
    public final KFH A04;
    public final KFH A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
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
        this.A01 = AbstractC31172DnG.A0j(view, R.id.bottom_buttons);
        Q3R q3r = new Q3R(this);
        this.A00 = q3r;
        q3r.start();
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A01;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A01;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setSecondaryActionText(getString(2131961808));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A01;
        if (igdsBottomButtonLayout3 != null) {
            KCM.A07(igdsBottomButtonLayout3, this, 56);
            KCM.A06(igdsBottomButtonLayout3, this, 57);
        }
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        InterfaceC09390do interfaceC09390do = this.A07;
        JQ0.A11(this, new GST(this, null, 6), ((C44457JlP) interfaceC09390do.getValue()).A09);
        AbstractC43593JPy.A1E(this, ((C44457JlP) interfaceC09390do.getValue()).A02, new MM0(this, 41), 30);
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
        return KCM.A09(this.A05);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45814KPt() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A06 = MHP.A00(this, enumC09460dv, 34);
        MHP mhp = new MHP(this, 40);
        InterfaceC09390do A00 = MHP.A00(new MHP(this, 37), enumC09460dv, 38);
        this.A07 = AbstractC25225BEi.A0a(new MHP(A00, 39), mhp, new C50172MDz(11, null, A00), AbstractC25225BEi.A1D(C44457JlP.class));
        this.A05 = KCM.A02(this, 36);
        this.A03 = KCM.A02(this, 33);
        this.A04 = KCM.A02(this, 35);
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
        int A02 = C0f9.A02(-1651144218);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A07;
        KPU kpu = ((C44457JlP) interfaceC09390do.getValue()).A07;
        kpu.A05("OTC_RESTORE_WAIT_IMPRESSION");
        kpu.A08("IS_OTC_V2", true);
        C44457JlP c44457JlP = (C44457JlP) interfaceC09390do.getValue();
        JQn.A00(c44457JlP.A03, c44457JlP.A05, c44457JlP, 8);
        ((C44457JlP) interfaceC09390do.getValue()).A0E(false);
        C06C.A01(this, "resendRequestKey", new C30190DRv(this, 20));
        C06C.A01(this, "back_press_key", new C30190DRv(this, 21));
        C0f9.A09(-1470916593, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(84811976);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_otc_wait_fragment, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        A0g.setHeadline(2131961832);
        A0g.setImageResource(R.drawable.ig_illustrations_illo_one_time_code1_refresh);
        LLQ.A05(AbstractC31176DnK.A0C(inflate, R.id.container), this, KCM.A00(this.A06));
        C0f9.A09(638599278, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1112379578);
        super.onDestroy();
        C44457JlP c44457JlP = (C44457JlP) this.A07.getValue();
        C41761wQ c41761wQ = c44457JlP.A05;
        JQn.A00(c44457JlP.A04, c41761wQ, c44457JlP, 9);
        InterfaceC41521w1 interfaceC41521w1 = c44457JlP.A00;
        if (interfaceC41521w1 == null) {
            C14360o3.A0F("fetchPakeMessagesListener");
            throw C00O.createAndThrow();
        }
        JQn.A00(c44457JlP.A03, c41761wQ, interfaceC41521w1, 11);
        C0f9.A09(514949207, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(114611585);
        super.onDestroyView();
        this.A01 = null;
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer == null) {
            C14360o3.A0F("countDownTimer");
            throw C00O.createAndThrow();
        }
        countDownTimer.cancel();
        C0f9.A09(1009228823, A02);
    }
}

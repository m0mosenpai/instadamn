package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.KPv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45816KPv extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A0D = {new AnonymousClass019(C45816KPv.class, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;", 0), new AnonymousClass019(C45816KPv.class, "bottomButtons", "getBottomButtons()Lcom/instagram/igds/components/bottombutton/IgdsBottomButtonLayout;", 0), new AnonymousClass019(C45816KPv.class, "confirmationCodeEditText", "getConfirmationCodeEditText()Lcom/instagram/ui/widget/edittext/ConfirmationCodeEditText;", 0), new AnonymousClass019(C45816KPv.class, "errorText", "getErrorText()Landroid/widget/TextView;", 0), new AnonymousClass019(C45816KPv.class, "descriptionText", "getDescriptionText()Landroid/widget/TextView;", 0), new AnonymousClass019(C45816KPv.class, "loadingSpinner", "getLoadingSpinner()Landroid/view/View;", 0), new AnonymousClass019(C45816KPv.class, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)};
    public static final String __redex_internal_original_name = "EncryptedBackupsOneTimeCodeEnterCodeFragment";
    public final KFH A02;
    public final KFH A03;
    public final KFH A04;
    public final KFH A05;
    public final KFH A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final KFH A0A;
    public final InterfaceC60152ox A0B;
    public final C3I9 A0C;
    public final KFH A01 = KCM.A02(this, 13);
    public InterfaceC16820sZ A00 = new MHP(this, 25);

    @Override // X.KCM, X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        super.configureActionBar(interfaceC56362iU);
        interfaceC56362iU.ARc(true);
        interfaceC56362iU.setIsLoading(false);
    }

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
        double d;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((IgdsHeadline) AbstractC166997dE.A0R(requireView(), R.id.enter_code_headline)).setHeadline(2131961807);
        this.A0C.A9e(this.A0B);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.container);
        InterfaceC09390do interfaceC09390do = this.A07;
        if (AbstractC43594JPz.A1b(interfaceC09390do) && C6CB.A02(AbstractC43593JPy.A0P(interfaceC09390do), 36315928477437765L)) {
            d = 0.85d;
        } else {
            d = 0.75d;
        }
        LLQ.A05(A0C, this, d);
        if (AbstractC43594JPz.A1b(interfaceC09390do)) {
            AbstractC43593JPy.A1Q(AbstractC31469DsD.A00(this.A05));
        }
    }

    public static final ConfirmationCodeEditText A0B(C45816KPv c45816KPv) {
        return (ConfirmationCodeEditText) AbstractC31469DsD.A00(c45816KPv.A0A);
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        String str;
        InterfaceC09390do interfaceC09390do = this.A08;
        JQ0.A11(this, new GST(this, null, 5), ((C44458JlQ) interfaceC09390do.getValue()).A0B);
        JQ0.A11(this, new PYw(this, null, 30), ((C44458JlQ) interfaceC09390do.getValue()).A0E);
        AbstractC43593JPy.A1E(this, ((C44458JlQ) interfaceC09390do.getValue()).A01, new MM0(this, 38), 29);
        KCM.A06((C64P) AbstractC31469DsD.A00(this.A02), this, 53);
        LO2.A00(A0B(this), this, 3);
        A0B(this).setImportantForAutofill(8);
        A0B(this).setOnEditorActionListener(LRN.A00);
        A0B(this).requestFocus();
        AbstractC13880nE.A0S(A0B(this));
        C44458JlQ c44458JlQ = (C44458JlQ) interfaceC09390do.getValue();
        boolean A1Z = AbstractC167007dF.A1Z(this.A09);
        Integer A01 = LLQ.A01(this);
        boolean A1b = AbstractC43594JPz.A1b(this.A07);
        KPU kpu = c44458JlQ.A06;
        if (A1Z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        KPU.A00(kpu, str);
        kpu.A05("OTC_ENTER_PIN_IMPRESSION");
        kpu.A07("RESTORE_TYPE", "OTC");
        kpu.A06("INTERVAL", AbstractC167017dG.A0K(A01));
        kpu.A08("IS_OTC_V2", A1b);
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
        return KCM.A08(this.A06);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45816KPv() {
        MHP mhp = new MHP(this, 24);
        MHP mhp2 = new MHP(this, 21);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = MHP.A00(mhp2, enumC09460dv, 22);
        this.A08 = AbstractC25225BEi.A0a(new MHP(A00, 23), mhp, new C50172MDz(10, null, A00), AbstractC25225BEi.A1D(C44458JlQ.class));
        this.A07 = MHP.A00(this, enumC09460dv, 17);
        this.A0C = C3I7.A01(this, false, false);
        this.A0B = new C48548Ldl(this, 4);
        this.A09 = C1XM.A00(new MHP(this, 26));
        this.A02 = KCM.A02(this, 14);
        this.A0A = KCM.A02(this, 15);
        this.A04 = KCM.A02(this, 18);
        this.A03 = KCM.A02(this, 16);
        this.A05 = KCM.A02(this, 19);
        this.A06 = KCM.A02(this, 20);
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
        int A02 = C0f9.A02(1940959709);
        super.onCreate(bundle);
        if (!AbstractC43594JPz.A1b(this.A07)) {
            ((C44458JlQ) this.A08.getValue()).A0E(false);
        }
        C06C.A01(this, "resendRequestKey", new C30190DRv(this, 18));
        C0f9.A09(1476212315, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-615040536);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_enter_code_fragment, viewGroup, false);
        C0f9.A09(794323178, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-776952603);
        super.onDestroy();
        C44458JlQ c44458JlQ = (C44458JlQ) this.A08.getValue();
        JQn.A00(c44458JlQ.A02, c44458JlQ.A03, c44458JlQ, 7);
        C0f9.A09(2091554187, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-830986116);
        super.onDestroyView();
        this.A0C.EFx(this.A0B);
        C0f9.A09(175449511, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(-1919346047);
        super.onStart();
        this.A0C.Dnr(getActivity());
        C0f9.A09(1456513993, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1739979542);
        super.onStop();
        this.A0C.onStop();
        C0f9.A09(1508875835, A02);
    }
}

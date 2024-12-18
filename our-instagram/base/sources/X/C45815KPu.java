package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.KPu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45815KPu extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A0I = {new AnonymousClass019(C45815KPu.class, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;", 0), new AnonymousClass019(C45815KPu.class, "headline", "getHeadline()Lcom/instagram/igds/components/headline/IgdsHeadline;", 0), new AnonymousClass019(C45815KPu.class, "confirmationCode", "getConfirmationCode()Lcom/instagram/ui/widget/edittext/ConfirmationCodeEditText;", 0), new AnonymousClass019(C45815KPu.class, "bodyTextView", "getBodyTextView()Lcom/instagram/common/ui/base/IgTextView;", 0), new AnonymousClass019(C45815KPu.class, "errorTextView", "getErrorTextView()Lcom/instagram/common/ui/base/IgTextView;", 0), new AnonymousClass019(C45815KPu.class, "bottomActionContainer", "getBottomActionContainer()Landroid/view/ViewGroup;", 0), new AnonymousClass019(C45815KPu.class, "bottomActionButtonView", "getBottomActionButtonView()Lcom/instagram/common/ui/base/IgTextView;", 0), new AnonymousClass019(C45815KPu.class, "ctaLoadingSpinner", "getCtaLoadingSpinner()Lcom/instagram/ui/widget/spinner/SpinnerImageView;", 0), new AnonymousClass019(C45815KPu.class, "scrollView", "getScrollView()Landroidx/core/widget/NestedScrollView;", 0)};
    public static final String __redex_internal_original_name = "EncryptedBackupsPinRestoreFragment";
    public Dialog A00;
    public boolean A02;
    public final KFH A05;
    public final KFH A06;
    public final KFH A07;
    public final KFH A08;
    public final KFH A09;
    public final KFH A0A;
    public final KFH A0B;
    public final KFH A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC60152ox A0G;
    public final C3I9 A0H;
    public final long A03 = 150;
    public final KFH A04 = KCM.A01(this, 5);
    public InterfaceC16820sZ A01 = new MHT(this, 21);

    @Override // X.KCM, X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!LLQ.A08(this)) {
            interfaceC56362iU.EkS(true);
            interfaceC56362iU.ARc(true);
            interfaceC56362iU.setIsLoading(this.A02);
        }
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
        if (LLQ.A08(this)) {
            ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.container);
            InterfaceC09390do interfaceC09390do = this.A0D;
            if (AbstractC43594JPz.A1b(interfaceC09390do) && C6CB.A02(AbstractC43593JPy.A0P(interfaceC09390do), 36315928477437765L)) {
                d = 0.85d;
            } else {
                d = 0.75d;
            }
            LLQ.A05(A0C, this, d);
        }
        KFH kfh = this.A08;
        ((ConfirmationCodeEditText) AbstractC31469DsD.A00(kfh)).A05(null, 6, false, true);
        LO2.A00((ConfirmationCodeEditText) AbstractC31469DsD.A00(kfh), this, 4);
        ((ConfirmationCodeEditText) AbstractC31469DsD.A00(kfh)).A07 = true;
        ((ConfirmationCodeEditText) AbstractC31469DsD.A00(kfh)).setImportantForAutofill(8);
        ((ConfirmationCodeEditText) AbstractC31469DsD.A00(kfh)).setAutofillHints("notApplicable");
        this.A0H.A9e(this.A0G);
        KFH kfh2 = this.A06;
        AbstractC56952jT.A01((IgTextView) AbstractC31469DsD.A00(kfh2));
        C64S.A00((IgTextView) AbstractC31469DsD.A00(kfh2));
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        String str;
        KFH kfh = this.A0B;
        ((IgdsHeadline) AbstractC31469DsD.A00(kfh)).setHeadline(getString(2131969656));
        AbstractC43593JPy.A0D(kfh).setVisibility(0);
        if (AbstractC31174DnI.A1a(EnumC46149Kbn.A04, AbstractC31172DnG.A13(requireArguments(), "BUNDLE_SURFACE"))) {
            configureActionBar((C56352iT) AbstractC31469DsD.A00(this.A04));
        }
        InterfaceC09390do interfaceC09390do = this.A0E;
        AbstractC43593JPy.A1E(this, ((C44460JlS) interfaceC09390do.getValue()).A01, new MM0(this, 43), 31);
        JQ0.A11(this, new GST(this, null, 7), ((C44460JlS) interfaceC09390do.getValue()).A0K);
        JQ0.A11(this, new GST(this, null, 8), ((C44460JlS) interfaceC09390do.getValue()).A0J);
        C44460JlS c44460JlS = (C44460JlS) interfaceC09390do.getValue();
        boolean A1Z = AbstractC167007dF.A1Z(this.A0F);
        Integer A01 = LLQ.A01(this);
        KPU kpu = c44460JlS.A08;
        if (A1Z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        KPU.A00(kpu, str);
        kpu.A05("PIN_RESTORE_IMPRESSION");
        kpu.A07("RESTORE_TYPE", "PIN_CODE");
        kpu.A06("INTERVAL", AbstractC167017dG.A0K(A01));
        JQ0.A11(this, new MBo(this, null, 39), ((C44460JlS) interfaceC09390do.getValue()).A0I);
        C44460JlS c44460JlS2 = (C44460JlS) interfaceC09390do.getValue();
        boolean A02 = C6CB.A02(AbstractC43593JPy.A0P(c44460JlS2.A0E), 2342158937683660525L);
        C05A c05a = c44460JlS2.A0M;
        if (A02) {
            c05a.F8m(EnumC46150Kbo.A02);
            C48519LdH c48519LdH = c44460JlS2.A09;
            C48519LdH.A03(c48519LdH, c44460JlS2.A0B);
            AbstractC25232BEp.A1J(c44460JlS2, new PYw(c44460JlS2, null, 31), c48519LdH.A0O);
            return;
        }
        c05a.F8m(EnumC46150Kbo.A03);
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
        return KCM.A08(this.A0C);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45815KPu() {
        MHT mht = new MHT(this, 20);
        MHT mht2 = new MHT(this, 17);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = MHT.A00(mht2, enumC09460dv, 18);
        this.A0E = AbstractC25225BEi.A0a(new MHT(A00, 19), mht, new C50172MDz(15, null, A00), AbstractC25225BEi.A1D(C44460JlS.class));
        this.A0B = KCM.A01(this, 15);
        this.A08 = KCM.A01(this, 9);
        this.A05 = KCM.A01(this, 6);
        this.A0A = KCM.A01(this, 12);
        this.A07 = KCM.A01(this, 8);
        this.A06 = KCM.A01(this, 7);
        this.A09 = KCM.A01(this, 10);
        this.A0C = KCM.A01(this, 16);
        this.A0F = C1XM.A00(new MHT(this, 22));
        this.A0H = C3I7.A01(this, false, false);
        this.A0G = new C48548Ldl(this, 5);
        this.A0D = MHT.A00(this, enumC09460dv, 11);
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-443297467);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.encrypted_backups_pin_restore_layout, false);
        C0f9.A09(-1477073254, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(293861481);
        super.onDestroyView();
        this.A0H.EFx(this.A0G);
        C0f9.A09(-407514786, A02);
    }

    @Override // X.KCM, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1888263426);
        super.onResume();
        ((ConfirmationCodeEditText) AbstractC31469DsD.A00(this.A08)).postDelayed(new M0T(this), this.A03);
        C0f9.A09(-1582703722, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1380787998);
        super.onStart();
        this.A0H.Dnr(getActivity());
        C0f9.A09(-1875045159, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1817240301);
        super.onStop();
        this.A0H.onStop();
        C0f9.A09(893561827, A02);
    }
}

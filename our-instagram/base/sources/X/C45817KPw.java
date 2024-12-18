package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;

/* renamed from: X.KPw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45817KPw extends KCM implements C51D, InterfaceC60152ox {
    public static final /* synthetic */ C0YR[] A09 = {new AnonymousClass019(C45817KPw.class, "actionBar", "getActionBar()Lcom/instagram/actionbar/ActionBarService;", 0)};
    public static final String __redex_internal_original_name = "EncryptedBackupsPinSetupFragment";
    public IgTextView A00;
    public EnumC46139Kbd A01;
    public IgdsHeadline A02;
    public ConfirmationCodeEditText A03;
    public NestedScrollView A05;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final KFH A06 = KCM.A01(this, 28);
    public InterfaceC16820sZ A04 = new MHT(this, 34);

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
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = (NestedScrollView) view.requireViewById(R.id.container);
        this.A02 = (IgdsHeadline) view.requireViewById(R.id.headline);
        this.A00 = AbstractC31172DnG.A0X(view, R.id.error_text);
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) view.requireViewById(R.id.confirmation_code_edit_text);
        this.A03 = confirmationCodeEditText;
        if (confirmationCodeEditText != null) {
            confirmationCodeEditText.A07 = true;
            confirmationCodeEditText.setImportantForAutofill(8);
            ConfirmationCodeEditText confirmationCodeEditText2 = this.A03;
            if (confirmationCodeEditText2 != null) {
                confirmationCodeEditText2.setAutofillHints("notApplicable");
                ConfirmationCodeEditText confirmationCodeEditText3 = this.A03;
                if (confirmationCodeEditText3 != null) {
                    confirmationCodeEditText3.A05(null, 6, false, false);
                    ConfirmationCodeEditText confirmationCodeEditText4 = this.A03;
                    if (confirmationCodeEditText4 != null) {
                        LO2.A00(confirmationCodeEditText4, this, 5);
                        ConfirmationCodeEditText confirmationCodeEditText5 = this.A03;
                        if (confirmationCodeEditText5 != null) {
                            confirmationCodeEditText5.requestFocus();
                            ConfirmationCodeEditText confirmationCodeEditText6 = this.A03;
                            if (confirmationCodeEditText6 != null) {
                                AbstractC13880nE.A0S(confirmationCodeEditText6);
                                KCM.A04(view, this);
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("confirmationCode");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        NestedScrollView nestedScrollView = this.A05;
        if (nestedScrollView == null) {
            C14360o3.A0F("scrollView");
            throw C00O.createAndThrow();
        }
        AbstractC13880nE.A0Y(nestedScrollView, i);
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        InterfaceC09390do interfaceC09390do = this.A08;
        AbstractC43593JPy.A1E(this, ((C44464JlW) interfaceC09390do.getValue()).A01, new MM0(this, 44), 32);
        JQ0.A11(this, new GST(this, null, 9), ((C44464JlW) interfaceC09390do.getValue()).A0I);
        JQ0.A11(this, new MBo(this, null, 40), new C50540MSt(((C44464JlW) interfaceC09390do.getValue()).A0H, 26));
        C44464JlW c44464JlW = (C44464JlW) interfaceC09390do.getValue();
        KPI kpi = c44464JlW.A08;
        kpi.A07("ENTRY_POINT", AbstractC46735Kls.A00(c44464JlW.A0C));
        kpi.A05("CREATE_PIN_IMPRESSION");
        JQ0.A11(this, new MBo(this, null, 41), ((C44464JlW) interfaceC09390do.getValue()).A0G);
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
        if (this.A05 == null) {
            C14360o3.A0F("scrollView");
            throw C00O.createAndThrow();
        }
        return !AbstractC43592JPx.A1X(r0);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45817KPw() {
        MHT mht = new MHT(this, 33);
        InterfaceC09390do A00 = MHT.A00(new MHT(this, 30), EnumC09460dv.A02, 31);
        this.A08 = AbstractC25225BEi.A0a(new MHT(A00, 32), mht, new C50172MDz(17, null, A00), AbstractC25225BEi.A1D(C44464JlW.class));
        this.A07 = C1XM.A00(new MHT(this, 29));
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
        int A02 = C0f9.A02(1956841816);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.encrypted_backups_pin_setup_layout, false);
        C0f9.A09(-1370002499, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1070350063);
        super.onPause();
        InterfaceC09390do interfaceC09390do = this.A07;
        ((C3I9) interfaceC09390do.getValue()).onStop();
        ((C3I9) interfaceC09390do.getValue()).EFx(this);
        C0f9.A09(155108474, A02);
    }

    @Override // X.KCM, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1997478129);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A07;
        ((C3I9) interfaceC09390do.getValue()).Dnr(requireActivity());
        ((C3I9) interfaceC09390do.getValue()).A9e(this);
        C0f9.A09(-608492520, A02);
    }
}

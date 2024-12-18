package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes8.dex */
public final class KP0 extends AbstractC45802KPh implements C51D {
    public static final /* synthetic */ C0YR[] A05 = KCM.A0A(KP0.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveOnboardingSetupSoftBlockFragment";
    public IgdsBottomButtonLayout A00;
    public Integer A01;
    public InterfaceC16820sZ A02 = C50247MHc.A01(this, 15);
    public final KFH A03;
    public final InterfaceC09390do A04;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_gdrive_onboarding_setup_soft_block_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
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
        return KCM.A08(this.A03);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.EVa, X.KFH] */
    public KP0() {
        C50247MHc A01 = C50247MHc.A01(this, 12);
        InterfaceC09390do A00 = C50247MHc.A00(C50247MHc.A01(this, 16), EnumC09460dv.A02, 17);
        this.A04 = AbstractC25225BEi.A0a(C50247MHc.A01(A00, 18), A01, new C50172MDz(2, null, A00), AbstractC25225BEi.A1D(C44472Jle.class));
        this.A01 = C05F.A0C;
        this.A03 = new C32550EVa(this, C50247MHc.A01(this, 14));
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        String str;
        JQ0.A11(this, new MBo(this, null, 36), new C50540MSt(JQ0.A0Q(this).A08, 25));
        C44472Jle c44472Jle = (C44472Jle) this.A04.getValue();
        Integer A02 = LLQ.A02(this);
        Integer A03 = LLQ.A03(this);
        Integer A01 = LLQ.A01(this);
        C14360o3.A0B(A02, 0);
        C14360o3.A0B(A03, 1);
        KPI kpi = c44472Jle.A01;
        kpi.A03();
        kpi.A05("SOFT_BLOCK_3P_LEADING_SCREEN_IMPRESSION");
        int intValue = A02.intValue();
        if (intValue != 10) {
            if (intValue != 11) {
                if (intValue != 4) {
                    if (intValue == 2) {
                        str = "SETTINGS";
                    }
                    kpi.A07("PERIOD", AbstractC46734Klr.A00(A03));
                    JQ1.A0l(kpi, A01, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
                }
                str = "FISHFOODING";
            } else {
                str = "INBOX_BANNER";
            }
        } else {
            str = "THREAD_EXIT";
        }
        kpi.A07("ENTRY_POINT", str);
        kpi.A07("PERIOD", AbstractC46734Klr.A00(A03));
        JQ1.A0l(kpi, A01, "SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
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
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        int A02 = C0f9.A02(-1297451111);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_onboarding_settings_soft_block_layout, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        View A0S = AbstractC166997dE.A0S(inflate, R.id.text);
        A0g.setHeadline(getString(2131961267));
        if (LLQ.A03(this) != C05F.A0N && LLQ.A03(this) != C05F.A0Y) {
            A0g.setBody(getString(2131961266));
        } else {
            A0S.setVisibility(8);
            C35228FgL A00 = C35228FgL.A00(requireContext(), AbstractC166997dE.A0b());
            KCM.A05(this, A00, 2131961254);
            A00.A04(null, getString(2131961255), R.drawable.instagram_id_card_pano_outline_24);
            C35228FgL.A02(A00, A0g, null, getString(2131961256), R.drawable.instagram_circle_block_off_pano_outline_24);
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(inflate, R.id.bottom_buttons);
        this.A00 = A0j;
        if (A0j != null) {
            KCM.A07(A0j, this, 29);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
        if (igdsBottomButtonLayout2 != null) {
            KCM.A06(igdsBottomButtonLayout2, this, 30);
        }
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && bundle2.getBoolean("BUNDLE_HIDE_MORE_OPTIONS", false) && (igdsBottomButtonLayout = this.A00) != null) {
            igdsBottomButtonLayout.setSecondaryActionText(null);
        }
        KCM.A04(inflate, this);
        C0f9.A09(-255662613, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(287688489);
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(-1961268593, A02);
    }

    @Override // X.KCM, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        int A02 = C0f9.A02(-1613280677);
        super.onResume();
        if (!AbstractC46742Klz.A00(((C44472Jle) this.A04.getValue()).A00, C05F.A15).A08() && (view = this.mView) != null) {
            view.post(new M0R(this));
        }
        C0f9.A09(1640792251, A02);
    }
}

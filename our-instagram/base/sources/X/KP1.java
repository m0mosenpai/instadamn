package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes8.dex */
public final class KP1 extends AbstractC45802KPh implements C51D {
    public static final /* synthetic */ C0YR[] A06 = KCM.A0A(KP1.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveOnboardingSetupHardBlockFragment";
    public IgdsBottomButtonLayout A00;
    public InterfaceC16820sZ A01 = C50247MHc.A01(this, 4);
    public final KFH A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_gdrive_onboarding_setup_hard_block_fragment";
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
        return KCM.A08(this.A02);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.EVa, X.KFH] */
    public KP1() {
        C50247MHc A01 = C50247MHc.A01(this, 3);
        InterfaceC09390do A00 = C50247MHc.A00(C50247MHc.A01(this, 9), EnumC09460dv.A02, 10);
        this.A03 = AbstractC25225BEi.A0a(C50247MHc.A01(A00, 11), A01, new C50172MDz(1, null, A00), AbstractC25225BEi.A1D(C44477Jlj.class));
        this.A02 = new C32550EVa(this, C50247MHc.A01(this, 8));
        this.A05 = C1XM.A00(C50247MHc.A01(this, 6));
        this.A04 = C1XM.A00(C50247MHc.A01(this, 5));
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        String str;
        JQ0.A11(this, new MBo(this, null, 35), new C50540MSt(JQ0.A0Q(this).A08, 24));
        C44477Jlj c44477Jlj = (C44477Jlj) this.A03.getValue();
        Integer A03 = LLQ.A03(this);
        Integer A01 = LLQ.A01(this);
        C14360o3.A0B(A03, 0);
        int intValue = c44477Jlj.A02.intValue();
        if (intValue != 10) {
            if (intValue != 11) {
                if (intValue != 4) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            str = "HARD_BLOCK_3P_LEADING";
                        } else {
                            str = "SETTINGS_GDRIVE_TOGGLE";
                        }
                    } else {
                        str = "SETTINGS";
                    }
                } else {
                    str = "FISHFOODING";
                }
            } else {
                str = "INBOX_BANNER";
            }
        } else {
            str = "THREAD_EXIT";
        }
        KPI kpi = c44477Jlj.A01;
        kpi.A03();
        kpi.A07("ENTRY_POINT", str);
        kpi.A07("SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        kpi.A05("HARD_BLOCK_3P_LEADING_SCREEN_IMPRESSION");
        JQ1.A0l(kpi, A01, "PERIOD", AbstractC46734Klr.A00(A03));
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
        CharSequence charSequence;
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        C35228FgL c35228FgL;
        int A02 = C0f9.A02(-1428089758);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_onboarding_settings_hard_block_layout, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        if (AbstractC167007dF.A1Z(this.A05)) {
            C44477Jlj c44477Jlj = (C44477Jlj) this.A03.getValue();
            InterfaceC09390do interfaceC09390do = this.A04;
            boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do);
            KPI kpi = c44477Jlj.A01;
            kpi.A08("IS_HARD_BLOCK_RELEASE", true);
            kpi.A08("HAS_IMPLICIT_BACKUP", A1Z);
            boolean A1Z2 = AbstractC167007dF.A1Z(interfaceC09390do);
            Boolean A0b = AbstractC166997dE.A0b();
            Context requireContext = requireContext();
            charSequence = null;
            int i = 4;
            if (A1Z2) {
                c35228FgL = new C35228FgL(requireContext, A0b, i);
                KCM.A05(this, c35228FgL, 2131961257);
                c35228FgL.A04(null, getString(2131961258), R.drawable.instagram_id_card_pano_outline_24);
                c35228FgL.A04(null, getString(2131961259), R.drawable.instagram_circle_block_off_pano_outline_24);
            } else {
                c35228FgL = new C35228FgL(requireContext, A0b, i);
                KCM.A05(this, c35228FgL, 2131961262);
                c35228FgL.A04(null, getString(2131961263), R.drawable.instagram_id_card_pano_outline_24);
                c35228FgL.A04(null, getString(2131961264), R.drawable.instagram_circle_block_off_pano_outline_24);
            }
            A0g.setBulletList(c35228FgL.A03());
            int i2 = 2131961261;
            if (AbstractC167007dF.A1Z(interfaceC09390do)) {
                i2 = 2131961260;
            }
            A0g.setHeadline(i2);
            A0g.setImageResource(R.drawable.ig_illustrations_illo_device_warning_refresh);
        } else {
            charSequence = null;
            C35228FgL A00 = C35228FgL.A00(requireContext(), AbstractC166997dE.A0b());
            KCM.A05(this, A00, 2131961254);
            A00.A04(null, getString(2131961255), R.drawable.instagram_id_card_pano_outline_24);
            C35228FgL.A02(A00, A0g, null, getString(2131961256), R.drawable.instagram_circle_block_off_pano_outline_24);
        }
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(inflate, R.id.bottom_buttons);
        this.A00 = A0j;
        if (A0j != null) {
            KCM.A07(A0j, this, 27);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
        if (igdsBottomButtonLayout2 != null) {
            KCM.A06(igdsBottomButtonLayout2, this, 28);
        }
        Bundle bundle2 = this.mArguments;
        if (((bundle2 != null && bundle2.getBoolean("BUNDLE_HIDE_MORE_OPTIONS", false)) || LLQ.A02(this) == C05F.A0C || LLQ.A02(this) == C05F.A0N) && (igdsBottomButtonLayout = this.A00) != null) {
            igdsBottomButtonLayout.setSecondaryActionText(charSequence);
        }
        KCM.A04(inflate, this);
        C0f9.A09(755886452, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1901036587);
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(940039407, A02);
    }

    @Override // X.KCM, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        View view;
        int A02 = C0f9.A02(-748757475);
        super.onResume();
        if (!AbstractC46742Klz.A00(((C44477Jlj) this.A03.getValue()).A00, C05F.A15).A08() && (view = this.mView) != null) {
            view.post(new M0Q(this));
        }
        C0f9.A09(-2126200455, A02);
    }
}

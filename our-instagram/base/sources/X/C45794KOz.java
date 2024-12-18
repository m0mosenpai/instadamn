package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KOz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45794KOz extends AbstractC45802KPh implements C51D {
    public static final /* synthetic */ C0YR[] A08 = KCM.A0A(C45794KOz.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveRestoreFlowV2Fragment";
    public IgdsBottomButtonLayout A00;
    public InterfaceC16820sZ A01 = C50247MHc.A01(this, 40);
    public boolean A02;
    public boolean A03;
    public final KFH A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_gdrive_restore_flow_2";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC45802KPh, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C44462JlU c44462JlU = (C44462JlU) this.A06.getValue();
        boolean A1Z = AbstractC167007dF.A1Z(this.A07);
        Integer A01 = LLQ.A01(this);
        KPU kpu = c44462JlU.A03;
        if (A1Z) {
            str = "DB_DROP";
        } else {
            str = "NORMAL_RESTORE";
        }
        KPU.A00(kpu, str);
        kpu.A05("RESTORE_LANDING_NUX_IMPRESSION");
        kpu.A06("INTERVAL", AbstractC167017dG.A0K(A01));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 47), C07Y.A00(viewLifecycleOwner));
        LLQ.A05(AbstractC31176DnK.A0C(view, R.id.container), this, KCM.A00(this.A05));
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
        return KCM.A08(this.A04);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.EVa, X.KFH] */
    public C45794KOz() {
        C50247MHc A01 = C50247MHc.A01(this, 39);
        C50247MHc A012 = C50247MHc.A01(this, 36);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = C50247MHc.A00(A012, enumC09460dv, 37);
        this.A06 = AbstractC25225BEi.A0a(C50247MHc.A01(A00, 38), A01, new C50172MDz(4, null, A00), AbstractC25225BEi.A1D(C44462JlU.class));
        this.A07 = C1XM.A00(C50247MHc.A01(this, 41));
        this.A04 = new C32550EVa(this, C50247MHc.A01(this, 31));
        this.A05 = C50247MHc.A00(this, enumC09460dv, 30);
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
        int A02 = C0f9.A02(-64491312);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_eb_gdrive_restore_flow_v2_layout, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        A0g.setHeadline(2131961827);
        C35228FgL A00 = C35228FgL.A00(requireContext(), AbstractC166997dE.A0b());
        A00.A04(null, getString(2131961820), R.drawable.instagram_eye_pano_outline_24);
        A00.A04(null, getString(2131961821), R.drawable.instagram_reshare_pano_outline_24);
        C35228FgL.A02(A00, A0g, null, getString(2131961815), R.drawable.instagram_phone_verified_pano_outline_24);
        IgdsBottomButtonLayout A0j = AbstractC31172DnG.A0j(inflate, R.id.bottom_buttons);
        this.A00 = A0j;
        if (A0j != null) {
            KCM.A07(A0j, this, 35);
        }
        C0f9.A09(-1360669227, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1557406564);
        this.A00 = null;
        super.onDestroyView();
        C0f9.A09(-619712821, A02);
    }
}

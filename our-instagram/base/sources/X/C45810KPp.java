package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KPp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45810KPp extends KCM implements C51D {
    public static final /* synthetic */ C0YR[] A04 = KCM.A0A(C45810KPp.class);
    public static final String __redex_internal_original_name = "EncryptedBackupsPinHardblockV2Fragment";
    public final KFH A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "encrypted_backups_pin_hardblock_v2";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59972of
    public final void afterOnViewCreated() {
        C44501Jm7 c44501Jm7 = (C44501Jm7) this.A03.getValue();
        Integer A03 = LLQ.A03(this);
        Integer A01 = LLQ.A01(this);
        C14360o3.A0B(A03, 0);
        KPI kpi = c44501Jm7.A03;
        kpi.A07("ENTRY_POINT", "HARD_BLOCK_PIN_LEADING");
        kpi.A07("SETUP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        kpi.A05("HARD_BLOCK_PIN_LEADING_SCREEN_IMPRESSION");
        JQ1.A0l(kpi, A01, "PERIOD", AbstractC46734Klr.A00(A03));
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
        return KCM.A08(this.A00);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45810KPp() {
        MHT mht = new MHT(this, 0);
        InterfaceC09390do A00 = MHP.A00(new MHP(this, 47), EnumC09460dv.A02, 48);
        this.A03 = AbstractC25225BEi.A0a(new MHP(A00, 49), mht, new C50172MDz(13, null, A00), AbstractC25225BEi.A1D(C44501Jm7.class));
        this.A00 = KCM.A02(this, 46);
        this.A02 = C1XM.A00(new MHP(this, 45));
        this.A01 = C1XM.A00(new MHP(this, 44));
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
        int A02 = C0f9.A02(-1766321481);
        super.onCreate(bundle);
        C44501Jm7 c44501Jm7 = (C44501Jm7) this.A03.getValue();
        if (C6CB.A02(AbstractC43593JPy.A0P(c44501Jm7.A04), 36315928477044543L)) {
            ((AbstractC18600vn) AbstractC166987dD.A17(c44501Jm7.A05)).A01((InterfaceC13060ls) c44501Jm7.A06.getValue());
        }
        C0f9.A09(96770074, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C35228FgL c35228FgL;
        int A02 = C0f9.A02(-1769249382);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.encrypted_backups_pin_hardblock_v2, viewGroup, false);
        IgdsHeadline A0g = AbstractC43594JPz.A0g(inflate);
        if (AbstractC167007dF.A1Z(this.A02)) {
            C44501Jm7 c44501Jm7 = (C44501Jm7) this.A03.getValue();
            InterfaceC09390do interfaceC09390do = this.A01;
            boolean A1Z = AbstractC167007dF.A1Z(interfaceC09390do);
            KPI kpi = c44501Jm7.A03;
            kpi.A08("IS_HARD_BLOCK_RELEASE", true);
            kpi.A08("HAS_IMPLICIT_BACKUP", A1Z);
            boolean A1Z2 = AbstractC167007dF.A1Z(interfaceC09390do);
            Boolean A0b = AbstractC166997dE.A0b();
            Context requireContext = requireContext();
            int i = 4;
            if (A1Z2) {
                c35228FgL = new C35228FgL(requireContext, A0b, i);
                KCM.A05(this, c35228FgL, 2131961281);
                c35228FgL.A04(null, getString(2131961282), R.drawable.instagram_asterisk_pano_outline_24);
            } else {
                c35228FgL = new C35228FgL(requireContext, A0b, i);
                KCM.A05(this, c35228FgL, 2131961283);
                c35228FgL.A04(null, getString(2131961284), R.drawable.instagram_asterisk_pano_outline_24);
                c35228FgL.A04(null, getString(2131961285), R.drawable.instagram_circle_block_off_pano_outline_24);
            }
            A0g.setBulletList(c35228FgL.A03());
            int i2 = 2131961280;
            if (AbstractC167007dF.A1Z(interfaceC09390do)) {
                i2 = 2131961279;
            }
            A0g.setHeadline(i2);
            A0g.setImageResource(R.drawable.ig_illustrations_illo_device_warning_refresh);
        } else {
            C35228FgL A00 = C35228FgL.A00(requireContext(), AbstractC166997dE.A0b());
            KCM.A05(this, A00, 2131961277);
            C35228FgL.A02(A00, A0g, null, getString(2131961278), R.drawable.instagram_key_pano_outline_24);
        }
        KCM.A04(inflate, this);
        C64P c64p = (C64P) AbstractC166997dE.A0R(inflate, R.id.bottom_buttons);
        KCM.A07(c64p, this, 59);
        KCM.A06(c64p, this, 60);
        C0f9.A09(-1000601380, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(359837998);
        super.onDestroy();
        C44501Jm7 c44501Jm7 = (C44501Jm7) this.A03.getValue();
        if (C6CB.A02(AbstractC43593JPy.A0P(c44501Jm7.A04), 36315928477044543L)) {
            ((AbstractC18600vn) AbstractC166987dD.A17(c44501Jm7.A05)).A02((InterfaceC13060ls) c44501Jm7.A06.getValue());
        }
        C0f9.A09(249421532, A02);
    }
}

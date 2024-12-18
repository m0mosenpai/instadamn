package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KNU extends KC7 implements InterfaceC60072op, C51D {
    public static final String __redex_internal_original_name = "AlbumPickerLandingFragment";
    public L11 A00;
    public KNT A01;
    public InterfaceC193828i3 A02;
    public KNV A03;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.KNT, X.KC7, androidx.fragment.app.Fragment, X.2oe] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C189478aR A00;
        ViewGroup viewGroup;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Jn9 A01 = A01();
        boolean A1Z = AbstractC25229BEm.A1Z(bundle);
        Bundle bundle2 = this.mArguments;
        if (A1Z) {
            A01.A06.Egh(Jn9.A00(A01));
        }
        if (bundle2 != null && bundle2.getBoolean("has_album_picker_config", false)) {
            boolean z = bundle2.getBoolean("args_apc__meta_gallery_enabled");
            bundle2.getBoolean("args_is_photo_only");
            A01.A03.A01 = z;
        }
        Bundle A0D = AbstractC31174DnI.A0D(AbstractC25230BEn.A0k(super.A01, 0));
        ?? kc7 = new KC7();
        kc7.setArguments(A0D);
        this.A01 = kc7;
        kc7.setDayNightMode(this.dayNightMode);
        C14240no A0F = AbstractC43593JPy.A0F(this);
        KNT knt = this.A01;
        if (knt == null) {
            C14360o3.A0F("albumPickerFragment");
            throw C00O.createAndThrow();
        }
        A0F.A09(knt, R.id.album_picker_child_fragment_container);
        A0F.A00();
        AbstractC43593JPy.A1E(getViewLifecycleOwner(), AbstractC31172DnG.A0E(A01().A06), new C50260MHp(this, 40), 18);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && bundle3.getBoolean("args_below_status_bar", false) && (A00 = F86.A00(AbstractC25230BEn.A0m(this))) != null && (viewGroup = A00.A03.bottomSheetContainer) != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (iArr[1] < AbstractC13880nE.A0B(requireContext())) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = AbstractC13880nE.A0B(requireContext()) - iArr[1];
                    }
                } else {
                    marginLayoutParams = null;
                }
                viewGroup.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static final void A00(KNU knu) {
        KNV knv = knu.A03;
        if (knv != null) {
            C14240no A0F = AbstractC43593JPy.A0F(knu);
            int[] iArr = C189448aO.A1X;
            A0F.A07(iArr[0], iArr[3], 0, 0);
            A0F.A03(knv);
            A0F.A00();
            knu.A03 = null;
        }
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
        RecyclerView recyclerView;
        String str;
        KNV knv = this.A03;
        if (knv != null) {
            recyclerView = knv.A00;
            if (recyclerView == null) {
                str = "albumsRecyclerview";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            return !AbstractC43592JPx.A1X(recyclerView);
        }
        KNT knt = this.A01;
        if (knt == null) {
            str = "albumPickerFragment";
        } else {
            recyclerView = knt.A00;
            if (recyclerView == null) {
                str = "parentRecyclerview";
            }
            return !AbstractC43592JPx.A1X(recyclerView);
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
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
        int A02 = C0f9.A02(2036535500);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.album_picker_landing_fragment_layout, viewGroup, false);
        C0f9.A09(-438128147, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1414703791);
        super.onPause();
        A01().A00 = null;
        A01().A03.A00.A08();
        C0f9.A09(-1146646924, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(728823698);
        super.onResume();
        C48263LXm c48263LXm = A01().A03;
        c48263LXm.A00.A09();
        C18U.A06(C06090Tz.A05, c48263LXm.A03, 36322452522936570L);
        c48263LXm.A03();
        A01().A00 = this.A02;
        C0f9.A09(-1257622045, A02);
    }
}

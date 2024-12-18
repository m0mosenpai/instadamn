package X;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.friendmap.view.fragment.FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.KCd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45488KCd extends AbstractC59962oe implements InterfaceC60072op, InterfaceC86363t8, C51D {
    public static final String __redex_internal_original_name = "FriendMapUpdatesBottomSheetFragment";
    public C66362zD A00;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final String A08;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A05 = MHN.A00(this, 32);
    public final InterfaceC09390do A01 = MHN.A00(this, 26);

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void CwR(Integer num, float f) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5o() {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void D5p(Integer num) {
    }

    @Override // X.InterfaceC86363t8
    public final /* synthetic */ void Dyj(C51752Mtb c51752Mtb) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A06;
        AbstractC31178DnM.A0z(this, (RecyclerView) AbstractC166987dD.A17(interfaceC09390do));
        C66392zG c66392zG = new C66392zG(getLayoutInflater());
        c66392zG.A01(new KJY(AbstractC166987dD.A0r(this.A04), new C47448Kxd(this)));
        this.A00 = AbstractC31173DnH.A0R(c66392zG, new Object());
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A17(interfaceC09390do);
        C66362zD c66362zD = this.A00;
        if (c66362zD == null) {
            C14360o3.A0F("notesAdapter");
            throw C00O.createAndThrow();
        }
        recyclerView.setAdapter(c66362zD);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 47), C07Y.A00(viewLifecycleOwner));
        InterfaceC09390do interfaceC09390do2 = this.A03;
        ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do2)).A0B = new C49664Lwv(this, 1);
        ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do2)).A0C = new C31703Dw8(this, 5);
        int A09 = AbstractC167007dF.A09(getContext(), R.attr.igds_color_secondary_icon);
        ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do2)).setCompoundDrawableTintList(ColorStateList.valueOf(A09));
        ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do2)).setClearButtonColorFilter(C3DY.A00(A09));
        ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do2)).setSearchIconEnabled(true);
        ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do2)).setClearButtonEnabled(true);
        C3DN A0m = AbstractC25230BEn.A0m(this);
        if (A0m != null) {
            ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do2)).setOnFocusChangeListener(new LQ4(2, A0m, this));
            A0m.A0R(this);
        }
    }

    public static final void A00(C45488KCd c45488KCd) {
        InterfaceC09390do interfaceC09390do = c45488KCd.A03;
        if (((SearchEditText) AbstractC166987dD.A17(interfaceC09390do)).hasFocus()) {
            ((SearchEditText) AbstractC166987dD.A17(interfaceC09390do)).clearFocus();
            AbstractC13880nE.A0O((SearchEditText) AbstractC166987dD.A17(interfaceC09390do));
        }
    }

    @Override // X.InterfaceC86363t8
    public final void DId(Integer num) {
        LLR.A06(new LLR(this, AbstractC31180DnO.A0M(this.A04)), null, null, null, null, "BOTTOM_SHEET", null, "FULLSCREEN");
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A08;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
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
        return !AbstractC43592JPx.A1X(AbstractC167007dF.A0L(this.A06));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        L0B l0b;
        FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig friendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig = (FriendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig) this.A05.getValue();
        if (friendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig != null && (l0b = friendMapUpdatesBottomSheetFragment$Companion$FriendMapUpdateLaunchConfig.A00) != null) {
            l0b.A00.invoke();
            return false;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C45488KCd() {
        MHN mhn = new MHN(this, 34);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new MHN(new MHN(this, 29), 30));
        this.A07 = AbstractC25225BEi.A0a(new MHN(A00, 31), mhn, new ME1(43, null, A00), AbstractC25225BEi.A1D(C45998KXm.class));
        this.A06 = MHN.A00(this, 33);
        this.A02 = MHN.A00(this, 27);
        this.A03 = MHN.A00(this, 28);
        this.A08 = __redex_internal_original_name;
    }

    @Override // X.InterfaceC86363t8
    public final void DB6() {
        A00(this);
    }

    @Override // X.InterfaceC86363t8
    public final void DZk(int i, int i2) {
        int abs;
        C3DN A0m = AbstractC25230BEn.A0m(this);
        if (A0m != null) {
            int A08 = A0m.A08();
            float f = A08 * 0.2f;
            if (i == 0) {
                abs = 0;
            } else {
                abs = Math.abs(A08 - i);
            }
            if (abs < f) {
                A00(this);
            }
        }
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
        int A02 = C0f9.A02(945890431);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.friend_map_updates_bottom_sheet, false);
        C0f9.A09(304237902, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        int A02 = C0f9.A02(-109067600);
        super.onDestroy();
        C3DN A0m = AbstractC25230BEn.A0m(this);
        if (A0m == null) {
            i = 455852634;
        } else {
            A0m.A0S(this);
            i = 1198841548;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.InterfaceC86363t8
    public final void CwQ(float f) {
        A00(this);
    }
}

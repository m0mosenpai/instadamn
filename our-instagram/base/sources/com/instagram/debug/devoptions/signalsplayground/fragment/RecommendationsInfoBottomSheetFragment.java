package com.instagram.debug.devoptions.signalsplayground.fragment;

import X.AbstractC118155Vz;
import X.AbstractC118175Wb;
import X.AbstractC118255Wn;
import X.AbstractC118375Wz;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25227BEk;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25231BEo;
import X.AbstractC25232BEp;
import X.AbstractC25233BEq;
import X.AbstractC25235BEs;
import X.AbstractC25236BEt;
import X.AbstractC25319BIo;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C0f9;
import X.C0fH;
import X.C1130158n;
import X.C117505Tk;
import X.C118125Vw;
import X.C118195Wf;
import X.C51D;
import X.C59P;
import X.C5Tl;
import X.C5UU;
import X.C5WR;
import X.C5X2;
import X.C5X3;
import X.C5X8;
import X.C5XJ;
import X.C5YD;
import X.C5YS;
import X.EnumC27385C6o;
import X.InterfaceC09390do;
import X.InterfaceC1127857k;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC56392iX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class RecommendationsInfoBottomSheetFragment extends AbstractC59962oe implements C51D {
    public static final int $stable = 8;
    public static final Companion Companion = new Object();
    public final InterfaceC09390do session$delegate = AbstractC60492pY.A02(this);
    public final String moduleName = "recommendations_info_bottom_sheet";

    /* loaded from: classes5.dex */
    public final class Companion {
        public final RecommendationsInfoBottomSheetFragment newInstance() {
            return new RecommendationsInfoBottomSheetFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ boolean collapseToPartialStateOnClickXButton() {
        return false;
    }

    @Override // X.C51D
    public /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public /* synthetic */ void onDragStarted() {
    }

    @Override // X.C51D
    public /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RecommendationsInfoBottomSheetContent(C5Tl c5Tl, int i) {
        if (AbstractC25235BEs.A1W(c5Tl, 1242257684)) {
            C0fH.A01(1988726799, "com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment.RecommendationsInfoBottomSheetContent (RecommendationsInfoBottomSheetFragment.kt:46)");
        }
        Modifier A0L = AbstractC25227BEk.A0L(Modifier.A00, 16.0f);
        InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A01(16.0f), c5Tl);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, A0L);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A0a, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_face2_pano_outline_24, 2131957201, 2131957200, c5Tl, 4096);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_face3_pano_outline_24, 2131957199, 2131957198, c5Tl, 4096);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_face4_pano_outline_24, 2131957197, 2131957196, c5Tl, 4096);
        RecommendationsInfoBottomSheetRow(R.drawable.instagram_comment_pano_outline_24, 2131957189, 2131957188, c5Tl, 4096);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(-543190006);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetContent$2(this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RecommendationsInfoBottomSheetRow(int i, int i2, int i3, C5Tl c5Tl, int i4) {
        int i5;
        C118125Vw A00;
        C118125Vw A002;
        c5Tl.Enr(-1003933104);
        if ((i4 & 14) == 0) {
            i5 = AbstractC25232BEp.A08(c5Tl, i) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            i5 |= AbstractC25232BEp.A09(c5Tl, i2);
        }
        if ((i4 & 896) == 0) {
            i5 |= AbstractC25236BEt.A03(c5Tl, i3);
        }
        if ((i5 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2018478532, "com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment.RecommendationsInfoBottomSheetRow (RecommendationsInfoBottomSheetFragment.kt:71)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 16.0f, 0.0f);
            InterfaceC1127857k A003 = AbstractC118375Wz.A00(AbstractC118255Wn.A01(16.0f), c5Tl, C118195Wf.A05);
            int A004 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A003, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C5YS.A01(c5Tl, null, AbstractC25226BEj.A0Y(c5Tl, i5, i), 56, 20, AbstractC25226BEj.A0F(c5Tl));
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A005 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A005);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            String A006 = C5YD.A00(c5Tl, i2);
            A00 = C118125Vw.A00(null, null, AbstractC25226BEj.A0h(c5Tl), null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, AbstractC118155Vz.A01(18));
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 8.0f), A00, A006, AbstractC25226BEj.A0G(c5Tl));
            String A007 = C5YD.A00(c5Tl, i3);
            A002 = C118125Vw.A00(null, null, AbstractC25226BEj.A0c(c5Tl), null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, AbstractC118155Vz.A01(18));
            C5WR.A0u(c5Tl, A002, A007, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(596363016);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new RecommendationsInfoBottomSheetFragment$RecommendationsInfoBottomSheetRow$2(this, i, i2, i3, i4);
        }
    }

    @Override // X.C51D
    public /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.moduleName;
    }

    @Override // X.C51E
    public /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-748029230);
        ComposeView A00 = AbstractC25319BIo.A00(this, new RecommendationsInfoBottomSheetFragment$onCreateView$1(this), -1415700585);
        C0f9.A09(1895971072, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe
    public UserSession getSession() {
        return AbstractC166987dD.A0r(this.session$delegate);
    }
}

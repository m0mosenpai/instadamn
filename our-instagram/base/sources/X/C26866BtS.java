package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.BtS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26866BtS extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "AiAudienceSelectionFragment";
    public InterfaceC31032DkW A00;
    public final InterfaceC09390do A06 = AbstractC25225BEi.A0a(DGW.A00(this, 22), DGW.A00(this, 21), new C29898DGm(11, null, this), AbstractC25235BEs.A0x());
    public final InterfaceC09390do A03 = AbstractC25225BEi.A0a(DGW.A00(this, 23), DGW.A00(this, 19), new C29898DGm(12, null, this), AbstractC25235BEs.A0y());
    public final InterfaceC09390do A04 = C1XM.A00(DGW.A00(this, 20));
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);
    public final String A07 = "update_status_guidance_bottom_Sheet";
    public final InterfaceC09390do A02 = C1XM.A00(DGW.A00(this, 18));
    public InterfaceC16820sZ A01 = D9x.A00;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
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
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final int A00(List list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C51741MtQ) it.next()).A04 && (i = i + 1) < 0) {
                    AbstractC16960so.A1T();
                    throw C00O.createAndThrow();
                }
            }
        }
        return i + 1;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    @Deprecated(message = "Use the new compose version of this method instead")
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC31032DkW interfaceC31032DkW;
        super.onActivityResult(i, i2, intent);
        if (i == 1993 && (interfaceC31032DkW = this.A00) != null) {
            interfaceC31032DkW.D5d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-823812594);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30505Dbo(this, 22), 816682528);
        C0f9.A09(-2015805665, A02);
        return A00;
    }
}

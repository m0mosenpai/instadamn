package X;

import android.os.Bundle;
import android.view.View;
import java.util.Collection;

/* loaded from: classes9.dex */
public abstract class N7s extends AbstractC43842Ja5 implements C51D {
    public static final String __redex_internal_original_name = "IgLiveBaseAvatarGridRecyclerFragment";
    public final InterfaceC09390do A00 = C57547PgL.A00(this, 14);
    public final InterfaceC09390do A02 = C57547PgL.A00(this, 16);
    public final InterfaceC09390do A01 = C57547PgL.A00(this, 15);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57755Pji.A02(this, 3));
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 48), C07Y.A00(viewLifecycleOwner));
        C64P c64p = (C64P) this.A01.getValue();
        if (c64p != null) {
            c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC35682FpH(this, 52));
        }
    }

    public final AbstractC31842Dz3 A0C() {
        InterfaceC09390do interfaceC09390do;
        if (this instanceof C52826NZj) {
            interfaceC09390do = ((C52826NZj) this).A03;
        } else if (this instanceof C52824NZh) {
            interfaceC09390do = ((C52824NZh) this).A03;
        } else if (this instanceof C52825NZi) {
            interfaceC09390do = ((C52825NZi) this).A03;
        } else {
            interfaceC09390do = ((C52823NZg) this).A01;
        }
        return (AbstractC31842Dz3) interfaceC09390do.getValue();
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

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EXF(this));
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
}

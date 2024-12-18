package X;

import android.content.DialogInterface;
import android.view.View;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;

/* renamed from: X.P2t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56406P2t implements InterfaceC145226gh, C51D, C51E {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56406P2t(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void Cul() {
    }

    @Override // X.InterfaceC145226gh
    public final void DB7() {
        switch (this.A00) {
            case 0:
                ImmersiveReplyControlMenuViewBinder.A02(EnumC27377C6g.A02, (InterfaceC24901Jp) this.A01);
                return;
            case 1:
                Object obj = ((C15370ps) this.A01).A00;
                if (obj == null) {
                    return;
                }
                MXB mxb = (MXB) this.A02;
                if (!obj.equals(mxb.A01)) {
                    return;
                }
                mxb.A01 = null;
                mxb.A02 = null;
                AnonymousClass229.A01(mxb.A08).A1m("EXIT_DIALOG_CANCEL");
                return;
            case 2:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(C55909Os0.A0X);
                    InterfaceC146936jV interfaceC146936jV = (InterfaceC146936jV) this.A02;
                    if (interfaceC146936jV == null) {
                        return;
                    }
                    interfaceC146936jV.onDismiss();
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 3:
                C64480TFq c64480TFq = (C64480TFq) this.A02;
                C64480TFq.A01(c64480TFq, "ctc_confirmation_dialog_cancel");
                C218914p.A06(c64480TFq);
                C145726hV c145726hV = (C145726hV) this.A01;
                if (c145726hV == null) {
                    return;
                }
                c145726hV.A00();
                return;
            default:
                C31535DtK c31535DtK = (C31535DtK) this.A02;
                String A0g = AbstractC31171DnF.A0g(this.A01);
                C19280xC A00 = C19280xC.A00(c31535DtK, "following_overflow_menu_cancelled");
                A00.A0C("target_id", A0g);
                AbstractC31173DnH.A1S(A00, C31535DtK.A03(c31535DtK));
                return;
        }
    }

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void DkJ(View view, int i) {
        switch (this.A00) {
            case 1:
                Object obj = ((C15370ps) this.A01).A00;
                if (obj == null) {
                    return;
                }
                MXB mxb = (MXB) this.A02;
                if (!obj.equals(mxb.A01)) {
                    return;
                }
                mxb.A01 = null;
                mxb.A02 = null;
                return;
            case 2:
                DialogInterface.OnDismissListener onDismissListener = (DialogInterface.OnDismissListener) this.A01;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(C55909Os0.A0X);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 3:
                C145726hV c145726hV = (C145726hV) this.A01;
                if (c145726hV == null) {
                    return;
                }
                c145726hV.A00();
                return;
            default:
                return;
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
    public final /* synthetic */ boolean isScrolledToTop() {
        if (4 - this.A00 != 0) {
            return true;
        }
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
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

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }
}

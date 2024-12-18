package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes9.dex */
public final class PHU implements C51D, InterfaceC57953Pmz, InterfaceC57954Pn0 {
    public final /* synthetic */ MWZ A00;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public PHU(MWZ mwz) {
        this.A00 = mwz;
    }

    @Override // X.InterfaceC57954Pn0
    public final void DhH() {
        MWZ.A00(this.A00);
    }

    @Override // X.InterfaceC57953Pmz
    public final /* bridge */ /* synthetic */ void Dhr(Object obj) {
        int[] iArr;
        UQE uqe = (UQE) obj;
        C14360o3.A0B(uqe, 0);
        C153506vL c153506vL = this.A00.A03;
        String str = uqe.A00;
        String str2 = uqe.A01;
        String str3 = c153506vL.A0C;
        if (str3 == null) {
            C14360o3.A0F("profileUserId");
            throw C00O.createAndThrow();
        }
        AbstractC167017dG.A1P(str, str2);
        FragmentActivity requireActivity = c153506vL.requireActivity();
        UserSession session = c153506vL.getSession();
        String A00 = AbstractC111324zv.A00(2068);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("igtv_series_id_arg", str);
        A0b.putString("igtv_series_name_arg", str2);
        A0b.putString("igtv_series_user_id_arg", str3);
        A0b.putString(AbstractC43591JPw.A00(1075), A00);
        OTC otc = OTC.A01;
        if (otc == null) {
            otc = new OTC();
            OTC.A01 = otc;
        }
        C14360o3.A0A(otc);
        long currentTimeMillis = System.currentTimeMillis();
        long j = otc.A00;
        if (j == -1 || currentTimeMillis - j > 450) {
            otc.A00 = currentTimeMillis;
            C6XJ A0L = AbstractC31171DnF.A0L(requireActivity, A0b, session, ModalActivity.class, "igtv_series");
            if (C2U7.A00) {
                iArr = OTC.A03;
            } else {
                iArr = OTC.A02;
            }
            A0L.A0J = iArr;
            A0L.A0I = true;
            A0L.A0G = false;
            A0L.A0C(requireActivity);
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
        return false;
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
        this.A00.A00 = null;
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

package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.J1d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43037J1d implements InterfaceC43588JPt {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C75113Zb A02;
    public final /* synthetic */ C3YE A03;
    public final /* synthetic */ C3YD A04;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C43037J1d(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, C3YE c3ye, C3YD c3yd) {
        this.A01 = c38321qM;
        this.A00 = userSession;
        this.A04 = c3yd;
        this.A03 = c3ye;
        this.A02 = c75113Zb;
    }

    @Override // X.InterfaceC43588JPt
    public final void Dei() {
        C38321qM c38321qM = this.A01;
        UserSession userSession = this.A00;
        boolean A6a = c38321qM.A6a(userSession);
        C3YD c3yd = this.A04;
        if (A6a) {
            Context context = c3yd.A0F;
            C3YE c3ye = this.A03;
            c3yd.A0H(AbstractC76193bO.A03(context, userSession, c38321qM, c3ye));
            c3yd.A0F(AbstractC76193bO.A00(context, userSession, c38321qM, c3ye));
            return;
        }
        c3yd.A0A();
        C75113Zb c75113Zb = this.A02;
        c75113Zb.A0k(false);
        c75113Zb.A07(c75113Zb.A03, this.A03.ordinal()).A00 = C05F.A00;
        c3yd.A0D();
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

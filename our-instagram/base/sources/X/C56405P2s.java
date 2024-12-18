package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.P2s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56405P2s implements InterfaceC145226gh {
    public final /* synthetic */ C41181vS A00;
    public final /* synthetic */ C41551w4 A01;
    public final /* synthetic */ C145176gc A02;

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void Cul() {
    }

    @Override // X.InterfaceC145226gh
    public final /* synthetic */ void DkJ(View view, int i) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public C56405P2s(C41181vS c41181vS, C41551w4 c41551w4, C145176gc c145176gc) {
        this.A02 = c145176gc;
        this.A00 = c41181vS;
        this.A01 = c41551w4;
    }

    @Override // X.InterfaceC145226gh
    public final void DB7() {
        String str;
        C145176gc c145176gc = this.A02;
        InterfaceC1118853a interfaceC1118853a = c145176gc.A18;
        interfaceC1118853a.EJJ();
        C41181vS c41181vS = this.A00;
        C41551w4 c41551w4 = this.A01;
        UserSession userSession = c145176gc.A09;
        String str2 = null;
        if (userSession != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!AbstractC167017dG.A1b(A00, A00.A5k, C23031Ai.A8c, 374)) {
                UserSession userSession2 = c145176gc.A09;
                if (userSession2 != null) {
                    InterfaceC60442pS interfaceC60442pS = c145176gc.A16;
                    String str3 = c41181vS.A0j;
                    User user = c41181vS.A0i;
                    if (user != null) {
                        str2 = user.getId();
                    }
                    if (c41551w4.A0H.A0i()) {
                        str = "story_highlight_action_sheet";
                    } else {
                        str = "location_story_action_sheet";
                    }
                    AbstractC73317Y7a.A0B(interfaceC60442pS, userSession2, str3, str2, str);
                    c145176gc.A1A.A00(c41181vS, c41551w4, EnumC148806mp.A0Q, interfaceC1118853a.Av7());
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
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

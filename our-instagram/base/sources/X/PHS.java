package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import instagram.features.stories.fragment.ReelViewerFragment;

/* loaded from: classes9.dex */
public final class PHS implements C51D {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ C145176gc A02;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public PHS(FragmentActivity fragmentActivity, C41181vS c41181vS, C145176gc c145176gc) {
        this.A02 = c145176gc;
        this.A00 = fragmentActivity;
        this.A01 = c41181vS;
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
    public final void onBottomSheetClosed() {
        String str;
        C145176gc c145176gc = this.A02;
        C3I9 c3i9 = c145176gc.A0A;
        if (c3i9 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            c3i9.A9e(c145176gc.A15);
            UserSession userSession = c145176gc.A09;
            str = "userSession";
            if (userSession != null) {
                if (AbstractC166987dD.A0x(userSession).getBoolean("has_created_highlight_from_active_story", false)) {
                    UserSession userSession2 = c145176gc.A09;
                    if (userSession2 != null) {
                        if (!AbstractC166987dD.A0x(userSession2).getBoolean("has_seen_highlights_nux_dialog", false)) {
                            InterfaceC1118853a interfaceC1118853a = c145176gc.A18;
                            ((ReelViewerFragment) interfaceC1118853a).A2p = true;
                            FragmentActivity fragmentActivity = this.A00;
                            UserSession userSession3 = c145176gc.A09;
                            if (userSession3 != null) {
                                C145906hn c145906hn = c145176gc.A0d;
                                if (c145906hn == null) {
                                    str = "reelProfileOpener";
                                } else {
                                    OC7 oc7 = new OC7(fragmentActivity, userSession3, interfaceC1118853a, c145906hn);
                                    ImageUrl A06 = this.A01.A06();
                                    if (A06 != null) {
                                        InterfaceC60442pS interfaceC60442pS = c145176gc.A16;
                                        FragmentActivity fragmentActivity2 = oc7.A00;
                                        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity2);
                                        A0H.A0k(new C89533yt(A06, interfaceC60442pS.getModuleName(), AbstractC166987dD.A0C(fragmentActivity2, 100), AbstractC166987dD.A0C(fragmentActivity2, 4), fragmentActivity2.getColor(AbstractC53242c7.A0D(fragmentActivity2)), AbstractC166987dD.A0C(fragmentActivity2, 2), AbstractC167007dF.A09(fragmentActivity2, R.attr.igds_color_stroke), MSX.A02(fragmentActivity2), false));
                                        A0H.A0A(2131963597);
                                        A0H.A09(2131963596);
                                        A0H.A0J(DialogInterfaceOnClickListenerC55320Ogi.A00(oc7, 30), 2131963598);
                                        A0H.A0I(DialogInterfaceOnClickListenerC55320Ogi.A00(oc7, 29), 2131961124);
                                        DialogInterfaceOnDismissListenerC55324Ogm.A00(A0H, oc7, 17);
                                        AbstractC166987dD.A1W(A0H);
                                        AbstractC31177DnL.A1N(AbstractC166987dD.A0x(oc7.A01), "has_seen_highlights_nux_dialog", true);
                                        return;
                                    }
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                        }
                    }
                }
                c145176gc.A18.EJJ();
                return;
            }
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
}

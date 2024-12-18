package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HCm extends AbstractC59962oe implements InterfaceC189488aT, C51D {
    public static final String __redex_internal_original_name = "ClipsInteractiveDashboardFragment";
    public C120985dq A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public final boolean A02 = true;
    public final boolean A03 = true;

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -1;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_interactive_dashboard";
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return this.A02;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
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

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return this.A03;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
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
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1222587579);
        super.onCreate(bundle);
        if (bundle == null) {
            requireArguments();
        }
        C0f9.A09(1450942733, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int A02 = C0f9.A02(1942272245);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.clips_interactive_dashboard, viewGroup, false);
        View A0c = AbstractC166987dD.A0c(inflate, R.id.results_container);
        C120985dq c120985dq = this.A00;
        if (c120985dq != null) {
            UserSession A0r = AbstractC166987dD.A0r(this.A01);
            C14360o3.A0B(A0r, 2);
            boolean z2 = true;
            if (AbstractC140306Wi.A00(c120985dq) != null) {
                View inflate2 = ((ViewStub) inflate.findViewById(R.id.poll_result)).inflate();
                C14360o3.A07(inflate2);
                new IM2(inflate2).A00(A0r, c120985dq);
                z = true;
            } else {
                z = false;
            }
            if (AbstractC97594Zu.A01(c120985dq) != null) {
                if (z) {
                    AbstractC31176DnK.A1E(A0c, R.id.divider_1, 0);
                }
                View inflate3 = ((ViewStub) inflate.findViewById(R.id.quiz_result)).inflate();
                C14360o3.A07(inflate3);
                new IM3(inflate3, null).A00(c120985dq);
            } else {
                z2 = z;
            }
            C38321qM BQN = c120985dq.BQN();
            if (AbstractC140316Wj.A00(BQN) != null && BQN != null) {
                if (z2) {
                    AbstractC31176DnK.A1E(A0c, R.id.divider_2, 0);
                }
                View inflate4 = ((ViewStub) inflate.findViewById(R.id.slider_result)).inflate();
                C14360o3.A07(inflate4);
                new C69596Vrz(inflate4).A00(A0r, BQN);
            }
            C0f9.A09(2044420371, A02);
            return inflate;
        }
        C14360o3.A0F("clipsItem");
        throw C00O.createAndThrow();
    }
}

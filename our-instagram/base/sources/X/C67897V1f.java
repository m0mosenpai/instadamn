package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.V1f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67897V1f extends C38K implements C51D, InterfaceC77483dY, InterfaceC58093PpI {
    public static final String __redex_internal_original_name = "ReportingConfirmationV2BottomSheetFragment";
    public LinearLayout A00;
    public UserSession A01;
    public C189478aR A02;
    public IgdsButton A03;
    public User A04;
    public VgT A05;
    public C70155WDf A06;
    public V2X A07;
    public EnumC65855TvH A08;
    public C67844UzI A09;
    public C69174Vj3 A0A;

    @Override // X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void D4B(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHr(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHs(User user) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHt(ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT) {
    }

    @Override // X.InterfaceC77483dY
    public final void DHu(EnumC33402EpZ enumC33402EpZ, User user) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reporting_confirmation_v2_bottom_sheet_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    private boolean A01() {
        EnumC65855TvH enumC65855TvH = this.A08;
        if (enumC65855TvH != null) {
            switch (enumC65855TvH.ordinal()) {
                case 6:
                case 20:
                case 27:
                case 37:
                case 52:
                case 53:
                case 67:
                case 68:
                    return AbstractC31178DnM.A1X(C06090Tz.A05, this.A01, 36326829094615189L);
            }
        }
        return false;
    }

    @Override // X.C38K
    public final AbstractC12990ll A0X() {
        return this.A01;
    }

    @Override // X.InterfaceC58093PpI
    public final void DkS(VDA vda) {
        C70155WDf c70155WDf = this.A06;
        if (c70155WDf != null) {
            c70155WDf.A07((short) 2);
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
        return true;
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        AbstractC43594JPz.A17(this.A00, i, i2);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.InterfaceC58093PpI
    public final void DkT(VDA vda) {
        int ordinal = vda.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 && this.A04 != null) {
                FragmentActivity requireActivity = requireActivity();
                UserSession userSession = this.A01;
                User user = this.A04;
                C189478aR c189478aR = this.A02;
                AbstractC167017dG.A1R(userSession, user);
                C35199Ffr c35199Ffr = new C35199Ffr(null, null, null, null, "reporting_confirmation_v2_bottom_sheet_fragment", "frx_flow", user.B7L().name(), null, "DEFAULT", "DEFAULT", AbstractC166997dE.A0n(), user.BJ8());
                C36764GIn c36764GIn = new C36764GIn(requireActivity, this, null, null, null, userSession, user, null);
                C189448aO c189448aO = new C189448aO(userSession);
                AbstractC25225BEi.A1Q(c189448aO, true);
                c189448aO.A0x = true;
                F7C.A00(requireActivity, this, null, userSession, null, c189478aR, c189448aO, user, c35199Ffr, null, c36764GIn);
                return;
            }
            return;
        }
        if (this.A04 == null) {
            return;
        }
        FragmentActivity requireActivity2 = requireActivity();
        UserSession userSession2 = this.A01;
        User user2 = this.A04;
        AbstractC167017dG.A1P(userSession2, user2);
        AbstractC35261Fgv.A04(requireActivity2, userSession2, this, user2, "reporting_report_confirmation_bottom_sheet", "reporting_confirmation_v2_bottom_sheet_fragment", null, false);
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0232, code lost:
    
        if (r5 == 0) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [X.VJI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, X.VJm] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67897V1f.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1835594407);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(requireContext()), viewGroup, R.layout.frx_report_confirmation_fragment);
        C0f9.A09(-795872490, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-997909196);
        super.onDestroyView();
        C70155WDf c70155WDf = this.A06;
        if (c70155WDf != null) {
            c70155WDf.A01();
        }
        this.A03 = null;
        this.A00 = null;
        C0f9.A09(-87976973, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C70155WDf c70155WDf = this.A06;
        if (c70155WDf != null) {
            c70155WDf.A07((short) 2);
        }
        if (A01()) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.frx_report_confirmation_button_wrapper);
            this.A00 = linearLayout;
            AbstractC167007dF.A0w(linearLayout);
            IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.frx_report_confirmation_close_button);
            this.A03 = igdsButton;
            if (igdsButton != null) {
                igdsButton.setText(2131961124);
                C0fQ.A00(new WNS(this, 46), this.A03);
            }
        }
    }
}

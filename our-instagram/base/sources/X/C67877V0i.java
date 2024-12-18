package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.user.model.User;

/* renamed from: X.V0i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67877V0i extends AbstractC59962oe implements InterfaceC11380iw, C51D {
    public static final String __redex_internal_original_name = "SelectEvidenceBottomSheetFragment";
    public float A00;
    public Context A01;
    public View A02;
    public LinearLayout A03;
    public UserSession A04;
    public IgTextView A05;
    public IgTextView A06;
    public C189478aR A07;
    public IgdsButton A08;
    public DirectShareTarget A09;
    public SearchEditText A0A;
    public User A0B;
    public C69759Vuw A0C;
    public C69661Vt2 A0D;
    public XEG A0E;
    public C67844UzI A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "SELECT_EVIDENCE_BOTTOM_SHEET_FRAGMENT";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
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
    public final AbstractC18680vv getSession() {
        return this.A04;
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
        AbstractC43594JPz.A17(this.A03, i, i2);
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

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        int A02 = C0f9.A02(2062011247);
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC35261Fgv.A03(getActivity());
            i = 2113891199;
        } else if (this.A07 != null && this.A0E != null) {
            this.A01 = requireContext();
            Bundle bundle2 = this.mArguments;
            bundle2.getClass();
            this.A0F.getClass();
            UserSession A0S = AbstractC31176DnK.A0S(this);
            this.A04 = A0S;
            A0S.getClass();
            String string = bundle2.getString("ReportingConstants.ARG_CONTENT_ID");
            string.getClass();
            this.A0G = string;
            this.A0K = bundle2.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A0J = bundle2.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            this.A0L = bundle2.getBoolean(AbstractC111324zv.A00(56));
            this.A0I = bundle2.getBoolean("ReportingConstants.ARG_IS_CONSOLIDATED_IMPERSONATION_REPORTING");
            this.A0H = bundle2.getString("ReportingConstants.ARG_EVIDENCE_PAGE_TYPE");
            this.A00 = bundle2.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            this.A0M = bundle2.getBoolean("ReportingConstants.ARG_IS_SELF_VICTIM");
            this.A0C = VXP.A00(this.A04, this.A0J);
            this.A0E.getClass();
            Context context = this.A01;
            User user = this.A0B;
            C67844UzI c67844UzI = this.A0F;
            c67844UzI.getClass();
            DirectShareTarget directShareTarget = this.A09;
            UserSession userSession = this.A04;
            XEG xeg = this.A0E;
            String str = this.A0G;
            this.A0D = new C69661Vt2(context, userSession, directShareTarget, user, this.A0C, this, xeg, c67844UzI, str, this.A00, this.A0K, this.A0L, this.A0J, this.A0M);
            i = 943190408;
        } else {
            i = -1501936930;
        }
        C0f9.A09(i, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1588943962);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.frx_evidence_fragment);
        C0f9.A09(-598995752, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1751277471);
        super.onDestroyView();
        this.A03 = null;
        this.A08 = null;
        this.A06 = null;
        this.A05 = null;
        this.A0A = null;
        this.A02 = null;
        C0f9.A09(757207507, A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67877V0i.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

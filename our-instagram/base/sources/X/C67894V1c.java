package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;

/* renamed from: X.V1c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67894V1c extends C38K implements C51D {
    public static final String __redex_internal_original_name = "EscalationBottomSheetFragment";
    public View.OnClickListener A00;
    public UserSession A01;
    public C189478aR A02;
    public User A03;
    public C69759Vuw A04;
    public VgT A05;
    public V2Y A06;
    public C67844UzI A07;
    public String A08;
    public String A09;
    public LinearLayout A0A;
    public IgdsButton A0B;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "escalation_bottom_sheet";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C38K
    public final AbstractC12990ll A0X() {
        return this.A01;
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
        AbstractC43594JPz.A17(this.A0A, i, i2);
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
        int A02 = C0f9.A02(-1806303807);
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC35261Fgv.A03(getActivity());
            i = -1606392583;
        } else {
            Bundle requireArguments = requireArguments();
            this.A01 = AbstractC31176DnK.A0S(this);
            boolean z = requireArguments.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            this.A04 = VXP.A00(this.A01, z);
            this.A05 = AbstractC69993VzD.A00(this.A01, z);
            String string = requireArguments.getString("ReportingConstants.ARG_CONTENT_ID");
            string.getClass();
            this.A08 = string;
            V2Y v2y = new V2Y(requireContext(), this);
            this.A06 = v2y;
            A0U(v2y);
            requireArguments.getBoolean("ReportingConstants.ARG_IS_INTEROP_THREAD");
            requireArguments.getString("ReportingConstants.ARG_DIRECT_THREAD_ID");
            i = 1531108612;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1862588506);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.frx_report_fragment);
        C0f9.A09(-19444060, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1082939479);
        super.onDestroyView();
        this.A0A = null;
        this.A0B = null;
        C0f9.A09(-1917892195, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, X.VJm] */
    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        C69665Vt6 A00 = this.A07.A00();
        this.A02.A0M(A00.A0G.A00);
        V2Y v2y = this.A06;
        ImageUrl imageUrl = A00.A00;
        ILV ilv = A00.A0F;
        ILV ilv2 = A00.A04;
        v2y.A00 = imageUrl;
        v2y.A02 = ilv;
        v2y.A01 = ilv2;
        v2y.A06();
        ImageUrl imageUrl2 = v2y.A00;
        if (!AbstractC81033jX.A03(imageUrl2)) {
            Integer valueOf = Integer.valueOf(R.dimen.appreciation_reels_grid_item_width);
            Integer valueOf2 = Integer.valueOf(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
            Integer valueOf3 = Integer.valueOf(R.dimen.action_bar_item_spacing_left);
            ?? obj = new Object();
            obj.A03 = null;
            obj.A00 = imageUrl2;
            obj.A06 = null;
            obj.A02 = valueOf;
            obj.A05 = valueOf2;
            obj.A01 = valueOf3;
            obj.A04 = null;
            v2y.A09(v2y.A03, null, obj);
        }
        ILV ilv3 = v2y.A02;
        if (ilv3 != null) {
            v2y.A09(v2y.A05, ilv3.A00, new C69312VlK(null, null, null, null, true));
        }
        ILV ilv4 = v2y.A01;
        if (ilv4 != null) {
            v2y.A09(v2y.A04, ilv4.A00, new C69312VlK(Integer.valueOf(R.dimen.action_bar_item_spacing_left), null, null, null, true));
        }
        v2y.A07();
        this.A0A = (LinearLayout) view.findViewById(R.id.frx_report_action_button_wrapper);
        IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.frx_report_action_button);
        this.A0B = igdsButton;
        C69173Vj2 c69173Vj2 = A00.A02;
        if (c69173Vj2 != null && igdsButton != null) {
            AbstractC05560Rg.A00(this);
            AbstractC13880nE.A0Y(((AbstractC05560Rg) this).A04, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
            this.A0B.setText(c69173Vj2.A01.A00);
            C0fQ.A00(this.A00, this.A0B);
            this.A0B.setEnabled(true);
            LinearLayout linearLayout = this.A0A;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C69759Vuw c69759Vuw = this.A04;
            String str2 = this.A09;
            User user = this.A03;
            String str3 = this.A08;
            EnumC68199VFr enumC68199VFr = c69173Vj2.A00;
            if (enumC68199VFr != null) {
                str = enumC68199VFr.name();
            } else {
                str = null;
            }
            c69759Vuw.A02(user, str2, str3, str);
        }
    }
}

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
import java.util.Iterator;
import java.util.List;

/* renamed from: X.V1d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67895V1d extends C38K implements C51D {
    public static final String __redex_internal_original_name = "ProcessEducationBottomSheetFragment";
    public float A00;
    public UserSession A01;
    public C189478aR A02;
    public User A03;
    public C69759Vuw A04;
    public VgT A05;
    public V2Z A06;
    public XEG A07;
    public C67844UzI A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public LinearLayout A0F;
    public IgdsButton A0G;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "process_education_bottom_sheet";
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
        AbstractC43594JPz.A17(this.A0F, i, i2);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C67895V1d(C189478aR c189478aR, User user, XEG xeg, C67844UzI c67844UzI) {
        this.A02 = c189478aR;
        this.A08 = c67844UzI;
        this.A0B = c67844UzI.A00().A0H;
        this.A0C = c67844UzI.A00().A0A;
        this.A09 = c67844UzI.A01();
        this.A07 = xeg;
        this.A03 = user;
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
        int A02 = C0f9.A02(-1066464382);
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC35261Fgv.A03(getActivity());
            i = 1025124726;
        } else {
            Bundle bundle2 = this.mArguments;
            bundle2.getClass();
            this.A01 = AbstractC31176DnK.A0S(this);
            String string = bundle2.getString("ReportingConstants.ARG_CONTENT_ID");
            string.getClass();
            this.A0A = string;
            this.A0D = bundle2.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            this.A0E = bundle2.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = bundle2.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            V2Z v2z = new V2Z(requireContext(), this);
            this.A06 = v2z;
            A0U(v2z);
            this.A04 = VXP.A00(this.A01, this.A0D);
            this.A05 = AbstractC69993VzD.A00(this.A01, this.A0D);
            bundle2.getBoolean("ReportingConstants.ARG_IS_INTEROP_THREAD");
            bundle2.getString("ReportingConstants.ARG_DIRECT_THREAD_ID");
            i = -1813478544;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1886578961);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.frx_report_fragment);
        C0f9.A09(1189559037, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-356566233);
        super.onDestroyView();
        this.A0F = null;
        this.A0G = null;
        C0f9.A09(-1506519922, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, X.VJm] */
    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        this.A0F = (LinearLayout) view.requireViewById(R.id.frx_report_action_button_wrapper);
        this.A0G = (IgdsButton) view.requireViewById(R.id.frx_report_action_button);
        C69665Vt6 A00 = this.A08.A00();
        C69173Vj2 c69173Vj2 = A00.A01;
        this.A02.A0M(A00.A0G.A00);
        V2Z v2z = this.A06;
        ImageUrl imageUrl = A00.A00;
        ILV ilv = A00.A0F;
        if (ilv != null) {
            str = ilv.A00;
        } else {
            str = null;
        }
        List list = A00.A0E;
        v2z.A00 = imageUrl;
        v2z.A01 = str;
        List list2 = v2z.A05;
        list2.clear();
        if (list != null) {
            list2.addAll(list);
        }
        v2z.A06();
        ImageUrl imageUrl2 = v2z.A00;
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
            v2z.A09(v2z.A02, null, obj);
        }
        String str3 = v2z.A01;
        if (str3 != null) {
            v2z.A09(v2z.A04, str3, new C69312VlK(null, null, null, null, true));
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            v2z.A09(v2z.A03, ((ILV) it.next()).A00(), new C69312VlK(Integer.valueOf(R.dimen.action_bar_item_spacing_left), null, null, null, true));
        }
        v2z.A07();
        if (c69173Vj2 != null && this.A0G != null) {
            AbstractC05560Rg.A00(this);
            AbstractC13880nE.A0Y(((AbstractC05560Rg) this).A04, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
            this.A0G.setText(c69173Vj2.A01.A00);
            WNW.A00(this.A0G, 30, this, c69173Vj2);
            this.A0G.setEnabled(true);
            LinearLayout linearLayout = this.A0F;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C69759Vuw c69759Vuw = this.A04;
            String str4 = this.A0B;
            User user = this.A03;
            String str5 = this.A0A;
            EnumC68199VFr enumC68199VFr = c69173Vj2.A00;
            if (enumC68199VFr != null) {
                str2 = enumC68199VFr.name();
            } else {
                str2 = null;
            }
            c69759Vuw.A02(user, str4, str5, str2);
        }
    }
}

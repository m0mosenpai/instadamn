package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.V1e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67896V1e extends C38K implements C51D, GZS, InterfaceC37204GaF, GYX {
    public static final String __redex_internal_original_name = "SelectVictimBottomSheetFragment";
    public float A00;
    public UserSession A01;
    public C189478aR A02;
    public IgdsButton A03;
    public User A04;
    public C69759Vuw A05;
    public C70155WDf A06;
    public C67914V2e A07;
    public XEG A08;
    public C67844UzI A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public LinearLayout A0E;
    public TypeaheadHeader A0F;
    public String A0G = "";
    public final List A0H = new ArrayList();
    public final C1P1 A0I = new C66081TzI(this, 41);

    @Override // X.InterfaceC37204GaF
    public final boolean Caq(User user) {
        return false;
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Ccd(User user) {
        return true;
    }

    @Override // X.InterfaceC37204GaF
    public final void Cub(User user) {
    }

    @Override // X.InterfaceC37204GaF
    public final boolean Dxg(User user, boolean z) {
        if (z) {
            List list = this.A0H;
            if (!list.isEmpty()) {
                list.clear();
                list.add(user);
                C67914V2e c67914V2e = this.A07;
                List list2 = c67914V2e.A02;
                list2.clear();
                list2.addAll(list);
                C67914V2e.A00(c67914V2e);
            } else {
                list.add(user);
                IgdsButton igdsButton = this.A03;
                if (igdsButton != null) {
                    igdsButton.setEnabled(true);
                    return true;
                }
            }
        } else {
            this.A0H.remove(user);
            IgdsButton igdsButton2 = this.A03;
            if (igdsButton2 != null) {
                igdsButton2.setEnabled(false);
                return true;
            }
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "select_victim_bottom_sheet_fragment";
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

    @Override // X.GYX
    public final View getRowView() {
        TypeaheadHeader typeaheadHeader = this.A0F;
        if (typeaheadHeader == null && !C2U7.A00) {
            throw new IllegalStateException(MSV.A00(26));
        }
        return typeaheadHeader;
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
        LinearLayout linearLayout = this.A0E;
        if (linearLayout != null) {
            linearLayout.setTranslationY(-i);
        }
    }

    @Override // X.GZS
    public final void registerTextViewLogging(TextView textView) {
        textView.addTextChangedListener(C106904rr.A00(this.A01));
    }

    @Override // X.GZS
    public final void searchTextChanged(String str) {
        if (!this.A0G.equals(str)) {
            this.A0G = str;
            C1ON A02 = AbstractC55112ObW.A02(this.A01, new C51642MrZ(str, "wellbeing_page", null, null, null, null, 50, false, false, false));
            A02.A00 = this.A0I;
            schedule(A02);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public C67896V1e(C189478aR c189478aR, User user, C70155WDf c70155WDf, XEG xeg, C67844UzI c67844UzI) {
        this.A09 = c67844UzI;
        this.A0B = c67844UzI.A00().A0H;
        this.A02 = c189478aR;
        this.A08 = xeg;
        this.A04 = user;
        this.A06 = c70155WDf;
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
        int A02 = C0f9.A02(154533133);
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC35261Fgv.A03(getActivity());
            i = -2071510224;
        } else {
            Bundle requireArguments = requireArguments();
            this.A01 = AbstractC31176DnK.A0S(this);
            String string = requireArguments.getString("ReportingConstants.ARG_CONTENT_ID");
            string.getClass();
            this.A0A = string;
            this.A0D = requireArguments.getBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED");
            this.A00 = requireArguments.getFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO");
            this.A0C = requireArguments.getBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD");
            C67914V2e c67914V2e = new C67914V2e(requireContext(), this, this, this);
            this.A07 = c67914V2e;
            A0U(c67914V2e);
            C69759Vuw A00 = VXP.A00(this.A01, this.A0C);
            this.A05 = A00;
            A00.A00(this, this.A04, this.A0B, this.A0A);
            i = -2123580158;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-761843468);
        this.A0F = new TypeaheadHeader(layoutInflater.getContext());
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.frx_report_fragment);
        C0f9.A09(-484421240, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-819040459);
        super.onDestroyView();
        this.A0E = null;
        this.A03 = null;
        this.A0F.A01();
        this.A0F = null;
        C70155WDf c70155WDf = this.A06;
        if (c70155WDf != null) {
            c70155WDf.A01();
        }
        C0f9.A09(-706540827, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onViewCreated(view, bundle);
        this.A0E = (LinearLayout) view.findViewById(R.id.frx_report_action_button_wrapper);
        this.A03 = (IgdsButton) view.findViewById(R.id.frx_report_action_button);
        C67914V2e c67914V2e = this.A07;
        C67844UzI c67844UzI = this.A09;
        ILV ilv = c67844UzI.A00().A0F;
        if (ilv != null) {
            str = ilv.A00;
        } else {
            str = null;
        }
        if (c67844UzI.A00().A07 != null) {
            str2 = c67844UzI.A00().A07.A00.A00;
        } else {
            str2 = null;
        }
        c67914V2e.A01 = str;
        c67914V2e.A00 = str2;
        C67914V2e.A00(c67914V2e);
        C69173Vj2 c69173Vj2 = c67844UzI.A00().A01;
        if (c69173Vj2 != null && this.A03 != null) {
            AbstractC05560Rg.A00(this);
            AbstractC13880nE.A0Y(((AbstractC05560Rg) this).A04, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
            this.A03.setText(c69173Vj2.A01.A00);
            WNW.A00(this.A03, 33, this, c69173Vj2);
            this.A03.setEnabled(false);
            LinearLayout linearLayout = this.A0E;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            C69759Vuw c69759Vuw = this.A05;
            String str4 = this.A0B;
            User user = this.A04;
            String str5 = this.A0A;
            EnumC68199VFr enumC68199VFr = c69173Vj2.A00;
            if (enumC68199VFr != null) {
                str3 = enumC68199VFr.name();
            } else {
                str3 = null;
            }
            c69759Vuw.A02(user, str4, str5, str3);
            C70155WDf c70155WDf = this.A06;
            if (c70155WDf != null) {
                c70155WDf.A07((short) 2);
            }
        }
        String str6 = this.A0G;
        if (!str6.isEmpty()) {
            this.A0F.A04(str6);
            this.A0F.A02();
        }
        TypeaheadHeader typeaheadHeader = this.A0F;
        typeaheadHeader.A01 = this;
        typeaheadHeader.A03(getString(2131972993));
        AbstractC05560Rg.A00(this);
        ((AbstractC05560Rg) this).A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        C70155WDf c70155WDf2 = this.A06;
        if (c70155WDf2 != null) {
            c70155WDf2.A07((short) 2);
        }
    }
}

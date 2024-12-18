package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class V1X extends C38K implements InterfaceC11380iw, C51D {
    public static final String __redex_internal_original_name = "StartFRXReportV2BottomSheetFragment";
    public float A00;
    public LinearLayout A02;
    public UserSession A03;
    public IgTextView A04;
    public C189478aR A05;
    public IgdsButton A06;
    public User A07;
    public C67915V2f A08;
    public C70169WEl A09;
    public EnumC39619HeT A0A;
    public EnumC65855TvH A0B;
    public VG2 A0C;
    public XEG A0D;
    public C67844UzI A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public HashMap A0J;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public int A01 = 0;
    public boolean A0K = false;

    @Override // X.C38K
    public final void A0Y() {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C38K
    public final AbstractC12990ll A0X() {
        return this.A03;
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

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0F;
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
        C67844UzI c67844UzI = this.A0E;
        if (c67844UzI != null) {
            C189478aR c189478aR = this.A05;
            c189478aR.getClass();
            c189478aR.A0M(c67844UzI.A00().A0G.A00);
        }
        AbstractC43594JPz.A17(this.A04, i, i2);
        AbstractC43594JPz.A17(this.A02, i, i2);
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
        Context requireContext;
        String str;
        int A02 = C0f9.A02(-167596311);
        super.onCreate(bundle);
        if (bundle != null) {
            AbstractC35261Fgv.A03(getActivity());
            i = -284643879;
        } else if (this.A05 != null && this.A0D != null) {
            Bundle requireArguments = requireArguments();
            this.A03 = AbstractC31176DnK.A0S(this);
            String string = requireArguments.getString("StartFRXReportV2BottomSheetFragment.analytics_module");
            string.getClass();
            this.A0F = string;
            String string2 = requireArguments.getString("StartFRXReportV2BottomSheetFragment.content_id");
            string2.getClass();
            this.A0G = string2;
            Serializable serializable = requireArguments.getSerializable("StartFRXReportV2BottomSheetFragment.entry_point");
            serializable.getClass();
            this.A0A = (EnumC39619HeT) serializable;
            Serializable serializable2 = requireArguments.getSerializable("StartFRXReportV2BottomSheetFragment.location");
            serializable2.getClass();
            this.A0B = (EnumC65855TvH) serializable2;
            Serializable serializable3 = requireArguments.getSerializable("StartFRXReportV2BottomSheetFragment.object_type");
            serializable3.getClass();
            this.A0C = (VG2) serializable3;
            this.A0I = requireArguments.getString("StartFRXReportV2BottomSheetFragment.object");
            this.A0N = requireArguments.getBoolean("StartFRXReportV2BottomSheetFragment.is_interop_thread");
            this.A0L = requireArguments.getBoolean("StartFRXReportV2BottomSheetFragment.is_encrypted_thread");
            this.A0H = requireArguments.getString("StartFRXReportV2BottomSheetFragment.direct_thread_id");
            this.A0M = requireArguments.getBoolean("StartFRXReportV2BottomSheetFragment.is_fullscreen_enabled");
            this.A00 = requireArguments.getFloat("StartFRXReportV2BottomSheetFragment.initial_opening_height_ratio");
            Serializable serializable4 = requireArguments.getSerializable("StartFRXReportBottomSheetFragment.ARG_EXTRAS");
            serializable4.getClass();
            this.A0J = (HashMap) serializable4;
            int i2 = requireArguments.getInt("StartFRXReportBottomSheetFragment.ARG_THEME_OVERRIDE");
            this.A01 = i2;
            if (i2 != 0) {
                requireContext = new ContextThemeWrapper(requireContext(), this.A01);
            } else {
                requireContext = requireContext();
            }
            C67915V2f c67915V2f = new C67915V2f(requireContext, this.A03, this, this);
            this.A08 = c67915V2f;
            A0U(c67915V2f);
            C189478aR c189478aR = this.A05;
            c189478aR.getClass();
            XEG xeg = this.A0D;
            xeg.getClass();
            Context requireContext2 = requireContext();
            UserSession userSession = this.A03;
            User user = this.A07;
            String str2 = this.A0G;
            boolean z = this.A0M;
            float f = this.A00;
            HashMap hashMap = this.A0J;
            String str3 = this.A0F;
            EnumC39619HeT enumC39619HeT = this.A0A;
            EnumC65855TvH enumC65855TvH = this.A0B;
            VG2 vg2 = this.A0C;
            String str4 = this.A0I;
            boolean z2 = this.A0N;
            boolean z3 = this.A0L;
            C70115W4n c70115W4n = new C70115W4n(getRootActivity(), requireContext2, userSession, c189478aR, user, enumC39619HeT, enumC65855TvH, vg2, xeg, str2, str3, str4, this.A0H, hashMap, f, z, z2, z3);
            C70155WDf c70155WDf = new C70155WDf(this.A0A, this.A0B, this.A0C, this.A0F);
            Context requireContext3 = requireContext();
            UserSession userSession2 = this.A03;
            C69759Vuw A00 = VXP.A00(userSession2, this.A0L);
            VgT A002 = AbstractC69993VzD.A00(this.A03, this.A0L);
            String str5 = this.A0F;
            String str6 = this.A0G;
            C70169WEl c70169WEl = new C70169WEl(requireContext3, userSession2, user, A00, A002, c70155WDf, this, c70115W4n, this.A0A, this.A0B, this.A0C, xeg, this.A0E, str5, str6, this.A0I, this.A0J);
            this.A09 = c70169WEl;
            C70155WDf c70155WDf2 = c70169WEl.A00;
            C67844UzI c67844UzI = c70169WEl.A0E;
            if (c67844UzI != null) {
                str = c67844UzI.A00().A00();
            } else {
                str = null;
            }
            c70155WDf2.A06(C05F.A00, str, false);
            this.A0K = true;
            i = -1600482786;
        } else {
            i = 1080839072;
        }
        C0f9.A09(i, A02);
    }

    @Override // X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext;
        int A02 = C0f9.A02(-1269807505);
        if (this.A01 != 0) {
            requireContext = new ContextThemeWrapper(requireContext(), this.A01);
        } else {
            requireContext = requireContext();
        }
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(requireContext), viewGroup, R.layout.frx_report_fragment);
        C0f9.A09(-1905935920, A02);
        return A0A;
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1515522208);
        super.onDestroyView();
        if (this.A0K) {
            AbstractC35261Fgv.A02(getActivity());
            try {
                this.A09.A00.A01();
            } catch (NullPointerException e) {
                C0w9.A07("StartFRXReportV2PresenterImpl", e);
            }
            this.A02 = null;
            this.A06 = null;
            this.A04 = null;
        }
        C0f9.A09(-1005747008, A02);
    }

    @Override // X.C38K, X.AbstractC05560Rg, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C25621Ms A00;
        boolean z;
        String str;
        String str2;
        super.onViewCreated(view, bundle);
        if (this.A09 != null) {
            this.A02 = (LinearLayout) view.findViewById(R.id.frx_report_action_button_wrapper);
            this.A06 = (IgdsButton) view.findViewById(R.id.frx_report_action_button);
            this.A04 = (IgTextView) view.findViewById(R.id.frx_footer_view);
            C70169WEl c70169WEl = this.A09;
            Context requireContext = requireContext();
            C67844UzI c67844UzI = c70169WEl.A0E;
            if (c67844UzI != null) {
                C69665Vt6 A002 = c67844UzI.A00();
                V1X v1x = c70169WEl.A08;
                CharSequence A003 = C70169WEl.A00(c70169WEl, A002.A0H);
                if (A002.A00() != null) {
                    z = A002.A00().contains("IG_USER_IMPERSONATION".toLowerCase(Locale.US));
                } else {
                    z = false;
                }
                C69173Vj2 c69173Vj2 = A002.A01;
                C189478aR c189478aR = v1x.A05;
                c189478aR.getClass();
                c189478aR.A0M(A002.A0G.A00);
                C67915V2f c67915V2f = v1x.A08;
                ILV ilv = A002.A0F;
                if (ilv != null) {
                    str = ilv.A00;
                } else {
                    str = null;
                }
                List list = A002.A0D;
                if (list == null) {
                    list = C16930sl.A00;
                }
                VDZ vdz = A002.A08;
                C69251VkK c69251VkK = A002.A07;
                c67915V2f.A03 = str;
                c67915V2f.A02 = A003;
                List list2 = c67915V2f.A04;
                list2.clear();
                if (!list.isEmpty()) {
                    list2.addAll(list);
                }
                c67915V2f.A01 = vdz;
                c67915V2f.A00 = c69251VkK;
                C67915V2f.A00(c67915V2f);
                if (c69173Vj2 != null && v1x.A06 != null) {
                    AbstractC05560Rg.A00(v1x);
                    AbstractC13880nE.A0Y(((AbstractC05560Rg) v1x).A04, AbstractC166997dE.A0N(v1x).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
                    v1x.A06.setText(c69173Vj2.A01.A00);
                    WNW.A00(v1x.A06, 34, v1x, c69173Vj2);
                    int i = 0;
                    boolean A1X = AbstractC167007dF.A1X(A002.A08, VDZ.A04);
                    v1x.A06.setEnabled(!A1X);
                    LinearLayout linearLayout = v1x.A02;
                    if (z && !A1X) {
                        i = 8;
                    }
                    if (linearLayout != null) {
                        linearLayout.setVisibility(i);
                    }
                    C70169WEl c70169WEl2 = v1x.A09;
                    c70169WEl2.getClass();
                    c70169WEl2.A00.A07((short) 2);
                    C69759Vuw c69759Vuw = c70169WEl2.A07;
                    String str3 = c70169WEl2.A03;
                    User user = c70169WEl2.A06;
                    String str4 = c70169WEl2.A0F;
                    EnumC68199VFr enumC68199VFr = c69173Vj2.A00;
                    if (enumC68199VFr != null) {
                        str2 = enumC68199VFr.name();
                    } else {
                        str2 = null;
                    }
                    c69759Vuw.A02(user, str3, str4, str2);
                }
                if (A002.A08 == VDZ.A04) {
                    List<C69313VlL> list3 = A002.A0D;
                    if (list3 == null) {
                        list3 = C16930sl.A00;
                    }
                    for (C69313VlL c69313VlL : list3) {
                        if (c69313VlL.A04) {
                            c70169WEl.A04(c69313VlL);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            boolean A004 = AbstractC72723Nt.A00(requireContext);
            String str5 = c70169WEl.A0G;
            UserSession userSession = c70169WEl.A05;
            String str6 = c70169WEl.A0H;
            if (str5 == null) {
                String str7 = c70169WEl.A0F;
                EnumC39619HeT enumC39619HeT = c70169WEl.A0A;
                EnumC65855TvH enumC65855TvH = c70169WEl.A0B;
                VG2 vg2 = c70169WEl.A0C;
                A00 = AbstractC69990VzA.A00(userSession, enumC39619HeT, enumC65855TvH, str6, c70169WEl.A0I);
                A00.A9s("object_type", vg2.toString());
                A00.A9s(AbstractC43591JPw.A00(184), str7);
            } else {
                A00 = AbstractC69990VzA.A00(userSession, c70169WEl.A0A, c70169WEl.A0B, str6, c70169WEl.A0I);
                A00.A9s("object", str5);
            }
            A00.A0I("is_dark_mode", A004);
            C1ON A0N = A00.A0N();
            A0N.A00 = new C67952V3r(c70169WEl);
            schedule(A0N);
        }
    }
}

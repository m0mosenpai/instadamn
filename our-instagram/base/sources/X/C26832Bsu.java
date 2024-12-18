package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.clips.intf.ClipsViewerSource;

/* renamed from: X.Bsu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26832Bsu extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, MOE {
    public static final String __redex_internal_original_name = "TemplatePivotPageFragment";
    public ViewGroup A00;
    public C38321qM A01;
    public C26837Bsz A02;
    public C26829Bsr A03;
    public String A04;
    public final String A05 = AbstractC167017dG.A0j();
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(requireContext().getString(2131975266));
        interfaceC56362iU.EkS(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(1328);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C25838Bbt) this.A07.getValue()).A01.A01.A04(null, null, C16930sl.A00, false);
        view.requireViewById(R.id.swipe_refresh).setEnabled(false);
        ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.use_in_camera_button_scene_root);
        this.A00 = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            AbstractC166987dD.A1Z(new PXT(this, null, 6), AbstractC25235BEs.A0S(this));
            ViewGroup viewGroup2 = this.A00;
            if (viewGroup2 != null) {
                TextView A0T = AbstractC166997dE.A0T(viewGroup2, R.id.use_in_camera_label);
                AbstractC166987dD.A1P(requireContext(), A0T, 2131955950);
                AbstractC56952jT.A01(A0T);
                ViewGroup viewGroup3 = this.A00;
                if (viewGroup3 != null) {
                    AbstractC166997dE.A19(requireActivity(), (ImageView) viewGroup3.requireViewById(R.id.use_in_camera_icon), R.drawable.instagram_templates_pano_outline_24);
                    ViewGroup viewGroup4 = this.A00;
                    if (viewGroup4 != null) {
                        C3P9 c3p9 = new C3P9(viewGroup4);
                        c3p9.A04 = new C27074Bwy(this, 3);
                        c3p9.A07 = true;
                        c3p9.A00();
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("useInCameraButtonGroup");
        throw C00O.createAndThrow();
    }

    @Override // X.MOE
    public final void DyL() {
        String str;
        C26029BfI c26029BfI = (C26029BfI) ((C25838Bbt) this.A07.getValue()).A04.getValue();
        if (c26029BfI != null && (str = c26029BfI.A08) != null) {
            InterfaceC09390do interfaceC09390do = this.A06;
            AbstractC25236BEt.A0h(AbstractC31364DqT.A03().A01.A01(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31402Dr6.A02(AbstractC166987dD.A0r(interfaceC09390do), str, "clips_template_pivot_page", AbstractC111324zv.A00(1328)).A03()), this, AbstractC166987dD.A0o(interfaceC09390do));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C26832Bsu() {
        C57515Pfp c57515Pfp = new C57515Pfp(this, 30);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57515Pfp(new C57515Pfp(this, 27), 28));
        this.A07 = AbstractC25225BEi.A0a(new C57515Pfp(A00, 29), c57515Pfp, new D8J(32, null, A00), AbstractC25225BEi.A1D(C25838Bbt.class));
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1942389032);
        super.onCreate(bundle);
        this.A04 = AbstractC153636vY.A01(requireArguments(), AbstractC43591JPw.A00(StringTreeSet.MAX_SYMBOL_COUNT));
        C27885CQw A00 = CLG.A00(AbstractC166987dD.A0r(this.A06));
        InterfaceC09390do interfaceC09390do = A00.A01;
        long flowStartForMarker = ((UserFlowLoggerImpl) interfaceC09390do.getValue()).flowStartForMarker(444404712, PublicKeyCredentialControllerUtility.JSON_KEY_USER, false);
        Long valueOf = Long.valueOf(flowStartForMarker);
        A00.A00 = valueOf;
        if (valueOf != null) {
            ((UserFlowLoggerImpl) interfaceC09390do.getValue()).flowAnnotate(flowStartForMarker, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "template");
        }
        C0f9.A09(15908371, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-721317409);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_parent_fragment, viewGroup, false);
        InterfaceC09390do interfaceC09390do = this.A06;
        this.A03 = CLF.A00(AbstractC166987dD.A0r(interfaceC09390do));
        String str2 = this.A04;
        if (str2 == null) {
            str = "mediaId";
        } else {
            String str3 = this.A05;
            this.A02 = CLE.A00(ClipsViewerSource.A0h, str2, str3, null, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36328130469903570L));
            C14240no c14240no = new C14240no(getChildFragmentManager());
            C26829Bsr c26829Bsr = this.A03;
            if (c26829Bsr == null) {
                str = "headerFragment";
            } else {
                c14240no.A09(c26829Bsr, R.id.header_container);
                C26837Bsz c26837Bsz = this.A02;
                if (c26837Bsz == null) {
                    str = "gridFragment";
                } else {
                    c14240no.A09(c26837Bsz, R.id.grid_container);
                    c14240no.A0H(new D1I(this));
                    c14240no.A0K();
                    C0f9.A09(1133448638, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1161770149);
        super.onDestroy();
        C27885CQw A00 = CLG.A00(AbstractC166987dD.A0r(this.A06));
        Long l = A00.A00;
        if (l != null) {
            ((UserFlowLoggerImpl) A00.A01.getValue()).flowEndCancel(l.longValue(), AbstractC111324zv.A00(1360));
        }
        A00.A00 = null;
        C0f9.A09(403461353, A02);
    }
}

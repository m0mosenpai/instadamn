package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.EIf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32246EIf extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectDailyPromptsReplyViewerFragment";
    public int A00;
    public ViewGroup A01;
    public C3I9 A02;
    public InterfaceC37230Gaf A03;
    public C2EC A04;
    public DirectThreadKey A05;
    public String A06;
    public boolean A07;
    public final C36347G1z A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC60152ox A0C;
    public final String A0D;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = AbstractC31173DnH.A0F(view, R.id.root_container);
        C3I8 A01 = C3I7.A01(this, false, true);
        this.A02 = A01;
        A01.A9e(this.A0C);
        AbstractC008903d.A00(AbstractC31178DnM.A0B(this), new LRT(4, this, view));
        C56342iS.A01(new ViewOnClickListenerC35666Fp0(this, 42), AbstractC31176DnK.A0C(view, R.id.action_bar_container)).A0X(C35894FtE.A00);
        View A0S = AbstractC166997dE.A0S(view, R.id.response_card);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC09390do interfaceC09390do = this.A0A;
        E43 e43 = new E43(A0S, AbstractC166987dD.A0r(interfaceC09390do), null);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(e43, viewLifecycleOwner, c07s, this, null, 32), C07Y.A00(viewLifecycleOwner));
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.intermediate_viewer_reply_bar);
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C36347G1z c36347G1z = this.A08;
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        WjH wjH = new WjH(A0C, A0r, c3i9, c36347G1z);
        this.A03 = wjH;
        wjH.A06.setVisibility(8);
        wjH.ADn(AbstractC86593tX.A07(requireContext(), AbstractC31181DnP.A0A(interfaceC09390do), false).A07);
        TextView A0N = AbstractC167007dF.A0N(A0C, R.id.row_thread_composer_edittext);
        A0N.setHint(getString(2131960655));
        A0N.requestFocus();
        AbstractC13880nE.A0T(A0N);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0A);
    }

    public C32246EIf() {
        C37056GUm c37056GUm = new C37056GUm(this, 10);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37056GUm(new C37056GUm(this, 7), 8));
        this.A0B = AbstractC25225BEi.A0a(new C37056GUm(A00, 9), c37056GUm, new MHU(34, null, A00), AbstractC25225BEi.A1D(C31816Dya.class));
        this.A09 = C1XM.A00(new C37056GUm(this, 6));
        this.A0D = "direct_daily_prompts_reply_viewer_fragment";
        this.A0A = AbstractC60492pY.A02(this);
        this.A08 = new C36347G1z(this);
        this.A0C = new G0M(this, 4);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0D;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1442384594);
        super.onCreate(bundle);
        C3o9 A00 = AbstractC43826JZo.A00(requireArguments(), "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A00 != null) {
            this.A05 = JRE.A01(A00);
            C2DS A0O = AbstractC31180DnO.A0O(this.A0A);
            DirectThreadKey directThreadKey = this.A05;
            if (directThreadKey == null) {
                C14360o3.A0F("threadKey");
                throw C00O.createAndThrow();
            }
            this.A04 = C2DU.A03((C2DU) A0O, directThreadKey);
            this.A06 = AbstractC31175DnJ.A0Y(requireArguments(), AbstractC43591JPw.A00(134));
            C0f9.A09(751209229, A02);
            return;
        }
        IllegalArgumentException A0t = AbstractC31172DnG.A0t();
        C0f9.A09(-2117370232, A02);
        throw A0t;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1540132336);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_reply_viewer, viewGroup, false);
        C0f9.A09(1963720114, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(798756673);
        super.onDestroy();
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            AbstractC31171DnF.A0r();
            throw C00O.createAndThrow();
        }
        c3i9.EFx(this.A0C);
        C0f9.A09(-277434533, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1258148414);
        super.onDestroyView();
        this.A01 = null;
        C0f9.A09(1071156103, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        String str;
        int A02 = C0f9.A02(1585879854);
        super.onPause();
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            c3i9.onStop();
            InterfaceC37230Gaf interfaceC37230Gaf = this.A03;
            if (interfaceC37230Gaf == null) {
                str = "composerController";
            } else {
                interfaceC37230Gaf.EGP();
                C0f9.A09(585528500, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        int A02 = C0f9.A02(620453129);
        super.onResume();
        C3I9 c3i9 = this.A02;
        if (c3i9 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            c3i9.Dnr(getActivity());
            InterfaceC37230Gaf interfaceC37230Gaf = this.A03;
            if (interfaceC37230Gaf == null) {
                str = "composerController";
            } else {
                interfaceC37230Gaf.AAV();
                C0f9.A09(655849037, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.Bsw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26834Bsw extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, InterfaceC101554hQ, InterfaceC153526vN {
    public static final String __redex_internal_original_name = "HorizonPivotPageFragment";
    public View A00;
    public View A01;
    public C26056Bfj A02;
    public ShimmerFrameLayout A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public CircularImageView A08;
    public IgImageView A09;
    public C153766vl A0A;
    public IgTextView A0B;
    public C57112jm A0C;
    public AnonymousClass308 A0D;
    public C1M1 A0E;
    public String A0F;
    public final int A0K = 15;
    public final String A0G = AbstractC167017dG.A0j();
    public final InterfaceC09390do A0H = C1XM.A00(new C57537PgB(this, 45));
    public final InterfaceC09390do A0J = AbstractC25225BEi.A0a(new C57537PgB(this, 46), new C57537PgB(this, 47), new D8J(3, null, this), AbstractC25225BEi.A1D(C25799BbG.class));
    public final InterfaceC62612t0 A0L = new C29277CvY(this, 0);
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC153556vQ
    public final void D1P() {
    }

    @Override // X.InterfaceC153566vR
    public final void D51(View view) {
    }

    @Override // X.InterfaceC153546vP
    public final void D52(View view) {
    }

    @Override // X.InterfaceC153536vO
    public final /* synthetic */ void D55(User user) {
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        C14360o3.A0B(c120985dq, 0);
        InterfaceC09390do interfaceC09390do = this.A0I;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A08, AbstractC166987dD.A0r(interfaceC09390do));
        c116875Qr.A1D = c120985dq.getId();
        c116875Qr.A1C = "43";
        c116875Qr.A1G = this.A0G;
        c116875Qr.A13 = this.A0F;
        c116875Qr.A1d = false;
        AbstractC86593tX.A0X(requireActivity(), c116875Qr.A00(), AbstractC166987dD.A0r(interfaceC09390do));
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
    }

    @Override // X.InterfaceC153586vT
    public final /* synthetic */ void Dzr() {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String str;
        C14360o3.A0B(interfaceC56362iU, 0);
        ViewOnClickListenerC28666ClE.A02(interfaceC56362iU, this, 51);
        C26056Bfj c26056Bfj = this.A02;
        if (c26056Bfj != null && (str = c26056Bfj.A04) != null) {
            interfaceC56362iU.setTitle(str);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "horizon_worlds_pivot_page";
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

    /* JADX WARN: Removed duplicated region for block: B:63:0x01e2  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26834Bsw.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        AbstractC167027dH.A12(c120985dq, view, motionEvent);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            AnonymousClass308 anonymousClass308 = this.A0D;
            if (anonymousClass308 == null) {
                C14360o3.A0F("peekMediaController");
                throw C00O.createAndThrow();
            }
            return anonymousClass308.DuC(motionEvent, view, c38321qM, i);
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int A02 = C0f9.A02(1876082928);
        super.onCreate(bundle);
        String string = requireArguments().getString("source_media_id");
        if (string != null) {
            str = C3YV.A02(string);
        } else {
            str = null;
        }
        this.A0F = str;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            str2 = activity.getString(2131963651);
        } else {
            str2 = null;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            str3 = activity2.getString(2131963648);
        } else {
            str3 = null;
        }
        Integer valueOf = Integer.valueOf(R.drawable.horizon_worlds_foa_horizonlogo);
        InterfaceC09390do interfaceC09390do = this.A0I;
        Boolean A0c = AbstractC166997dE.A0c(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36319922787196770L);
        FragmentActivity activity3 = getActivity();
        if (activity3 != null) {
            str4 = activity3.getString(2131963649);
        } else {
            str4 = null;
        }
        FragmentActivity activity4 = getActivity();
        if (activity4 != null) {
            str5 = activity4.getString(2131963652);
        } else {
            str5 = null;
        }
        this.A02 = new C26056Bfj(A0c, valueOf, str2, str3, str4, str5);
        C57112jm A00 = C57112jm.A00();
        this.A0C = A00;
        this.A0A = new C153766vl(requireContext(), null, this, new C153746vj(AbstractC166987dD.A0r(interfaceC09390do), A00, this, null), this, AbstractC166987dD.A0r(interfaceC09390do), null, new C153736vi(0.5625f, false, false), null, null, null, false, false);
        ((C62832tM) this.A0H.getValue()).A02(this.A0G);
        this.A0E = C1M3.A00();
        FragmentActivity requireActivity = requireActivity();
        AbstractC10360h2 parentFragmentManager = getParentFragmentManager();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C1M1 c1m1 = this.A0E;
        if (c1m1 == null) {
            str6 = "pivotPageSessionProvider";
        } else {
            C153766vl c153766vl = this.A0A;
            if (c153766vl == null) {
                str6 = "clipsGridAdapter";
            } else {
                AnonymousClass308 anonymousClass308 = new AnonymousClass308(requireActivity, this, parentFragmentManager, A0r, null, this, c153766vl, c1m1, true, true, false);
                anonymousClass308.A0B = this;
                this.A0D = anonymousClass308;
                registerLifecycleListener(anonymousClass308);
                C0f9.A09(-1578069435, A02);
                return;
            }
        }
        C14360o3.A0F(str6);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-230126087);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_fragment, viewGroup, false);
        C0f9.A09(1114924852, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1605213684);
        super.onDestroy();
        ((C62832tM) this.A0H.getValue()).A07(this.A0G);
        C0f9.A09(118484818, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-94465985);
        super.onDestroyView();
        this.A03 = null;
        this.A01 = null;
        C0f9.A09(1815909389, A02);
    }
}

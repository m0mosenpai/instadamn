package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.model.reels.Reel;
import java.util.List;

/* loaded from: classes7.dex */
public final class HC6 extends AbstractC59962oe implements InterfaceC60122ou, JG0 {
    public static final String __redex_internal_original_name = "ReelDebugFragment";
    public String A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, MSV.A00(371));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_debug";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        Double d7;
        Double d8;
        Double d9;
        Double d10;
        Double d11;
        Double d12;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Reel A0I = AbstractC37301Gc2.A0I(AbstractC166987dD.A0r(this.A01), requireArguments().getString("reel_id", ""));
        if (A0I != null) {
            C38491qd c38491qd = A0I.A0M;
            Double d13 = null;
            if (c38491qd != null) {
                d = c38491qd.A04;
            } else {
                d = null;
            }
            IEW iew = new IEW("emeimps", String.valueOf(d));
            C38491qd c38491qd2 = A0I.A0M;
            if (c38491qd2 != null) {
                d2 = c38491qd2.A05;
            } else {
                d2 = null;
            }
            IEW iew2 = new IEW("ereply", String.valueOf(d2));
            C38491qd c38491qd3 = A0I.A0M;
            if (c38491qd3 != null) {
                d3 = c38491qd3.A06;
            } else {
                d3 = null;
            }
            IEW iew3 = new IEW("fp", String.valueOf(d3));
            C38491qd c38491qd4 = A0I.A0M;
            if (c38491qd4 != null) {
                d4 = c38491qd4.A0K;
            } else {
                d4 = null;
            }
            IEW iew4 = new IEW("pcontact", String.valueOf(d4));
            C38491qd c38491qd5 = A0I.A0M;
            if (c38491qd5 != null) {
                d5 = c38491qd5.A0L;
            } else {
                d5 = null;
            }
            IEW iew5 = new IEW("pevpvd", String.valueOf(d5));
            C38491qd c38491qd6 = A0I.A0M;
            if (c38491qd6 != null) {
                d6 = c38491qd6.A0M;
            } else {
                d6 = null;
            }
            IEW iew6 = new IEW("plike", String.valueOf(d6));
            C38491qd c38491qd7 = A0I.A0M;
            if (c38491qd7 != null) {
                d7 = c38491qd7.A0N;
            } else {
                d7 = null;
            }
            IEW iew7 = new IEW("pnext", String.valueOf(d7));
            C38491qd c38491qd8 = A0I.A0M;
            if (c38491qd8 != null) {
                d8 = c38491qd8.A0O;
            } else {
                d8 = null;
            }
            IEW iew8 = new IEW("preciprocal", String.valueOf(d8));
            C38491qd c38491qd9 = A0I.A0M;
            if (c38491qd9 != null) {
                d9 = c38491qd9.A0Q;
            } else {
                d9 = null;
            }
            IEW iew9 = new IEW("preshare", String.valueOf(d9));
            C38491qd c38491qd10 = A0I.A0M;
            if (c38491qd10 != null) {
                d10 = c38491qd10.A0S;
            } else {
                d10 = null;
            }
            IEW iew10 = new IEW("pskip", String.valueOf(d10));
            C38491qd c38491qd11 = A0I.A0M;
            if (c38491qd11 != null) {
                d11 = c38491qd11.A0T;
            } else {
                d11 = null;
            }
            IEW iew11 = new IEW("ptap", String.valueOf(d11));
            C38491qd c38491qd12 = A0I.A0M;
            if (c38491qd12 != null) {
                d12 = c38491qd12.A0V;
            } else {
                d12 = null;
            }
            IEW iew12 = new IEW("vm", String.valueOf(d12));
            C38491qd c38491qd13 = A0I.A0M;
            if (c38491qd13 != null) {
                d13 = c38491qd13.A0W;
            }
            List<IEW> A1Q = AbstractC16960so.A1Q(iew, iew2, iew3, iew4, iew5, iew6, iew7, iew8, iew9, iew10, iew11, iew12, new IEW("vm_interaction", String.valueOf(d13)));
            StringBuilder A1C = AbstractC166987dD.A1C();
            for (IEW iew13 : A1Q) {
                A1C.append(iew13.A00);
                A1C.append(": ");
                A1C.append(iew13.A01);
                A1C.append('\n');
                A1C.append('\n');
            }
            this.A00 = A1C.toString();
            AbsListView absListView = (AbsListView) view.findViewById(R.id.debug_ad_view);
            HEA hea = new HEA(this, A1Q);
            if (absListView != null) {
                absListView.setAdapter((ListAdapter) hea);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.JG0
    public final void Dkp() {
        AbstractC13900nG.A00(requireContext(), this.A00);
        C9GR.A09(getContext(), getString(2131956831));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2127163578);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_sponsored_debug, false);
        C0f9.A09(841938383, A02);
        return A0R;
    }
}

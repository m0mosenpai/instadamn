package com.instagram.creation.capture.quickcapture.thirdpartymedia.viewer;

import X.AbstractC153636vY;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC18680vv;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC25229BEm;
import X.AbstractC59962oe;
import X.AbstractC60492pY;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C16930sl;
import X.C25891Bcs;
import X.C38321qM;
import X.C3x9;
import X.C51190MjY;
import X.C5HL;
import X.InterfaceC09390do;
import X.ViewOnTouchListenerC28679ClR;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import java.util.List;

/* loaded from: classes5.dex */
public final class GiphyAttributionFragment extends AbstractC59962oe {
    public C25891Bcs A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);
    public RecyclerView recycler;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "GiphyAttributionFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TouchInterceptorFrameLayout touchInterceptorFrameLayout;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if ((view instanceof TouchInterceptorFrameLayout) && (touchInterceptorFrameLayout = (TouchInterceptorFrameLayout) view) != null) {
            touchInterceptorFrameLayout.COs(new ViewOnTouchListenerC28679ClR(this, 0));
        }
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.recycler);
        this.recycler = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        }
        RecyclerView recyclerView2 = this.recycler;
        if (recyclerView2 != null) {
            C25891Bcs c25891Bcs = this.A00;
            if (c25891Bcs == null) {
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            }
            recyclerView2.setAdapter(c25891Bcs);
        }
        RecyclerView recyclerView3 = this.recycler;
        if (recyclerView3 != null) {
            recyclerView3.A10(new C51190MjY(0, AbstractC25228BEl.A0M(view).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), 0, false));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List list;
        C5HL B3d;
        int A02 = C0f9.A02(2037898715);
        super.onCreate(bundle);
        C38321qM A0h = AbstractC25229BEm.A0h(AbstractC166987dD.A0r(this.A01), AbstractC153636vY.A01(requireArguments(), "media_id"));
        if (A0h != null) {
            C3x9 A0u = AbstractC25226BEj.A0u(A0h);
            if (A0u == null || (B3d = A0u.B3d()) == null || (list = B3d.B9u()) == null) {
                list = C16930sl.A00;
            }
            this.A00 = new C25891Bcs(requireActivity(), this, list);
            C0f9.A09(-1654131800, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(-406232758, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-661956141);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.giphy_attribution_fragment_layout, viewGroup, false);
        C0f9.A09(-668660944, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(269031391);
        super.onDestroyView();
        this.recycler = null;
        C0f9.A09(-1818886330, A02);
    }
}

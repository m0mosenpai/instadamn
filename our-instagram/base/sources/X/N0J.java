package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.rtc.views.omnigridview.OmniGridView;

/* loaded from: classes9.dex */
public abstract class N0J extends AbstractC53623NnU {
    public final View A01(ViewGroup viewGroup, InterfaceC57799PkR interfaceC57799PkR) {
        OmniGridView omniGridView = (OmniGridView) interfaceC57799PkR;
        View view = omniGridView.A01;
        if (view == null) {
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            view = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_call_participant_cell, false);
        }
        omniGridView.A01 = view;
        return view;
    }

    public final void A02(ViewGroup viewGroup, InterfaceC57799PkR interfaceC57799PkR, C51681MsC c51681MsC) {
        AbstractC09800fd.A01("GridViewSelfItemDefinition.bind", -1635029712);
        try {
            C3OO c3oo = ((OmniGridView) interfaceC57799PkR).A03;
            if (c3oo == null) {
                c3oo = A00(viewGroup);
            }
            N0H n0h = (N0H) c3oo;
            AbstractC167017dG.A1N(c51681MsC, n0h);
            n0h.A03(c51681MsC);
            AbstractC09800fd.A00(-372952640);
        } catch (Throwable th) {
            AbstractC09800fd.A00(1198810963);
            throw th;
        }
    }
}

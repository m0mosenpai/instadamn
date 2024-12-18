package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes9.dex */
public final class N5J extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ScheduledContentFragment";
    public C51167MjB A00;
    public OXR A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final String A04 = "scheduled_content_fragment";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (this.dayNightMode == EnumC60792q3.A03) {
            Context themedContext = getThemedContext();
            C56352iT c56352iT = (C56352iT) interfaceC56362iU;
            C14360o3.A0B(themedContext, 0);
            c56352iT.A02 = themedContext;
            C56352iT.A0H(c56352iT);
        }
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A00();
        AbstractC31176DnK.A1C(ViewOnClickListenerC55457OkB.A00(this, 0), A0B, interfaceC56362iU);
        interfaceC56362iU.Efu(2131974197);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC50628MWp enumC50628MWp;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        Object obj = null;
        if (bundle2 != null) {
            obj = bundle2.get(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        }
        if (!(obj instanceof EnumC50628MWp) || (enumC50628MWp = (EnumC50628MWp) obj) == null) {
            enumC50628MWp = EnumC50628MWp.A09;
        }
        InterfaceC09390do interfaceC09390do = this.A02;
        this.A01 = new OXR(enumC50628MWp, this, AbstractC166987dD.A0r(interfaceC09390do));
        Context themedContext = getThemedContext();
        FragmentActivity requireActivity = requireActivity();
        EnumC60792q3 enumC60792q3 = this.dayNightMode;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        OXR oxr = this.A01;
        if (oxr == null) {
            str = "contentSchedulingLogger";
        } else {
            this.A00 = new C51167MjB(themedContext, requireActivity, enumC60792q3, oxr, this, A0r);
            View requireViewById = view.requireViewById(R.id.recycler_view);
            RecyclerView recyclerView = (RecyclerView) requireViewById;
            AbstractC31178DnM.A0z(this, recyclerView);
            C14360o3.A07(requireViewById);
            C51167MjB c51167MjB = this.A00;
            if (c51167MjB == null) {
                str = "adapter";
            } else {
                recyclerView.setAdapter(c51167MjB);
                View A0S = AbstractC166997dE.A0S(view, R.id.loading_indicator);
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC166987dD.A1Z(new MCR(view, c07s, A0S, recyclerView, this, viewLifecycleOwner, (InterfaceC23621Ds) null, 11), C07Y.A00(viewLifecycleOwner));
                ((C44513JmJ) this.A03.getValue()).A00();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public N5J() {
        X32 x32 = new X32(this, 25);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X32(new X32(this, 22), 23));
        this.A03 = AbstractC25225BEi.A0a(new X32(A00, 24), x32, new C57253Pbb(46, null, A00), AbstractC25225BEi.A1D(C44513JmJ.class));
        this.A02 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-528288799);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.scheduled_content_fragment, false);
        C0f9.A09(1928159348, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(2059000020);
        super.onDestroyView();
        C51167MjB c51167MjB = this.A00;
        if (c51167MjB == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c51167MjB.A02();
        C0f9.A09(-1707257114, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(748856378);
        super.onResume();
        if (this.dayNightMode == EnumC60792q3.A03) {
            AbstractC145016gM.A03(requireActivity(), this, AbstractC166987dD.A0r(this.A02), false, false);
        }
        C0f9.A09(-346215133, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1359568804);
        super.onStop();
        AbstractC145016gM.A04(requireActivity(), AbstractC166987dD.A0r(this.A02), false);
        C0f9.A09(-1176568379, A02);
    }
}
